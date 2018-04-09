package com.kk.configure;

import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.FanoutExchange;
import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author :Mr.kk
 * @date: 2018/4/6 - 15:19
 */
@Configuration
public class FanoutRabbitConfig {

    //创建三个队列
    @Bean
    public Queue queueA(){
        return  new Queue("fanout.A");
    }
    @Bean
    public Queue queueB(){
        return  new Queue("fanout.B");
    }
    @Bean
    public Queue queueC(){
        return  new Queue("fanout.C");
    }

    //创建交换机
    @Bean
    FanoutExchange fanoutExchange(){
        return new FanoutExchange("fanoutExchange");
    }

    //分别进行绑定
    @Bean
    Binding bindingExchangeA(Queue queueA, FanoutExchange fanoutExchange) {
        return BindingBuilder.bind(queueA).to(fanoutExchange);
    }

    @Bean
    Binding bindingExchangeB(Queue queueB, FanoutExchange fanoutExchange) {
        return BindingBuilder.bind(queueB).to(fanoutExchange);
    }

    @Bean
    Binding bindingExchangeC(Queue queueC, FanoutExchange fanoutExchange) {
        return BindingBuilder.bind(queueC).to(fanoutExchange);
    }

}
