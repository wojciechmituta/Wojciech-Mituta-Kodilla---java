package com.kodilla.good.pattern.Shop;

import java.time.LocalDate;

public class OrderRequestRetriever {

    public OrderRequest retrieve() {
        ExtraFoodShop extraFoodShop = new ExtraFoodShop();
        LocalDate localDate =  LocalDate.of(2017, 6, 18);
        extraFoodShop.process();
        return new OrderRequest(extraFoodShop, extraFoodShop.getProductList(), localDate);
    }
}
