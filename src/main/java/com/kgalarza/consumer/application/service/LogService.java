package com.kgalarza.consumer.application.service;

import com.kgalarza.consumer.domain.in.ILogServicePort;
import com.kgalarza.consumer.domain.model.Log;
import com.kgalarza.consumer.domain.out.ILogRepositoryPort;

public class LogService implements ILogServicePort {

    private final ILogRepositoryPort logRepositoryPort;

    public LogService(ILogRepositoryPort logRepositoryPort) {
        this.logRepositoryPort = logRepositoryPort;
    }

    @Override
    public Log save(Log log) {
        return logRepositoryPort.save(log);
    }
}
