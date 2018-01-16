package com.ivg.demo.config;


import org.springframework.amqp.core.*;
import org.springframework.amqp.rabbit.config.SimpleRabbitListenerContainerFactory;
import org.springframework.amqp.rabbit.connection.CachingConnectionFactory;
import org.springframework.amqp.rabbit.connection.ConnectionFactory;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.amqp.support.converter.Jackson2JsonMessageConverter;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author: lj
 * @description:
 * @date: 11:25 2018/1/12
 */
@Configuration
public class AmqpConfig {

    @Value("${spring.rabbitmq.addresses}")
    private String addresses;
    @Value("${spring.rabbitmq.username}")
    private String username;
    @Value("${spring.rabbitmq.password}")
    private String password;
    @Value("${spring.rabbitmq.virtualhost}")
    private String virtualHost;
    @Value("${spring.rabbitmq.publisher-confirms}")
    private boolean publisherConfirms;

    @Bean
    public ConnectionFactory connectionFactory() {
        CachingConnectionFactory connectionFactory = new CachingConnectionFactory();
        connectionFactory.setAddresses(addresses);
        connectionFactory.setUsername(username);
        connectionFactory.setPassword(password);
        connectionFactory.setVirtualHost(virtualHost);
        /** 如果要进行消息回调，则这里必须要设置为true */
        connectionFactory.setPublisherConfirms(publisherConfirms);
        return connectionFactory;
    }


    @Bean
    public RabbitTemplate rabbitTemplate(){
       RabbitTemplate rabbitTemplate = new RabbitTemplate(connectionFactory());
       rabbitTemplate.setMessageConverter(new Jackson2JsonMessageConverter());
       return rabbitTemplate;
   }

   @Bean
   public SimpleRabbitListenerContainerFactory rabbitListenerContainerFactory() {
       SimpleRabbitListenerContainerFactory factory = new SimpleRabbitListenerContainerFactory();
       factory.setConnectionFactory(connectionFactory());
       factory.setMessageConverter(new Jackson2JsonMessageConverter());
       factory.setAcknowledgeMode(AcknowledgeMode.MANUAL);
       factory.setConcurrentConsumers(1);
       factory.setMaxConcurrentConsumers(1);
       factory.setPrefetchCount(1);
       return factory;
   }

    /************exchanges***********************/
    @Bean(name="exchange1")
    public DirectExchange exchange1(@Value("${rabbitmq.consumer.exchange}") String exchangeName){
        //auto_delete: 当所有绑定队列都不再使用时，是否自动删除该交换机。
        DirectExchange directExchange = new DirectExchange(exchangeName,true,false);
        return directExchange;
    }
    /************queues***********************/
    @Bean(name="queue1")
    public Queue queue1(@Value("${rabbitmq.consumer.queue}") String queueName){
        //exclusive: 仅创建者可以使用的私有队列，断开后自动删除。
        //auto_delete: 当所有消费客户端连接断开后，是否自动删除队列。
        Queue queue = new Queue(queueName,true,false,false);
        return queue;
    }
    @Bean(name="queue2")
    public Queue queue2(@Value("${rabbitmq.provider.queue}") String queueName){
        Queue queue = new Queue(queueName,true,false,false);
        return queue;
    }
    /************bindings***********************/
    @Bean
    Binding binding1(@Qualifier("queue1") Queue queue,
                     @Qualifier("exchange1") DirectExchange exchange,
                     @Value("${rabbitmq.consumer.routingkey}") String routingKey){
        Binding binding = BindingBuilder.bind(queue).to(exchange).with(routingKey);
        return binding;
    }
    @Bean
    Binding binding2(@Qualifier("queue2") Queue queue,
                     @Qualifier("exchange1") DirectExchange exchange,
                     @Value("${rabbitmq.provider.routingkey}") String routingKey){
        Binding binding = BindingBuilder.bind(queue).to(exchange).with(routingKey);
        return binding;
    }

}

