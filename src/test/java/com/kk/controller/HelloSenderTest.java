package com.kk.controller;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

/**
 * @author :Mr.kk
 * @date: 2018/4/6 - 12:41
 *
 * rabbitMq 在一对多发送消息时会自动进行负载均衡的
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class HelloSenderTest {

    @Autowired
    private HelloSender helloSender;

    @Before
    public void setUp() throws Exception {
    }

    @Test
    public void send() throws InterruptedException {
        for (int i = 0;i < 100 ;i++ ){
            helloSender.send(i);
        }
        Thread.sleep(2000l);
    }
}