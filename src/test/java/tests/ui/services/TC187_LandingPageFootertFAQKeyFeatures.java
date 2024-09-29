package tests.ui.services;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import page.base.LoginPage;
import page.base.HomePage;
import com.force.base.ProjectHooks;


public class TC187_LandingPageFootertFAQKeyFeatures extends ProjectHooks{
	
	@BeforeTest
	public void setReportValues() {
		testcaseName = "TC185 - Verification for footer FAQ Key Features";
		testDescription = "Verification for footer FAQ Key Features";
		authors = "Samanthasree";
	}
	
	@Test
	public void LandingPageFooterFAQKeyFeatures() throws InterruptedException { 
		
		Thread.sleep(3000);
		LoginPage login = new LoginPage();
		HomePage home = new HomePage();
		
		
		login.clickAcceptAllCookies();
		home.footerFAQ();
		Thread.sleep(3000);
		home.headerMnuFAQKeyFeatures();
		Thread.sleep(3000);
		
		
		String Actual  = "https://dev.zavenlegal.com/faq?section=key_features";
		String Expected = getPage().url();
		if(Actual.equals(Expected))
		System.out.println("Pass - Current URL: " + getPage().url());
		else
			System.out.println("Fail - Incorrect url displayed.");	
		
		Thread.sleep(3000);
		
	}
}
