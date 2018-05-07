package com.kodilla.good.pattern.challenges;

import java.time.LocalDate;

public interface OrderService {
    boolean order(User user, LocalDate localDate, Product product);
}
