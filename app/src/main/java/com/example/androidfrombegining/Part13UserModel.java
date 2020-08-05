package com.example.androidfrombegining;

public class Part13UserModel {
    private String name, family;
    private int imgRes;
    private boolean Seen;

    public Part13UserModel(String name, String family, int imgRes, boolean seen) {
        this.name = name;
        this.family = family;
        this.imgRes = imgRes;
        this.Seen = seen;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFamily() {
        return family;
    }

    public void setFamily(String family) {
        this.family = family;
    }

    public int getImgRes() {
        return imgRes;
    }

    public void setImgRes(int imgRes) {
        this.imgRes = imgRes;
    }

    public boolean isSeen() {
        return Seen;
    }

    public void setSeen(boolean seen) {
        Seen = seen;
    }
}
