
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

public class TC028_SOWRestructuring extends ProjectHooks{
	
	@BeforeTest
	public void setReportValues() {
		testcaseName = "TC028 - Cu Sow Restructuring";
		testDescription = "Create an RFP to validate Sow Restructuring for sub options";
		authors = "Samanthasree";
		category = "CU";
	}
	
	@Test
	public void createRFPSOWRestructuring() throws InterruptedException {
		
		new LoginPage().doLogin();
		Thread.sleep(3000);
		
		CreateRFPPage rfp = new CreateRFPPage();
		CreateRFPSOWPage sow = new CreateRFPSOWPage();
		CreateRFPSOWPage2 sow2 = new CreateRFPSOWPage2();
		
		//CCR Page inputs
				rfp.clickDraftNewRFP().enterCompanyEntityrequestingconflictcheck("SOW Restructuring")
				.enterPocFirstName("Samanthasree").enterPocLastName("TestLastName")
				.enterPocEmail("samanthasree@instrive.in").
				enterCounterOtherPartyName("TestCounterParty").clickContinue();
				Thread.sleep(2000);	
				
				//PI inputs
				rfp.enterProjectName("SOW Restructuring").enterShortDesc("Test Comments");
				Thread.sleep(5000);
				rfp.juridictionLanguage().participationBy().proposalBy().timeZone().checkRFPTermsandConditions().
				clickContinue(); 
				Thread.sleep(2000);	
				
				//Sow inputs
				sow2.selectScopeRestructuring().selectScopeRoleInRestructuring().checkRestructuringRescue().
				RestructuringRescueDate().RestructuringRescueCmts("Sow Test Comments").checkRestructuringMoratorium().
				RestructuringMoratoriumDate().RestructuringMoratoriumCmts("Sow Test Comments").checkRestructuringEquitySwaps().
				RestructuringEquitySwapsDate().RestructuringEquitySwapsCmts("Sow Test Comments").checkRestructuringCorporateRestructurings().
				RestructuringCorporateRestructuringsDate().RestructuringCorporateRestructuringsCmts("Sow Test Comments").
				checkRestructuringCorporateFinance().RestructuringCorporateFinanceDate().RestructuringCorporateFinanceCmts("Sow Test Comments").
				checkRestructuringReceiverships().RestructuringReceivershipsDate().RestructuringReceivershipsCmts("Sow Test Comments").
				checkRestructuringInsolvency().RestructuringInsolvencyDate().RestructuringInsolvencyCmts("Sow Test Comments").
				checkRestructuringContingency().RestructuringContingencyDate().RestructuringContingencyCmts("Sow Test Comments").
				checkRestructuringEnforcing().RestructuringEnforcingDate().RestructuringEnforcingCmts("Sow Test Comments").
				checkRestructuringDistressed().RestructuringDistressedDate().RestructuringDistressedCmts("Sow Test Comments").
				checkRestructuringOther().RestructuringOtherDate().RestructuringOtherCmts("Sow Test Comments");
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

