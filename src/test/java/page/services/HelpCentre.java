
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

public class HelpCentre extends ProjectHooks{
	
//----------------------------------------------------------->  Help Centre  <-------------------------------------------------------------------//
	
	//--------------->Click > Menu > Help Centre 
		public HelpCentre helpCentre() throws InterruptedException {
			click("(//*[text()='Help Centre'])[1]", "Help Centre");
			Thread.sleep(2000);
			return this;}
			
	
	//--------------->Click > Help Centre  > Support Email
		public HelpCentre helpSupportEmail() throws InterruptedException {
			click("(//span[text()='support@zavenlegal.com'])", "Help Centre SupportEmail ");
			Thread.sleep(2000);
			return this;}
		
		
	//--------------->Click > Services Review > Quality of Services
		public HelpCentre sendSupportEmail() throws InterruptedException {
			type("(//*[@name='Send Email'])", "Automation triggered email for Testing Purposes.", "email content");
			Thread.sleep(2000);
			return this;}
		
		
	//--------------->Click > Services Review > Quality of Services
		public HelpCentre btnSendEmail() throws InterruptedException {
			click("(//button[text()='Send Email'])", "Send Email");
			Thread.sleep(2000);
			return this;}
			
	
	//--------------->Click > > Menu > Help Centre > FAQ
		public HelpCentre helpCentreFAQ() throws InterruptedException {
			click("(//div[text()='FAQ'])", "FAQ");
			Thread.sleep(2000);
			return this;}
		
		
	//--------------->Click > > Menu > Help Centre > FAQ > Key Features
		public HelpCentre helpCentreFAQKeyFeatures() throws InterruptedException {
			click("(//div[text()='Key Features'])", "Key Features");
			Thread.sleep(2000);
			return this;}	
		
		
	//--------------->Click > > Menu > Help Centre > FAQ > Registration / Account
		public HelpCentre helpCentreFAQRegistrationAccount() throws InterruptedException {
			click("(//div[text()='Registration / Account'])", "Registration / Account");
			Thread.sleep(2000);
			return this;}	
		
		
	//--------------->Click > > Menu > Help Centre > FAQ > Law Firms
		public HelpCentre helpCentreFAQLawFirms() throws InterruptedException {
			click("(//div[text()='Law Firms'])", "Law Firms");
			Thread.sleep(2000);
			return this;}
		
		
	//--------------->Click > > Menu > Help Centre > FAQ > Request for Proposals(RFP)
		public HelpCentre helpCentreFAQRequestforProposals() throws InterruptedException {
			click("(//div[text()='Request for Proposals(RFP)'])", "Request for Proposals(RFP)");
			Thread.sleep(2000);
			return this;}	
		
		
	//--------------->Click > > Menu > Help Centre > FAQ > RFPs in Progress
		public HelpCentre helpCentreFAQRFPsinProgress() throws InterruptedException {
			click("(//div[text()='RFPs in Progress'])", "RFPs in Progress");
			Thread.sleep(2000);
			return this;}
		
		
	//--------------->Click > > Menu > Help Centre > FAQ > Analytics
		public HelpCentre helpCentreFAQAnalytics() throws InterruptedException {
			click("(//div[text()='Analytics'])", "Analytics");
			Thread.sleep(2000);
			return this;}
		
		
	//--------------->Click > > Menu > Help Centre > FAQ > Templates Bank
		public HelpCentre helpCentreFAQTemplatesBank() throws InterruptedException {
			click("(//div[text()='Templates Bank'])", "Templates Bank");
			Thread.sleep(2000);
			return this;}
		
		
	//--------------->Click > > Menu > Help Centre > FAQ > Services Review
		public HelpCentre helpCentreFAQServicesReview() throws InterruptedException {
			click("(//div[text()='Services Review'])", "Services Review");
			Thread.sleep(2000);
			return this;}
		
		
	//--------------->Click > > Menu > Help Centre > FAQ > Proposals
		public HelpCentre helpCentreFAQProposals() throws InterruptedException {
			click("(//div[text()='Proposals'])", "Proposals");
			Thread.sleep(2000);
			return this;}
		
	//--------------->Click > > Menu > Help Centre > FAQ > Proposals in Progress
		public HelpCentre helpCentreFAQProposalsinProgress() throws InterruptedException {
			click("(//div[text()='Proposals in Progress'])", "Proposals in Progress");
			Thread.sleep(2000);
			return this;}	
		
		
		
}

