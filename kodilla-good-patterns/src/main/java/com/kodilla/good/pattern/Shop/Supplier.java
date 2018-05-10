package com.kodilla.good.pattern.Shop;

import java.util.Map;

public interface Supplier {

    void process();

    String getName();

    Map<String, Integer> getProductList();

}
