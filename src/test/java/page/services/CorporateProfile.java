
package page.services;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import com.force.base.ProjectHooks;
import com.force.config.ConfigurationManager;
import com.microsoft.playwright.BrowserContext;
import com.microsoft.playwright.Locator;
import com.microsoft.playwright.PlaywrightException;
import com.microsoft.playwright.options.WaitForSelectorState;

import page.base.ZavenHooks;

public class CorporateProfile extends ProjectHooks{
	
//----------------------------------------------------------->  Profile Page  <-------------------------------------------------------------------//
	
	//--------------->Click > Menu > Profile 
		public CorporateProfile menuProfile() throws InterruptedException {
			click("(//*[@data-testid='ExpandMoreTwoToneIcon'])", "Profile Dropdown Arrow");
			click("(//*[text()='Profile'])", "Profile ");
			Thread.sleep(3000);
			return this;}
		
		
	//--------------->Click > Menu > Profile 
		public CorporateProfile editProfile() throws InterruptedException {
			click("(//button[text()='Edit Profile'])", "Profile ");
			return this;}
		
		
	//--------------->Click > Edit Profile > First Name
		public CorporateProfile editFirstName(String firstname) throws InterruptedException {
			edit("(//input[@name='first_name'])", firstname , "Firstname");
			return this;}
		
		
		
	//--------------->Click > Edit Profile > Last Name
		public CorporateProfile editLastName(String lastname) throws InterruptedException {
			edit("(//input[@name='surname'])", lastname , "Lastname");
			return this;}
		
		
		
	//--------------->Click > Edit Profile > Title
		public CorporateProfile editTitle(String title) throws InterruptedException {
			edit("(//input[@name='title'])", title , "Title");
			return this;}
		
		
		
	//--------------->Click > Edit Profile > Department
		public CorporateProfile editDepartment(String department) throws InterruptedException {
			edit("(//input[@name='department'])", department , "Department");
			return this;}
		
		
		
	//--------------->Click > Change Password button.
		public CorporateProfile btnChangePassword() throws InterruptedException {
			click("(//button[text()='Change Password'])","Change Password");
			return this;}
		
	
		
	//--------------->Click > New Password
		public CorporateProfile newPassword(String newpassword) throws InterruptedException {
			type("(//input[@name='new_password'])", newpassword , "New Password");
			return this;}	
		
		
	//--------------->Click > Confirm Password
		public CorporateProfile confirmPassword(String confirmpassword) throws InterruptedException {
			type("(//input[@name='confirm_password'])", confirmpassword , "Confirm Password");
			return this;}	
		
	
	//--------------->Click > Industry Details
		public CorporateProfile clickIndustryDetails() throws InterruptedException {
			click("(//button[text()='Industry Details'])","Industry Details");
			return this;}
		
			
		
}