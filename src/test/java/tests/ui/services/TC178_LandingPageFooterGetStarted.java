package tests.ui.services;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import page.base.LoginPage;
import page.base.HomePage;
import com.force.base.ProjectHooks;


public class TC178_LandingPageFooterGetStarted extends ProjectHooks{
	
	@BeforeTest
	public void setReportValues() {
		testcaseName = "TC178 - Verification for Insights url";
		testDescription = "Verification for Insights url";
		authors = "Samanthasree";
	}
	
	@Test
	public void LandingPageFooterMenuInsights() throws InterruptedException { 
		
		Thread.sleep(3000);
		LoginPage login = new LoginPage();
		HomePage home = new HomePage();
		
		
		login.clickAcceptAllCookies();
		home.footerGetStarted();
		Thread.sleep(3000);
			
		
		String Actual  = "https://dev.zavenlegal.com/sign-up/corporate/step1";
		String Expected = getPage().url();
		if(Actual.equals(Expected))
		System.out.println("Pass - Current URL: " + getPage().url());
		else
			System.out.println("Fail - Incorrect url displayed.");	
		
		
		
	}
}
