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

        // Format the player name for the API URL
//        String formattedName = playerId.replace(" ", "%20");

        // Create the API URL for the player search
        String playerUrl = API_BASE_URL + "players/" + playerId;

        // Make the API request and parse the response
//        String jsonResponse = makeAPIRequest(playerUrl);
//        JSONObject responseObj = new JSONObject(jsonResponse);
//        JSONArray playerArray = responseObj.getJSONArray("data");

        // Get the first player in the search results (assume it's the correct player)
//        JSONObject playerObj = playerArray.getJSONObject(0);
//        int playerId = playerObj.getInt("id");
//
//        // Create the API URL for the player stats
//        String statsUrl = API_BASE_URL + "season_averages?player_ids[]=" + "237";

        RestTemplate rt = new RestTemplate();
        Player player = rt.getForEntity(playerUrl, Player.class).getBody();
        System.out.println(player);

        // Make the API request and parse the response
//        jsonResponse = makeAPIRequest(statsUrl);
//        responseObj = new JSONObject(jsonResponse);
//        JSONArray statsArray = responseObj.getJSONArray("data");
//
//        // Create a list of PlayerStats objects from the API response
//        List<PlayerSeasonAverages> playerStats = new ArrayList<>();
//        for (int i = 0; i < statsArray.length(); i++) {
//            JSONObject statsObj = statsArray.getJSONObject(i);
//            PlayerSeasonAverages stats = PlayerSeasonAverages.builder()
//                    .pts(statsObj.getDouble("pts"))
//                    .reb(statsObj.getDouble("reb"))
//                    .ast()
//                    .stl()
//                    .blk()
//                    .build();

//                    new PlayerSeasonAverages(
//                    statsObj.getDouble("pts"),
//                    statsObj.getDouble("reb"),
//                    statsObj.getDouble("ast"),
//                    statsObj.getDouble("stl"),
//                    statsObj.getDouble("blk"),
//                    statsObj.getDouble("fg_pct"),
//                    statsObj.getDouble("fg3_pct"),
//                    statsObj.getDouble("ft_pct")
//            );

//            playerStats.add(stats);
//        }

        return player;

    }

}
