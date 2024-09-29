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
import page.services.CreateRFPPage;
import page.services.CreateRFPSOWPage;

public class TC003_CreateRFPMandatoryFields extends ProjectHooks{
	
	@BeforeTest
	public void setReportValues() {
		testcaseName = "TC003 - Create an RFP";
		testDescription = "Create an RFP with only mandatory fields";
		authors = "Samanthasree";
		category = "CU";
	}
	
	@Test
	public void createRFPMandatortyFields() throws InterruptedException {
		
		new LoginPage().doLogin();
		Thread.sleep(3000);
		
		
		CreateRFPPage rfp = new CreateRFPPage();
		CreateRFPSOWPage sow = new CreateRFPSOWPage();
		
		
		//CCR Page inputs
		rfp.clickDraftNewRFP().enterCompanyEntityrequestingconflictcheck("TestCompany")
		.enterPocFirstName("Samanthasree").enterPocLastName("TestLastName")
		.enterPocEmail("samanthasree@instrive.in").
		enterCounterOtherPartyName("TestCounterParty").clickContinue();
		Thread.sleep(2000);	
		
		//PI inputs
		rfp.enterProjectName("SAM Project Test").enterShortDesc("Test Comments");
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
		
		//Pricing inputs
		rfp.checkKeyTeamMember().checkKeyTeamMembersCountry().checkBiographies().clickContinue();
		Thread.sleep(2000);	
		
		//Bidders inputs
		rfp.clickSelectBidders().checkLegalServicesProviders().clickConfirm().clickPreviewRFP();
		Thread.sleep(2000);	
		
		//Preview inputs
		rfp.clickSubmit();
		Thread.sleep(2000);	
		
		}
		
        }	

