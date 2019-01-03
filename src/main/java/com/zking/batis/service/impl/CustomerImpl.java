package com.zking.batis.service.impl;

import com.zking.batis.mapper.CustomerMapper;
import com.zking.batis.model.Customer;
import com.zking.batis.service.ICustomer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class CustomerImpl implements ICustomer {

    @Autowired
    private CustomerMapper customerMapper;

    @Override
    public List<Customer> list(Customer customer) {
        return customerMapper.list(customer);
    }
}
