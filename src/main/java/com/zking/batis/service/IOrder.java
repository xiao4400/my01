package com.zking.batis.service;

import com.zking.batis.model.Order;

public interface IOrder {

    Order selectByPrimaryKey(Integer orderId);
}
