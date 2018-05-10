package com.kodilla.good.pattern.Shop;

import java.util.HashMap;
import java.util.Map;

public class HealthyShop implements Supplier {
    String name = "HealthyShop";
    Map<String, Integer> productList;

    public HealthyShop() {
        String name = "HealthyShop";
        productList = new HashMap<>();
        productList.put("chleb", 13);
        productList.put("marchewka", 20);
        productList.put("jablko", 2);
    }

    @Override
    public void process() {
       System.out.println("The order was completed. The customer received a 10% discount");
    }

    @Override
    public String getName() {
        return name;
    }

    public Map<String, Integer> getProductList() {
        return productList;
    }
}
