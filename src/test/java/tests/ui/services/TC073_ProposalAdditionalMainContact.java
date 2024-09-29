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

public class TC073_ProposalAdditionalMainContact extends ProjectHooks{
	
	@BeforeTest
	public void setReportValues() {
		testcaseName = "TC035 - Cu Create User";
		testDescription = "Cu Create User";
		authors = "Samanthasree";
		category = "CU";
	}
	
	@Test
	public void ProposalAdditionalMainContact() throws InterruptedException {
		
		new LoginPage().doLoginLSP();
		Thread.sleep(3000);
		
		CreateRFPPage rfp = new CreateRFPPage();
		CorporateUser user = new CorporateUser();
		
		user.CuUsers().clickAdditionalMainContact().clickAdd();
		
		String Actual  = getInnerText("//*[text()='Main contact person added successfully.']");
		String Expected = "Main contact person added successfully.";
		if(Actual.equals(Expected))
			System.out.println( "Pass - Main contact person added successfully.");
		else
			System.out.println("Fail - Incorrect success message displayed");
		Thread.sleep(2000);	
		
		
		
			}
		
      }	

