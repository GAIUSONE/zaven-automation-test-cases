
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
import page.services.CorporateServicesReview;
import page.services.CorporateUser;
import page.services.CuRegistrationPage;
import page.base.AdminPage;

public class TC113_CuServicesReviewAdd extends ProjectHooks{
	
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
		CorporateServicesReview services = new CorporateServicesReview();
		CuRegistrationPage cureg = new CuRegistrationPage();
		CorporateUser user = new CorporateUser();
		
		services.CuServicesReview();
		Thread.sleep(2000);
		services.CuAddReview();
		Thread.sleep(2000);
		services.CuQualityOfServices();
		
		
		cureg.typeComments("Test Comments").clickSubmit();
		Thread.sleep(2000);
			
		
		String Actual  = getInnerText("//*[text()='Successfully created Legal Service review.']");
		String Expected = "Successfully created Legal Service review.";
		if(Actual.equals(Expected))
			System.out.println( "Pass - Successfully created Legal Service review.");
		else
			System.out.println("Fail - Incorrect success message displayed");
		Thread.sleep(2000);
		
		
		
			
		}
     }	

