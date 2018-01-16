package com.ivg.comp.mq;

import com.rabbitmq.client.Channel;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.messaging.handler.annotation.Header;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;

/**
 * @author: lj
 * @description:
 * @date: 17:01 2018/1/12
 */
@Service
@RabbitListener(queues = {"${rabbitmq.provider.queue}","${rabbitmq.consumer.queue}"})
public class RabbitMqConsume2 {

    @RabbitHandler
    public void process(@Payload String message, @Header("amqp_deliveryTag") long deliveryTag,Channel channel){
        try {
            System.out.println(message);

            channel.basicAck(deliveryTag, false);
        }catch (Exception e){

        }
    }


}
