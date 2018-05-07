package com.kodilla.good.pattern.challenges;

import java.time.LocalDate;

public class ProductOrderRepository implements OrderRepository {
    @Override
    public boolean createOrder(User user, LocalDate localDate, Product product) {
        System.out.print(user + "" + product);
        return true;
    }
}
