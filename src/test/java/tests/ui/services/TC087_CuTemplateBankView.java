package tests.ui.services;

import org.testng.annotations.Test;
import com.force.base.ProjectHooks;
import com.microsoft.playwright.PlaywrightException;
import org.openqa.selenium.Keys;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import org.testng.annotations.BeforeTest;
import page.base.LoginPage;
import page.services.CreateRFPPage;
import page.services.ProposalSideBySidePage;
import page.services.CorporateTemplate;
import page.services.ProposalSideBySidePage;



public class TC087_CuTemplateBankView extends ProjectHooks{
	
	@BeforeTest
	public void setReportValues() {
		testcaseName = "TC087 - Create an RFP";
		testDescription = "Create an RFP with only mandatory fields";
		authors = "Samanthasree";
		category = "CU";
	}
	
	@Test
	public void CuTemplateBankView() throws InterruptedException {
		
		new LoginPage().doLogin();
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
	
	
	
	