package com.example.gcdemo.controller;

import com.example.gcdemo.service.Demo2Service;
import com.example.gcdemo.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * TODO
 *
 * @author karl.xiong
 * @date 2020/4/26
 */
@Controller
@RequestMapping("/test")
public class DemoController {

    @Autowired
    private DemoService demoService;
    @Autowired
    private Demo2Service demo2Service;

    @RequestMapping("/demo1")
    public String demo1() {
        demoService.bizHandle();
        return "success";
    }

    @RequestMapping("/demo2")
    public String demo2() {
        demo2Service.bizHandle();
        return "success";
    }
}
