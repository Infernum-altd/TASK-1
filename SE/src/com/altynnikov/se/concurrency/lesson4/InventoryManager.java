package com.altynnikov.se.concurrency.lesson4;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class InventoryManager {

    List<Product> soldProductList = new CopyOnWriteArrayList<>();
    List<Product> purchasedProductList = new ArrayList<>();

    public void populateSoldProducts() {
        for (int i = 0; i < 1000; i++) {
            Product product = new Product(i, "test_product_" + i);
            soldProductList.add(product);
            System.out.println("ADDED: " + product);
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void displaySoldProducts() {
        for (Product product : soldProductList) {
            System.out.println("Printing the sold: " + product);
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}
