package com.kk.controller;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * @author :Mr.kk
 * @time: 2018/4/6 - 12:02
 */
@Component
@RabbitListener(queues = "hello")
public class HelloRecieve {
    @RabbitHandler
    public void receiver(String hello){
        System.out.println("Receiver  : " + hello);
    }

}
