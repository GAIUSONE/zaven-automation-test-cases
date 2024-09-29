package tests.ui.services;

import org.testng.annotations.Test;
import com.force.base.ProjectHooks;
import com.microsoft.playwright.PlaywrightException;

import io.netty.handler.codec.compression.Snappy;

import org.openqa.selenium.Keys;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import org.testng.annotations.BeforeTest;
import page.base.AdminPage;
import page.base.LoginPage;
import page.services.Analytics;



public class TC150_LSPAnalyticsInvitationsOutcomes extends ProjectHooks{
	
	@BeforeTest
	public void setReportValues() {
		testcaseName = "TC144 - Cu Analytics";
		testDescription = "Verify analytics in Corporate";
		authors = "Samanthasree";
		category = "CU";
	}
	
	@Test
	public void CuAnalytics() throws InterruptedException {
		
		new LoginPage().doLoginLSP();
		Thread.sleep(3000);
		
		Analytics ans = new Analytics();
		
		ans.analytics().invitationsOutcomesON().legalServicesProvider("SAM INSTRIVE CU Test Company123");
		Thread.sleep(3000);
		ans.selectDateRange("01/07/2024 - 31/07/2025");
		Thread.sleep(3000);
		
		String Actual  = getInnerText("(//*[text()='SAM INSTRIVE CU Test Company123'])[2]");
		String Expected = "SAM INSTRIVE CU Test Company123";
		if(Actual.equals(Expected))
			System.out.println( "Pass - SAM INSTRIVE CU Test Company123 is displayed");
				else
			System.out.println("Fail - Incorrect success message displayed");
			Thread.sleep(2000);
				
			
			//Verification for PDF file downloaded
			ans.exportAsPDFOutcomes();

			String ActualPDF  = getInnerText("//*[text()='PDF exported successfully.']");
			String ExpectedPDF = "PDF exported successfully.";
			if(Actual.equals(Expected))
				System.out.println( "Pass - PDF exported successfully.");
					else
				System.out.println("Fail - Incorrect success message displayed.");
				Thread.sleep(2000);
			
				
			//Verification for Excel downloaded.	
			ans.exportAsPDFOutcomes();
			
			String ActualExcel  = getInnerText("//*[text()='Excel exported successfully.']");
			String ExpectedExcel = "Excel exported successfully.";
			if(Actual.equals(Expected))
				System.out.println( "Pass - Excel exported successfully.");
					else
				System.out.println("Fail - Incorrect success message displayed.");
				
					}	
					
					
			  }	

		
		
		 
		
	

