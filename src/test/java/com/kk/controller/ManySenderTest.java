package com.kk.controller;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

/**
 * @author :Mr.kk
 * @date: 2018/4/6 - 13:24
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class ManySenderTest {

    @Autowired
    private  ManySender manySender;

    @Test
    public void send1() throws InterruptedException {
        for (int i =0 ;i < 100 ;i ++ ){
            manySender.send1(i);
            manySender.send2(i);
        }
        Thread.sleep(1000);
    }


}