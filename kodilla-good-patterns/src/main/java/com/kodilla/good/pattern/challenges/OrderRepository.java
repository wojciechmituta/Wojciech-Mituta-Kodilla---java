package com.kodilla.good.pattern.challenges;

import java.time.LocalDate;

public interface OrderRepository {
     boolean createOrder (User user, LocalDate localDate, Product product);
}
