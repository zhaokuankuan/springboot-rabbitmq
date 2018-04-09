package com.kk.configure;

import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.core.TopicExchange;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


/**
 * @author :Mr.kk
 * @date: 2018/4/6 - 14:48
 */
@Configuration
public class TopicRabbitConfig {

    final  static String MESSAGE = "topic.message";
    final  static String MESSAGES = "topic.messages";
    final  static String TOPICEXCHANGE = "exchange";

    //创建队列或者去http:loacalhost:8080/15672 中自己加进去队列
    @Bean
    public Queue queueMessage(){
        return new Queue(MESSAGE);
    }

    @Bean
    public Queue queueMessages(){
        return new Queue(MESSAGES);
    }

    //创建交换机
    @Bean
    TopicExchange topicExchange(){
        return  new TopicExchange(TOPICEXCHANGE);
    }

    //将队列和交换机绑定在一起
    @Bean
    Binding bindingExchangeMessage(Queue queueMessage,TopicExchange topicExchange){
         return BindingBuilder.bind(queueMessage).to(topicExchange).with("topic.message");
    }

    //#号表示可以匹配多个单词   * 代表匹配一个单词
    @Bean
    Binding bindingExchangeMessages(Queue queueMessages,TopicExchange topicExchange){
        return  BindingBuilder.bind(queueMessages).to(topicExchange).with("topic.#");
    }


}
