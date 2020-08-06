package com.example.androidfrombegining;

public class Poroject_football_league_table_dataModel {
    private int row;
    private int imgresourceFLAG;
    private String team;
    private int game;
    private int win;
    private int lose;
    private int differentialOFgoal;
    private int Point;

    public Poroject_football_league_table_dataModel(int row, int imgresourceFLAG, String team, int game, int win, int lose, int differentialOFgoal, int Point) {
        this.row = row;
        this.imgresourceFLAG = imgresourceFLAG;
        this.team = team;
        this.game = game;
        this.win = win;
        this.lose = lose;
        this.differentialOFgoal = differentialOFgoal;
        this.Point = Point;
    }

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public int getImgresourceFLAG() {
        return imgresourceFLAG;
    }

    public void setImgresourceFLAG(int imgresourceFLAG) {
        this.imgresourceFLAG = imgresourceFLAG;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    public int getGame() {
        return game;
    }

    public void setGame(int game) {
        this.game = game;
    }

    public int getWin() {
        return win;
    }

    public void setWin(int win) {
        this.win = win;
    }

    public int getLose() {
        return lose;
    }

    public void setLose(int lose) {
        this.lose = lose;
    }

    public int getDifferentialOFgoal() {
        return differentialOFgoal;
    }

    public void setDifferentialOFgoal(int differentialOFgoal) {
        this.differentialOFgoal = differentialOFgoal;
    }

    public int getPoint() {
        return Point;
    }

    public void setPoint(int point) {
        this.Point = point;
    }
}
