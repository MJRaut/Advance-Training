package pkg;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class InvokeMultipleBrowser {
	public WebDriver driver;
	@Parameters({"browser"})
	@BeforeMethod
	  public void setUp(String browser) throws InterruptedException {
		if(browser.equalsIgnoreCase("Chrome")) {
      		System.setProperty("webdriver.chrome.driver", "C:\\new\\ChromeDriver\\chromedriver.exe");
      		driver = new ChromeDriver();
      	 }else if(browser.equalsIgnoreCase("Firefox")) {
      		System.setProperty("webdriver.gecko.driver", "C:\\new\\geckodriver.exe");
      		driver = new FirefoxDriver();
      	 }else if(browser.equalsIgnoreCase("MicrosoftEdge")) {
      		System.setProperty("webdriver.edge.driver", "C:\\new\\edgedriver_win64\\msedgedriver.exe");
      		driver = new EdgeDriver();
      	 }else if(browser.equalsIgnoreCase("InternetExplorer")) {
      		System.setProperty("webdriver.ie.driver", "C:\\new\\IEDriverServer_x64_3.150.2\\IEDriverServer.exe");
      		driver = new InternetExplorerDriver();
      	 }
       
	  }
	@Test
  	public void search() throws InterruptedException{
			driver.get("https://www.practo.com/");
			driver.manage().window().maximize();
			Thread.sleep(2000);
        	driver.findElement(By.xpath("//input[@data-qa-id='omni-searchbox-keyword']")).sendKeys("Dentist");
        	Thread.sleep(2000);
        	driver.findElement(By.xpath("//input[@data-qa-id='omni-searchbox-keyword']")).sendKeys(Keys.ENTER);
        	Thread.sleep(2000);
        	
        	  
  	}
  	
  	@AfterMethod
  	public void Close(){
        	driver.quit();
  	}

}
