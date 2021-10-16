package pkg;

import org.testng.annotations.Test;

public class DependsClass {
	@Test(dependsOnMethods= {"add_cust3","add_cust2"})
	public void add_cust1(){
		
		System.out.println("      adding test here-1");

	}
	@Test 
	public void add_cust2(){
		
		System.out.println("      adding test here-2");

	}
	@Test 
	public void add_cust3(){
		
		System.out.println("      adding test here-3");

	}
	@Test//(enabled=true)
	public void add_cust4(){
		
		System.out.println("      adding test here-4");

	}

}
