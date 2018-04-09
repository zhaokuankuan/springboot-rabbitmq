# springboot-rabbitmq
springboot集成rabbitmq消息队列，使用了四种不同的转发器与队列之间的绑定方法！

   交换机的功能主要是接收消息并且转发到绑定的队列，交换机不存储消息，在启用 ack 模式后，交换机找不到队列，会返回错误。
交换机有四种类型：**Direct**、**Topic**、**Headers** 和 **Fanout** 。

1.Direct：该类型的行为是“先匹配，再投送”，即在绑定时设定一个 routing_key，消息的routing_key 匹配时，才会被交换器投送到绑定的队列中去。

2.Topic：按规则转发消息（最灵活）。

3.Headers：设置 header attribute 参数类型的交换机。

4.Fanout：转发消息到所有绑定队列。
