package page.services;


import java.awt.event.KeyEvent;
import com.force.base.ProjectHooks;
import com.force.config.ConfigurationManager;
import com.microsoft.playwright.BrowserContext;
import com.microsoft.playwright.PlaywrightException;
import page.base.ZavenHooks;

public class CuRegistrationPage extends ProjectHooks{

	//------------>Click Signup in home page.
		public CuRegistrationPage clickSignUp() throws InterruptedException {
			Thread.sleep(2000);
			click("(//button[text()='Sign Up'])", "Sign Up");
			return this;}
		
  //------------>Click Sign up as Corporate
		public CuRegistrationPage clickSignUpAsCorporate() throws InterruptedException {
			Thread.sleep(2000);
			click("(//li[text()='Sign up as Corporate'])", "Sign up as Corporate");
			return this;}
		
 //------------>Click Company name
	public CuRegistrationPage typeCompanyName(String companyname) throws InterruptedException {
			Thread.sleep(2000);
			type("//*[@name='company_name']", companyname , "Company Name");
			return this;}
	
//------------>Click upload and upload a pic	
	public CuRegistrationPage uploadFile() throws InterruptedException {
		Thread.sleep(2000);
		uploadFile("//label[text()='Upload']", "./Uploads/Cu_Logo.png", "Sam");
	return this;}
	
	
//------------>Click firstname	
	public CuRegistrationPage typefirstName(String firstname) throws InterruptedException {
		Thread.sleep(2000);
		type("//*[@name='first_name']", firstname , "First Name");
		return this;}
	
//------------>Click Lastname	
		public CuRegistrationPage typeLastName(String lastname) throws InterruptedException {
			Thread.sleep(2000);
			type("//*[@name='surname']", lastname , "Last Name");
			return this;}
		
//------------>Click CompanyAddress	
		public CuRegistrationPage typeCompanyAddress(String address) throws InterruptedException {
			Thread.sleep(2000);
			type("//*[@name='address']", address , "Company Address");
			return this;}
		

//------------>Click Zip Code	
		public CuRegistrationPage typeZipCode(String zipcode) throws InterruptedException {
			Thread.sleep(2000);
			type("//*[@name='zip']", zipcode , "Zip Code");
			return this;}
		

//------------>Click city
		public CuRegistrationPage typeCity(String city) throws InterruptedException {
			Thread.sleep(2000);
			type("//*[@name='city']", city , "City");
			return this;}
	
//------------>Click country
		
		public CuRegistrationPage selectCountry() throws InterruptedException {
			click("//*[@id='mui-component-select-country']", "Country");
			click("(//li[text()='Abu Dhabi'])", "country");
			return this;}
	
//------------>Click Contact Person Phone Number
		
		public CuRegistrationPage selectPhoneNumber(String phonenumber) throws InterruptedException {
			type("//div[@class=' react-tel-input ']/input", phonenumber, "Phno");
			return this;}
			
//------------> Click Contact Person Email
		public CuRegistrationPage typeEmail(String email) throws InterruptedException {
			Thread.sleep(2000);
			type("//*[@name='email']", email , "Contact Person Email");
			return this;}
		
		
		
//------------> Click Headquarter's location		
public CuRegistrationPage selectHeadquartersLocation() throws InterruptedException {
		Thread.sleep(2000);
		click("//*[@id='mui-component-select-headquarters_country_id']", "HeadquartersLocation");
		click("(//li[text()='Austria'])", "HeadquartersLocation");
		return this;}
		
	
//------------> Click headquarters comments
		public CuRegistrationPage typeHeadquartersComments(String comments) throws InterruptedException {
			Thread.sleep(2000);
			type("//*[@name='headquarters_comments']", comments , "Headquarters Comments");
			return this;}	
		
//------------> Click Just one more step.
		public CuRegistrationPage clickJustOneMoreStep() throws InterruptedException {
			Thread.sleep(2000);
			click("(//button[text()='Just one more step'])", "Just one more step");
			return this;}
		
//------------>Click Back Icon.
		public CuRegistrationPage clickbackicon() throws InterruptedException {
			Thread.sleep(2000);
			click("//button[@aria-label='back']", "Back");
		    return this;}	
		
		
// Registration form Page 2 Elements
//====================================
		
//------------>Choose from Industry drop down	
		public CuRegistrationPage selectIndustry() throws InterruptedException {
			Thread.sleep(2000);
			click("//*[@id='mui-component-select-industry_id']", "Industry");
			click("(//li[text()='Agriculture'])", "Industry");
			return this;}		
		
//------------>Choose from Company Size  drop down
		public CuRegistrationPage selectCompanySize() throws InterruptedException {
			Thread.sleep(2000);
			click("//*[@id='mui-component-select-company_size_id']", "Company Size");
			click("(//li[text()='1001-5000'])", "Company Size");
			return this;}	
		
//------------>Choose from Company Legal Department Size drop down
		public CuRegistrationPage selectCompanyLegalDepartmentSize() throws InterruptedException {
			Thread.sleep(2000);
			click("//*[@id='mui-component-select-department_size_id']", "Company Legal Department Size ");
			click("(//li[text()='51-100'])", "Company Legal Department Size");
			return this;}
		
//------------>Choose from Average Annual Legal Spend(in USD) drop down
		public CuRegistrationPage selectAverageAnnualLegalSpend() throws InterruptedException {
			Thread.sleep(2000);
			click("//*[@id='mui-component-select-spend_id']", "Select Average Annual Legal Spend");
			click("(//li[text()='5m+-10m'])", "AverageAnnualLegalSpend");
			return this;}
		
//------------>Choose from How did you hear about Zaven? drop down
		public CuRegistrationPage selectHowdidyouhearaboutZaven() throws InterruptedException {
			Thread.sleep(2000);
			click("//*[@id='mui-component-select-how_you_hear_about_navan_legal.value']", "How did you hear about Zaven?");
			click("(//li[text()='LinkedIn'])", "How did you hear about Zaven?");
			return this;}
				
//------------>Type	comments 
		public CuRegistrationPage typeComments(String comments) throws InterruptedException {
			Thread.sleep(2000);
			type("//*[@name='comments']", comments , "Comments");
			return this;}	
				
//------------>	Checkbox I have read and agree to the Zaven Terms of Use
		public CuRegistrationPage checkZavenTermsOfUse() throws InterruptedException {
			Thread.sleep(2000);
			click("//*[@name='terms_of_services']", "Zaven Terms of Use");
			return this;}
		
//------------>Click Submit.
		public CuRegistrationPage clickSubmit() throws InterruptedException {
			Thread.sleep(2000);
			click("(//button[text()='Submit'])", "Submit");
			return this;}
			
}
