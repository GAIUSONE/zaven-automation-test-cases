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
import page.services.CorporateUser;
import page.services.CreateRFPPage;
import page.services.CreateRFPSOWPage;

public class TC127_CreateRFPWithCCROFF extends ProjectHooks{
	
	@BeforeTest
	public void setReportValues() {
		testcaseName = "TC127 -  Create an RFP with CCR OFF";
		testDescription = "Create an RFP with CCR swtich kept to OFF";
		authors = "Samanthasree";
		category = "CU";
	}
	
	@Test
	public void createRFPWithCCROFF() throws InterruptedException {
		
		new LoginPage().doLogin();
		Thread.sleep(3000);
		
		
		CreateRFPPage rfp = new CreateRFPPage();
		CreateRFPSOWPage sow = new CreateRFPSOWPage();
		CorporateUser user = new CorporateUser();
		
		//CCR Page inputs
		rfp.clickDraftNewRFP();
		Thread.sleep(2000);	
		
		rfp.CheckCCROFF();
		Thread.sleep(2000);	
		
		
		rfp.enterCompanyEntityrequestingconflictcheck("TestCompany")
		.enterPocFirstName("Samanthasree").enterPocLastName("TestLastName")
		.enterPocEmail("samanthasree@instrive.in");
		Thread.sleep(2000);	
		
		//PI inputs
		rfp.enterProjectName("Test for Access Rule Private").enterShortDesc("Test Comments");
		Thread.sleep(5000);
		rfp.juridictionLanguage().participationBy().proposalBy().timeZone().checkRFPTermsandConditions().
		clickContinue(); 
		Thread.sleep(2000);	
		
		//Sow inputs
		sow.selectFundFormation().checkStructuring().FundStructcmptDate();
		
		rfp.clickContinue();
		Thread.sleep(2000);	
		
		
		//Pricing inputs
		rfp.selectCurrency().checkEstimate().checkFixedFee().checkCappedFee().clickContinue();
		Thread.sleep(2000);	
		
		//OKI inputs
		rfp.checkKeyTeamMember().checkKeyTeamMembersCountry().checkBiographies().clickContinue();
		Thread.sleep(2000);	
		
		//Bidders inputs
		rfp.clickSelectBidders().checkLegalServicesProviders().clickConfirm().clickPreviewRFP();
		Thread.sleep(2000);		
		
		
		//Preview inputs
		rfp.clickSubmit();
		
		String Actual  = getInnerText("//*[text()='New RFP submitted successfully.']");
		String Expected = "New RFP submitted successfully.";
		if(Actual.equals(Expected))
			System.out.println( "Pass - New RFP submitted successfully.");
		else
			System.out.println("Fail - Incorrect success message displayed");
		Thread.sleep(2000); 
		}	
  }	

