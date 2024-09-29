package tests.ui.services;

import org.testng.annotations.Test;
import com.force.base.ProjectHooks;
import org.testng.annotations.BeforeTest;
import page.base.LoginPage;
import page.services.CorporateTemplate;
import page.services.ProposalSideBySidePage;

public class TC116_ProposalTemplateBankView extends ProjectHooks{
	
	@BeforeTest
	public void setReportValues() {
		testcaseName = "TC116 - View Template bank";
		testDescription = "Verify view functionality for Template bank";
		authors = "Samanthasree";
		category = "CU";
	}
	
	@Test
	public void ProposalTemplateBankView() throws InterruptedException {
		
		new LoginPage().doLoginLSP();
		Thread.sleep(3000);
		
		
		//Declarations
		CorporateTemplate temp = new CorporateTemplate();
		ProposalSideBySidePage side = new ProposalSideBySidePage();
		
		Thread.sleep(2000);
		temp.CuTemplatesBank().CuView();
		Thread.sleep(2000);
		side.clickClose();

		
			}
      }	

