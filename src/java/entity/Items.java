/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.util.ArrayList;

/**
 *
 * @author Michael Dang
 */
public class Items {

    private ArrayList<Products> ds;
    private int price;
    Products x;

    public Items() {
    }

    public Items(Products x, int price) {
        this.x = x;
        this.price = x.getPrice();
    }

    public ArrayList<Products> getDs() {
        return ds;
    }

    public void setDs(ArrayList<Products> ds) {
        this.ds = ds;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Products getX() {
        return x;
    }

    public void setX(Products x) {
        this.x = x;
    }

    public boolean addToCart(Products x) {
        if (ds.add(x) == true) {
            return true;
        } else {
            return false;
        }
    }

    public boolean delItems(Products x) {
        if (ds.remove(x) == true) {
            return true;
        } else {
            return false;
        }
    }

    public void delCart() {
        ds.clear();
    }

}
