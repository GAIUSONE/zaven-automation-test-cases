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
import page.services.CorporateProfile;
import page.services.CreateRFPPage;
import page.services.ProposalDashboard;

public class TC137_LSPFinancialsRemove extends ProjectHooks{
	
	@BeforeTest
	public void setReportValues() {
		testcaseName = "TC136 - LSP Profile Add a card";
		testDescription = "Financials Test case to add a card in LSP.";
		authors = "Samanthasree";
		category = "CU";
	}
	
	@Test
	public void LSPFinancialsRemove() throws InterruptedException {
		
		new LoginPage().doLoginLSP();
		Thread.sleep(3000);
		
		
		//Declarations
		CorporateProfile profile = new CorporateProfile();
		ProposalDashboard proposal	= new ProposalDashboard();	
		CreateRFPPage rfp = new CreateRFPPage();
		

		proposal.expandIcon().clickFinancials().btnRemove().btnWizRemove();
		
			
				String Actual  = getInnerText("//*[text()='Payment Method removed successfully.']");
				String Expected = "Payment Method removed successfully.";
				if(Actual.equals(Expected))
					System.out.println( "Pass - Payment Method removed successfully.");
				else
					System.out.println("Fail - Incorrect success message displayed");
				Thread.sleep(2000);	
				
					}
		      }	