package page.services;


import java.awt.event.KeyEvent;
import com.force.base.ProjectHooks;
import com.force.config.ConfigurationManager;
import com.microsoft.playwright.BrowserContext;
import com.microsoft.playwright.PlaywrightException;

import page.base.AdminPage;
import page.base.ZavenHooks;

public class LSPRegistrationPage extends ProjectHooks{

//------------>Click Signup in home page.
		public LSPRegistrationPage clickSignUp() throws InterruptedException {
			Thread.sleep(2000);
			click("(//button[text()='Sign Up'])", "Sign Up");
			return this;}
		
  //------------>Click Sign up as LSP
		public LSPRegistrationPage clickSignUpAsLsp() throws InterruptedException {
			Thread.sleep(2000);
			click("(//li[text()='Sign up as Legal Services Provider'])", "Sign up as Legal Services Provider");
			return this;}
		
//------------>Click Registration Email.
			public LSPRegistrationPage clickemail(String email) throws InterruptedException {
				Thread.sleep(2000);
				type("//*[@name='email']", email, "RegistrationEmail");
				return this;}		
				
//------------>Click Registration Access Code.
			public LSPRegistrationPage clickAccessCode(String accesscode) throws InterruptedException {
				Thread.sleep(2000);
				type("//*[@name='accessCode']", accesscode , "AccessCode");
				return this;}			
				
//------------>Click Continue
			public LSPRegistrationPage clickContinue() throws InterruptedException {
				Thread.sleep(2000);
				click("(//button[text()='Continue'])", "Continue");
				return this;}
			
//------------>Click Submit.
			public LSPRegistrationPage clickSubmit() throws InterruptedException {
				Thread.sleep(2000);
				click("(//button[text()='Submit'])", "Submit");
				return this;}
			
//------------>Click Back Icon.
			public LSPRegistrationPage clickbackicon() throws InterruptedException {
				Thread.sleep(2000);
				click("//button[@aria-label='back']", "Back");
			    return this;}	

 //------------>Click Company name
	public LSPRegistrationPage typeLspCompanyName(String LSPcompanyname) throws InterruptedException {
			Thread.sleep(2000);
			type("//*[@name='ls_provider_name']", LSPcompanyname , "Company Name");
			return this;}
	
//------------>Click upload and upload a pic	
	public LSPRegistrationPage lspUploadFile() throws InterruptedException {
		Thread.sleep(2000);
		uploadFile("//label[text()='Upload']", "./Uploads/LSP Logo.png", "Sam");
	return this;}
	

//------------>Click firstname	
	public LSPRegistrationPage typeLspfirstName(String firstname) throws InterruptedException {
		Thread.sleep(2000);
		type("//*[@name='firstname']", firstname , "First Name");
		return this;}
	
//------------>Click Lastname	
		public LSPRegistrationPage typeLspLastName(String lastname) throws InterruptedException {
			Thread.sleep(2000);
			type("//*[@name='lastname']", lastname , "Last Name");
			return this;}
		
//------------>Click CompanyAddress	
		public LSPRegistrationPage typeLspCompanyAddress(String companyAddress) throws InterruptedException {
			Thread.sleep(2000);
			type("//*[@name='companyAddress']", companyAddress , "Company Address");
			return this;}
		

//------------>Click Zip Code	
		public LSPRegistrationPage typeLspZipCode(String zipcode) throws InterruptedException {
			Thread.sleep(2000);
			type("//*[@name='zip']", zipcode , "Zip Code");
			return this;}
		

//------------>Click city
		public LSPRegistrationPage typeCity(String city) throws InterruptedException {
			Thread.sleep(2000);
			type("//*[@name='city']", city , "City");
			return this;}
	
//------------>Click country
		public LSPRegistrationPage selectLspCountry() throws InterruptedException {
			click("//*[@id='mui-component-select-country']", "Country");
			click("(//li[text()='Abu Dhabi'])", "country");
			return this;}
		
//------------>Click country
		public LSPRegistrationPage selectLspMultiselcectCountry() throws InterruptedException {
				click("(//*[@data-testid='ArrowDropDownIcon'])", "Countrydropdown");
				click("(//li[text()='Abu Dhabi'])", "country");
				return this;}
			
//------------>Click Main Contact Person for your organisation
		public LSPRegistrationPage selectLspPhoneNumber(String phonenumber) throws InterruptedException {
			type("//div[@class=' react-tel-input ']/input", phonenumber, "Phno");
			return this;}
			
//------------> Click Company Person Email
		public LSPRegistrationPage typeCompanyPersonEmail(String companyPersonEmail) throws InterruptedException {
			Thread.sleep(2000);
			type("//*[@name='companyPersonEmail']", companyPersonEmail , "Company Person Email");
			return this;}
		
		
//------------> Click Communication Email
	public LSPRegistrationPage typeCommunicationEmail(String communicationemail) throws InterruptedException {
		Thread.sleep(2000);
		type("//*[@name='communication_email']", communicationemail , "Communication Email");
		return this;}	
		
		
//------------> Click Automatic Cc
	public LSPRegistrationPage typeAutomaticCc(String AutomaticCc) throws InterruptedException {
		Thread.sleep(2000);
		type("//*[@name='cc_email_0']", AutomaticCc , "Automatic Cc");
		return this;}
	
	
//------------> Click Save Drafts.
	public LSPRegistrationPage clickSaveDraft() throws InterruptedException {
		Thread.sleep(2000);
		click("(//button[text()='Save Draft'])", "Just one more step");
		return this;}
	
//---------------->
	public LSPRegistrationPage checkAll() throws InterruptedException {
		Thread.sleep(2000);
		check("//*[@name='all']", "All");
		Thread.sleep(3000);
		return this;}
	
	
	public LSPRegistrationPage typeComment1() throws InterruptedException {
		Thread.sleep(2000);
		type("(//*[@name='comment'])[1]","Test LSP Comment1","CommentsBox1");
		//arrowDown();
	    //enter();
		return this;}
	
