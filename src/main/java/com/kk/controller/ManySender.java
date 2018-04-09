package com.kk.controller;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author :Mr.kk
 * @date: 2018/4/6 - 13:19
 */
@Component
public class ManySender {
    @Autowired
    private AmqpTemplate amqpTemplate;

    public void send1(int i){
        String context = "Send1 : ===========" + i;
        //System.out.println(context);
        amqpTemplate.convertAndSend("send",context);
    }

    public void send2(int i){
        String context = "Send2 : ===========" + i;
        //System.out.println(context);
        amqpTemplate.convertAndSend("send",context);
    }
}
