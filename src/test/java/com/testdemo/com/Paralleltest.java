package com.testdemo.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Paralleltest {
	@Test
	private void flipkart() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\nithe\\eclipse-workspace\\TestNG\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
	}

	@Test
	private void amazon() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\nithe\\eclipse-workspace\\TestNG\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
	}
}
