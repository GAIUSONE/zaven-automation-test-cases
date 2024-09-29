
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

public class CorporateUser extends ProjectHooks{
	
//----------------------------------------------------------->  Users  <-------------------------------------------------------------------//
	
	
	//Click > Menu > Users 
		public CorporateUser CuUsers() throws InterruptedException {
			click("(//*[text()='Users'])", "Users");
			return this;}
	
	
	//Click > Button Add New User
		public CorporateUser clickAddNewUser() throws InterruptedException {
			click("(//button[text()='Add New User'])", "Add New User");
			return this;}

	
	//Type > User >  First Name
		public CorporateUser enterUserFirstName(String firstname) throws InterruptedException {
			type("//*[@name='users.0.first_name']", firstname , "First Name");
			return this;}
	
	
	//Type > User >  Last Name
		public CorporateUser enterUserLastName(String lastname) throws InterruptedException {
			type("//*[@name='users.0.surname']", lastname , "Last Name");
			return this;}
		
		
	//Type > User >  Email Address
		public CorporateUser enterUserEmail(String email) throws InterruptedException {
			type("//*[@name='users.0.email']", email , "Email Address");
			return this;}	
		
	
	//Type > User >  Title
		public CorporateUser enterUserTitle(String title) throws InterruptedException {
			type("//*[@name='users.0.title']", title , "Title");
			return this;}
				
	//Type > User > Department
		public CorporateUser enterUserDepartment(String department) throws InterruptedException {
			type("//*[@name='users.0.department']", department , "Department");
			return this;}
		
		
	//Click > Button > Remove Main Contact
		public CorporateUser clickRemoveMainContact() throws InterruptedException {
			click("(//button[text()='Remove Main Contact'])[1]", "Remove Main Contact");
			return this;}
		
		
	//Click > Button > Remove
		public CorporateUser clickRemove() throws InterruptedException {
			click("(//button[text()='Remove'])", "Remove");
			return this;}
		
		
	//Click > Button > Additional Main Contact
		public CorporateUser clickAdditionalMainContact() throws InterruptedException {
			click("(//button[text()='Additional Main Contact'])[1]", "Additional Main Contact");
			return this;}
		
	//Click > Button > Add
		public CorporateUser clickAdd() throws InterruptedException {
			click("(//button[text()='Add'])", "Add");
			return this;}
		
		
	//Click > Button > Edit
		public CorporateUser clickEdit() throws InterruptedException {
			click("(//button[text()='Edit'])[1]", "Edit");
			return this;}	
		
		
	//Type > User >  First Name
		public CorporateUser editUserFirstName(String firstname) throws InterruptedException {
			click("//*[@name='first_name']", "First Name");
			edit("//*[@name='first_name']", firstname , "First Name");
			return this;}
			
			
	//Type > User >  Last Name
		public CorporateUser editUserLastName(String lastname) throws InterruptedException {
			click("//*[@name='surname']", "Last Name");
			edit("//*[@name='surname']", lastname , "Last Name");
			return this;}
			
			
	//Type > User >  Title
		public CorporateUser editUserTitle(String title) throws InterruptedException {
			click("//*[@name='title']", "Title");
			edit("//*[@name='title']", title , "Title");
			return this;}
				
		
	//Type > User > Department
		public CorporateUser editUserDepartment(String department) throws InterruptedException {
			click("//*[@name='department']", "Title");
			edit("//*[@name='department']", department , "Title");
			return this;}
				
	
	//Click > Button > Update
		public CorporateUser clickUpdate() throws InterruptedException {
			click("(//button[text()='Update'])", "Update");
			return this;}	
		
		
	//Click > Search 
		public CorporateUser enterSearch(String Value) throws InterruptedException {
			type("(//*[text()='Search'])[1]", Value , "Search");
			Thread.sleep(2000);
			verifyExactText("(//*[text()='samanthasree@instrive.in'])", Value);
			return this;}
		
