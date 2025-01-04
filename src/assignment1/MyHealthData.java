package assignment1;

/**
 * File name: MyHealthData
 * Name :Yen-Yi Hsu 041117561. 
 * Course: CST8284. 
 * Assignment: Assignment 1
 * Date:2024 Oct 17
 * Professor: Gustavo Adami. 
 * Purpose:This system maintains important health information about a patient. 
 * Class list:MyHealthDataBase, MyHealthDataTest, MyHealthData,MyHealthDataTest2 
 */

/**
 * 
 * This system maintains important health information about a patient. Note:
 * This class assumes values passed to the set methods are correct.
 * 
 * @author Yen-Yi Hsu
 * @version 1
 * @since jdk17.0.11_9
 * @see MyHealthData
 */

public class MyHealthData extends MyHealthDataBase {
	// 24F CST8284
	// Assignment 1: MyHealthData.java

	// This system maintains important health information about a patient.
	// Note: This class assumes values passed to the set methods are correct.
	// REVIEW THIS FILE AND ASSIGNMENT INSTRUCTIONS CAREFULLY BEFORE YOU START OFF!!
	// Remove unneeded comments when you are done. Clean code is better code.

	// TO DO 1: INCLUDE YOUR ATTRIBUTES HERE. REMEMBER TO CHECK THE UML CLASS
	// DIAGRAM TO INCLUDE ALL ATTRIBUTES LISTED AND THEIR TYPES.

	/**
	 * firstName component of the date of MyHealthData.
	 */
	private String firstName;
	/**
	 * lastName component of the date of MyHealthData.
	 */
	private String lastName;
	/**
	 * gender component of the date of MyHealthData.
	 */
	private String gender;
	/**
	 * birthYear component of the date of MyHealthData.
	 */
	private int birthYear;
	/**
	 * currentYear component of the date of MyHealthData.
	 */
	private int currentYear;
	/**
	 * height component of the date of MyHealthData.
	 */
	private double height;
	/**
	 * weight component of the date of MyHealthData.
	 */
	private double weight;
	// END CODE

	// TO DO 2: INCLUDE YOUR CONSTRUCTOR HERE
	// START CODE
	/**
	 * This constructor sets the First name, Last name ,Gender ,Height ,Weight ,and
	 * Year of Birth as parameters.
	 * 
	 * @param firstName   The firstName of this MyHealthData.
	 * @param lastName    The lastName of this MyHealthData.
	 * @param gender      The gender of this MyHealthData.
	 * @param birthYear   The birthYear of this MyHealthData.
	 * @param currentYear The currentYear of this MyHealthData.
	 * @param height      The height of this MyHealthData.
	 * @param weight      The weight of this MyHealthData.
	 * 
	 */
	public MyHealthData(String firstName, String lastName, String gender, int birthYear, int currentYear, double height,
			double weight) {

		this.firstName = firstName;
		this.lastName = lastName;
		this.gender = gender;
		this.birthYear = birthYear;
		this.currentYear = currentYear;
		this.height = height;
		this.weight = weight;
	}

	// END CODE

	// TO DO 3: INCLUDE YOUR SET AND GET METHODS HERE. CHECK THE UML CLASS TO ENSURE
	// ALL ARE COMPLETE.
	/**
	 * Returns the firstName for this MyHealthData
	 * 
	 * @return the firstName for this MyHealthData
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * Sets the firstName for this MyHealthData.
	 * 
	 * @param firstName The firstName for this MyHealthData.
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/**
	 * Returns the lastName for this MyHealthData
	 * 
	 * @return lastName The lastName for this MyHealthData
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * Sets the lastName for this MyHealthData.
	 * 
	 * @param lastName The lastName for this MyHealthData.
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	/**
	 * Returns the gender for this MyHealthData
	 * 
	 * @return the gender for this MyHealthData
	 */
	public String getGender() {
		return gender;
	}

	/**
	 * Sets the gender for this MyHealthData.
	 * 
	 * @param gender The gender for this MyHealthData.
	 */
	public void setGender(String gender) {
		this.gender = gender;
	}

	/**
	 * Returns the birthYear for this MyHealthData
	 * 
	 * @return the birthYear for this MyHealthData
	 */
	public int getBirthYear() {
		return birthYear;
	}

	/**
	 * Sets the birthYear for this MyHealthData.
	 * 
	 * @param birthYear The birthYear for this MyHealthData.
	 */
	public void setBirthYear(int birthYear) {
		this.birthYear = birthYear;
	}

	/**
	 * Returns the height for this MyHealthData
	 * 
	 * @return height The height for this MyHealthData
	 */
	public double getHeight() {
		return height;
	}

	/**
	 * Sets the height for this MyHealthData.
	 * 
	 * @param height The height for this MyHealthData.
	 */
	public void setHeight(double height) {
		this.height = height;
	}

	/**
	 * Returns the weight for this MyHealthData
	 * 
	 * @return weight The weight for this MyHealthData
	 */
	public double getWeight() {
		return weight;
	}

	/**
	 * Sets the weight for this MyHealthData.
	 * 
	 * @param weight The weight for this MyHealthData.
	 */
	public void setWeight(double weight) {
		this.weight = weight;
	}

	/**
	 * Returns the currentYear for this MyHealthData
	 * 
	 * @return currentYear The currentYear for this MyHealthData
	 */
	public int getCurrentYear() {
		return currentYear;
	}

	/**
	 * Returns the age for this MyHealthData
	 * 
	 * @return age The age for this MyHealthData
	 */
	@Override
	public int getAge() {
		return super.getAge();
		// int age = currentYear - birthYear;
		// return age;
	}

	// TO DO 4: THIS PORTION OF CODE SHOULD DISPLAY ALL THE PATIENT'S HEALTH DATA.
	// DO NOT MISS ANY DATA / INFORMATION

	/**
	 * Display a list of health information that the user prompts.
	 */
	public void displayMyHealthData() {

		// TO DO 5: YOU MUST USE System.out.printf TO SHOW ALL HEALTH DATA. DO NOT MISS
		// ANY ITEM.

		// START CODE
		System.out.println("Personal information");
		System.out.printf(
				"First Name:%s \nLast Name:%s \nGender: %s \nYear of Birth:%d \nheight:%.2f \nweight:%.2f \nAge:%d \n",
				firstName, lastName, gender, birthYear, height, weight, getAge());
		System.out.printf("Maximum Heart Rate: %.2f \n", MaximumHeartRate());
		System.out.printf("Minimum Target Heart Rate: %.2f \n", targetMiniTHR());
		System.out.printf("Maximum Target Heart Rate: %.2f \n", targetMaxiTHR());
		System.out.printf("Body Mass Index (BMI): %.2f \n", calculateBMI(weight, height));

		// END CODE

		// You do not need to modify this piece of code, it is fine as it is.

		System.out.println("BMI VALUES");
		System.out.println("Underweight: less than 18.5");
		System.out.println("Normal:      between 18.5 and 24.9");
		System.out.println("Overweight:  between 25 and 29.9");
		System.out.println("Obese:       30 or greater");
	}

} // end class MyHealthData
