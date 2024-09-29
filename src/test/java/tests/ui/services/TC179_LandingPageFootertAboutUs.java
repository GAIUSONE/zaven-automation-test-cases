package tests.ui.services;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import page.base.LoginPage;
import page.base.HomePage;
import com.force.base.ProjectHooks;


public class TC179_LandingPageFootertAboutUs extends ProjectHooks{
	
	@BeforeTest
	public void setReportValues() {
		testcaseName = "TC179 - Verification for footer About Us";
		testDescription = "Verification for footer About Us";
		authors = "Samanthasree";
	}
	
	@Test
	public void LandingPageFooterAboutUs() throws InterruptedException { 
		
		Thread.sleep(3000);
		LoginPage login = new LoginPage();
		HomePage home = new HomePage();
		
		
		login.clickAcceptAllCookies();
		home.footerAboutUs();
		Thread.sleep(3000);
			
		
		String Actual  = "https://dev.zavenlegal.com/about-us";
		String Expected = getPage().url();
		if(Actual.equals(Expected))
		System.out.println("Pass - Current URL: " + getPage().url());
		else
			System.out.println("Fail - Incorrect url displayed.");	
		
		Thread.sleep(3000);
		
	}
}
