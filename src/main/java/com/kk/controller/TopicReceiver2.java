package com.kk.controller;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * @author :Mr.kk
 * @date: 2018/4/6 - 15:03
 */
@Component
@RabbitListener(queues = "topic.messages")
public class TopicReceiver2 {

    @RabbitHandler
    public void receiverTopic2(String aa){
        System.out.println("Topic Receiver2  : " + aa);
    }
}
