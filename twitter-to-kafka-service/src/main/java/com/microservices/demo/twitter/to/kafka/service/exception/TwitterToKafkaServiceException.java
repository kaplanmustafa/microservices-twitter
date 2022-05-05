package com.microservices.demo.twitter.to.kafka.service.exception;

public class TwitterToKafkaServiceException extends RuntimeException {

    public TwitterToKafkaServiceException() {
        super();
    }

    public TwitterToKafkaServiceException(String message) {
        super(message);
    }

    public TwitterToKafkaServiceException(String message, Throwable cause) {
        super(message, cause);
    }
}