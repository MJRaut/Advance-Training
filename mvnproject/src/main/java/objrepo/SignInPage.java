package objrepo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignInPage {
	WebDriver localdriver;
	public SignInPage(WebDriver driver)
	{
		this.localdriver = driver;
	}

	@FindBy(xpath="//input[@id='useremail']")
	public WebElement email;
	
	@FindBy(xpath="//input[@id='userpass']")
	public WebElement passw;
	
	@FindBy(xpath="//input[@id='loginsubmit']")
	public WebElement submitbtn;
	
	
	public void enteremailid( String emailid) {
		email.sendKeys(emailid);
	}
	
	public void enterpassw( String pass) {
		passw.sendKeys(pass);
	}
	
	
	public PFpage clickNext() {
		submitbtn.click();
		
		//Signin_pwd_page signinpwd = new Signin_pwd_page(localdriver);
		PFpage portfolio = new PFpage(localdriver);
		PageFactory.initElements(localdriver, portfolio);
		return portfolio;
	}
	


}

