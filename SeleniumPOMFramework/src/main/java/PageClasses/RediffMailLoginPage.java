package PageClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import baseClasses.PageBaseClass;

public class RediffMailLoginPage extends PageBaseClass {

	public RediffMailLoginPage(WebDriver driver, ExtentTest logger) {
		super(driver, logger);
		
	}
	@FindBy(id = "login1")
	public WebElement useremail_TextBox;

	@FindBy(id = "password")
	public WebElement password_TextBox;
	
	@FindBy(xpath= "//input[@class='signinbtn']")
	public WebElement signIn_button;
	
public void clickusermailfield(String Username){
		
		try {
			useremail_TextBox.sendKeys(Username);
			logger.log(Status.PASS, "Clicked the Stock purchase Calendar");
		} catch (Exception e) {
			reportFail(e.getMessage());
		}
	}


public void clickpasworldfield(String pass){
	
	try {
		password_TextBox.sendKeys(pass);
		logger.log(Status.PASS, "Clicked the Stock purchase Calendar");
	} catch (Exception e) {
		reportFail(e.getMessage());
	}
}
	public RediffMailPage clickSignInLink() {
		logger.log(Status.INFO, "Clicking the Sing-In Link");
		signIn_button.click();
		logger.log(Status.PASS, "Clicked the Sing-In Link");
		RediffMailPage rediffmailpage = new RediffMailPage(driver, logger);
		PageFactory.initElements(driver, rediffmailpage);
		return rediffmailpage;
	

}
}
