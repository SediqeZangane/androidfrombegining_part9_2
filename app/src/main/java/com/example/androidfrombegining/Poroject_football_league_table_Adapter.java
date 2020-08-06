package com.example.androidfrombegining;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TableRow;
import android.widget.TextView;

import java.util.List;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

public class Poroject_football_league_table_Adapter extends RecyclerView.Adapter<Poroject_football_league_table_Adapter.MyViewHolder> {

    private Activity context;
    private List<Poroject_football_league_table_dataModel> dataModels;

    public Poroject_football_league_table_Adapter(Activity context, List<Poroject_football_league_table_dataModel> dataModels) {
        this.context = context;
        this.dataModels = dataModels;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(context).inflate(R.layout.poroject_football_league_table_data_model, parent, false);
        return new MyViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
//        control views
        Poroject_football_league_table_dataModel DATAMODEL = dataModels.get(position);
        holder.txtRow1.setText(DATAMODEL.getRow() + "");
        holder.txtTeam1.setText(DATAMODEL.getTeam() + "");
        holder.txtGame1.setText(DATAMODEL.getGame() + "");
        holder.txtWin1.setText(DATAMODEL.getWin() + "");
        holder.txtLose1.setText(DATAMODEL.getLose() + "");
        holder.txtGoal1.setText(DATAMODEL.getDifferentialOFgoal() + "");
        holder.txtPoint1.setText(DATAMODEL.getPoint() + "");
//        holder.txtRow2.setText(DATAMODEL.getRow());
//        holder.txtTeam2.setText(DATAMODEL.getTeam());
//        holder.txtGame2.setText(DATAMODEL.getGame());
//        holder.txtWin2.setText(DATAMODEL.getWin());
//        holder.txtLose2.setText(DATAMODEL.getLose());
//        holder.txtGoal2.setText(DATAMODEL.getDifferentialOFgoal());
//        holder.txtPoint2.setText(DATAMODEL.getPoint());

        holder.imgFlag1.setImageResource(DATAMODEL.getImgresourceFLAG());
//        holder.imgFlag2.setImageResource(DATAMODEL.getImgresourceFLAG());

//        listener


    }

    @Override
    public int getItemCount() {
        return dataModels.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        //        create views
        private CardView cardView;
        private TableRow tableRow1, tableRow2;
        private ImageView imgFlag1, imgFlag2;
        private TextView txtRow1, txtTeam1, txtGame1, txtWin1, txtLose1, txtGoal1, txtPoint1;
//        private TextView  txtRow2, txtTeam2, txtGame2, txtWin2, txtLose2, txtGoal2, txtPoint2;


        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            //            init views
            imgFlag1 = itemView.findViewById(R.id.img_flag1);
//            imgFlag2 = itemView.findViewById(R.id.img_flag2);
            txtRow1 = itemView.findViewById(R.id.txt_row1);
            txtTeam1 = itemView.findViewById(R.id.txt_team1);
            txtGame1 = itemView.findViewById(R.id.txt_game1);
            txtWin1 = itemView.findViewById(R.id.txt_win1);
            txtLose1 = itemView.findViewById(R.id.txt_lose1);
            txtGoal1 = itemView.findViewById(R.id.txt_goal1);
            txtPoint1 = itemView.findViewById(R.id.txt_point1);
//            txtRow2 = itemView.findViewById(R.id.txt_row2);
//            txtTeam2 = itemView.findViewById(R.id.txt_team2);
//            txtGame2 = itemView.findViewById(R.id.txt_game2);
//            txtWin2 = itemView.findViewById(R.id.txt_win2);
//            txtLose2 = itemView.findViewById(R.id.txt_lose2);
//            txtGoal2 = itemView.findViewById(R.id.txt_goal2);
//            txtPoint2 = itemView.findViewById(R.id.txt_point2);


        }
    }
}
