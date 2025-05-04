package com.kgalarza.consumer.infrastructure.out.persistencia.mapper;


import com.kgalarza.consumer.domain.model.Log;
import com.kgalarza.consumer.infrastructure.out.persistencia.entity.LogEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ILogRepositoryMapper {

    Log toDomain(LogEntity logEntity);

    LogEntity toEntity(Log log);
}
