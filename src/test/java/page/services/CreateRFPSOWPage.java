package page.services;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import com.force.base.ProjectHooks;
import com.force.config.ConfigurationManager;
import com.microsoft.playwright.BrowserContext;
import com.microsoft.playwright.PlaywrightException;
import page.base.ZavenHooks;

public class CreateRFPSOWPage extends ProjectHooks{

//---------------------------->	Scope of Work (SOW)*
	
	//1.--------------------------------------------------->  Commercial contracts <---------------------------------------------------------------------
	
		
		//Drop Down Scope -> Commercial contracts
		public CreateRFPSOWPage selectScopeCommercial() throws InterruptedException {
			click("//div[@id='mui-component-select-scope_of_work[0].scope_of_work_id']","Commercial contracts");
			click("//li[text()='Commercial contracts']" , "Commercial contracts");
			return this;} 
	
	
		// check Box > Legal advice
			public CreateRFPSOWPage checkCommLegalAdvice() throws InterruptedException {
				check("//*[@name='scope_of_work[0].commercial_contracts.legal_advice.value']", "Legal Advice");
			return this;}
			
		//Legal advice > Expected completion date (optional) 
		   public CreateRFPSOWPage CommLegalAdviceDate() throws InterruptedException {
				click("(//input[@name='scope_of_work[0].commercial_contracts.legal_advice.dt'])","completion Date");
				click("//button[contains(@class,'MuiPickersDay-dayWithMargin MuiPickersDay-today')]","date");
				return this;}
		  	
		  	
		  //Comment box - Legal advice
		  	public CreateRFPSOWPage enterCommLegalAdviceCmts(String CommLegalAdviceComments) throws InterruptedException {
		  		type("//*[@name='scope_of_work[0].commercial_contracts.legal_advice.comment']", CommLegalAdviceComments , " Legal Advice Comments");	
		  		return this;}
			
	
			// check Box > Contract drafting
			public CreateRFPSOWPage checkCommContractdrafting() throws InterruptedException {
				check("//*[@name='scope_of_work[0].commercial_contracts.contract_drafting.value']", "Contract drafting");
				return this;}
			
			
			//Contract drafting > Expected completion date (optional) > Contract drafting
			 public CreateRFPSOWPage CommContractdraftingDate() throws InterruptedException {
					click("(//input[@name='scope_of_work[0].commercial_contracts.contract_drafting.dt'])","completion Date");
					click("//button[contains(@class,'MuiPickersDay-dayWithMargin MuiPickersDay-today')]","date");
					return this;}
			
			 //Comment box - Contract drafting
			  	public CreateRFPSOWPage enterCommContractdraftingCmts(String ContractdraftingComments) throws InterruptedException {
			  		type("//*[@name='scope_of_work[0].commercial_contracts.contract_drafting.comment']", ContractdraftingComments , " Contract drafting Comments");	
			  		return this;}
			
			
			// check Box > Contract review
			public CreateRFPSOWPage checkCommContractReview() throws InterruptedException {
				check("//*[@name='scope_of_work[0].commercial_contracts.contract_review.value']", "Contract review");
				return this;}
			
			
			//Contract review > Expected completion date (optional) > 
			 public CreateRFPSOWPage CommContractReviewDate() throws InterruptedException {
					click("(//input[@name='scope_of_work[0].commercial_contracts.contract_review.dt'])","completion Date");
					click("//button[contains(@class,'MuiPickersDay-dayWithMargin MuiPickersDay-today')]","date");
					return this;}
			
			 //Comment box - Contract review 
			  	public CreateRFPSOWPage enterCommContractReviewCmts(String ContractreviewComments) throws InterruptedException {
			  		type("//*[@name='scope_of_work[0].commercial_contracts.contract_review.comment']", ContractreviewComments , " Contract review ");	
			  		return this;}
			
			
			
			
			// check Box > Negotiation
			public CreateRFPSOWPage checkCommNegotiation() throws InterruptedException {
				check("//*[@name='scope_of_work[0].commercial_contracts.negotiation.value']", "Negotiation");
				return this;}
			
			
			
			//Negotiation > Expected completion date (optional) 
			 public CreateRFPSOWPage CommNegotiationDate() throws InterruptedException {
					click("(//input[@name='scope_of_work[0].commercial_contracts.negotiation.dt'])","completion Date");
					click("//button[contains(@class,'MuiPickersDay-dayWithMargin MuiPickersDay-today')]","date");
					return this;}
			
			 //Comment box - Negotiation
			  	public CreateRFPSOWPage enterCommNegotiationCmts(String NegotiationComments) throws InterruptedException {
			  		type("//*[@name='scope_of_work[0].commercial_contracts.negotiation.comment']", NegotiationComments , " Negotiation Comments ");	
			  		return this;}
			
			
			// check Box > Regulatory
			public CreateRFPSOWPage checkCommRegulatory() throws InterruptedException {
				check("//*[@name='scope_of_work[0].commercial_contracts.regulatory.value']", "Regulatory");
				return this;}
			
			//Regulatory > Expected completion date (optional) 
			 public CreateRFPSOWPage CommRegulatoryDate() throws InterruptedException {
					click("(//input[@name='scope_of_work[0].commercial_contracts.regulatory.dt'])","completion Date");
					click("//button[contains(@class,'MuiPickersDay-dayWithMargin MuiPickersDay-today')]","date");
					return this;}
			
			 //Comment box - Regulatory
			  	public CreateRFPSOWPage enterCommRegulatoryCmts(String RegulatoryComments) throws InterruptedException {
			  		type("//*[@name='scope_of_work[0].commercial_contracts.regulatory.comment']", RegulatoryComments , " Regulatory Comments ");	
			  		return this;}
			
			
			// check Box > Other
			public CreateRFPSOWPage checkCommOther() throws InterruptedException {
				check("//*[@name='scope_of_work[0].commercial_contracts.other.value']", "Other");
				return this;}
			
			
			//Other > Expected completion date (optional) 
			 public CreateRFPSOWPage CommOtherDate() throws InterruptedException {
					click("(//input[@name='scope_of_work[0].commercial_contracts.other.dt'])","completion Date");
					click("//button[contains(@class,'MuiPickersDay-dayWithMargin MuiPickersDay-today')]","date");
					return this;}
			
			 //Comment box - Other
			  public CreateRFPSOWPage enterCommOtherCmts(String OtherComments) throws InterruptedException {
			  		type("//*[@name='scope_of_work[0].commercial_contracts.other.comment']", OtherComments , " Other Comments ");	
			  		return this;}
			
			
			//Global Comment box - Commercial contracts
		  	public CreateRFPSOWPage enterCommercialGblCmts(String CommercialGlbComments) throws InterruptedException {
		  		type("//*[@name='scope_of_work[0].commercial_contracts.comment']", CommercialGlbComments, "Commercial contracts Comments");	
		  		return this;}
		  	
		  	
		  	// upload File
		  	public CreateRFPSOWPage sowFileUpload() throws InterruptedException {
				Thread.sleep(2000);
				uploadFile("(//b[text()='Add File:']//following::button)[1]/input", "./Uploads/LSP Logo.png", "CommercialFileUpload");
				return this;}
	
	
	//2.--------------------------------------------------->  Competition <-----------------------------------------------------------------------------------------
		
		
		//Drop Down Scope -> Commercial contracts
		public CreateRFPSOWPage selectScopeCompetition() throws InterruptedException {
			Thread.sleep(2000);
			click("//div[@id='mui-component-select-scope_of_work[0].scope_of_work_id']", "Competition" );
			click("//li[text()='Competition']" , "Competition" );
			Thread.sleep(3000);
			return this;} 
		
		
		//Transactional work
		//check Box > Merger control advice/filing
		public CreateRFPSOWPage checkCompetitionTransMerger() throws InterruptedException {
			check("//*[@name='scope_of_work[0].competition.transactional_work.merger_control.value']", "Merger control advice/filing");
			Thread.sleep(3000);
			return this;}
		
		//Transactional work > Merger control advice/filing > Expected completion date (optional) 
		   public CreateRFPSOWPage CompetitionTransMergerDate() throws InterruptedException {
				Thread.sleep(2000);
				click("(//input[@name='scope_of_work[0].competition.transactional_work.merger_control.dt'])","completion Date");
				click("//button[contains(@class,'MuiPickersDay-dayWithMargin MuiPickersDay-today')]","date");
				return this;}
		  	
		  	
		  //Comment box > Transactional work > Merger control advice/filing >
		  	public CreateRFPSOWPage competitionTransMergerCmts(String CompetitionTransMergerComments) throws InterruptedException {
		  		Thread.sleep(3000);
		  		type("//*[@name='scope_of_work[0].competition.transactional_work.merger_control.comment']", CompetitionTransMergerComments , " Merger control advice/filing Comments");	
		  		return this;}
		
		
		//check Box > Advice
		public CreateRFPSOWPage checkCompetitionTransAdvice() throws InterruptedException {
			check("//*[@name='scope_of_work[0].competition.transactional_work.advice.value']", "Transactional work Advice ");
			Thread.sleep(3000);
			return this;}
		
		
		//Transactional work > Advice > Expected completion date (optional) 
		   public CreateRFPSOWPage CompetitionTransAdviceDate() throws InterruptedException {
				Thread.sleep(2000);
				click("(//input[@name='scope_of_work[0].competition.transactional_work.advice.dt'])","completion Date");
				click("//button[contains(@class,'MuiPickersDay-dayWithMargin MuiPickersDay-today')]","date");
				return this;}
		  	
		  	
		  //Comment box > Transactional work > Advice
		  	public CreateRFPSOWPage competitionTransAdviceCmts(String CompetitionTransAdviceComments) throws InterruptedException {
		  		Thread.sleep(3000);
		  		type("//*[@name='scope_of_work[0].competition.transactional_work.advice.comment']", CompetitionTransAdviceComments , "Transactional work Advice Comments");	
		  		return this;}
		
	
		
		//Behavioural work
		//check Box > Cartel investigation
		public CreateRFPSOWPage checkCompetitionBehaviouralCartel() throws InterruptedException {
			check("//*[@name='scope_of_work[0].competition.behavioural_work.cartel_investigation.value']", " Behavioural work Cartel ");
			Thread.sleep(3000);
			return this;}
		
		//Behavioural work > Cartel investigation> Expected completion date (optional) 
		   public CreateRFPSOWPage CompetitionBehaviCartelDate() throws InterruptedException {
				Thread.sleep(2000);
				click("(//input[@name='scope_of_work[0].competition.behavioural_work.cartel_investigation.dt'])","completion Date");
				click("//button[contains(@class,'MuiPickersDay-dayWithMargin MuiPickersDay-today')]","date");
				return this;}
		  	
		  	
		 //Comment box > Behavioural work > Cartel investigation
		  	public CreateRFPSOWPage competitionBehaviCartelCmts(String CompetitionBehaviCartelComments) throws InterruptedException {
		  		Thread.sleep(3000);
		  		type("//*[@name='scope_of_work[0].competition.behavioural_work.cartel_investigation.comment']", CompetitionBehaviCartelComments , "Behavioural work Cartel Comments");	
		  		return this;}
		
	
		//check Box > Antitrust investigation
		public CreateRFPSOWPage checkCompetitionBehaviouralAntitrust() throws InterruptedException {
			check("//*[@name='scope_of_work[0].competition.behavioural_work.antitrust_investigation.value']", " Behavioural work Antitrust investigation ");
			Thread.sleep(3000);
			return this;}
		
		//Behavioural work > Antitrust investigation > Expected completion date (optional) 
		   public CreateRFPSOWPage CompetitionBehaviAntitrustDate() throws InterruptedException {
				Thread.sleep(2000);
				click("(//input[@name='scope_of_work[0].competition.behavioural_work.antitrust_investigation.dt'])","completion Date");
				click("//button[contains(@class,'MuiPickersDay-dayWithMargin MuiPickersDay-today')]","date");
				return this;}
		  	
		  	
		 //Comment box > Behavioural work > Antitrust investigation
		  	public CreateRFPSOWPage competitionBehaviAntitrustCmts(String CompetitionBehaviAntitrustComments) throws InterruptedException {
		  		Thread.sleep(3000);
		  		type("//*[@name='scope_of_work[0].competition.behavioural_work.antitrust_investigation.comment']", CompetitionBehaviAntitrustComments , "Behavioural Antitrust investigation Comments");	
		  		return this;}
		
	
		
		//check Box >  State Aid investigation
		public CreateRFPSOWPage checkCompetitionBehaviouralStateAid() throws InterruptedException {
			check("//*[@name='scope_of_work[0].competition.behavioural_work.state_aid_investigation.value']", "BehaviouralAntitrust State Aid ");
			Thread.sleep(3000);
			return this;}
		
		
		
		//Behavioural work > State Aid investigation > Expected completion date (optional) 
		   public CreateRFPSOWPage CompetitionBehaviStateAidDate() throws InterruptedException {
				Thread.sleep(2000);
				click("(//input[@name='scope_of_work[0].competition.behavioural_work.state_aid_investigation.dt'])","completion Date");
				click("//button[contains(@class,'MuiPickersDay-dayWithMargin MuiPickersDay-today')]","date");
				return this;}
		  	
		  	
		 //Comment box > Behavioural work > State Aid investigation
		  	public CreateRFPSOWPage competitionBehaviStateAidCmts(String CompetitionBehaviStateAidComments) throws InterruptedException {
		  		Thread.sleep(3000);
		  		type("//*[@name='scope_of_work[0].competition.behavioural_work.state_aid_investigation.comment']", CompetitionBehaviStateAidComments , "Behavioural State Aid Comments");	
		  		return this;}
		
		
		
		// check Box > Advice
		public CreateRFPSOWPage checkCompetitionBehaviouralAdvice() throws InterruptedException {
			check("//*[@name='scope_of_work[0].competition.behavioural_work.advice.value']", "BehaviouralAntitrust Advice");
			Thread.sleep(3000);
			return this;}
		
		//Behavioural work > Advice > Expected completion date (optional) 
		   public CreateRFPSOWPage CompetitionBehaviAdviceDate() throws InterruptedException {
				Thread.sleep(2000);
				click("(//input[@name='scope_of_work[0].competition.behavioural_work.advice.dt'])","completion Date");
				click("//button[contains(@class,'MuiPickersDay-dayWithMargin MuiPickersDay-today')]","date");
				return this;}
		  	
		  	
		 //Comment box > Behavioural work > Advice
		  	public CreateRFPSOWPage competitionBehaviAdviceCmts(String CompetitionBehaviAdviceComments) throws InterruptedException {
		  		Thread.sleep(3000);
		  		type("//*[@name='scope_of_work[0].competition.behavioural_work.advice.comment']", CompetitionBehaviAdviceComments , "Behavioural Advice Comments");	
		  		return this;}
		
		
		// check Box > Other
		public CreateRFPSOWPage checkCompetitionBehaviouralOther() throws InterruptedException {
			check("//*[@name='scope_of_work[0].competition.other.value']", "BehaviouralAntitrust Other");
			Thread.sleep(3000);
			return this;}
		
		
		//Behavioural work > Other > Expected completion date (optional) 
		   public CreateRFPSOWPage CompetitionBehaviOtherDate() throws InterruptedException {
				Thread.sleep(2000);
				click("(//input[@name='scope_of_work[0].competition.other.dt'])","completion Date");
				click("//button[contains(@class,'MuiPickersDay-dayWithMargin MuiPickersDay-today')]","date");
				return this;}
		  	
		  	
		 //Comment box > Behavioural work > Other
		  	public CreateRFPSOWPage competitionBehaviOtherCmts(String CompetitionBehaviOtherComments) throws InterruptedException {
		  		Thread.sleep(3000);
		  		type("//*[@name='scope_of_work[0].competition.other.comment']", CompetitionBehaviOtherComments , "Behavioural Other Comments");	
		  		return this;}
		
		
	