	//Click > Button > Add Multiple User
		public CorporateUser AddMultipleUser() throws InterruptedException {
			click("(//*[text()=' Add User'])", "Add User");
			return this;}	
		
		
	//Type > User2 >  First Name
		public CorporateUser enterUserTwoFirstName(String firstname) throws InterruptedException {
			type("//*[@name='users.1.first_name']", firstname , "First Name");
			return this;}
			
			
	//Type > User2 >  Last Name
		public CorporateUser enterUserTwoLastName(String lastname) throws InterruptedException {
			type("//*[@name='users.1.surname']", lastname , "Last Name");
			return this;}
				
				
	//Type > User2 >  Email Address
		public CorporateUser enterUserTwoEmail(String email) throws InterruptedException {
			type("//*[@name='users.1.email']", email , "Email Address");
			return this;}	
				
			
	//Type > User2 >  Title
		public CorporateUser enterUserTwoTitle(String title) throws InterruptedException {
			type("//*[@name='users.1.title']", title , "Title");
			return this;}
				
		
	//Type > User2 > Department
		public CorporateUser enterUserTwoDepartment(String department) throws InterruptedException {
			type("//*[@name='users.1.department']", department , "Department");
			return this;}
		
	//Verify text > Duplicate User
		public CorporateUser VerifyText() throws InterruptedException {
			String Actual  = getInnerText("//*[text()='user already exists']");
			String Expected = "user already exists";
			if(Actual.equals(Expected))
				System.out.println( "Displayed User Already exist");
			else
				System.out.println("Text not found");
			return this;}
		
		
//----------------------------------------------------------->  Users Group <-------------------------------------------------------------------//	

