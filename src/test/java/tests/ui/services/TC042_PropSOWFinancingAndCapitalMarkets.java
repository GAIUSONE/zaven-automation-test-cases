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
import page.services.LSPViewProposalPage;
import page.services.ProposalSOWPage;

public class TC042_PropSOWFinancingAndCapitalMarkets extends ProjectHooks{
	
	@BeforeTest
	public void setReportValues() {
		testcaseName = "TC003 - Create an RFP";
		testDescription = "Create an RFP with only mandatory fields";
		authors = "Samanthasree";
		category = "CU";
	}
	
	@Test
public void propSOWFinancingAndCapitalMarkets() throws InterruptedException {
		
		new LoginPage().doLoginLSP();
		Thread.sleep(3000);
		
		CreateRFPPage rfp = new CreateRFPPage();
		LSPViewProposalPage lsp = new LSPViewProposalPage();
		ProposalSOWPage psow = new ProposalSOWPage();
		
		
		//CCR Page inputs
		
		lsp.clickViewProposal().clickWeConfirmCCR();
		rfp.clickSubmit();
		
		//PI Page inputs
		
		lsp.clickPropDescOfProject().clickProposalComplexityOfProject().clickProposalJurisdictionLanguage().clickProposalGoverningLaw().
		clickProposalLanguageOfLegalDoc().clickProposalPreferredLanguage().clickProposalIntentionToParticipateBy().clickProposalTermsAndConditionsPreagreed()
		.piAdditionalInformation("Additional Information Comments");
		Thread.sleep(3000);
		rfp.clickContinue();
		Thread.sleep(3000);
		
		//SOW Page inputs
		
		psow.clkPropSowFinancingChinese().ExpPropSowFinancingChinese("Proposal Comments").clkPropSowFinancingExclusiveBasis().ExpPropSowFinancingExclusiveBasis("Proposal Comments").
		clkPropSowFinancingLeasing().ExpPropSowFinancingLeasing("Proposal Comments").clkPropSowFinancingStructuring().ExpPropSowFinancingStructuring("Proposal Comments").
		clkPropSowFinancingDocumentation().ExpPropSowFinancingDocumentation("Proposal Comments").clkPropSowFinancingAdvisory().ExpPropSowFinancingAdvisory("Proposal Comments").
		clkPropSowFinancingDueDiligence().ExpPropSowFinancingDueDiligence("Proposal Comments").clkPropSowFinancingLending().ExpPropSowFinancingLending("Proposal Comments").clkPropSowFinancingDebt().
		ExpPropSowFinancingDebt("Proposal Comments").clkPropSowFinancingEquity().ExpPropSowFinancingEquity("Proposal Comments").clkPropSowFinancingIslamic().ExpPropSowFinancingIslamic("Proposal Comments").
		clkPropSowFinancingLeveraged().ExpPropSowFinancingLeveraged("Proposal Comments").clkPropSowFinancingRealEstate().ExpPropSowFinancingRealEstate("Proposal Comments").clkPropSowFinancingSecuritisation().
		ExpPropSowFinancingSecuritisation("Proposal Comments").clkPropSowFinancingDerivatives().ExpPropSowFinancingDerivatives("Proposal Comments").clkPropSowFinancingStructuredCredit().
		ExpPropSowFinancingStructuredCredit("Proposal Comments").clkPropSowFinancingStructuredEquity().ExpPropSowFinancingStructuredEquity("Proposal Comments").clkPropSowFinancingInterestRate().
		ExpPropSowFinancingInterestRate("Proposal Comments").clkPropSowFinancingLinkedTransactions().ExpPropSowFinancingLinkedTransactions("Proposal Comments").clkPropSowFinancingETPPlatforms().
		ExpPropSowFinancingETPPlatforms("Proposal Comments").clkPropSowFinancingBrokerage().ExpPropSowFinancingBrokerage("Proposal Comments").clkPropSowFinancingRiskMitigation().
		ExpPropSowFinancingRiskMitigation("Proposal Comments").clkPropSowFinancingRepos().ExpPropSowFinancingInterestRepos("Proposal Comments").clkPropSowFinancingDerivativesOther().
		ExpPropSowFinancingDerivativesOther("Proposal Comments").clkPropSowFinancingTrade().ExpPropSowFinancingTrade("Proposal Comments").clkPropSowFinancingTrust().ExpPropSowFinancingTrust("Proposal Comments").
		clkPropSowFinancingTransactionsOther().ExpPropSowFinancingTransactionsOther("Proposal Comments").clkPropSowFinancingCompliance().ExpPropSowFinancingCompliance("Proposal Comments").clkPropSowFinancingEnforcement().
		ExpPropSowFinancingEnforcement("Proposal Comments").PropAdditionalInformation("Additional Information Comments");
		Thread.sleep(2000);
		rfp.clickContinue();
		Thread.sleep(2000);
		
		//Pricing Page inputs
		
		lsp.clickPropPricingCurrency().PropPricingTotalFeeAmt("123").PropPricingTotalFeeDesc("Proposal Comments").PropPricingEstimateAmt("123").
		PropPricingEstimateComment("Proposal Comments").PropPricingEstimateDesc("Proposal Comments").PropPricingEstimateAmt1("123").
		PropPricingFixedFeeAmt("123").PropPricingFixedFeeComment("Proposal Comments").PropPricingFixedFeeDesc("Proposal Comments").PropPricingFixedFeeAmt1("123").
		PropPricingCappedFeeAmt("123").PropPricingCappedFeeComment("Proposal Comments").PropPricingCappedFeeDesc("Proposal Comments").PropPricingCappedFeeAmt1("123").
		clickProPricingNotAddAdditional();
		rfp.clickContinue();
		Thread.sleep(3000);
		
		//OKI Page inputs
		
		lsp.clickPropOkiLocationLeadPartner().OKILeadPatnerName("Samantha").OKILeadPatnerSurName("Sree").OKILeadPatnerLocation("Chennai").OkiEmail().OkiTitle().OkiRole().OkiYearsOfExp().
		OKIHourlyRate("123").clickPropOkiBiographies().okiAdditionalInformation("Additional Information Comments");
		
		Thread.sleep(3000);
		lsp.clickPreviewProposal();
		Thread.sleep(2000);
		
		//Preview Proposal
		
		rfp.clickSubmit();
		Thread.sleep(2000);
		
			}
		
      }	

