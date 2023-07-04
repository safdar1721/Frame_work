package Listener_Testng;

import static org.testng.Assert.fail;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Depend_Runnerclass {
	@Test
	public void test1()
	{
		System.out.println("hello india ");
	}
	@Test
	public void test2()
	{
		System.out.println("welcom to bangalore");
		Assert.fail();
	}
	@Test(dependsOnMethods = "test2")
	public void test3()
	{
		System.out.println("welcome to qspider");
	}

}
