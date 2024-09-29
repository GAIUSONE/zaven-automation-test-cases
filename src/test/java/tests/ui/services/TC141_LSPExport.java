package tests.ui.services;

import org.testng.annotations.Test;
import com.force.base.ProjectHooks;
import com.microsoft.playwright.PlaywrightException;
import org.openqa.selenium.Keys;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import org.testng.annotations.BeforeTest;
import page.services.LSPViewProposalPage;
import page.base.AdminPage;
import page.base.LoginPage;
import page.services.CreateRFPPage;
import page.services.CreateRFPSOWPage;
import page.services.CuRegistrationPage;
import page.services.ProposalSOWPage;

public class TC141_LSPExport extends ProjectHooks{
	
	@BeforeTest
	public void setReportValues() {
		testcaseName = "TC143 - Save a proposal as drafts";
		testDescription = "Save an existing proposal as drafts";
		authors = "Samanthasree";
		category = "CU";
	}
	
	@Test
	public void CreateLSPSaveAsDrafts() throws InterruptedException {
		
		new LoginPage().doLoginLSP();
		Thread.sleep(3000);
		
		CreateRFPPage rfp = new CreateRFPPage();
		LSPViewProposalPage lsp = new LSPViewProposalPage();
		ProposalSOWPage psow = new ProposalSOWPage();
		
		
		//CCR Page inputs
			
		lsp.clickViewProposal().clickWeConfirmCCR();
		rfp.clickSubmit();
		
		//PI Page inputs
		
		lsp.clickPropDescOfProject().ExpandProposalDescOfProject("Proposal Comments").clickProposalComplexityOfProject().ExpandProposalComplexity("Proposal Comments").
		clickProposalObjectiveInRelation().ExpandProposalObjectiveInRelation("Proposal Comments").clickProposalJurisdictionLanguage().ExpandProposalJurisdictionLanguage("Proposal Comments").
		clickProposalGoverningLaw().ExpandProposalGoverningLaw("Proposal Comments").clickProposalLanguageOfLegalDoc().ExpandProposalLanguageOfLegalDoc("Proposal Comments").
		clickProposalPreferredLanguage().ExpandProposalPreferredLanguage("Proposal Comments").clickProposalIntentionToParticipateBy().ExpandProposalIntentionToParticipateBy("Proposal Comments").
		clickProposalTermsAndConditionsPreagreed().ExpandProposalTermsAndConditionsPreagreed("Proposal Comments").clickProposalNotPreagreed().ExpandProposalNotPreagreed("Proposal Comments").
		clickProposalConditionsApply().ExpandProposalConditionsApply("Proposal Comments").piAdditionalInformation("Proposal Comments");
		Thread.sleep(2000);			
		
		rfp.clickContinue();
		
		//SOW Page inputs
		
		psow.clkPropSowCommercialLegalAdvice().ExpPropSowCommercialLegalAdvice("Sow Comments").clkPropSowCommercialContractDrafting().ExpPropSowCommercialContractDrafting("Proposal Comments").
		clkPropSowCommercialReview().ExpPropSowCommercialReview("Proposal Comments").clkPropSowCommercialNegotiation().ExpPropSowCommercialNegotiation("Proposal Comments").clkPropSowCommercialRegulatory().
		ExpPropSowCommercialRegulatory("Proposal Comments").clkPropSowCommercialOther().ExpPropSowCommercialOther("Proposal Comments").PropAdditionalInformation("Additional Information Comments");
		Thread.sleep(2000);
		rfp.clickContinue();
		Thread.sleep(2000);
		
		
		//Preview inputs
		lsp.menuExportProposal();
		String Actual  = getInnerText("//*[text()='Proposal exported successfully.']");
		String Expected = "Proposal exported successfully.";
		if(Actual.equals(Expected))
			System.out.println( "Pass - Proposal exported successfully.");
				else
			System.out.println("Fail - Incorrect success message displayed");
			Thread.sleep(2000);
				}	
		  }	
		
	

