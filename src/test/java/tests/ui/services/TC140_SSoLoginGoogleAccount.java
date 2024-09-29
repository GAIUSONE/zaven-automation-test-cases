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

public class TC140_SSoLoginGoogleAccount extends ProjectHooks{
	
	@BeforeTest
	public void setReportValues() {
		testcaseName = "TC138 - LSP update card details in Financials Page";
		testDescription = "Financials page update card details.";
		authors = "Samanthasree";
		category = "CU";
	}
	
	@Test
	public void LSPFinancialsUpdate() throws InterruptedException {
		
		
		new LoginPage().clickAcceptAllCookies().clickLogin().signInWithGoogle();
		
		
		//Declarations
		CorporateProfile profile = new CorporateProfile();
		ProposalDashboard proposal	= new ProposalDashboard();	
		CreateRFPPage rfp = new CreateRFPPage();
		

		proposal.expandIcon().clickFinancials().btnUpdate().btnWizUpdate().
		creditPayWithOutLink().creditCardInfo("4242424242424242").creditCardExpiry("1226").creditCardCVC("123").
		creditCardHolderName("Samanthasree").creditSaveCard();
		Thread.sleep(2000);
	
		String Actual  = getInnerText("//*[text()='Bank Details Updated Successfully']");
		String Expected = "Bank Details Updated Successfully";
		if(Actual.equals(Expected))
			System.out.println( "Pass - Bank Details Updated Successfully");
		else
			System.out.println("Fail - Incorrect success message displayed");
		Thread.sleep(2000);	
		
			}
      }	