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

public class TC020_SOWFinancingAndCapitalMarkets extends ProjectHooks{
	
	@BeforeTest
	public void setReportValues() {
		testcaseName = "TC003 - Create an RFP";
		testDescription = "Create an RFP with only mandatory fields";
		authors = "Samanthasree";
		category = "CU";
	}
	
	@Test
	public void createRFPSOWFinancingAndCapitalMarkets() throws InterruptedException {
		
		new LoginPage().doLogin();
		Thread.sleep(3000);
		
		CreateRFPPage rfp = new CreateRFPPage();
		CreateRFPSOWPage sow = new CreateRFPSOWPage();
		
		
		//CCR Page inputs
				rfp.clickDraftNewRFP().enterCompanyEntityrequestingconflictcheck("Financing And Capital Markets")
				.enterPocFirstName("Samanthasree").enterPocLastName("TestLastName")
				.enterPocEmail("samanthasree@instrive.in").
				 enterCounterOtherPartyName("TestCounterParty").clickContinue();
				Thread.sleep(2000);	
				
				//PI inputs
				rfp.enterProjectName("Financing And Capital Markets").enterShortDesc("Test Comments");
				Thread.sleep(5000);
				rfp.juridictionLanguage().participationBy().proposalBy().timeZone().checkRFPTermsandConditions().
				clickContinue(); 
				Thread.sleep(2000);	
				
				//Sow inputs
				sow.selectScopeFinancingAndCapitalMarkets().checkFinancingWeAgree().FinancingWeAgreeOther("Sow Testing Comments").checkFinancingWeRequest().
				FinancingWeRequest("Sow Test Comments").checkFinancingAsset().FinancingAssetDate().FinancingAssertComments("Sow Testing Comments").
				checkFinancingAssetStructuring().checkFinancingAssetDocumentation().checkFinancingAssetAdvisory().checkFinancingAssetDueDiligence().
				checkFinancingCorporateLending().FinancingCorporateLendingDate().FinancingCorporateLendingComments("Sow Testing Comments").
				checkFinancingDebtCapitalMarkets().FinancingCapitalMarketsDate().FinancingCapitalMarketsComments("Sow Testing Comments").checkFinancingEquityCapitalMarkets().
				FinancingEquityDate().FinancingEquityComments("Sow Test Comments").checkFinancingIslamicFinance().FinancingIslamicFinanceDate().
				FinancingIslamicFinanceComments("Sow Testing Comments").checkFinancingLeveraged().FinancingLeveragedDate().FinancingLeveragedComments("Sow Testing Comments").
				checkFinancingRealEstate().FinancingRealEstateDate().FinancingRealEstateComments("Sow Testing Comments").checkFinancingSecuritisation().FinancingSecuritisationDate().
				FinancingSecuritisationComments("Sow Testing Comments").checkFinancingDerivatives().checkFinancingCreditProducts().FinancingCreditProductsDate().
				FinancingCreditProductsComments("Sow Testing Comments").checkFinancingEquityProducts().FinancingEquityProductsDate().FinancingEquityProductsComments("Sow Testing Comments").
				checkFinancingIntrestRate().FinancingIntrestRateDate().FinancingIntrestRateComments("Sow Testing Comments").checkFinancingCommodity().FinancingCommodityDate().
				FinancingCommodityComments("Sow Testing Comments").checkFinancingETPPlatforms().FinancingETPPlatformsDate().FinancingETPPlatformsComments("Sow Testing Comments").
				checkFinancingPrimeBrokerage().FinancingPrimeBrokerageDate().FinancingPrimeBrokerageComments("Sow Testing Comments").checkFinancingCreditRisk().FinancingCreditRiskDate().
				FinancingCreditRiskComments("Sow Testing Comments").checkFinancingRepos().FinancingReposDate().FinancingReposComments("Sow Testing Comments").checkFinancingDerivativesOther().
				FinancingDerivativesOtherDate().FinancingDerivativesOtherComments("Sow Testing Comments").checkFinancingTrade().FinancingTradeDate().FinancingTradeComments("Sow Testing Comments").
				checkFinancingCorporateTrust().FinancingCorporateTrustDate().FinancingCorporateTrustComments("Sow Testing Comments").checkFinancingOther().FinancingCorporateOtherDate().
				FinancingOtherComments("Sow Testing Comments").checkFinancingRegulatory().FinancingRegulatoryDate().FinancingRegulatoryComments("Sow Testing Comments").checkFinancingEnforcement().
				FinancingEnforcementDate().FinancingEnforcementComments("Sow Testing Comments").sowFileUpload();
				rfp.clickContinue();
				
				
				//Pricing inputs
				rfp.selectCurrency().checkEstimate().checkFixedFee().checkCappedFee().clickContinue();
				Thread.sleep(2000);	
				
				//OKI inputs
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

