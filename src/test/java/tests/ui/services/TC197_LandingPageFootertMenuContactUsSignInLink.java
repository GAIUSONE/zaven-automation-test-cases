package tests.ui.services;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import page.base.LoginPage;
import page.base.HomePage;
import com.force.base.ProjectHooks;


public class TC197_LandingPageFootertMenuContactUsSignInLink extends ProjectHooks{
	
	@BeforeTest
	public void setReportValues() {
		testcaseName = "TC197 - Verification for footer Menu Contact Us Sign In Link";
		testDescription = "Verification for footer Menu Contact Us Sign In Link";
		authors = "Samanthasree";
	}
	
	@Test
	public void LandingPageFooterMenuContactUsSignInLink() throws InterruptedException { 
		
		Thread.sleep(3000);
		LoginPage login = new LoginPage();
		HomePage home = new HomePage();
		
		
		login.clickAcceptAllCookies();
		home.footerContact().contactUsSignIn();
		Thread.sleep(3000);
		
		
		String Actual  = "https://gaius-dev.eu.auth0.com/login";
		String Expected = getPage().url();
		if(Expected.contains(Actual))
		System.out.println("Pass - Current URL: " + getPage().url());
		else
			System.out.println("Fail - Incorrect url displayed.");	
		
	}


}
