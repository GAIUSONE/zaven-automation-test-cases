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


public class TC001_LogIn extends ProjectHooks{
	
	@BeforeTest
	public void setReportValues() {
		testcaseName = "TC001";
		testDescription = "Successfull Login";
		authors = "Samanthasree";
		category = "LogIn";
	}
		@Test
	public void logIn() throws InterruptedException {
	
			new LoginPage().clickAcceptAllCookies().clickLogin().
			typeLoginEmail(ConfigurationManager.configuration().appUserName()).
			typePassword(ConfigurationManager.configuration().appPassword()).
			clickCredancialsLoginButton();
			Thread.sleep(3000);
			
			}
}
		
	


