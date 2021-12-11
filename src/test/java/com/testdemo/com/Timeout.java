package com.testdemo.com;

import org.testng.annotations.Test;

public class Timeout {
	@Test(timeOut = 10000)
	private void wait1() throws InterruptedException {
		System.out.println("1");
		Thread.sleep(5000);
		System.out.println("2");
	}

}
