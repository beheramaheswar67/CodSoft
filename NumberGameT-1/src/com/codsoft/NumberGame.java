package com.codsoft;

import java.util.Scanner;

public class NumberGame {
	public static void main(String[] args) {

		System.out.println("***WELCOME TO NUMBER GAME***");
		Scanner sc = new Scanner(System.in);

		boolean PlayAgain = true;
		int totalScore = 0;

		while (PlayAgain) {

			Game game = new Game();
			boolean GameOver = false;

			while (!GameOver) {
				game.TakeInput();
				GameOver = game.isCorrect();
			}

			totalScore = game.getScore();

			System.out.println("Do you want to Play Again? (yes/no)");
			String play = sc.next();
			
			if (!play.equalsIgnoreCase("yes")) {
				PlayAgain = false;
			}

		}
		System.out.println("Your Total Score is: " + totalScore);
		System.out.println("Thanks for playing ");
	}
}
