package com.kk.controller;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * @author :Mr.kk
 * @time: 2018/4/6 - 12:00
 */
@Component
public class HelloSender {
    @Autowired
    private AmqpTemplate rabbitTemplate;

    public void send(int i){
        String context = "hello World ====================" + i;
        System.out.println("Sender:" + context);
        rabbitTemplate.convertAndSend("hello",context);
    }

}
