package page.base;

import java.nio.file.Paths;
import com.force.base.ProjectHooks;
import com.force.config.ConfigurationManager;
import com.microsoft.playwright.BrowserContext;
import com.microsoft.playwright.PlaywrightException;

import page.services.CorporatePreferredPanel;
import page.services.CuRegistrationPage;

public class AdminPage extends ProjectHooks{
	
	
	//Click Menu Bar > Dashboard 
		public AdminPage clickDashboard() throws InterruptedException {
			click("(//*[text()='Dashboard'])", "Dashboard");
			return this;}
	
	
	//Click Menu Bar > Corporate 
	public AdminPage clickCorporate() throws InterruptedException {
		forceClick("(//*[text()='Corporate'])", "Corporate");
		return this;}
	
	
	//click Menu Bar > LegalServicesProviders
	public AdminPage clickLegalServicesProviders() throws InterruptedException {
		forceClick("(//*[text()='Legal Services Providers'])", "Legal Services Providers");
		return this;}
	
	//click Menu Bar > Payments
	public AdminPage clickPayments() throws InterruptedException {
		forceClick("(//a[text()='Payments'])", "Payments");
		return this;}

	//click Menu Bar > RFPs List
	public AdminPage clickRFPsList() throws InterruptedException {
		forceClick("(//*[text()='RFPs List'])", "RFPs List");
		return this;}
	
	//====================================================================================

	
	//Type > Searchbox
	public AdminPage typeSearch(String searchvalue) throws InterruptedException {
		typeAndEnter("//label[text()='Search']", searchvalue , "Search");
		return this;}
	
	
	//click > Tick Icon
	public AdminPage clickApprove() throws InterruptedException {
		click("(//*[@data-testid='DoneIcon'])[1]", "TickIcon");
		return this;}
	
	
	//Click > Button confirmation box Approve 
	public AdminPage btnApprove() throws InterruptedException {
		click("(//button[text()='Approve'])", "btnApprove");
		return this;}
	
	
	//Click > Button Confirmation box Cancel
	public AdminPage btnCancel() throws InterruptedException {
		click("(//button[text()='Cancel'])", "btnCancel");
		return this;}
	
	
	//Click > Reject Icon
	public AdminPage clickReject() throws InterruptedException {
		click("(//*[@data-testid='RemoveCircleIcon'])[1]", "Reject");
		return this;}
	
	
	//Click > Button Confirmation box Decline button
	public AdminPage btnDecline() throws InterruptedException {
		click("(//button[text()='Decline'])", "btnDecline");
		return this;}
	
	
	//Click > Email Icon
	public AdminPage clickEmail() throws InterruptedException {
		click("(//*[@data-testid='EmailOutlinedIcon'])[1]", "Email");
		return this;}
	
	
	//Click > Button confirmation box Preview email.
	public AdminPage btnPreviewEmail() throws InterruptedException {
		click("(//button[text()='Preview Email'])", "btnPreviewEmail");
		return this;}
	
	
	//Click > Confirmation box Preview Email close Icon.
	public AdminPage clickClosePreviewIcon() throws InterruptedException {
		click("(//*[@data-testid='ClearOutlinedIcon'])[2]", "CloseIconPreviewEmail");
		return this;}
	
	
	//Click > Button confirmation box close for SendEmail.
	public AdminPage btnSendEmail() throws InterruptedException {
		click("(//button[text()='Send Email'])", "btnSendEmail");
		return this;}
	
	
	//Click > Button confirmation box SendEmail.
	public AdminPage typeSendEmail(String SendEmail) throws InterruptedException {
		type("//*[@name='Send Email']", SendEmail , "Send Email");
		return this;}
	
	
	//Click > View Icon
	public AdminPage clickView() throws InterruptedException {
		click("(//*[@data-testid='VisibilityIcon'])[1]", "ViewIcon");
		return this;}
	
	
	//click View CloseIcon
	public AdminPage clickViewClose() throws InterruptedException {
		click("(//*[@data-testid='ClearOutlinedIcon'])", "CloseView");
		return this;}
	
	
	//click Button > Invite Legal Services Providers
	public AdminPage btnInviteLSP() throws InterruptedException {
		click("(//button[text()='Invite Legal services providers'])", "Invite Legal Services Providers");
		return this;}
	
	
	//Type Invite Legal Services Providers pop up First Name.
	public AdminPage typeInviteFirstName(String FirstName) throws InterruptedException {
		type("//*[@name='users.0.first_name']", FirstName , "Invite First Name");
		return this;}

	
	//Type Invite Legal Services Providers pop up Last Name.
	public AdminPage typeInviteLastName(String LastName) throws InterruptedException {
		type("//*[@name='users.0.surname']", LastName , "Invite Last Name");
		return this;}
	
	
	//Type Invite Legal Services Providers pop up Last Name.
	public AdminPage typeInviteEmailAddress(String emailaddress) throws InterruptedException {
		type("//*[@name='users.0.invite_email']", emailaddress , "Invite Email Address");
		return this;}
	
	
	//click Button > Submit
	public AdminPage btnSubmit() throws InterruptedException {
		click("(//button[text()='Submit'])", "Submit");
		return this;}
	
	
	//click Button > Sign out
	public AdminPage btnSignOut() throws InterruptedException {
		click("(//button[text()='Sign out'])[2]", "Signout");
		return this;}
	
	
	//click Button > Profile Expand Arrow
	public AdminPage clickAdminProfileArrow() throws InterruptedException {
		click("//*[@data-testid='ExpandMoreTwoToneIcon']", "Expand Profile Arrow");
		return this;}
	
	
//========================================== >     Payments Page specific      <==============================================================
		
	//Expand Drop down > Select succeeded
		public AdminPage selectDropdownPaymentSucceeded() throws InterruptedException {
			click("//label[text()='Status']", "Status");
			click("//li[text()='Succeeded']", "Status");
			return this;}
	
	
	
	//Expand Drop down > Failed
		public AdminPage selectdropdownPaymentFailed() throws InterruptedException {
			click("//*[@data-testid='ExpandMoreTwoToneIcon']", "Expand Profile Arrow");
			return this;}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
