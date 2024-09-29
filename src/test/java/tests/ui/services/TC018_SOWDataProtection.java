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

public class TC018_SOWDataProtection extends ProjectHooks{
	
	@BeforeTest
	public void setReportValues() {
		testcaseName = "TC017 - Create an RFP";
		testDescription = "Create an RFP with only mandatory fields";
		authors = "Samanthasree";
		category = "CU";
	}
	
	@Test
	public void createRFPSOWDataProtectionAndPrivacy() throws InterruptedException {
		
		new LoginPage().doLogin();
		Thread.sleep(3000);
		
		CreateRFPPage rfp = new CreateRFPPage();
		CreateRFPSOWPage sow = new CreateRFPSOWPage();
		
		
		//CCR Page inputs
				rfp.clickDraftNewRFP().enterCompanyEntityrequestingconflictcheck("SOW Data Protection")
				.enterPocFirstName("Samanthasree").enterPocLastName("TestLastName")
				.enterPocEmail("samanthasree@instrive.in").
				enterCounterOtherPartyName("TestCounterParty").clickContinue();
				Thread.sleep(2000);	
				
				//PI inputs
				rfp.enterProjectName("Data Protection").enterShortDesc("Data Protection");
				Thread.sleep(5000);
				rfp.juridictionLanguage().participationBy().proposalBy().timeZone().checkRFPTermsandConditions().
				clickContinue(); 
				Thread.sleep(2000);	
				
				//Sow inputs
				sow.selectScopeDataProtection().checkDataDataProtection().DataDataProtectionDate().
				DataDataProtectionCmts("Sow Test Comments").checkDataIssues().DataIssuesDate().
				DataIssuesCmts("Sow Test Comments").checkDataReview().DataReviewDate().DataReviewCmts("Sow Test Comments").
				checkDataLocalise().DataLocaliseDate().DataLocaliseCmts("Sow Test Comments").
				checkDataChangeInLaw().DataChangeInLawDate().DataChangeInLawCmts("Sow Test Comments").
				checkDataRepapering().DataRepaperingDate().DataRepaperingCmts("Sow Test Comments").
				checkDataDirectMarketing().DataDirectMarketingDate().DataDirectMarketingCmts("Sow Test Comments").
				checkDataRecordRetention().DataRecordRetentionDate().DataRecordRetentionCmts("Sow Test Comments").
				checkDatasecuritybreach().DatasecuritybreachDate().DatasecuritybreachCmts("Sow Test Comments").
				checkDataSubjectRights().DataSubjectRightsDate().DataSubjectRightsCmts("Sow Test Comments").
				checkDataRegulatoryInvestigation().DataRegulatoryInvestigationDate().DataRegulatoryInvestigationCmts("Sow Test Comments").
				checkDataRetainer().DataRetainerDate().DataRetainerCmts("Sow Test Comments").checkDataTraining().
				DataTrainingDate().DataTrainingCmts("Sow Test Comments").checkDataOther().DataOtherDate().
				DataOtherCmts("Sow Test Comments").sowFileUpload();
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

