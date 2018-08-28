package com.cmgy.erp.model;

public class OrderElemnet {
    private int id;
    private GoodsPersonMapping mapping;
    private int count;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public GoodsPersonMapping getMapping() {
        return mapping;
    }

    public void setMapping(GoodsPersonMapping mapping) {
        this.mapping = mapping;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}
