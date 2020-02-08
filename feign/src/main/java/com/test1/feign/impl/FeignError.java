package com.test1.feign.impl;

import com.test1.entity.Student;
import com.test1.feign.FeignProviderClient;
import org.springframework.stereotype.Component;

import java.util.Collection;

//添加到IOC中
@Component
public class FeignError implements FeignProviderClient {

    @Override
    public Collection<Student> findAll() {
        return null;
    }

    @Override
    public String index() {
        return "服务器维护中......";
    }
}