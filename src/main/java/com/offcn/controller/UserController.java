package com.offcn.controller;

import com.offcn.pojo.User;
import com.offcn.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping(path = "/findAll")
    public String findAll(Model model){
        List<User> list =userService.findAll();
        model.addAttribute("page",list);
        return "user/list";
    }

    @GetMapping(path = "/toAdd")
    public String toAdd(){
        return "user/userAdd";
    }

    @RequestMapping(path = "/add")
    public String add(User user){
        userService.add(user);
        return "redirect:findAll";
    }

    @GetMapping(path = "/toEdit/{id}")
    public String Edit(@PathVariable Long id,Model model){
        User user = userService.findOne(id);
        model.addAttribute("user",user);
        return "user/userEdit";
    }

    @PostMapping(path = "/update")
    public String update(User user){
        userService.update(user.getId(),user);
        return "redirect:findAll";
    }

    @RequestMapping(path = "/delete")
    public String delete(Long id){
        userService.delete(id);
        return "redirect:findAll";
    }
}
