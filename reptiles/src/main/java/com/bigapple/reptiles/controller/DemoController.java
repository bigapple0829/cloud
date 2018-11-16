package com.bigapple.reptiles.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: xiongtao
 * @Date: 15/11/2018 7:22 PM
 * @Description: 测试controller
 * @Email: xiongtao@juran.com.cn
 */
@RestController
public class DemoController {



    @RequestMapping("/index/{name}")
    @ResponseBody
    public String index(@PathVariable String name){

        if(null==name){
            name="boy";
        }

        return "hello world" +name;
    }


}
