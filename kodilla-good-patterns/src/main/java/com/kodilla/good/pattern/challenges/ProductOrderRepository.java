package com.kodilla.good.pattern.challenges;

import java.time.LocalDate;

public class ProductOrderRepository implements OrderRepository {
    @Override
    public boolean createOrder(User user, LocalDate localDate, Product product) {
        System.out.println("The User: " + user.getName() + " " + user.getLastName() + " Has ordered: " + product.getName() + " for the amount " + product.getPrice() + " USD");
        return true;
    }
}