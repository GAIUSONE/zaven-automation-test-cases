package tests.ui.services;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import page.base.LoginPage;
import page.base.AdminPage;
import page.base.HomePage;
import page.base.ZavenHooks;
import page.services.CreateRFPPage;
import page.services.CuRegistrationPage;
import com.force.base.ProjectHooks;

public class TC006_CreateCuRegistrationReject extends ProjectHooks{
	
	@BeforeTest
	public void setReportValues() {
		testcaseName = "TC006 - Create CU Registration Admin Recject ";
		testDescription = "CU Registration";
		authors = "Samanthasree";
		
	}
	
	@Test
	public void CreateCuAccount() throws InterruptedException { 
		
		Thread.sleep(3000);
		LoginPage login = new LoginPage();
		CuRegistrationPage cureg = new CuRegistrationPage();
		AdminPage adm = new AdminPage();
		
		login.clickAcceptAllCookies();
		
		//new LoginPage().clickAcceptAllCookies();
		//Cu Registration Page 1
		cureg.clickSignUp().clickSignUpAsCorporate().typeCompanyName("Test Instrive Company")
		.uploadFile()
		.typefirstName("Samanthasree").typeLastName("CG")
		.typeCompanyAddress("Kambar Colony Chennai - 600040");
		
		Thread.sleep(3000);
		cureg.pageDown();
		
		cureg.typeZipCode("600040").typeCity("Chennai").selectCountry();
		Thread.sleep(2000);
		cureg.selectPhoneNumber("9003120988").typeEmail("testemailfakeid14@instrive.in")
		.selectHeadquartersLocation();
		
		Thread.sleep(2000);
		cureg.pageDown();
		
		cureg.typeHeadquartersComments("Test Comments").clickJustOneMoreStep();
		
		//Cu Registration Page 2
		Thread.sleep(3000);
		
		cureg.selectIndustry().selectCompanySize().selectCompanyLegalDepartmentSize()
		.selectAverageAnnualLegalSpend();
		
		cureg.pageDown();
		
		cureg.selectHowdidyouhearaboutZaven().typeComments("Test Comments").checkZavenTermsOfUse().clickSubmit();
		Thread.sleep(3000);
		
		login.clickLogin().typeLoginEmail("admin@gaiusdev.com").typePassword("Abc@12345").clickCredancialsLoginButton();
		
		adm.clickCorporate().typeSearch("testemailfakeid14@instrive.in").clickReject().btnDecline();
	
		//Corporate declined successfully.
	
	}

}
