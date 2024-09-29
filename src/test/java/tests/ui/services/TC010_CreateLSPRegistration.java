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


public class TC010_CreateLSPRegistration extends ProjectHooks{
	
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
		login.clickLogin().typeLoginEmail("admin@gaiusdev.com").typePassword("Abc@12345").clickCredancialsLoginButton();
		
		adm.clickLegalServicesProviders().btnInviteLSP();
		Thread.sleep(2000);	
		adm.typeInviteFirstName("Automation").typeInviteLastName("AutomationLSP").typeInviteEmailAddress("watin56111@acentni.com")
		.btnSubmit();
		
		Thread.sleep(3000);
		adm.clickAdminProfileArrow().btnSignOut(); 
		
	}

}
