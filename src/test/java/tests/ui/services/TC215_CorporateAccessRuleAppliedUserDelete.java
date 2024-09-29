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


public class TC215_CorporateAccessRuleAppliedUserDelete extends ProjectHooks{
	
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
		
		user.CuUsers();
		Thread.sleep(2000);	
		user.clickDelete().clickPopUpDelete();
		
		
		String Actual  = getInnerText("//*[text()='Unable to delete the user. The user is assigned to an RFP.']");
		String Expected = "Unable to delete the user. The user is assigned to an RFP.";
		if(Actual.equals(Expected))
			System.out.println( "Pass - Unable to delete the user. The user is assigned to an RFP.");
		else
			System.out.println("Fail - Incorrect success message displayed");
		Thread.sleep(2000);	
		
	
		
		
		
		
			}
		
      }	
		
		
		 
		
	

