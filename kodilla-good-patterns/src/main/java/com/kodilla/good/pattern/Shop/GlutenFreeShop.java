package com.kodilla.good.pattern.Shop;

import java.util.HashMap;
import java.util.Map;

public class GlutenFreeShop implements Supplier {
    String name = "GlutenFreeShop";
    Map<String, Integer> productList;

    public GlutenFreeShop() {
        String name = "GlutenFreeShop";
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
