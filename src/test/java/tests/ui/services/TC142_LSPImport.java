package tests.ui.services;

import org.testng.annotations.Test;
import com.force.base.ProjectHooks;
import com.microsoft.playwright.PlaywrightException;
import org.openqa.selenium.Keys;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import org.testng.annotations.BeforeTest;
import page.services.LSPViewProposalPage;
import page.base.AdminPage;
import page.base.LoginPage;
import page.services.CreateRFPPage;
import page.services.CreateRFPSOWPage;
import page.services.CuRegistrationPage;
import page.services.ProposalSOWPage;

public class TC142_LSPImport extends ProjectHooks{
	
	@BeforeTest
	public void setReportValues() {
		testcaseName = "TC143 - Save a proposal as drafts";
		testDescription = "Save an existing proposal as drafts";
		authors = "Samanthasree";
		category = "CU";
	}
	
	@Test
	public void CreateLSPSaveAsDrafts() throws InterruptedException {
		
		new LoginPage().doLoginLSP();
		Thread.sleep(3000);
		
		CreateRFPPage rfp = new CreateRFPPage();
		LSPViewProposalPage lsp = new LSPViewProposalPage();
		ProposalSOWPage psow = new ProposalSOWPage();
		
		
		//CCR Page inputs
			
		lsp.clickViewProposal().clickWeConfirmCCR();
		Thread.sleep(2000);
		rfp.clickSubmit();
		

		//Preview inputs
		lsp.menuExportProposal();
		Thread.sleep(2000);
		lsp.menuImportProposal();
				
			String Actual  = getInnerText("//*[text()='File uploaded Successfully']");
			String Expected = "File uploaded Successfully";
				if(Actual.equals(Expected))
					System.out.println( "Pass - File uploaded Successfully");
						else
					System.out.println("Fail - Incorrect success message displayed");
				Thread.sleep(2000);
			}	
		  }	
		
	

