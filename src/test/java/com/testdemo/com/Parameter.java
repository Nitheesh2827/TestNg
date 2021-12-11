package com.testdemo.com;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameter {
	@Parameters({"name"})
	@Test
	private void username(@Optional("Muthu") String name) {
		System.out.println(" username " + name);
	}

	
	
}
