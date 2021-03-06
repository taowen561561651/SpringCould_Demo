package com.ps.could.consumer.consumer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

//控制器
@RestController
public class HelloConterller {

    /**
     *
     * @param account 参数1
     * @param password 参数2
     * @return 具体的执行结果给调用者(消费者)
     */
    @GetMapping("/hello")
    public String hello(String account,String password){
        System.out.println("账号:"+account+"-------"+password);

        if ("墨染".equals(account) && "moran123".equals(password)){
            return "登录成功:"+account;
        }
        return "登录失败,账号或密码有误";
    }

    @GetMapping("/user/{name}")
    public String getUser(@PathVariable String name){
        return "Hello "+name;
    }
}