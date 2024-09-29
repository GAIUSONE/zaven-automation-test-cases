package tests.ui.services;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import page.base.LoginPage;
import page.base.HomePage;
import com.force.base.ProjectHooks;


public class TC184_LandingPageFootertAnalytics extends ProjectHooks{
	
	@BeforeTest
	public void setReportValues() {
		testcaseName = "TC184 - Verification for footer Analytics";
		testDescription = "Verification for footer Analytics";
		authors = "Samanthasree";
	}
	
	@Test
	public void LandingPageFooterAnalytics() throws InterruptedException { 
		
		Thread.sleep(3000);
		LoginPage login = new LoginPage();
		HomePage home = new HomePage();
		
		
		login.clickAcceptAllCookies();
		home.footerAnalytics();
		Thread.sleep(3000);
			
		
		String Actual  = "https://dev.zavenlegal.com/zaven-analytics";
		String Expected = getPage().url();
		if(Actual.equals(Expected))
		System.out.println("Pass - Current URL: " + getPage().url());
		else
			System.out.println("Fail - Incorrect url displayed.");	
		
		Thread.sleep(3000);
		
	}
}
