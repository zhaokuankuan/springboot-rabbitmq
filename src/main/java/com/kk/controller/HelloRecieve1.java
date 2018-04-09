package com.kk.controller;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * @author :Mr.kk
 * @date: 2018/4/6 - 13:09
 */
@Component
@RabbitListener(queues = "hello")
public class HelloRecieve1 {

    @RabbitHandler
    public void receiver2(String hello){
        System.out.println("Receiver2:================" + hello);
    }

}
