package com.example.myapplication;

public class Talor {
    private int imgview;
    private String tv_name,tv_songname;

    public int getImgview() {
        return imgview;
    }

    public void setImgview(int imgview) {
        this.imgview = imgview;
    }

    public String getTv_name() {
        return tv_name;
    }

    public void setTv_name(String tv_name) {
        this.tv_name = tv_name;
    }

    public String getTv_songname() {
        return tv_songname;
    }

    public void setTv_songname(String tv_songname) {
        this.tv_songname = tv_songname;
    }

    public Talor(int imgview, String tv_name, String tv_songname) {
        this.imgview = imgview;
        this.tv_name = tv_name;
        this.tv_songname = tv_songname;
    }
}
