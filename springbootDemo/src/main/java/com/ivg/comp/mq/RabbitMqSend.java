package com.ivg.comp.mq;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.amqp.rabbit.support.CorrelationData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.UUID;

/**
 * 发送mq类
 *
 * @author wyw1464
 */
@Component
public class RabbitMqSend implements RabbitTemplate.ConfirmCallback {

    private static final Logger log = LoggerFactory.getLogger(RabbitMqSend.class);

    private RabbitTemplate rabbitTemplate;

    @Value("${rabbitmq.provider.routingkey}")
    private String routingkey1;

    @Value("${rabbitmq.consumer.exchange}")
    private String exchange;

    @Value("${rabbitmq.consumer.routingkey}")
    private String routingkey2;

    @Autowired
    public RabbitMqSend(RabbitTemplate rabbitTemplate) {
        this.rabbitTemplate = rabbitTemplate;
        rabbitTemplate.setConfirmCallback(this);// 最后设置内容
    }

    /**
     * 发送方法
     *
     * @param
     */
    public void sendMsg1(String msg) {
        CorrelationData correlationData = new CorrelationData(UUID.randomUUID().toString());
        rabbitTemplate.convertAndSend(exchange, routingkey1, msg, correlationData);
    }


    public void sendMsg2(String msg) {
        CorrelationData correlationData = new CorrelationData(UUID.randomUUID().toString());
        rabbitTemplate.convertAndSend(exchange, routingkey2, msg, correlationData);
    }

   /* public void sendMsg1(final StoreQueryDto dto) {
        CorrelationData correlationData = new CorrelationData(UUID.randomUUID().toString());
        rabbitTemplate.convertAndSend(exchange, routingkey1, dto, correlationData);
    }

    public void sendMsg2(final StoreQueryDto dto) {
        CorrelationData correlationData = new CorrelationData(UUID.randomUUID().toString());
        rabbitTemplate.convertAndSend(exchange, routingkey2, dto, correlationData);
    }*/

    /**
     * 将消息发送到mq server回调
     */
    @Override
    public void confirm(CorrelationData correlationData, boolean ack, String cause) {

        if (ack) {// 调用成功
            log.warn(correlationData.getId() + ":" + "发送成功.");
        } else {
            log.warn(correlationData.getId() + ":" + "发送失败.");
        }
    }

}
