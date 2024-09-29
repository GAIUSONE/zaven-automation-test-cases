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

public class TC016_SOWCompetition extends ProjectHooks{
	
	@BeforeTest
	public void setReportValues() {
		testcaseName = "TC016 - Create an RFP to validate Sow Competition";
		testDescription = "Create an RFP to check Sow Competition";
		authors = "Samanthasree";
		category = "CU";
	}
	
	@Test
	public void createRFPSOWCompetition() throws InterruptedException {
		
		new LoginPage().doLogin();
		Thread.sleep(3000);
		
		CreateRFPPage rfp = new CreateRFPPage();
		CreateRFPSOWPage sow = new CreateRFPSOWPage();
		
		
		//CCR Page inputs
				rfp.clickDraftNewRFP().enterCompanyEntityrequestingconflictcheck("SOW Competition")
				.enterPocFirstName("Samanthasree").enterPocLastName("TestLastName")
				.enterPocEmail("samanthasree@instrive.in").
				enterCounterOtherPartyName("TestCounterParty").clickContinue();
				Thread.sleep(2000);	
				
				//PI inputs
				rfp.enterProjectName("SOW Competition").enterShortDesc("Test Comments");
				Thread.sleep(5000);
				rfp.juridictionLanguage().participationBy().proposalBy().timeZone().checkRFPTermsandConditions().
				clickContinue(); 
				Thread.sleep(2000);	
				
				//Sow inputs
				sow.selectScopeCompetition().checkCompetitionTransMerger().CompetitionTransMergerDate().
				competitionTransMergerCmts("Test Comments").checkCompetitionTransAdvice().CompetitionTransAdviceDate().
				competitionTransAdviceCmts("Test Comments").checkCompetitionBehaviouralCartel().
				CompetitionBehaviCartelDate().competitionBehaviCartelCmts("Test Comments").
				checkCompetitionBehaviouralAntitrust().CompetitionBehaviAntitrustDate().
				competitionBehaviAntitrustCmts("Test Comments").checkCompetitionBehaviouralStateAid().
				CompetitionBehaviStateAidDate().competitionBehaviStateAidCmts("Test Comments").
				checkCompetitionBehaviouralAdvice().CompetitionBehaviAdviceDate().competitionBehaviAdviceCmts("Test Comments").
				checkCompetitionBehaviouralOther().CompetitionBehaviOtherDate().
				competitionBehaviOtherCmts("Test Comments").sowFileUpload();
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

