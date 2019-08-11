package com.qs.could.provider.userapp;

import com.qs.could.provider.userapp.FeigInterface.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Administrator
 */
@RestController
public class FeignController {


    @Autowired
    private HelloService helloService;

    /*@RequestMapping("/call")
    public String call(@RequestParam String name){
        return helloService.ts(name);
    }*/

    @GetMapping("/user/{name}")
    public String getUser(@PathVariable String name){
        System.out.println("helloService:"+helloService);
        return helloService.getUser(name);
    }


}