	//Click > Button > Users Group
		public CorporateUser userGroup() throws InterruptedException {
			click("(//*[text()='Users Group'])", "Users Group");
			return this;}	
				
		
	//Click > Button > Add Users Group
		public CorporateUser clickAddUserGroup() throws InterruptedException {
			click("(//button[text()='Add User Group'])", "Add User Group");
			return this;}

			
	//Type > Users Group >  Name
		public CorporateUser enterGroupName(String groupname) throws InterruptedException {
			type("//*[@name='name']", groupname , "Group Name");
			return this;}
		
	
	//Type > Users Group > Description
		public CorporateUser enterGroupDescription(String groupdescription) throws InterruptedException {
			Thread.sleep(2000);
			type("(//*[@name='description'])[2]", groupdescription , "Group Description");
			return this;}
		
		
	//Click > Button > Add Members
		public CorporateUser groupAddMembers() throws InterruptedException {
			click("(//*[text()='Add Members'])", "Add Members");
			return this;}	
		
		
	//Click > Button > Add Member
		public CorporateUser groupAddMember() throws InterruptedException {
			click("(//*[text()='Add Member'])", "Add Member");
			return this;}	
		
		
	//Click > Button > Add Member inside the wizard
		public CorporateUser expandGroupAddMember() throws InterruptedException {
			click("(//*[text()='Add Member'])[2]", "Add Member");
			Thread.sleep(2000);
			check("(//*[@type='checkbox'])[1]", "Check User");
			return this;}
		
		
	//Click > Button > Add Group inside the wizard
		public CorporateUser expandGroupAddGroup() throws InterruptedException {
			click("(//*[text()='Add Group'])", "Add Group");
			Thread.sleep(2000);
			check("(//div[text()='NAME'])[2]/following::input[1]", "Check User");
			return this;}	
				
				
	//Click > Button > Final Add Member Submit
		public CorporateUser btnGroupAddMember() throws InterruptedException {
			click("(//*[text()='Add Member'])[3]", "Add Member");
			return this;}				
				
		
	//Click > Button > Save
		public CorporateUser btnSave() throws InterruptedException {
			click("(//*[text()='Save'])", "Save");
			return this;}				
						
		
	//Click > Button > Save and Activate Group
		public CorporateUser btnSaveAndActivate() throws InterruptedException {
			click("(//*[text()='Save and Activate Group'])", "Save and Activate Group");
			return this;}	
		
		
	//Click > Button > TripleDot
		public CorporateUser btnTripleDot() throws InterruptedException {
			click("(//button[@id='long-button'])[1]", "TripleDot");
			return this;}	
		
		
		//Click > Button > TripleDot > Edit
		public CorporateUser btnMenuEdit() throws InterruptedException {
			forceClick("//li[text()='Edit']", "TripleDot");
			return this;}
		
		
	//Click > Button > TripleDot > Change status
		public CorporateUser btnMenuChangeStatus() throws InterruptedException {
			forceClick("(//li[text()='Change status'])[1]", "Change status");
			return this;}	
		
		
	//Click > Users Group >  Activate
		public CorporateUser btnActivate() throws InterruptedException {
			forceClick("(//button[text()='Activate'])[1]", "Activate");
			return this;}
		
		
	//Click > Users Group >  Deactivate
		public CorporateUser btnDeactivate() throws InterruptedException {
			forceClick("(//button[text()='Deactivate'])[1]", "Deactivate");
			return this;}
		
	
	//Click > Button > TripleDot > Delete
		public CorporateUser btnMenuDelete() throws InterruptedException {
			forceClick("(//li[text()='Delete'])[1]", "Delete");
			return this;}	
		
		
	//Click > Button > TripleDot > View
		public CorporateUser btnMenuView() throws InterruptedException {
			forceClick("(//li[text()='View'])[1]", "View");
			return this;}
		
		
	//Click > Button > TripleDot > Update Member
		public CorporateUser btnUpdateMember() throws InterruptedException {
			click("(//button[text()='Update Member'])", "Update Member");
			return this;}	
		
		
	//Type > Users Group >  Name
		public CorporateUser editGroupName(String groupname) throws InterruptedException {
			click("(//*[@name='name'])", "Group Name");
			edit("(//*[@name='name'])", groupname , "Group Name");
			return this;}
		
		
	//Edit > Users Group >  Desc		
		public CorporateUser editGroupDescription(String groupdescription) throws InterruptedException {
			click("(//*[@name='description'])[2]", "Group Description");
			edit("(//*[@name='description'])[2]", groupdescription , "Group Description");
			return this;}
			
			
	//Click > Users Group >  Update	
		public CorporateUser btnUpdate() throws InterruptedException {
			click("(//button[text()='Update'])", "Update");
			return this;}
		
		
	//Click > Users Group >  Edit Icon	
		public CorporateUser btnEditIcon() throws InterruptedException {
			click("(//*[@data-testid='EditIcon'])", "Edit Icon");
			return this;}	
			
		
	//Click > Users Group >  Delete Group
		public CorporateUser btnDeleteGroup() throws InterruptedException {
			click("(//button[text()='Delete Group'])", "Delete Group");
			return this;}	

		
	//Click > Users Group >  Delete
		public CorporateUser btnDelete() throws InterruptedException {
			forceClick("(//*[text()='Delete'])[2]", "Delete Pop up");
			return this;}
	
		
	//Click > Button > Add Member inside the wizard > Edit
		public CorporateUser expandGroupEditAddMember() throws InterruptedException {
			click("(//*[text()='Add Member'])[2]", "Add Member");
			Thread.sleep(2000);
			check("(//*[@type='checkbox'])[2]", "Check User");
			return this;}
		
		
	//Click > Button > Add Group inside the wizard > Edit
		public CorporateUser expandGroupEditAddGroup() throws InterruptedException {
			click("(//*[text()='Add Group'])", "Add Group");
			Thread.sleep(2000);
			check("(//div[text()='NAME'])[2]/following::input[2]", "Check User");
			return this;}	
		
		
	//Click > Users Group >  Add Admin
		public CorporateUser btnAddAdmin() throws InterruptedException {
			forceClick("(//*[text()='Add Admin'])[1]", "Add Admin");
			forceClick("(//*[text()='Add Admin'])[3]", "Add Admin");
			return this;}
		
		
	//Click > Users Group >  Remove Admin
		public CorporateUser btnRemoveAdmin() throws InterruptedException {
			forceClick("(//*[text()='Remove Admin'])[1]", "Remove Admin");
			forceClick("(//*[text()='Remove Admin'])[3]", "Remove Admin");
			return this;}
				
				
	//Click > Button Delete
		public CorporateUser clickDelete() throws InterruptedException {
			click("(//button[text()='Delete'])[1]", "Delete");
			return this;}			
				
				
	//Click > Button Delete from confirmation Pop Up.
		public CorporateUser clickPopUpDelete() throws InterruptedException {
			click("(//div[text()='Delete User']//following::button[text()='Delete'])", "Delete");
			return this;}
		
	
		
	
		
		
				
				
				
				
				
		/*
		//Click > Button > Edit
		public CorporateUser btnMenuEdit() throws InterruptedException {
		    Locator elements = getPage().locator("//li[text()='Edit']");
		    elements.first().waitFor(new Locator.WaitForOptions().setState(WaitForSelectorState.VISIBLE));

		    boolean clicked = false;
		    for (int i = 0; i < elements.count(); i++) {
		        Locator element = elements.nth(i); 
		        // Check if the element is visible before clicking
		        if (element.isVisible()) {
		            element.click(new Locator.ClickOptions().setForce(true));
		            clicked = true;
		            break;
		        }
		    }
		    if (!clicked) {
		        throw new InterruptedException("No visible 'Edit' button found to click.");
		    }

		    return this;
		} */
		
	
		
}

