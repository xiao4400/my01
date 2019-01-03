package com.zking.batis.service;

import com.zking.batis.model.Myfile;

public interface IMyfileService {

    void add(Myfile myfile);

    Myfile load(Myfile myfile);

}
