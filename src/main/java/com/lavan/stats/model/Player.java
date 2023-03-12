package com.lavan.stats.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

@JsonDeserialize(builder = Player.PlayerBuilder.class)
@Data
@Builder
public class Player {

    @JsonProperty
    private double id;
    @JsonProperty
    private String first_name;
    @JsonProperty
    private String last_name;
    @JsonProperty
    private String position;
    @JsonProperty
    private double height_feet;
    @JsonProperty
    private double height_inches;
    @JsonProperty
    private double weight_pound;
    @JsonProperty
    private Team team;

}
