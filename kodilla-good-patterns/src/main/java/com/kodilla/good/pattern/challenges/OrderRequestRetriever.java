package com.kodilla.good.pattern.challenges;

import java.time.LocalDate;

public class OrderRequestRetriever {

    public OrderRequest retrieve() {
        User user = new User("Leszek", "Nowak");
        Product product = new Product("Book", 30);
        LocalDate localDate =  LocalDate.of(2017, 6, 18);
        return new OrderRequest(user, product, localDate);
    }
}