	public LSPRegistrationPage typeComment2() throws InterruptedException {
		Thread.sleep(2000);
		type("(//*[@name='comment'])[2]","Test LSP Comment2","CommentsBox2");
		//arrowDown();
	    //enter();
		return this;}
	
	public LSPRegistrationPage typeComment3() throws InterruptedException {
		Thread.sleep(2000);
		type("(//*[@name='comment'])[3]","Test LSP Comment3","CommentsBox3");
		//arrowDown();
	    //enter();
		return this;}
	
	public LSPRegistrationPage typeotherComment() throws InterruptedException {
		Thread.sleep(2000);
		type("(//*[@name='otherComment'])","Test LSP OtherComment","OtherCommentsBox");
		//arrowDown();
	    //enter();
		return this;}
		
	
	//===============================================
//------------> Upload IT (including cyber) security package
	public LSPRegistrationPage lspUploadITIncluding() throws InterruptedException {
		System.out.println("Test");
		uploadFile("(//label[text()='IT (including cyber) security package']//following::input)[1]","./Uploads/LSP Logo.png", "IT (including cyber) security package");
		return this;}
	
//------------>Comment IT (including cyber) security package Comment box
	public LSPRegistrationPage typeoitsecuritypackage() throws InterruptedException {
		Thread.sleep(2000);
		type("//*[@name='it_security_package']","it security package Comments","security package");
		return this;}
//==============================================
	
//------------>upload Data protection policy	
	public LSPRegistrationPage lspUploadDataProtection() throws InterruptedException {
		Thread.sleep(2000);
		uploadFile("(//label[text()='Data protection policy']//following::input)[1]","./Uploads/LSP Logo.png", "IT (including cyber) security package");
		return this;}
	
//------------>Comment box DataProtectionPolicy 
	public LSPRegistrationPage typeDataProtectionPolicy() throws InterruptedException {
		Thread.sleep(2000);
		type("(//*[@name='data_protection_policy'])","data protection policy Comments","data_protection_policy");
		return this;}
	
//========================================================
	
//------------>Upload Approach to Professional Indemnity insurance
	public LSPRegistrationPage lspUploadApproachProfessional() throws InterruptedException {
		Thread.sleep(2000);
		uploadFile("(//label[text()='Approach to Professional Indemnity insurance']//following::input)[1]", "./Uploads/LSP Logo.png", "Sam");
		return this;}
	
