package assignment1;

import java.util.Scanner;

/**
 * File name: MyHealthDataTest
 * Name :Yen-Yi Hsu 041117561. 
 * Course: CST8284. 
 * Assignment: Assignment 1
 * Date:2024 Oct 17
 * Professor: Gustavo Adami. 
 * Purpose:This system maintains important health information about a patient. 
 * Class list:MyHealthDataBase, MyHealthDataTest, MyHealthData, MyHealthDataTest2 
 */

/**
 * This is the entry point for the application. This class is responsible for
 * handling the interface with the user , as well as instantiating a new
 * MyHealthData object to hold the data for each piece of data entered.
 *
 * @author Yen-Yi Hsu
 * @version 1
 * @since jdk17.0.11_9
 * @see MyHealthDataTest
 */
public class MyHealthDataTest {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String firstName, lastName, gender = "";
		int birthYear, currentYear;
		double height, weight;

		System.out.println("Please enter your first name:");
		firstName = input.nextLine();

		System.out.println("Please enter your last name:");
		lastName = input.nextLine();

		System.out.println("Please enter your gender (F for Female, M for Male)");
		boolean inputIsInvalid = true;
		while (inputIsInvalid) {
			gender = input.nextLine();
			if (gender.equalsIgnoreCase("M") || gender.equalsIgnoreCase("F")) {
				inputIsInvalid = false;
			} else {
				System.out.println("Please enter your gender (F for Female, M for Male)");
			}
		}

		System.out.println("Please enter your birth year:");
		birthYear = input.nextInt();

		System.out.println("Please enter current year:");
		currentYear = input.nextInt();

		System.out.println("Please enter the height (in inches) :");
		height = input.nextDouble();

		System.out.println("Please enter the weight (in pounds) ");
		weight = input.nextDouble();

		MyHealthData data = new MyHealthData(firstName, lastName, gender, birthYear, currentYear, height, weight);

		data.displayMyHealthData();

		input.close();
	}

}
