package com.ddf.test.LoginTest;
//Author: XYZ

import java.io.IOException;
import java.util.Hashtable;

import com.ddf.utils.TestDataProvider;

import org.testng.annotations.AfterTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import com.ddf.base.BaseUI_v1;
import com.ddf.base.BaseUI_v2;
import com.ddf.base.BaseUI_v3;
import com.ddf.base.BaseUI_v4;
import com.ddf.base.BaseUI_v5;
import com.ddf.base.BaseUI_v6;
import com.ddf.utils.ExtentReportManager;

public class loginTest_v6 extends BaseUI_v6 {
	ExtentReports report=ExtentReportManager.getReportInstance();
	@Test(priority = 1, dataProvider="login")
	public void testOne(Hashtable<String, String> dataTable) throws InterruptedException, IOException {
		 logger = report.createTest("Test one");
		invokeBrowser("chrome");
		openURL("websiteURL");
		elementClick("signinBtn_Xpath");
		System.out.println("Username: dT.get(Username)"+dataTable.get("Username"));
		enterText("usernameTextbox_Xpath",dataTable.get("Username"));		
		enterText("passwordTextbox_Xpath",dataTable.get("password"));
		logger.log(Status.PASS,"Test case passed successfully");
		
		elementClick("submitLogingButton_Xpath");
		logger.log(Status.PASS,"Test case passed successfully");
		/*elementClick("createPFButton_Xpath");
		logger.log(Status.PASS,"Test case passed successfully");
		ClearTextField("createPFTextField_Xpath");
		enterText("createPFTextField_Xpath","My3rdPF");
		logger.log(Status.PASS,"Test case passed successfully");
		Thread.sleep(2000);
		elementClick("createPFConformButton_Xpath");
		logger.log(Status.PASS,"Test case passed successfully");
		Thread.sleep(2000);*/
		
		//Simulating failure below - its not actual failure 
		//also, image is dummy - we need to implement capturescreenshot function 
		//logger.log(Status.FAIL,"Test case failed");
		//logger.addScreenCaptureFromPath("D:\\worksoft\\screenshot_selenium.png");
		//takeScreenShotOnFailure();

		Thread.sleep(2000);
		//tearDown();
	}
	
	@Test(priority = 2, dataProvider="Portfolio")
	public void testOne_2(Hashtable<String, String> dataTable1) throws InterruptedException, IOException {
		 logger = report.createTest("Test two");
		
		elementClick("createPFButton_Xpath");
		logger.log(Status.PASS,"Test case passed successfully");
		ClearTextField("createPFTextField_Xpath");
		enterText("createPFTextField_Xpath",dataTable1.get("PF_Name"));
		logger.log(Status.PASS,"Test case passed successfully");
		Thread.sleep(2000);
		elementClick("createPFConformButton_Xpath");
		logger.log(Status.PASS,"Test case passed successfully");
		Thread.sleep(2000);
		
		//Simulating failure below - its not actual failure 
		//also, image is dummy - we need to implement capturescreenshot function 
		//logger.log(Status.FAIL,"Test case failed");
		//logger.addScreenCaptureFromPath("D:\\worksoft\\screenshot_selenium.png");
		//takeScreenShotOnFailure();

		Thread.sleep(2000);
		tearDown();
	}
	/*
	@Test
	public void testOne() throws InterruptedException, IOException {
		 logger = report.createTest("Test one");
		invokeBrowser("chrome");
		openURL("websiteURL");
		elementClick("signinBtn_Xpath");
		enterText("usernameTextbox_Xpath","U S E R N A M E");
		enterText("passwordTextbox_Id","l o n g - p a s s w o r d");
		logger.log(Status.PASS,"Test case passed successfully");
		
		//Simulating failure below - its not actual failure 
		//also, image is dummy - we need to implement capturescreenshot function 
		//logger.log(Status.FAIL,"Test case failed");
		//logger.addScreenCaptureFromPath("D:\\worksoft\\screenshot_selenium.png");
		//takeScreenShotOnFailure();

		Thread.sleep(2000);
		tearDown();
	}
	*/
	@AfterTest
	public void endReport() {
		report.flush();
	}
	
	//@Test(dependsOnMethods="testOne")
	public void testTwo() {
		invokeBrowser("chrome");
		openURL("websiteURL");
		
		//openURL("https://money.rediff.com/index.html");
		//test code to show next function usage - above code not changed to use properties file 
		tearDown();
	}
	
	//@Test(dependsOnMethods="testTwo")
	
	public void testThree() {
		invokeBrowser("chrome");
		//openURL("https://shopping.rediff.com/");
		//test code to show next function usage - above code not changed to use properties file
		tearDown();
	}
	
	//Below function not working at signin - need to check
	//@Test(dataProvider="getTestOneData")
		public void testOne_tryDP(Hashtable<String, String> dataTable) throws InterruptedException {
		//System.out.println(dataTable.get("Col1"));
		  //  logger = report.createTest("Enter UserName And Password in Rediff : " + dataTable.get("Col1"));
			invokeBrowser("chrome");
			openURL("websiteURL");
			elementClick("signinBtn_Xpath");
			//elementClick("signinBtn_Xpath");
			System.out.println("Username:"+dataTable.get("Username"));
			enterText("usernameTextbox_Xpath", dataTable.get("Username"));
			//System.out.println("Username:"+dataTable.get("Username"));
			Thread.sleep(2000);
			System.out.println("password:"+dataTable.get("password"));
			enterText("passwordTextbox_Xpath", dataTable.get("password"));		
			//System.out.println("password:"+dataTable.get("password"));
			Thread.sleep(2000);
			//openURL("submitLogingButton_Xpath");
			tearDown();
		}

	
	
	@DataProvider(name="login")
	public Object[][] getTestOneData(){
		return TestDataProvider.getTestData("TestData_Testmanagement.xlsx", "Feature 1", "Test Five");
	}
	
	@DataProvider(name="Portfolio")
	public Object[][] getTestOneData_2(){
		return TestDataProvider.getTestData("TestData_Testmanagement.xlsx", "Feature 2", "Test Six");
	}
}
