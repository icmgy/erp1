package com.cmgy.erp.test;

import com.cmgy.erp.model.Order;
import com.cmgy.erp.repository.OrderRepository;
import org.junit.Test;

public class OrderRepositoryTest {

    OrderRepository repository = new OrderRepository();

    @Test
    public void testCreateOrder() {
        Order order = new Order();

        repository.createOrder(order);
    }
}
