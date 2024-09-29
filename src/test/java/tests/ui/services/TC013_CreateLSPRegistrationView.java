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


public class TC013_CreateLSPRegistrationView extends ProjectHooks{
	
	@BeforeTest
	public void setReportValues() {
		testcaseName = "TC002 - Create CU Registration";
		testDescription = "CU Registration";
		authors = "Samanthasree";
	// Dependent Test case  = Run TC012CreateLSPRegistrationMail.Java
	}
	
	@Test
	public void CreateCuAccount() throws InterruptedException { 
		
		Thread.sleep(3000);
		LoginPage login = new LoginPage();
		LSPRegistrationPage lspreg = new LSPRegistrationPage();
		CuRegistrationPage cureg = new CuRegistrationPage();
		AdminPage adm = new AdminPage();
		
		login.clickAcceptAllCookies();
			
		login.clickLogin().typeLoginEmail("admin@gaiusdev.com").typePassword("Abc@12345").clickCredancialsLoginButton();
		adm.clickLegalServicesProviders();
		
		adm.typeSearch("watin56111@acentni.com").clickView();
		
		Thread.sleep(3000);
		adm.clickAdminProfileArrow().btnSignOut();
		
		
	}

}
