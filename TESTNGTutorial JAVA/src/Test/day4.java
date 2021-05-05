package Test;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class day4 {

	@Test(dataProvider="getdata")
	public  void WebHOmeLogin (String name,String pwd){
		// TODO Auto-generated method stub

		System.out.println("WebHOmeLogin");
		System.out.println(name);
		System.out.println(pwd);
		
		
		
		
	}
	@Parameters({"URL","API"})
	@Test
	public  void MobileHOmeLogin (String urlname,String key){
		// TODO Auto-generated method stub

		System.out.println("MobileHOmeLogin");
		System.out.println(urlname);
		System.out.println(key);
		
	}
	
	
	@Test(groups= {"smoke"})
	public  void LoginHOmeAPI (){
		// TODO Auto-generated method stub

		System.out.println("MobileHOmeLogin");
		
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
