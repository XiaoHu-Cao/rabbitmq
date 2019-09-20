/*
package com.example.rabbitmq.config;

import com.rabbitmq.client.Channel;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.rabbit.core.ChannelAwareMessageListener;
import org.springframework.stereotype.Component;

*/
/**
 * @Author: caohuwei
 * @Date: 2019\6\13 001317:00
 *//*

@Component("userOrderListener")
public class UserOrderListener implements ChannelAwareMessageListener {

    private static  final Logger logger = LoggerFactory.getLogger(UserOrderListener.class);

    @Override
    public void onMessage(Message message, Channel channel) throws Exception {
        long tag = message.getMessageProperties().getDeliveryTag();
        try{
            byte[] body = message.getBody();
            String mobile = new String(body, "UTF-8");
            logger.info("抢单手机号码：{}",mobile);
            */
/**
             * 抢单业务逻辑，增减库存
             *//*

            channel.basicAck(tag,true);
        }catch (Exception e){
            logger.error("抢单异常：{}",e.fillInStackTrace());
            channel.basicAck(tag,false);
        }
    }
}
*/
