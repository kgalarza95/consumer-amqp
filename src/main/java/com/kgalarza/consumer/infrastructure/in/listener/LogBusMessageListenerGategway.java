package com.kgalarza.consumer.infrastructure.in.listener;

import com.kgalarza.consumer.domain.in.IBusMessageListenerPort;
import com.kgalarza.consumer.domain.in.ILogServicePort;
import com.kgalarza.consumer.domain.model.Log;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Component
public class LogBusMessageListenerGategway implements IBusMessageListenerPort {

    private final ILogServicePort logServicePort;

    public LogBusMessageListenerGategway(ILogServicePort logServicePort) {
        this.logServicePort = logServicePort;
    }

    @Override
    @RabbitListener(queues = "${amqp.queue.log}")
    public void receiveMessage(String message) {
        logServicePort.save(new Log(message, LocalDateTime.now()));
    }
}