	//3.--------------------------------------------------->  Corporate M&A <------------------------------------------------------------------------------------------
	
		
		//Drop Down Scope -> Corporate M&A
				public CreateRFPSOWPage selectScopeCorporate() throws InterruptedException {
					click("//div[@id='mui-component-select-scope_of_work[0].scope_of_work_id']", " Corporate M&A " );
					click("//li[text()='Corporate M&A']" , " Corporate M&A " );
					return this;} 
				
					
		// check Box > Term sheet negotiation
				public CreateRFPSOWPage checkCorporateTermsheet() throws InterruptedException {
					check("//*[@name='scope_of_work[0].corporate_ma.term_sheet_negotiation.value']", "Corporate Term sheet negotiation");
					return this;}	
				
	
				//Term sheet negotiation > Expected completion date (optional) 
				   public CreateRFPSOWPage CorporateMATermDate() throws InterruptedException {
						click("(//input[@name='scope_of_work[0].corporate_ma.term_sheet_negotiation.dt'])","completion Date");
						click("//button[contains(@class,'MuiPickersDay-dayWithMargin MuiPickersDay-today')]","date");
						return this;}
				
				   
				 //Comment box > Term sheet negotiation
				  	public CreateRFPSOWPage corporateMATermCmts(String CorporateMATermComments) throws InterruptedException {
				  		type("//*[@name='scope_of_work[0].corporate_ma.term_sheet_negotiation.comment']", CorporateMATermComments , "Corporate M&A Term Comments");	
				  		return this;}
				
		
		// check Box > Due diligence
				public CreateRFPSOWPage checkCorporatediligence() throws InterruptedException {
					check("//*[@name='scope_of_work[0].corporate_ma.due_diligence.value']", "Corporate Due diligence");
					return this;}	
				
				//Due diligence > Expected completion date (optional) 
				   public CreateRFPSOWPage CorporateMADueDate() throws InterruptedException {
						click("(//input[@name='scope_of_work[0].corporate_ma.due_diligence.dt'])","completion Date");
						click("//button[contains(@class,'MuiPickersDay-dayWithMargin MuiPickersDay-today')]","date");
						return this;}
				
				   
				 //Comment box > Due diligence 
				  	public CreateRFPSOWPage CorporateMADueCmts(String CorporateMADueComments) throws InterruptedException {
				  		type("//*[@name='scope_of_work[0].corporate_ma.due_diligence.comment']", CorporateMADueComments , "Corporate M&A Due diligence Comments");	
				  		return this;}
				
				   
				// check Box > Red flag only
				   public CreateRFPSOWPage checkCorporateRedFlag() throws InterruptedException {
						check("//*[@name='scope_of_work[0].corporate_ma.due_diligence.red_flag_only']", "Red flag only");
						Thread.sleep(3000);
						return this;}
				   
				   
				   //Vendor ldd available
				   public CreateRFPSOWPage checkCorporateIddAvailable() throws InterruptedException {
						check("//*[@name='scope_of_work[0].corporate_ma.due_diligence.vendor_ldd_available']", "ldd available");
						Thread.sleep(3000);
						return this;}
				   
				   
				   
				   //Online data room
				   public CreateRFPSOWPage checkCorporateOnlineDataRoom() throws InterruptedException {
						check("//*[@name='scope_of_work[0].corporate_ma.due_diligence.online_data_room']", "Online data room");
						Thread.sleep(3000);
						return this;}
				   
				   
				   //Key area of focus
				   public CreateRFPSOWPage selectKeyArea() throws InterruptedException {
						type("(//div[text()='Key area of focus']/following::input)[1]","Litigation","Key area of focus");
						pageDown();
					    enter();
						return this;}
				   
				   
				   
				   //check Box > Regulatory
					public CreateRFPSOWPage checkCorporateRegulatory() throws InterruptedException {
						check("//*[@name='scope_of_work[0].corporate_ma.regulatory.value']", "Corporate Regulatory");
						return this;} 
				  
					
					//Regulatory > Expected completion date (optional) 
					   public CreateRFPSOWPage CorporateMARegulatoryDate() throws InterruptedException {
							click("(//input[@name='scope_of_work[0].corporate_ma.regulatory.dt'])","completion Date");
							click("//button[contains(@class,'MuiPickersDay-dayWithMargin MuiPickersDay-today')]","date");
							return this;}	
					
					
				 //Comment box > Regulatory 
				  	public CreateRFPSOWPage CorporateMARegulatoryCmts(String CorporateMARegulatoryComments) throws InterruptedException {
				  		Thread.sleep(3000);
				  		type("//*[@name='scope_of_work[0].corporate_ma.regulatory.comment']", CorporateMARegulatoryComments , "Corporate M&A Regulatory Comments");	
				  		return this;}
				
				
		// check Box > Transaction documentation
			public CreateRFPSOWPage checkCorporateTransaction() throws InterruptedException {
				check("//*[@name='scope_of_work[0].corporate_ma.transaction_documentation.value']", "Corporate Transaction documentation");
				Thread.sleep(3000);
				return this;}	
			
			
			//Transaction documentation > Expected completion date (optional) 
			   public CreateRFPSOWPage CorporateMATransactionDate() throws InterruptedException {
					click("(//input[@name='scope_of_work[0].corporate_ma.transaction_documentation.dt'])","completion Date");
					click("//button[contains(@class,'MuiPickersDay-dayWithMargin MuiPickersDay-today')]","date");
					return this;}
			
							
		//Comment box > Transaction documentation
			  public CreateRFPSOWPage CorporateMATransactionCmts(String CorporateMATransactionComments) throws InterruptedException {
			  	Thread.sleep(3000);
			  	type("//*[@name='scope_of_work[0].corporate_ma.transaction_documentation.comment']", CorporateMATransactionComments , "Transaction documentation");	
			  	return this;}	
				
		
		//Draft main documents (hold the pen)
			 public CreateRFPSOWPage checkCorporateDraftMain() throws InterruptedException {
				 check("//*[@name='scope_of_work[0].corporate_ma.transaction_documentation.draft_document']", "Corporate Draft main documents (hold the pen)");
					return this;}  
			  
			 
		//Review main documents
			 public CreateRFPSOWPage checkCorporateReviewMain() throws InterruptedException {
					check("//*[@name='scope_of_work[0].corporate_ma.transaction_documentation.review_document']", "Review main documents");
					return this;}
			  
			  
		// check Box > W&I policy
			public CreateRFPSOWPage checkCorporateWI() throws InterruptedException {
				check("//*[@name='scope_of_work[0].corporate_ma.wi_policy.value']", "Corporate W&I policy");
				Thread.sleep(3000);
				return this;}
			
			
			//W&I policy > Expected completion date (optional) 
			   public CreateRFPSOWPage CorporateWIDate() throws InterruptedException {
					click("(//input[@name='scope_of_work[0].corporate_ma.wi_policy.dt'])","completion Date");
					click("//button[contains(@class,'MuiPickersDay-dayWithMargin MuiPickersDay-today')]","date");
					return this;}
			
			   
			 //Comment box > W&I policy
			  	public CreateRFPSOWPage CorporateWICmts(String CorporateWIComments) throws InterruptedException {
			  		type("//*[@name='scope_of_work[0].corporate_ma.wi_policy.comment']", CorporateWIComments , "Corporate W&I policy Comments");	
			  		return this;}
			
			
		
		// check Box > Financing
				public CreateRFPSOWPage checkCorporateFinancing() throws InterruptedException {
					check("//*[@name='scope_of_work[0].corporate_ma.financing.value']", "Corporate Financing");
					Thread.sleep(3000);
					return this;}
				
				//Financing > Expected completion date (optional) 
				   public CreateRFPSOWPage CorporateFinancingDate() throws InterruptedException {
						click("(//input[@name='scope_of_work[0].corporate_ma.financing.dt'])","completion Date");
						click("//button[contains(@class,'MuiPickersDay-dayWithMargin MuiPickersDay-today')]","date");
						return this;}
				
				   
				 //Comment box > Financing
				  	public CreateRFPSOWPage CorporateFinancingCmts(String CorporateFinancingComments) throws InterruptedException {
				  		type("//*[@name='scope_of_work[0].corporate_ma.financing.comment']", CorporateFinancingComments , "Corporate Financing Comments");	
				  		return this;}
				
				
		// check Box > Signing process
				public CreateRFPSOWPage checkCorporateSigning() throws InterruptedException {
					check("//*[@name='scope_of_work[0].corporate_ma.signing_process.value']", "Corporate Signing process");
					Thread.sleep(3000);
					return this;}
				
				
				//Signing process > Expected completion date (optional) 
				   public CreateRFPSOWPage CorporateSigningDate() throws InterruptedException {
						click("(//input[@name='scope_of_work[0].corporate_ma.signing_process.dt'])","completion Date");
						click("//button[contains(@class,'MuiPickersDay-dayWithMargin MuiPickersDay-today')]","date");
						return this;}
				
				   
				 //Comment box > Signing process
				  	public CreateRFPSOWPage CorporateSigningCmts(String CorporateSigningComments) throws InterruptedException {
				  		type("//*[@name='scope_of_work[0].corporate_ma.signing_process.comment']", CorporateSigningComments , "Corporate Signing process Comments");	
				  		return this;}
				
				
				
				
		// check Box > Closing process
				public CreateRFPSOWPage checkCorporateClosing() throws InterruptedException {
					check("//*[@name='scope_of_work[0].corporate_ma.closing_process.value']", "Corporate Closing process");
					Thread.sleep(3000);
					return this;}
				
				
				//Closing process > Expected completion date (optional) 
				   public CreateRFPSOWPage CorporateClosingDate() throws InterruptedException {
						click("(//input[@name='scope_of_work[0].corporate_ma.closing_process.dt'])","completion Date");
						click("//button[contains(@class,'MuiPickersDay-dayWithMargin MuiPickersDay-today')]","date");
						return this;}
				
				   
				 //Comment box > Closing process
				  	public CreateRFPSOWPage CorporateClosingCmts(String CorporateClosingComments) throws InterruptedException {
				  		type("//*[@name='scope_of_work[0].corporate_ma.closing_process.comment']", CorporateClosingComments , "Corporate Closing Comments");	
				  		return this;}
				
				
				
				
		// check Box > Other
				public CreateRFPSOWPage checkCorporateOther() throws InterruptedException {
					check("//*[@name='scope_of_work[0].corporate_ma.other.value']", "Corporate Other");
					Thread.sleep(3000);
					return this;}
				
				
				//Other > Expected completion date (optional) 
				   public CreateRFPSOWPage CorporateOtherDate() throws InterruptedException {
						click("(//input[@name='scope_of_work[0].corporate_ma.other.dt'])","completion Date");
						click("//button[contains(@class,'MuiPickersDay-dayWithMargin MuiPickersDay-today')]","date");
						return this;}
				
				   
				 //Comment box > Other
				  	public CreateRFPSOWPage CorporateOtherCmts(String CorporateOtherComments) throws InterruptedException {
				  		type("//*[@name='scope_of_work[0].corporate_ma.other.comment']", CorporateOtherComments , "Corporate Otherg Comments");	
				  		return this;}	
				
		
	
	//4.---------------------------------------------------->  Data protection & privacy <------------------------------------------------------------------------

				
		//Drop Down Scope ->  Data protection & privacy
				public CreateRFPSOWPage selectScopeDataProtection() throws InterruptedException {
					Thread.sleep(2000);
					click("//div[@id='mui-component-select-scope_of_work[0].scope_of_work_id']", " Data protection & privacy " );
					click("//li[text()='Data protection & privacy']" , " Data protection & privacy " );
					return this;} 
				
			
		// check Box > Data protection compliance programme
				public CreateRFPSOWPage checkDataDataProtection() throws InterruptedException {
					check("//*[@name='scope_of_work[0].data_protection_privacy.compliance_programme.value']", "Data protection compliance programme");
					Thread.sleep(3000);
					return this;}		
				
		//Data protection compliance programme > Expected completion date (optional) 
				   public CreateRFPSOWPage DataDataProtectionDate() throws InterruptedException {
						click("(//input[@name='scope_of_work[0].data_protection_privacy.compliance_programme.dt'])","completion Date");
						click("//button[contains(@class,'MuiPickersDay-dayWithMargin MuiPickersDay-today')]","date");
						return this;}
				
				   
		//Comment box > Data protection compliance programme
				  	public CreateRFPSOWPage DataDataProtectionCmts(String DataDataProtectionComments) throws InterruptedException {
				  		type("//*[@name='scope_of_work[0].data_protection_privacy.compliance_programme.comment']", DataDataProtectionComments , "Data Data protection compliance programme comments");	
				  		return this;}		
				
				
		// check Box > Issues for new processing system / arrangement	
				public CreateRFPSOWPage checkDataIssues() throws InterruptedException {
					check("//*[@name='scope_of_work[0].data_protection_privacy.processing_system.value']", "Data Issues for new processing system");
					Thread.sleep(3000);
					return this;}
				
				
		//Data protection Issues for new processing system / arrangement > Expected completion date (optional) 
				   public CreateRFPSOWPage DataIssuesDate() throws InterruptedException {
						click("(//input[@name='scope_of_work[0].data_protection_privacy.processing_system.dt'])","completion Date");
						click("//button[contains(@class,'MuiPickersDay-dayWithMargin MuiPickersDay-today')]","date");
						return this;}
				
				   
		//Comment box > Issues for new processing system / arrangement
				  	public CreateRFPSOWPage DataIssuesCmts(String DataIssuesComments) throws InterruptedException {
				  		type("//*[@name='scope_of_work[0].data_protection_privacy.processing_system.comment']", DataIssuesComments , "Issues for new processing system / arrangement comments");	
				  		return this;}		
					
				
		// check Box >	Review data protection policies
				public CreateRFPSOWPage checkDataReview() throws InterruptedException {
					check("//*[@name='scope_of_work[0].data_protection_privacy.review_policy.value']", "Review data protection policies");
					Thread.sleep(3000);
					return this;}	
				
		
		// Review data protection policies > Expected completion date (optional) 
				   public CreateRFPSOWPage DataReviewDate() throws InterruptedException {
						click("(//input[@name='scope_of_work[0].data_protection_privacy.review_policy.dt'])","completion Date");
						click("//button[contains(@class,'MuiPickersDay-dayWithMargin MuiPickersDay-today')]","date");
						return this;}
				
				   
				   //Comment box > Review data protection policies
				  	public CreateRFPSOWPage DataReviewCmts(String DataReviewCmts) throws InterruptedException {
				  		type("//*[@name='scope_of_work[0].data_protection_privacy.review_policy.comment']", DataReviewCmts , "Review data protection policies comments");	
				  		return this;}		
				
				
				  	// check Box > Localise data protection programme to new jurisdiction
				  	public CreateRFPSOWPage checkDataLocalise() throws InterruptedException {
					check("//*[@name='scope_of_work[0].data_protection_privacy.localise_programme.value']", "Localise data protection programme to new jurisdiction");
					Thread.sleep(3000);
					return this;}	
				
				
				  	// Localise data protection programme to new jurisdiction > Expected completion date (optional) 
				  	public CreateRFPSOWPage DataLocaliseDate() throws InterruptedException {
						click("(//input[@name='scope_of_work[0].data_protection_privacy.localise_programme.dt'])","completion Date");
						click("//button[contains(@class,'MuiPickersDay-dayWithMargin MuiPickersDay-today')]","date");
						return this;}
				
				   
				  	//Comment box > Localise data protection programme to new jurisdiction
				  	public CreateRFPSOWPage DataLocaliseCmts(String DataLocaliseCmts) throws InterruptedException {
				  		type("//*[@name='scope_of_work[0].data_protection_privacy.localise_programme.comment']", DataLocaliseCmts , "Localise data protection comments");	
				  		return this;}
				
				
				  	// check Box > Advice on change in law
				  	public CreateRFPSOWPage checkDataChangeInLaw() throws InterruptedException {
					check("//*[@name='scope_of_work[0].data_protection_privacy.change_advice.value']", "Advice on change in law");
					Thread.sleep(3000);
					return this;}
				
				
				// Advice on change in law > Expected completion date (optional) 
			  	public CreateRFPSOWPage DataChangeInLawDate() throws InterruptedException {
					click("(//input[@name='scope_of_work[0].data_protection_privacy.change_advice.dt'])","completion Date");
					click("//button[contains(@class,'MuiPickersDay-dayWithMargin MuiPickersDay-today')]","date");
					return this;}
			
			   
			  	//Comment box > Advice on change in law
			  	public CreateRFPSOWPage DataChangeInLawCmts(String DataChangeInLawCmts) throws InterruptedException {
			  		type("//*[@name='scope_of_work[0].data_protection_privacy.change_advice.comment']", DataChangeInLawCmts , "Advice on change in law comments");	
			  		return this;}	
				
				
			  	// check Box > Data protection re-papering exercise
				public CreateRFPSOWPage checkDataRepapering() throws InterruptedException {
					check("//*[@name='scope_of_work[0].data_protection_privacy.re_papering.value']", "Data protection re-papering exercise");
					Thread.sleep(3000);
					return this;}
				
			
				// Data protection re-papering exercise > Expected completion date (optional) 
			  	public CreateRFPSOWPage DataRepaperingDate() throws InterruptedException {
					click("(//input[@name='scope_of_work[0].data_protection_privacy.re_papering.dt'])","completion Date");
					click("//button[contains(@class,'MuiPickersDay-dayWithMargin MuiPickersDay-today')]","date");
					return this;}
			
			   
			  	//Comment box > Data protection re-papering exercise
			  	public CreateRFPSOWPage DataRepaperingCmts(String DataRepaperingCmts) throws InterruptedException {
			  		type("//*[@name='scope_of_work[0].data_protection_privacy.re_papering.comment']", DataRepaperingCmts , "Data protection re-papering exercise comments");	
			  		return this;}
				
				
	   // check Box > Direct marketing advice
				public CreateRFPSOWPage checkDataDirectMarketing() throws InterruptedException {
					check("//*[@name='scope_of_work[0].data_protection_privacy.marketing_advice.value']", "Direct marketing advice");
					Thread.sleep(3000);
					return this;}
				
				
				// Direct marketing advice > Expected completion date (optional) 
			  	public CreateRFPSOWPage DataDirectMarketingDate() throws InterruptedException {
					click("(//input[@name='scope_of_work[0].data_protection_privacy.marketing_advice.dt'])","completion Date");
					click("//button[contains(@class,'MuiPickersDay-dayWithMargin MuiPickersDay-today')]","date");
					return this;}
			
			   
			  	//Comment box > Direct marketing advice
			  	public CreateRFPSOWPage DataDirectMarketingCmts(String DataDirectMarketingCmts) throws InterruptedException {
			  		type("//*[@name='scope_of_work[0].data_protection_privacy.marketing_advice.comment']", DataDirectMarketingCmts , "Direct marketing advice comments");	
			  		return this;}		
				
				 
	   // check Box > Record retention / destruction programme
				public CreateRFPSOWPage checkDataRecordRetention() throws InterruptedException {
					check("//*[@name='scope_of_work[0].data_protection_privacy.record_retention.value']", "Record retention");
					Thread.sleep(3000);
					return this;}
				
