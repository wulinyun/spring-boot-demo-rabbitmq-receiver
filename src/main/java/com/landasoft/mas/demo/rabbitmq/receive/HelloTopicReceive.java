/**
 * <p>Title: HelloReceive.java</p>  
 * <p>Description: </p>  
 * <p>Copyright: Copyright (c) 2019</p>  
 * <p>Company: www.landasoft.com</p>  
 * @author wulinyun  
 * @date 2019年2月25日 下午1:55:29 
 * @version 1.0  
 */
package com.landasoft.mas.demo.rabbitmq.receive;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

import com.landasoft.mas.demo.rabbitmq.bean.User;
import com.landasoft.mas.demo.rabbitmq.config.ReceiveConf;

/**
 * <p>Title: HelloReceive</p>  
 * <p>Description: topic方式接收</p>  
 * @author wulinyun  
 * @date 2019年2月25日 下午1:55:29
 */
@Component
public class HelloTopicReceive {
    private final static Log logger = LogFactory.getLog(HelloTopicReceive.class);
    @RabbitListener(queues="topic.message")    //监听器监听指定的Queue
    public void processC1(String str) {
        logger.info("Receive:"+str);
    }
   /* @RabbitListener(queues="topic.message")    //监听器监听指定的Queue
    public void processC1(User user) {
        logger.info("Receive:"+user);
    }*/
    @RabbitListener(queues="topic.messages")    //监听器监听指定的Queue
    public void processC2(String str) {
        logger.info("Receive:"+str);
    }
    /*@RabbitListener(queues="topic.messages")    //监听器监听指定的Queue
    public void processC2(User user) {
        logger.info("Receive:"+user);
    }*/
    
}
