package com.kodilla.good.pattern.challenges;

import java.time.LocalDate;

public class OrderRequestRetriever {


    public OrderRequest retrieve() {
        User user = new User("Leszek", "Nowak");
        Product product = new Product("Ksiazka", 30);
        return new OrderRequest(user, product);
    }
}
