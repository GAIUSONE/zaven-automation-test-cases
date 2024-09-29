package tests.ui.services;

import org.testng.annotations.Test;
import com.force.base.ProjectHooks;
import org.testng.annotations.BeforeTest;
import page.base.LoginPage;
import page.services.CorporateDashboard;



public class TC122_CURFPListAbortStatus extends ProjectHooks{
	
	@BeforeTest
	public void setReportValues() {
		testcaseName = "TC122 - Cu RFP Abort Status";
		testDescription = "Test case to verify abort funtionality in CU dashboard";
		authors = "Samanthasree";
		category = "CU";
	}
	
	@Test
	public void CURFPListAbortStatus() throws InterruptedException {
		
		new LoginPage().doLogin();
		Thread.sleep(3000);
		
		//Declarations
		CorporateDashboard cudashboard = new CorporateDashboard();
			
		cudashboard.btnAbort().btnAbortPopup();
		Thread.sleep(2000);
		
		String Actual  = getInnerText("//*[text()='Rfp aborted successfully.']");
		String Expected = "Rfp aborted successfully.";
		if(Actual.equals(Expected))
			System.out.println( "Pass - Rfp aborted successfully.");
		else
			System.out.println("Fail - Incorrect success message displayed");
		Thread.sleep(2000);
		
		
		
		
		
	}
}