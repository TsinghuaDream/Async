package com.springboot.async;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/async")
public class AsyncCoontroller {
    @Autowired
    private AsyncService asyncService = null;
    @GetMapping("/page")
    public String asyncPage(){
        System.out.println("请求线程名称："+"【"+Thread.currentThread().getName()+"】");
        //调用异步服务
        asyncService.generateReport();
        asyncService.sout();
        return "async";
    }
}
