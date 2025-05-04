package com.kgalarza.consumer.domain.out;

import com.kgalarza.consumer.domain.model.Log;

public interface ILogRepositoryPort {

    public Log save(Log log);
}
