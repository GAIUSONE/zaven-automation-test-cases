package tests.ui.services;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import page.base.LoginPage;
import page.base.HomePage;
import com.force.base.ProjectHooks;
import com.microsoft.playwright.BrowserContext;
import com.microsoft.playwright.Page;


public class TC163_LandingPageHeaderMenuServicesAnalytics extends ProjectHooks{
	
	@BeforeTest
	public void setReportValues() {
		testcaseName = "TC163 - Verification for Services menu in header section of Landing page";
		testDescription = "CU Registration";
		authors = "Samanthasree";
	}
	
	@Test
	public void LandingPageHeaderMenuServicesAnalytics() throws InterruptedException { 
		
		Thread.sleep(3000);
		LoginPage login = new LoginPage();
		HomePage home = new HomePage();
				
		login.clickAcceptAllCookies();
		
		home.headerMnuServices().headerMnuServicesAnalytics();
		Thread.sleep(3000);
		
		String Actual  = "https://dev.zavenlegal.com/zaven-analytics";
		String Expected = getPage().url();
		if(Actual.equals(Expected))
		System.out.println("Pass - Current URL: " + getPage().url());
		else
			System.out.println("Fail - Incorrect url displayed.");	
			
	}

}
