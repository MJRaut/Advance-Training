package pkg;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Tryassert {
	@Test
	public void assertcheck() {
		String act = "Google";
		String act1 = "Google";
		//System.out.println("Below assert would fail - ");
		Assert.assertEquals(act, act1);
	}
	

}