				// Record retention / destruction programme > Expected completion date (optional) 
			  	public CreateRFPSOWPage DataRecordRetentionDate() throws InterruptedException {
					click("(//input[@name='scope_of_work[0].data_protection_privacy.record_retention.dt'])","completion Date");
					click("//button[contains(@class,'MuiPickersDay-dayWithMargin MuiPickersDay-today')]","date");
					return this;}
			
			   
			  	//Comment box > Record retention / destruction programme
			  	public CreateRFPSOWPage DataRecordRetentionCmts(String DataRecordRetentionCmts) throws InterruptedException {
			  		type("//*[@name='scope_of_work[0].data_protection_privacy.record_retention.comment']", DataRecordRetentionCmts , "Record retention / destruction programme comments");	
			  		return this;}
				
					
			  	// check Box > Data security breach
				public CreateRFPSOWPage checkDatasecuritybreach() throws InterruptedException {
					check("//*[@name='scope_of_work[0].data_protection_privacy.data_security_breach.value']", "Data security breach");
					Thread.sleep(3000);
					return this;}
				
				
				// Data security breach > Expected completion date (optional) 
			  	public CreateRFPSOWPage DatasecuritybreachDate() throws InterruptedException {
					click("(//input[@name='scope_of_work[0].data_protection_privacy.data_security_breach.dt'])","completion Date");
					click("//button[contains(@class,'MuiPickersDay-dayWithMargin MuiPickersDay-today')]","date");
					return this;}
			
			   
			  	//Comment box > Data security breach
			  	public CreateRFPSOWPage DatasecuritybreachCmts(String DatasecuritybreachCmts) throws InterruptedException {
			  		type("//*[@name='scope_of_work[0].data_protection_privacy.data_security_breach.comment']", DatasecuritybreachCmts , "Data security breach comments");	
			  		return this;}
			
				
			  	// check Box > Exercise of data subject rights
				public CreateRFPSOWPage checkDataSubjectRights() throws InterruptedException {
					check("//*[@name='scope_of_work[0].data_protection_privacy.exercise_subject_rights.value']", "Exercise of data subject rights");
					Thread.sleep(3000);
					return this;}
				
				
				// Data security breach > Expected completion date (optional) 
			  	public CreateRFPSOWPage DataSubjectRightsDate() throws InterruptedException {
					click("(//input[@name='scope_of_work[0].data_protection_privacy.exercise_subject_rights.dt'])","completion Date");
					click("//button[contains(@class,'MuiPickersDay-dayWithMargin MuiPickersDay-today')]","date");
					return this;}
			
			   
			  	//Comment box > Exercise of data subject rights
			  	public CreateRFPSOWPage DataSubjectRightsCmts(String DataSubjectRightsCmts) throws InterruptedException {
			  		type("//*[@name='scope_of_work[0].data_protection_privacy.exercise_subject_rights.comment']", DataSubjectRightsCmts , "Exercise of data subject rights comments");	
			  		return this;}
				
				
	  // check Box > Data protection regulatory investigation / dispute
				public CreateRFPSOWPage checkDataRegulatoryInvestigation() throws InterruptedException {
					check("//*[@name='scope_of_work[0].data_protection_privacy.regulatory_investigation.value']", "regulatory investigation / dispute");
					Thread.sleep(3000);
					return this;}
				
			
				// Data protection regulatory investigation / dispute > Expected completion date (optional)  
			  	public CreateRFPSOWPage DataRegulatoryInvestigationDate() throws InterruptedException {
					click("(//input[@name='scope_of_work[0].data_protection_privacy.regulatory_investigation.dt'])","completion Date");
					click("//button[contains(@class,'MuiPickersDay-dayWithMargin MuiPickersDay-today')]","date");
					return this;}
			
			   
			  	//Comment box > Data protection regulatory investigation / dispute
			  	public CreateRFPSOWPage DataRegulatoryInvestigationCmts(String DataRegulatoryInvestigationCmts) throws InterruptedException {
			  		type("//*[@name='scope_of_work[0].data_protection_privacy.regulatory_investigation.comment']", DataRegulatoryInvestigationCmts , "Data protection regulatory investigation / dispute comments");	
			  		return this;}		
				
				
				
	   // check Box > Retainer for ad hoc data protection queries
				public CreateRFPSOWPage checkDataRetainer() throws InterruptedException {
					check("//*[@name='scope_of_work[0].data_protection_privacy.protection_retainer.value']", "Retainer for ad hoc");
					Thread.sleep(3000);
					return this;}
				
				
				// Retainer for ad hoc data protection queries > Expected completion date (optional) 
			  	public CreateRFPSOWPage DataRetainerDate() throws InterruptedException {
					click("(//input[@name='scope_of_work[0].data_protection_privacy.protection_retainer.dt'])","completion Date");
					click("//button[contains(@class,'MuiPickersDay-dayWithMargin MuiPickersDay-today')]","date");
					return this;}
			
			   
			  	//Comment box > Retainer for ad hoc data protection queries
			  	public CreateRFPSOWPage DataRetainerCmts(String DataRetainerCmts) throws InterruptedException {
			  		type("//*[@name='scope_of_work[0].data_protection_privacy.protection_retainer.comment']", DataRetainerCmts , "Retainer for ad hoc comments");	
			  		return this;}
				
				
				
	  // check Box > Data protection training
				public CreateRFPSOWPage checkDataTraining() throws InterruptedException {
					check("//*[@name='scope_of_work[0].data_protection_privacy.protection_training.value']", "Data protection training");
					Thread.sleep(3000);
					return this;}
				
				// Data protection training > Expected completion date (optional) 
			  	public CreateRFPSOWPage DataTrainingDate() throws InterruptedException {
					click("(//input[@name='scope_of_work[0].data_protection_privacy.protection_training.dt'])","completion Date");
					click("//button[contains(@class,'MuiPickersDay-dayWithMargin MuiPickersDay-today')]","date");
					return this;}
			
			   
			  	//Comment box > Data protection training
			  	public CreateRFPSOWPage DataTrainingCmts(String DataTrainingCmts) throws InterruptedException {
			  		type("//*[@name='scope_of_work[0].data_protection_privacy.protection_training.comment']", DataTrainingCmts , "Data protection training comments");	
			  		return this;}
				
				
				
				
			  	// check Box > Other
				public CreateRFPSOWPage checkDataOther() throws InterruptedException {
					check("//*[@name='scope_of_work[0].data_protection_privacy.other.value']", "Data Protection Other");
					Thread.sleep(3000);
					return this;}
				
				
				// Other > Expected completion date (optional) 
			  	public CreateRFPSOWPage DataOtherDate() throws InterruptedException {
					click("(//input[@name='scope_of_work[0].data_protection_privacy.other.dt'])","completion Date");
					click("//button[contains(@class,'MuiPickersDay-dayWithMargin MuiPickersDay-today')]","date");
					return this;}
			
			   
			  	//Comment box > Other 
			  	public CreateRFPSOWPage DataOtherCmts(String DataOtherCmts) throws InterruptedException {
			  		type("//*[@name='scope_of_work[0].data_protection_privacy.other.comment']", DataOtherCmts , "Data Protection Other Comments");	
			  		return this;}
				
				
	
	//5.----------------------------------------------------->  Employment <-------------------------------------------------------------------------------------
	
				
				//Drop Down Scope ->  Employment
				public CreateRFPSOWPage selectScopeEmployment() throws InterruptedException {
					click("//div[@id='mui-component-select-scope_of_work[0].scope_of_work_id']", " Employment " );
					click("//li[text()='Employment']" , " Employment " );
					return this;} 
				
				
				//Check Box > Retainer for general HR legal advice and support
				public CreateRFPSOWPage checkEmploymentRetainer() throws InterruptedException {
					check("//*[@name='scope_of_work[0].employment.retainer_hr.value']", "HR legal advice and support");
					Thread.sleep(3000);
					return this;}
				
				
				// Retainer for general HR legal advice and support > Expected completion date (optional) 
			  	public CreateRFPSOWPage EmploymentRetainerDate() throws InterruptedException {
					click("(//input[@name='scope_of_work[0].employment.retainer_hr.dt'])","completion Date");
					click("//button[contains(@class,'MuiPickersDay-dayWithMargin MuiPickersDay-today')]","date");
					return this;}
			
			   
			  	//Comment box > Retainer for general HR legal advice and support
			  	public CreateRFPSOWPage EmploymentRetainerCmts(String DataOtherCmts) throws InterruptedException {
			  		type("//*[@name='scope_of_work[0].employment.retainer_hr.comment']", DataOtherCmts , "HR legal advice and support Comments");	
			  		return this;}
				
				
			  //Check Box > Review of HR contracts, policies and handbooks
				public CreateRFPSOWPage checkEmploymentHRContracts() throws InterruptedException {
					check("//*[@name='scope_of_work[0].employment.review_hr.value']", "HR contracts, policies and handbooks");
					Thread.sleep(3000);
					return this;}
			  	
				
				// Review of HR contracts, policies and handbooks > Expected completion date (optional) 
			  	public CreateRFPSOWPage EmploymentHRContractsDate() throws InterruptedException {
					click("(//input[@name='scope_of_work[0].employment.review_hr.dt'])","completion Date");
					click("//button[contains(@class,'MuiPickersDay-dayWithMargin MuiPickersDay-today')]","date");
					return this;}
			
			   
			  	//Comment box > Review of HR contracts, policies and handbooks
			  	public CreateRFPSOWPage EmploymentHRContractsCmts(String EmploymentHRContractsCmts) throws InterruptedException {
			  		type("//*[@name='scope_of_work[0].employment.review_hr.comment']", EmploymentHRContractsCmts , "HR legal advice and support Comments");	
			  		return this;}
				
				
				//Check Box > Drafting/reviewing employment contracts, offer letters for incoming hire
				public CreateRFPSOWPage checkEmploymentDrafting() throws InterruptedException {
					check("//*[@name='scope_of_work[0].employment.review_contracts.value']", "Drafting/reviewing employment contracts");
					Thread.sleep(3000);
					return this;}
				
				
				// Drafting/reviewing employment contracts, offer letters for incoming hire > Expected completion date (optional) 
			  	public CreateRFPSOWPage EmploymentDraftingDate() throws InterruptedException {
					click("(//input[@name='scope_of_work[0].employment.review_contracts.dt'])","completion Date");
					click("//button[contains(@class,'MuiPickersDay-dayWithMargin MuiPickersDay-today')]","date");
					return this;}
			
			   
			  	//Comment box > Drafting/reviewing employment contracts, offer letters for incoming hire
			  	public CreateRFPSOWPage EmploymentDraftingCmts(String EmploymentDraftingCmts) throws InterruptedException {
			  		type("//*[@name='scope_of_work[0].employment.review_contracts.comment']", EmploymentDraftingCmts , "Drafting/reviewing employment contracts");	
			  		return this;}
				
								
				// check Box > Advising on restrictions relevant to potential new hires
			  	public CreateRFPSOWPage checkEmploymentpotentialNewHires() throws InterruptedException {
					check("//*[@name='scope_of_work[0].employment.hire_advice.value']", "potential new hires");
					return this;}
				
				
				// Advising on restrictions relevant to potential new hires > Expected completion date (optional) 
			  	public CreateRFPSOWPage EmploymentpotentialNewHiresDate() throws InterruptedException {
					click("(//input[@name='scope_of_work[0].employment.hire_advice.dt'])","completion Date");
					click("//button[contains(@class,'MuiPickersDay-dayWithMargin MuiPickersDay-today')]","date");
					return this;}
			
			   
			  	//Comment box > Advising on restrictions relevant to potential new hires
			  	public CreateRFPSOWPage EmploymentpotentialNewHiresCmts(String EmploymentpotentialNewHiresCmts) throws InterruptedException {
			  		type("//*[@name='scope_of_work[0].employment.hire_advice.comment']", EmploymentpotentialNewHiresCmts , "potential new hires");	
			  		return this;}
				
			  	
				// check Box > Redundancy(ies)
			  	public CreateRFPSOWPage checkEmploymentRedundancy() throws InterruptedException {
					check("//*[@name='scope_of_work[0].employment.redundancy.value']", "Redundancy(ies)");
					return this;}
				
				
				// Redundancy(ies) > Expected completion date (optional) 
			  	public CreateRFPSOWPage EmploymentRedundancyDate() throws InterruptedException {
					click("(//input[@name='scope_of_work[0].employment.redundancy.dt'])","completion Date");
					click("//button[contains(@class,'MuiPickersDay-dayWithMargin MuiPickersDay-today')]","date");
					return this;}
			
			   
			  	//Comment box > Redundancy(ies)
			  	public CreateRFPSOWPage EmploymentRedundancyCmts(String EmploymentRedundancyCmts) throws InterruptedException {
			  		type("//*[@name='scope_of_work[0].employment.redundancy.comment']", EmploymentRedundancyCmts , "Redundancy(ies)");	
			  		return this;}
			  	
			  	
			  //check Box > Dismissal(s)/ settlement agreement
			  	public CreateRFPSOWPage checkEmploymentDismissal() throws InterruptedException {
					check("//*[@name='scope_of_work[0].employment.dismissal.value']", "Dismissal(s)/ settlement agreement");
					return this;}
				
				
				// Dismissal(s)/ settlement agreement > Expected completion date (optional) 
			  	public CreateRFPSOWPage EmploymentDismissalDate() throws InterruptedException {
					click("(//input[@name='scope_of_work[0].employment.dismissal.dt'])","completion Date");
					click("//button[contains(@class,'MuiPickersDay-dayWithMargin MuiPickersDay-today')]","date");
					return this;}
			
			   
			  	//Comment box > Dismissal(s)/ settlement agreement
			  	public CreateRFPSOWPage EmploymentDismissalCmts(String EmploymentDismissalCmts) throws InterruptedException {
			  		type("//*[@name='scope_of_work[0].employment.dismissal.comment']", EmploymentDismissalCmts , "Dismissal(s)/ settlement agreement");	
			  		return this;}
			  	
			  	
			 // check Box > Employment benefits
			  	public CreateRFPSOWPage checkEmploymentBenefits() throws InterruptedException {
					check("//*[@name='scope_of_work[0].employment.employment_benefits.value']", "Employment benefits");
					return this;}
				
				
				// Employment benefits > Expected completion date (optional) 
			  	public CreateRFPSOWPage EmploymentBenefitsDate() throws InterruptedException {
					click("(//input[@name='scope_of_work[0].employment.employment_benefits.dt'])","completion Date");
					click("//button[contains(@class,'MuiPickersDay-dayWithMargin MuiPickersDay-today')]","date");
					return this;}
			
			   
			  	//Comment box > Employment benefits
			  	public CreateRFPSOWPage EmploymentBenefitsCmts(String EmploymentBenefitsCmts) throws InterruptedException {
			  		type("//*[@name='scope_of_work[0].employment.employment_benefits.comment']", EmploymentBenefitsCmts , "Employment benefits Comments");	
			  		return this;}
			  	
			  	
			 // check Box > Consultants, contractors or agency worker arrangements
			  	public CreateRFPSOWPage checkEmploymentConsultants() throws InterruptedException {
					check("//*[@name='scope_of_work[0].employment.consultants_arrangements.value']", "contractors or agency worker arrangements");
					return this;}
				
				
				// Consultants, contractors or agency worker arrangements > Expected completion date (optional) 
			  	public CreateRFPSOWPage EmploymentConsultantsDate() throws InterruptedException {
					click("(//input[@name='scope_of_work[0].employment.consultants_arrangements.dt'])","completion Date");
					click("//button[contains(@class,'MuiPickersDay-dayWithMargin MuiPickersDay-today')]","date");
					return this;}
			
			   
			  	//Comment box > Consultants, contractors or agency worker arrangements
			  	public CreateRFPSOWPage EmploymentConsultantsCmts(String EmploymentConsultantsCmts) throws InterruptedException {
			  		type("//*[@name='scope_of_work[0].employment.consultants_arrangements.comment']", EmploymentConsultantsCmts , "contractors or agency worker arrangements Comments");	
			  		return this;}	
			  	
			  	
			  	 // check Box > Supply of staff arrangements
			  	public CreateRFPSOWPage checkEmploymentStaffArrangements() throws InterruptedException {
					check("//*[@name='scope_of_work[0].employment.staff_supply.value']", "Supply of staff arrangements");
					return this;}
				
				
				// Supply of staff arrangements > Expected completion date (optional) 
			  	public CreateRFPSOWPage EmploymentStaffArrangementsDate() throws InterruptedException {
					click("(//input[@name='scope_of_work[0].employment.staff_supply.dt'])","completion Date");
					click("//button[contains(@class,'MuiPickersDay-dayWithMargin MuiPickersDay-today')]","date");
					return this;}
			
			   
			  	//Comment box > Supply of staff arrangements
			  	public CreateRFPSOWPage EmploymentStaffArrangementsCmts(String EmploymentStaffArrangementsCmts) throws InterruptedException {
			  		type("//*[@name='scope_of_work[0].employment.staff_supply.comment']", EmploymentStaffArrangementsCmts , "Supply of staff arrangements");	
			  		return this;}
			  	
			  	
			 // check Box > HR aspects of outsourcing and insourcing
			  	public CreateRFPSOWPage checkEmploymentOutsourcing() throws InterruptedException {
					check("//*[@name='scope_of_work[0].employment.hr_outsourcing.value']", "HR aspects of outsourcing");
					return this;}
				
				
				// HR aspects of outsourcing and insourcing > Expected completion date (optional) 
			  	public CreateRFPSOWPage EmploymentOutsourcingDate() throws InterruptedException {
					click("(//input[@name='scope_of_work[0].employment.hr_outsourcing.dt'])","completion Date");
					click("//button[contains(@class,'MuiPickersDay-dayWithMargin MuiPickersDay-today')]","date");
					return this;}
			
			   
			  	//Comment box > HR aspects of outsourcing and insourcing
			  	public CreateRFPSOWPage EmploymentOutsourcingCmts(String EmploymentOutsourcingCmts) throws InterruptedException {
			  		type("//*[@name='scope_of_work[0].employment.hr_outsourcing.comment']", EmploymentOutsourcingCmts , "HR aspects of outsourcing");	
			  		return this;}
			  	
