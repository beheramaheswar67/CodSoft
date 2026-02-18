package com.codsoft;
import java.util.Random;
import java.util.Scanner;


public class Game {
	int InputNumber;
	int Number;
	int Attempts=0;
	int LeftAttempts=5;
	int score = 0;
	Scanner sc = new Scanner(System.in);
	
	public int getAttempts() {
		return Attempts;
	}
	public void setAttempts(int attempts) {
		Attempts = attempts;
	}
	
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	
	Game(){
		Random rnd = new Random();
		this.Number=rnd.nextInt(100)+1;		
	}
	
	public void TakeInput() {
		System.out.print("\nEnter your Guess: ");
		InputNumber= sc.nextInt();	
	}
	
	boolean isCorrect() {
		
		Attempts++;
		LeftAttempts--;
		
		if(InputNumber==Number) {
			System.out.println("Yes you gussed it, It is: "+Number+" In Attempts of: "+Attempts);
			score += 10;
			return true;
		}
		
		if(LeftAttempts==0) {
			System.out.println("\nGame Over!!!");
			System.out.println("The correct number was: " + Number);
			System.out.println("Your Score is: "+ score);
			return true;
		}
		if (InputNumber<Number) {
			System.out.println("Too low..., You Have: "+LeftAttempts+" Attemptsleft.");
			return false;
			
		}else {
			System.out.println("Too hight..., You Have: "+LeftAttempts+" Attemptsleft.");	
		} 
		
		return false;
	}
	
	
}
