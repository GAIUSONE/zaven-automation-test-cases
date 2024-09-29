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

public class TC022_SOWFundFormation extends ProjectHooks{
	
	@BeforeTest
	public void setReportValues() {
		testcaseName = "TC003 - Create an RFP";
		testDescription = "Create an RFP with only mandatory fields";
		authors = "Samanthasree";
		category = "CU";
	}
	
	@Test
	public void createRFPSOWFundFormation() throws InterruptedException {
		
		new LoginPage().doLogin();
		Thread.sleep(3000);
		
		CreateRFPPage rfp = new CreateRFPPage();
		CreateRFPSOWPage sow = new CreateRFPSOWPage();
		
		
				//CCR Page inputs
				rfp.clickDraftNewRFP().enterCompanyEntityrequestingconflictcheck("SOW Fund Formation")
				.enterPocFirstName("Samanthasree").enterPocLastName("TestLastName")
				.enterPocEmail("samanthasree@instrive.in").
				enterCounterOtherPartyName("TestCounterParty").clickContinue();
				Thread.sleep(2000);	
				
				//PI inputs
				rfp.enterProjectName("SOW Fund Formation").enterShortDesc("Test Comments");
				Thread.sleep(5000);
				rfp.juridictionLanguage().participationBy().proposalBy().timeZone().checkRFPTermsandConditions().
				clickContinue(); 
				Thread.sleep(2000);	
			
				//Sow inputs
				sow.selectFundFormation().checkStructuring().FundStructcmptDate().FundSStructCmts("Sow Test Comments").
				checkTermSheet().FundTermcmptDate().FundStructuringCmts("Sow Test Comments").FundTermcGblCmts("Sow Test Comments").
				checkMarketing().checkReviewingPitch().checkrestrictions().checkAIFMD().checkNonUsEu().checkMArketingInUS().
				checkAdvisingTheUS().checkSecuritiesLaw().checkDFiling().FundMarketingCmts("Sow Test Comments").checkDraftingPPMlegalaspects().
				FundDraftingPPMcmptDate().FundDraftingPPMCmts("Sow Test Comments").checkCoreDocuments().FundCoreDocumentscmptDate().
				FundcoredocumentsCmts("Sow Test Comments").checkAncilliaryDocuments().FundAncilliaryDocumentscmptDate().FundAncilliaryCmts("Sow Test Comments").
				GblFundFormationAncilliaryCmts("Sow Test Comments").checkestablishment().FundEntityEstbcmptDate().FundEntityEstbCmts("Sow Test Comments").
				checkNegotiations().FundNegotiationscmptDate().FundNegotiationsCmts("Sow Test Comments").checkClosings().FundClosingscmptDate().
				FundClosingsCmts("Sow Test Comments").FundGblClosingsCmts("Sow Test Comments").checkPostClosing().FundPostClosingcmptDate().
				FundPostClosingCmts("Sow Test Comments").checkWorkstreams().FundWorkstreamscmptDate().FundWorkstreamsCmts("Sow Test Comments").
				FundGblWorkstreamsCmts("Sow Test Comments");
				
				sow.sowFileUpload();
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

