package com.hb.sellsystem.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by sigurHe
 * Date:2018/7/24.
 * Time:10:47.
 */
@RestController
public class TestController {


    @GetMapping("/test")
    public String test(){
        return "success!";
    }

}
