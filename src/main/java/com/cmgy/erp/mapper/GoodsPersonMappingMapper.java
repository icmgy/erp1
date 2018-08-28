package com.cmgy.erp.mapper;

import com.cmgy.erp.model.GoodsPersonMapping;
import com.cmgy.erp.model.Order;

import java.util.List;

public interface GoodsPersonMappingMapper {

    int createGoodsPersonMapping(GoodsPersonMapping goodsPersonMapping);

    GoodsPersonMapping selectByGoodsName(String goodsName);

    GoodsPersonMapping selectByPersonName(String personName);

    GoodsPersonMapping selectByPersonNameAndGoodsName(String personName,String goodsName);

    List<GoodsPersonMapping> selectAll();
}