			 // check Box > Advice in respect of a grievance
			  	public CreateRFPSOWPage checkEmploymentGrievance() throws InterruptedException {
					check("//*[@name='scope_of_work[0].employment.grievance_advice.value']", "Advice in respect of a grievance");
					return this;}
				
				
				// Advice in respect of a grievance > Expected completion date (optional) 
			  	public CreateRFPSOWPage EmploymentGrievanceDate() throws InterruptedException {
					click("(//input[@name='scope_of_work[0].employment.grievance_advice.dt'])","completion Date");
					click("//button[contains(@class,'MuiPickersDay-dayWithMargin MuiPickersDay-today')]","date");
					return this;}
			
			   
			  	//Comment box > Advice in respect of a grievance
			  	public CreateRFPSOWPage EmploymentGrievanceCmts(String EmploymentGrievanceCmts) throws InterruptedException {
			  		type("//*[@name='scope_of_work[0].employment.grievance_advice.comment']", EmploymentGrievanceCmts , "Advice in respect of a grievance");	
			  		return this;}
				
				
			  	// check Box > Advice in respect of a disciplinary process
			  	public CreateRFPSOWPage checkEmploymentDisciplinary() throws InterruptedException {
					check("//*[@name='scope_of_work[0].employment.disciplinary_advice.value']", "Advice in respect of a disciplinary process");
					return this;}
				
				
				// Advice in respect of a disciplinary process > Expected completion date (optional) 
			  	public CreateRFPSOWPage EmploymentDisciplinaryDate() throws InterruptedException {
					click("(//input[@name='scope_of_work[0].employment.disciplinary_advice.dt'])","completion Date");
					click("//button[contains(@class,'MuiPickersDay-dayWithMargin MuiPickersDay-today')]","date");
					return this;}
			
			   
			  	//Comment box > Advice in respect of a disciplinary process
			  	public CreateRFPSOWPage EmploymentDisciplinaryCmts(String EmploymentDisciplinaryCmts) throws InterruptedException {
			  		type("//*[@name='scope_of_work[0].employment.disciplinary_advice.comment']", EmploymentDisciplinaryCmts , "Advice in respect of a disciplinary process");	
			  		return this;}
				
				
			 // check Box > Cross border advisory project
			  	public CreateRFPSOWPage checkEmploymentCrossBorder() throws InterruptedException {
					check("//*[@name='scope_of_work[0].employment.cross_border_advisory.value']", "Cross border advisory project");
					return this;}
				
				
				// Cross border advisory project > Expected completion date (optional) 
			  	public CreateRFPSOWPage EmploymentCrossBorderDate() throws InterruptedException {
					click("(//input[@name='scope_of_work[0].employment.cross_border_advisory.dt'])","completion Date");
					click("//button[contains(@class,'MuiPickersDay-dayWithMargin MuiPickersDay-today')]","date");
					return this;}
			
			   
			  	//Comment box > Cross border advisory project
			  	public CreateRFPSOWPage EmploymentCrossBorderCmts(String EmploymentCrossBorderCmts) throws InterruptedException {
			  		type("//*[@name='scope_of_work[0].employment.cross_border_advisory.comment']", EmploymentCrossBorderCmts , "Cross border advisory project");	
			  		return this;}
				
			  	
			 // check Box > Immigration and visas
			  	public CreateRFPSOWPage checkEmploymentImmigration() throws InterruptedException {
					check("//*[@name='scope_of_work[0].employment.immigration.value']", "Immigration and visas");
					return this;}
				
				
				// Immigration and visas> Expected completion date (optional) 
			  	public CreateRFPSOWPage EmploymentImmigrationDate() throws InterruptedException {
					click("(//input[@name='scope_of_work[0].employment.immigration.dt'])","completion Date");
					click("//button[contains(@class,'MuiPickersDay-dayWithMargin MuiPickersDay-today')]","date");
					return this;}
			
			   
			  	// Comment box > Immigration and visas
			  	public CreateRFPSOWPage EmploymentImmigrationCmts(String EmploymentImmigrationCmts) throws InterruptedException {
			  		type("//*[@name='scope_of_work[0].employment.immigration.comment']", EmploymentImmigrationCmts , "Immigration and visas");	
			  		return this;}
				
				
			  	// check Box > Discrimination/ diversity/ equal opportunities	
			  	public CreateRFPSOWPage checkEmploymentDiscrimination() throws InterruptedException {
					check("//*[@name='scope_of_work[0].employment.discrimination.value']", "Discrimination/ diversity/ equal opportunities	");
					return this;}
				
				
				// Discrimination/ diversity/ equal opportunities	> Expected completion date (optional) 
			  	public CreateRFPSOWPage EmploymentDiscriminationDate() throws InterruptedException {
					click("(//input[@name='scope_of_work[0].employment.discrimination.dt'])","completion Date");
					click("//button[contains(@class,'MuiPickersDay-dayWithMargin MuiPickersDay-today')]","date");
					return this;}
			
			   
			  	// Comment box > Discrimination/ diversity/ equal opportunities	
			  	public CreateRFPSOWPage EmploymentDiscriminationCmts(String EmploymentDiscriminationCmts) throws InterruptedException {
			  		type("//*[@name='scope_of_work[0].employment.discrimination.comment']", EmploymentDiscriminationCmts , "Discrimination/ diversity/ equal opportunities	");	
			  		return this;}
			  	
			  	
			 // check Box > Employment investigation
			  	public CreateRFPSOWPage checkEmploymentInvestigation() throws InterruptedException {
					check("//*[@name='scope_of_work[0].employment.employment_investigation.value']", "Employment investigation");
					return this;}
				
				
				// Employment investigation	> Expected completion date (optional) 
			  	public CreateRFPSOWPage EmploymentInvestigationDate() throws InterruptedException {
					click("(//input[@name='scope_of_work[0].employment.employment_investigation.dt'])","completion Date");
					click("//button[contains(@class,'MuiPickersDay-dayWithMargin MuiPickersDay-today')]","date");
					return this;}
			
			   
			  	// Comment box > Employment investigation
			  	public CreateRFPSOWPage EmploymentInvestigationCmts(String EmploymentInvestigationCmts) throws InterruptedException {
			  		type("//*[@name='scope_of_work[0].employment.employment_investigation.comment']", EmploymentInvestigationCmts , "Employment investigation");	
			  		return this;}
			  	
			  	
			  	// check Box >  New/ proposed employment legislation
			  	public CreateRFPSOWPage checkEmploymentLegislation() throws InterruptedException {
					check("//*[@name='scope_of_work[0].employment.employment_legislation.value']", "New/ proposed");
					return this;}
				
				
				// New/ proposed employment legislation > Expected completion date (optional) 
			  	public CreateRFPSOWPage EmploymentLegislationDate() throws InterruptedException {
					click("(//input[@name='scope_of_work[0].employment.employment_legislation.dt'])","completion Date");
					click("//button[contains(@class,'MuiPickersDay-dayWithMargin MuiPickersDay-today')]","date");
					return this;}
			
			   
			  	// Comment box > New/ proposed employment legislation
			  	public CreateRFPSOWPage EmploymentLegislationCmts(String EmploymentlegislationCmts) throws InterruptedException {
			  		type("//*[@name='scope_of_work[0].employment.employment_legislation.comment']", EmploymentlegislationCmts , "New/ proposed");	
			  		return this;}
			  	
			  	
			 // check Box > Reporting obligations e.g. gender pay gap
			  	public CreateRFPSOWPage checkEmploymentObligations() throws InterruptedException {
					check("//*[@name='scope_of_work[0].employment.reporting_obligations.value']", "Reporting obligations");
					return this;}
				
				
				// Reporting obligations e.g. gender pay gap > Expected completion date (optional) 
			  	public CreateRFPSOWPage EmploymentObligationsDate() throws InterruptedException {
					click("(//input[@name='scope_of_work[0].employment.reporting_obligations.dt'])","completion Date");
					click("//button[contains(@class,'MuiPickersDay-dayWithMargin MuiPickersDay-today')]","date");
					return this;}
			
			   
			  	// Comment box > Reporting obligations e.g. gender pay gap
			  	public CreateRFPSOWPage EmploymentObligationsCmts(String EmploymentObligationsCmts) throws InterruptedException {
			  		type("//*[@name='scope_of_work[0].employment.reporting_obligations.comment']", EmploymentObligationsCmts , "Reporting obligations");	
			  		return this;}
			  		
				
				// check Box > Protecting confidential information
			  	public CreateRFPSOWPage checkEmploymentProtecting() throws InterruptedException {
					check("//*[@name='scope_of_work[0].employment.protecting_confidential_info.value']", "Protecting confidential information");
					return this;}
				
				
				// Protecting confidential information > Expected completion date (optional) 
			  	public CreateRFPSOWPage EmploymentProtectingsDate() throws InterruptedException {
					click("(//input[@name='scope_of_work[0].employment.protecting_confidential_info.dt'])","completion Date");
					click("//button[contains(@class,'MuiPickersDay-dayWithMargin MuiPickersDay-today')]","date");
					return this;}
			
			   
			  	// Comment box > Protecting confidential information
			  	public CreateRFPSOWPage EmploymentProtectingCmts(String EmploymentProtectingCmts) throws InterruptedException {
			  		type("//*[@name='scope_of_work[0].employment.protecting_confidential_info.comment']", EmploymentProtectingCmts , "Protecting confidential information");	
			  		return this;}
			  
				
				// check Box > Performance management
			  	public CreateRFPSOWPage checkEmploymentPerformance() throws InterruptedException {
					check("//*[@name='scope_of_work[0].employment.performance_management.value']", "Performance management");
					return this;}
				
				
				// Performance management > Expected completion date (optional) 
			  	public CreateRFPSOWPage EmploymentPerformanceDate() throws InterruptedException {
					click("(//input[@name='scope_of_work[0].employment.performance_management.dt'])","completion Date");
					click("//button[contains(@class,'MuiPickersDay-dayWithMargin MuiPickersDay-today')]","date");
					return this;}
			
			   
			  	// Comment box > Performance management
			  	public CreateRFPSOWPage EmploymentPerformanceCmts(String EmploymentPerformanceCmts) throws InterruptedException {
			  		type("//*[@name='scope_of_work[0].employment.performance_management.comment']", EmploymentPerformanceCmts , "Performance management");	
			  		return this;}
				
				
				// check Box > Long term sickness
			  	public CreateRFPSOWPage checkEmploymentsickness() throws InterruptedException {
					check("//*[@name='scope_of_work[0].employment.long_term_sickness.value']", "Long term sickness");
					return this;}
				
				
				// Long term sickness > Expected completion date (optional) 
			  	public CreateRFPSOWPage EmploymentsicknessDate() throws InterruptedException {
					click("(//input[@name='scope_of_work[0].employment.long_term_sickness.dt'])","completion Date");
					click("//button[contains(@class,'MuiPickersDay-dayWithMargin MuiPickersDay-today')]","date");
					return this;}
			
			   
			  	// Comment box > Long term sickness
			  	public CreateRFPSOWPage EmploymentsicknessCmts(String EmploymentsicknessCmts) throws InterruptedException {
			  		type("//*[@name='scope_of_work[0].employment.long_term_sickness.comment']", EmploymentsicknessCmts , "Long term sickness");	
			  		return this;}
				
			  	
				// check Box > Remuneration package and incentives design
			  	public CreateRFPSOWPage checkEmploymentRemuneration() throws InterruptedException {
					check("//*[@name='scope_of_work[0].employment.package_design.value']", "Remuneration package");
					return this;}
				
				
				// Remuneration package and incentives design > Expected completion date (optional) 
			  	public CreateRFPSOWPage EmploymentRemunerationDate() throws InterruptedException {
					click("(//input[@name='scope_of_work[0].employment.package_design.dt'])","completion Date");
					click("//button[contains(@class,'MuiPickersDay-dayWithMargin MuiPickersDay-today')]","date");
					return this;}
			
			   
			  	// Comment box > Remuneration package and incentives design
			  	public CreateRFPSOWPage EmploymentRemunerationCmts(String EmploymentRemunerationCmts) throws InterruptedException {
			  		type("//*[@name='scope_of_work[0].employment.package_design.comment']", EmploymentRemunerationCmts , "Remuneration package");	
			  		return this;}
				
				
				// check Box > Retainer for ongoing remuneration/incentives advice
			  	public CreateRFPSOWPage checkEmploymentIncentives() throws InterruptedException {
					check("//*[@name='scope_of_work[0].employment.ongoing_advice_retainer.value']", "incentives advice");
					return this;}
				
				
				// Retainer for ongoing remuneration/incentives advice > Expected completion date (optional) 
			  	public CreateRFPSOWPage EmploymentIncentivesDate() throws InterruptedException {
					click("(//input[@name='scope_of_work[0].employment.ongoing_advice_retainer.dt'])","completion Date");
					click("//button[contains(@class,'MuiPickersDay-dayWithMargin MuiPickersDay-today')]","date");
					return this;}
			
			   
			  	// Comment box > Retainer for ongoing remuneration/incentives advice
			  	public CreateRFPSOWPage EmploymentIncentivesCmts(String EmploymentIncentivesCmts) throws InterruptedException {
			  		type("//*[@name='scope_of_work[0].employment.ongoing_advice_retainer.comment']", EmploymentIncentivesCmts , "incentives advice");	
			  		return this;}
				
				
				// check Box > Whistleblowing
			  	public CreateRFPSOWPage checkEmploymentWhistleblowing() throws InterruptedException {
					check("//*[@name='scope_of_work[0].employment.whistleblowing.value']", "Whistleblowing");
					return this;}
				
				
				// Whistleblowing > Expected completion date (optional) 
			  	public CreateRFPSOWPage EmploymentWhistleblowingDate() throws InterruptedException {
					click("(//input[@name='scope_of_work[0].employment.whistleblowing.dt'])","completion Date");
					click("//button[contains(@class,'MuiPickersDay-dayWithMargin MuiPickersDay-today')]","date");
					return this;}
			
			   
			  	// Comment box > Whistleblowing
			  	public CreateRFPSOWPage EmploymentWhistleblowingCmts(String EmploymentWhistleblowingCmts) throws InterruptedException {
			  		type("//*[@name='scope_of_work[0].employment.whistleblowing.comment']", EmploymentWhistleblowingCmts , "Whistleblowing");	
			  		return this;}
				
				
			// check Box > Employee health and safety
			  public CreateRFPSOWPage checkEmploymenthealth() throws InterruptedException {
			  	check("//*[@name='scope_of_work[0].employment.employee_health_safety.value']", "Employee health and safety");
				return this;}
			
			
			// Employee health and safety > Expected completion date (optional) 
		  	public CreateRFPSOWPage EmploymenthealthDate() throws InterruptedException {
				click("(//input[@name='scope_of_work[0].employment.employee_health_safety.dt'])","completion Date");
				click("//button[contains(@class,'MuiPickersDay-dayWithMargin MuiPickersDay-today')]","date");
				return this;}
		
		   
		  	// Comment box > Employee health and safety
		  	public CreateRFPSOWPage EmploymenthealthCmts(String EmploymenthealthCmts) throws InterruptedException {
		  		type("//*[@name='scope_of_work[0].employment.employee_health_safety.comment']", EmploymenthealthCmts , "Employee health and safety");	
		  		return this;}
			  	
			 				
				// check Box > Advice related to pensions
		  	public CreateRFPSOWPage checkEmploymentPensions() throws InterruptedException {
			  	check("//*[@name='scope_of_work[0].employment.pension_advice.value']", "Advice related to pensions");
				return this;}
			
			
			// Advice related to pensions> Expected completion date (optional) 
		  	public CreateRFPSOWPage EmploymentPensionsDate() throws InterruptedException {
				click("(//input[@name='scope_of_work[0].employment.pension_advice.dt'])","completion Date");
				click("//button[contains(@class,'MuiPickersDay-dayWithMargin MuiPickersDay-today')]","date");
				return this;}
		
		   
		  	// Comment box > Advice related to pensions
		  	public CreateRFPSOWPage EmploymenthealthPensions(String EmploymenthealthPensions) throws InterruptedException {
		  		type("//*[@name='scope_of_work[0].employment.pension_advice.comment']", EmploymenthealthPensions , "Advice related to pensions");	
		  		return this;}
				
				
			// check Box >Employee Other
		  	public CreateRFPSOWPage checkEmploymentOther() throws InterruptedException {
			  	check("//*[@name='scope_of_work[0].employment.other.value']", "Employee OTher");
				return this;}
			
			
			// Employee Other > Expected completion date (optional) 
		  	public CreateRFPSOWPage EmploymentOther() throws InterruptedException {
				click("(//input[@name='scope_of_work[0].employment.other.dt'])","completion Date");
				click("//button[contains(@class,'MuiPickersDay-dayWithMargin MuiPickersDay-today')]","date");
				return this;}
		
		   
		  	// Comment box > Employee Other
		  	public CreateRFPSOWPage EmploymenthealthOther(String EmploymentOther) throws InterruptedException {
		  		type("//*[@name='scope_of_work[0].employment.other.comment']", EmploymentOther , "Emnployee Other");	
		  		return this;}
		  	
		  	
	
