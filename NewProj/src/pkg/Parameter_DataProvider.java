package pkg;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
public class Parameter_DataProvider {
	@Test(dataProvider="SProvider")
	public void Test(String name, String state) throws InterruptedException {
		System.out.println("Name: "+name+"  Sate: "+state);
		Thread.sleep(1000);
	}
	
	@DataProvider(name="SProvider")
	public Object[][] getDataFromDataProvider(){
		return new Object[][]
		{ 
			{"Pankaj", "UP"},
			{"Ramesh", "MP"},
			{"Suresh", "Uk"},
			{"Paresh", "AP"}
		
	};
	}

}
