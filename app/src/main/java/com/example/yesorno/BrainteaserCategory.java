package com.example.yesorno;

public class BrainteaserCategory {

    private int id;
    private int imageId;

    public BrainteaserCategory(int id, int imageId) {
        this.id = id;
        this.imageId = imageId;
    }

    public static BrainteaserCategory[] categories = new BrainteaserCategory[]{
            new BrainteaserCategory(1, R.drawable.dr),
            new BrainteaserCategory(2, R.drawable.dr),
            new BrainteaserCategory(3, R.drawable.dr),
            new BrainteaserCategory(4, R.drawable.dr),
            new BrainteaserCategory(5, R.drawable.dr)
    };

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }
}
