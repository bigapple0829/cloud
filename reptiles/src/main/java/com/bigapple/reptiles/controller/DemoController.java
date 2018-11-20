package com.bigapple.reptiles.controller;

import com.bigapple.reptiles.service.ZhiHuTopicService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @Author: xiongtao
 * @Date: 15/11/2018 7:22 PM
 * @Description: 测试controller
 * @Email: xiongtao@juran.com.cn
 */
@RestController
@Api(value = "测试用例",tags = "'测试用例'")
public class DemoController {

    @Autowired
    ZhiHuTopicService zhiHuTopicService;


    @GetMapping("/getTopics")
    @ResponseBody
    @ApiOperation("测试用例")
    public String index(){
        zhiHuTopicService.getTopic();
        return "ok";
    }


}
