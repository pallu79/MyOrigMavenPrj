package com.java.test.ex;

import org.testng.Assert;

import org.testng.annotations.Test;

import com.java.ex.App;

public class AppTest{
	
	@Test
	public void testingfn()
	{
		App app=new App();
		Assert.assertEquals(app.getName(), "pallavi");
		System.out.println("my test running for third time");
		System.out.println("this is the orginal line");
		System.out.println("this the new line after original");
        System.out.println("added to crazy branch")
	}

	
}