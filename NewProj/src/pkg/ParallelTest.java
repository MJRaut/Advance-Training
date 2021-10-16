package pkg;

import org.testng.annotations.Test;

public class ParallelTest {
	@Test
	public void A_Test() throws InterruptedException{
		long id = Thread.currentThread().getId();
		System.out.println("A thread id: "+id);
		Thread.sleep(1000);

	}
	
	@Test
	public void B_Test() throws InterruptedException{
		long id = Thread.currentThread().getId();
		System.out.println("B thread id: "+id);
		Thread.sleep(1000);

	}
	
	@Test
	public void C_Test() throws InterruptedException{
		long id = Thread.currentThread().getId();
		System.out.println("C thread id: "+id);
		Thread.sleep(1000);

	}
	
	@Test
	public void D_Test() throws InterruptedException{
		long id = Thread.currentThread().getId();
		System.out.println("D thread id: "+id);
		Thread.sleep(1000);

	}
	
	@Test
	public void E_Test() throws InterruptedException{
		long id = Thread.currentThread().getId();
		System.out.println("E thread id: "+id);
		Thread.sleep(1000);

	}
	
	@Test
	public void F_Test() throws InterruptedException{
		long id = Thread.currentThread().getId();
		System.out.println("F thread id: "+id);
		Thread.sleep(1000);

	}
	
	@Test
	public void G_Test() throws InterruptedException{
		long id = Thread.currentThread().getId();
		System.out.println("G thread id: "+id);
		Thread.sleep(1000);

	}
	
	@Test
	public void H_Test() throws InterruptedException{
		long id = Thread.currentThread().getId();
		System.out.println("H thread id: "+id);
		Thread.sleep(1000);

	}
	
	@Test
	public void I_Test() throws InterruptedException{
		long id = Thread.currentThread().getId();
		System.out.println("I thread id: "+id);
		Thread.sleep(1000);

	}

}
