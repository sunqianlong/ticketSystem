package com.flyloong.ticketsystem.rpc;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TicketSystemRpcServiceApplication {
    private static final Logger LOGGER = LoggerFactory.getLogger(TicketSystemRpcServiceApplication.class);

    public static void main(String[] args) {
        LOGGER.info(">>>>> ticketsystem-rpc-service 正在启动 <<<<<");
        new ClassPathXmlApplicationContext("classpath:META-INF.spring/*.xml");
        LOGGER.info(">>>>> ticketsystem-rpc-service 启动完成 <<<<<");
    }
}
