package com.kodilla.patterns.hashmapy;

import java.util.HashMap;

public class ProductService {
    private HashMap<String, Integer> productList = new HashMap<>();


    public ProductService(HashMap<String, Integer> productList) {
        this.productList = productList;
    }

    public ProductService() {
    }

    public void addToMap(String name, Integer price) {
        productList.put(name, price);
    }

    public int getPrice(String name) {
        int result = productList.get(name);
        return result;
    }

    public static void main(String[] args) {
        ProductService product = new ProductService();
        product.addToMap("maslo", 2);
        product.addToMap("mleko", 5);

      //  System.out.println("Cena dla produktu maslo: " + product.getPrice("keczup"));
    }
}

