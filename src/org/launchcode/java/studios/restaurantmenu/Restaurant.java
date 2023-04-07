package org.launchcode.java.studios.restaurantmenu;

import java.util.ArrayList;
import java.util.Date;

public class Restaurant {
    public static void main(String[] args) {
        Date date = new Date();
        ArrayList <MenuItem> menuList= new ArrayList<>();
        MenuItem eggs = new MenuItem("Eggs", 3.99);
        MenuItem pancakes = new MenuItem("Pancakes", 10.99);
        MenuItem frenchToast = new MenuItem("French Toast", 14.99, "2 pieces of French Toast with strawberries and lemon mascarpone", "Entree", true);
        MenuItem eggs2 = new MenuItem("Eggs", 23456.56);
        Menu menu= new Menu(date, menuList);
        menu.addItem(eggs);
        menu.addItem(pancakes);
        menu.addItem(frenchToast);

        menu.printMenu();
        System.out.println("");

        frenchToast.printMenuItem();
        eggs.printMenuItem();

        System.out.println("");
        menu.removeItem(eggs);

        menu.printMenu();
        System.out.println(eggs.isEqual(eggs2));

        System.out.println(menu.lastMenuUpdate());
    }
}
