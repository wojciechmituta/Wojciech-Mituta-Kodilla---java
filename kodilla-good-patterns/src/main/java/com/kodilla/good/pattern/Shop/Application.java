package com.kodilla.good.pattern.Shop;

public class Application {

    public static void main(String[] args) {
        GetInformation getInformation = new GetInformation();
        OrderRequestRetriever orderRequestRetriever = new OrderRequestRetriever();
        SendConfirmation sendConfirmation = new SendEmail();

        OrderRequest orderRequest = orderRequestRetriever.retrieve();
        sendConfirmation.info(orderRequest);
        getInformation.getInformation(orderRequest);
    }
}
