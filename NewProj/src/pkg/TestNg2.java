package pkg;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNg2 {
	@Test(groups="Order")
	public void add_cust(){
		
		System.out.println("adding test here");

	}
	@Test(groups="Order")
	public void add_cust19(){
		
		System.out.println("adding test here-19");

	}
	@Test(groups="Order")
	public void add_cust20(){
		
		System.out.println("adding test here-20");

	}
	@BeforeSuite
	public void add_cust15(){
		
		System.out.println("BeforeSuite");

	} 
	
	@AfterSuite
	public void add_cust16(){
		
		System.out.println("AfterSuite");

	}
	
	@BeforeTest
	public void add_cust17(){
		
		System.out.println("BeforeTest");

	}
	
	@AfterTest
	public void add_cust18(){
		
		System.out.println("AfterTest");

	}
}
