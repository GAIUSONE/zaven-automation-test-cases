package page.services;


import java.awt.event.KeyEvent;
import com.force.base.ProjectHooks;
import com.force.config.ConfigurationManager;
import com.microsoft.playwright.BrowserContext;
import com.microsoft.playwright.Frame.GetByTitleOptions;
import com.microsoft.playwright.PlaywrightException;

import page.base.AdminPage;
import page.base.ZavenHooks;

public class ProposalDashboard extends ProjectHooks{
	
//------------------------>  RFP DashBoard <-----------------------

	
	//Click > Menu > Expand Icon
	public ProposalDashboard expandIcon() throws InterruptedException {
		click("(//*[@data-testid='ExpandMoreTwoToneIcon'])", "Expand Menu Arrow");
		Thread.sleep(3000);
		return this;}
			
	
	
	//Click > Profile Menu Item > Financials
	public ProposalDashboard clickFinancials() throws InterruptedException {
		click("(//span[text()='Financials'])", "Financials");
		Thread.sleep(3000);
		return this;}
	
	
	
	//Click > Financials > Credit card details > Continue
		public ProposalDashboard creditContinue() throws InterruptedException {
			click("(//button[text()='Continue'])[1]", "Credit card Continue");
			Thread.sleep(3000);
			return this;}
	
	
	//Type > Credit card details > Card information
		public ProposalDashboard creditCardInfo(String cardnumber) throws InterruptedException {
			type("(//input[@name='cardNumber'])",cardnumber ,"Credit Card Number");
			Thread.sleep(3000);
			return this;}
	
	
	//Type > Credit card details > Card Expiry
		public ProposalDashboard creditCardExpiry(String cardexpiry) throws InterruptedException {
			type("(//input[@name='cardExpiry'])", cardexpiry ,"Credit Card Expiry");
			Thread.sleep(3000);
			return this;}
		
		
	//Type > Credit card details > Card CVC
		public ProposalDashboard creditCardCVC(String cardcvc) throws InterruptedException {
			type("(//input[@name='cardCvc'])", cardcvc ,"Credit Card CVC");
			Thread.sleep(3000);
			return this;}
		
	
		
	//Type > Credit card details > Cardholder name
		public ProposalDashboard creditCardHolderName(String cardholdername) throws InterruptedException {
			type("(//input[@name='billingName'])", cardholdername ,"Credit Card Holder Name");
			Thread.sleep(3000);
			return this;}
		
		
	//Check > Credit card details > Securely save my information for 1-click checkout
		public ProposalDashboard creditSecurelysave() throws InterruptedException {
			check("(//input[@name='enableStripePass'])", "Credit Card SaveCard information");
			Thread.sleep(3000);
			return this;}
		
		
	//Check > Credit card details > Card Phone Number
		public ProposalDashboard creditPhoneNumber(String phoneNumber) throws InterruptedException {
			type("(//input[@name='phoneNumber'])",phoneNumber, "Credit Card Phone Number");
			Thread.sleep(3000);
			return this;}
		
		
	//Check > Credit card details > Save card
		public ProposalDashboard creditSaveCard() throws InterruptedException {
			click("(//span[text()='Save card'])", " Save Card ");
			Thread.sleep(3000);
			return this;}	
		
	
	//Check > Credit card details > Pay without Link
		public ProposalDashboard creditPayWithOutLink() throws InterruptedException {
			click("(//span[text()='Pay without Link'])", " Pay without Link ");
			Thread.sleep(3000);
			return this;}
		
		
	//Check > Credit card details > Remove
		public ProposalDashboard btnRemove() throws InterruptedException {
			click("(//button[text()='Remove'])", " Remove ");
			Thread.sleep(3000);
			return this;}
		
		
	//Check > Credit card details > WizardRemove
		public ProposalDashboard btnWizRemove() throws InterruptedException {
			click("(//button[text()='Remove'])[2]", " Remove ");
			Thread.sleep(3000);
			return this;}
		
	
	//Check > Credit card details > Update
		public ProposalDashboard btnUpdate() throws InterruptedException {
			click("(//button[text()='Update'])", " Update ");
			Thread.sleep(3000);
			return this;}
		
		
	//Check > Credit card details > WizardRemove
		public ProposalDashboard btnWizUpdate() throws InterruptedException {
			click("(//button[text()='Update'])[2]", " Remove ");
			Thread.sleep(3000);
			return this;}
		
		
	//Click > Financials > Payment History
		public ProposalDashboard paymentHistory() throws InterruptedException {
			click("(//button[text()='Payment History'])", " Payment History ");
			Thread.sleep(3000);
			return this;}
		
		
	//Click > Financials > View Receipt
		public ProposalDashboard viewReceipt() throws InterruptedException {
			click("(//*[text()='View Receipt'])[1]", " View Receipt ");	
			Thread.sleep(3000);
			return this;}
	
}