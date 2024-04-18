package com.onlineShoppingSystem;

public class Clothing extends Product{
    String material;
    String size;

    public Clothing(String productName, int productId, double price, int quantityInStock, String material, String size) {
        super(productName, productId, price, quantityInStock);
        this.material= material ;
        this.size = size;
    }

    public void displayDetails(){
        super.displayDetails();
        System.out.println("Material : "+material);
        System.out.println("Size : " +size );

    }

}
