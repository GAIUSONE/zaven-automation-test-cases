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

public class TC021_SOWInfrastructureProjectsAndFinancing extends ProjectHooks{
	
	@BeforeTest
	public void setReportValues() {
		testcaseName = "TC003 - Create an RFP";
		testDescription = "Create an RFP with only mandatory fields";
		authors = "Samanthasree";
		category = "CU";
	}
	
	@Test
	public void createRFPSOWInfrastructureProjectsAndFinancing() throws InterruptedException {
		
		new LoginPage().doLogin();
		Thread.sleep(3000);
		
		CreateRFPPage rfp = new CreateRFPPage();
		CreateRFPSOWPage sow = new CreateRFPSOWPage();
		
		
		//CCR Page inputs
				rfp.clickDraftNewRFP().enterCompanyEntityrequestingconflictcheck("SOW Infrastructure Projects And Financing")
				.enterPocFirstName("Samanthasree").enterPocLastName("TestLastName")
				.enterPocEmail("samanthasree@instrive.in").
				enterCounterOtherPartyName("TestCounterParty").clickContinue();
				Thread.sleep(2000);	
				
				//PI inputs
				rfp.enterProjectName("SOW Infrastructure Projects And Financing").enterShortDesc("Test Comments");
				Thread.sleep(5000);
				rfp.juridictionLanguage().participationBy().proposalBy().timeZone().checkRFPTermsandConditions().
				clickContinue(); 
				Thread.sleep(2000);	
				
				//Sow inputs
				sow.selectScopeInfrastructure().checkInfrastructureTender().InfrastructureTenderDate().InfrastructureTenderCmts("Sow Test Comments").
				checkInfrastructureStructuring().InfrastructureStructuringDate().InfrastructureStructuringCmts("Sow Test Comments").checkInfrastructureDueDiligence().
				InfrastructureDueDiligenceDate().InfrastructureDueDiligenceCmts("Sow Test Comments").checkInfrastructureSponsor().InfrastructureSponsorDate().
				InfrastructureSponsorCmts("Sow Test Comments").checkInfrastructureAgreements().InfrastructureAgreementsDate().InfrastructureAgreementsCmts("Sow Test Comments").
				checkInfrastructureFinancing().InfrastructureFinancingDate().InfrastructureFinancingCmts("Sow Test Comments").checkInfrastructureClosing().InfrastructureClosingDate().
				InfrastructureClosingCmts("Sow Test Comments").sowFileUpload();
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

