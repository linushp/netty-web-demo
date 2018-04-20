package com.github.luanhaipeng.nettyweb.test.controllers;

import cn.ubibi.nettyweb.framework.rest.annotation.Controller;
import cn.ubibi.nettyweb.framework.rest.annotation.GetMapping;
import cn.ubibi.nettyweb.framework.rest.annotation.PathVariable;
import cn.ubibi.nettyweb.framework.rest.annotation.RequestParam;

@Controller("/user")
public class UserController {

    @GetMapping("/list/:name")
    public String getUserList(@PathVariable("name") String name){
        return "user list " + name;
    }


    @GetMapping("/zhang")
    public String zhang(){
        return "zhang ";
    }
}
