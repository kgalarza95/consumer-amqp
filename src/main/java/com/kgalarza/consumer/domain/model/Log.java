package com.kgalarza.consumer.domain.model;

import java.time.LocalDateTime;

public class Log {

    private String message;
    public LocalDateTime timestamp;

    public Log() {
    }

    public Log(String message, LocalDateTime timestamp) {
        this.message = message;
        this.timestamp = timestamp;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(LocalDateTime timestamp) {
        this.timestamp = timestamp;
    }
}
