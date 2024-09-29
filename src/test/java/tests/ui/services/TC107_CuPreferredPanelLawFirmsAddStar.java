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

public class TC107_CuPreferredPanelLawFirmsAddStar extends ProjectHooks{
	
	@BeforeTest
	public void setReportValues() {
		testcaseName = "TC107 - Preferred Panel Law Firms Add to favourites";
		testDescription = "Preffered panel Add to favourites.";
		authors = "Samanthasree";
		category = "CU";
	}
	
	@Test
	public void preferredPanelAddFavourites() throws InterruptedException {
		
		new LoginPage().doLogin();
		Thread.sleep(3000);
		
		
		//Declarations
		CorporatePreferredPanel Panel = new CorporatePreferredPanel();
		
		Panel.CuPreferredPanel().CuAddStar().Addbtn();
		
		
		String Actual  = getInnerText("//*[text()='Bidders added to Preferred/Panel Law Firms successfully.']");
		String Expected = "Bidders added to Preferred/Panel Law Firms successfully.";
		if(Actual.equals(Expected))
			System.out.println( "Pass - Bidders added to Preferred/Panel Law Firms successfully.");
		else
			System.out.println("Fail - Incorrect success message displayed");
		Thread.sleep(2000);
		
		
				
		}
     }	

