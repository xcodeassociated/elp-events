package com.xcodeassociated.events.service;

import com.xcodeassociated.events.model.EventData;
import com.xcodeassociated.events.model.KafkaEvent;
import com.xcodeassociated.events.model.KafkaEventType;
import com.xcodeassociated.events.model.v1.SampleDataEventV1;

public class KafkaEventFactory {

    private KafkaEventFactory() {
        throw new IllegalStateException("IllegalStateException should not be instantiated");
    }

    public static KafkaEvent kafkaEvent(SampleDataEventV1 event, String systemId) {
        return newKafkaEvent(KafkaEventType.SAMPLE_DATA, systemId, 1, event);
    }

    private static KafkaEvent newKafkaEvent(KafkaEventType eventType, String systemId, Integer version, EventData eventData) {
        return KafkaEvent.builder()
              .ts(System.currentTimeMillis())
              .type(eventType)
              .src(systemId)
              .version(version)
              .data(eventData)
              .build();
    }


}
