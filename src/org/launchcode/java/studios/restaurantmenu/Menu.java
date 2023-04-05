package org.launchcode.java.studios.restaurantmenu;

import java.util.Date;
import java.util.ArrayList;
import java.util.HashMap;

public class Menu {
  private Date lastUpdated;
  private HashMap<Integer, MenuItem> items;

  public Menu(Date lastUpdated, HashMap<Integer, MenuItem> items) {
    this.lastUpdated = lastUpdated;
    this.items = items;
  }



//
//  public Date getLastUpdated() {
//    return lastUpdated;
//  }
//
//  public void setLastUpdated(Date lastUpdated) {
//    this.lastUpdated = lastUpdated;
//  }
//
//  public ArrayList getMenu() {
//    return menu;
//  }
//
//  public void setMenu(ArrayList menu) {
//    this.menu = menu;
//  }
//
//  public Menu(Date lastUpdated, ArrayList menu){
//    this.lastUpdated=lastUpdated;
//    this.menu=menu;
//  }
//  private ArrayList addMenuItem(Object menuItem){
//    this.menu.add(menuItem);
//    return menu;
//  };


}
