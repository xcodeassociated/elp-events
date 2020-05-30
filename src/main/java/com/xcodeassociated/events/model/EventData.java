package com.xcodeassociated.events.model;


import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.xcodeassociated.events.model.v1.SampleDataEventV1;
import lombok.EqualsAndHashCode;

@JsonTypeInfo(
      use = JsonTypeInfo.Id.NAME,
      property = "type"
)
@JsonSubTypes({
    @JsonSubTypes.Type(value = SampleDataEventV1.class, name = "SampleEventV1")
})
@EqualsAndHashCode
public abstract class EventData {

}
