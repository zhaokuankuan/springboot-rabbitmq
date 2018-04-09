package com.kk.controller;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * @author :Mr.kk
 * @date: 2018/4/6 - 14:57
 */
@Component
public class TopicSend {
    @Autowired
    private AmqpTemplate amqpTemplate;

    public void sendMessage(){
        String context = "I am Message : " + new Date();
        amqpTemplate.convertAndSend("exchange","topic.message",context);
    }

    public void sendMessages(){
        String context = "I am Messages : " + new Date();
        amqpTemplate.convertAndSend("exchange","topic.messages",context);
    }


}
