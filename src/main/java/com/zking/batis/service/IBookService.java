package com.zking.batis.service;

import com.zking.batis.model.Book;
import com.zking.batis.util.PageBean;

import java.util.List;

public interface IBookService {

    int add(Book book);

    int del(Book book);

    Book load(Book book);

    List<Book> list(Book book, PageBean pageBean);
}
