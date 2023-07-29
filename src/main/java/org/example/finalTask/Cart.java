package org.example.finalTask;

import org.example.comparable.comparatorTask1.Student;

import java.util.*;

public class Cart {

    private HashMap<Product, Integer> isBoughtProduct;

    public Cart() {
        isBoughtProduct = new HashMap<>(); //без этого конструктора не работает. Tаким образом он инциализирует хешьмап
        // java переходит к конструктору, и в конструкторе хэш-карта, котораяесть, равна самой себе,поскольку не инициализирова,
        // хэш-карта равна нулю.
    }


    public void addProduct(Product product, int quantity) {
        isBoughtProduct.put(product, quantity);
    }

    public void productsInCart() {
        int totalPurchase = 0;

        for (Map.Entry<Product, Integer> entry : isBoughtProduct.entrySet()) {
            Product prod = entry.getKey();
            int quantity = entry.getValue();

            int productTotalPrice = prod.getPrice() * quantity;

            totalPurchase += productTotalPrice;

            System.out.println("Product: " + prod + " - " + quantity + " pcs.");
        }
        System.out.println("-----------------------");
        System.out.println("Total purchase is: " + totalPurchase);
        System.out.println("-----------------------");
        System.out.println("-----------------------");

    }

    public void sortedByName() {
        List<Product> sortedName = new ArrayList<>(isBoughtProduct.keySet());

        Collections.sort(sortedName, new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });
        printSortedList(sortedName);
        System.out.println("-----------------------");
        System.out.println("-----------------------");
    }

    public void sortedByPrice() {
        List<Product> sortedPrice = new ArrayList<>(isBoughtProduct.keySet());
        Collections.sort(sortedPrice, new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                if (o1.getPrice() > o2.getPrice()) {
                    return 1;
                } else if (o1.getPrice() < o2.getPrice()) {
                    return -1;
                } else
                    return 0;
            }
        });
        printSortedList(sortedPrice);
        System.out.println("-----------------------");
        System.out.println("-----------------------");
    }

    public void sortedByNameAndPrice() {
        List<Product> sortedByBoth = new ArrayList<>(isBoughtProduct.keySet());
        Collections.sort(sortedByBoth, new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                int nameCompare = o1.getName().compareTo(o2.getName());
                if (nameCompare == 0) {
                    return Integer.compare(o1.getPrice(), o2.getPrice());
                } else
                    return nameCompare;
            }
        });
        printSortedList(sortedByBoth);
    }

    private void printSortedList(List<Product> sortedList) {
        for (Product product : sortedList) {
            System.out.println(product);
        }
    }

}
