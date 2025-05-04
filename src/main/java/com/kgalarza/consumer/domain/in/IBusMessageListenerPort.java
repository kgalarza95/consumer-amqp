package com.kgalarza.consumer.domain.in;

public interface IBusMessageListenerPort {

    public void receiveMessage(String message);
}
