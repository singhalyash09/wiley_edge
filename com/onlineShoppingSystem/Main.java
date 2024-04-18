package com.onlineShoppingSystem;

public class Main {
    public static void main(String[] args) {
        // Creating some sample products
        Electronics laptop = new Electronics("Laptop", 1, 1200.0, 5, "Dell", 12);
        Clothing shirt = new Clothing("Shirt", 2, 25.0, 10, "Cotton", "XL");

        // Adding products to the shopping cart
        ShoppingCart cart = new ShoppingCart();
        cart.addProduct(laptop);
        cart.addProduct(shirt);

        // Displaying the contents of the shopping cart
        cart.displayCart();

        // Calculating and displaying the total price
        double totalPrice = cart.calculateTotalPrice();
        System.out.println("Total Price: $" + totalPrice);
    }
}
