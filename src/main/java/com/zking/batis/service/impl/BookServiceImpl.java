package com.zking.batis.service.impl;

import com.github.pagehelper.Page;
import com.zking.batis.mapper.BookMapper;
import com.zking.batis.model.Book;
import com.zking.batis.service.IBookService;
import com.zking.batis.util.PageBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;


@Service
@Transactional
public class BookServiceImpl implements IBookService {

    @Autowired  //根据类型注入
//    @Resource(name = "bookMapper") //根据名字注入 (好用,属于J2EE,常用)
    private BookMapper bookMapper;


    @Override
    public int add(Book book) {
        return bookMapper.insert(book);
    }

    @Override
    public int del(Book book) {
        return bookMapper.deleteByPrimaryKey(book.getRm());
    }

    @Transactional(readOnly = true)//设置只查
    @Override
    public Book load(Book book) {
        return bookMapper.selectByPrimaryKey(book.getRm());
    }

    @Transactional(readOnly = true)
    @Override
    public List<Book> list(Book book , PageBean pageBean) {
        return bookMapper.list(book);
    }
}
