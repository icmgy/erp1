package com.cmgy.erp.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

public class Order {
    private int id;
    private Date createTime;
    private Date sendTime;
    private double amount;
    private boolean isSent;
    private boolean isPay;

    private List<OrderElemnet> orderElements = new ArrayList<OrderElemnet>();

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getSendTime() {
        return sendTime;
    }

    public void setSendTime(Date sendTime) {
        this.sendTime = sendTime;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public boolean isSent() {
        return isSent;
    }

    public void setSent(boolean sent) {
        isSent = sent;
    }

    public boolean isPay() {
        return isPay;
    }

    public void setPay(boolean pay) {
        isPay = pay;
    }

    public List<OrderElemnet> getOrderElements() {
        return orderElements;
    }

    public void setOrderElements(List<OrderElemnet> orderElements) {
        this.orderElements = orderElements;
    }
}
