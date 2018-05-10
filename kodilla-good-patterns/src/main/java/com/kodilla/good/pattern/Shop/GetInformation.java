package com.kodilla.good.pattern.Shop;

public class GetInformation {

    public void getInformation(OrderRequest orderRequest) {
        System.out.println("Te order was picked from: " + orderRequest.getSupplier().getName() + "\n" + orderRequest.getProductList() + "\nOder day: " + orderRequest.getLocalDate());
    }
}
