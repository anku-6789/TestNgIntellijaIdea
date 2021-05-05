package Test;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class day1 {

	@Test(groups= {"smoke"})
	public  void demo() {
		// TODO Auto-generated method stub

		
		System.out.println("hello");
	}
	@AfterSuite
	public void affsuite()
	{
		System.out.println("i am always no 1 from last");
	}
	

	@Test(groups= {"smoke"})
	public void demo2()
	{
		System.out.println("TestNG working fine");
	}
	
	
	@AfterTest
	public void lastexecuton()
	{
		System.out.println("I will execute last");
	}
}