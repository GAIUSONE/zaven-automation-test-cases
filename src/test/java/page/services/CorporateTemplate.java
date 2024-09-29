
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

public class CorporateTemplate extends ProjectHooks{
	
//----------------------------------------------------------->  Template Bank  <-------------------------------------------------------------------//
	
	
	//Click > Menu > Templates Bank 
		public CorporateTemplate CuTemplatesBank() throws InterruptedException {
			click("(//*[text()='Templates Bank'])[1]", "Templates Bank");
			return this;}
	
	
	//Click > Menu > View 
		public CorporateTemplate CuView() throws InterruptedException {
			click("(//*[text()='View'])[1]", "View");
			return this;}
		
		
	//Click > Menu > Delete 
		public CorporateTemplate CuDelete() throws InterruptedException {
			click("(//*[text()='Delete'])[1]", "Delete");
			return this;}
		
		
	//Click > Menu > Delete 
		public CorporateTemplate CuWizDelete() throws InterruptedException {
			click("(//div[text()='Are you certain about your decision to delete this Template bank?']//following::button[text()='Delete'])", "Delete");
			return this;}	
		

	//Click > From Template Bank
		public CorporateTemplate CuFromTemplateBank() throws InterruptedException {
			click("(//*[text()='From Template Bank'])", "From Template Bank");
			return this;}	
		
	
	//Click > Select Template
		public CorporateTemplate CuSelectTemplate() throws InterruptedException {
			Thread.sleep(3000);
			click("(//*[text()='Select Template'])[1]", "Select Template");
			return this;}
		
	
	
	//Click > Move All Content
		public CorporateTemplate CuMoveAllContent() throws InterruptedException {
			Thread.sleep(3000);
			click("(//*[text()='Move All Content'])", "Move All Content");
			return this;}
		
		
	//Click > Move back to RFP
		public CorporateTemplate CuMovebacktoRFP() throws InterruptedException {
			Thread.sleep(3000);
			click("(//*[text()='Move back to RFP'])", "Move back to RFP");
			return this;}	
		
		
	//Proposal Delete > Popup  > wizDelete 
		public CorporateTemplate PropWizDelete() throws InterruptedException {
			click("(//div[text()='Are you sure you want to delete this template proposal?']//following::button[text()='Delete'])", "Delete");
			return this;}
		
		
	//Click > Template > Update
		public CorporateTemplate propUpdate() throws InterruptedException {
			click("(//*[text()='Update'])[1]", "Update");
			return this;}	
		
	
	//Click > Menu > Preview Template
		public CorporateTemplate propPreviewTemplate() throws InterruptedException {
			click("(//*[text()='Preview Template'])", "Preview Template");
			return this;}	
		
		
	//Click > Save
		public CorporateTemplate clickSave() throws InterruptedException {
			click("(//*[text()='Save'])", "Save");
			return this;}	
		
		
	//Click > Select button
		public CorporateTemplate btnSelect() throws InterruptedException {
			Thread.sleep(3000);
			click("(//*[text()='Select'])[1]", "Select button");
			return this;}
		
		
	//Click > Move back to Proposal
		public CorporateTemplate CuMovebacktoProposal() throws InterruptedException {
			Thread.sleep(3000);
			click("(//*[text()='Move back to Proposal'])", "Move back to Proposal");
			return this;}
		
		
		
		
}

