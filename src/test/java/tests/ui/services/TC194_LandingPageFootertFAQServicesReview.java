package tests.ui.services;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import page.base.LoginPage;
import page.base.HomePage;
import com.force.base.ProjectHooks;


public class TC194_LandingPageFootertFAQServicesReview extends ProjectHooks{
	
	@BeforeTest
	public void setReportValues() {
		testcaseName = "TC194 - Verification for footer FAQ Services Review";
		testDescription = "Verification for footer FAQ Services Review";
		authors = "Samanthasree";
	}
	
	@Test
	public void LandingPageFooterFAQServicesReview() throws InterruptedException { 
		
		Thread.sleep(3000);
		LoginPage login = new LoginPage();
		HomePage home = new HomePage();
		
		
		login.clickAcceptAllCookies();
		home.footerFAQ();
		Thread.sleep(3000);
		home.headerMnuFAQServicesReview();
			
		
		String Actual  = "https://dev.zavenlegal.com/faq?section=service_review";
		String Expected = getPage().url();
		if(Actual.equals(Expected))
		System.out.println("Pass - Current URL: " + getPage().url());
		else
			System.out.println("Fail - Incorrect url displayed.");	
		
		Thread.sleep(3000);
		
	}


}
