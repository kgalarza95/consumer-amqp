package com.kgalarza.consumer.infrastructure.out.persistencia.repository;

import com.kgalarza.consumer.infrastructure.out.persistencia.entity.LogEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ILogRepository extends JpaRepository<LogEntity, Long> {
}
