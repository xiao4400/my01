package com.zking.batis.controller;

import com.zking.batis.model.Myfile;
import com.zking.batis.model.MyfileVo;
import com.zking.batis.service.IMyfileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.util.UUID;

@Controller
@RequestMapping("/sys/file")
public class FileController {

    @Autowired
    private IMyfileService myfileService;

    @ModelAttribute
    public void init(Model model){
        model.addAttribute("MyfileVo",new MyfileVo());
    }

    @RequestMapping("/toUpdate")
    public String toUpdate(){
        return "sys/upFile";
    }

    @RequestMapping("/upload")
    public String upload(MyfileVo myfileVo)throws Exception{
        MultipartFile img = myfileVo.getImg();
        System.out.println(img.getContentType());
        System.out.println(img.getOriginalFilename());

        Myfile myfile = new Myfile();
        String Id = UUID.randomUUID().toString().replace("-","");
        String url = "E:\\bzd\\"+Id;
        myfile.setFileId(Id);
        myfile.setRealName(img.getOriginalFilename());
        myfile.setContentType(img.getContentType());
        myfile.setUrl(url);
        myfileService.add(myfile);

        File file = new File(url);
        img.transferTo(file);
        return "redirect:/sys/file/toUpdate";
    }

}
