package com.cmgy.erp.repository;

import com.cmgy.erp.mapper.GoodsPersonMappingMapper;
import com.cmgy.erp.mapper.OrderElementMapper;
import com.cmgy.erp.mapper.OrderMapper;
import com.cmgy.erp.model.GoodsPersonMapping;
import com.cmgy.erp.model.Order;
import com.cmgy.erp.model.OrderElemnet;

import java.util.List;

public class OrderRepository extends BaseRepository {

    public int createOrder(Order order) {
        OrderMapper mapper = getSqlSessionFactory().openSession(true).getMapper(OrderMapper.class);
        return mapper.createOrder(order);
    }

    public Order selectOrderById(int orderId) {
        OrderMapper orderMapper = getSqlSessionFactory().openSession(true).getMapper(OrderMapper.class);
        Order order = orderMapper.selectById(orderId);
        OrderElementMapper orderElementMapper = getSqlSessionFactory().openSession(true).getMapper(OrderElementMapper.class);
        List<OrderElemnet> oderElemnetList = orderElementMapper.selectByOrderId(orderId);
        order.setOrderElements(oderElemnetList);
        return order;
    }

    public int addOrderElement(OrderElemnet orderElemnet) {
        OrderElementMapper orderElementMapper = getSqlSessionFactory().openSession(true).getMapper(OrderElementMapper.class);
        return orderElementMapper.createOrderElemnet(orderElemnet);
    }


    public GoodsPersonMapping selectByGoodsName(String goodsName) {
        GoodsPersonMappingMapper goodsPersonMappingMapper = getSqlSessionFactory().openSession(true).getMapper(GoodsPersonMappingMapper.class);
        return  goodsPersonMappingMapper.selectByGoodsName(goodsName);
    }

    public GoodsPersonMapping selectByPersonName(String personName) {
        GoodsPersonMappingMapper goodsPersonMappingMapper = getSqlSessionFactory().openSession(true).getMapper(GoodsPersonMappingMapper.class);
        return  goodsPersonMappingMapper.selectByPersonName(personName);
    }
}
