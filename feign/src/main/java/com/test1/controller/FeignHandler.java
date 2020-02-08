package com.test1.controller;

import com.test1.feign.FeignProviderClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

@RestController
@RequestMapping("/feign")
public class FeignHandler {

    @Autowired
    //注入FeignProviderClient接口
    private FeignProviderClient feignProviderClient;

    @GetMapping("/findAll")
    public Collection findAll(){
        //直接返回、调用FeignProviderClient接口中的方法
        return feignProviderClient.findAll();
    }

    @GetMapping("/index")
    public String index(){
        return feignProviderClient.index();
    }
}
