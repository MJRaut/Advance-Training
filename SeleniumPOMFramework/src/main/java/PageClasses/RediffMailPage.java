package PageClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import baseClasses.PageBaseClass;

public class RediffMailPage extends PageBaseClass {

	public RediffMailPage(WebDriver driver, ExtentTest logger) {
		super(driver, logger);
		
	}
	@FindBy(xpath = "//li[@class='rd_write']")
	public WebElement writeMailBtn;

	@FindBy(xpath = "//input[starts-with(@id,'TO_ID')]")
	public WebElement enterSendToEmail_TextBox;
	
	@FindBy(xpath = "//li[@class='fld_sub']/input[1]")
	public WebElement typeSubject_TextBox;
	
	@FindBy(xpath= "//body")
	public WebElement typeMessage_TextBox;
	
	@FindBy(xpath = "//a[@class='send_ng_compo rd_btn_cmp_send']")
	public WebElement sendMailBtn;
	//iframe[@class='cke_wysiwyg_frame.cke_reset']
	
public void clickWriteMailBtn(){
		
		try {
			writeMailBtn.click();
			logger.log(Status.PASS, "Clicked the Stock purchase Calendar");
		} catch (Exception e) {
			reportFail(e.getMessage());
		}
	}

public void clickEnterEmailToSendTo(String EnterEmail){
		
		try {
			enterSendToEmail_TextBox.sendKeys(EnterEmail);
			logger.log(Status.PASS, "Clicked the Stock purchase Calendar");
		} catch (Exception e) {
			reportFail(e.getMessage());
		}
	}
public void clickTypeSubject(String Entersubject){
	
	try {
		typeSubject_TextBox.sendKeys(Entersubject);
		logger.log(Status.PASS, "Clicked the Stock purchase Calendar");
	} catch (Exception e) {
		reportFail(e.getMessage());
	}
}
public void clickTypeMsgTxtbox(String EnterMsg){
	
	try {
		typeMessage_TextBox.sendKeys(EnterMsg);
		logger.log(Status.PASS, "Clicked the Stock purchase Calendar");
	} catch (Exception e) {
		reportFail(e.getMessage());
	}
}
public RediffMailSendPage clicksendMailBtn() {
	logger.log(Status.INFO, "Clicking the Sing-In Link");
	sendMailBtn.click();
	logger.log(Status.PASS, "Clicked the Sing-In Link");
	RediffMailSendPage rediffmailsendpage = new RediffMailSendPage(driver, logger);
	PageFactory.initElements(driver, rediffmailsendpage);
	return rediffmailsendpage;


}

}
