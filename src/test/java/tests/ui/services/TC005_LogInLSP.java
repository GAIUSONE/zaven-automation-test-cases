package tests.ui.services;

import org.testng.annotations.Test;

import com.force.base.ProjectHooks;
import com.force.config.ConfigurationManager;
import com.microsoft.playwright.BrowserContext;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.PlaywrightException;
import java.nio.file.Paths;
import org.testng.annotations.BeforeTest;
import page.base.HomePage;
import page.base.LoginPage;
import page.base.ZavenHooks;


public class TC005_LogInLSP extends ProjectHooks{
	
	@BeforeTest
	public void setReportValues() {
		testcaseName = "TC001";
		testDescription = "Successfull Login";
		authors = "Samanthasree";
		category = "LogIn";
	}
		@Test
	public void logIn() throws InterruptedException {
	
			new LoginPage().doLoginLSP();
			Thread.sleep(3000);
			
			}
}
		
	


