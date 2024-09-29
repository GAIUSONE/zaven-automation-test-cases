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

public class TC076_ProposalAddMultipleUsers extends ProjectHooks{
	
	@BeforeTest
	public void setReportValues() {
		testcaseName = "TC076 - ProposalAddMultipleUsers";
		testDescription = "Cu Create User";
		authors = "Samanthasree";
		category = "CU";
	}
	
	@Test
	public void ProposalAddMultipleUsers() throws InterruptedException {
		
		new LoginPage().doLoginLSP();
		Thread.sleep(3000);
		
		CreateRFPPage rfp = new CreateRFPPage();
		CorporateUser user = new CorporateUser();
		
		user.CuUsers().clickAddNewUser().enterUserFirstName("Testuser1").enterUserLastName("TestLastName1").enterUserEmail("Ptempuser@gmisl.com").enterUserTitle("Tester").
		enterUserDepartment("QA");
		
		Thread.sleep(2000);
		user.AddMultipleUser();
		
		user.enterUserTwoFirstName("Testuser2").enterUserTwoLastName("TestLastName2").enterUserTwoEmail("Ptempuser2@gmisl.com").enterUserTwoTitle("Tester").
		enterUserTwoDepartment("QA");
		
		Thread.sleep(2000);
		rfp.clickSubmit();
		
		String Actual  = getInnerText("//*[text()='Legal Service user added successfully.']");
		String Expected = "Legal Service user added successfully.";
		if(Actual.equals(Expected))
			System.out.println( "Pass - Legal Service user added successfully.");
		else
			System.out.println("Fail - Incorrect success message displayed");
		Thread.sleep(2000);	
		
		
			}
		
      }	

