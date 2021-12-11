package com.testdemo.com;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class TestNG_Demo {
	@Test
	public void testA() {
		System.out.println("A");
	}
    //to run multiple times
	@Test(invocationCount = 8)
	public void testB() {
		System.out.println("B");
	}

    // to disable a method
	@Test(enabled = false)
	public void testC() {
		System.out.println("C");
	}

	// or
	@Ignore
	@Test
	public void testD() {
		System.out.println("D");
	}
	
	//depends on method
	@Test(dependsOnMethods = "testA")
	private void testE() {
System.out.println("E");
	}
}
