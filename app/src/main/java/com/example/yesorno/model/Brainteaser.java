package com.example.yesorno.model;

import java.io.Serializable;

public class Brainteaser implements Serializable {

    private String name;
    private int brainteaserCategoryId;
    private int brainteaserId;
    private String description;
    private String answer;
    private String imgUrl;

    public int getBrainteaserId() {
        return brainteaserId;
    }

    public void setBrainteaserId(int brainteaserId) {
        this.brainteaserId = brainteaserId;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    public Brainteaser(int brainteaserCategoryId, String name, String description, String answer, String imgUrl) {
        this.brainteaserCategoryId = brainteaserCategoryId;
        this.name = name;
        this.description = description;
        this.answer = answer;
        this.imgUrl = imgUrl;

    }

    public Brainteaser() {
    }

    public void setBrainteaserCategoryId(int brainteaserCategoryId) {
        this.brainteaserCategoryId = brainteaserCategoryId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getBrainteaserCategoryId() {
        return brainteaserCategoryId;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public String getAnswer() {
        return answer;
    }

    @Override
    public String toString() {
        return name;
    }
}
