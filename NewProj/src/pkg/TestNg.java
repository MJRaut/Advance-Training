package pkg;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNg {
	
	@AfterTest
	public void add_cust12(){
		
		System.out.println("AfterTest");

	}
	
	@BeforeTest
	public void add_cust13(){
		
		System.out.println("BeforeTest");

	}
	
	@BeforeClass
	public void add_cust11(){
		
		System.out.println("BeforeClass");

	}
	
	@AfterClass
	public void add_cust10(){
		
		System.out.println("AfterClass");

	}
	
	@Test
	public void add_cust1(){
		
		System.out.println("      adding test here-1");

	}
	@Test
	public void add_cust2(){
		
		System.out.println("     adding test here-2");

	}
	@Test
	public void add_cust3(){
		
		System.out.println("      adding test here-3");

	}
	@Test(groups="Order")
	public void add_cust4(){
		
		System.out.println("      adding test here-4");

	}
	
	@BeforeMethod
	public void BM(){
		
		System.out.println("BeforeMethod");

	}
	
	
	@AfterMethod
	public void AM(){
		
		System.out.println("AfterMethod");

	}
	

}
