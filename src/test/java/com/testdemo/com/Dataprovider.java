package com.testdemo.com;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Dataprovider {
	@Test(dataProvider = "login credentials")
	private void userdetails(String name, String pass) {
System.out.println("username: "+name);
System.out.println("password:"+pass);
	}
	
	@DataProvider(name="login credentials")
	private Object[][] values() {
   return new Object[] [] {{"ram","1234"},{"siva","456"},{"vicky","789"}
	};

}
	@DataProvider(name="QA team")
	private Object[][] value1() {
   return new Object[] [] {{"deepak","129934"},{"rahul","45896"},{"karthi","78489"}
	};
}
}
