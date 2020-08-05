package com.example.androidfrombegining;

import android.app.Activity;
import android.graphics.Color;
import android.graphics.Typeface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import androidx.constraintlayout.widget.ConstraintLayout;

public class Part13MyAdapter extends BaseAdapter {
    private Activity context;
    private List<Part13UserModel> models;
    private LayoutInflater inflater;

    public Part13MyAdapter(Activity context, List<Part13UserModel> models) {
        this.context = context;
        this.models = models;
        inflater = (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        return models.size();
    }

    @Override
    public Object getItem(int position) {
        return position;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    private static class viewHolder {
        public ConstraintLayout parent;
        public TextView txtName, txtFamily;
        public ImageView profilepic;

    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View v = convertView;
        viewHolder holder = new viewHolder();
        if (v == null) {
            v = inflater.inflate(R.layout.part13_my_layout_model, null);
            holder.parent = v.findViewById(R.id.con_parent);
            holder.txtName = v.findViewById(R.id.txt_name);
            holder.txtFamily = v.findViewById(R.id.txt_family);
            holder.profilepic = v.findViewById(R.id.img_profile);
            v.setTag(holder);
        } else holder = (viewHolder) v.getTag();
        if (models.size() > 0) {
            holder.txtName.setText(models.get(position).getName());
            holder.txtFamily.setText(models.get(position).getFamily());
            holder.profilepic.setImageResource(models.get(position).getImgRes());

            if (models.get(position).isSeen()) {
                holder.parent.setBackgroundColor(Color.WHITE);
                holder.txtName.setTypeface(null, Typeface.NORMAL);
                holder.txtFamily.setTypeface(null, Typeface.NORMAL);
            } else {
                holder.parent.setBackgroundColor(Color.GREEN);
                holder.txtName.setTypeface(null, Typeface.BOLD);
                holder.txtFamily.setTypeface(null, Typeface.BOLD);


            }


        }
        return v;


    }
}
