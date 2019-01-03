package com.zking.batis.service.impl;

import com.zking.batis.model.Order;
import com.zking.batis.service.IOrder;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class OrderImplTest extends BaseTestCase {

    @Autowired
    private IOrder orderService;

    private Order order;

    @Override
    public void setUp() {
        super.setUp();
        order = new Order();
    }

    @Test
    public void selectByPrimaryKey() {
        order.setOrderId(1);
        Order select = orderService.selectByPrimaryKey(this.order.getOrderId());
        System.out.println(select);
    }
}