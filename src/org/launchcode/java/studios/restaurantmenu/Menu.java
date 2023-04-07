package org.launchcode.java.studios.restaurantmenu;

import java.util.Date;
import java.util.ArrayList;

public class Menu {
  private Date lastUpdated;
  private ArrayList<MenuItem> items= new ArrayList<>();

  public Menu(Date lastUpdated, ArrayList items) {
    this.lastUpdated = lastUpdated;
    this.items = items;
  }


  public void addItem(MenuItem newItem){
    this.items.add(newItem);
  }
  public void removeItem(MenuItem menuItemToBeRemoved){
    int index=this.items.indexOf(menuItemToBeRemoved);
    this.items.remove(index);
  }
  public boolean isNewItem(MenuItem item){
    return item.isNew();
  }
  public Date lastMenuUpdate(){
    return this.lastUpdated;
  }
  public void printMenu(){
    for (MenuItem item : items){
    System.out.println(item.getName()+": $"+item.getPrice());
    }
  }



}
