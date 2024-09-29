package tests.ui.services;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import page.base.LoginPage;
import page.base.AdminPage;
import page.services.CuRegistrationPage;
import com.force.base.ProjectHooks;

public class TC002_CreateCuRegistration extends ProjectHooks{
	
	@BeforeTest
	public void setReportValues() {
		testcaseName = "TC002 - Corporate User Registration";
		testDescription = "Registration of a corporate user with Zaven Legal";
		authors = "Samanthasree";
		category = "Corporate Module";
		
	}
	
	@Test
	public void createCuRegistration() throws InterruptedException { 
		
		Thread.sleep(3000);
		LoginPage login = new LoginPage();
		CuRegistrationPage cureg = new CuRegistrationPage();
		AdminPage adm = new AdminPage();
		
		login.clickAcceptAllCookies();
		
		//Cu Registration Page 1
		
		cureg.clickSignUp().clickSignUpAsCorporate().typeCompanyName("Test Instrive Company")
		.uploadFile()
		.typefirstName("Samanthasree").typeLastName("CG")
		.typeCompanyAddress("Kambar Colony Chennai - 600040");
		
		Thread.sleep(3000);
		cureg.pageDown();
		
		cureg.typeZipCode("600040").typeCity("Chennai").selectCountry();
		Thread.sleep(2000);
		cureg.selectPhoneNumber("9003120988").typeEmail("testemailfakeid11@instrive.in")
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
		
		adm.clickCorporate().typeSearch("testemailfakeid11@instrive.in").clickApprove().btnApprove();
		
	
	}

}
