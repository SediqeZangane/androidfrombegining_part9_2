package com.example.androidfrombegining;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class Part20_Adapter extends RecyclerView.Adapter<Part20_Adapter.MyViewHolder> {

    private Activity context;
    private List<Part20UserModel> contact;

    public Part20_Adapter(Activity context, List<Part20UserModel> contact) {
        this.context = context;
        this.contact = contact;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(context).inflate(R.layout.part20_contact_model_cardview, parent, false);
        return new MyViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        Part20UserModel U = contact.get(position);
//        control views
        holder.txtName.setText(U.getName());
        holder.txtFamily.setText(U.getFamily());


    }

    @Override
    public int getItemCount() {
        return contact.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        //        create views
        TextView txtName, txtFamily;
        ImageView btn_edit, btn_del;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
//            init views
            txtName = itemView.findViewById(R.id.txtName);
            txtFamily = itemView.findViewById(R.id.txtFamily);
            btn_edit = itemView.findViewById(R.id.img_btn_edit);
            btn_del = itemView.findViewById(R.id.img_btn_del_item);
        }
    }
}
