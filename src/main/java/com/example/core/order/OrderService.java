package com.example.core.order;

public interface OrderService {

    Order createOrder(long memberId, String itemName, int itemPrice);
}
