package com.example.rabbitmq.sender;

import com.example.rabbitmq.dto.User;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: caohuwei
 * @Date: 2019\9\20 0020
 */
@RestController
public class TestSender {

    @Autowired
    private Environment env;

    @Autowired
    private RabbitTemplate rabbitTemplate;

    @RequestMapping("/directSender")
    public void directSender(){
        rabbitTemplate.convertAndSend(env.getProperty("basic.info.mq.exchange.name"),env.getProperty("basic.info.mq.routing.key.name"),"简单的消息");

        User user = new User();
        user.setName("张三");
        user.setUserName("00000012345");
        rabbitTemplate.convertAndSend(env.getProperty("basic.info.mq.routing.key.name"),user);
    }

    @RequestMapping("/topicSender")
    public void topicSender(){
        rabbitTemplate.convertAndSend(env.getProperty("log.system.exchange.name"),"logSystemQueue","简单的消息--topic");
    }
}
