package com.codsoft;
import java.util.Scanner;

public class MainApp {

    public static void main(String[] args) {

        StudentManagementSystem sms = new StudentManagementSystem();
        Scanner sc = new Scanner(System.in);

        int choice;

        do {
            System.out.println("\n**** Student Management System ****");
            System.out.println("1. Add Student");
            System.out.println("2. Remove Student");
            System.out.println("3. Search Student");
            System.out.println("4. Display All Students");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter Roll Number: ");
                    int roll = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter Grade: ");
                    String grade = sc.nextLine();

                    Student student = new Student(name, roll, grade);
                    sms.addStudent(student);
                    break;

                case 2:
                    System.out.print("Enter Roll Number to remove: ");
                    int r = sc.nextInt();
                    sms.removeStudent(r);
                    break;

                case 3:
                    System.out.print("Enter Roll Number to search: ");
                    int sr = sc.nextInt();
                    sms.searchStudent(sr);
                    break;

                case 4:
                    sms.displayAllStudents();
                    break;

                case 5:
                    System.out.println("Thank you! Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice. Try again.");
            }

        } while (choice != 5);

        sc.close();
    }
}