	//6.----------------------------------------------------->  Financing & capital markets <-----------------------------------------------------------------------
	
	
				//Drop Down Scope ->  Financing & capital markets
				public CreateRFPSOWPage selectScopeFinancingAndCapitalMarkets() throws InterruptedException {
					Thread.sleep(2000);
					click("//div[@id='mui-component-select-scope_of_work[0].scope_of_work_id']", " Financing & capital markets " );
					click("//li[text()='Financing & capital markets']" , " Financing & capital markets " );
					return this;} 
				
				
				// check Box > We agree for legal services providers to work on a non exclusive basis with appropriate Chinese walls between each team
				public CreateRFPSOWPage checkFinancingWeAgree() throws InterruptedException {
				  	check("//*[@name='scope_of_work[0].financing_capital_markets.exclusivity.non_exclusive_basis.value']", "We agree for legal services");
					return this;}
				
				
				// Comment box > We agree for legal services providers to work
			  	public CreateRFPSOWPage FinancingWeAgreeOther(String FinancingWeAgreeComments) throws InterruptedException {
			  		type("//*[@name='scope_of_work[0].financing_capital_markets.exclusivity.non_exclusive_basis.comment']", FinancingWeAgreeComments , "We agree for legal");	
			  		return this;}
				
				
				// check Box > We request legal services providers to work on an exclusive basis only
			  	public CreateRFPSOWPage checkFinancingWeRequest() throws InterruptedException {
				  	check("//*[@name='scope_of_work[0].financing_capital_markets.exclusivity.exclusive_basis_only.value']", "We request legal services");
					return this;}
			  	
			  	
			 // Comment box > We request legal services providers to work on an exclusive basis only
			  	public CreateRFPSOWPage FinancingWeRequest(String FinancingWeRequest) throws InterruptedException {
			  		type("//*[@name='scope_of_work[0].financing_capital_markets.exclusivity.exclusive_basis_only.comment']", FinancingWeRequest , "We request legal services");	
			  		return this;}
				
				
			  	//Transactions
			  	// check Box > Asset and leasing finance
			  	public CreateRFPSOWPage checkFinancingAsset() throws InterruptedException {
				  	check("//*[@name='scope_of_work[0].financing_capital_markets.transactions.asset_leasing_finance.value']", "Asset and leasing finance");
					return this;}	
			  	
			  	
			 // Asset and leasing finance > Expected completion date (optional) 
			  	public CreateRFPSOWPage FinancingAssetDate() throws InterruptedException {
					click("(//input[@name='scope_of_work[0].financing_capital_markets.transactions.asset_leasing_finance.dt'])","completion Date");
					click("//button[contains(@class,'MuiPickersDay-dayWithMargin MuiPickersDay-today')]","date");
					return this;}
			  	
			  	
			  	
			 // Comment box > Asset and leasing finance
			  	public CreateRFPSOWPage FinancingAssertComments(String FinancingAssertComments) throws InterruptedException {
			  		type("//*[@name='scope_of_work[0].financing_capital_markets.transactions.asset_leasing_finance.comment']", FinancingAssertComments , "Asset and leasing finance");	
			  		return this;}
				
			  	
			  	
			  					// check Box > Structuring
			  					public CreateRFPSOWPage checkFinancingAssetStructuring() throws InterruptedException {
			  						check("//*[@name='scope_of_work[0].financing_capital_markets.transactions.asset_leasing_finance.structuring.value']", "Asset and leasing finance > Structuring ");
			  						return this;}
			  	
			  	
			  					// check Box > Documentation (list)
			  					public CreateRFPSOWPage checkFinancingAssetDocumentation() throws InterruptedException {
			  						check("//*[@name='scope_of_work[0].financing_capital_markets.transactions.asset_leasing_finance.documentation.value']", "Asset and leasing finance > Documentation ");
			  						return this;}
			  					
			  					
								// check Box > Advisory/legal opinion/CP checklist, enforcement memorandum
			  					public CreateRFPSOWPage checkFinancingAssetAdvisory() throws InterruptedException {
			  						check("//*[@name='scope_of_work[0].financing_capital_markets.transactions.asset_leasing_finance.advisory.value']", "Asset and leasing finance > Advisory/legal opinion ");
			  						return this;}
			  					
			  					
								// check Box > Due diligence (indebtedness)
			  					public CreateRFPSOWPage checkFinancingAssetDueDiligence() throws InterruptedException {
			  						check("//*[@name='scope_of_work[0].financing_capital_markets.transactions.asset_leasing_finance.due_diligence.value']", "Asset and leasing finance > Due diligence");
			  						return this;}
			  	
			  	
				
				// check Box > Corporate lending
			  	public CreateRFPSOWPage checkFinancingCorporateLending() throws InterruptedException {
				  	check("//*[@name='scope_of_work[0].financing_capital_markets.transactions.corporate_lending.value']", "Corporate lending");
					return this;}
			  	
			  	
			 // Corporate lending > Expected completion date (optional) 
			  	public CreateRFPSOWPage FinancingCorporateLendingDate() throws InterruptedException {
					click("(//input[@name='scope_of_work[0].financing_capital_markets.transactions.corporate_lending.dt'])","completion Date");
					click("//button[contains(@class,'MuiPickersDay-dayWithMargin MuiPickersDay-today')]","date");
					return this;}
			  	
			  	
			 // Comment box > Corporate lending
			  	public CreateRFPSOWPage FinancingCorporateLendingComments(String FinancingCorporateLendingComments) throws InterruptedException {
			  		type("//*[@name='scope_of_work[0].financing_capital_markets.transactions.corporate_lending.comment']", FinancingCorporateLendingComments , "Corporate lending");	
			  		return this;}
			  	
			  
			// check Box > Debt capital markets
			  	public CreateRFPSOWPage checkFinancingDebtCapitalMarkets() throws InterruptedException {
				  	check("//*[@name='scope_of_work[0].financing_capital_markets.transactions.debt_capital_markets.value']", "Debt capital markets");
					return this;}
			  	
			 // Debt capital markets > Expected completion date (optional) 
			  	public CreateRFPSOWPage FinancingCapitalMarketsDate() throws InterruptedException {
					click("(//input[@name='scope_of_work[0].financing_capital_markets.transactions.debt_capital_markets.dt'])","completion Date");
					click("//button[contains(@class,'MuiPickersDay-dayWithMargin MuiPickersDay-today')]","date");
					return this;}
			  	
			  	
			 // Comment box > Debt capital markets
			  	public CreateRFPSOWPage FinancingCapitalMarketsComments(String FinancingCapitalMarketsComments) throws InterruptedException {
			  		type("//*[@name='scope_of_work[0].financing_capital_markets.transactions.debt_capital_markets.comment']", FinancingCapitalMarketsComments , "Debt capital markets");	
			  		return this;}	
			  	
		
				// check Box > Equity capital markets
			  	public CreateRFPSOWPage checkFinancingEquityCapitalMarkets() throws InterruptedException {
				  	check("//*[@name='scope_of_work[0].financing_capital_markets.transactions.equity_capital_markets.value']", "Equity capital markets");
					return this;}
				
				
			 // Equity capital markets > Expected completion date (optional) 
			  	public CreateRFPSOWPage FinancingEquityDate() throws InterruptedException {
					click("(//input[@name='scope_of_work[0].financing_capital_markets.transactions.equity_capital_markets.dt'])","completion Date");
					click("//button[contains(@class,'MuiPickersDay-dayWithMargin MuiPickersDay-today')]","date");
					return this;}
			  	
			  	
			 // Comment box > Equity capital markets
			  	public CreateRFPSOWPage FinancingEquityComments(String FinancingEquityComments) throws InterruptedException {
			  		type("//*[@name='scope_of_work[0].financing_capital_markets.transactions.equity_capital_markets.comment']", FinancingEquityComments , "Equity capital markets");	
			  		return this;}	
			  	
			  	
				// check Box > Islamic finance
			  	public CreateRFPSOWPage checkFinancingIslamicFinance() throws InterruptedException {
				  	check("//*[@name='scope_of_work[0].financing_capital_markets.transactions.islamic_finance.value']", "Islamic finance");
					return this;}
			  	
			  	
			 // Islamic finance > Expected completion date (optional) 
			  	public CreateRFPSOWPage FinancingIslamicFinanceDate() throws InterruptedException {
					click("(//input[@name='scope_of_work[0].financing_capital_markets.transactions.islamic_finance.dt'])","completion Date");
					click("//button[contains(@class,'MuiPickersDay-dayWithMargin MuiPickersDay-today')]","date");
					return this;}
			  	
			  	
			 // Comment box > Islamic finance
			  	public CreateRFPSOWPage FinancingIslamicFinanceComments(String FinancingIslamicFinanceComments) throws InterruptedException {
			  		type("//*[@name='scope_of_work[0].financing_capital_markets.transactions.islamic_finance.comment']", FinancingIslamicFinanceComments , "Islamic finance");	
			  		return this;}
			  	
				
			// check Box > Leveraged and acquisition finance
			  	public CreateRFPSOWPage checkFinancingLeveraged() throws InterruptedException {
				  	check("//*[@name='scope_of_work[0].financing_capital_markets.transactions.leveraged_acquisition_finance.value']", "Leveraged and acquisition finance");
					return this;}
			  	
			  	
			 // Leveraged and acquisition finance > Expected completion date (optional) 
			  	public CreateRFPSOWPage FinancingLeveragedDate() throws InterruptedException {
					click("(//input[@name='scope_of_work[0].financing_capital_markets.transactions.leveraged_acquisition_finance.dt'])","completion Date");
					click("//button[contains(@class,'MuiPickersDay-dayWithMargin MuiPickersDay-today')]","date");
					return this;}
			  	
			  	
			 // Comment box > Leveraged and acquisition finance
			  	public CreateRFPSOWPage FinancingLeveragedComments(String FinancingLeveragedComments) throws InterruptedException {
			  		type("//*[@name='scope_of_work[0].financing_capital_markets.transactions.leveraged_acquisition_finance.comment']", FinancingLeveragedComments , "Leveraged and acquisition finance");	
			  		return this;}
			  	
				
				// check Box > Real estate finance
			  	public CreateRFPSOWPage checkFinancingRealEstate() throws InterruptedException {
				  	check("//*[@name='scope_of_work[0].financing_capital_markets.transactions.real_estate_finance.value']", "Real estate finance");
					return this;}
			  	
				
			 // Real estate finance > Expected completion date (optional) 
			  	public CreateRFPSOWPage FinancingRealEstateDate() throws InterruptedException {
					click("(//input[@name='scope_of_work[0].financing_capital_markets.transactions.real_estate_finance.dt'])","completion Date");
					click("//button[contains(@class,'MuiPickersDay-dayWithMargin MuiPickersDay-today')]","date");
					return this;}
			  	
			  	
			 // Comment box > Real estate finance
			  	public CreateRFPSOWPage FinancingRealEstateComments(String FinancingRealEstateComments) throws InterruptedException {
			  		type("//*[@name='scope_of_work[0].financing_capital_markets.transactions.real_estate_finance.comment']", FinancingRealEstateComments , "Leveraged and acquisition finance");	
			  		return this;}
			  	
			  	
				
