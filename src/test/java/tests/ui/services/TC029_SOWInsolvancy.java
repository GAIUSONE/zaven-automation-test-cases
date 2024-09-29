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

public class TC029_SOWInsolvancy extends ProjectHooks{
	
	@BeforeTest
	public void setReportValues() {
		testcaseName = "TC003 - Create an RFP";
		testDescription = "Create an RFP with only mandatory fields";
		authors = "Samanthasree";
		category = "CU";
	}
	
	@Test
	public void createRFPSOWInsolvancy() throws InterruptedException {
		
		new LoginPage().doLogin();
		Thread.sleep(3000);
		
		CreateRFPPage rfp = new CreateRFPPage();
		CreateRFPSOWPage sow = new CreateRFPSOWPage();
		CreateRFPSOWPage2 sow2 = new CreateRFPSOWPage2();
		
		//CCR Page inputs
				rfp.clickDraftNewRFP().enterCompanyEntityrequestingconflictcheck("SOW Insolvancy")
				.enterPocFirstName("Samanthasree").enterPocLastName("TestLastName")
				.enterPocEmail("samanthasree@instrive.in").
				enterCounterOtherPartyName("TestCounterParty").clickContinue();
				Thread.sleep(2000);	
				
				//PI inputs
				rfp.enterProjectName("SOW Insolvancy").enterShortDesc("Test Comments");
				Thread.sleep(5000);
				rfp.juridictionLanguage().participationBy().proposalBy().timeZone().checkRFPTermsandConditions().
				clickContinue(); 
				Thread.sleep(2000);	
				
				//Sow inputs
				sow2.selectScopeInsolvency().selectScopeRoleInInsolvency().checkInsolvencyNonContentious().InsolvencyNonContentiousDate().
				InsolvencyNonContentiousCmts("Sow Test Comments").checkInsolvencyLitigation().InsolvencyLitigationDate().InsolvencyLitigationCmts("Sow Test Comments").
				checkInsolvencySaleOfClaims().InsolvencySaleOfClaimsDate().InsolvencySaleOfClaimsCmts("Sow Test Comments").checkInsolvencyAdviceInRelation().
				InsolvencyAdviceInRelationDate().InsolvencyAdviceInRelationCmts("Sow Test Comments").checkInsolvencyAdviceOnRegulatory().InsolvencyAdviceOnRegulatoryDate().
				InsolvencyAdviceOnRegulatoryCmts("Sow Test Comments").checkInsolvencyInvestigations().InsolvencyInvestigationsDate().InsolvencyInvestigationsCmts("Sow Test Comments").
				checkInsolvencyFraud().InsolvencyFraudDate().InsolvencyFraudCmts("Sow Test Comments").checkInsolvencyOther().InsolvencyOtherDate().InsolvencyOtherCmts("Sow Test Comments");
				
				
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

