package com.lisi.carwebbigdata.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class CarDataController {

    @PostMapping("toexecutor.do")
    @ResponseBody
    public int carExecutor(String position){
        System.out.println("controller 数据正在处理="+position);
        int i = CarExecutor.executor(position);
        return i;
    }
}
