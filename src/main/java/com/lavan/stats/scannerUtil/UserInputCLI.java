package com.lavan.stats.scannerUtil;

import com.lavan.stats.service.NBAPlayerStatsAPIService;

import java.util.Scanner;

public class UserInputCLI {

    private static Scanner scanner = new Scanner(System.in);
    boolean continueLoop = true;

    public String getUserInput() throws Exception {


        while (continueLoop) {
            System.out.print("Enter the Id of the NBA player: ");
            String playerId = scanner.nextLine();

            if (playerId.equalsIgnoreCase("exit")) {
                continueLoop = false;
                System.out.println("Closing Scanner...");
                scanner.close();
            } else {

                NBAPlayerStatsAPIService s = new NBAPlayerStatsAPIService();
                s.getCurrentSeasonStats(playerId);

            }
        }
        return null;
    }

}
