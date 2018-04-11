package com.kk.email;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.thymeleaf.TemplateEngine;
import org.thymeleaf.context.Context;

import static org.junit.Assert.*;

/**
 * @author :Mr.kk
 * @date: 2018/4/11 - 14:51
 */
@SpringBootTest
@RunWith(SpringRunner.class)
public class MailServiceImplTest {

    @Autowired
    private MailService mailService;

    @Autowired
    private TemplateEngine templateEngine;


    @Test
    public void sendSimpleMail() {
        mailService.sendSimpleMail("zhaokk@yonyou.com","你好我是邮件名称！","我的第一封邮件！");
    }

    @Test
    public void testHtmlMail() throws Exception {
        for(int i =0;i <1000 ;i++){
            String content="<html>\n" +
                    "<body>\n" +
                    "    <h3>hello world ! 这是一封html邮件!</h3>\n" +
                    "</body>\n" +
                    "</html>";
            mailService.sendHtmlMail("linank@yonyou.com","这是一封HTML邮件",content+ i);
        }
    }

    @Test
    public void sendAttachmentsMail() {
        String filePath="E:\\tools\\赵宽宽.jpg";
        mailService.sendAttachmentsMail("zhaokk@yonyou.com", "主题：带附件的邮件", "啦啦啦！", filePath);
    }

    @Test
    public void sendInlineResourceMail() {
        String rscId = "neo006";
        String content="<html><body>这是有图片的邮件：<img src=\'cid:" + rscId + "\' ></body></html>";
        String imgPath = "E:\\tools\\赵宽宽.jpg";
        mailService.sendInlineResourceMail("zhaokk@yonyou.com", "主题：这是有图片的邮件", content, imgPath, rscId);
    }

    @Test
    public void sendTemplateMail() {
        //创建邮件正文
        Context context = new Context();
        context.setVariable("id", "006");
        String emailContent = templateEngine.process("emailTemplate", context);
        mailService.sendHtmlMail("zhaokk@yonyou.com","主题：这是模板邮件",emailContent);
    }
}