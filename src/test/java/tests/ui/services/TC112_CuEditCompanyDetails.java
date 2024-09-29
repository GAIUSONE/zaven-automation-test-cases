
package tests.ui.services;

import org.testng.annotations.Test;
import com.force.base.ProjectHooks;
import com.microsoft.playwright.PlaywrightException;
import org.openqa.selenium.Keys;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import org.testng.annotations.BeforeTest;
import page.base.LoginPage;
import page.services.CorporatePreferredPanel;
import page.services.CorporateProfile;
import page.services.CorporateUser;
import page.services.CuRegistrationPage;
import page.base.AdminPage;

public class TC112_CuEditCompanyDetails extends ProjectHooks{
	
	@BeforeTest
	public void setReportValues() {
		testcaseName = "TC112 - CuEditCompanyDetails";
		testDescription = "Cu Edit Company Details";
		authors = "Samanthasree";
		category = "CU";
	}
	
	@Test
	public void CuEditCompanyDetails() throws InterruptedException {
		
		new LoginPage().doLogin();
		Thread.sleep(3000);
		
		
		//Declarations
		CorporateProfile profile = new CorporateProfile();
		CuRegistrationPage cureg = new CuRegistrationPage();
		CorporateUser user = new CorporateUser();
		
		profile.menuProfile();
		Thread.sleep(2000);
		
		
		user.btnEditIcon().clickUpdate();
		Thread.sleep(2000);
		
		/*
		cureg.clickSubmit();
		Thread.sleep(2000);
		*/	
		
		String Actual  = getInnerText("//*[text()='User updated successfully.']");
		String Expected = "User updated successfully.";
		if(Actual.equals(Expected))
			System.out.println( "Pass - User updated successfully for Company Details.");
		else
			System.out.println("Fail - Incorrect success message displayed");
		Thread.sleep(2000);
		
		
		profile.clickIndustryDetails();
		Thread.sleep(2000);
		user.btnEditIcon().clickUpdate();
		Thread.sleep(2000);
		
		
		String Actual1  = getInnerText("//*[text()='User updated successfully.']");
		String Expected1 = "User updated successfully.";
		if(Actual1.equals(Expected1))
			System.out.println( "Pass - User updated successfully for Company Details.");
		else
			System.out.println("Fail - Incorrect success message displayed");
		Thread.sleep(2000);
			
		}
     }	

