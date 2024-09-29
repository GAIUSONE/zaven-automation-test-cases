package tests.ui.services;

import org.testng.annotations.Test;
import com.force.base.ProjectHooks;
import com.microsoft.playwright.PlaywrightException;
import org.openqa.selenium.Keys;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import org.testng.annotations.BeforeTest;
import page.services.CreateRFPSOWPage;

import page.base.AdminPage;
import page.base.LoginPage;
import page.services.CorporateUser;
import page.services.CreateRFPPage;
import page.services.CuRegistrationPage;

public class TC080_ProposalUserGroupDeleteGroup extends ProjectHooks{
	
	@BeforeTest
	public void setReportValues() {
		testcaseName = "TC080 - ProposalUserGroupDeleteGroup";
		testDescription = "Create a Group and Activate it";
		authors = "Samanthasree";
		category = "CU";
	}
	
	@Test
	public void ProposalUserGroupDeleteGroup() throws InterruptedException {
	
	new LoginPage().doLoginLSP();
	Thread.sleep(3000);
	
	CreateRFPPage rfp = new CreateRFPPage();
	CorporateUser user = new CorporateUser();
	
	user.CuUsers().userGroup().btnTripleDot().btnMenuEdit();
	Thread.sleep(2000);
	user.btnUpdateMember().btnDeleteGroup().btnDelete();
	Thread.sleep(2000);
	
	
	String Actual  = getInnerText("//*[text()='User Group deleted successfully.']");
	String Expected = "User Group deleted successfully.";
	if(Actual.equals(Expected))
		System.out.println( "Pass - User Group deleted successfully.");
	else
		System.out.println("Fail - Incorrect success message displayed");
	Thread.sleep(2000);	
	
	
	}
}	
