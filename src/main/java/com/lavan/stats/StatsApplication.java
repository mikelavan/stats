package com.lavan.stats;

import com.lavan.stats.service.NBAPlayerStatsAPIService;
import com.lavan.stats.service.PlayerService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

@SpringBootApplication
public class StatsApplication {

	public static void main(String[] args) throws Exception {
		SpringApplication.run(StatsApplication.class, args);


		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the Id of the NBA player: ");
		String playerId = scanner.nextLine();

		while(scanner.hasNextLine()) {
			if (playerId.equals("exit")) {
				System.out.println("Closing Scanner...");
				scanner.close();
			} else {

				NBAPlayerStatsAPIService s = new NBAPlayerStatsAPIService();
				s.getCurrentSeasonStats(playerId);

			}
		}
	}

}