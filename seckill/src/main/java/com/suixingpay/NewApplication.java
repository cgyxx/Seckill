package com.suixingpay;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;

/**
 * @description:
 * @author: weishangqi<wei_sq @ suixingpay.com>
 * @date:2019/12/7 22:07
 */
@EnableAsync //开启线程池
@SpringBootApplication
public class NewApplication {
    public static void main(String[] args) {
        SpringApplication.run(NewApplication.class,args);   }
}
