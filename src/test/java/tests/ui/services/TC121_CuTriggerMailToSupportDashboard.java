package tests.ui.services;

import org.testng.annotations.Test;
import com.force.base.ProjectHooks;
import org.testng.annotations.BeforeTest;
import page.base.LoginPage;
import page.services.HelpCentre;


public class TC121_CuTriggerMailToSupportDashboard extends ProjectHooks{
	
	@BeforeTest
	public void setReportValues() {
		testcaseName = "TC121 - Cu Trigger Mail To Support from Dashboard";
		testDescription = "Trigger a mail to support from Dashboard";
		authors = "Samanthasree";
		category = "CU";
	}
	
	@Test
	public void CuTriggerMailToSupportDashboard() throws InterruptedException {
		
		new LoginPage().doLogin();
		Thread.sleep(3000);
		
		//Declarations
		HelpCentre help = new HelpCentre();
			
		help.helpSupportEmail().sendSupportEmail().btnSendEmail();
		Thread.sleep(2000);
		
		String Actual  = getInnerText("//*[text()='Mail sent successfully.']");
		String Expected = "Mail sent successfully.";
		if(Actual.equals(Expected))
			System.out.println( "Pass - Mail sent successfully.");
		else
			System.out.println("Fail - Incorrect success message displayed");
		Thread.sleep(2000);
		
		
		
		
		
	}
}