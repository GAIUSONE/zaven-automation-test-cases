package tests.ui.services;

import org.testng.annotations.Test;
import com.force.base.ProjectHooks;
import com.microsoft.playwright.PlaywrightException;
import org.openqa.selenium.Keys;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import org.testng.annotations.BeforeTest;
import page.base.AdminPage;
import page.base.LoginPage;
import page.services.Analytics;
import page.services.CorporateUser;
import page.services.CreateRFPPage;
import page.services.HelpCentre;


public class TC214_CorporateDeleteUser extends ProjectHooks{
	
	@BeforeTest
	public void setReportValues() {
		testcaseName = "TC214 - Corporate Delete a User";
		testDescription = "Verify Corporate Delete a User";
		authors = "Samanthasree";
		category = "CU";
	}
	
	@Test
	public void corporateDeleteUser() throws InterruptedException {
		
		new LoginPage().doLogin();
		Thread.sleep(3000);
		

		CreateRFPPage rfp = new CreateRFPPage();
		CorporateUser user = new CorporateUser();
		
		user.CuUsers().clickAddNewUser().enterUserFirstName("Testuserz").enterUserLastName("TestLastNamez").enterUserEmail("xyzzz@gmisl.com").enterUserTitle("Tester").
		enterUserDepartment("QA");
		
		Thread.sleep(3000);
		
		rfp.clickSubmit();
		Thread.sleep(2000);	
		
		user.clickDelete().clickPopUpDelete();
		
		String Actual  = getInnerText("//*[text()='User deleted successfully.']");
		String Expected = "User deleted successfully.";
		if(Actual.equals(Expected))
			System.out.println( "Pass - User deleted successfully.");
		else
			System.out.println("Fail - Incorrect success message displayed");
		Thread.sleep(2000);	
		
			}
		
      }	
		
		
		 
		
	

