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

public class TC072_ProposalEditUser extends ProjectHooks{
	
	@BeforeTest
	public void setReportValues() {
		testcaseName = "TC072 - ProposalEditUser";
		testDescription = "Proposal Edit User";
		authors = "Samanthasree";
		category = "CU";
	}
	
	@Test
	public void ProposalEditUser() throws InterruptedException {
		
		new LoginPage().doLoginLSP();
		Thread.sleep(3000);
		
		CorporateUser user = new CorporateUser();
		
		user.CuUsers().clickEdit().editUserFirstName("123").editUserLastName("123").editUserTitle("123").editUserDepartment("123").clickUpdate();
		Thread.sleep(3000);
		
		
		
		
			}
      }	

