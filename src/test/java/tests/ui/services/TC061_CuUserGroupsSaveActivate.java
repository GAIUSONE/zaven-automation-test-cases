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

public class TC061_CuUserGroupsSaveActivate extends ProjectHooks{
	
	@BeforeTest
	public void setReportValues() {
		testcaseName = "TC061 - CuCreateUserGroupsSave&Activate";
		testDescription = "Create a Group and Activate it";
		authors = "Samanthasree";
		category = "CU";
	}
	
	@Test
	public void CuCreateUser() throws InterruptedException {
	
	new LoginPage().doLogin();
	Thread.sleep(3000);
	
	CreateRFPPage rfp = new CreateRFPPage();
	CorporateUser user = new CorporateUser();
	
	user.CuUsers().userGroup().clickAddUserGroup().enterGroupName("TestGroup").enterGroupDescription("Group123").groupAddMembers().
	groupAddMember().expandGroupAddMember().expandGroupAddGroup().btnGroupAddMember().btnSaveAndActivate();
	
	Thread.sleep(3000);
	
	}
}	