				// check Box > Securitisation
			  	public CreateRFPSOWPage checkFinancingSecuritisation() throws InterruptedException {
				  	check("//*[@name='scope_of_work[0].financing_capital_markets.transactions.securitisation.value']", "Securitisation");
					return this;}
				
			  	
			 // Securitisation > Expected completion date (optional) 
			  	public CreateRFPSOWPage FinancingSecuritisationDate() throws InterruptedException {
					click("(//input[@name='scope_of_work[0].financing_capital_markets.transactions.securitisation.dt'])","completion Date");
					click("//button[contains(@class,'MuiPickersDay-dayWithMargin MuiPickersDay-today')]","date");
					return this;}
			  	
			  	
			 // Comment box > Securitisation
			  	public CreateRFPSOWPage FinancingSecuritisationComments(String FinancingSecuritisationComments) throws InterruptedException {
			  		type("//*[@name='scope_of_work[0].financing_capital_markets.transactions.securitisation.comment']", FinancingSecuritisationComments , "Securitisation");	
			  		return this;}
			  	
			  	
				// check Box > Derivatives & structured products
			  	public CreateRFPSOWPage checkFinancingDerivatives() throws InterruptedException {
				  	check("//*[@name='scope_of_work[0].financing_capital_markets.transactions.derivatives_structured_products.value']", "Derivatives & structured products");
					return this;}
				
			  	
			  	// check Box > Structured credit products
			  	public CreateRFPSOWPage checkFinancingCreditProducts() throws InterruptedException {
				  	check("//*[@name='scope_of_work[0].financing_capital_markets.transactions.derivatives_structured_products.structured_credit_products.value']", "Structured credit products");
					return this;}
			  	
			  	
			  	// Structured credit products > Expected completion date (optional) 
			  	public CreateRFPSOWPage FinancingCreditProductsDate() throws InterruptedException {
					click("(//input[@name='scope_of_work[0].financing_capital_markets.transactions.derivatives_structured_products.structured_credit_products.dt'])","completion Date");
					click("//button[contains(@class,'MuiPickersDay-dayWithMargin MuiPickersDay-today')]","date");
					return this;}
			  	
			  	
			 // Comment box > Structured credit products
			  	public CreateRFPSOWPage FinancingCreditProductsComments(String FinancingCreditProductsComments) throws InterruptedException {
			  		type("//*[@name='scope_of_work[0].financing_capital_markets.transactions.derivatives_structured_products.structured_credit_products.comment']", FinancingCreditProductsComments , "Structured credit products");	
			  		return this;}
			  	
			  	
			  	
			 // check Box > Structured equity products
			  	public CreateRFPSOWPage checkFinancingEquityProducts() throws InterruptedException {
				  	check("//*[@name='scope_of_work[0].financing_capital_markets.transactions.derivatives_structured_products.structured_equity_products.value']", "Structured equity products");
					return this;}
			  	
			  	
			  // Structured equity products > Expected completion date (optional) 
			  	public CreateRFPSOWPage FinancingEquityProductsDate() throws InterruptedException {
					click("(//input[@name='scope_of_work[0].financing_capital_markets.transactions.derivatives_structured_products.structured_equity_products.dt'])","completion Date");
					click("//button[contains(@class,'MuiPickersDay-dayWithMargin MuiPickersDay-today')]","date");
					return this;}
			  	
			  	
			 // Comment box > Structured equity products
			  	public CreateRFPSOWPage FinancingEquityProductsComments(String FinancingEquityProductsComments) throws InterruptedException {
			  		type("//*[@name='scope_of_work[0].financing_capital_markets.transactions.derivatives_structured_products.structured_equity_products.comment']", FinancingEquityProductsComments , "Structured equity products");	
			  		return this;} 	
			  	
			  	
			 // check Box > Interest rate, FX and inflation products
			  	public CreateRFPSOWPage checkFinancingIntrestRate() throws InterruptedException {
				  	check("//*[@name='scope_of_work[0].financing_capital_markets.transactions.derivatives_structured_products.interest_rate.value']", "Interest rate, FX and inflation products");
					return this;}
			  	
			  	
			  // Interest rate, FX and inflation products > Expected completion date (optional) 
			  	public CreateRFPSOWPage FinancingIntrestRateDate() throws InterruptedException {
					click("(//input[@name='scope_of_work[0].financing_capital_markets.transactions.derivatives_structured_products.interest_rate.dt'])","completion Date");
					click("//button[contains(@class,'MuiPickersDay-dayWithMargin MuiPickersDay-today')]","date");
					return this;}
			  	
			  	
			 // Comment box > Interest rate, FX and inflation products
			  	public CreateRFPSOWPage FinancingIntrestRateComments(String FinancingIntrestRateComments) throws InterruptedException {
			  		type("//*[@name='scope_of_work[0].financing_capital_markets.transactions.derivatives_structured_products.interest_rate.comment']", FinancingIntrestRateComments , "Interest rate, FX and inflation products");	
			  		return this;} 	
			  	
			  	
			 // check Box > Commodity linked transactions
			  	public CreateRFPSOWPage checkFinancingCommodity() throws InterruptedException {
				  	check("//*[@name='scope_of_work[0].financing_capital_markets.transactions.derivatives_structured_products.commodity_linked_transactions.value']", "Commodity linked transactions");
					return this;}
			  	
			  	
			  // Commodity linked transactions > Expected completion date (optional) 
			  	public CreateRFPSOWPage FinancingCommodityDate() throws InterruptedException {
					click("(//input[@name='scope_of_work[0].financing_capital_markets.transactions.derivatives_structured_products.commodity_linked_transactions.dt'])","completion Date");
					click("//button[contains(@class,'MuiPickersDay-dayWithMargin MuiPickersDay-today')]","date");
					return this;}
			  	
			  	
			 // Comment box > Commodity linked transactions
			  	public CreateRFPSOWPage FinancingCommodityComments(String FinancingCommodityComments) throws InterruptedException {
			  		type("//*[@name='scope_of_work[0].financing_capital_markets.transactions.derivatives_structured_products.commodity_linked_transactions.comment']", FinancingCommodityComments , "Commodity linked transactions");	
			  		return this;} 	
			  	
			  	
				// check Box > ETP platforms
			  	public CreateRFPSOWPage checkFinancingETPPlatforms() throws InterruptedException {
				  	check("//*[@name='scope_of_work[0].financing_capital_markets.transactions.derivatives_structured_products.etp_platforms.value']", "ETP platforms");
					return this;}
			  	
			  	
			   // ETP platforms > Expected completion date (optional) 
			  	public CreateRFPSOWPage FinancingETPPlatformsDate() throws InterruptedException {
					click("(//input[@name='scope_of_work[0].financing_capital_markets.transactions.derivatives_structured_products.etp_platforms.dt'])","completion Date");
					click("//button[contains(@class,'MuiPickersDay-dayWithMargin MuiPickersDay-today')]","date");
					return this;}
			  	
			  	
			   // Comment box > ETP platforms
			  	public CreateRFPSOWPage FinancingETPPlatformsComments(String FinancingETPPlatformsComments) throws InterruptedException {
			  		type("//*[@name='scope_of_work[0].financing_capital_markets.transactions.derivatives_structured_products.etp_platforms.comment']", FinancingETPPlatformsComments , "ETP platforms");	
			  		return this;}
			  	
			  	
			 // check Box > Prime brokerage and intermediation arrangements
			  	public CreateRFPSOWPage checkFinancingPrimeBrokerage() throws InterruptedException {
				  	check("//*[@name='scope_of_work[0].financing_capital_markets.transactions.derivatives_structured_products.prime_brokerage.value']", "Prime brokerage and intermediation arrangements");
					return this;}
			  	
			  	
			   // Prime brokerage and intermediation arrangements > Expected completion date (optional) 
			  	public CreateRFPSOWPage FinancingPrimeBrokerageDate() throws InterruptedException {
					click("(//input[@name='scope_of_work[0].financing_capital_markets.transactions.derivatives_structured_products.prime_brokerage.dt'])","completion Date");
					click("//button[contains(@class,'MuiPickersDay-dayWithMargin MuiPickersDay-today')]","date");
					return this;}
			  	
			  	
			   // Comment box > Prime brokerage and intermediation arrangements
			  	public CreateRFPSOWPage FinancingPrimeBrokerageComments(String FinancingPrimeBrokerageComments) throws InterruptedException {
			  		type("//*[@name='scope_of_work[0].financing_capital_markets.transactions.derivatives_structured_products.prime_brokerage.comment']", FinancingPrimeBrokerageComments , "Prime brokerage and intermediation arrangements");	
			  		return this;}
			  	
			  	
			  	// check Box > Credit risk mitigation
			  	public CreateRFPSOWPage checkFinancingCreditRisk() throws InterruptedException {
				  	check("//*[@name='scope_of_work[0].financing_capital_markets.transactions.derivatives_structured_products.credit_risk_mitigation.value']", "Credit risk mitigation");
					return this;}
			  	
			  	
			   // Credit risk mitigation > Expected completion date (optional) 
			  	public CreateRFPSOWPage FinancingCreditRiskDate() throws InterruptedException {
					click("(//input[@name='scope_of_work[0].financing_capital_markets.transactions.derivatives_structured_products.credit_risk_mitigation.dt'])","completion Date");
					click("//button[contains(@class,'MuiPickersDay-dayWithMargin MuiPickersDay-today')]","date");
					return this;}
			  	
			  	
			   // Comment box > Credit risk mitigation
			  	public CreateRFPSOWPage FinancingCreditRiskComments(String FinancingCreditRiskComments) throws InterruptedException {
			  		type("//*[@name='scope_of_work[0].financing_capital_markets.transactions.derivatives_structured_products.credit_risk_mitigation.comment']", FinancingCreditRiskComments , "Credit risk mitigation");	
			  		return this;}
			  	
			  	
			 // check Box > Repos and securities lending
			  	public CreateRFPSOWPage checkFinancingRepos() throws InterruptedException {
				  	check("//*[@name='scope_of_work[0].financing_capital_markets.transactions.derivatives_structured_products.repos_securities_lending.value']", "Repos and securities lending");
					return this;}
			  	
			  	
			   // Repos and securities lending > Expected completion date (optional) 
			  	public CreateRFPSOWPage FinancingReposDate() throws InterruptedException {
					click("(//input[@name='scope_of_work[0].financing_capital_markets.transactions.derivatives_structured_products.repos_securities_lending.dt'])","completion Date");
					click("//button[contains(@class,'MuiPickersDay-dayWithMargin MuiPickersDay-today')]","date");
					return this;}
			  	
			  	
			   // Comment box > Repos and securities lending
			  	public CreateRFPSOWPage FinancingReposComments(String FinancingReposComments) throws InterruptedException {
			  		type("//*[@name='scope_of_work[0].financing_capital_markets.transactions.derivatives_structured_products.repos_securities_lending.comment']", FinancingReposComments , "Repos and securities lending");	
			  		return this;}
			  	
			  	
			 // check Box > Derivatives & structured products > Other
			  	public CreateRFPSOWPage checkFinancingDerivativesOther() throws InterruptedException {
				  	check("//*[@name='scope_of_work[0].financing_capital_markets.transactions.derivatives_structured_products.other.value']", "Derivatives & structured products > Other");
					return this;}
			  	
			  	
			   // Derivatives & structured products > Other > Expected completion date (optional) 
			  	public CreateRFPSOWPage FinancingDerivativesOtherDate() throws InterruptedException {
					click("(//input[@name='scope_of_work[0].financing_capital_markets.transactions.derivatives_structured_products.other.dt'])","completion Date");
					click("//button[contains(@class,'MuiPickersDay-dayWithMargin MuiPickersDay-today')]","date");
					return this;}
			  	
			  	
			   // Comment box > Derivatives & structured products > Other
			  	public CreateRFPSOWPage FinancingDerivativesOtherComments(String FinancingDerivativesOtherComments) throws InterruptedException {
			  		type("//*[@name='scope_of_work[0].financing_capital_markets.transactions.derivatives_structured_products.other.comment']", FinancingDerivativesOtherComments , "Derivatives & structured products > Other");	
			  		return this;}
			  	
			  	
			  	// check Box > Trade & commodities finance
			  	public CreateRFPSOWPage checkFinancingTrade() throws InterruptedException {
				  	check("//*[@name='scope_of_work[0].financing_capital_markets.transactions.trade_commodities_finance.value']", "Trade & commodities finance");
					return this;}
			  	
			  	
			 // Trade & commodities finance > Expected completion date (optional) 
			  	public CreateRFPSOWPage FinancingTradeDate() throws InterruptedException {
					click("(//input[@name='scope_of_work[0].financing_capital_markets.transactions.trade_commodities_finance.dt'])","completion Date");
					click("//button[contains(@class,'MuiPickersDay-dayWithMargin MuiPickersDay-today')]","date");
					return this;}
			  	
			  	
			   // Comment box > Trade & commodities finance
			  	public CreateRFPSOWPage FinancingTradeComments(String FinancingTradeComments) throws InterruptedException {
			  		type("//*[@name='scope_of_work[0].financing_capital_markets.transactions.trade_commodities_finance.comment']", FinancingTradeComments , " Trade & commodities finance");	
			  		return this;}
			  	
			  	
			 // check Box > Corporate trust
			  	public CreateRFPSOWPage checkFinancingCorporateTrust() throws InterruptedException {
				  	check("//*[@name='scope_of_work[0].financing_capital_markets.transactions.corporate_trust.value']", "Corporate trust");
					return this;}
			  	
			  	
			 // Corporate trust > Expected completion date (optional) 
			  	public CreateRFPSOWPage FinancingCorporateTrustDate() throws InterruptedException {
					click("(//input[@name='scope_of_work[0].financing_capital_markets.transactions.corporate_trust.dt'])","completion Date");
					click("//button[contains(@class,'MuiPickersDay-dayWithMargin MuiPickersDay-today')]","date");
					return this;}
			  	
			  	
			   // Comment box > Corporate trust
			  	public CreateRFPSOWPage FinancingCorporateTrustComments(String FinancingCorporateTrustComments) throws InterruptedException {
			  		type("//*[@name='scope_of_work[0].financing_capital_markets.transactions.corporate_trust.comment']", FinancingCorporateTrustComments , "Corporate trust");	
			  		return this;}	
			  	
			  	
			 // check Box > Other
			  	public CreateRFPSOWPage checkFinancingOther() throws InterruptedException {
				  	check("//*[@name='scope_of_work[0].financing_capital_markets.transactions.other.value']", " Financing Other");
					return this;}
			  	
			  	
			 // Other > Expected completion date (optional) 
			  	public CreateRFPSOWPage FinancingCorporateOtherDate() throws InterruptedException {
					click("(//input[@name='scope_of_work[0].financing_capital_markets.transactions.other.dt'])","completion Date");
					click("//button[contains(@class,'MuiPickersDay-dayWithMargin MuiPickersDay-today')]","date");
					return this;}
			  	
			  	
			   // Comment box > Other
			  	public CreateRFPSOWPage FinancingOtherComments(String FinancingOtherComments) throws InterruptedException {
			  		type("//*[@name='scope_of_work[0].financing_capital_markets.transactions.other.comment']", FinancingOtherComments , "Financing Other");	
			  		return this;}	 	
			  	
			  	
			 // check Box > Regulatory compliance/advocacy
			  	public CreateRFPSOWPage checkFinancingRegulatory() throws InterruptedException {
				  	check("//*[@name='scope_of_work[0].financing_capital_markets.regulatory_compliance_advocacy.regulatory_compliance_advocacy.value']", " Regulatory compliance/advocacy");
					return this;}
				
				
			 // Regulatory compliance/advocacy > Expected completion date (optional) 
			  	public CreateRFPSOWPage FinancingRegulatoryDate() throws InterruptedException {
					click("(//input[@name='scope_of_work[0].financing_capital_markets.regulatory_compliance_advocacy.regulatory_compliance_advocacy.dt'])","completion Date");
					click("//button[contains(@class,'MuiPickersDay-dayWithMargin MuiPickersDay-today')]","date");
					return this;}
			  	
			  	
			   // Comment box > Regulatory compliance/advocacy
			  	public CreateRFPSOWPage FinancingRegulatoryComments(String FinancingRegulatoryComments) throws InterruptedException {
			  		type("//*[@name='scope_of_work[0].financing_capital_markets.regulatory_compliance_advocacy.regulatory_compliance_advocacy.comment']", FinancingRegulatoryComments , "Regulatory compliance/advocacy");	
			  		return this;}	
				
				
				// check Box > Enforcement
			  	public CreateRFPSOWPage checkFinancingEnforcement() throws InterruptedException {
				  	check("//*[@name='scope_of_work[0].financing_capital_markets.enforcement.enforcement.value']", " Enforcement");
					return this;}
				
				
			 // Enforcement > Expected completion date (optional) 
			  	public CreateRFPSOWPage FinancingEnforcementDate() throws InterruptedException {
					click("(//input[@name='scope_of_work[0].financing_capital_markets.enforcement.enforcement.dt'])","completion Date");
					click("//button[contains(@class,'MuiPickersDay-dayWithMargin MuiPickersDay-today')]","date");
					return this;}
			  	
			  	
			   // Comment box > Enforcement
			  	public CreateRFPSOWPage FinancingEnforcementComments(String FinancingEnforcementComments) throws InterruptedException {
			  		type("//*[@name='scope_of_work[0].financing_capital_markets.enforcement.enforcement.comment']", FinancingEnforcementComments , "Enforcement");	
			  		return this;}	
				
				
	
