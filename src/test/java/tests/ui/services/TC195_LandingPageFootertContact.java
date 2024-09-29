package tests.ui.services;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import page.base.LoginPage;
import page.base.HomePage;
import com.force.base.ProjectHooks;


public class TC195_LandingPageFootertContact extends ProjectHooks{
	
	@BeforeTest
	public void setReportValues() {
		testcaseName = "TC195 - Verification for footer Contact";
		testDescription = "Verification for footer Contact";
		authors = "Samanthasree";
	}
	
	@Test
	public void LandingPageFooterContact() throws InterruptedException { 
		
		Thread.sleep(3000);
		LoginPage login = new LoginPage();
		HomePage home = new HomePage();
		
		
		login.clickAcceptAllCookies();
		home.footerContact();
		home.contactUsFirstName("TestName").contactUsLastName("TestLastName").contactUsWorkMail("Samanthasree@instrive.in").
		contactUsSubject("Test email for automail for automation testing").contactUsMessage("Hi Team").btnSubmit();
		Thread.sleep(3000);
		
		
		String Actual  = getInnerText("//*[text()='Contact details sent successfully.']");
		String Expected = "Contact details sent successfully.";
		if(Actual.equals(Expected))
			System.out.println( "Pass - Contact details sent successfully.");
		else
			System.out.println("Fail - Incorrect success message displayed");
		Thread.sleep(2000);
		
	}


}
