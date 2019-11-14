package com.eight.leqia.service;

import com.eight.leqia.entity.FoodOrder;
import com.eight.leqia.mapper.OrderMapperT;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class OrderServiceImplT implements OrderServiceT {
    @Resource
    private OrderMapperT orderMapperT;
    @Override
    public int addOrder(FoodOrder foodOrder) {
        return orderMapperT.addOrder(foodOrder);
    }

    @Override
    public List<FoodOrder> selOrder(int CId,int OrderStatus) {
        return orderMapperT.selOrder(CId,OrderStatus);
    }


    @Override
    public List<FoodOrder> selOrderById(String OrderId) {
        return orderMapperT.selOrderById(OrderId);
    }

    @Override
    public FoodOrder setGoodsNum(String OrderId, String FId) {
        return orderMapperT.setGoodsNum(OrderId,FId);
    }

    @Override
    public List<FoodOrder> selAllOrder(int CId) {
        return orderMapperT.selAllOrder(CId);
    }

    @Override
    public int delOrderById(String OrderId) {
        return orderMapperT.delOrderById(OrderId);
    }


}
