package mvn.mvnproject;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class mvnBrowser {
public WebDriver driver;
  	
  	@DataProvider(name = "SProvider")
  	public Object[][] dataProvFunc(){
        	return new Object[][]{
              	{"Dentist"},{"Dermatologist"}
        	};
  	}
  	
  	@BeforeMethod
  	  public void setUp() throws InterruptedException {
        	 
        	  System.out.println("Start test");
        	  System.setProperty("webdriver.chrome.driver", "C:\\new\\ChromeDriver\\chromedriver.exe");
        	  driver = new ChromeDriver();
        	  driver.get("https://www.practo.com/");
        	  driver.manage().window().maximize();
        	  Thread.sleep(2000);
        	 
  	  }

  	
  	@Test(dataProvider ="SProvider")
  	public void search(String keyWord) throws InterruptedException{
        	driver.findElement(By.xpath("//input[@data-qa-id='omni-searchbox-keyword']")).sendKeys(keyWord);
        	Thread.sleep(2000);
        	driver.findElement(By.xpath("//input[@data-qa-id='omni-searchbox-keyword']")).sendKeys(Keys.ENTER);
        	Thread.sleep(2000);
        	  
  	}
  	
  	@AfterMethod
  	public void Close(){
        	driver.close();
  	}

}
