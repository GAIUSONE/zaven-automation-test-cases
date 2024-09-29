
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

public class CorporatePreferredPanel extends ProjectHooks{
	
//----------------------------------------------------------->  Preferred/Panel Law Firms  <-------------------------------------------------------------------//
	
	//--------------->Click > Menu > Preferred/Panel Law Firms 
		public CorporatePreferredPanel CuPreferredPanel() throws InterruptedException {
			click("(//*[text()='Preferred/Panel Law Firms'])", "Preferred/Panel Law Firms");
			return this;}
			
			
	//------------>Click > Menu > Preferred/Panel Law Firms > upload and upload a Pdf	
		public CorporatePreferredPanel uploadPdf() throws InterruptedException {
			Thread.sleep(2000);
			uploadFile("//label[text()='Upload']", "./Uploads/PrefferedPanelPDF.pdf", "PDF");
		return this;}
			
			
	//------------>Click > Menu > Preferred/Panel Law Firms > upload and upload a Docx	
		public CorporatePreferredPanel uploadDocx() throws InterruptedException {
			Thread.sleep(2000);
			uploadFile("//label[text()='Upload']", "./Uploads/TestData.docx", "Docx");
		return this;}
		
	
	//------------>Click > Menu > Preferred/Panel Law Firms > Instructions
		public CorporatePreferredPanel CuInstructions() throws InterruptedException {
			Thread.sleep(2000);
			click("(//*[text()='Instructions'])", "Instructions");
			return this;}
		
		
	//------------>Click > Menu > Preferred/Panel Law Firms > Download Icon
		public CorporatePreferredPanel CuDownloads() throws InterruptedException {
			Thread.sleep(2000);
			click("(//*[@data-testid='DownloadIcon'])[1]", "Download Icon");
			return this;}
			
		
	//------------>Click > Menu > Preferred/Panel Law Firms > Delete Icon
		public CorporatePreferredPanel CuDeleteIcon() throws InterruptedException {
			Thread.sleep(2000);
			click("(//*[@data-testid='DeleteOutlineIcon'])[1]", "Delete Icon");
			return this;}
		
		
	//------------->Click > Menu > Preferred/Panel Law Firms > Delete Button
		public CorporatePreferredPanel CuDeleteBtn() throws InterruptedException {
			Thread.sleep(2000);
			click("(//*[text()='Delete'])", "Delete button");
			return this;}
		
		
	//------------->Click > Menu > Preferred/Panel Law Firms > Star
		public CorporatePreferredPanel CuAddStar() throws InterruptedException {
			Thread.sleep(2000);
			click("(//*[@data-testid='StarBorderIcon'])[1]", "Add Favourite Star");
			return this;}
		
		
	//------------->Click > Menu > Preferred/Panel Law Firms > Star
		public CorporatePreferredPanel CuRemoveStar() throws InterruptedException {
			Thread.sleep(2000);
			click("(//*[@aria-label='1 Star'])[1]", "Remove Star");
			return this;}
		
		
	//------------>Click > Menu > Preferred/Panel Law Firms > Remove
		public CorporatePreferredPanel Removebtn() throws InterruptedException {
			Thread.sleep(2000);
			click("(//button[text()='Remove'])", "Remove");
			return this;}
		
			
	//------------>Click > Menu > Preferred/Panel Law Firms > Add
		public CorporatePreferredPanel Addbtn() throws InterruptedException {
			Thread.sleep(2000);
			click("(//button[text()='Add'])", "Add");
			return this;}
		

}

