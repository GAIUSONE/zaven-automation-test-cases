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


public class TC145_CuAnalyticsServicesReview extends ProjectHooks{
	
	@BeforeTest
	public void setReportValues() {
		testcaseName = "TC145- Cu Analytics Services Review On";
		testDescription = "Verify analytics services review in Corporate Analytics";
		authors = "Samanthasree";
		category = "CU";
	}
	
	@Test
	public void CuAnalyticsServicesReview() throws InterruptedException {
		
		new LoginPage().doLogin();
		Thread.sleep(3000);
		
		Analytics ans = new Analytics();
		
		ans.analytics();
		Thread.sleep(3000);
		ans.servicesReviewON();
		Thread.sleep(3000);
		ans.servicesReviewLSP("SAM GMAIL TEST COMPANY FINAL").sRbyLeadPartner("Samanthasree").search("RFP Template");
		Thread.sleep(3000);
		
		String Actual  = getInnerText("(//*[text()='RFP Template with Mandatory Fields'])");
		String Expected = "RFP Template with Mandatory Fields";
		if(Actual.contains(Expected))
			System.out.println( "Pass - RFP Template with Mandatory Fields is displayed");
				else
			System.out.println("Fail - Incorrect success message displayed");
			Thread.sleep(2000);
			
					}	
						
			  }	

		
		
		 
		
	

