package com.zking.batis.service.impl;

import com.zking.batis.model.Customer;
import com.zking.batis.service.ICustomer;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class CustomerImplTest extends BaseTestCase {
    @Autowired
    private ICustomer customerimpl;

    private Customer customer;

    @Override
    public void setUp() {
        super.setUp();
        customer = new Customer();
    }

    @Test
    public void list() {
        customer.setCustomerId(1);
        List<Customer> listC = customerimpl.list(customer);
        for (Customer c : listC){
            System.out.println(c);
        }
    }
}