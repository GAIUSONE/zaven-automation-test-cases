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


public class TC155_AdminRFPListPageSearch extends ProjectHooks{
	
	@BeforeTest
	public void setReportValues() {
		testcaseName = "TC155 - AdminRFPListPageSearch";
		testDescription = "Search functionality in admin page";
		authors = "Samanthasree";
	}
	
	@Test
	public void AdminRFPListPageSearch() throws InterruptedException { 
		
		LoginPage login = new LoginPage();
		AdminPage adm = new AdminPage();
		
		login.clickAcceptAllCookies();
		
		login.clickLogin().typeLoginEmail("admin@gaiusdev.com").typePassword("Abc@12345").clickCredancialsLoginButton();
		Thread.sleep(8000);
		adm.clickRFPsList();
		Thread.sleep(8000);
	
		adm.typeSearch("Test Check 09-07");
		Thread.sleep(8000);
		
		String Actual = getInnerText("//p[text()='1–1 of 1']");
		System.out.println(Actual);
	
		String Expected = "1–1 of 1";
		if(Actual.equals(Expected))
			System.out.println( "Pass - 1 row displayed hence search succesfull.");
				else
			System.out.println("Fail - Incorrect success message displayed.");
		Thread.sleep(2000);
	}

}