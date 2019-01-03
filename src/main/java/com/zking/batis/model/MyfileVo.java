package com.zking.batis.model;

import org.springframework.web.multipart.MultipartFile;

public class MyfileVo extends Myfile {

    private Integer bookId;

    private MultipartFile img;

    public MyfileVo(){}

    public Integer getBookId() {
        return bookId;
    }

    public void setBookId(Integer bookId) {
        this.bookId = bookId;
    }

    public MultipartFile getImg() {
        return img;
    }

    public void setImg(MultipartFile img) {
        this.img = img;
    }
}

