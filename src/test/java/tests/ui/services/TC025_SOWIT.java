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

public class TC025_SOWIT extends ProjectHooks{
	
	@BeforeTest
	public void setReportValues() {
		testcaseName = "TC025 - Create an RFP";
		testDescription = "Create an RFP with only mandatory fields";
		authors = "Samanthasree";
		category = "CU";
	}
	
	@Test
	public void createRFPSOWIT() throws InterruptedException {
		
		new LoginPage().doLogin();
		Thread.sleep(3000);
		
		CreateRFPPage rfp = new CreateRFPPage();
		CreateRFPSOWPage sow = new CreateRFPSOWPage();
		CreateRFPSOWPage2 sow2 = new CreateRFPSOWPage2();
		
		//CCR Page inputs
				rfp.clickDraftNewRFP().enterCompanyEntityrequestingconflictcheck("SOW IT")
				.enterPocFirstName("Samanthasree").enterPocLastName("TestLastName")
				.enterPocEmail("samanthasree@instrive.in").
				enterCounterOtherPartyName("TestCounterParty").clickContinue();
				Thread.sleep(2000);	
				
				//PI inputs
				rfp.enterProjectName("SOW IT").enterShortDesc("Test Comments");
				Thread.sleep(5000);
				rfp.juridictionLanguage().participationBy().proposalBy().timeZone().checkRFPTermsandConditions().
				clickContinue(); 
				Thread.sleep(2000);	
				
				//Sow inputs
				
				sow2.selectScopeIT().checkITPrivacy().ITPrivacyDate().ITPrivacyCmts("Sow Test Comments").checkITOutsourcing().ITOutsourcingDate().
				ITOutsourcingCmts("Sow Test Comments").checkITTech().ITTechDate().ITTechCmts("Sow Test Comments").checkITLicensing().ITLicensingDate().
				ITLicensingCmts("Sow Test Comments").checkITFintech().ITFintechDate().ITFintechCmts("Sow Test Comments").checkITOther().ITOtherDate().
				ITOtherCmts("Sow Test Comments").checkITKickOff().ITKickOffDate().ITKickOffCmts("Sow Test Comments").checkITDocumentation().ITDocumentationDate().
				ITDocumentationCmts("Sow Test Comments").checkITNegotiation().ITNegotiationDate().ITNegotiationCmts("Sow Test Comments").checkITClosing().ITClosingDate().
				ITClosingCmts("Sow Test Comments").checkITMemoOfAdvice().ITMemoOfAdviceDate().ITMemoOfAdviceCmts("Sow Test Comments");
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

