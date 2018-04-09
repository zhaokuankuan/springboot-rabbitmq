package com.kk.controller;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * @author :Mr.kk
 * @date: 2018/4/6 - 15:00
 */
@Component
@RabbitListener(queues = "topic.message")
public class TopicReceiverI {

    @RabbitHandler
    public void receiver(String aa){
        System.out.println("Topic Receiver1  : " + aa);
    }

}
