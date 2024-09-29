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

public class TC106_CuPreferredPanelLawFirmsInstructionsView extends ProjectHooks{
	
	@BeforeTest
	public void setReportValues() {
		testcaseName = "TC090 - Preferred Panel Law Firms Upload";
		testDescription = "Upload a pdf file in preffered panel.";
		authors = "Samanthasree";
		category = "CU";
	}
	
	@Test
	public void preferredPanelUpload() throws InterruptedException {
		
		new LoginPage().doLogin();
		Thread.sleep(3000);
		
		
		//Declarations
		AdminPage adm = new AdminPage();
		CorporatePreferredPanel Panel = new CorporatePreferredPanel();
		
		
		Panel.CuPreferredPanel().CuInstructions();
		adm.clickView();
		Thread.sleep(2000);
				
		}
     }	

