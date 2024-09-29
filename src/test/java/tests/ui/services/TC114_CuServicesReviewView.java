package tests.ui.services;

import org.testng.annotations.Test;
import com.force.base.ProjectHooks;
import org.testng.annotations.BeforeTest;
import page.base.LoginPage;
import page.services.CorporateServicesReview;
import page.services.CorporateTemplate;
import page.services.CorporateUser;
import page.services.CreateRFPPage;
import page.services.CuRegistrationPage;
import page.services.LSPViewProposalPage;
import page.services.ProposalSOWPage;
import page.services.ProposalSideBySidePage;

public class TC114_CuServicesReviewView extends ProjectHooks{
	
	@BeforeTest
	public void setReportValues() {
		testcaseName = "TC116 - View Template bank";
		testDescription = "Verify view functionality for Template bank";
		authors = "Samanthasree";
		category = "CU";
	}
	
	@Test
	public void CuServicesReviewView() throws InterruptedException {
		
		new LoginPage().doLogin();
		Thread.sleep(3000);
		
		
		//Declarations
		CorporateServicesReview services = new CorporateServicesReview();
		CuRegistrationPage cureg = new CuRegistrationPage();
		CorporateUser user = new CorporateUser();
				
		services.CuServicesReview();
				Thread.sleep(2000);
				
		services.switchViewReviews();
		Thread.sleep(2000);
		services.selectByLSP("SAM GMAIL TEST COMPANY FINAL");
		Thread.sleep(3000);
		services.selectByLeadPartner("Samanthasree CG2");
		Thread.sleep(3000);
		
		
	
		if(getInnerText("//*[contains(text(),'new']") != null)
		//String Expected = "*new";
		//if(Actual.contains("new"))
			System.out.println( "Pass - Displayes project name : new");
		else
			System.out.println("Fail - No data displayed");
		Thread.sleep(2000);
		
		
	}
	
}