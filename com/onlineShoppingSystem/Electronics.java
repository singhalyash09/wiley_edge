package com.onlineShoppingSystem;

public class Electronics extends Product{
    String brand;
    int warrantyPeriod;

    public Electronics(String productName, int productId, double price, int quantityInStock, String brand, int warrantyPeriod) {
        super(productName, productId, price, quantityInStock);
        this.brand = brand ;
        this.warrantyPeriod = warrantyPeriod ;
    }

    public void displayDetails(){
        super.displayDetails();
        System.out.println("Brand : "+brand);
        System.out.println("Warranty Period : " +warrantyPeriod );

    }

}
