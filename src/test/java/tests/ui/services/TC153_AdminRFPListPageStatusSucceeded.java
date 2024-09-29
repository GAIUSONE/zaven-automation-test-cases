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


public class TC153_AdminRFPListPageStatusSucceeded extends ProjectHooks{
	
	@BeforeTest
	public void setReportValues() {
		testcaseName = "TC002 - Create CU Registration";
		testDescription = "CU Registration";
		authors = "Samanthasree";
	}
	
	@Test
	public void CreateCuAccount() throws InterruptedException { 
		
		
		LoginPage login = new LoginPage();
		AdminPage adm = new AdminPage();
		
		login.clickAcceptAllCookies();
		
		login.clickLogin().typeLoginEmail("admin@gaiusdev.com").typePassword("Abc@12345").clickCredancialsLoginButton();
		Thread.sleep(8000);
		adm.clickPayments();
		Thread.sleep(8000);
		adm.selectDropdownPaymentSucceeded();
		Thread.sleep(8000);
		
		
		String Actual = getInnerText("//div[text()='Succeeded'][1]");
		System.out.println(Actual);
	
		String Expected = "Succeeded";
		if(Actual.equals(Expected))
			System.out.println( "Pass - Status Succeeded only is displayed for the sorting");
				else
			System.out.println("Fail - Incorrect success message displayed.");
	
	
		}
	}
