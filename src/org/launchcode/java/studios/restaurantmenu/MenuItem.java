package org.launchcode.java.studios.restaurantmenu;

import java.util.ArrayList;


public class MenuItem {
    private String name;
    private double price;
    private String description;
    private String category;
    private boolean isNew;

    private ArrayList menu;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public String getCategory() {
        return category;
    }
    public void setCategory(String category) {
        this.category = category;
    }
    public boolean isNew() {
        return isNew;
    }
    public void setNew(boolean aNew) {
        isNew = aNew;
    }

    public MenuItem(String name, double price, String description, String category, boolean isNew){
        this.name=name;
        this.category=category;
        this.description=description;
        this.price=price;
        this.isNew=isNew;
    };
    public MenuItem(String name, double price){
        this.name=name;
        this.price=price;
        this.description="";
        this.category="";
        this.isNew=false;
    }
}
