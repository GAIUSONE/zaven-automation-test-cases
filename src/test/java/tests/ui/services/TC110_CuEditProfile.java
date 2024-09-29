package tests.ui.services;

import org.testng.annotations.Test;
import com.force.base.ProjectHooks;
import org.testng.annotations.BeforeTest;
import page.base.LoginPage;
import page.services.CorporateProfile;
import page.services.CorporateUser;


public class TC110_CuEditProfile extends ProjectHooks{
	
	@BeforeTest
	public void setReportValues() {
		testcaseName = "TC110 - Cu Edit Profile";
		testDescription = "Edit Profile Cu";
		authors = "Samanthasree";
		category = "CU";
	}
	
	@Test
	public void preferredPanelRemoveStar() throws InterruptedException {
		
		new LoginPage().doLogin();
		Thread.sleep(3000);
		
		
		//Declarations
		CorporateProfile profile = new CorporateProfile();
		CorporateUser user = new CorporateUser();
		
		
		profile.menuProfile().editProfile().editFirstName("123").editLastName("123").editTitle("123").editDepartment("123");
		user.clickUpdate();
		
		Thread.sleep(2000);
		
		String Actual  = getInnerText("//*[text()='User updated successfully.']");
		String Expected = "User updated successfully.";
		if(Actual.equals(Expected))
			System.out.println( "Pass - User updated successfully.");
		else
			System.out.println("Fail - Incorrect success message displayed");
		Thread.sleep(2000);
		
				
		}
     }	

