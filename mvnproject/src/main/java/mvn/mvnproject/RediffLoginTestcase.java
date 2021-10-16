package mvn.mvnproject;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import objrepo.LandingPage1;
import objrepo.SignInPage;
import objrepo.TrendsPage;
import objrepo.PFpage;



public class RediffLoginTestcase {
	
	//Signin_email_page emailpage;
	//Signin_pwd_page pwdpage;
	//LandingPage signinunable;
	
	
	@Test
	public void Login() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","C:\\new\\ChromeDriver\\chromedriver.exe");	
		WebDriver driver=new ChromeDriver();
		driver.get("https://money.rediff.com/index.html");
		
		LandingPage1 landingpage=new LandingPage1(driver);
		PageFactory.initElements(driver, landingpage);
		Thread.sleep(2000);
		SignInPage signinpage;		
		signinpage=landingpage.clickNext();
		signinpage.enteremailid("rautmanoj721@gmail.com");
		signinpage.enterpassw("wheretheheck");
		
		PFpage pfpage;
		pfpage=signinpage.clickNext();
		Thread.sleep(2000);
		pfpage.ClickOnCreate();
		pfpage.Cleartxt();
		pfpage.My1stPF("newPFher11");
		pfpage.SubmiCreatedPF();
		Thread.sleep(2000);
		TrendsPage trendspage;
		trendspage=pfpage.clickNext();

		System.out.println("End of code");
		
	}

}

