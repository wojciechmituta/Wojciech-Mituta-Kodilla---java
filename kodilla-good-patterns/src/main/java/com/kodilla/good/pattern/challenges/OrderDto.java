package com.kodilla.good.pattern.challenges;

public class OrderDto {

    public User user;
    public boolean SalleCompleated;

    public OrderDto(User user, boolean salleCompleated) {
        this.user = user;
        SalleCompleated = salleCompleated;
    }

    public User getUser() {
        return user;
    }

    public boolean isSalleCompleated() {
        return SalleCompleated;
    }
}
