package com.lbrce.csedevops;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.lbece.csedevops.UserValidation;

public class UserValidationTest {
	UserValidation uv=new UserValidation();
	@Test
	public void testCase1()
	{
		Assert.assertEquals(true,uv.check("usha","usha@2020"));
	}
	@Test
	public void testCase2()
	{
		Assert.assertEquals(true,uv.check("ushaB","ushaB@2020"));
	}
	@Test
	public void testCase3()
	{
		Assert.assertEquals(false,uv.check("ushabajjuri","ushabajjuri@2020"));
	}
}