	//7.------------------------------------------------------> (Infrastructure) projects & financing <---------------------------------------------------------------------
	
	
				//Drop Down Scope ->  (Infrastructure) projects & financing
				public CreateRFPSOWPage selectScopeInfrastructure() throws InterruptedException {
					Thread.sleep(2000);
					click("//div[@id='mui-component-select-scope_of_work[0].scope_of_work_id']", " (Infrastructure) projects & financing " );
					click("//li[text()='(Infrastructure) projects & financing']" , " (Infrastructure) projects & financing " );
					Thread.sleep(3000);
					return this;} 
				
				
				
				// check Box > Tender phase
				public CreateRFPSOWPage checkInfrastructureTender() throws InterruptedException {
				  	check("//*[@name='scope_of_work[0].infrastructure_projects_financing.tender_phase.value']", " Tender phase");
					return this;}
				
				
				// Tender phase > Expected completion date (optional) 
			  	public CreateRFPSOWPage InfrastructureTenderDate() throws InterruptedException {
					click("(//input[@name='scope_of_work[0].infrastructure_projects_financing.tender_phase.dt'])","completion Date");
					click("//button[contains(@class,'MuiPickersDay-dayWithMargin MuiPickersDay-today')]","date");
					return this;}
			
			   
			  	// Comment box > Tender phase
			  	public CreateRFPSOWPage InfrastructureTenderCmts(String InfrastructureTenderCmts) throws InterruptedException {
			  		type("//*[@name='scope_of_work[0].infrastructure_projects_financing.tender_phase.comment']", InfrastructureTenderCmts , "Tender phase");	
			  		return this;}
				
				
				
				// check Box > Structuring, establishment of SPV vehicle
				public CreateRFPSOWPage checkInfrastructureStructuring() throws InterruptedException {
				  	check("//*[@name='scope_of_work[0].infrastructure_projects_financing.structuring.value']", "Structuring, establishment of SPV vehicle");
					return this;}
				
				
				// Structuring, establishment of SPV vehicle > Expected completion date (optional) 
			  	public CreateRFPSOWPage InfrastructureStructuringDate() throws InterruptedException {
					click("(//input[@name='scope_of_work[0].infrastructure_projects_financing.structuring.dt'])","completion Date");
					click("//button[contains(@class,'MuiPickersDay-dayWithMargin MuiPickersDay-today')]","date");
					return this;}
			
			   
			  	// Comment box > Structuring, establishment of SPV vehicle
			  	public CreateRFPSOWPage InfrastructureStructuringCmts(String InfrastructureStructuringCmts) throws InterruptedException {
			  		type("//*[@name='scope_of_work[0].infrastructure_projects_financing.structuring.comment']", InfrastructureStructuringCmts , "Structuring, establishment of SPV vehicle");	
			  		return this;}
				
				
				// check Box > Due diligence (regulatory, licences, real estate)
				public CreateRFPSOWPage checkInfrastructureDueDiligence() throws InterruptedException {
				  	check("//*[@name='scope_of_work[0].infrastructure_projects_financing.due_diligence.value']", "Due diligence");
					return this;}
				
				
				// Due diligence (regulatory, licences, real estate) > Expected completion date (optional) 
			  	public CreateRFPSOWPage InfrastructureDueDiligenceDate() throws InterruptedException {
					click("(//input[@name='scope_of_work[0].infrastructure_projects_financing.due_diligence.dt'])","completion Date");
					click("//button[contains(@class,'MuiPickersDay-dayWithMargin MuiPickersDay-today')]","date");
					return this;}
			
			   
			  	// Comment box > Due diligence (regulatory, licences, real estate)
			  	public CreateRFPSOWPage InfrastructureDueDiligenceCmts(String InfrastructureDueDiligenceCmts) throws InterruptedException {
			  		type("//*[@name='scope_of_work[0].infrastructure_projects_financing.due_diligence.comment']", InfrastructureDueDiligenceCmts , "Due diligence");	
			  		return this;}
				
				
				// check Box > Sponsor documents
				public CreateRFPSOWPage checkInfrastructureSponsor() throws InterruptedException {
				  	check("//*[@name='scope_of_work[0].infrastructure_projects_financing.sponsor_documents.value']", "Sponsor documents");
					return this;}
				
				
				// Sponsor documents > Expected completion date (optional) 
			  	public CreateRFPSOWPage InfrastructureSponsorDate() throws InterruptedException {
					click("(//input[@name='scope_of_work[0].infrastructure_projects_financing.sponsor_documents.dt'])","completion Date");
					click("//button[contains(@class,'MuiPickersDay-dayWithMargin MuiPickersDay-today')]","date");
					return this;}
			
			   
			  	// Comment box > Sponsor documents
			  	public CreateRFPSOWPage InfrastructureSponsorCmts(String InfrastructureSponsorCmts) throws InterruptedException {
			  		type("//*[@name='scope_of_work[0].infrastructure_projects_financing.sponsor_documents.comment']", InfrastructureSponsorCmts , "Sponsor documents");	
			  		return this;}
				
				
				
				// check Box > Project Agreements
				public CreateRFPSOWPage checkInfrastructureAgreements() throws InterruptedException {
				  	check("//*[@name='scope_of_work[0].infrastructure_projects_financing.project_agreements.value']", "Project Agreements");
					return this;}
				
				
				// Project Agreements > Expected completion date (optional) 
			  	public CreateRFPSOWPage InfrastructureAgreementsDate() throws InterruptedException {
					click("(//input[@name='scope_of_work[0].infrastructure_projects_financing.project_agreements.dt'])","completion Date");
					click("//button[contains(@class,'MuiPickersDay-dayWithMargin MuiPickersDay-today')]","date");
					return this;}
			
			   
			  	// Comment box > Project Agreements
			  	public CreateRFPSOWPage InfrastructureAgreementsCmts(String InfrastructureAgreementsCmts) throws InterruptedException {
			  		type("//*[@name='scope_of_work[0].infrastructure_projects_financing.project_agreements.comment']", InfrastructureAgreementsCmts , "Project Agreements");	
			  		return this;}
				
				
				// check Box > Financing
				public CreateRFPSOWPage checkInfrastructureFinancing() throws InterruptedException {
				  	check("//*[@name='scope_of_work[0].infrastructure_projects_financing.financing.value']", "Financing");
					return this;}
				
				
				// Financing > Expected completion date (optional) 
			  	public CreateRFPSOWPage InfrastructureFinancingDate() throws InterruptedException {
					click("(//input[@name='scope_of_work[0].infrastructure_projects_financing.financing.dt'])","completion Date");
					click("//button[contains(@class,'MuiPickersDay-dayWithMargin MuiPickersDay-today')]","date");
					return this;}
			
			   
			  	// Comment box > Financing
			  	public CreateRFPSOWPage InfrastructureFinancingCmts(String InfrastructureFinancingCmts) throws InterruptedException {
			  		type("//*[@name='scope_of_work[0].infrastructure_projects_financing.financing.comment']", InfrastructureFinancingCmts , "Financing");	
			  		return this;}
				
				
				// check Box > Closing
				public CreateRFPSOWPage checkInfrastructureClosing() throws InterruptedException {
				  	check("//*[@name='scope_of_work[0].infrastructure_projects_financing.closing.value']", "Closing");
					return this;}
				
				// Closing > Expected completion date (optional) 
			  	public CreateRFPSOWPage InfrastructureClosingDate() throws InterruptedException {
					click("(//input[@name='scope_of_work[0].infrastructure_projects_financing.closing.dt'])","completion Date");
					click("//button[contains(@class,'MuiPickersDay-dayWithMargin MuiPickersDay-today')]","date");
					return this;}
			
			   
			  	// Comment box > Closing
			  	public CreateRFPSOWPage InfrastructureClosingCmts(String InfrastructureClosingCmts) throws InterruptedException {
			  		type("//*[@name='scope_of_work[0].infrastructure_projects_financing.closing.comment']", InfrastructureClosingCmts , "Closing");	
			  		return this;}
				
				
				
				
				
	
	//8.------------------------------------------------------->  Fund Formation  <---------------------------------------------------------------------

	
	//Drop Down Scope -> Fund formation
	public CreateRFPSOWPage selectFundFormation() throws InterruptedException {
		Thread.sleep(2000);
		click("//div[@id='mui-component-select-scope_of_work[0].scope_of_work_id']","Fund formation");
		click("//li[text()='Fund formation']","Fund formation");
		Thread.sleep(3000);
		return this;} 
	
	
	//Phase 1
	// check Box > Structuring
	public CreateRFPSOWPage checkStructuring() throws InterruptedException {
		check("//*[@name='scope_of_work[0].fund_formation.phase_one.structuring.value']", "Structuring");
		Thread.sleep(3000);
		return this;}
	
	
	//Structuring > Expected completion date (optional)
    public CreateRFPSOWPage FundStructcmptDate() throws InterruptedException {
		Thread.sleep(2000);
		click("(//input[@name='scope_of_work[0].fund_formation.phase_one.structuring.dt'])","Structuring");
		click("//button[contains(@class,'MuiPickersDay-dayWithMargin MuiPickersDay-today')]","Structuring");
		return this;}
    
    
  //Comment box - Structuring 
  	public CreateRFPSOWPage FundSStructCmts(String StructComments) throws InterruptedException {
  		Thread.sleep(3000);
  		type("//*[@name='scope_of_work[0].fund_formation.phase_one.structuring.comment']", StructComments , "Structuring Comments");	
  		return this;}
    
   
  	//check Box > Term Sheet
  	public CreateRFPSOWPage checkTermSheet() throws InterruptedException {
  		check("//*[@name='scope_of_work[0].fund_formation.phase_one.term_sheet.value']", "check TermSheet");
  		Thread.sleep(3000);
  		return this;}
  	
  	
  	//Term Sheet > Expected completion date (optional)
    public CreateRFPSOWPage FundTermcmptDate() throws InterruptedException {
		Thread.sleep(2000);
		click("(//input[@name='scope_of_work[0].fund_formation.phase_one.term_sheet.dt'])","completion Date");
		click("//button[contains(@class,'MuiPickersDay-dayWithMargin MuiPickersDay-today')]","date");
		return this;}
  	
  	
  //Comment box - Term sheet 
  	public CreateRFPSOWPage FundStructuringCmts(String TermComments) throws InterruptedException {
  		Thread.sleep(3000);
  		type("//*[@name='scope_of_work[0].fund_formation.phase_one.term_sheet.comment']", TermComments , "Structuring Comments");	
  		return this;}
    
  	
  //Global Comment box - Term sheet 
  	public CreateRFPSOWPage FundTermcGblCmts(String TermGlbComments) throws InterruptedException {
  		Thread.sleep(3000);
  		type("//*[@name='scope_of_work[0].fund_formation.phase_one.comment']", TermGlbComments, "Terms Global Comments");	
  		return this;}
  	
  	//Phase 2
   //check Box > Marketing
  	public CreateRFPSOWPage checkMarketing() throws InterruptedException {
  		check("//*[@name='scope_of_work[0].fund_formation.phase_two.marketing.value']", "checkMarketing");
  		Thread.sleep(3000);
  		return this;}
  	
			  //check Box > Reviewing pitch book/teaser
			  	public CreateRFPSOWPage checkReviewingPitch() throws InterruptedException {
			  		check("//*[@name='scope_of_work[0].fund_formation.phase_two.marketing.reviewing_pitch_book']", "Reviewing pitch book/teaser");
			  		Thread.sleep(3000);
			  		return this;}
  
			  //check Box > Marketing advice/selling restrictions
			  	public CreateRFPSOWPage checkrestrictions() throws InterruptedException {
			  		check("//*[@name='scope_of_work[0].fund_formation.phase_two.marketing.marketing_advice.value']", "Marketing advice/selling restrictions");
			  		Thread.sleep(3000);
			  		return this;}
			  	
			  	
			  	//check Box > Fund interests into EU jurisdictions under AIFMD
			  	public CreateRFPSOWPage checkAIFMD() throws InterruptedException {
			  		check("//*[@name='scope_of_work[0].fund_formation.phase_two.marketing.marketing_advice.fund_interests']", "Fund interests into EU jurisdictions under AIFMD");
			  		Thread.sleep(3000);
			  		return this;}
			  	
			  				  	
			  	//check Box > All relevant non-U.S. and non-EU jurisdictions
			  	public CreateRFPSOWPage checkNonUsEu() throws InterruptedException {
			  		check("//*[@name='scope_of_work[0].fund_formation.phase_two.marketing.marketing_advice.non_us_eu_jurisdictions']", "All relevant non-U.S. and non-EU jurisdictions");
			  		Thread.sleep(3000);
			  		return this;}
			  	
			  	
			  	//check Box > Marketing in the US:
			  	public CreateRFPSOWPage checkMArketingInUS() throws InterruptedException {
			  		check("//*[@name='scope_of_work[0].fund_formation.phase_two.marketing.marketing_advice.marketing_in_us.value']", "Marketing in the US:");
			  		Thread.sleep(3000);
			  		return this;}
			  	
			  	
			  			//Advising on U.S. private placement exemptions, including providing a brief "ground rules" memorandum containing practical 
			  			//advice on how to conduct the offering in compliance with Regulations D and S, including how to deal with media enquiries
			  			public CreateRFPSOWPage checkAdvisingTheUS() throws InterruptedException {
			  					check("//*[@name='scope_of_work[0].fund_formation.phase_two.marketing.marketing_advice.marketing_in_us.private_placement_exemptions']", "Advising on U.S. private placement");
			  					Thread.sleep(3000);
			  					return this;}
			  	
			  	
			  	
