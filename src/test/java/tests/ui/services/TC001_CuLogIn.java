package tests.ui.services;

import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;
import com.force.base.ProjectHooks;
import com.force.config.ConfigurationManager;
import org.testng.annotations.BeforeTest;
import page.base.LoginPage;

public class TC001_CuLogIn extends ProjectHooks{
	
	@BeforeTest
	public void setReportValues() {
		testcaseName = "TC001 - Corporate User Login";
		testDescription = "Test case to verify successfull login as a Corporate User";
		authors = "Samanthasree";
		category = "LogIn";
	}
		@Test
	public void cuLogIn() throws InterruptedException {
	
			new LoginPage().clickAcceptAllCookies().clickLogin().
			typeLoginEmail(ConfigurationManager.configuration().appUserName()).
			typePassword(ConfigurationManager.configuration().appPassword()).
			clickCredancialsLoginButton();
		//	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
			String Actual = getInnerText("//button[text()='Draft New RFP']");
					
			String Expected = "Draft New RFP";
			if(Actual.equals(Expected))
				System.out.println( "Pass -Corporate Login Successful.");
					else
				System.out.println("Fail - Login failed.");
			
			}
}
		
	


