package com.example.demo.controller;


import com.example.demo.pojo.User;
import com.example.demo.service.UserService;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author lihu
 * @since 2020-12-03
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Resource
    private UserService userService;

    @RequestMapping("/save")
    public String save(){
        for (int i=0;i<10;i++){
            User user=new User();
            user.setId(i+60);
            user.setName("瓜田李下 "+i);
            user.setAge(10+i);

            userService.save(user);
        }

        return "success";
    }
}

