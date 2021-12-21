package cn.dbdj1201.small.gateway;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: yz1201
 * @Date: 2021/7/14 15:46
 */
@RestController
@RequestMapping("/hello")
public class HelloController {


    @GetMapping(value = "/test")
    public String test(){
        System.out.println("test hello");
        return "test";
    }

}
