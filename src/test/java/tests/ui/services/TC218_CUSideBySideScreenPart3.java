package tests.ui.services;

import org.testng.annotations.Test;
import com.force.base.ProjectHooks;
import com.microsoft.playwright.PlaywrightException;
import org.openqa.selenium.Keys;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import org.testng.annotations.BeforeTest;

import page.base.AdminPage;
import page.base.LoginPage;
import page.services.CreateRFPPage;
import page.services.CuRegistrationPage;
import page.services.ProposalSideBySidePage;

public class TC218_CUSideBySideScreenPart3 extends ProjectHooks{
	
	@BeforeTest
	public void setReportValues() {
		testcaseName = "TC034 - Proposal Side by side select a bidder";
		testDescription = "Create an RFP with only mandatory fields";
		authors = "Samanthasree";
		category = "CU";
	}
	
	@Test
	public void proposalSideBySide() throws InterruptedException {
		
		new LoginPage().doLogin();
		Thread.sleep(3000);
		
		
		ProposalSideBySidePage side = new ProposalSideBySidePage();
	
		
		//Side By Side Page inputs
		side.clickViewRFP().enterSidePricing("4").enterSideAssumptionsExclusions("4").enterSideKeyTeamMembers("4").enterSideStaffing("4").enterSideDiversity("4").
		enterSideCredentials("4").enterSideDisaggregation("4").enterSideUSP("4").enterSideVideo("4").enterSideOther("4").clickViewFullProposal().clickClose().
		clickSelectWinningBidder().btnConfirm();
		Thread.sleep(3000);
		
		String Actual  = getInnerText("//*[text()='Winner selected successfully.']");
		String Expected = "Winner selected successfully.";
		if(Actual.equals(Expected))
			System.out.println( "Pass - Winner selected successfully.");
		else
			System.out.println("Fail - Incorrect success message displayed");
		Thread.sleep(2000);	
		
			}
		
			}
		
   

