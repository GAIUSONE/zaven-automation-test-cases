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

public class TC085_ProposalUserGroupAddAdmin extends ProjectHooks{
	
	@BeforeTest
	public void setReportValues() {
		testcaseName = "TC085 - ProposalUserGroupAddAdmin";
		testDescription = "User Group Add Admin";
		authors = "Samanthasree";
		category = "CU";
	}
	
	@Test
	public void ProposalUserGroupAddAdmin() throws InterruptedException {
	
	new LoginPage().doLoginLSP();
	Thread.sleep(3000);
	
	CreateRFPPage rfp = new CreateRFPPage();
	CorporateUser user = new CorporateUser();
	
		
	user.CuUsers().userGroup().btnTripleDot().btnMenuView();
	Thread.sleep(2000);
	user.btnUpdateMember().btnAddAdmin();
	Thread.sleep(2000);
	
	
	String Actual  = getInnerText("//*[text()='Member updated successfully.']");
	String Expected = "Member updated successfully.";
	if(Actual.equals(Expected))
		System.out.println( "Pass - Member updated successfully.");
	else
		System.out.println("Fail - Incorrect success message displayed");
	Thread.sleep(2000);	

	user.btnUpdate();
	Thread.sleep(2000);	
	
	}
}	
