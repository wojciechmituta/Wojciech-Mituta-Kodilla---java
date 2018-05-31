package com.kodilla.good.pattern.Shop;

import java.time.LocalDate;
import java.util.Map;

public class OrderRequest {

    public Supplier supplier;
    Map<String, Integer> productList;
    public LocalDate localDate;

    public OrderRequest(Supplier supplier, Map<String, Integer> productList, LocalDate localDate) {
        this.supplier = supplier;
        this.productList = productList;
        this.localDate = localDate;
    }

    public Supplier getSupplier() {
        return supplier;
    }

    public Map<String, Integer> getProductList() {
        return productList;
    }

    public LocalDate getLocalDate() {
        return localDate;
    }
}
