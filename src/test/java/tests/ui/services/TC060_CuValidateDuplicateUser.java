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
import page.services.CorporateUser;
import page.services.CreateRFPPage;
import page.services.CuRegistrationPage;

public class TC060_CuValidateDuplicateUser extends ProjectHooks{
	
	@BeforeTest
	public void setReportValues() {
		testcaseName = "TC035 - Cu Create User";
		testDescription = "Cu Create User";
		authors = "Samanthasree";
		category = "CU";
	}
	
	@Test
	public void CuCreateUser() throws InterruptedException {
		
		new LoginPage().doLogin();
		Thread.sleep(3000);
		
		CreateRFPPage rfp = new CreateRFPPage();
		CorporateUser user = new CorporateUser();
		
		user.CuUsers().clickAddNewUser().enterUserFirstName("Testuser1").enterUserLastName("TestLastName1").enterUserEmail("tempuser@gmisl.com").enterUserTitle("Tester").
		enterUserDepartment("QA");
		Thread.sleep(3000);
		rfp.clickSubmit();
		
		String Actual  = getInnerText("//*[text()='user already exists']");
		String Expected = "user already exists";
		if(Actual.equals(Expected))
			System.out.println( "Displayed User Already exist");
		else
			System.out.println("Text not found");
		Thread.sleep(2000);	
		
			}
		
      }	

