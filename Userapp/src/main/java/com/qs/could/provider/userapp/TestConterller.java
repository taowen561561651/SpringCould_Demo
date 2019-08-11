package com.qs.could.provider.userapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.websocket.server.PathParam;

//Conterller层
@RestController
public class TestConterller {

    @Autowired
    private RestTemplate restTemplate;


    /**
     *
     * @param account 参数1
     * @param password 参数2
     * @return 通过URL地址远程调用指定的服务
     * @HELLO-SERVICE 服务名称(到注册中心通过指定的服务名称连接指定的服务)
     * @hello 映射的方法如（@GetMapping("/hello")）执行服务中指定的方法
     * @Spring.class 传入参数的类型
     */

    @GetMapping("/login/{account}/{password}")
    public String login(@PathVariable String account , @PathVariable String password){
        System.out.println("account----"+account+"--password--"+password);
        return  restTemplate.getForObject("http://HELLO-SERVICE/hello?account="+account+"&password="+password,String.class);
    }


}