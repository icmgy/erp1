package com.cmgy.erp.mapper;

import com.cmgy.erp.model.Order;

import java.util.List;

public interface OrderMapper {

    int createOrder(Order order);

    Order selectById(int id);

    List<Order> selectAll();
}
