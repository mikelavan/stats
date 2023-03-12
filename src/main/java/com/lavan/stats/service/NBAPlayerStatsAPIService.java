package com.lavan.stats.service;

import com.lavan.stats.dto.PlayerSeasonAverages;
import com.lavan.stats.model.Player;
import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

@Service
public class NBAPlayerStatsAPIService {

    private static final String API_BASE_URL = "https://www.balldontlie.io/api/v1/";

    public Player getCurrentSeasonStats(String playerId) throws Exception {

        String playerUrl = API_BASE_URL + "players/" + playerId;


        RestTemplate rt = new RestTemplate();
        try {
            Player player = rt.getForEntity(playerUrl, Player.class).getBody();
            System.out.println(player);
            return player;


        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }



    }

}
