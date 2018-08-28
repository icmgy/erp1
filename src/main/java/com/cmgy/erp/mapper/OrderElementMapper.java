package com.cmgy.erp.mapper;

import com.cmgy.erp.model.Order;
import com.cmgy.erp.model.OrderElemnet;

import java.util.List;

public interface OrderElementMapper {
    int createOrderElemnet(OrderElemnet orderElemnet);

    OrderElemnet selectById(int id);

    List<OrderElemnet> selectByOrderId(int orderId);

    List<OrderElemnet> selectAll();
}
