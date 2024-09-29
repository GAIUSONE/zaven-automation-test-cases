package tests.ui.services;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import page.base.LoginPage;
import page.base.HomePage;
import com.force.base.ProjectHooks;


public class TC183_LandingPageFootertRFPs extends ProjectHooks{
	
	@BeforeTest
	public void setReportValues() {
		testcaseName = "TC183 - Verification for footer RFPs";
		testDescription = "Verification for footer RFPs";
		authors = "Samanthasree";
	}
	
	@Test
	public void LandingPageFooterRFPs() throws InterruptedException { 
		
		Thread.sleep(3000);
		LoginPage login = new LoginPage();
		HomePage home = new HomePage();
		
		
		login.clickAcceptAllCookies();
		home.footerRFPs();
		Thread.sleep(3000);
			
		
		String Actual  = "https://dev.zavenlegal.com/zaven-rfp";
		String Expected = getPage().url();
		if(Actual.equals(Expected))
		System.out.println("Pass - Current URL: " + getPage().url());
		else
			System.out.println("Fail - Incorrect url displayed.");	
		
		Thread.sleep(3000);
		
	}
}
