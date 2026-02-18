package com.codsoft;

import java.util.Scanner;

public class GradeCalculator {

	public static void main(String[] args) {
		int sub;
		int ObtainMarks = 0;
		int FullMarks = 0;

		System.out.println("***WELCOME TO STUDENT GRADE CALCULATOR***");
		System.out.print("\nHow many subjects do you have?");

		Scanner sc = new Scanner(System.in);
		sub = sc.nextInt();

		for (int i = 1; i <= sub; i++) {
			System.out.print("Please enter marks for subject " + i + ":");
			int Obtain = sc.nextInt();
			ObtainMarks += Obtain;

			System.out.print("Please enter full marks for subject " + i + " : ");
			int fullMarks = sc.nextInt();
			FullMarks += fullMarks;
		}

		double Average = (ObtainMarks * 100) / FullMarks;

		System.out.println("\nTotal Obtain Marks is: " + ObtainMarks + " Out of: " + FullMarks);
		System.out.println("Average Percentage is: " + Average+"%");

		if (Average >= 90) {
			System.out.println("Grade= 'A1'");
		} else if (Average >= 80) {
			System.out.println("Grade= 'A2'");
		} else if (Average >= 70) {
			System.out.println("Grade= 'B1'");
		} else if (Average >= 60) {
			System.out.println("Grade= 'B2'");
		}else if (Average >= 45) {
			System.out.println("Grade= 'C'");
		}else if (Average >= 30) {
			System.out.println("Grade= 'D'");
		}else {
			System.out.println("Grade= 'D'");
		}
		
		System.out.println("\nThank you for using the student grade calculator.");

	}

}
