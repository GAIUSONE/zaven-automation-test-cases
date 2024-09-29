package tests.ui.services;

import org.testng.annotations.Test;
import com.force.base.ProjectHooks;
import org.testng.annotations.BeforeTest;
import page.base.LoginPage;
import page.services.CorporateTemplate;
import page.services.CreateRFPPage;
import page.services.ProposalSideBySidePage;

public class TC118_ProposalTemplateBankUpdate extends ProjectHooks{
	
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
		
		
		//Declarations
		CorporateTemplate temp = new CorporateTemplate();
		ProposalSideBySidePage side = new ProposalSideBySidePage();
		CreateRFPPage rfp = new CreateRFPPage();
		
		Thread.sleep(2000);
		temp.CuTemplatesBank().propUpdate().propPreviewTemplate().clickSave();
		Thread.sleep(2000);
		rfp.clickSubmit();
		Thread.sleep(2000);
		
		String Actual  = getInnerText("//*[text()='Proposal Template updated successfully.']");
		String Expected = "Proposal Template deleted successfully.";
		if(Actual.equals(Expected))
			System.out.println( "Pass - Proposal Template deleted successfully.");
		else
			System.out.println("Fail - Incorrect success message displayed");
		Thread.sleep(2000);	
		
			}
      }	

