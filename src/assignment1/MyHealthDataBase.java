package assignment1;

/**
 * File name: MyHealthDataBase
 * Name :Yen-Yi Hsu 041117561. 
 * Course: CST8284. 
 * Assignment: Assignment 1.
 * Date:2024 Oct 10. 
 * Professor: Gustavo Adami. 
 * Class list:MyHealthDataBase, MyHealthDataTest, MyHealthData, MyHealthDataTest2 .
 */

/**
 * MyHealthDataBase is a base class to be extended for the Electronic Health
 * Records (EHR) System, also known as Assignment 1. It contains a method to
 * calculate BMI and will contain other methods.
 * 
 * @author Yen-Yi Hsu
 * @version 1.1
 * @since Java 1_8.301
 * @see MyHealthData
 */

public class MyHealthDataBase {

	/**
	 * This method returns the age for MyHealthDataBase
	 * 
	 * @return 0 for MyHealthDataBase
	 */
	public int getAge() {
		return 0;
	}

	/**
	 * This method returns the Maximum Heart Rate
	 * 
	 * @return MaxHeartRate for MyHealthDataBase
	 */
	public double MaximumHeartRate() {
		double MaxHeartRate = 220 - this.getAge();
		return MaxHeartRate;
	}

	/**
	 * This method returns the Minimum Target Heart Rate
	 * 
	 * @return miniTHR for MyHealthDataBase
	 */
	public double targetMiniTHR() {
		double miniTHR = MaximumHeartRate() * 0.5;

		return miniTHR;

	}

	/**
	 * This method returns the Maximum Target Heart Rate
	 * 
	 * @return maxiTHR for MyHealthDataBase
	 */

	public double targetMaxiTHR() {
		double maxiTHR = MaximumHeartRate() * 0.85;
		return maxiTHR;
	}

	/**
	 * This method returns the calculated Body Mass Index (BMI) from data provided.
	 * 
	 * @param weightParam Weight of the patient in pounds.
	 * @param heightParam Height of the patient in inches.
	 * @return weightParam * 703 / (heightParam * heightParam) the calculation of
	 *         BMI for MyHealthData.
	 */

	public double calculateBMI(double weightParam, double heightParam) {
		return weightParam * 703 / (heightParam * heightParam);
	}

	/**
	 * This method returns the calculated Body Mass Index (BMI) from data provided,
	 * but the calculate formulate was wrong.
	 * 
	 * @param weightParam Weight of the patient in pounds.
	 * @param heightParam Height of the patient in inches.
	 * @return weightParam * (heightParam * heightParam) the calculation of BMI for
	 *         MyHealthData.
	 */

	public double incorrectBMI(double weightParam, double heightParam) {
		return weightParam * (heightParam * heightParam);
	}

}
