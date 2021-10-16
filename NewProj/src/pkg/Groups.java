package pkg;

import org.testng.annotations.Test;

public class Groups {

	
		@Test(groups="Order")
		public void add_cust1(){
			
			System.out.println("      adding test here-1");

		}
		@Test(groups="Order")
		public void add_cust2(){
			
			System.out.println("     adding test here-2");

		}
		@Test(groups="Order")
		public void add_cust3(){
			
			System.out.println("      adding test here-3");

		}
		@Test
		public void add_cust4(){
			
			System.out.println("      adding test here-4");

		}
	

}
