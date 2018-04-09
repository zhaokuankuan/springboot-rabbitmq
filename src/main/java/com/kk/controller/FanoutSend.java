package com.kk.controller;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author :Mr.kk
 * @date: 2018/4/6 - 15:25
 */
@Component
public class FanoutSend {

    @Autowired
    private AmqpTemplate amqpTemplate;

    public void send(){
        String context = "hi, fanout msg ";
        System.out.println("Sender : " + context);
        amqpTemplate.convertAndSend("fanoutExchange","", context);
    }
}
