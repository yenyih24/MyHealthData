/**
 * File name: MyHealthDataTest2
 * Name :Yen-Yi Hsu 041117561. 
 * Course: CST8284. 
 * Assignment: Assignment 1
 * Date:2024 Oct 17
 * Professor: Gustavo Adami. 
 * Purpose:This system maintains important health information about a patient. 
 * Class list:MyHealthDataBase, MyHealthDataTest, MyHealthData,MyHealthDataTest2 
 */

package assignment1;

import org.junit.Assert;
import org.junit.Test;

/**
 * 
 */
public class MyHealthDataTest2 {

	private static final double delta = 0.1;

	/**
	 * Test method for
	 * {@link assignment1.MyHealthDataBase#calculateBMI(double, double)}.
	 */
	@Test
	public void testCalculateBMI() {
		MyHealthData data = new MyHealthData("", "", "", 0, 0, 0, 0);
		Assert.assertEquals(25.82, data.calculateBMI(180, 70), delta);
	}

	/**
	 * Test method for
	 * {@link assignment1.MyHealthDataBase#incorrectBMI(double, double)}.
	 */
	@Test
	public void testIncorrectBMI() {
		MyHealthData data = new MyHealthData("", "", "", 0, 0, 0, 0);
		Assert.assertNotEquals(25.82, data.incorrectBMI(180, 70), delta);
	}

}
