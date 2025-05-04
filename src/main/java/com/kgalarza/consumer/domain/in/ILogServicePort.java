package com.kgalarza.consumer.domain.in;

import com.kgalarza.consumer.domain.model.Log;

public interface ILogServicePort {

    public Log save(Log log);
}
