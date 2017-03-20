package com.example.yesorno;

public class BrainteaserCategory {

    private int id;

    public BrainteaserCategory(int id) {
        this.id = id;
    }

    public static BrainteaserCategory[] categories = new BrainteaserCategory[]{
            new BrainteaserCategory(1),
            new BrainteaserCategory(2),
            new BrainteaserCategory(3),
            new BrainteaserCategory(4),
            new BrainteaserCategory(5)
    };

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }
}
