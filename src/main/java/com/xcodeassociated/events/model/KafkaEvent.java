package com.xcodeassociated.events.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.jetbrains.annotations.NotNull;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class KafkaEvent {

    @NotNull
    @JsonProperty(value = "type", required = true)
    private KafkaEventType type;

    @NotNull
    @EqualsAndHashCode.Exclude
    @JsonProperty(value = "ts", required = true)
    private Long ts;

    @NotNull
    @JsonProperty(value = "version", required = true)
    private Integer version;

    @NotNull
    @JsonProperty(value = "src", required = true)
    private String src;

    @JsonProperty(value = "data")
    private EventData data;

}
