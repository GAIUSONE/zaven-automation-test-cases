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

public class TC136_LSPFinancialsAddCard extends ProjectHooks{
	
	@BeforeTest
	public void setReportValues() {
		testcaseName = "TC136 - LSP Profile Add a card";
		testDescription = "Financials Test case to add a card in LSP.";
		authors = "Samanthasree";
		category = "CU";
	}
	
	@Test
	public void LSPFinancialsAddCard() throws InterruptedException {
		
		new LoginPage().doLoginLSP();
		Thread.sleep(3000);
		
		
		//Declarations
		CorporateProfile profile = new CorporateProfile();
		ProposalDashboard proposal	= new ProposalDashboard();	
		CreateRFPPage rfp = new CreateRFPPage();
		
	
		proposal.expandIcon().clickFinancials().creditContinue().creditPayWithOutLink().creditCardInfo("4242424242424242").creditCardExpiry("1226").creditCardCVC("123").creditCardHolderName("Samanthasree").
		creditSaveCard();
		Thread.sleep(2000);
		
		//Credit Card Added Successfully
	//	Good things may take some time.
		//Please Wait !!
				
				
				
				//rfp.clickSubmit();
				Thread.sleep(2000);
				
				String Actual  = getInnerText("//*[text()='Credit Card Added Successfully']");
				String Expected = "Credit Card Added Successfully";
				if(Actual.equals(Expected))
					System.out.println( "Pass - Credit Card Added Successfully");
				else
					System.out.println("Fail - Incorrect success message displayed");
				Thread.sleep(2000);	
				
					}
		      }	