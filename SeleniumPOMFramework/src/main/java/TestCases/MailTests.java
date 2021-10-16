package TestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import PageClasses.LandingPage;
import PageClasses.MoneyPage;
import PageClasses.RediffMailLoginPage;
import PageClasses.RediffMailPage;
import PageClasses.RediffMailSendPage;
import baseClasses.BaseTestClass;
import baseClasses.PageBaseClass;

public class MailTests extends BaseTestClass {
	//LandingPage landingPage;
	RediffMailPage rediffmailpage;
	
	@Test
	public void writeMailTest(){
		logger = report.createTest("Open Rediff Mail Test : " );

		invokeBrowser("chrome");
		PageBaseClass pageBase = new PageBaseClass(driver, logger);
		PageFactory.initElements(driver, pageBase);
		LandingPage rediffmailpage = pageBase.OpenApplication();
		waitLoad(2);
		RediffMailLoginPage redifmailloginpage = rediffmailpage.clickRediffMailLink();
		waitLoad(2);
		redifmailloginpage.clickusermailfield("rautmanoj721");
		redifmailloginpage.clickpasworldfield("Mraut@1234");
		RediffMailPage rmp;
		rmp=redifmailloginpage.clickSignInLink();
		
		//rediffmailpage= 
				//rediffmailpage.clickWriteMailBtn();
		rmp.clickWriteMailBtn();
		waitLoad(2);
		rmp.clickEnterEmailToSendTo("rautmanoj721@gamil.com");
		waitLoad(2);
		rmp.clickTypeSubject("Subject is Test");
		waitLoad(2);
		pageBase.switchframe(driver,"//iframe[@class='cke_wysiwyg_frame cke_reset']");
		rmp.clickTypeMsgTxtbox("Write Somthing  heare.....");
		pageBase.switchtodefualt();
		RediffMailSendPage rmsp;
		rmsp=rmp.clicksendMailBtn();
		
		//portfolioLoginPage = redifmailloginpage.clickSingInLink();
		
		//rediffmailpage =pageBase.clickRediffMailLink();
		
		
		
		/*LandingPage landingPage = new LandingPage();
		landingPage.getTitle();
		landingPage.openBrowser();
		landingPage.openWebSite();
		LoginPage loginPage = landingPage.clickSingIn();
		loginPage.getTitle();
		RediffMailPage rediffmailPage = loginPage.doLogin();
		rediffmailPage.getTitle();*/
	}

}
