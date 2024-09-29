package page.base;

import java.nio.file.Paths;
import com.force.base.ProjectHooks;
import com.force.config.ConfigurationManager;
import com.microsoft.playwright.BrowserContext;
import com.microsoft.playwright.PlaywrightException;

public class LoginPage extends ProjectHooks{
	
	public LoginPage clickAcceptAllCookies() throws InterruptedException {
		Thread.sleep(3000);
		click("(//button[text()='Accept All Cookies'])", "Accept All Cookies");
		return this;}
	
	
	public LoginPage acceptNecessaryCookies() {
		click("(//button[text()='Accept Necessary Cookies'])", "Accept Necessary Cookies");
		return this;}
	
	
	public LoginPage clickLogin()throws InterruptedException {
		click("(//button[text()='Log In'])", "Log In");
		Thread.sleep(3000);
		return this;
	}
	
	public LoginPage typeLoginEmail(String username) throws InterruptedException {
		type("[id = '1-email']", username, "username");
		Thread.sleep(3000);
		return this;}
	
	
	public LoginPage typePassword(String password) throws InterruptedException {
		type("[name = 'password']", password, "password");
		Thread.sleep(3000);
		return this;}
	
	public LoginPage clickCredancialsLoginButton()throws InterruptedException {
		click("//span[text()='Log In']", "Log In");
		Thread.sleep(3000);
		return this;
	}
	
	
	public LoginPage doLogin() throws InterruptedException {
		
		clickAcceptAllCookies().clickLogin().
		typeLoginEmail(ConfigurationManager.configuration().appUserName()).
		typePassword(ConfigurationManager.configuration().appPassword()).
		clickCredancialsLoginButton();
		Thread.sleep(3000);
    return this;	
	} 
		
	//========================
	//samanthas includions.
	
	public LoginPage doLoginAdmin() throws InterruptedException {
		
		clickAcceptAllCookies().clickLogin().
		typeLoginEmail(ConfigurationManager.configuration().appAdminUserName()).
		typePassword(ConfigurationManager.configuration().appAdminPassword()).
		clickCredancialsLoginButton();
		Thread.sleep(3000);
    return this;	
	} 
	
	
public LoginPage doLoginLSP() throws InterruptedException {
		
		clickAcceptAllCookies().clickLogin().
		typeLoginEmail(ConfigurationManager.configuration().appLSPUserName()).
		typePassword(ConfigurationManager.configuration().appLSPPassword()).
		clickCredancialsLoginButton();
		Thread.sleep(3000);
    return this;	
	} 
	
//=========================================
	
	//Sign Up
	public LoginPage clicksignUp() {
		click("Sign Up", "Sign Up");
		return this;}
	

	//Sign up as Legal Services Provider
	public LoginPage clicksignUpLsp() {
		click("(//button[text()='Sign up as Legal Services Provider'])", "Sign up as Legal Services Provider");
		return this;}
	
	
	//Sign up as Corporate
	public LoginPage clicksignUpCorporate() {
		click("(//button[text()='Sign up as Corporate'])", "Sign up as Corporate");
		return this;}
	
	
	//Sign in with Google
		public LoginPage signInWithGoogle() {
			click("(//div[text()='Sign in with Google'])", "Sign in with Google");
			return this;}
	
}
