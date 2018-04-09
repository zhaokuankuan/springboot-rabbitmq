package com.kk.controller;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

/**
 * @author :Mr.kk
 * @date: 2018/4/6 - 14:34
 */

@RunWith(SpringRunner.class)
@SpringBootTest
public class SendUserTest {

    @Autowired
    private SendUser sendUser;

    @Test
    public void sendUser() {
        sendUser.sendUser();
    }
}