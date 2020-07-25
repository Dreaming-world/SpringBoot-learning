package com.example.demo.controller;

import com.example.demo.dto.GetEsConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author liuxiangfeng
 */

@RestController
public class IndexController {

    @Autowired
    private GetEsConfig getEsConfig;

    @RequestMapping(method = RequestMethod.GET, value = "/index")
    public String index() {
        System.out.println(getEsConfig);
        return "hello word";
    }
}
