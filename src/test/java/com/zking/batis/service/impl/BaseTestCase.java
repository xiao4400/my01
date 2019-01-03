package com.zking.batis.service.impl;


import com.zking.batis.util.PageBean;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:spring.xml"})
public class BaseTestCase {

    public PageBean pageBean;

    @Before
    public void setUp(){
        pageBean = new PageBean();
    }

}
