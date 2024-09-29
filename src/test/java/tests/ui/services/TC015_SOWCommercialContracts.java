package tests.ui.services;

import org.testng.annotations.Test;
import com.force.base.ProjectHooks;
import com.microsoft.playwright.PlaywrightException;
import org.openqa.selenium.Keys;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import org.testng.annotations.BeforeTest;
import page.services.CreateRFPSOWPage;

import page.base.AdminPage;
import page.base.LoginPage;
import page.services.CreateRFPPage;
import page.services.CuRegistrationPage;

public class TC015_SOWCommercialContracts extends ProjectHooks{
	
	@BeforeTest
	public void setReportValues() {
		testcaseName = "TC003 - RFP to verify SOW Commercial Contracts";
		testDescription = "Create an RFP and verify SOW Commercial Contracts Sub items";
		authors = "Samanthasree";
		category = "CU";
	}
	
	@Test
	public void createRFPSOWCommercialContracts() throws InterruptedException {
		
		new LoginPage().doLogin();
		Thread.sleep(3000);
		
		CreateRFPPage rfp = new CreateRFPPage();
		CreateRFPSOWPage sow = new CreateRFPSOWPage();
		
		
		//CCR Page inputs
				rfp.clickDraftNewRFP().enterCompanyEntityrequestingconflictcheck("SOW Commercial Contracts")
				.enterPocFirstName("Samanthasree").enterPocLastName("TestLastName")
				.enterPocEmail("samanthasree@instrive.in").
				enterCounterOtherPartyName("TestCounterParty").clickContinue();
				Thread.sleep(2000);	
				
				//PI inputs
				rfp.enterProjectName("SOW Commercial Contracts").enterShortDesc("Test Comments");
				Thread.sleep(5000);
				rfp.juridictionLanguage().participationBy().proposalBy().timeZone().checkRFPTermsandConditions().
				clickContinue(); 
				Thread.sleep(2000);	
				
				//Sow inputs
				sow.selectScopeCommercial().checkCommLegalAdvice().CommLegalAdviceDate().enterCommLegalAdviceCmts("Test Sow Comments").
				checkCommContractdrafting().CommContractdraftingDate().enterCommContractdraftingCmts("Test Sow Comments").
				checkCommContractReview().CommContractReviewDate().enterCommContractReviewCmts("Test Sow Comments").checkCommNegotiation().
				CommNegotiationDate().enterCommNegotiationCmts("Test Sow Comments").checkCommRegulatory().CommRegulatoryDate().
				enterCommRegulatoryCmts("Test Sow Comments").checkCommOther().CommOtherDate().enterCommOtherCmts("Test Sow Comments").
				enterCommercialGblCmts("Test Sow Comments").sowFileUpload();
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

