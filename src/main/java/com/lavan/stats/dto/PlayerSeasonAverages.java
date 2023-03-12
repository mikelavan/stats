package com.lavan.stats.dto;


import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class PlayerSeasonAverages {
    private int id;
    private String first_name;
    private String lastName;
    private double pts;
    private double reb;
    private double ast;
    private double stl;
    private double blk;
    private double turnover;
    private double fg_pct;
    private double fg3_pct;
    private double ft_pct;
}
