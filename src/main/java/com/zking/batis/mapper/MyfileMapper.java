package com.zking.batis.mapper;

import com.zking.batis.model.Myfile;
import org.springframework.stereotype.Repository;

@Repository
public interface MyfileMapper {
    int deleteByPrimaryKey(String fileId);

    int insert(Myfile record);

    int insertSelective(Myfile record);

    Myfile selectByPrimaryKey(String fileId);

    int updateByPrimaryKeySelective(Myfile record);

    int updateByPrimaryKey(Myfile record);
}