package com.itc.giflib.model;

import java.time.LocalDate;

public class Gif {
    private String name;
    private LocalDate dateUploaded;
    private String username;
    private int categoryID;
    private boolean favorite;



    //Constructor
    public Gif(String name, LocalDate dateUploaded, String username, boolean favorite, int categoryID) {
        this.name = name;
        this.dateUploaded = dateUploaded;
        this.username = username;
        this.favorite = favorite;
        this.categoryID = categoryID;
    }

    //Getter and Setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getDateUploaded() {
        return dateUploaded;
    }

    public void setDateUploaded(LocalDate dateUploaded) {
        this.dateUploaded = dateUploaded;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public boolean isFavorite() {
        return favorite;
    }

    public void setFavorite(boolean favorite) {
        this.favorite = favorite;
    }

    public int getCategoryID() {
        return categoryID;
    }

    public void setCategoryID(int categoryID) {
        this.categoryID = categoryID;
    }
}
