package com.example.mylibrary;

public class Book {
    private int id,pages;
    private String name,imageUrl,shortDiscription,longDiscription,auther;

    public Book(int id, int pages, String name, String imageUrl, String shortDiscription, String longDiscription, String auther) {
        this.id = id;
        this.pages = pages;
        this.name = name;
        this.imageUrl = imageUrl;
        this.shortDiscription = shortDiscription;
        this.longDiscription = longDiscription;
        this.auther = auther;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getShortDiscription() {
        return shortDiscription;
    }

    public void setShortDiscription(String shortDiscription) {
        this.shortDiscription = shortDiscription;
    }

    public String getLongDiscription() {
        return longDiscription;
    }

    public void setLongDiscription(String longDiscription) {
        this.longDiscription = longDiscription;
    }

    public String getAuther() {
        return auther;
    }

    public void setAuther(String auther) {
        this.auther = auther;
    }
}
