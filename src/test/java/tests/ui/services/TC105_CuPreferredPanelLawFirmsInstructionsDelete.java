package tests.ui.services;

import org.testng.annotations.Test;
import com.force.base.ProjectHooks;
import com.microsoft.playwright.PlaywrightException;
import org.openqa.selenium.Keys;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import org.testng.annotations.BeforeTest;
import page.base.LoginPage;
import page.services.CorporatePreferredPanel;
import page.services.CuRegistrationPage;


public class TC105_CuPreferredPanelLawFirmsInstructionsDelete extends ProjectHooks{
	
	@BeforeTest
	public void setReportValues() {
		testcaseName = "TC105 - Preferred Panel Law Firms Delete";
		testDescription = "Delete a file inside Instructions";
		authors = "Samanthasree";
		category = "CU";
	}
	
	@Test
	public void preferredPanelDelete() throws InterruptedException {
		
		new LoginPage().doLogin();
		Thread.sleep(3000);
		
		
		//Declarations
		CorporatePreferredPanel Panel = new CorporatePreferredPanel();
		
		Panel.CuPreferredPanel().CuInstructions().CuDeleteIcon().CuDeleteBtn();
		Thread.sleep(2000);
		
		String Actual  = getInnerText("//*[text()='Bidder file deleted successfully.']");
		String Expected = "Bidder file deleted successfully.";
		if(Actual.equals(Expected))
			System.out.println( "Pass - Bidder file deleted successfully.");
		else
			System.out.println("Fail - Incorrect success message displayed");
		Thread.sleep(2000);
	
				
		}
     }	

