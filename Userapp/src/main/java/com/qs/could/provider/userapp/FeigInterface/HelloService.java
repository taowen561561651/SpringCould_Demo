package com.qs.could.provider.userapp.FeigInterface;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(value = "HELLO-SERVICE")
public interface HelloService {

    @GetMapping("/user/{name}")
    String getUser(@PathVariable String name);

}
