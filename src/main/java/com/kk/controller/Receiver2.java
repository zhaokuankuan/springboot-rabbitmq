package com.kk.controller;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * @author :Mr.kk
 * @date: 2018/4/6 - 14:20
 */
@Component
@RabbitListener(queues = "send")
public class Receiver2 {
    @RabbitHandler
    public void receiver2(String send){
        System.out.println("Receiver2 : + " + send);
    }
}
