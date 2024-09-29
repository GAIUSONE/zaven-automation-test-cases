package tests.ui.services;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import page.base.LoginPage;
import page.base.HomePage;
import com.force.base.ProjectHooks;


public class TC185_LandingPageFootertHowItWorks extends ProjectHooks{
	
	@BeforeTest
	public void setReportValues() {
		testcaseName = "TC185 - Verification for footer How it works";
		testDescription = "Verification for footer How it works";
		authors = "Samanthasree";
	}
	
	@Test
	public void LandingPageFooterHowItWorks() throws InterruptedException { 
		
		Thread.sleep(3000);
		LoginPage login = new LoginPage();
		HomePage home = new HomePage();
		
		
		login.clickAcceptAllCookies();
		home.footerHowItWorks();
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
