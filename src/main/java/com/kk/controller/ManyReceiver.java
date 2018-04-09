package com.kk.controller;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * @author :Mr.kk
 * @date: 2018/4/6 - 13:22
 */
@Component
@RabbitListener(queues = "send")
public class ManyReceiver {

    @RabbitHandler
    public void receiver1(String send){
        System.out.println("Receiver1 : + " + send);
    }

}
