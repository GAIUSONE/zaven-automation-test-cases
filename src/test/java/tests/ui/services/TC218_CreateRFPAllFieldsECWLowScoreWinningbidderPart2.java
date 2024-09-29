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

public class TC218_CreateRFPAllFieldsECWLowScoreWinningbidderPart2 extends ProjectHooks{
	
	@BeforeTest
	public void setReportValues() {
		testcaseName = "TC003 - Create an RFP";
		testDescription = "Create an RFP with only mandatory fields";
		authors = "Samanthasree";
		category = "CU";
	}
	
	@Test
	public void createRFP() throws InterruptedException {
		
		new LoginPage().doLogin();
		Thread.sleep(3000);
		
		//CCR Page inputs
		CreateRFPPage rfp = new CreateRFPPage();
		CreateRFPSOWPage sow = new CreateRFPSOWPage();
		
		
		//CCR Inputs
		rfp.clickDraftNewRFP().enterCompanyEntityrequestingconflictcheck("TestCompanyAllFields")
		.enterPocFirstName("Samanthasree").enterPocLastName("TestLastName").enterAddNewPerson().enterAddNewFirstName1("TestFirstName1")
		.enterAddNewLastName1("TestLastName1").enterPocEmail("samanthasree@instrive.in").clickAddMore()
		.enterAddMoreEmail1("testemail2@gmail.com").enterCounterOtherPartyName("TestCounterParty").clickAddNewParty()
		.enterCounterPartyName1("TestCounterParty").Breifdescupload().enterBreifDesc("Test Comments")
		.checkAgreeableToChineseWalls().clearConflictsBy()
		.checkNoteToLSPs().clickParellelCCRClearece().clickContinue();
		Thread.sleep(2000);	
			
		//PI Inputs
		rfp.enterProjectName("Create RFP All Fields").enterShortDesc("Test Comments")
		.enterComplexityComments("Complexity Test Comments").enterObjectiverelation("Test Comments").PiFileUpload()
		.juridictionLanguage().selectCountry().enterGoverningLaw("Test governinglaw")
		.selectLanguage().enterLegalDocumentation("Test Comments").prefferedLanguage().enterLanguageOfCorrespondence("Test Comments")
		.participationBy().proposalBy().timeZone().checkECW().checkRFPTermsandConditions().checkPreAgreed().clickTermsCondition();
		Thread.sleep(2000);
		rfp.PiFileUploadTofS().clickContinue();
		Thread.sleep(2000);
		
		//SOW Inputs
		sow.selectScopeCommercial().checkCommLegalAdvice().CommLegalAdviceDate().enterCommLegalAdviceCmts("Test Sow Comments").
		checkCommContractdrafting().CommContractdraftingDate().enterCommContractdraftingCmts("Test Sow Comments").
		checkCommContractReview().CommContractReviewDate().enterCommContractReviewCmts("Test Sow Comments").checkCommNegotiation().
		CommNegotiationDate().enterCommNegotiationCmts("Test Sow Comments").checkCommRegulatory().CommRegulatoryDate().
		enterCommRegulatoryCmts("Test Sow Comments").checkCommOther().CommOtherDate().enterCommOtherCmts("Test Sow Comments").
		enterCommercialGblCmts("Test Sow Comments").sowFileUpload();
		rfp.clickContinue();
		
		
		//Pricing inputs
		rfp.selectCurrency().checkEstimate().EstimateCmts("Test Comments").checkFixedFee().FixedFeeCmts("Test Comments").
		checkCappedFee().CappedfeeCmts("Test Comments").checkHourlyRateFee().HourlyRateFee("Test Comments").
		checkBlendedRates().BlendedRates("Test Comments").checkContingentfee().Contingentfee("Test Comments").
		checkAbortdiscount().Abortdiscount("Test Comments").checkSuccessfee().Successfee("Test Comments").
		checkReverseAuction().ReverseAuction("Test Comments").checkFreeInitial().FreeInitial("Test Comments").
		checkRetainer().Retainer("Test Comments").checkBudgetForProject().BudgetValue("20").
		BudgetComments("Test Comments").checkModelOther().ModelOtherComment("Test Comments");
		Thread.sleep(2000);
		rfp.checkIfExpensesNotCovered().checkPercentage().checkSameAsClient().clickeconomy().click3stars().
		checkApplicableTax().applicableTax("Test Comments").clickAddAdditionalAssumptions().
		checkDateOfInstruction().selectduration().dateOfInstruction("Test Comments").
		checkWorkProductFormat().checkemail().checkmemo().checkpowerpointslides().checklegalopinion().
		checklegaldocumentsdrafting().workproductComments("Test Comments").checkJurisdiction().
		multiselcectJurisdictionCountry().jurisdictionLanguageComments("Test Comments").
		clickLocalLegal().localLegalComments("Test Comments").checkTaxAdviceExcluded().
		TaxAdviceExcludedComments("Test Comments").checkNoTravel().NoTravelComments("Test Comments").
		checkOtherPricing().OtherPricingComments("Test Comments");
		rfp.ECWPricing("10").ECWAssumption("20");
		rfp.clickContinue();
		
		//OKI Inputs
		 rfp.checkKeyTeamMember().checkKeyTeamMembersCountry().leadPartnerComments("Test Comments").checkBiographies().
		checkBiographiesWPic().checkBiographiesWOPic().BiographiesComments("Test Comments").checkStaffing().
		StaffingComments("Test Comments").checkDiversity().DiversityComments("Test Comments").
		checkDEIRequirement().checkAtleast().enterpercentage("10").checkDiversityOther().
		DiversityOtherComments("Test Comments").checkCredentials().CredentialsComments("Test Comments").
		checkDisaggregation().checkDisaggregationDescName().DisaggregationDescNameComments("Test Comments").
		checkDisaggregationOther().DisaggregationOtherComments("Test Comments").checkNameOfSP().
		checkOutsourcingOther().OutsourcingComments("Test Comments").checkOKIOthers().
		ExpectedEfficiencyComments("Test Comments").checkExpectedEffOther().ExpectedEffOtherComments("Test Comments").
		checkUSP().USPComments("Test Comments").checkRequestForAdd().clickWeEntertain().checkRequestemail().
		checkRequestVideoAudio().checkRequestBoth().RequestForAddComments("Test Comments").checkPresentation().
		checkOrganiseMeeting().PresentationComments("Test Comments").checkVideo().checkshortVideoAddition().
		VideoComments("Test Comments").checkPresentationOthers().OKIOtherComments("Test Comments");
		 rfp.ECWKeyTeam("10").ECWStaffing("10").ECWDiversity("10").ECWCredentials("10").
		 ECWDisaggregation("10").ECWUSP("10").ECWOthers("10");
		 rfp.clickContinue();
					
		//Bidders inputs
		rfp.clickSelectBidders().checkLegalServicesProviders().clickConfirm().clickPreviewRFP();
		
		
	
		//Preview inputs
		rfp.clickSubmit();
		Thread.sleep(5000);	
	
	}
        }	

