package com.stn.accesslogconsumer.service;

import com.stn.accesslogconsumer.entity.AccessLog;
import com.stn.accesslogconsumer.repository.AccessLogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccessLogService {
    @Autowired
    private AccessLogRepository accessLogRepository;

    public void saveAccessLog(AccessLog accessLog) {
        this.accessLogRepository.save(accessLog);
        System.out.println("saved.");
    }
}
