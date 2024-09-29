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

public class TC019_SOWEmployment extends ProjectHooks{
	
	@BeforeTest
	public void setReportValues() {
		testcaseName = "TC019 - Check Sow Subsections for Employement";
		testDescription = "Create an RFP with only mandatory fields";
		authors = "Samanthasree";
		category = "CU";
	}
	
	@Test
	public void createRFPSOWEmployment() throws InterruptedException {
		
		new LoginPage().doLogin();
		Thread.sleep(3000);
		
		CreateRFPPage rfp = new CreateRFPPage();
		CreateRFPSOWPage sow = new CreateRFPSOWPage();
		
		
				//CCR Page inputs
				rfp.clickDraftNewRFP().enterCompanyEntityrequestingconflictcheck("SOW Employement")
				.enterPocFirstName("Samanthasree").enterPocLastName("TestLastName")
				.enterPocEmail("samanthasree@instrive.in").
				enterCounterOtherPartyName("TestCounterParty").clickContinue();
				Thread.sleep(2000);	
				
				//PI inputs
				rfp.enterProjectName("SOW Employement").enterShortDesc("Test Comments");
				Thread.sleep(5000);
				rfp.juridictionLanguage().participationBy().proposalBy().timeZone().checkRFPTermsandConditions().
				clickContinue(); 
				Thread.sleep(2000);	
				
				//Sow inputs
				sow.selectScopeEmployment().checkEmploymentRetainer().EmploymentRetainerDate().EmploymentRetainerCmts("Sow Test Comments").
				checkEmploymentHRContracts().EmploymentHRContractsDate().EmploymentHRContractsCmts("Sow Test Comments").
				checkEmploymentDrafting().EmploymentDraftingDate().EmploymentDraftingCmts("Sow Test Comments").
				checkEmploymentpotentialNewHires().EmploymentpotentialNewHiresDate().EmploymentpotentialNewHiresCmts("Sow Test Comments").
				checkEmploymentRedundancy().EmploymentRedundancyDate().EmploymentRedundancyCmts("Sow Test Comments").
				checkEmploymentDismissal().EmploymentDismissalDate().EmploymentDismissalCmts("Sow Test Comments").
				checkEmploymentBenefits().EmploymentBenefitsDate().EmploymentBenefitsCmts("Sow Test Comments").checkEmploymentConsultants().
				EmploymentConsultantsDate().EmploymentConsultantsCmts("Sow Test Comments").checkEmploymentStaffArrangements().EmploymentStaffArrangementsDate().
				EmploymentStaffArrangementsCmts("Sow Test Comments").checkEmploymentOutsourcing().EmploymentOutsourcingDate().EmploymentOutsourcingCmts("Sow Test Comments").
				checkEmploymentGrievance().EmploymentGrievanceDate().EmploymentGrievanceCmts("Sow Test Comments").checkEmploymentDisciplinary().
				EmploymentDisciplinaryDate().EmploymentDisciplinaryCmts("Sow Test Comments").checkEmploymentCrossBorder().EmploymentCrossBorderDate().
				EmploymentCrossBorderCmts("Sow Test Comments").checkEmploymentImmigration().EmploymentImmigrationDate().EmploymentImmigrationCmts("Sow Test Comments").
				checkEmploymentDiscrimination().EmploymentDiscriminationDate().EmploymentDiscriminationCmts("Sow Test Comments").checkEmploymentInvestigation().
				EmploymentInvestigationDate().EmploymentInvestigationCmts("Sow Test Comments").checkEmploymentLegislation().EmploymentLegislationDate().
				EmploymentLegislationCmts("Sow Test Comments").checkEmploymentObligations().EmploymentObligationsDate().EmploymentObligationsCmts("Sow Test Comments").
				checkEmploymentProtecting().EmploymentProtectingsDate().EmploymentProtectingCmts("Sow Test Comments").checkEmploymentPerformance().EmploymentPerformanceDate().
				EmploymentPerformanceCmts("Sow Test Comments").checkEmploymentsickness().EmploymentsicknessDate().EmploymentsicknessCmts("Sow Test Comments").checkEmploymentRemuneration().
				EmploymentRemunerationDate().EmploymentRemunerationCmts("Sow Test Comments").checkEmploymentIncentives().EmploymentIncentivesDate().EmploymentIncentivesCmts("Sow Test Comments").
				checkEmploymentWhistleblowing().EmploymentWhistleblowingDate().EmploymentWhistleblowingCmts("Sow Test Comments").checkEmploymenthealth().EmploymenthealthDate().
				EmploymenthealthCmts("Sow Test Comments").checkEmploymentPensions().EmploymentPensionsDate().EmploymenthealthPensions("Sow Test Comments").checkEmploymentOther().
				EmploymentOther().EmploymenthealthOther("Sow Test Comments");
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

