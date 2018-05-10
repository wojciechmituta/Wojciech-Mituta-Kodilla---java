package com.kodilla.good.pattern.Shop;

import java.util.HashMap;
import java.util.Map;

public class ExtraFoodShop implements Supplier {
    String name = "ExtraFoodShop";
    Map<String, Integer> productList;


    public ExtraFoodShop() {

        String name = "ExtraFoodShop";

        productList = new HashMap<>();
        productList.put("chleb", 13);
        productList.put("marchewka", 20);
        productList.put("jablko", 2);
    }

    @Override
    public void process(OrderRequest orderRequest) {
        System.out.println("The order was completed. The customer received a 10% discount" + orderRequest.getSupplier().getName());
    }

    @Override
    public String getName() {
        return name;
    }

    public Map<String, Integer> getProductList() {
        return productList;
    }
}
