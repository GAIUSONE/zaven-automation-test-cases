package tests.ui.services;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import page.base.LoginPage;
import page.base.HomePage;
import com.force.base.ProjectHooks;


public class TC191_LandingPageFootertFAQRFPsInProgress extends ProjectHooks{
	
	@BeforeTest
	public void setReportValues() {
		testcaseName = "TC191 - Verification for footer FAQ RFPs In Progress";
		testDescription = "Verification for footer FAQ RFPs In Progress";
		authors = "Samanthasree";
	}
	
	@Test
	public void LandingPageFooterFAQRFPsInProgress() throws InterruptedException { 
		
		Thread.sleep(3000);
		LoginPage login = new LoginPage();
		HomePage home = new HomePage();
		
		
		login.clickAcceptAllCookies();
		home.footerFAQ();
		Thread.sleep(3000);
		home.headerMnuFAQRFPsinProgress();		
		
		
		String Actual  = "https://dev.zavenlegal.com/faq?section=rfp_in_progress";
		String Expected = getPage().url();
		if(Actual.equals(Expected))
		System.out.println("Pass - Current URL: " + getPage().url());
		else
			System.out.println("Fail - Incorrect url displayed.");	
		
		Thread.sleep(3000);
		
	}


}
