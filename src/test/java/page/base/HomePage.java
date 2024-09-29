package page.base;

import com.force.base.ProjectHooks;
import com.microsoft.playwright.Page;

public class HomePage extends ProjectHooks{

	public HomePage headerMnuServices() {
		click("(//div[text()='Services'])[1]", "Services");
		return this;
	}

	public HomePage headerMnuServicesRFPs() {
		click("(//div[text()='RFPs'])[1]", "RFPs");
		return this;
	}
	
	public HomePage headerMnuServicesAnalytics() {
		click("(//div[text()='Analytics'])[1]", "Analytics");
		return this;
	}
	
	public HomePage headerMnuFAQ() {
		click("(//div[text()='FAQ'])[1]", "FAQ");
		return this;
	}
	
	public HomePage headerMnuFAQKeyFeatures() {
		click("(//div[text()='Key Features'])", "Key Features");
		return this;
	}
	
	public HomePage headerMnuFAQRegistration() {
		click("(//div[text()='Registration / Account'])", "Registration / Account");
		return this;
	}
	
	public HomePage headerMnuFAQLawFirms() {
		click("(//div[text()='Law Firms'])", "Law Firms");
		return this;
	}
	
	public HomePage headerMnuFAQRequestforProposals() {
		click("(//div[text()='Request for Proposals(RFP)'])", "Request for Proposals(RFP)");
		return this;
	}
	
	public HomePage headerMnuFAQRFPsinProgress() {
		click("(//div[text()='RFPs in Progress'])", "RFPs in Progress");
		return this;
	}
	
	public HomePage headerMnuFAQAnalytics() {
		click("(//div[text()='Analytics'])[1]", "Analytics");
		return this;
	}
	
	public HomePage headerMnuFAQTemplatesBank() {
		click("(//div[text()='Templates Bank'])", "Templates Bank");
		return this;
	}
	
	public HomePage headerMnuFAQServicesReview() {
		click("(//div[text()='Services Review'])", "Services Review");
		return this;
	}
		
	public HomePage headerMnuContact() {
		click("(//div[text()='Contact'])[1]", "Contact");
		return this;
	}
	
	public HomePage headerMnuInsights() {
		click("(//div[text()='Insights'])[1]", "Insights");
		return this;
	}
	
	//=================================================>    Contacts <=======================================================
	
	public HomePage contactUsFirstName(String firstname) throws InterruptedException {
		type("[name = 'firstname']", firstname, "firstname");
		Thread.sleep(3000);
		return this;}
	
	
	public HomePage contactUsLastName(String lastname) throws InterruptedException {
		type("[name = 'lastname']", lastname, "lastname");
		Thread.sleep(3000);
		return this;}
	

	public HomePage contactUsWorkMail(String workmail) throws InterruptedException {
		type("[name = 'workmail']", workmail, "WorkMail");
		Thread.sleep(3000);
		return this;}
	
	public HomePage contactUsSubject(String subject) throws InterruptedException {
		type("[name = 'subject']", subject, "subject");
		Thread.sleep(3000);
		return this;}
	
	public HomePage contactUsMessage(String message) throws InterruptedException {
		type("[name = 'message']", message, "message");
		Thread.sleep(3000);
		return this;}
	
	public HomePage btnSubmit() {
		click("(//button[text()='Submit'])", "Submit");
		return this;
	}
	
	public HomePage contactUsFAQ() {
		click("(//a[text()='FAQ'])", "FAQ");
		return this;
	}
	
	public HomePage contactUsSignIn() {
		click("(//a[text()='Sign in'])", "Sign in");
		return this;
	}
	
	//=================================================>  Footer   <=======================================================
	
	public HomePage headerGetStarted() {
		click("(//button[text()='Get Started'])[1]", "Get Started");
		return this;
	}
	
	public HomePage footerGetStarted() {
		click("(//button[text()='Get Started'])[2]", "Get Started");
		return this;
	}
	
	
	public HomePage footerAboutUs() {
		click("(//div[text()='About us'])", "About Us");
		return this;
	}
	
	
	public HomePage footerInvestor() {
		click("(//div[text()='Investor'])", "Investor");
		return this;
	}
	
	
	public HomePage footerCareer() {
		click("(//div[text()='Career'])", "Career");
		return this;
	}
	
	
	public HomePage footerInsights() {
		click("(//div[text()='Insights'])[2]", "Insights");
		return this;
	}
	
	
	public HomePage footerRFPs() {
		click("(//div[text()='RFPs'])[1]", "RFPs");
		return this;
	}
	
	
	public HomePage footerAnalytics() {
		click("(//div[text()='Analytics'])[1]", "Analytics");
		return this;
	}
	
	public HomePage footerHowItWorks() {
		click("(//div[text()='How it Works?'])", "How it Works?");
		return this;
	}
	
	
	public HomePage footerFAQ() {
		click("(//div[text()='FAQ'])[2]", "FAQ");
		return this;
	}
	
	
	
	
	
	public HomePage footerContact() {
		click("(//div[text()='Contact'])[2]", "Contact");
		return this;
	}
	
	
	
	}
	


