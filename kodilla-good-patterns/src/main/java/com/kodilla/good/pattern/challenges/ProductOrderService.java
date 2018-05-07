package com.kodilla.good.pattern.challenges;

import java.time.LocalDate;

public class ProductOrderService implements OrderService {
    @Override
    public boolean order(User user, LocalDate localDate) {
        System.out.println("Sale for: " + user.getName() + user.lastName + "Order day: " + localDate);
        return true;
    }
}
