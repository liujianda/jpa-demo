package com.offcn.controller;

import com.offcn.pojo.Books;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping(produces="text/plain;charset=UTF-8")
public class FirstThymeleafController {

    @GetMapping(path = "/indexPage")
    public String indexPage(Model model){
        String message = "welcome to spring boot,We must study hard!";
        model.addAttribute("message",message);

        Books books = new Books();
        books.setId("1");
        books.setName("如何讨好女朋友---添狗的自我修养");
        books.setCategory("生活常识");
        books.setPnum(100);
        books.setPrice(999999.0);
        model.addAttribute("books",books);

        Map<String,String> map = new HashMap<>();
        map.put("a","a.jpg");
        map.put("b","b.jpg");
        map.put("c","c.jpg");
        model.addAttribute("src",map);
        return "index1";
    }

    @GetMapping(path = "/testFor")
    public String testFor(Model model){
        List<String> list = new ArrayList<>();
        list.add("猪猪");
        list.add("丑芳姐");
        list.add("大遥妈");
        list.add("沈大哥");
        model.addAttribute("list",list);
        return "index2";
    }

    @GetMapping(path = "/testString")
    public String testString(Model model){
        String title = "大标题哦";
        String name = "傻狗子";
        String text = "XXXX";
        model.addAttribute("title",title);
        model.addAttribute("name",name);
        model.addAttribute("text",text);
        return "index3";
    }

    @GetMapping(path = "/testZhuzhuLoveMe")
    public String testZhuzhuLoveMe(Model model){
        String flag1 = "yes";
        String flag2 = "no";
        String text1 = "山竹";
        String text2 = "奇异果";
        model.addAttribute("flag1",flag1);
        model.addAttribute("flag2",flag2);
        model.addAttribute("text1",text1);
        model.addAttribute("text2",text2);
        return "index4";
    }
}
