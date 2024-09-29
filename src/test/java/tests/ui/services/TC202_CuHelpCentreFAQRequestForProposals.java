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


public class TC202_CuHelpCentreFAQRequestForProposals extends ProjectHooks{
	
	@BeforeTest
	public void setReportValues() {
		testcaseName = "TC202 - Corporate Help Centre FAQ Request For Proposals";
		testDescription = "Verify Corporate Help Centre FAQ Request For Proposals";
		authors = "Samanthasree";
		category = "CU";
	}
	
	@Test
	public void CuHelpCentreFAQRequestForProposals() throws InterruptedException {
		
		new LoginPage().doLogin();
		Thread.sleep(3000);
		
		HelpCentre help = new HelpCentre();
		
		help.helpCentre().helpCentreFAQ().helpCentreFAQRequestforProposals();
		Thread.sleep(3000);
		
		String Actual  = "https://dev.zavenlegal.com/corporate/faq?section=request_for_proposal";
		String Expected = getPage().url();
		if(Expected.contains(Actual))
		System.out.println("Pass - Current URL: " + getPage().url());
		else
			System.out.println("Fail - Incorrect url displayed.");	

					}				
			  }	

		
		
		 
		
	

