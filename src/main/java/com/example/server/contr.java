package com.example.server;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class contr {


    @RequestMapping("api/rest")
    public String he(String name) throws InterruptedException {
      Thread.sleep(18000);
        System.out.println("hello"+name);
        return "";
    }
}
