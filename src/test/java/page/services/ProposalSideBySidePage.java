package page.services;


import java.awt.event.KeyEvent;
import com.force.base.ProjectHooks;
import com.force.config.ConfigurationManager;
import com.microsoft.playwright.BrowserContext;
import com.microsoft.playwright.PlaywrightException;

import page.base.AdminPage;
import page.base.ZavenHooks;

public class ProposalSideBySidePage extends ProjectHooks{
	
//------------------------>  RFP DashBoard <-----------------------

	 

	//Click > Button View RFP 
	public ProposalSideBySidePage clickViewRFP() throws InterruptedException {
		click("(//button[text()='View RFP'])[1]", "View RFP");
		Thread.sleep(5000);
		return this;}
	
	//Type - Value for Pricing
  	public ProposalSideBySidePage enterSidePricing(String Value) throws InterruptedException {
  		type("//*[@name='pricing']", Value , "Pricing");	
  		return this;}
  	
  	
  	//Type -  Assumptions & Exclusions
  	public ProposalSideBySidePage enterSideAssumptionsExclusions(String Value) throws InterruptedException {
  		type("//*[@name='assumptionsExclusions']", Value , "Assumptions & Exclusions");	
  		return this;}
  	
  	
  	//Type - Key team members
  	public ProposalSideBySidePage enterSideKeyTeamMembers(String Value) throws InterruptedException {
  		type("//*[@name='keyTeamMembers']", Value , "Key team members");	
  		return this;}
  	
  	
  	//Type - Staffing and project management
  	public ProposalSideBySidePage enterSideStaffing(String Value) throws InterruptedException {
  		type("//*[@name='staffing']", Value , "Staffing");	
  		return this;}
  	
  	
  	//Type - Diversity
  	public ProposalSideBySidePage enterSideDiversity(String Value) throws InterruptedException {
  		type("//*[@name='diversity']", Value , "Diversity");	
  		return this;}
  	
  	
  	//Type - Credentials
  	public ProposalSideBySidePage enterSideCredentials(String Value) throws InterruptedException {
  		type("//*[@name='credentials']", Value , "Credentials");	
  		return this;}	
  	
  	
  	//Type - Disaggregation
  	public ProposalSideBySidePage enterSideDisaggregation(String Value) throws InterruptedException {
  		type("//*[@name='disaggregation']", Value , " Disaggregation");	
  		return this;}
  	
  	
  		//Type - USP
  		public ProposalSideBySidePage enterSideUSP(String Value) throws InterruptedException {
  			type("//*[@name='usp']", Value , "USP");	
  			return this;}	
  	
  		
  		//Type - Video
  		public ProposalSideBySidePage enterSideVideo(String Value) throws InterruptedException {
  			type("//*[@name='video']", Value , "Video");	
  			return this;}
  	
  	
  		//Type - Other
  		public ProposalSideBySidePage enterSideOther(String Value) throws InterruptedException {
  			type("//*[@name='other']", Value , " other");	
  			return this;}	
  	
  		
  	//Button - Select Winning bidder.
  		public ProposalSideBySidePage clickViewFullProposal() throws InterruptedException {
  			click("(//button[text()='View full proposal'])", "View full proposal");
  			Thread.sleep(3000);
  			return this;}
  		
  	//Button - Select Winning bidder.
  		public ProposalSideBySidePage clickClose() throws InterruptedException {
  				click("(//*[@data-testid='ClearOutlinedIcon'])", "CloseIcon");
  				return this;}
  		
  	
  		//Button - Select Winning bidder.
  		public ProposalSideBySidePage clickSelectWinningBidder() throws InterruptedException {
  			click("(//button[text()='Select winning bidder'])", "Select winning bidder");
  			Thread.sleep(3000);
  			return this;}
  		
  	
  		//Button - Confirm.
  		public ProposalSideBySidePage btnConfirm() throws InterruptedException {
  			click("(//button[text()='Confirm'])", "Confirm button");
  			Thread.sleep(3000);
  			return this;}
  		
  		
  		
  	
	
	
}