package com.kodilla.good.pattern.challenges;

import java.time.LocalDate;

public class ProductOrder implements OrderService{
    @Override
    public boolean order(User user, LocalDate datOfOrder) {
        System.out.println("Sale for: " + user.getName() + user.lastName + "Order day: " + datOfOrder);
        return true;
    }
}
