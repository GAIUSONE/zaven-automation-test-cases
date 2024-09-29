package tests.ui.services;

import org.testng.annotations.Test;
import com.force.base.ProjectHooks;
import org.testng.annotations.BeforeTest;
import page.base.LoginPage;
import page.services.CorporateUser;
import page.services.CreateRFPPage;


public class TC216_ProposalDeleteUser extends ProjectHooks{
	
	@BeforeTest
	public void setReportValues() {
		testcaseName = "TC216 - Proposal Delete a User";
		testDescription = "Verify Proposal Delete a User";
		authors = "Samanthasree";
		category = "CU";
	}
	
	@Test
	public void proposalDeleteUser() throws InterruptedException {
		
		new LoginPage().doLoginLSP();
		Thread.sleep(3000);
		

		CreateRFPPage rfp = new CreateRFPPage();
		CorporateUser user = new CorporateUser();
		
		user.CuUsers().clickAddNewUser().enterUserFirstName("TestuserProposal").enterUserLastName("TestLastNameP").enterUserEmail("xyzzzproposaluser@gmisl.com").enterUserTitle("Tester").
		enterUserDepartment("QA");
		
		Thread.sleep(3000);
		
		rfp.clickSubmit();
		Thread.sleep(2000);	
		
		user.clickDelete().clickPopUpDelete();
		
		String Actual  = getInnerText("//*[text()='User deleted successfully.']");
		String Expected = "User deleted successfully.";
		if(Actual.equals(Expected))
			System.out.println( "Pass - User deleted successfully.");
		else
			System.out.println("Fail - Incorrect success message displayed");
		Thread.sleep(2000);	
		
			}
		
      }	
		
		
		 
		
	