	//------------>Comments Approach to Professional Indemnity insurance Comment box
		public LSPRegistrationPage typeProfessionalIndemnityInsurance() throws InterruptedException {
			Thread.sleep(2000);
			type("(//*[@name='professional_indemnity_insurance'])","Professional Insurance comments","professional indemnity insurance");
			return this;}
	
//================================================================================	
	
		//------------>Upload Conflict check policy
		public LSPRegistrationPage lspUploadCCP() throws InterruptedException {
			Thread.sleep(2000);
			uploadFile("(//label[text()='Conflict check policy']//following::input)[1]", "./Uploads/LSP Logo.png", "Sam");
			return this;}
		
		//------------>Comments Approach to Professional Indemnity insurance Comment box
			public LSPRegistrationPage typeConflictCheckPolicy() throws InterruptedException {
				Thread.sleep(2000);
				type("(//*[@name='conflict_check_policy'])","conflict check policy comments","conflict_check_policy");
				return this;}
		
//===========================================================================================	
	
			//------------>Upload Conflict check policy
			public LSPRegistrationPage lspUploadESGPolicy() throws InterruptedException {
				Thread.sleep(2000);
				uploadFile("(//label[text()='ESG policy']//following::input)[1]", "./Uploads/LSP Logo.png", "Sam");
				return this;}

			
			//------------>Comments ESG policy Comment box
			public LSPRegistrationPage typeEsgPolicy() throws InterruptedException {
				Thread.sleep(2000);
				type("(//*[@name='esg_policy'])","Esg Policy comments","Esg Policy comments");
				return this;}
			
//=====================================================
	

//------------>Check Are you reporting to any third party your ESG efforts 
	public LSPRegistrationPage checkReportToThirdParty() throws InterruptedException {
		Thread.sleep(2000);
		check("//*[@name='report_to_third_party.value']","Report To Third Party");
		Thread.sleep(3000);
		return this;}
	
	//------------>Upload Report To ThirdParty
	public LSPRegistrationPage lspUploadReportToThirdParty() throws InterruptedException {
		Thread.sleep(2000);
		uploadFile("(//label[text()='ESG policy']//following::input)[3]", "./Uploads/LSP Logo.png", "Sam");
		return this;}
	
	//------------>Comments ESG policy Comment box
	public LSPRegistrationPage typeReportToThirdParty() throws InterruptedException {
		Thread.sleep(2000);
		type("(//*[@name='report_to_third_party.comment'])","report_to_third_party.comment comments","report_to_third_party.comment");
		return this;}
	
	
//---------------->Check Any external validation of your ESG report/efforts and if yes by whom ?
	public LSPRegistrationPage checkExternalValidation() throws InterruptedException {
		Thread.sleep(2000);
		check("//*[@name='external_validation.value']", "External Validatione");
		Thread.sleep(3000);
		return this;}
	
//------------>Upload Standard Business/Engagement Terms & Conditions
		public LSPRegistrationPage lspUploadStandardBusiness() throws InterruptedException {
			Thread.sleep(2000);
			uploadFile("(//label[text()='Standard Business/Engagement Terms & Conditions']//following::input)[1]", "./Uploads/LSP Logo.png", "Sam");
			return this;}
		
	
//------------>Comments Standard Business/Engagement Terms & Conditions
	public LSPRegistrationPage typeBusinessEngagementTc() throws InterruptedException {
		Thread.sleep(2000);
		type("(//*[@name='businessEngagementTc'])","Business Engagement Tc Test Comments","Business EngagementTc");
		return this;}
	
//------------>Click I have read and agree to the  Zaven Terms of Use
	public LSPRegistrationPage clickCheckBoxIcon() throws InterruptedException {
		Thread.sleep(3000);
		click("(//*[@data-testid='CheckBoxIcon'])", "CheckBoxIcon");
		return this;}
	
	public LSPRegistrationPage clickTermsofServices() throws InterruptedException {
		Thread.sleep(3000);
		click("//*[contains(text(),'I have read and agree to the')]//preceding::input[1]", "CheckBoxIcon");
		return this;}
	
	//*[contains(text(),"I have read and agree to the ")]//preceding::input[1]
}
