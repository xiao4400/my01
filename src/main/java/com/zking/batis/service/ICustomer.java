package com.zking.batis.service;

import com.zking.batis.model.Customer;

import java.util.List;

public interface ICustomer {

    List<Customer> list(Customer customer);
}
