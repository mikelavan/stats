package com.lavan.stats.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

@JsonDeserialize(builder = Team.TeamBuilder.class)
@Data
@Builder
public class Team {

    @JsonProperty
    private double id;
    @JsonProperty
    private String abbreviation;
    @JsonProperty
    private String city;
    @JsonProperty
    private String conference;
    @JsonProperty
    private String division;
    @JsonProperty
    private String full_name;
    @JsonProperty
    private String name;
}
