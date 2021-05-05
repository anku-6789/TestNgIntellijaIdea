package Test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class day3 {

	@Test
	public  void WebLogin (){
		// TODO Auto-generated method stub

		System.out.println("WebLogin");
		
	}
	
	@BeforeClass
	
	public void beforeclas()
	{
		System.out.println("always i am printing a before class");
	}
	
	@Test
	public  void MobileLogin (){
		// TODO Auto-generated method stub

		System.out.println("MobileLogin");
		
	}
	@BeforeMethod
	
	public void beforemethod()
	{
		System.out.println("i will always printed before method");
	}
	
@AfterMethod
	
	public void aftermethod()
	{
		System.out.println("i will always printed after every time pllzzzz ever");
	}
	@BeforeSuite
	
	public void beforesuite()
	{
		System.out.println("I am alway shero no 1");
	}
	@Test(enabled=false)
	public  void Mobilsignin (){
		// TODO Auto-generated method stub

		System.out.println("MobileLogin");
		
	}
	@Test
	public  void Mobilesignout (){
		// TODO Auto-generated method stub

		System.out.println("MobileLogin");
		
	}
	@Test
	public  void Mobiledashboard (){
		// TODO Auto-generated method stub

		System.out.println("MobileLogin");
		
	}
	@AfterClass
	public void afterclss()
	{
		System.out.println("always pringint after a class only so sad");
	}
	
	@Test (dependsOnMethods= {"WebLogin"})
	public  void LoginAPI (){
		// TODO Auto-generated method stub

		System.out.println("MobileLogin");
		
	}
	
	@DataProvider
	
	public Object[][] getdata ()
	{
		//1st combination= First username password  good crdit card history 
		//2nd combination=First username password    no credit card hsitory
		//3drdcombination=fraud credit card history
		Object [][]data = new Object[3][2];
		//1st set
			data[0][0]	="First username";
			data[0][1]	="passowrd";
		
		//columns are noting but values for that particular ombination
			//2nd set
			data[1][0]	="Secondusername";
		
			data[1][1]	="Secondpassowrd";
			
			
			//3rd data
			data[2][0]	="Thirdusername";
			
			data[2][1]	="Thirdpassowrd";
			return data;
			
	}
	
	
	
	

}
