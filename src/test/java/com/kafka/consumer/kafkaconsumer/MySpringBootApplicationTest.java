package com.kafka.consumer.kafkaconsumer;

import org.testng.Assert;
import org.testng.annotations.Test;

public class MySpringBootApplicationTest {

    @Test
    public void testHello() {
    	KafkaConsumerApplication app = new KafkaConsumerApplication();
        Assert.assertEquals(app.hello(), "Hello, Spring Boot!");
    }
}
