package com.kodilla.good.pattern.challenges;

public class OrderingProcessor {

    private InformationService informationService;
    private OrderService orderService;
    private OrderRepository orderRepository;

    public OrderingProcessor(InformationService informationService, OrderService orderService, OrderRepository orderRepository) {
        this.informationService = informationService;
        this.orderService = orderService;
        this.orderRepository = orderRepository;
    }

    public OrderDto process(final OrderRequest orderRequest) {
        boolean isOrdered = orderService.order(orderRequest.getUser());

        if(isOrdered) {
            informationService.info(orderRequest.getUser());
            orderRepository.createOrder(orderRequest.getUser(), orderRequest.getDate(), orderRequest.getProduct());
            return new OrderDto(orderRequest.getUser(), true);
        } else {
            return new OrderDto(orderRequest.getUser(), false);
        }
    }
}
public class Application {

    public static void main(String[] args) {

        OrderRequestRetriever orderRequestRetriever = new OrderRequestRetriever();
        OrderRequest orderRequest = orderRequestRetriever.retrieve();

        OrderingProcessor orderingProcessor = new OrderingProcessor(new SendMesange(), new ProductOrderService(), new ProductOrderRepository());
        orderingProcessor.process(orderRequest);
    }
}