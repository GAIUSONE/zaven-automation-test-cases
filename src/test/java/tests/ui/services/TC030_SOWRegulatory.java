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

public class TC030_SOWRegulatory extends ProjectHooks{
	
	@BeforeTest
	public void setReportValues() {
		testcaseName = "TC30 - Create Sow Regulatory";
		testDescription = "Create an RFP with only mandatory fields";
		authors = "Samanthasree";
		category = "CU";
	}
	
	@Test
	public void createRFPSOWRegulatory() throws InterruptedException {
		
		new LoginPage().doLogin();
		Thread.sleep(3000);
		
		CreateRFPPage rfp = new CreateRFPPage();
		CreateRFPSOWPage sow = new CreateRFPSOWPage();
		CreateRFPSOWPage2 sow2 = new CreateRFPSOWPage2();
		
		//CCR Page inputs
				rfp.clickDraftNewRFP().enterCompanyEntityrequestingconflictcheck("SOW Regulatory")
				.enterPocFirstName("Samanthasree").enterPocLastName("TestLastName")
				.enterPocEmail("samanthasree@instrive.in").
				enterCounterOtherPartyName("TestCounterParty").clickContinue();
				Thread.sleep(2000);	
				
				//PI inputs
				rfp.enterProjectName("SOW Regulatory").enterShortDesc("Test Comments");
				Thread.sleep(5000);
				rfp.juridictionLanguage().participationBy().proposalBy().timeZone().checkRFPTermsandConditions().
				clickContinue(); 
				Thread.sleep(2000);	
				
				//Sow inputs
				sow2.selectScopeRegulatory().checkRegulatoryScopingQuestions().selectScopeRegulatoryIndustryType().checkKeyTeamMembersCountry().
				RegulatoryTargetEntitiesCmts("12345").RegulatoryInternalEntitiesCmts("12345").checkRegulatoryAnalysis().
				RegulatoryAnalysisDate().RegulatoryAnalysisCmts("Sow Test Comments").checkRegulatoryLicence().RegulatoryLicenceDate().
				RegulatoryLicenceCmts("Sow Test Comments").checkRegulatoryOwnership().RegulatoryOwnerShipDate().RegulatoryOwnerShipCmts("Sow Test Comments").
				checkRegulatoryForeign().RegulatoryForeignDate().RegulatoryForeignCmts("Sow Test Comments").checkRegulatoryAssistance().RegulatoryAssistanceDate().
				RegulatoryAssistanceCmts("Sow Test Comments").checkRegulatoryLine().RegulatoryLineDate().RegulatoryLineCmts("Sow Test Comments").
				checkRegulatoryInternalReorganisation().RegulatoryInternalReorganisationDate().RegulatoryInternalReorganisationCmts("Sow Test Comments").
				checkRegulatoryOutsourcing().RegulatoryOutsourcingDate().RegulatoryOutsourcingCmts("Sow Test Comments").checkRegulatoryInvestigation().
				RegulatoryInvestigationDate().RegulatoryInvestigationCmts("Sow Test Comments").checkRegulatoryOther().RegulatoryOtherDate().RegulatoryOtherCmts("Sow Test Comments");
				
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

