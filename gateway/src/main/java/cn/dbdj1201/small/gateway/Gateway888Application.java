package cn.dbdj1201.small.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @Author: yz1201
 * @Date: 2021/4/29 22:30
 */

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
@EnableDiscoveryClient
public class Gateway888Application {

    public static void main(String[] args) {
        SpringApplication.run(Gateway888Application.class, args);
    }
}
