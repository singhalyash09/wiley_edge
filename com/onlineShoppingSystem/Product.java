package com.onlineShoppingSystem;

import java.util.ArrayList;
import java.util.List;

public class Product {
    String productName;
    int productId;
    double price;
    int quantityInStock;

    public Product(String productName, int productId, double price, int quantityInStock ){
        this.productName = productName ;
        this.productId = productId ;
        this.price = price;
        this.quantityInStock = quantityInStock ;
    }
    public void displayDetails(){
        System.out.println("Product Name : "+productName);
        System.out.println("Product ID : "+ productId);
        System.out.println("Price : " + price);
        System.out.println("Quantity (in Stock) : "+quantityInStock);
    }
}
