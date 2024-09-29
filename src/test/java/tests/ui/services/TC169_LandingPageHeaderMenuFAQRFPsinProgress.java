package tests.ui.services;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import page.base.LoginPage;
import page.base.HomePage;
import com.force.base.ProjectHooks;
import com.microsoft.playwright.BrowserContext;
import com.microsoft.playwright.Page;


public class TC169_LandingPageHeaderMenuFAQRFPsinProgress extends ProjectHooks{
	
	@BeforeTest
	public void setReportValues() {
		testcaseName = "TC164 - Verification for FAQ";
		testDescription = "CU Registration";
		authors = "Samanthasree";
	}
	
	@Test
	public void LandingPageHeaderMenuFAQRFPsinProgress() throws InterruptedException { 
		
		Thread.sleep(3000);
		LoginPage login = new LoginPage();
		HomePage home = new HomePage();
				
		login.clickAcceptAllCookies();
		
		home.headerMnuFAQ().headerMnuFAQRFPsinProgress();
		Thread.sleep(3000);
		
		String Actual  = "https://dev.zavenlegal.com/faq?section=rfp_in_progress";
		String Expected = getPage().url();
		if(Actual.equals(Expected))
		System.out.println("Pass - Current URL: " + getPage().url());
		else
			System.out.println("Fail - Incorrect url displayed.");	
			
	}

}
