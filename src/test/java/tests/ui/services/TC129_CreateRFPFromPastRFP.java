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
import page.services.CorporateTemplate;
import page.services.CreateRFPPage;
import page.services.CreateRFPSOWPage;

public class TC129_CreateRFPFromPastRFP extends ProjectHooks{
	
	@BeforeTest
	public void setReportValues() {
		testcaseName = "TC003 - Create an RFP";
		testDescription = "Create an RFP with only mandatory fields";
		authors = "Samanthasree";
		category = "CU";
	}
	
	@Test
	public void CreateRFPFromPastRFP() throws InterruptedException {
		
		new LoginPage().doLogin();
		Thread.sleep(3000);
		
		//Declarations
		CreateRFPPage rfp = new CreateRFPPage();
		CorporateTemplate temp = new CorporateTemplate();
		
		
		//CCR Page inputs
		rfp.clickDraftNewRFP();
		Thread.sleep(2000);
		
		rfp.clickFromPastRFPs().btnSelectRFP();
		Thread.sleep(3000);
		
		temp.CuMoveAllContent().CuMovebacktoRFP();
		Thread.sleep(3000);
		
		
		//Preview RFP
		rfp.menuPreviewRFP().clickSubmit();
		Thread.sleep(2000);
		

		String Actual  = getInnerText("//*[text()='New RFP submitted successfully.']");
		String Expected = "New RFP submitted successfully.";
		if(Actual.equals(Expected))
			System.out.println( "Pass - New RFP submitted successfully.");
		else
			System.out.println("Fail - Incorrect success message displayed");
		Thread.sleep(2000);
		
	}
}