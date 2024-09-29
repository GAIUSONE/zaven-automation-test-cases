package tests.ui.services;

import org.testng.annotations.Test;
import com.force.base.ProjectHooks;
import org.testng.annotations.BeforeTest;
import page.base.LoginPage;
import page.services.HelpCentre;


public class TC120_CuCuTriggerMailToSupportHelpCentre extends ProjectHooks{
	
	@BeforeTest
	public void setReportValues() {
		testcaseName = "TC120 - Cu Help Center Trigger Mail To Support";
		testDescription = "Trigger a mail to support from help centre";
		authors = "Samanthasree";
		category = "CU";
	}
	
	@Test
	public void CuHelpCenterTriggerMailToSupport() throws InterruptedException {
		
		new LoginPage().doLogin();
		Thread.sleep(3000);
		
		//Declarations
		HelpCentre help = new HelpCentre();
			
		help.helpCentre().helpSupportEmail().sendSupportEmail().btnSendEmail();
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