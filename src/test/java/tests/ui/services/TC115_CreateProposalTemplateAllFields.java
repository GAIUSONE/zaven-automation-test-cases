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

public class TC115_CreateProposalTemplateAllFields extends ProjectHooks{
	
	@BeforeTest
	public void setReportValues() {
		testcaseName = "TC115 - Create a Proposal Template";
		testDescription = "Create a Proposal Template";
		authors = "Samanthasree";
		category = "CU";
	}
	
	@Test
	public void createProposalTemplateAllFields() throws InterruptedException {
		
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
		
		//Pricing Page inputs
		lsp.clickPropPricingCurrency().ExpPropPricingCurrency("Proposal Comments").PropPricingTotalFeeAmt("123").PropPricingTotalFeeDesc("Proposal Comments").PropPricingEstimateAmt("123").
		PropPricingEstimateComment("Proposal Comments").PropPricingEstimateDesc("Proposal Comments").PropPricingEstimateAmt1("123").PropPricingEstimateAlternative().PropPricingEstimateAltDesc("Proposal Comments").
		PropPricingEstimateAltAmt1("123").PropPricingFixedFeeAmt("123").PropPricingFixedFeeComment("Proposal Comments").PropPricingFixedFeeDesc("Proposal Comments").PropPricingFixedFeeAmt1("123").
	    PropPricingFixedFeeAlternative().PropPricingFixedFeeAltDesc("123").PropPricingFixedFeeAltAmt1("123").PropPricingCappedFeeAmt("123").PropPricingCappedFeeComment("Proposal Comments").PropPricingCappedFeeDesc("Proposal Comments").
		PropPricingCappedFeeAmt1("123").PropPricingCappedFeeAlternative().PropPricingCappedFeeAltDesc("Proposal Comments").PropPricingCappedFeeAltAmt1("123").PropPricingHourlyRateFeeComment("Proposal Comments").
		PropPricingBlendedRateAmt("123").PropPricingBlendedRateComment("Proposal Comments").PropPricingBlendedRatesAlternative().PropPricingBlendedRatesAltDesc("Proposal Comments").PropPricingBlendedRatesAltAmt1("123").
		PropPricingContingentFeeAmt("123").PropPricingContingentFeeComment("Proposal Comments").PropPricingContingentFeeAlternative().PropPricingContingentFeeAltDesc("Proposal Comments").PropPricingContingentFeeAltAmt1("123").
		PropPricingAbortDiscountAmt("123").PropPricingAbortDiscountComment("Proposal Comments").PropPricingAbortDiscountAlternative().PropPricingAbortDiscountAltDesc("Proposal Comments").PropPricingAbortDiscountAltAmt1("123").
		PropPricingSuccessFeeAmt("123").PropPricingSuccessFeeComment("Proposal Comments").PropPricingSuccessFeeAlternative().PropPricingSuccessFeeAltDesc("Proposal Comments").PropPricingSuccessFeeAltAmt1("123").
		clickProPricingReverseAuction().ExpPropPricingReverseAuction("Proposal Comments").PropPricingReverseAuctionAlternative().PropPricingReverseAuctionAltDesc("Proposal Comments").PropPricingReverseAuctionAltAmt1("123").
		PropPricingFreeInitialAmt("123").PropPricingFreeInitialComment("Proposal Comments").PropPricingFreeInitialAlternative().PropPricingFreeInitialAltDesc("Proposal Comments").PropPricingFreeInitialAltAmt1("123").
		clickProPricingRetainer().ExpPropPricingRetainer("Proposal Comments").PropPricingRetainerAlternative().PropPricingRetainerAltDesc("Proposal Comments").PropPricingRetainerAltAmt1("123").PropPricingBudgetForProjectCmt("Proposal Comments").
		PropPricingBudgetForProjectDesc("Proposal Comments").PropPricingBudgetForProjectAmt("123").PropPricingBudgetForProjectAlternative().PropPricingBudgetForProjectAltDesc("Proposal Comments").PropPricingBudgetForProjectAltAmt1("123").
		clickProPricingModelOther().ExpPropPricingModelOther("Proposal Comments").PropPricingOtherAlternative().PropPricingOtherAltDesc("Proposal Comments").PropPricingOtherAltAmt1("123");
				
	
		lsp.clickProPricingWinningBidder().ExpPropPricingWinningBidder("Proposal Comments").clickProPricingPercentage().ExpPropPricingPercentage("Proposal Comments").clickProPricingClient().ExpPropPricingClient("Proposal Comments").
		clickProPricingTravel().ExpPropPricingTravel("Proposal Comments").clickProPricingHotel().ExpPropPricingHotel("Proposal Comments").clickProPricingApplicableTax().ExpPropPricingApplicableTax("Proposal Comments").
		PropPricingApplicableTaxAlternative().PropPricingApplicableTaxAltDesc("123").PropPricingApplicableTaxAltAmt1("123").clickProPricingAddAdditional().ExpPropPricingAddAdditional("Proposal Comments").clickProPricingInstruction().
		ExpPropPricingInstruction("Proposal Comments").clickProPricingEmail().ExpPropPricingEmail("Proposal Comments").clickProPricingMemo().ExpPropPricingMemo("Proposal Comments").clickProPricingPowerPointSlides().
		ExpPropPricingPowerPointSlides("Proposal Comments").clickProPricingLegalOpinion().ExpPropPricingLegalOpinion("Proposal Comments").clickProPricingLegalDocument().ExpPropPricingLegalDocument("Proposal Comments").clickProPricingComment().
		ExpPropPricingComment("Proposal Comments").clickProPricingJurisdictionLanguage().ExpPropPricingJurisdictionLanguageComment("Proposal Comments").clickProPricingLocalLegalCounsel().ExpPropPricingLocalLegalCounselComment("Proposal Comments").
		clickProPricingTaxAdvice().ExpPropPricingTaxAdviceComment("Proposal Comments").clickProPricingNoTravel().ExpPropPricingNoTravelComment("Proposal Comments").clickProPricingAssumptionsExclusionsOther().
		PricingAdditionalInfo("Proposal Comments");
		Thread.sleep(2000);
		rfp.clickContinue();
		Thread.sleep(2000);
		
		//OKI Page inputs
		
		lsp.clickPropOkiLocationLeadPartner().ExpPropOkiLocationLeadPartnerCmt("Proposal Comments").OKILeadPatnerName("Samantha").OKILeadPatnerSurName("Sree").OKILeadPatnerLocation("Chennai").OkiEmail().OkiTitle().OkiRole().OkiYearsOfExp().
		OKIHourlyRate("123").clickPropOkiBiographies().ExpPropOkiBiographiesCmt("Proposal Comments").OKIFileUpload().
		clickPropOkiStaffing().ExpPropOkiStaffingCmt("Proposal Comments").clickPropOkiDiversity().ExpPropOkiDiversityCmt("Proposal Comments").
		clickPropOkiDEIRequirement().ExpPropOkiDEIRequirementCmt("Proposal Comments").clickPropOkiKeyTeamReq().ExpPropOkiKeyTeamReqCmt("Proposal Comments").clickPropOkiDiversityOther().ExpPropOkiDiversityOtherCmt("Proposal Comments").
		clickPropOkiCredentials().ExpPropOkiCredentialsCmt("Proposal Comments").clickPropOkiDisaggregation().ExpPropOkiDisaggregationCmt("Proposal Comments").clickPropOkiDescription().ExpPropOkiDescriptionCmt("Proposal Comments").
		clickPropOkiDisaggregationOther().ExpPropOkiDisaggregationOtherCmt("Proposal Comments").clickPropOkiNameOfService().ExpPropOkiNameOfServiceCmt("Proposal Comments").clickPropOkiNameOfServiceOther().ExpPropOkiNameOfServiceOtherCmt("Proposal Comments").
		clickPropOkiExpectedEfficiency().ExpPropOkiExpectedEfficiencyCmt("Proposal Comments").clickPropOkiExpectedEfficiencyOther().ExpPropOkiExpectedEfficiencyOtherCmt("Proposal Comments").clickPropOkiUSP().ExpPropOkiUSPCmt("Proposal Comments").
		clickPropOkiRequestForAddInfo().ExpPropOkiRequestForAddInfoCmt("Proposal Comments").clickPropOkiRequestForclarification().ExpPropOkiRequestForclarificationCmt("Proposal Comments").clickPropOkiEmail().ExpPropOkiEmailCmts("Proposal Comments").
		clickPropOkivideoAudio().ExpPropOkivideoAudio("Proposal Comments").clickPropOkiBoth().ExpPropOkiBoth("Proposal Comments").clickPropOkiPresentFeeProposal().ExpPropOkiPresentFeeProposalCmt("Proposal Comments").clickPropOkiPresentFeeProposalCall().
		ExpPropOkiPresentFeeProposalCallCmt("Proposal Comments").clickPropOkiVideo().ExpPropOkiVideoCmt("Proposal Comments").clickPropOkiShortVideo().ExpPropOkiShortVideoCmt("Proposal Comments").clickPropOkiOther().ExpPropOkiOtherCmt("Proposal Comments").
		okiAdditionalInformation("Additional Information Comments");
		
		Thread.sleep(2000);
		lsp.clickPreviewProposal();
		Thread.sleep(2000);
		
		rfp.clickSaveTemplate().enterTemplateName("Automation Template All Fields").clickSubmit2();
		Thread.sleep(2000);
		
		
		String Actual  = getInnerText("//*[text()='New Template Added successfully.']");
		String Expected = "New Template Added successfully.";
		if(Actual.equals(Expected))
			System.out.println( "Pass - New Template Added successfully.");
		else
			System.out.println("Fail - New Template Added successfully.");
		Thread.sleep(2000);	
			}
      }	

