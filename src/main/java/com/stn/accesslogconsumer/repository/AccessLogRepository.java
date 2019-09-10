package com.stn.accesslogconsumer.repository;

import com.stn.accesslogconsumer.entity.AccessLog;
import com.stn.accesslogconsumer.repository.base.AppRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccessLogRepository extends AppRepository<AccessLog, Long> {
}
