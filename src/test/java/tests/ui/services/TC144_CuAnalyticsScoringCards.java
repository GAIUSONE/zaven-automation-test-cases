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


public class TC144_CuAnalyticsScoringCards extends ProjectHooks{
	
	@BeforeTest
	public void setReportValues() {
		testcaseName = "TC144 - Cu Analytics";
		testDescription = "Verify analytics in Corporate";
		authors = "Samanthasree";
		category = "CU";
	}
	
	@Test
	public void CuAnalyticsScoringCards() throws InterruptedException {
		
		new LoginPage().doLogin();
		Thread.sleep(3000);
		
		Analytics ans = new Analytics();
		
		ans.analytics().scoringbreakdownON().byLegalServicesProvider("SAM GMAIL TEST COMPANY FINAL").byLeadPartner("Samanthasree CG2");
		Thread.sleep(3000);
		
		String Actual  = getInnerText("(//*[text()='Number of fee proposals'])[2]");
		String Expected = "Number of fee proposals";
		if(Actual.equals(Expected))
			System.out.println( "Pass - Number of fee proposals is displayed");
				else
			System.out.println("Fail - Incorrect success message displayed");
			Thread.sleep(2000);
				
			
			//Verification for PDF file downloaded
			ans.exportAsPDF();

			String ActualPDF  = getInnerText("//*[text()='PDF exported successfully.']");
			String ExpectedPDF = "PDF exported successfully.";
			if(Actual.equals(Expected))
				System.out.println( "Pass - PDF exported successfully.");
					else
				System.out.println("Fail - Incorrect success message displayed.");
				Thread.sleep(2000);
			
				
			//Verification for Excel downloaded.	
			ans.exportAsPDF();
			
			String ActualExcel  = getInnerText("//*[text()='Excel exported successfully.']");
			String ExpectedExcel = "Excel exported successfully.";
			if(Actual.equals(Expected))
				System.out.println( "Pass - Excel exported successfully.");
					else
				System.out.println("Fail - Incorrect success message displayed.");
				Thread.sleep(2000);
				
				
					}	
					
					
			  }	

		
		
		 
		
	

