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
import page.services.CreateRFPSOWPage2;
import page.base.AdminPage;
import page.base.LoginPage;
import page.services.CreateRFPPage;
import page.services.CuRegistrationPage;

public class TC027_SOWArbitration extends ProjectHooks{
	
	@BeforeTest
	public void setReportValues() {
		testcaseName = "TC003 - Create an RFP";
		testDescription = "Create an RFP with only mandatory fields";
		authors = "Samanthasree";
		category = "CU";
	}
	
	@Test
	public void createRFPSOWArbitration() throws InterruptedException {
		
		new LoginPage().doLogin();
		Thread.sleep(3000);
		
		CreateRFPPage rfp = new CreateRFPPage();
		CreateRFPSOWPage sow = new CreateRFPSOWPage();
		CreateRFPSOWPage2 sow2 = new CreateRFPSOWPage2();
		
		
		//CCR Page inputs
				rfp.clickDraftNewRFP().enterCompanyEntityrequestingconflictcheck("SOW Arbitration")
				.enterPocFirstName("Samanthasree").enterPocLastName("TestLastName")
				.enterPocEmail("samanthasree@instrive.in").
				enterCounterOtherPartyName("TestCounterParty").clickContinue();
				Thread.sleep(2000);	
				
				//PI inputs
				rfp.enterProjectName("SOW Arbitration").enterShortDesc("Test Comments");
				Thread.sleep(5000);
				rfp.juridictionLanguage().participationBy().proposalBy().timeZone().checkRFPTermsandConditions().
				clickContinue(); 
				Thread.sleep(2000);	
				
				//Sow inputs
				sow2.selectScopeArbitration().checkArbitrationInvestigation().ArbitrationInvestigationDate().ArbitrationInvestigationCmts("Sow Test Comments").
				checkArbitrationCounterClaims().ArbitrationCounterClaimsDate().ArbitrationCounterClaimsCmts("Sow Test Comments").checkArbitrationInitialMemoranda().
				ArbitrationInitialMemorandaDate().ArbitrationInitialMemorandaCmts("Sow Test Comments").checkArbitrationExchangeOfEvidence().ArbitrationExchangeOfEvidenceDate().
				ArbitrationExchangeOfEvidenceCmts("Sow Test Comments").checkArbitrationMemoranda().ArbitrationMemorandaDate().ArbitrationMemorandaCmts("Sow Test Comments").
				checkArbitrationHearing().ArbitrationHearingDate().ArbitrationHearingCmts("Sow Test Comments").checkArbitrationPostHearing().ArbitrationPostHearingDate().
				ArbitrationPostHearingCmts("Sow Test Comments").checkArbitrationSettlement().ArbitrationSettlementDate().ArbitrationSettlementCmts("Sow Test Comments").
				checkArbitrationAppeal().ArbitrationAppealDate().ArbitrationAppealCmts("Sow Test Comments").checkArbitrationEnforcement().ArbitrationEnforcementDate().
				ArbitrationEnforcementCmts("Sow Test Comments").checkArbitrationOther().ArbitrationOtherDate().ArbitrationOtherCmts("Sow Test Comments");
				
				sow.sowFileUpload();
				rfp.clickContinue();
				
				
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

