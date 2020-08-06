package com.example.androidfrombegining;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.Typeface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

public class Part14MyrecycleAdapter extends RecyclerView.Adapter<Part14MyrecycleAdapter.myViewHolder> {
    private Activity context;
    private List<Part13UserModel> models;

    public Part14MyrecycleAdapter(Activity context, List<Part13UserModel> models) {
        this.context = context;
        this.models = models;
    }

    @NonNull
    @Override
    public myViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(context).inflate(R.layout.part14_my_card_model, parent, false);
        return new myViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull myViewHolder holder, int position) {
// control views
        Part13UserModel model = models.get(position);
        holder.txtName.setText(model.getName());
        holder.txtFamily.setText(model.getFamily());
        holder.profilePic.setImageResource(model.getImgRes());
        if (model.isSeen()) {
            holder.parent.setBackgroundColor(Color.WHITE);
            holder.txtName.setTypeface(null, Typeface.NORMAL);
            holder.txtFamily.setTypeface(null, Typeface.NORMAL);
        } else {
            holder.parent.setBackgroundColor(Color.GREEN);
            holder.txtName.setTypeface(null, Typeface.BOLD);
            holder.txtFamily.setTypeface(null, Typeface.BOLD);

        }
//listeners
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = model.getName();
                Toast.makeText(context, "نام برابر است با : " + name, Toast.LENGTH_SHORT).show();
                Intent i = new Intent(context, Part9_2Activity.class);
                i.putExtra("resID", model.getImgRes());
                context.startActivity(i);
                if (!model.isSeen()) {
                    model.setSeen(true);
                    notifyDataSetChanged();
                }
            }
        });
        holder.btnDel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                removeItem(position);
//bedune khate baadi kar kard!!!!!
//                notifyDataSetChanged();
            }
        });

    }

    @Override
    public int getItemCount() {
        return models.size();
    }

    class myViewHolder extends RecyclerView.ViewHolder {
        //        create views
        private TextView txtName, txtFamily;
        private CardView parent;
        private ImageView profilePic, btnDel;

        public myViewHolder(@NonNull View itemView) {
            super(itemView);
//            init views
            txtName = itemView.findViewById(R.id.txt_name);
            txtFamily = itemView.findViewById(R.id.txt_family);
            parent = itemView.findViewById(R.id.con_parent);
            profilePic = itemView.findViewById(R.id.img_profile);
            btnDel = itemView.findViewById(R.id.img_btn_del_item);

        }
    }

    private void removeItem(int position) {
        models.remove(position);
        notifyItemRemoved(position);
    }
}
