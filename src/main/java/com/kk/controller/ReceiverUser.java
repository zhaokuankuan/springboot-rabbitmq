package com.kk.controller;

import com.kk.common.User;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * @author :Mr.kk
 * @date: 2018/4/6 - 14:32
 */
@Component
@RabbitListener(queues = "user")
public class ReceiverUser {

    @RabbitHandler
    public void receiverUser(User user){
        System.out.println("receiveruser:========"+user.getUsername());
        System.out.println("receiveruser:========"+user.getPassword());
    }


}
