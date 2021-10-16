package objrepo;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LandingPage1 {
	
	WebDriver localdriver;


	public LandingPage1(WebDriver driver)
	{
		this.localdriver = driver;
		
	}
	
	@FindBy(xpath="//a[contains(text(),'Sign In')]")
	public WebElement singin;

	public SignInPage clickNext() {
		singin.click();
		
		//Signin_pwd_page signinpwd = new Signin_pwd_page(localdriver);
		SignInPage signinpage = new SignInPage(localdriver);
		PageFactory.initElements(localdriver, signinpage);
		return signinpage;
	}
	
}
