package com.zedy.newsapp;

public class News {
    private String author;
    private String description;
    private String imgurl;

    public News(String author, String description, String imgurl) {
        this.author = author;
        this.description = description;
        this.imgurl = imgurl;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImgurl() {
        return imgurl;
    }

    public void setImgurl(String imgurl) {
        this.imgurl = imgurl;
    }
}
