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


public class TC210_ProposalHelpCentreFAQTemplatesBank extends ProjectHooks{
	
	@BeforeTest
	public void setReportValues() {
		testcaseName = "TC210 - Proposal Help Centre FAQ Templates Bank";
		testDescription = "Verify Corporate Help Centre FAQ Templates Bank";
		authors = "Samanthasree";
		category = "CU";
	}
	
	@Test
	public void proposalHelpCentreFAQTemplatesBank() throws InterruptedException {
		
		new LoginPage().doLoginLSP();
		Thread.sleep(3000);
		
		HelpCentre help = new HelpCentre();
		
		help.helpCentre().helpCentreFAQ().helpCentreFAQTemplatesBank();
		Thread.sleep(3000);
		
		String Actual  = "https://dev.zavenlegal.com/legal-service/faq?section=template_bank";
		String Expected = getPage().url();
		if(Expected.contains(Actual))
		System.out.println("Pass - Current URL: " + getPage().url());
		else
			System.out.println("Fail - Incorrect url displayed.");	

					}				
			  }	

		
		
		 
		
	

