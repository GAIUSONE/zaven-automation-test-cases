package tests.ui.services;

import org.testng.annotations.Test;
import com.force.base.ProjectHooks;
import org.testng.annotations.BeforeTest;
import page.base.LoginPage;
import page.services.CorporateTemplate;
import page.services.CreateRFPPage;
import page.services.LSPViewProposalPage;
import page.services.ProposalSOWPage;
import page.services.ProposalSideBySidePage;

public class TC119_ProposalTemplateBankMoveAllContents extends ProjectHooks{
	
	@BeforeTest
	public void setReportValues() {
		testcaseName = "TC116 - View Template bank";
		testDescription = "Verify view functionality for Template bank";
		authors = "Samanthasree";
		category = "CU";
	}
	
	@Test
	public void ProposalTemplateBankDelete() throws InterruptedException {
		
		new LoginPage().doLoginLSP();
		Thread.sleep(3000);
		
		CreateRFPPage rfp = new CreateRFPPage();
		LSPViewProposalPage lsp = new LSPViewProposalPage();
		CorporateTemplate temp = new CorporateTemplate();
		
		//CCR Page inputs
			
		lsp.clickViewProposal();
		Thread.sleep(3000);
		lsp.clickWeConfirmCCR();
		rfp.clickSubmit();
		Thread.sleep(3000);
		temp.CuFromTemplateBank().btnSelect().CuMoveAllContent().CuMovebacktoProposal();
		Thread.sleep(3000);
		
		
		//Preview RFP
		lsp.menuPreviewProposal();
		rfp.clickSubmit();
		Thread.sleep(2000);
		

		String Actual  = getInnerText("//*[text()='Proposal added successfully.']");
		String Expected = "Proposal added successfully.";
		if(Actual.equals(Expected))
			System.out.println( "Pass - Proposal added successfully.");
		else
			System.out.println("Fail - Incorrect success message displayed");
		Thread.sleep(2000);
		
		
		
		
		
	}
}