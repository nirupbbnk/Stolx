package com.example.pathrer.stolx;

import android.util.Log;

/**
 * Created by Pathrer on 20-07-2017.
 */

public class Book {
    private String Name;
    private String Place;
    private String Price;
    private String College;
    private String Branch;

    public Book() {
    }

    public Book(String name, String place, String price, String college, String branch, String image) {

        Name = name;
        Place = place;
        Price = price;
        College = college;
        Branch = branch;
        Image = image;
    }

    public String getName() {

        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getPlace() {
        return Place;
    }

    public void setPlace(String place) {
        Place = place;
        Log.d("Setting","setted");
    }

    public String getPrice() {
        return Price;
    }

    public void setPrice(String price) {
        Price = price;
    }

    public String getCollege() {
        return College;
    }

    public void setCollege(String college) {
        College = college;
    }

    public String getBranch() {
        return Branch;
    }

    public void setBranch(String branch) {
        Branch = branch;
    }

    public String getImage() {
        return Image;
    }

    public void setImage(String image) {
        Image = image;
    }

    private String Image;


}
