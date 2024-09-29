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
import page.base.AdminPage;

public class TC108_CuPreferredPanelLawFirmsRemoveStar extends ProjectHooks{
	
	@BeforeTest
	public void setReportValues() {
		testcaseName = "TC108 - Preferred Panel Law Firms Remove star";
		testDescription = "Preffered panel remove from favorites.";
		authors = "Samanthasree";
		category = "CU";
	}
	
	@Test
	public void preferredPanelRemoveStar() throws InterruptedException {
		
		new LoginPage().doLogin();
		Thread.sleep(3000);
		
		
		//Declarations
		CorporatePreferredPanel Panel = new CorporatePreferredPanel();
		
		Panel.CuPreferredPanel().CuRemoveStar().Removebtn();
		Thread.sleep(2000);
		
		String Actual  = getInnerText("//*[text()='Bidders removed from Preferred/Panel Law Firms successfully.']");
		String Expected = "Bidders removed from Preferred/Panel Law Firms successfully.";
		if(Actual.equals(Expected))
			System.out.println( "Pass - Bidders removed from Preferred/Panel Law Firms successfully.");
		else
			System.out.println("Fail - Incorrect success message displayed");
		Thread.sleep(2000);
		
				
		}
     }	

