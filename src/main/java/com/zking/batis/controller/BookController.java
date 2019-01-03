package com.zking.batis.controller;

import com.zking.batis.model.Book;
import com.zking.batis.service.IBookService;
import com.zking.batis.util.PageBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
@RequestMapping("/sys/book")
public class BookController {

    @Autowired
    private IBookService bookService;

    @ModelAttribute
    public void init(Model model){
        Book book = new Book();
        model.addAttribute("book",book);
        model.addAttribute("cid",new Integer[]{1,2,3,4,5});
    }

    @RequestMapping("/toAdd")
    public String toAdd(){
        return "sys/addBook";
    }


    @RequestMapping("/add")
    public String add(Book book){
        bookService.add(book);
        return "index";
    }

    @RequestMapping("/list")
    public ModelAndView listBook(Book book , HttpServletRequest req ,ModelAndView mv){
        PageBean pageBean = new PageBean();
        pageBean.setRequest(req);
        List<Book> bookList = bookService.list(book, pageBean);
        mv.setViewName("sys/listBook");
        mv.addObject("pageBean",pageBean);
        mv.addObject("bookList",bookList);
        return mv;
    }
}
