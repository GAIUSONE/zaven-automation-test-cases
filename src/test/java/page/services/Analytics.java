
package page.services;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import com.force.base.ProjectHooks;
import com.force.config.ConfigurationManager;
import com.microsoft.playwright.BrowserContext;
import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Locator.FillOptions;
import com.microsoft.playwright.PlaywrightException;
import com.microsoft.playwright.options.WaitForSelectorState;

import page.base.ZavenHooks;

public class Analytics extends ProjectHooks{
	
//----------------------------------------------------------->  Preferred/Panel Law Firms  <-------------------------------------------------------------------//
	
	//Click > Dashboard > View RFP's
		public Analytics analytics() throws InterruptedException {
			click("(//*[text()='Analytics'])[1]", "Analytics");
			return this;}
		
	
//------------------------------------------------------->     Scoring Cards	<------------------------------------------------------------
		
	//Switch On > Scoring breakdown
		public Analytics scoringbreakdownON() throws InterruptedException {
			click("(//label[text()='Scoring breakdown']//following::input[@name='Switch'])", "Scoring breakdown On");
			return this;}	
		
	
	// Drop down > By Legal Services Provider 
		public Analytics byLegalServicesProvider(String bylsp) throws InterruptedException {
			type("(//label[@id='legalServiceProviderSelection-label'])", bylsp , "By Legal Services Provider");
			Thread.sleep(3000);
			pageUp();
			Thread.sleep(3000);
			enter();
			Thread.sleep(3000);
			return this;}		
	
		
	//Drop down  > By lead partner/member
		public Analytics byLeadPartner(String bypartner) throws InterruptedException {
			type("(//label[@id='teamMemberSelection-label'])", bypartner , "By lead partner/member");
			Thread.sleep(3000);
			pageDown();
			Thread.sleep(3000);
			enter();
			Thread.sleep(3000);
			return this;}
		
		
	//Drop down  > Export > Export as PDF
		public Analytics exportAsPDF() throws InterruptedException {
			click("(//*[text()='Export'])", "Export");
			click("(//*[text()='Export as PDF'])", "Export as PDF");
			Thread.sleep(3000);
			return this;}
		
		
	//Drop down  > Export > Export as Excel	
		public Analytics exportAsExcel() throws InterruptedException {
			click("(//*[text()='Export'])", "Export");
			click("(//*[text()='Export as Excel'])", "Export as Excel");
			Thread.sleep(3000);
			return this;}
		
		
		
//------------------------------------------------------->     Services Review	<----------------------------------------------------------------
		
		//Switch On > Services Review
			public Analytics servicesReviewON() throws InterruptedException {
				click("(//div[text()='Services Review']//following::input[@type='checkbox'])[1]", "Services Review On");
				return this;}
		
		
		// Drop down > By Legal Services Provider 
			public Analytics servicesReviewLSP(String bylsp) throws InterruptedException {
				type("(//div[text()='Services Review']//following::label[text()='By Legal Services Provider']/parent::div//input)", bylsp , "By lead partner/member");
				Thread.sleep(3000);
				pageDown();
				Thread.sleep(3000);
				enter();
				Thread.sleep(3000);
				return this;}		
			
				
		//Drop down  > By lead partner/member
			public Analytics sRbyLeadPartner(String bypartner) throws InterruptedException {
				type("(//div[text()='Services Review']//following::label[text()='By lead partner/member']/parent::div//input)", bypartner , "By lead partner/member");
				Thread.sleep(3000);
				pageUp();
				Thread.sleep(3000);
				enter();
				Thread.sleep(3000);
				return this;}
			
			
		//Search box
			public Analytics search(String value) throws InterruptedException {
				type("(//input[@placeholder='Search'])", value , "search");
				Thread.sleep(2000);
				return this;}
			
	
//------------------------------------------------------->     Invitations/Outcomes  <------------------------------------------------------------
			
		//Switch On > Invitations/Outcomes
			public Analytics invitationsOutcomesON() throws InterruptedException {
				click("(//div[text()='Invitations/Outcomes']//following::input[@type='checkbox'])", "Invitations/Outcomes ON");
				return this;}
		
			
		//Invitations/Outcomes	> Legal Services Providers
		public Analytics legalServicesProvider(String lsp) throws InterruptedException {
				type("(//input[@id='selectedOption'])", lsp , "Legal Services Provider");
				Thread.sleep(3000);
				pageUp();
				Thread.sleep(3000);
				enter();
				Thread.sleep(3000);
				return this;}	
		
		
		
			
		//Invitations/Outcomes	> Select date range
		public Analytics selectDateRange(String date) throws InterruptedException {
				forceClickAndType("(//label[text()='Select date range'])", date , "Legal Services Provider");
				return this;
		}
		
		
		//Drop down  > Invitations/Outcomes > Export > Export as PDF
			public Analytics exportAsPDFOutcomes() throws InterruptedException {
				click("(//*[text()='Export'])[2]", "Export");
				click("(//*[text()='Export as PDF'])", "Export as PDF");
				Thread.sleep(3000);
				return this;}
			

		//Drop down  > Invitations/Outcomes > Export > Export as Excel	
			public Analytics exportAsExcelOutcomes() throws InterruptedException {
				click("(//*[text()='Export'])[2]", "Export");
				click("(//*[text()='Export as Excel'])", "Export as Excel");
				Thread.sleep(3000);
				return this;}
			
		
			
			
			
//------------------------------------------------------->     LSP Analytics  <--------------------------------------------------			
			
			
			
	// Drop down > By Corporate
		public Analytics byCorporate(String bycorporate) throws InterruptedException {
			type("(//input[@id='corporateSection'])", bycorporate , "By Corporate");
			Thread.sleep(3000);
			pageUp();
			Thread.sleep(3000);
			enter();
			Thread.sleep(3000);
			return this;}
			
			
	// Drop down > By Corporate
		public Analytics lSPbyLeadpartner(String bylsp) throws InterruptedException {
			type("(//input[@id='teamMemberSelection'])", bylsp , "LSP - By Lead partner/member");
			Thread.sleep(3000);
			pageUp();
			Thread.sleep(3000);
			enter();
			Thread.sleep(3000);
			return this;}	
			
			
	// Drop down > By RFP
		public Analytics byRFP(String byRFP) throws InterruptedException {
			type("(//input[@id='selectedByRfp'])", byRFP , "By RFP");
			Thread.sleep(3000);
			
			pageUp();
			Thread.sleep(3000);
			enter();
			Thread.sleep(3000);
			return this;}			
	
}