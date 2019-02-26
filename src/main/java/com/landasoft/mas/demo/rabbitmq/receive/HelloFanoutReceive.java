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
 * <p>Description: Fanout广播形式接收</p>  
 * @author wulinyun  
 * @date 2019年2月25日 下午1:55:29
 */
@Component
public class HelloFanoutReceive {
    private final static Log logger = LogFactory.getLog(HelloFanoutReceive.class);
    @RabbitListener(queues="fanout.A")    //监听器监听指定的Queue
    public void processA(String str) {
        logger.info("ReceiveA:"+str);
    }
    @RabbitListener(queues="fanout.B")    //监听器监听指定的Queue
    public void processB(String str) {
        logger.info("ReceiveB:"+str);
    }
    @RabbitListener(queues="fanout.C")    //监听器监听指定的Queue
    public void processC(String str) {
        logger.info("ReceiveC:"+str);
    }
    
}
