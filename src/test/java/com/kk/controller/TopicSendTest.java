package com.kk.controller;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

/**
 * @author :Mr.kk
 * @date: 2018/4/6 - 15:05
 */
@SpringBootTest
@RunWith(SpringRunner.class)
public class TopicSendTest {

    @Autowired
    private TopicSend topicSend;

    @Test
    public void sendMessage() throws InterruptedException {
        topicSend.sendMessage();

        topicSend.sendMessages();
        Thread.sleep(1000);
    }
}