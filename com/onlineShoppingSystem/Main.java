package com.onlineShoppingSystem;

public class Main {
    public static void main(String[] args) {
        Electronics laptop = new Electronics("Laptop", 1, 1200.0, 5, "Dell", 12);
        Clothing shirt = new Clothing("Shirt", 2, 25.0, 10, "Cotton", "XL");

        ShoppingCart cart = new ShoppingCart();
        cart.addProduct(laptop);
        cart.addProduct(shirt);

        cart.displayCart();

        double totalPrice = cart.calculateTotalPrice();
        System.out.println("Total Price: $" + totalPrice);
    }
}
