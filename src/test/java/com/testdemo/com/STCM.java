package com.testdemo.com;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class STCM {
	@BeforeSuite
	private void getproperty() {
		System.out.println("driver");
	}

	@BeforeTest
	private void openbrowser() {
		System.out.println("chrome");
	}

	@BeforeClass
	private void geturl() {
		System.out.println("flipkart");
	}

	@BeforeMethod
	private void searchinflipkart() {
		System.out.println("iphone13");
	}
    @Test
	private void max() {
		System.out.println("1,50,000");
	}
    @Test
	private void pro() {
		System.out.println("1,20,000");
	}
    @Test
	private void mini() {
		System.out.println("78,000");
	}

	@AfterMethod
	private void logout() {
		System.out.println("logoff");
	}

	@AfterClass
	private void close() {
		System.out.println("quit");
	}

	@AfterTest
	private void verification() {
		System.out.println("verify");
	}

	@AfterSuite
	private void deletecookies() {
		System.out.println("delete");
	}
}
