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

public class TC071_ProposalCreateUserGroups extends ProjectHooks{
	
	@BeforeTest
	public void setReportValues() {
		testcaseName = "TC035 - ProposalCreateUserGroups";
		testDescription = "Proposal Create User Group";
		authors = "Samanthasree";
		category = "CU";
	}
	
	@Test
	public void ProposalCreateUserGroups() throws InterruptedException {
		
		new LoginPage().doLoginLSP();
		Thread.sleep(3000);
		
		CreateRFPPage rfp = new CreateRFPPage();
		CorporateUser user = new CorporateUser();
		
		user.CuUsers().userGroup().clickAddUserGroup().enterGroupName("TestGroup").enterGroupDescription("Group123").groupAddMembers().
		groupAddMember().expandGroupAddMember().expandGroupAddGroup().btnGroupAddMember().btnSave();
		
		Thread.sleep(3000);
		
		String Actual  = getInnerText("//*[text()='User Group added successfully.']");
		String Expected = "User Group added successfully.";
		if(Actual.equals(Expected))
			System.out.println( "Pass - User Group added successfully.");
		else
			System.out.println("Fail - Incorrect success message displayed");
		Thread.sleep(2000);	

	
		}
	}	

