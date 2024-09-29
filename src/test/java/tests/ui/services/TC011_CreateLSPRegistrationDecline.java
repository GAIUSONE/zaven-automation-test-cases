package tests.ui.services;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import page.base.LoginPage;
import page.base.AdminPage;
import page.base.HomePage;
import page.base.ZavenHooks;
import page.services.CreateRFPPage;
import page.services.LSPRegistrationPage;
import com.force.base.ProjectHooks;
import page.services.CuRegistrationPage;


public class TC011_CreateLSPRegistrationDecline extends ProjectHooks{
	
	@BeforeTest
	public void setReportValues() {
		testcaseName = "TC002 - Create CU Registration";
		testDescription = "CU Registration";
		authors = "Samanthasree";
	}
	
	@Test
	public void CreateCuAccount() throws InterruptedException { 
		
		Thread.sleep(3000);
		LoginPage login = new LoginPage();
		LSPRegistrationPage lspreg = new LSPRegistrationPage();
		CuRegistrationPage cureg = new CuRegistrationPage();
		AdminPage adm = new AdminPage();
		
		login.clickAcceptAllCookies();
			
		lspreg.clickSignUp().clickSignUpAsLsp().clickemail("sipoc86790@adstam.com").clickAccessCode("3srchilul1hms7").clickContinue();
		
		Thread.sleep(3000);
		
		lspreg.typeLspCompanyName("LSP Test Company Automation").lspUploadFile().typeLspfirstName("SamanthasreeLSP").typeLspLastName("LSPSreeAutomationlastname")
		.typeLspCompanyAddress("Kambar Colony Chennai - 600040").typeLspZipCode("600053").typeCity("Bengalure").selectLspCountry()
		.selectLspPhoneNumber("9003120988").typeCompanyPersonEmail
		("sipoc86790@adstam.com").typeCommunicationEmail("sipoc86790@adstam.com").typeAutomaticCc("sipoc86790@adstam.com").clickContinue();
		
		Thread.sleep(3000);
		//cureg.pageDown();
		lspreg.checkAll().typeComment1().typeComment2().clickContinue();
		Thread.sleep(3000);
		lspreg.checkAll().typeComment1().typeComment2().typeComment3().typeotherComment().clickContinue();
		Thread.sleep(3000);
		lspreg.selectLspMultiselcectCountry().typeComment1().clickContinue();
		Thread.sleep(3000);
		lspreg.checkAll().typeotherComment().clickContinue();
		Thread.sleep(3000);
		lspreg.lspUploadITIncluding().typeoitsecuritypackage().lspUploadDataProtection().typeDataProtectionPolicy().lspUploadApproachProfessional().
		typeProfessionalIndemnityInsurance().lspUploadCCP().typeConflictCheckPolicy().lspUploadESGPolicy().typeEsgPolicy().checkReportToThirdParty()
		.checkReportToThirdParty().lspUploadReportToThirdParty().typeReportToThirdParty().checkExternalValidation().lspUploadStandardBusiness()
		.typeBusinessEngagementTc().clickTermsofServices().clickSubmit();
		Thread.sleep(3000);
		
		login.clickLogin().typeLoginEmail("admin@gaiusdev.com").typePassword("Abc@12345").clickCredancialsLoginButton();
		adm.clickLegalServicesProviders();
		
		Thread.sleep(3000);
		adm.typeSearch("sipoc86790@adstam.com").clickReject().btnDecline();
		
		Thread.sleep(3000);
		adm.clickAdminProfileArrow().btnSignOut();
		
		
	}

}
