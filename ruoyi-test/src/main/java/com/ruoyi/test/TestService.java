package com.ruoyi.test;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Service;
import org.springframework.test.context.ContextConfiguration;

@Service

public class TestService {
    public String helloTest()
    {
        System.out.println("hello");
        return "hello";
    }
}
