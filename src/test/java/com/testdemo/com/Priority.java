package com.testdemo.com;

import org.testng.annotations.Test;

public class Priority {
	@Test(priority = -2)
	private void openfb() {
		System.out.println("fb");
	}

	@Test(priority = -1)
	private void createid() {
		System.out.println("clickon new id");
	}

	@Test(priority = 0)
	private void username() {
		System.out.println("firstname");
	}

	@Test(priority = 1)
	private void passwored() {
		System.out.println("pass");
	}

	@Test(priority = 2)
	private void signup() {
		System.out.println("signup");
	}

	@Test(priority = 3)
	private void verifymail() {
		System.out.println("verify");
	}

	@Test(priority = 4)
	private void signin() {
		System.err.println("login");
	}
}
