package com.zking.batis.mapper;

import com.zking.batis.model.Book;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository//dao层
//@Scope("prototype")设置多例
public interface BookMapper {
    int deleteByPrimaryKey(Integer rm);

    int insert(Book record);

    int insertSelective(Book record);

    Book selectByPrimaryKey(Integer rm);

    int updateByPrimaryKeySelective(Book record);

    int updateByPrimaryKey(Book record);

    List<Book> list(Book book);


}