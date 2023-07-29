package org.example.finalTask;


public class ProductManager {

    public static void main(String[] args) {

        Product prod1 = new Product("iPhone", 1000);
        Product prod2 = new Product("Book", 150);
        Product prod3 = new Product("Cheese", 50);
        Product prod4 = new Product("Apple", 10);
        Product prod5 = new Product("Doll", 250);

        Cart cart = new Cart();

        cart.addProduct(prod1, 1);
        cart.addProduct(prod2, 2);
        cart.addProduct(prod3, 1);
        cart.addProduct(prod4, 2);
        cart.addProduct(prod5, 2);

        cart.productsInCart();

        cart.sortedByName();

        cart.sortedByPrice();

        cart.sortedByNameAndPrice();
    }

}
