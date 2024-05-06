/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.util.ArrayList;

/**
 *
 * @author MichaelDang
 */
public class CartItems {

    private Products product;
    private Account customer;
    private ArrayList<Products> listProducts;
    private int quantity;

    public CartItems() {
    }

    public CartItems(Products product, Account customer, ArrayList<Products> listProducts, int quantity) {
        this.product = product;
        this.customer = customer;
        this.listProducts = listProducts;
        this.quantity = quantity;
    }

    public Products getProduct() {
        return product;
    }

    public void setProduct(Products product) {
        this.product = product;
    }

    public Account getCustomer() {
        return customer;
    }

    public void setCustomer(Account customer) {
        this.customer = customer;
    }

    public ArrayList<Products> getListProducts() {
        return listProducts;
    }

    public void setListProducts(ArrayList<Products> listProducts) {
        this.listProducts = listProducts;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

}
