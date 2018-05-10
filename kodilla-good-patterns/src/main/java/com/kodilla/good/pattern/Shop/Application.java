package com.kodilla.good.pattern.Shop;

import java.util.Map;

public class Application {

    public static void main(String[] args) {
        SendEmail sendEmail = new SendEmail();
        GetInformation getInformation = new GetInformation();
        OrderRequestRetriever orderRequestRetriever = new OrderRequestRetriever();
        ExtraFoodShop extraFoodShop = new ExtraFoodShop();

        OrderRequest orderRequest = orderRequestRetriever.retrieve();
        sendEmail.info(orderRequest);
        getInformation.getInformation(orderRequest);
        extraFoodShop.process(orderRequest);
    }
}
