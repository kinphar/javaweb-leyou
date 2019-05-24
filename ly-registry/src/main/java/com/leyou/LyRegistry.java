package com.leyou;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @ Author     : dqf
 * @ Date       : Create in 01:29 2019-05-25
 * @ Modified By: xxx
 */

@EnableEurekaServer
@SpringBootApplication
public class LyRegistry {
    public static void main(String[] args) {
        SpringApplication.run(LyRegistry.class);
    }
}
