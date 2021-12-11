package com.testdemo.com;

import org.testng.annotations.Test;

public class Grouping {
	@Test(groups = "male")
	private void employee() {
		System.out.println("muthu");
	}

	@Test(groups = "male")
	private void employee1() {
		System.out.println("deepak");
	}

	@Test(groups = "male")
	private void employee2() {
		System.out.println("naveen");
	}

	@Test
	private void employee3() {
		System.out.println("preethi");
	}

	@Test
	private void employee4() {
		System.out.println("nandhini");
	}

	@Test
	private void employee5() {
		System.out.println("gayathri");
	}

}
