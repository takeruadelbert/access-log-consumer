package com.stn.accesslogconsumer.entity;

import com.stn.accesslogconsumer.service.AccessLogService;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class AcessLogQueueConsumer {
    @Autowired
    private AccessLogService accessLogService;

    @RabbitListener(queues = {"${queue.access-log.name}"})
    public void receive(AccessLog accessLog) {
        this.accessLogService.saveAccessLog(accessLog);
    }
}
