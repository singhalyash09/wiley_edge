package com.onlineShoppingSystem;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    private final List<Product> cartItems;
    public ShoppingCart() {
        cartItems = new ArrayList<>();
    }

    public void addProduct(Product product) {
        cartItems.add(product);
    }

    public void displayCart() {
        System.out.println("Shopping Cart Contents:");
        for (Product item : cartItems) {
            item.displayDetails();
            System.out.println("----------------------");
        }
    }

    public double calculateTotalPrice() {
        double total = 0;
        for (Product item : cartItems) {
            total += item.price;
        }
        return total;
    }
}
