package com.lavan.stats;

import com.lavan.stats.scannerUtil.UserInputCLI;
import com.lavan.stats.service.NBAPlayerStatsAPIService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

@SpringBootApplication
public class StatsApplication {

	public static void main(String[] args) throws Exception {
		UserInputCLI userInputCLI = new UserInputCLI();
		String  input = userInputCLI.getUserInput();
	}

}


