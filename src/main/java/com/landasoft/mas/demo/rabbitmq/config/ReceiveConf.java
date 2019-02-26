/**
 * <p>Title: ReceiveConf.java</p>  
 * <p>Description: </p>  
 * <p>Copyright: Copyright (c) 2019</p>  
 * <p>Company: www.landasoft.com</p>  
 * @author wulinyun  
 * @date 2019年2月25日 下午1:57:56 
 * @version 1.0  
 */
package com.landasoft.mas.demo.rabbitmq.config;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.amqp.rabbit.annotation.RabbitListener;


/**
 * <p>Title: ReceiveConf</p>  
 * <p>Description: </p>  
 * @author wulinyun  
 * @date 2019年2月25日 下午1:57:56
 */
public class ReceiveConf {
	private final static Log logger = LogFactory.getLog(ReceiveConf.class);
	public final static String ROUTINGKEY="DIRECT_QUEUE";
	@RabbitListener(queues=ReceiveConf.ROUTINGKEY)
	public void processC(String str) {
		logger.info("Receive:"+str);
	}
}
