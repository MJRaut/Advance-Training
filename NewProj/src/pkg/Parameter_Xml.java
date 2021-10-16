package pkg;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameter_Xml {
	
	@Parameters({"URL"})
	@Test(priority=-1)
	public void checkParameter(String url) {
		
		System.out.println("Test run: "+url);
	}
	
	@Test(priority=0)  
	@Parameters({"a","b"})  
	public void add(int c, int d)  
	{  
	int mul=c*d;  
	System.out.println("Multiplication of two numbers : "+mul);  
	}  
	

}
