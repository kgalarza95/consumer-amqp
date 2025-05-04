package com.kgalarza.consumer.infrastructure.out.persistencia.adapter;

import com.kgalarza.consumer.domain.model.Log;
import com.kgalarza.consumer.domain.out.ILogRepositoryPort;
import com.kgalarza.consumer.infrastructure.out.persistencia.mapper.ILogRepositoryMapper;
import com.kgalarza.consumer.infrastructure.out.persistencia.repository.ILogRepository;
import org.springframework.stereotype.Component;

@Component
public class LogAdapter implements ILogRepositoryPort {

    private final ILogRepository logRepository;
    private final ILogRepositoryMapper logRepositoryMapper;

    public LogAdapter(ILogRepository logRepository, ILogRepositoryMapper logRepositoryMapper) {
        this.logRepository = logRepository;
        this.logRepositoryMapper = logRepositoryMapper;
    }

    @Override
    public Log save(Log log) {
        return logRepositoryMapper.toDomain(logRepository.save(logRepositoryMapper.toEntity(log)));
    }
}
