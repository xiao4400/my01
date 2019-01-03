package com.zking.batis.service.impl;

import com.zking.batis.mapper.MyfileMapper;
import com.zking.batis.model.Myfile;
import com.zking.batis.service.IMyfileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MyfileServiceImpl implements IMyfileService {

    @Autowired
    private MyfileMapper myfileMapper;

    @Override
    public void add(Myfile myfile) {
        myfileMapper.insert(myfile);
    }

    @Override
    public Myfile load(Myfile myfile) {
        Myfile f = myfileMapper.selectByPrimaryKey(myfile.getFileId());
        return f;
    }
}
