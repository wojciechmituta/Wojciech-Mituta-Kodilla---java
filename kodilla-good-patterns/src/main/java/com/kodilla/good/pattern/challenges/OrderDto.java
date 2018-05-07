package com.kodilla.good.pattern.challenges;

public class OrderDto {

    public User user;
    public  boolean SalleCopleated;

    public OrderDto(User user, boolean salleCopleated) {
        this.user = user;
        SalleCopleated = salleCopleated;
    }

    public User getUser() {
        return user;
    }

    public boolean isSalleCopleated() {
        return SalleCopleated;
    }
}
