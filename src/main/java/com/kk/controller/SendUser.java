package com.kk.controller;

import com.kk.common.User;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author :Mr.kk
 * @date: 2018/4/6 - 14:29
 */
@Component
public class SendUser {

    @Autowired
    private AmqpTemplate amqpTemplate;

    public  void sendUser(){
        User user = new User("zhaokk","123456");
        amqpTemplate.convertAndSend("user",user);
    }

}
