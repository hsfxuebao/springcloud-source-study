package com.hsf.gateway.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author hsfxuebao
 * Created on 2022-11-18
 */
@RequestMapping("/test")
@RestController
public class TestController {


    @GetMapping("/testOk")
    public String testOk(@RequestParam long id) {

        return "testOk()" + id;
    }

}
