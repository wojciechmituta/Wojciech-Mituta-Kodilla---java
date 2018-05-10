package com.kodilla.good.pattern.Shop;

public class SendSms implements SendConfirmation {
    public void info(OrderRequest orderRequest) {

        System.out.println("Confirmation sms has been sent to: " + orderRequest.getSupplier().getName());
    }
}
