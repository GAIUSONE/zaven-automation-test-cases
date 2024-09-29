package tests.ui.services;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import page.base.LoginPage;
import page.base.HomePage;
import com.force.base.ProjectHooks;


public class TC188_LandingPageFootertFAQRegistrationAccount extends ProjectHooks{
	
	@BeforeTest
	public void setReportValues() {
		testcaseName = "TC188 - Verification for footer FAQ Registration Account";
		testDescription = "Verification for footer FAQ Registration Account";
		authors = "Samanthasree";
	}
	
	@Test
	public void LandingPageFooterFAQRegistrationAccount() throws InterruptedException { 
		
		Thread.sleep(3000);
		LoginPage login = new LoginPage();
		HomePage home = new HomePage();
		
		
		login.clickAcceptAllCookies();
		home.footerFAQ();
		Thread.sleep(3000);
		home.headerMnuFAQRegistration();	
		
		String Actual  = "https://dev.zavenlegal.com/faq?section=registration_account";
		String Expected = getPage().url();
		if(Actual.equals(Expected))
		System.out.println("Pass - Current URL: " + getPage().url());
		else
			System.out.println("Fail - Incorrect url displayed.");	
		
		Thread.sleep(3000);
		
	}
}
