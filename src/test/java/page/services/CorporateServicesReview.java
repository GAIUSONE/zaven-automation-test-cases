
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

public class CorporateServicesReview extends ProjectHooks{
	
//----------------------------------------------------------->  Services Review  <-------------------------------------------------------------------//
	
	//--------------->Click > Menu > Services Review 
		public CorporateServicesReview CuServicesReview() throws InterruptedException {
			click("(//*[text()='Services Review'])", "Services Review");
			return this;}
			
	
	//--------------->Click > Services Review > Add Review
		public CorporateServicesReview CuAddReview() throws InterruptedException {
			click("(//button[text()='Add Review'])[1]", "Add Review");
			return this;}
		
		
	//--------------->Click > Services Review > Quality of Services
		public CorporateServicesReview CuQualityOfServices() throws InterruptedException {
			click("(//input[@name='rating'])[1]", "Quality of Services");
			return this;}
		
		
	//--------------->Click > Services Review > Quality of Services
		public CorporateServicesReview switchViewReviews() throws InterruptedException {
			click("(//div[text()='View Reviews']/following::input)", "Services Review > Switch On ");
			return this;}
		
		
	//--------------->Click > Services Review >View Review > By Legal Services Provider
		public CorporateServicesReview selectByLSP(String lspcompany) throws InterruptedException {
			click("(//input[@id='legalServiceProviderSelection'])", "By Legal Services Provider");
			type("(//input[@id='legalServiceProviderSelection'])", lspcompany , "lspcompany");
			pageDown();
			enter();
			return this;}
		
		
	//--------------->Click > Services Review >View Review > By Legal Services Provider
			public CorporateServicesReview selectByLeadPartner(String lspname) throws InterruptedException {
				click("(//input[@id='teamMemberSelection'])", "By lead partner/member");
				Thread.sleep(3000);
				//type("(//input[@id='teamMemberSelection'])", lspname , "lspname");
				pageUp();
				enter();
				Thread.sleep(3000);
				return this;}
			
	
	
}

