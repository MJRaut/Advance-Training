package mvn.mvnproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SigninEmailPage {
	WebDriver localdriver;
	public SigninEmailPage(WebDriver driver)
	{
		this.localdriver = driver;
	}

	@FindBy(xpath="//input[@id='useremail']")
	public WebElement email;
	
	@FindBy(xpath="//input[@id='userpass']")
	public WebElement passw;
	
	@FindBy(xpath="//input[@id='loginsubmit']")
	public WebElement nextbtn;
	
	
	public void enteremailid( String emailid) {
		email.sendKeys(emailid);
	}
	
	public void enterpassw( String passw) {
		email.sendKeys(passw);
	}
	
	
	
	


}

