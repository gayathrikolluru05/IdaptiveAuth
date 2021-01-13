package com.example.demo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class Controller {

    @RequestMapping("/test")
    public void test() {
        //return "Hello World";
        System.out.println("Hello World");
        //ModelAndView model = new ModelAndView();
        //model.setViewName("admin");
        //return model;
    }

}

