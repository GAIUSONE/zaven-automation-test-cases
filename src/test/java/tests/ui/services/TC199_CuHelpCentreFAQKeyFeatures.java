package tests.ui.services;

import org.testng.annotations.Test;
import com.force.base.ProjectHooks;
import com.microsoft.playwright.PlaywrightException;
import org.openqa.selenium.Keys;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import org.testng.annotations.BeforeTest;
import page.base.AdminPage;
import page.base.LoginPage;
import page.services.Analytics;
import page.services.HelpCentre;


public class TC199_CuHelpCentreFAQKeyFeatures extends ProjectHooks{
	
	@BeforeTest
	public void setReportValues() {
		testcaseName = "TC199 - Corporate Help Centre FAQ Key Features";
		testDescription = "Verify Corporate Help Centre FAQ Key Features";
		authors = "Samanthasree";
		category = "CU";
	}
	
	@Test
	public void CuHelpCentreFAQKeyFeatures() throws InterruptedException {
		
		new LoginPage().doLogin();
		Thread.sleep(3000);
		
		HelpCentre help = new HelpCentre();
		
		help.helpCentre().helpCentreFAQ().helpCentreFAQKeyFeatures();
		Thread.sleep(3000);
		
		String Actual  = "https://dev.zavenlegal.com/corporate/faq?section=key_features";
		String Expected = getPage().url();
		if(Expected.contains(Actual))
		System.out.println("Pass - Current URL: " + getPage().url());
		else
			System.out.println("Fail - Incorrect url displayed.");	
		
				
					}	
					
					
			  }	

		
		
		 
		
	

