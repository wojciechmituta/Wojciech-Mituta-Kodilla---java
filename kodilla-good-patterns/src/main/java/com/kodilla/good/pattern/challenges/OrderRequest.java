package com.kodilla.good.pattern.challenges;

import java.time.LocalDate;

public class OrderRequest {
    public User user;
    public Product product;
    public LocalDate localDate;

    public OrderRequest(User user, Product product, LocalDate localDate) {
        this.user = user;
        this.product = product;
        this.localDate = localDate;
    }

    public User getUser() {
        return user;
    }

    public Product getProduct() {
        return product;
    }

    public LocalDate getDate() {
        return localDate;
    }
}
