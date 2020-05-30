package com.xcodeassociated.events.model.v1;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.xcodeassociated.events.converter.BlankValueConverter;
import com.xcodeassociated.events.model.EventData;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;


@Data
@Builder(toBuilder = true)
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
public class SampleDataEventV1 extends EventData {
    @JsonDeserialize(converter = BlankValueConverter.class)
    @JsonProperty(value = "payload", required = true)
    private String payload;
}
