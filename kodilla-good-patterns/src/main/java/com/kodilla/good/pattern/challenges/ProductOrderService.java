package com.kodilla.good.pattern.challenges;

import java.time.LocalDate;

public class ProductOrderService implements OrderService {
    @Override
    public boolean order(User user, LocalDate localDate, Product product) {
        System.out.println("Sale for: " + user.getName() + " " + user.lastName + " buy: "+ product + " Order day: " + localDate);
        return true;
    }
}
