package com.zking.batis.service.impl;

import com.zking.batis.mapper.OrderMapper;
import com.zking.batis.model.Order;
import com.zking.batis.service.IOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class OrderImpl implements IOrder {

    @Autowired
    private OrderMapper orderMapper;

    @Override
    public Order selectByPrimaryKey(Integer orderId) {
        return orderMapper.selectByPrimaryKey(orderId);
    }
}
