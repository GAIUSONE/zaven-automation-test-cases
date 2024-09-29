
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

public class CorporateDashboard extends ProjectHooks{
	
//----------------------------------------------------------->  Preferred/Panel Law Firms  <-------------------------------------------------------------------//
	
	//--------------->Click > Dashboard > View RFP's
		public CorporateDashboard viewRFPs() throws InterruptedException {
			click("(//*[text()='View RFPs'])", "View RFPs");
			return this;}
		
		
	//--------------->Click > Abort button
			public CorporateDashboard btnAbort() throws InterruptedException {
				click("(//button[text()='Abort'])[1]", "Abort");
				return this;}	
		
		
		
	//--------------->Click > Abort button
		public CorporateDashboard btnAbortPopup() throws InterruptedException {
			click("(//div[text()='Are you certain about your decision to Abort this RFP?']/following::button[text()='Abort'])", "Abort");
			return this;}
		
		
			
}