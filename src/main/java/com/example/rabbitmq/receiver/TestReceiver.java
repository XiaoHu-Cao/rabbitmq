/*
package com.example.rabbitmq.receiver;

import com.alibaba.druid.support.json.JSONUtils;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

*/
/**
 * @Author: caohuwei
 * @Date: 2019\9\20 0020
 *//*

@Component
public class TestReceiver {

    @RabbitListener(queues = "basicQueue")
    public void processDReceiver(Object str){
        System.out.println("接收到的消息--direct："+ JSONUtils.toJSONString(str));
    }

    @RabbitListener(queues = "logSystemQueue")
    public void processTReceiver(Object str){
        System.out.println("接收到的消息--topic："+ JSONUtils.toJSONString(str));
    }
}
*/
