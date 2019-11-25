package com.example.swipeviewpager;

public class Model {

    private int image;
    private String Title;
    private String desc;

    public Model(int image, String title, String desc) {
        this.image = image;
        Title = title;
        this.desc = desc;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
