package com.stn.accesslogconsumer.repository.base;

import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.data.repository.PagingAndSortingRepository;

@NoRepositoryBean
public interface AppRepository<U, Y> extends PagingAndSortingRepository<U, Long> {
}
