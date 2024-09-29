package tests.ui.services;

import org.testng.annotations.Test;
import com.force.base.ProjectHooks;
import org.testng.annotations.BeforeTest;
import page.base.LoginPage;
import page.services.CorporateTemplate;
import page.services.ProposalSideBySidePage;

public class TC117_ProposalTemplateBankDelete extends ProjectHooks{
	
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
		
		Thread.sleep(2000);
		temp.CuTemplatesBank().CuDelete();
		Thread.sleep(2000);
		temp.PropWizDelete();
		
		Thread.sleep(2000);
		
		String Actual  = getInnerText("//*[text()='Proposal Template Bank deleted successfully.']");
		String Expected = "Proposal Template Bank deleted successfully.";
		if(Actual.equals(Expected))
			System.out.println( "Pass - Proposal Template Bank deleted successfully.");
		else
			System.out.println("Fail - Incorrect success message displayed");
		Thread.sleep(2000);	
		
			}
      }	

