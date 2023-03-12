package com.lavan.stats.service;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class PlayerService {
    public void getSeasonAverages() {
        try {
            // Define the URL for the API endpoint
            String url = "https://www.balldontlie.io/api/v1/season_averages?player_ids[]=237";
            // Create a new HTTP connection to the API endpoint
            HttpURLConnection conn = (HttpURLConnection) new URL(url).openConnection();
            conn.setRequestMethod("GET");
            // Read the response from the API
            BufferedReader in = new BufferedReader(new InputStreamReader(conn.getInputStream()));
            String inputLine;
            StringBuilder response = new StringBuilder();
            while ((inputLine = in.readLine()) != null) {
                response.append(inputLine);
            }
            in.close();
            // Parse the JSON response and extract Seth Curry's 3-point statistics
            String json = response.toString();
            // Output Leborn JSON to cnsole
            System.out.println("Lebron JSON");
            System.out.println(json);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

}
