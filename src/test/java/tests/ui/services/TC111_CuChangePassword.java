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
import page.services.CuRegistrationPage;
import page.base.AdminPage;

public class TC111_CuChangePassword extends ProjectHooks{
	
	@BeforeTest
	public void setReportValues() {
		testcaseName = "TC111 - CuChangePassword";
		testDescription = "Cu Change Password for the profile.";
		authors = "Samanthasree";
		category = "CU";
	}
	
	@Test
	public void CuChangePassword() throws InterruptedException {
		
		new LoginPage().doLogin();
		Thread.sleep(3000);
		
		
		//Declarations
		CorporateProfile profile = new CorporateProfile();
		CuRegistrationPage cureg = new CuRegistrationPage();
		
		
		profile.menuProfile().btnChangePassword().newPassword("Offline@123").confirmPassword("Offline@123");
		Thread.sleep(2000);
		
		cureg.clickSubmit();
		Thread.sleep(2000);
		
		String Actual  = getInnerText("//*[text()='Password updated successfully.']");
		String Expected = "Password updated successfully.";
		if(Actual.equals(Expected))
			System.out.println( "Pass - Password updated successfully.");
		else
			System.out.println("Fail - Incorrect success message displayed");
		Thread.sleep(2000);
		
				
		}
     }	

