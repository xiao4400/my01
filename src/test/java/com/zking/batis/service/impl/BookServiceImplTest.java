package com.zking.batis.service.impl;

import com.zking.batis.model.Book;
import com.zking.batis.service.IBookService;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

import static org.junit.Assert.*;

public class BookServiceImplTest extends BaseTestCase {

    @Autowired
    private IBookService bookService;
    private Book book;

    @Before
    public void setUp(){
        super.setUp();
        book = new Book();
    }

    @Test
    public void add() {
        book.setCode("001");
        book.setType("娱乐");
        book.setName("哈哈哈哈");
        book.setAuthor("小花");
        book.setPrice("100");
        bookService.add(book);
    }

    @Test
    public void del() {
    }

    @Test
    public void load() {
        book.setRm(19);
        Book load = bookService.load(book);
        System.out.println(load);
        System.out.println("====================================");
        Book load2 = bookService.load(book);
        System.out.println(load2);

    }

    @Test
    public void list() {
        pageBean.setPage(2);
        pageBean.setRows(3);
        pageBean.setPagination(true);
        List<Book> list = bookService.list(book, pageBean);
        for(Book b :list){
            System.out.println(b.getName());
        }
    }
}