			  			//Providing a U.S. securities law opinion.
			  			public CreateRFPSOWPage checkSecuritiesLaw() throws InterruptedException {
		  					check("//*[@name='scope_of_work[0].fund_formation.phase_two.marketing.marketing_advice.marketing_in_us.us_securities_law']", "U.S. securities law opinion");
		  					Thread.sleep(3000);
		  					return this;}
			  	
			  	
			  			//Completing U.S. Regulation D filings (if required) and, to the extent required, any applicable state "blue sky" filings.
			  			public CreateRFPSOWPage checkDFiling() throws InterruptedException {
		  					check("//*[@name='scope_of_work[0].fund_formation.phase_two.marketing.marketing_advice.marketing_in_us.us_regulation_filings']", "Regulation D filings");
		  					Thread.sleep(3000);
		  					return this;}
			  	
			  	
			  		//Comment box - Marketing 
			  		  	public CreateRFPSOWPage FundMarketingCmts(String MarketingComments) throws InterruptedException {
			  		  		Thread.sleep(3000);
			  		  		type("//*[@name='scope_of_work[0].fund_formation.phase_two.comment']", MarketingComments , "Marketing Comments");	
			  		  		return this;}
			  			
			  			
   //Phase 3  
  //check Box > Drafting PPM legal aspects
  	public CreateRFPSOWPage checkDraftingPPMlegalaspects() throws InterruptedException {
  		check("//*[@name='scope_of_work[0].fund_formation.phase_three.drafting_ppm.value']", "Drafting PPM legal aspects");
  		Thread.sleep(3000);
  		return this;}
  	
  	
  //Drafting PPM legal aspects > Expected completion date (optional)
    public CreateRFPSOWPage FundDraftingPPMcmptDate() throws InterruptedException {
		Thread.sleep(2000);
		click("(//input[@name='scope_of_work[0].fund_formation.phase_three.drafting_ppm.dt'])","completion Date");
		click("//button[contains(@class,'MuiPickersDay-dayWithMargin MuiPickersDay-today')]","date");
		return this;}
  	
  	
  //Comment box - Drafting PPM legal aspects
  	public CreateRFPSOWPage FundDraftingPPMCmts(String DraftingPPMComments) throws InterruptedException {
  		Thread.sleep(3000);
  		type("//*[@name='scope_of_work[0].fund_formation.phase_three.drafting_ppm.comment']", DraftingPPMComments , "Drafting PPM legal aspects");	
  		return this;}
    
  	
  	//check Box > Core documents
  	public CreateRFPSOWPage checkCoreDocuments() throws InterruptedException {
  		check("//*[@name='scope_of_work[0].fund_formation.phase_three.core_documents.value']", "Core documents");
  		Thread.sleep(3000);
  		return this;}
  	
  	
  	 //Core documents > Expected completion date (optional)
    public CreateRFPSOWPage FundCoreDocumentscmptDate() throws InterruptedException {
		Thread.sleep(2000);
		click("(//input[@name='scope_of_work[0].fund_formation.phase_three.core_documents.dt'])","completion Date");
		click("//button[contains(@class,'MuiPickersDay-dayWithMargin MuiPickersDay-today')]","date");
		return this;}
  	
  	
  //Comment box - Core documents
  	public CreateRFPSOWPage FundcoredocumentsCmts(String coredocumentComments) throws InterruptedException {
  		Thread.sleep(3000);
  		type("//*[@name='scope_of_work[0].fund_formation.phase_three.core_documents.comment']", coredocumentComments , "Core documents");	
  		return this;}
     	
  	
  	//check Box > Ancilliary documents
  	public CreateRFPSOWPage checkAncilliaryDocuments() throws InterruptedException {
  		check("//*[@name='scope_of_work[0].fund_formation.phase_three.ancilliary_documents.value']", "Ancilliary documents");
  		Thread.sleep(3000);
  		return this;}
  	
  	
  	 //Ancilliary documents > Expected completion date (optional)
    public CreateRFPSOWPage FundAncilliaryDocumentscmptDate() throws InterruptedException {
		Thread.sleep(2000);
		click("(//input[@name='scope_of_work[0].fund_formation.phase_three.ancilliary_documents.dt'])","completion Date");
		click("//button[contains(@class,'MuiPickersDay-dayWithMargin MuiPickersDay-today')]","date");
		return this;}
  	
  	
    //Comment box - Ancilliary documents
  	public CreateRFPSOWPage FundAncilliaryCmts(String ancilliarytComments) throws InterruptedException {
  		Thread.sleep(3000);
  		type("//*[@name='scope_of_work[0].fund_formation.phase_three.ancilliary_documents.comment']", ancilliarytComments , "Ancilliary documents");	
  		return this;}
     	

  //Comment box - Global Ancilliary documents
  	public CreateRFPSOWPage GblFundFormationAncilliaryCmts(String GblancilliarytComments) throws InterruptedException {
  		Thread.sleep(3000);
  		type("//*[@name='scope_of_work[0].fund_formation.phase_three.comment']", GblancilliarytComments , "Global Ancilliary documents");	
  		return this;}
  	
  	//Phase 4
  	
  //check Box > Entity establishment
  	public CreateRFPSOWPage checkestablishment() throws InterruptedException {
  		check("//*[@name='scope_of_work[0].fund_formation.phase_four.entity_establishment.value']", "Entity establishment");
  		Thread.sleep(3000);
  		return this;}
  	
  	
  	 //Entity establishment > Expected completion date (optional)
    public CreateRFPSOWPage FundEntityEstbcmptDate() throws InterruptedException {
		Thread.sleep(2000);
		click("(//input[@name='scope_of_work[0].fund_formation.phase_four.entity_establishment.dt'])","Entity establishment completion Date");
		click("//button[contains(@class,'MuiPickersDay-dayWithMargin MuiPickersDay-today')]","date");
		return this;}
  	
  	
    //Comment box - Entity establishment
  	public CreateRFPSOWPage FundEntityEstbCmts(String ancilliarytComments) throws InterruptedException {
  		Thread.sleep(3000);
  		type("//*[@name='scope_of_work[0].fund_formation.phase_four.entity_establishment.comment']", ancilliarytComments , "Entity establishment Comments");	
  		return this;}
  	
  	
  //check Box > Negotiations
  	public CreateRFPSOWPage checkNegotiations() throws InterruptedException {
  		check("//*[@name='scope_of_work[0].fund_formation.phase_four.negotiations.value']", "Negotiations");
  		Thread.sleep(3000);
  		return this;}
  	
  	
  	 //Negotiations > Expected completion date (optional)
    public CreateRFPSOWPage FundNegotiationscmptDate() throws InterruptedException {
		Thread.sleep(2000);
		click("(//input[@name='scope_of_work[0].fund_formation.phase_four.negotiations.dt'])","Negotiations");
		click("//button[contains(@class,'MuiPickersDay-dayWithMargin MuiPickersDay-today')]","date");
		return this;}
  	
  	
    //Comment box - Negotiations
  	public CreateRFPSOWPage FundNegotiationsCmts(String NegotiationsComments) throws InterruptedException {
  		Thread.sleep(3000);
  		type("//*[@name='scope_of_work[0].fund_formation.phase_four.negotiations.comment']", NegotiationsComments , "Negotiations Comments");	
  		return this;}
  	
  	
  	//check Box > Closings
  	public CreateRFPSOWPage checkClosings() throws InterruptedException {
  		check("//*[@name='scope_of_work[0].fund_formation.phase_four.closings.value']", "Closings");
  		Thread.sleep(3000);
  		return this;}
  	
  	
  	 //Closings > Expected completion date (optional)
    public CreateRFPSOWPage FundClosingscmptDate() throws InterruptedException {
		Thread.sleep(2000);
		click("(//input[@name='scope_of_work[0].fund_formation.phase_four.closings.dt'])","Closings");
		click("//button[contains(@class,'MuiPickersDay-dayWithMargin MuiPickersDay-today')]","date");
		return this;}
  	
  	
    //Comment box - Closings
  	public CreateRFPSOWPage FundClosingsCmts(String ClosingsComments) throws InterruptedException {
  		Thread.sleep(3000);
  		type("//*[@name='scope_of_work[0].fund_formation.phase_four.closings.comment']", ClosingsComments , "Closings Comments");	
  		return this;}
  	
  //Comment box - Global Closings
  	public CreateRFPSOWPage FundGblClosingsCmts(String GblClosingsComments) throws InterruptedException {
  		Thread.sleep(3000);
  		type("//*[@name='scope_of_work[0].fund_formation.phase_four.comment']", GblClosingsComments , "Global Closings");	
  		return this;}
  	
  	
  	//Phase 5
    //check Box > Post Closing
  	public CreateRFPSOWPage checkPostClosing() throws InterruptedException {
  		check("//*[@name='scope_of_work[0].fund_formation.phase_five.post_closing.value']", "Post Closing");
  		Thread.sleep(3000);
  		return this;}
  	
  	
  	 //Post Closing > Expected completion date (optional)
    public CreateRFPSOWPage FundPostClosingcmptDate() throws InterruptedException {
		Thread.sleep(2000);
		click("(//input[@name='scope_of_work[0].fund_formation.phase_five.post_closing.dt'])","Post Closing");
		click("//button[contains(@class,'MuiPickersDay-dayWithMargin MuiPickersDay-today')]","date");
		return this;}
  	
  	
    //Comment box - Post Closing
  	public CreateRFPSOWPage FundPostClosingCmts(String PostClosingComments) throws InterruptedException {
  		Thread.sleep(3000);
  		type("//*[@name='scope_of_work[0].fund_formation.phase_five.post_closing.comment']", PostClosingComments , "Post Closing Comments");	
  		return this;}
  	
  	
  	//check Box > Optional Work streams
  	public CreateRFPSOWPage checkWorkstreams() throws InterruptedException {
  		check("//*[@name='scope_of_work[0].fund_formation.phase_five.optional_workstreams.value']", "Optional Workstreams");
  		Thread.sleep(3000);
  		return this;}
  	
  	
  	 //Optional Work streams > Expected completion date (optional)
    public CreateRFPSOWPage FundWorkstreamscmptDate() throws InterruptedException {
		Thread.sleep(2000);
		click("(//input[@name='scope_of_work[0].fund_formation.phase_five.optional_workstreams.dt'])","Optional Workstreams");
		click("//button[contains(@class,'MuiPickersDay-dayWithMargin MuiPickersDay-today')]","date");
		return this;}
  	
  	
    //Comment box - Optional Work streams
  	public CreateRFPSOWPage FundWorkstreamsCmts(String OptionalWorkstreamsComments) throws InterruptedException {
  		Thread.sleep(3000);
  		type("//*[@name='scope_of_work[0].fund_formation.phase_five.optional_workstreams.comment']", OptionalWorkstreamsComments , "Optional Workstreams Comments");	
  		return this;}
  	
  	//Comment box - Global Optional Work streams
  	public CreateRFPSOWPage FundGblWorkstreamsCmts(String GblWorkstreamsComments) throws InterruptedException {
  		Thread.sleep(3000);
  		type("//*[@name='scope_of_work[0].fund_formation.phase_five.comment']", GblWorkstreamsComments , "Optional Workstreams");	
  		return this;}
  	
  	
  	//9.-------------------------------------------------------------> Fund investment <-------------------------------------------------------------------------------------
	
  	
  	//Drop Down Scope -> Fund investment
  		public CreateRFPSOWPage selectScopeFundInvestment() throws InterruptedException {
   			click("//div[@id='mui-component-select-scope_of_work[0].scope_of_work_id']" , "Fund investment" );
  			click("//li[text()='Fund investment']" , "Fund investment" );
  			return this;} 
  	
  	//check Box > Summarising key terms of the Fund’s documents and providing a material issues list
  		public CreateRFPSOWPage checkFundInvestmentSummarising() throws InterruptedException {
  	  		check("//*[@name='scope_of_work[0].fund_investment.summarising_key_terms.value']", "Summarising key terms");
  	  		return this;}
  		
  		
  	//Summarising key terms of the Fund’s > Expected completion date (optional)
  	    public CreateRFPSOWPage FundInvestmentSummarisingcmptDate() throws InterruptedException {
  			click("(//input[@name='scope_of_work[0].fund_investment.summarising_key_terms.dt'])","Summarising");
  			click("//button[contains(@class,'MuiPickersDay-dayWithMargin MuiPickersDay-today')]","date");
  			return this;}
  	  	
  	  	
  	    //Comment box - Summarising key terms of the Fund’s
  	  	public CreateRFPSOWPage FundInvestmentSummarisingCmts(String FundInvestmentSummarisingComments) throws InterruptedException {
  	  		Thread.sleep(3000);
  	  		type("//*[@name='scope_of_work[0].fund_investment.summarising_key_terms.comment']", FundInvestmentSummarisingComments , "Summarising");	
  	  		return this;}
  		
  		
  		
  	//check Box > Negotiating with the Fund’s legal counsel on the Fund’s documents (mainly limited partnership agreement or equivalent, side letter and subscription agreement);
  		public CreateRFPSOWPage checkFundInvestmentNegotiating() throws InterruptedException {
  	  		check("//*[@name='scope_of_work[0].fund_investment.negotiating_legal_counsel.value']", "Negotiating with the Fund’s");
  	  		Thread.sleep(3000);
  	  		return this;}
  		
  		
  	//Negotiating with the Fund’s > Expected completion date (optional)
  	    public CreateRFPSOWPage FundInvestmentNegotiatingcmptDate() throws InterruptedException {
  			Thread.sleep(2000);
  			click("(//input[@name='scope_of_work[0].fund_investment.negotiating_legal_counsel.dt'])","Negotiating");
  			click("//button[contains(@class,'MuiPickersDay-dayWithMargin MuiPickersDay-today')]","date");
  			return this;}
  	  	
  	  	
  	    //Comment box - Negotiating with the Fund’s
  	  	public CreateRFPSOWPage FundInvestmentNegotiatingCmts(String FundInvestmentNegotiatingComments) throws InterruptedException {
  	  		Thread.sleep(3000);
  	  		type("//*[@name='scope_of_work[0].fund_investment.negotiating_legal_counsel.comment']", FundInvestmentNegotiatingComments , "Negotiating");	
  	  		return this;}
  		
  		
  	//check Box > Related tax advice
  		public CreateRFPSOWPage checkFundInvestmentTaxAdvice() throws InterruptedException {
  	  		check("//*[@name='scope_of_work[0].fund_investment.related_tax_advice.value']", "Related tax advice");
  	  		Thread.sleep(3000);
  	  		return this;}
  		
  		
  	//Related tax advice > Expected completion date (optional)
  	    public CreateRFPSOWPage FundInvestmentTaxAdvicecmptDate() throws InterruptedException {
  			Thread.sleep(2000);
  			click("(//input[@name='scope_of_work[0].fund_investment.related_tax_advice.dt'])","Related tax advice");
  			click("//button[contains(@class,'MuiPickersDay-dayWithMargin MuiPickersDay-today')]","date");
  			return this;}
  	  	
  	  	
  	    //Comment box - Related tax advice
  	  	public CreateRFPSOWPage FundInvestmentTaxAdviceCmts(String FundInvestmentTaxAdviceComments) throws InterruptedException {
  	  		Thread.sleep(3000);
  	  		type("//*[@name='scope_of_work[0].fund_investment.related_tax_advice.comment']", FundInvestmentTaxAdviceComments , "Related tax advice");	
  	  		return this;}
  		
  		
  		
  	//check Box > Assistance in execution and closing
  		public CreateRFPSOWPage checkFundInvestmentAssistance() throws InterruptedException {
  	  		check("//*[@name='scope_of_work[0].fund_investment.assistance_execution_closing.value']", "Assistance in execution and closing");
  	  		Thread.sleep(3000);
  	  		return this;}
  		
  		
  		
  	//Assistance in execution and closing > Expected completion date (optional)
  	    public CreateRFPSOWPage FundInvestmentAssistancecmptDate() throws InterruptedException {
  			Thread.sleep(2000);
  			click("(//input[@name='scope_of_work[0].fund_investment.assistance_execution_closing.dt'])","Assistance in execution and closing");
  			click("//button[contains(@class,'MuiPickersDay-dayWithMargin MuiPickersDay-today')]","date");
  			return this;}
  	  	
  	  	
  	    //Comment box - Assistance in execution and closing
  	  	public CreateRFPSOWPage FundInvestmentAssistanceCmts(String FundInvestmentAssistanceComments) throws InterruptedException {
  	  		Thread.sleep(3000);
  	  		type("//*[@name='scope_of_work[0].fund_investment.assistance_execution_closing.comment']", FundInvestmentAssistanceComments , "Assistance in execution and closing Comments");	
  	  		return this;}
  	

}
