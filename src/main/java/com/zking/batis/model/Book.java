package com.zking.batis.model;

import org.springframework.stereotype.Component;

import java.io.Serializable;

@Component
public class Book implements Serializable{
    private Integer rm;

    private String code;

    private String name;

    private String price;

    private String type;

    private String author;

    private Integer cid;


    public Book(Integer rm, String code, String name, String price, String type, String author,Integer cid) {
        this.rm = rm;
        this.code = code;
        this.name = name;
        this.price = price;
        this.type = type;
        this.author = author;
        this.cid = cid;
    }

    public Book() {
        super();
    }

    public Integer getRm() {
        return rm;
    }

    public void setRm(Integer rm) {
        this.rm = rm;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Integer getCid() {
        return cid;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
    }

    @Override
    public String toString() {
        return "Book{" +
                "rm=" + rm +
                ", code='" + code + '\'' +
                ", name='" + name + '\'' +
                ", price='" + price + '\'' +
                ", type='" + type + '\'' +
                ", author='" + author + '\'' +
                '}';
    }
}