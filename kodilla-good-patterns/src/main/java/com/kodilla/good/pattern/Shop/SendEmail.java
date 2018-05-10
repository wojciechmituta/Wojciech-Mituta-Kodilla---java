package com.kodilla.good.pattern.Shop;

public class SendEmail implements SendConfirmation {
    public void info(OrderRequest orderRequest) {

        System.out.println("Confirmation e-mail has been sent to: " + orderRequest.getSupplier().getName());
    }
}
