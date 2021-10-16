package mvn.mvnproject;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OLD_LandingPage {
	
	WebDriver localdriver;


	public OLD_LandingPage(WebDriver driver)
	{
		this.localdriver = driver;
		
	}
	
	@FindBy(xpath="//a[contains(text(),'Sign In')]")
	public WebElement singin;
	

	
	public void clickTerms() {
		singin.click();
	}
	
	public SigninEmailPage clickNext() {
		singin.click();
		
		//Signin_pwd_page signinpwd = new Signin_pwd_page(localdriver);
		SigninEmailPage signinunable = new SigninEmailPage(localdriver);
		PageFactory.initElements(localdriver, signinunable);
		return signinunable;
	}
	
}
