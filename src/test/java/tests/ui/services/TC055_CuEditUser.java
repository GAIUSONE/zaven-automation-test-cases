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

public class TC055_CuEditUser extends ProjectHooks{
	
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
		
		CorporateUser user = new CorporateUser();
		
		user.CuUsers().clickEdit().editUserFirstName("123").editUserLastName("123").editUserTitle("123").editUserDepartment("123").clickUpdate();
		Thread.sleep(3000);
			}
      }	

