package com.ch.controller;





import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("controller")
public class controller01 {

    @RequestMapping("hello")
    public String  method01() {

        System.out.println("zhixingle ");
        return "success";

    }

}
