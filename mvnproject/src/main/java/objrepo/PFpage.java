package objrepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PFpage {
	WebDriver localdriver;
	public PFpage(WebDriver driver)
	{
		this.localdriver = driver;
	}
	@FindBy(xpath="//a[@id='createPortfolio']")
	public WebElement CreatePF;
	
	@FindBy(xpath="//input[@id='create']")
	public WebElement Createtxtfield;
	
	@FindBy(xpath="//input[@id='createPortfolioButton']")
	public WebElement submitnewpf;
	
	@FindBy(xpath="//a[contains(text(),'Trends')]")
	public WebElement ClickOnTrends;
	
	public void ClickOnCreate( ) {
		CreatePF.click();
	}

	public void Cleartxt() {
		Createtxtfield.clear();
		
	}
	public void My1stPF(String Txt) {
		Createtxtfield.sendKeys(Txt);
		
	}

	public void SubmiCreatedPF() {
		submitnewpf.click();
		
	}
	public TrendsPage clickNext() {
		ClickOnTrends.click();
		
		//Signin_pwd_page signinpwd = new Signin_pwd_page(localdriver);
		TrendsPage trends = new TrendsPage(localdriver);
		PageFactory.initElements(localdriver, trends);
		return trends;
	}
}
