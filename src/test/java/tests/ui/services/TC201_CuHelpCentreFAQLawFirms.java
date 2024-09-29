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


public class TC201_CuHelpCentreFAQLawFirms extends ProjectHooks{
	
	@BeforeTest
	public void setReportValues() {
		testcaseName = "TC201 - Corporate Help Centre FAQ Law Firms";
		testDescription = "Verify Corporate Help Centre FAQ Law Firms";
		authors = "Samanthasree";
		category = "CU";
	}
	
	@Test
	public void CuHelpCentreFAQLawFirms() throws InterruptedException {
		
		new LoginPage().doLogin();
		Thread.sleep(3000);
		
		HelpCentre help = new HelpCentre();
		
		help.helpCentre().helpCentreFAQ().helpCentreFAQLawFirms();
		Thread.sleep(3000);
		
		String Actual  = "https://dev.zavenlegal.com/corporate/faq?section=law_firms";
		String Expected = getPage().url();
		if(Expected.contains(Actual))
		System.out.println("Pass - Current URL: " + getPage().url());
		else
			System.out.println("Fail - Incorrect url displayed.");	
		
				
					}	
					
					
			  }	

		
		
		 
		
	

