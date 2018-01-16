package com.ivg.comp.mq;

import org.springframework.stereotype.Component;

/**
 * @author: lj
 * @description:
 * @date: 17:01 2018/1/12
 */
@Component
public class RabbitMqConsume {

    /*@RabbitListener(queues = "${rabbitmq.consumer.queue}")
    public void receive(StoreQueryDto storeQueryDto) {
        System.out.println(storeQueryDto.getStatus());
    }

    @RabbitListener(queues = "${rabbitmq.provider.queue}")
    public void receive2(StoreQueryDto storeQueryDto) {
        System.out.println(storeQueryDto.getType());
    }*/



}
