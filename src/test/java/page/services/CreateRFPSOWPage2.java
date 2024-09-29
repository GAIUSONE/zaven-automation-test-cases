package page.services;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import com.force.base.ProjectHooks;
import com.force.config.ConfigurationManager;
import com.microsoft.playwright.BrowserContext;
import com.microsoft.playwright.PlaywrightException;
import page.base.ZavenHooks;

public class CreateRFPSOWPage2 extends ProjectHooks{

//---------------------------->	Scope of Work (SOW)*
	
	
//10.-------------------------------------------------------------> IP <-------------------------------------------------------------------------------------
	
	//Drop Down Scope -> IP
		public CreateRFPSOWPage2 selectScopeCommercial() throws InterruptedException {
			click("//div[@id='mui-component-select-scope_of_work[0].scope_of_work_id']","IP");
			click("//li[text()='IP']" , "IP");
			return this;} 
		
		
			// check Box > IP > Portfolio management
			public CreateRFPSOWPage2 checkIPPortfolioManagement() throws InterruptedException {
		  		check("//*[@name='scope_of_work[0].ip.portfolio_management.value']", "Portfolio management");
		  		return this;}
  	
  	
			// IP > Portfolio management > Expected completion date (optional)
		    public CreateRFPSOWPage2 IPPortfolioManagementDate() throws InterruptedException {
				click("(//input[@name='scope_of_work[0].ip.portfolio_management.dt'])","Portfolio management");
				click("//button[contains(@class,'MuiPickersDay-dayWithMargin MuiPickersDay-today')]","date");
				return this;}
		  	
		  	
		    //Comment box - IP > Portfolio management
		  	public CreateRFPSOWPage2 IPPortfolioManagementCmts(String IPPortfolioManagementComments) throws InterruptedException {
		  		type("//*[@name='scope_of_work[0].ip.portfolio_management.comment']", IPPortfolioManagementComments , "Portfolio management");	
		  		return this;}
	  	
	  	
		 // check Box > IP > Commercialisation
		 			public CreateRFPSOWPage2 checkIPCommercialisation() throws InterruptedException {
		 		  		check("//*[@name='scope_of_work[0].ip.commercialisation.value']", "Commercialisation");
		 		  		return this;}
		   	
		   	
		 			// IP > Commercialisation > Expected completion date (optional)
		 		    public CreateRFPSOWPage2 IPCommercialisationDate() throws InterruptedException {
		 				click("(//input[@name='scope_of_work[0].ip.commercialisation.dt'])","Commercialisation");
		 				click("//button[contains(@class,'MuiPickersDay-dayWithMargin MuiPickersDay-today')]","date");
		 				return this;}
		 		  	
		 		  	
		 		    //Comment box - IP > Commercialisation
		 		  	public CreateRFPSOWPage2 IPCommercialisationCmts(String IPCommercialisationComments) throws InterruptedException {
		 		  		type("//*[@name='scope_of_work[0].ip.commercialisation.comment']", IPCommercialisationComments , "Commercialisation");	
		 		  		return this;}
			
			
		 		// check Box > IP > Enforcement
		 			public CreateRFPSOWPage2 checkIPEnforcement() throws InterruptedException {
		 		  		check("//*[@name='scope_of_work[0].ip.enforcement.value']", "Enforcement");
		 		  		return this;}
		   	
		   	
		 			// IP > Enforcement > Expected completion date (optional)
		 		    public CreateRFPSOWPage2 IPEnforcementDate() throws InterruptedException {
		 				click("(//input[@name='scope_of_work[0].ip.enforcement.dt'])","Enforcementn");
		 				click("//button[contains(@class,'MuiPickersDay-dayWithMargin MuiPickersDay-today')]","date");
		 				return this;}
		 		  	
		 		  	
		 		    //Comment box - IP > Enforcement
		 		  	public CreateRFPSOWPage2 IPEnforcementCmts(String IPEnforcementComments) throws InterruptedException {
		 		  		type("//*[@name='scope_of_work[0].ip.enforcement.comment']", IPEnforcementComments , "Enforcement");	
		 		  		return this;}
			
			
		 		// check Box > IP > Other
		 			public CreateRFPSOWPage2 checkIPOther() throws InterruptedException {
		 		  		check("//*[@name='scope_of_work[0].ip.other.value']", "IP Other");
		 		  		return this;}
		   	
		   	
		 			// IP > Other > Expected completion date (optional)
		 		    public CreateRFPSOWPage2 IPOtherDate() throws InterruptedException {
		 				click("(//input[@name='scope_of_work[0].ip.other.dt'])", "IP Other");
		 				click("//button[contains(@class,'MuiPickersDay-dayWithMargin MuiPickersDay-today')]","date");
		 				return this;}
		 		  	
		 		  	
		 		    //Comment box - IP > Other
		 		  	public CreateRFPSOWPage2 IPOtherCmts(String IPOtherComments) throws InterruptedException {
		 		  		type("//*[@name='scope_of_work[0].ip.other.comment']", IPOtherComments , "IP Other");	
		 		  		return this;} 	
		 		  	
		 		  	
		 		  
  	//11.-------------------------------------------------------------> IT <-------------------------------------------------------------------------------------
		 	
		 		
		 		//Drop Down Scope -> IT
				 public CreateRFPSOWPage2 selectScopeIT() throws InterruptedException {
				 	click("//div[@id='mui-component-select-scope_of_work[0].scope_of_work_id']","IT");
				 	click("//li[text()='IT']" , "IT");
				 	return this;} 
				 
				 
				//Category
				// check Box > IT > Category > Privacy and cyber security advisory
		 			public CreateRFPSOWPage2 checkITPrivacy() throws InterruptedException {
		 		  		check("//*[@name='scope_of_work[0].it.category.privacy_cyber_security.value']", "Privacy and cyber security advisory");
		 		  		return this;}
		 			
		 			
		 		// IT > Category > Privacy and cyber security advisory > Expected completion date (optional)
		 	    public CreateRFPSOWPage2 ITPrivacyDate() throws InterruptedException {
		 			click("(//input[@name='scope_of_work[0].it.category.privacy_cyber_security.dt'])", "Privacy and cyber security advisory");
		 			click("//button[contains(@class,'MuiPickersDay-dayWithMargin MuiPickersDay-today')]","date");
		 			return this;}
		 		  	
		 		  	
		 		//Comment box > IT > Category > Privacy and cyber security advisory
		 		public CreateRFPSOWPage2 ITPrivacyCmts(String ITPrivacyComments) throws InterruptedException {
		 		  	type("//*[@name='scope_of_work[0].it.category.privacy_cyber_security.comment']", ITPrivacyComments , "Privacy and cyber security advisory Comments");	
		 		  	return this;} 	
		 			
		 		
		 		// check Box > IT > Category > Outsourcing/strategic commercial contracts (including cloud deployments)
		 			public CreateRFPSOWPage2 checkITOutsourcing() throws InterruptedException {
		 		  		check("//*[@name='scope_of_work[0].it.category.outsourcing_commercial_contracts.value']", "Outsourcing/strategic commercial contracts");
		 		  		return this;}
		
		 			
		 		// IT > Category > Outsourcing/strategic commercial contracts (including cloud deployments) > Expected completion date (optional)
			 	    public CreateRFPSOWPage2 ITOutsourcingDate() throws InterruptedException {
			 			click("(//input[@name='scope_of_work[0].it.category.outsourcing_commercial_contracts.dt'])", "Outsourcing/strategic commercial contracts");
			 			click("//button[contains(@class,'MuiPickersDay-dayWithMargin MuiPickersDay-today')]","date");
			 			return this;}
			 		  	
			 		  	
			 		//Comment box > IT > Category > Outsourcing/strategic commercial contracts (including cloud deployments)
			 		public CreateRFPSOWPage2 ITOutsourcingCmts(String ITOutsourcingComments) throws InterruptedException {
			 		  	type("//*[@name='scope_of_work[0].it.category.outsourcing_commercial_contracts.comment']", ITOutsourcingComments , "Outsourcing/strategic commercial contracts Comments");	
			 		  	return this;} 
		 			
		 			
		 		// check Box > IT > Category > Tech joint ventures/business collaborations
		 			public CreateRFPSOWPage2 checkITTech() throws InterruptedException {
		 		  		check("//*[@name='scope_of_work[0].it.category.tech_joint_ventures.value']", "Tech joint ventures/business collaborations");
		 		  		return this;}
		 			
		 		// IT > Category > Tech joint ventures/business collaborations > Expected completion date (optional)
			 	    public CreateRFPSOWPage2 ITTechDate() throws InterruptedException {
			 			click("(//input[@name='scope_of_work[0].it.category.tech_joint_ventures.dt'])", "Tech joint ventures/business collaborations");
			 			click("//button[contains(@class,'MuiPickersDay-dayWithMargin MuiPickersDay-today')]","date");
			 			return this;}
			 		  	
			 		  	
			 		//Comment box > IT > Category > Tech joint ventures/business collaborations
			 		public CreateRFPSOWPage2 ITTechCmts(String ITTechComments) throws InterruptedException {
			 		  	type("//*[@name='scope_of_work[0].it.category.tech_joint_ventures.comment']", ITTechComments , "Tech joint ventures/business collaborations");	
			 		  	return this;} 	
		 			
		 			
		 		// check Box > IT > Category > Licensing and general commercial
		 			public CreateRFPSOWPage2 checkITLicensing() throws InterruptedException {
		 		  		check("//*[@name='scope_of_work[0].it.category.licensing_general_commercial.value']", "Licensing and general commercial");
		 		  		return this;}	
		 			
		 			
		 		// IT > Category > Licensing and general commercial > Expected completion date (optional)
			 	    public CreateRFPSOWPage2 ITLicensingDate() throws InterruptedException {
			 			click("(//input[@name='scope_of_work[0].it.category.licensing_general_commercial.dt'])", "Licensing and general commercial");
			 			click("//button[contains(@class,'MuiPickersDay-dayWithMargin MuiPickersDay-today')]","date");
			 			return this;}
			 		  	
			 		  	
			 		//Comment box > IT > Licensing and general commercial
			 		public CreateRFPSOWPage2 ITLicensingCmts(String ITLicensingComments) throws InterruptedException {
			 		  	type("//*[@name='scope_of_work[0].it.category.licensing_general_commercial.comment']", ITLicensingComments , "Licensing and general commercial");	
			 		  	return this;} 	
		 			
		 			
		 			// check Box > IT > Category > Fintech
		 			public CreateRFPSOWPage2 checkITFintech() throws InterruptedException {
		 		  		check("//*[@name='scope_of_work[0].it.category.fintech.value']", "Fintech");
		 		  		return this;}
		 			
		 		
		 		// IT > Category > Fintech > Expected completion date (optional)
			 	    public CreateRFPSOWPage2 ITFintechDate() throws InterruptedException {
			 			click("(//input[@name='scope_of_work[0].it.category.fintech.dt'])", "Fintech");
			 			click("//button[contains(@class,'MuiPickersDay-dayWithMargin MuiPickersDay-today')]","date");
			 			return this;}
			 		  	
			 		  	
			 		//Comment box > IT > Fintech
			 		public CreateRFPSOWPage2 ITFintechCmts(String ITFintechComments) throws InterruptedException {
			 		  	type("//*[@name='scope_of_work[0].it.category.fintech.comment']", ITFintechComments , "Fintech Comments");	
			 		  	return this;} 	
		 			
		 			
		 		// check Box > IT > Category > Other
		 			public CreateRFPSOWPage2 checkITOther() throws InterruptedException {
		 		  		check("//*[@name='scope_of_work[0].it.category.other.value']", "IT Category Other");
		 		  		return this;}
		 		
		 			
		 		// IT > Category > Other > Expected completion date (optional)
			 	    public CreateRFPSOWPage2 ITOtherDate() throws InterruptedException {
			 			click("(//input[@name='scope_of_work[0].it.category.other.dt'])", "IT Category Other");
			 			click("//button[contains(@class,'MuiPickersDay-dayWithMargin MuiPickersDay-today')]","date");
			 			return this;}
			 		  	
			 		  	
			 		//Comment box > IT > Other
			 		public CreateRFPSOWPage2 ITOtherCmts(String ITOtherComments) throws InterruptedException {
			 		  	type("//*[@name='scope_of_work[0].it.category.other.comment']", ITOtherComments , "IT Other Comments");	
			 		  	return this;} 	
		 				
		 			
		 		// check Box > IT > Phases > Kick off – initial meeting, review of documentation, term sheet preparation/review and negotiation, review of vendors' bids
		 			public CreateRFPSOWPage2 checkITKickOff() throws InterruptedException {
		 		  		check("//*[@name='scope_of_work[0].it.phases.kick_off_meeting.value']", "Kick off – initial meeting");
		 		  		return this;}
		 			
		 		
		 		// IT > Phases > Kick off – initial meeting, review of documentation, term sheet preparation/review and negotiation, review of vendors' bids > Expected completion date (optional)
			 	    public CreateRFPSOWPage2 ITKickOffDate() throws InterruptedException {
			 			click("(//input[@name='scope_of_work[0].it.phases.kick_off_meeting.dt'])", "Kick off – initial meeting");
			 			click("//button[contains(@class,'MuiPickersDay-dayWithMargin MuiPickersDay-today')]","date");
			 			return this;}
			 		  	
			 		  	
			 	//Comment box > IT > Kick off – initial meeting
			 	    public CreateRFPSOWPage2 ITKickOffCmts(String ITKickOffComments) throws InterruptedException {
			 		  	type("//*[@name='scope_of_work[0].it.phases.kick_off_meeting.comment']", ITKickOffComments , "IT Kick off Comments");	
			 		  	return this;} 
		 			
		 					 			
		 		// check Box > IT > Phases > Documentation preparation/review
		 		public CreateRFPSOWPage2 checkITDocumentation() throws InterruptedException {
		 		  	check("//*[@name='scope_of_work[0].it.phases.documentation_preparation.value']", "Documentation preparation/review");
		 		  	return this;}
		 		
		 		
		 	// IT > Phases > Documentation preparation/review > Expected completion date (optional)
		 	    public CreateRFPSOWPage2 ITDocumentationDate() throws InterruptedException {
		 			click("(//input[@name='scope_of_work[0].it.phases.documentation_preparation.dt'])", "Documentation preparation/review");
		 			click("//button[contains(@class,'MuiPickersDay-dayWithMargin MuiPickersDay-today')]","date");
		 			return this;}
		 		  	
		 		  	
		 	//Comment box > IT > Phases > Documentation preparation/review
		 	    public CreateRFPSOWPage2 ITDocumentationCmts(String ITDocumentationComments) throws InterruptedException {
		 		  	type("//*[@name='scope_of_work[0].it.phases.documentation_preparation.comment']", ITDocumentationComments , "Documentation preparation/review Comments");	
		 		  	return this;} 
		 			
		 			
		 		// check Box > IT > Phases > Negotiation
		 		public CreateRFPSOWPage2 checkITNegotiation() throws InterruptedException {
		 		  	check("//*[@name='scope_of_work[0].it.phases.negotiation.value']", "Negotiation");
		 		  	return this;}	
		 			
		 		// IT > Phases > Negotiation > Expected completion date (optional)
		 	    public CreateRFPSOWPage2 ITNegotiationDate() throws InterruptedException {
		 			click("(//input[@name='scope_of_work[0].it.phases.negotiation.dt'])", "Negotiation");
		 			click("//button[contains(@class,'MuiPickersDay-dayWithMargin MuiPickersDay-today')]","date");
		 			return this;}
		 		  	
		 		  	
		 	//Comment box > IT > Phases > Negotiation
		 	    public CreateRFPSOWPage2 ITNegotiationCmts(String ITNegotiationComments) throws InterruptedException {
		 		  	type("//*[@name='scope_of_work[0].it.phases.negotiation.comment']", ITNegotiationComments , "Negotiation");	
		 		  	return this;} 	
		 		
		 				 			
		 		// check Box > IT > Phases > Closing
		 		public CreateRFPSOWPage2 checkITClosing() throws InterruptedException {
		 		  	check("//*[@name='scope_of_work[0].it.phases.closing.value']", "Closing");
		 		  	return this;}	
		 			
		 			
		 	// IT > Phases > Closing > Expected completion date (optional)
		 	    public CreateRFPSOWPage2 ITClosingDate() throws InterruptedException {
		 			click("(//input[@name='scope_of_work[0].it.phases.closing.dt'])", "Closing");
		 			click("//button[contains(@class,'MuiPickersDay-dayWithMargin MuiPickersDay-today')]","date");
		 			return this;}
		 		  	
		 		  	
		 	//Comment box > IT > Phases > Closing
		 	    public CreateRFPSOWPage2 ITClosingCmts(String ITClosingComments) throws InterruptedException {
		 		  	type("//*[@name='scope_of_work[0].it.phases.closing.comment']", ITClosingComments , "Closing");	
		 		  	return this;} 
		 		
		 			
		 		// check Box > IT > Phases > Memo of advice
		 		public CreateRFPSOWPage2 checkITMemoOfAdvice() throws InterruptedException {
		 		  	check("//*[@name='scope_of_work[0].it.phases.memo_advice.value']", "Memo of advice");
		 		  	return this;}	
		 			
		 			
		 	// IT > Phases > Memo of advice > Expected completion date (optional)
		 	    public CreateRFPSOWPage2 ITMemoOfAdviceDate() throws InterruptedException {
		 			click("(//input[@name='scope_of_work[0].it.phases.memo_advice.dt'])", "Memo of advice");
		 			click("//button[contains(@class,'MuiPickersDay-dayWithMargin MuiPickersDay-today')]","date");
		 			return this;}
		 		  	
		 		  	
		 	//Comment box > IT > Phases > Memo of advice
		 	    public CreateRFPSOWPage2 ITMemoOfAdviceCmts(String ITMemoOfAdviceComments) throws InterruptedException {
		 		  	type("//*[@name='scope_of_work[0].it.phases.memo_advice.comment']", ITMemoOfAdviceComments , "Memo of advice");	
		 		  	return this;} 	
		 			
		 			
  	
  	//12.-------------------------------------------------------------> Litigation <-------------------------------------------------------------------------------------
  	
		 //Drop Down Scope -> Litigation
		 public CreateRFPSOWPage2 selectScopeLitigation() throws InterruptedException {
			click("//div[@id='mui-component-select-scope_of_work[0].scope_of_work_id']","Litigation");
			click("//li[text()='Litigation']" , "Litigation");
			return this;}	 
				 
				 
		// check Box > Litigation > Investigation phase
	 		public CreateRFPSOWPage2 checkLitigationInvestigation() throws InterruptedException {
	 		  	check("//*[@name='scope_of_work[0].litigation.investigation_phase.value']", "Investigation phase");
	 		  	return this;}	
	 		
	 	// Litigation > Investigation phase > Expected completion date (optional)
	 	    public CreateRFPSOWPage2 LitigationInvestigationDate() throws InterruptedException {
	 			click("(//input[@name='scope_of_work[0].litigation.investigation_phase.dt'])", "Investigation phase");
	 			click("//button[contains(@class,'MuiPickersDay-dayWithMargin MuiPickersDay-today')]","date");
	 			return this;}
	 		  	
	 		  	
	 	//Comment box > Litigation > Investigation phase
	 	    public CreateRFPSOWPage2 LitigationInvestigationCmts(String LitigationInvestigationComments) throws InterruptedException {
	 		  	type("//*[@name='scope_of_work[0].litigation.investigation_phase.comment']", LitigationInvestigationComments , "Investigation phase");	
	 		  	return this;} 
	 	    
	 		
		//check Box > Litigation > Pleadings
	 		public CreateRFPSOWPage2 checkLitigationPleadings() throws InterruptedException {
	 		  	check("//*[@name='scope_of_work[0].litigation.pleadings.value']", "Pleadings");
	 		  	return this;}	
	 		
	 		
	 	// Litigation > Pleadings > Expected completion date (optional)
	 	    public CreateRFPSOWPage2 LitigationPleadingsDate() throws InterruptedException {
	 			click("(//input[@name='scope_of_work[0].litigation.pleadings.dt'])", "Pleadings");
	 			click("//button[contains(@class,'MuiPickersDay-dayWithMargin MuiPickersDay-today')]","date");
	 			return this;}
	 		  	
	 		  	
	 	//Comment box > Litigation > Pleadings
	 	    public CreateRFPSOWPage2 LitigationPleadingsCmts(String LitigationPleadingsComments) throws InterruptedException {
	 		  	type("//*[@name='scope_of_work[0].litigation.pleadings.comment']", LitigationPleadingsComments , "Pleadings");	
	 		  	return this;} 	
	 		
	 		
	 		//check Box > Litigation > Dispositive motion/motion to dismiss (US mainly)
	 		public CreateRFPSOWPage2 checkLitigationDispositive() throws InterruptedException {
	 		  	check("//*[@name='scope_of_work[0].litigation.dispositive_motion.value']", "Dispositive motion/motion to dismiss (US mainly)");
	 		  	return this;}
	 		
	 	// Litigation > Dispositive motion/motion to dismiss (US mainly) > Expected completion date (optional)
	 	    public CreateRFPSOWPage2 LitigationDispositiveDate() throws InterruptedException {
	 			click("(//input[@name='scope_of_work[0].litigation.dispositive_motion.dt'])", "Dispositive motion/motion to dismiss");
	 			click("//button[contains(@class,'MuiPickersDay-dayWithMargin MuiPickersDay-today')]","date");
	 			return this;}
	 		  	
	 		  	
	 	//Comment box > Litigation > Dispositive motion/motion to dismiss (US mainly)
	 	    public CreateRFPSOWPage2 LitigationDispositiveCmts(String LitigationDispositiveComments) throws InterruptedException {
	 		  	type("//*[@name='scope_of_work[0].litigation.dispositive_motion.comment']", LitigationDispositiveComments , "Dispositive motion/motion to dismiss");	
	 		  	return this;} 
	 		
	 		
	 		//check Box > Litigation > Exchange of evidence
	 		public CreateRFPSOWPage2 checkLitigationExchange() throws InterruptedException {
	 		  	check("//*[@name='scope_of_work[0].litigation.exchange_evidence.value']", "Exchange of evidence");
	 		  	return this;}
	 		
	 	// Litigation > Exchange of evidence > Expected completion date (optional)
	 	    public CreateRFPSOWPage2 LitigationExchangeDate() throws InterruptedException {
	 			click("(//input[@name='scope_of_work[0].litigation.exchange_evidence.dt'])", "Exchange of evidence");
	 			click("//button[contains(@class,'MuiPickersDay-dayWithMargin MuiPickersDay-today')]","date");
	 			return this;}
	 		  	
	 		  	
	 	//Comment box > Litigation > Exchange of evidence
	 	    public CreateRFPSOWPage2 LitigationExchangeCmts(String LitigationExchangeComments) throws InterruptedException {
	 		  	type("//*[@name='scope_of_work[0].litigation.exchange_evidence.comment']", LitigationExchangeComments , "Exchange of evidence");	
	 		  	return this;} 
	 		
	 		
	 		
	 		
	 		//check Box > Litigation > Pre trial 
	 		public CreateRFPSOWPage2 checkLitigationPreTrial() throws InterruptedException {
	 		  	check("//*[@name='scope_of_work[0].litigation.pre_trial.value']", "Pre trial ");
	 		  	return this;}
	 		
	 		
	 	// Litigation > Pre trial  > Expected completion date (optional)
	 	    public CreateRFPSOWPage2 LitigationPreTrialDate() throws InterruptedException {
	 			click("(//input[@name='scope_of_work[0].litigation.pre_trial.dt'])", "Pre trial ");
	 			click("//button[contains(@class,'MuiPickersDay-dayWithMargin MuiPickersDay-today')]","date");
	 			return this;}
	 		  	
	 		  	
	 	//Comment box > Litigation > Pre trial 
	 	    public CreateRFPSOWPage2 LitigationPreTrialCmts(String LitigationPreTrialComments) throws InterruptedException {
	 		  	type("//*[@name='scope_of_work[0].litigation.pre_trial.comment']", LitigationPreTrialComments , "Pre trial ");	
	 		  	return this;} 
	 	
		 
	 		//check Box > Litigation > Trial
	 		public CreateRFPSOWPage2 checkLitigationTrial() throws InterruptedException {
	 		  	check("//*[@name='scope_of_work[0].litigation.trial.value']", "Trial ");
	 		  	return this;}
	 		
	 		
	 	// Litigation > Trial > Expected completion date (optional)
	 	    public CreateRFPSOWPage2 LitigationTrialDate() throws InterruptedException {
	 			click("(//input[@name='scope_of_work[0].litigation.trial.dt'])", "Trial ");
	 			click("//button[contains(@class,'MuiPickersDay-dayWithMargin MuiPickersDay-today')]","date");
	 			return this;}
	 		  	
	 		  	
	 	//Comment box > Litigation > Trial 
	 	    public CreateRFPSOWPage2 LitigationTrialCmts(String LitigationTrialComments) throws InterruptedException {
	 		  	type("//*[@name='scope_of_work[0].litigation.trial.comment']", LitigationTrialComments , "Trial ");	
	 		  	return this;} 
	 		
	 		
	 		//check Box > Litigation > Settlement
	 		public CreateRFPSOWPage2 checkLitigationSettlement() throws InterruptedException {
	 		  	check("//*[@name='scope_of_work[0].litigation.settlement.value']", "Settlement ");
	 		  	return this;}
	 		
	 		
	 	// Litigation > Settlement > Expected completion date (optional)
	 	    public CreateRFPSOWPage2 LitigationSettlementDate() throws InterruptedException {
	 			click("(//input[@name='scope_of_work[0].litigation.settlement.dt'])", "Settlement ");
	 			click("//button[contains(@class,'MuiPickersDay-dayWithMargin MuiPickersDay-today')]","date");
	 			return this;}
	 		  		
	
	 	//Comment box > Litigation > Settlement 
	 	    public CreateRFPSOWPage2 LitigationSettlementCmts(String LitigationSettlementComments) throws InterruptedException {
	 		  	type("//*[@name='scope_of_work[0].litigation.settlement.comment']", LitigationSettlementComments , "Settlement ");	
	 		  	return this;} 
	 		
	 		
				 
	 		
	 		//check Box > Litigation > Appeal	
	 		public CreateRFPSOWPage2 checkLitigationAppeal() throws InterruptedException {
	 		  	check("//*[@name='scope_of_work[0].litigation.appeal.value']", "Appeal ");
	 		  	return this;}
	 		
	 		
	 		// Litigation > Appeal > Expected completion date (optional)
	 	    public CreateRFPSOWPage2 LitigationAppealDate() throws InterruptedException {
	 			click("(//input[@name='scope_of_work[0].litigation.appeal.dt'])", "Appeal");
	 			click("//button[contains(@class,'MuiPickersDay-dayWithMargin MuiPickersDay-today')]","date");
	 			return this;}
	 		  		
	
	 	//Comment box > Litigation > Appeal 
	 	    public CreateRFPSOWPage2 LitigationAppealCmts(String LitigationAppealComments) throws InterruptedException {
	 		  	type("//*[@name='scope_of_work[0].litigation.appeal.comment']", LitigationAppealComments , "Appeal ");	
	 		  	return this;} 
	 		
	 		
	 		//check Box > Litigation > Enforcement
	 		public CreateRFPSOWPage2 checkLitigationEnforcement() throws InterruptedException {
	 		  	check("//*[@name='scope_of_work[0].litigation.enforcement.value']", "Enforcement ");
	 		  	return this;}
	 		
	 		
	 	// Litigation > Enforcement > Expected completion date (optional)
	 	    public CreateRFPSOWPage2 LitigationEnforcementDate() throws InterruptedException {
	 			click("(//input[@name='scope_of_work[0].litigation.enforcement.dt'])", "Enforcement");
	 			click("//button[contains(@class,'MuiPickersDay-dayWithMargin MuiPickersDay-today')]","date");
	 			return this;}
	 		  		
	
	 	//Comment box > Litigation > Enforcement
	 	    public CreateRFPSOWPage2 LitigationEnforcementCmts(String LitigationEnforcementComments) throws InterruptedException {
	 		  	type("//*[@name='scope_of_work[0].litigation.enforcement.comment']", LitigationEnforcementComments , "Enforcement ");	
	 		  	return this;} 
	 		
	 		 
	 		//check Box > Litigation > Other
	 		public CreateRFPSOWPage2 checkLitigationOther() throws InterruptedException {
	 		  	check("//*[@name='scope_of_work[0].litigation.other.value']", "Other ");
	 		  	return this;}
	 		
	 		
	 	// Litigation > Other > Expected completion date (optional)
	 	    public CreateRFPSOWPage2 LitigationOtherDate() throws InterruptedException {
	 			click("(//input[@name='scope_of_work[0].litigation.other.dt'])", "Other");
	 			click("//button[contains(@class,'MuiPickersDay-dayWithMargin MuiPickersDay-today')]","date");
	 			return this;}
	 		  		
	
	 	//Comment box > Litigation > Other 
	 	    public CreateRFPSOWPage2 LitigationOtherCmts(String LitigationOtherComments) throws InterruptedException {
	 		  	type("//*[@name='scope_of_work[0].litigation.other.comment']", LitigationOtherComments , "Other ");	
	 		  	return this;} 
	 		
	 	
	 	 //Global Comment box >   Litigation
	 	   public CreateRFPSOWPage2 GBLLitigationCmts(String GBLLitigationComments) throws InterruptedException {
	 		  	type("//*[@name='scope_of_work[0].litigation.comment']", GBLLitigationComments , "Global Litigation Comments ");	
	 		  	return this;}  
	 	    
	 		
	 		
  	//13.-------------------------------------------------------------> Arbitration <-------------------------------------------------------------------------------------
  	
		//Drop Down Scope -> Arbitration
		public CreateRFPSOWPage2 selectScopeArbitration() throws InterruptedException {
			click("//div[@id='mui-component-select-scope_of_work[0].scope_of_work_id']","Arbitration");
			click("//li[text()='Arbitration']" , "Arbitration");
			return this;}

		
		//check Box > Arbitration > Investigation phase
		public CreateRFPSOWPage2 checkArbitrationInvestigation() throws InterruptedException {
 		  	check("//*[@name='scope_of_work[0].arbitration.investigation_phase.value']", " Investigation phase ");
 		  	return this;}
		
		
		// Arbitration > Investigation phase > Expected completion date (optional)
 	    public CreateRFPSOWPage2 ArbitrationInvestigationDate() throws InterruptedException {
 			click("(//input[@name='scope_of_work[0].arbitration.investigation_phase.dt'])", "Investigation phase");
 			click("//button[contains(@class,'MuiPickersDay-dayWithMargin MuiPickersDay-today')]","date");
 			return this;}
 		  		

 	    //Comment box > Arbitration > Investigation phase
 	    public CreateRFPSOWPage2 ArbitrationInvestigationCmts(String ArbitrationInvestigationComments) throws InterruptedException {
 		  	type("//*[@name='scope_of_work[0].arbitration.investigation_phase.comment']", ArbitrationInvestigationComments , " Investigation phase ");	
 		  	return this;} 
		
		
		//check Box > Arbitration > Request for arbitration/answer/counterclaims
		public CreateRFPSOWPage2 checkArbitrationCounterClaims() throws InterruptedException {
 		  	check("//*[@name='scope_of_work[0].arbitration.request_for_arbitration.value']", " Request for arbitration/answer/counterclaims ");
 		  	return this;}

		
		// Arbitration > Request for arbitration/answer/counterclaims > Expected completion date (optional)
 	    public CreateRFPSOWPage2 ArbitrationCounterClaimsDate() throws InterruptedException {
 			click("(//input[@name='scope_of_work[0].arbitration.request_for_arbitration.dt'])", "Request for arbitration");
 			click("//button[contains(@class,'MuiPickersDay-dayWithMargin MuiPickersDay-today')]","date");
 			return this;}
 		  		

 	    //Comment box > Arbitration > Request for arbitration/answer/counterclaims
 	    public CreateRFPSOWPage2 ArbitrationCounterClaimsCmts(String ArbitrationCounterClaimsComments) throws InterruptedException {
 		  	type("//*[@name='scope_of_work[0].arbitration.request_for_arbitration.comment']", ArbitrationCounterClaimsComments , " Request for arbitration ");	
 		  	return this;} 
		
		
		//check Box > Arbitration > Initial memoranda
		public CreateRFPSOWPage2 checkArbitrationInitialMemoranda() throws InterruptedException {
 		  	check("//*[@name='scope_of_work[0].arbitration.initial_memoranda.value']", " Initial memoranda ");
 		  	return this;}
		
		
		// Arbitration > Initial memoranda > Expected completion date (optional)
 	    public CreateRFPSOWPage2 ArbitrationInitialMemorandaDate() throws InterruptedException {
 			click("(//input[@name='scope_of_work[0].arbitration.initial_memoranda.dt'])", "Initial memoranda");
 			click("//button[contains(@class,'MuiPickersDay-dayWithMargin MuiPickersDay-today')]","date");
 			return this;}
 		  		

 	    //Comment box > Arbitration > Initial memoranda
 	    public CreateRFPSOWPage2 ArbitrationInitialMemorandaCmts(String ArbitrationInitialMemorandaComments) throws InterruptedException {
 		  	type("//*[@name='scope_of_work[0].arbitration.initial_memoranda.comment']", ArbitrationInitialMemorandaComments , "Initial memoranda");	
 		  	return this;} 
		
		
		//check Box > Arbitration >  Exchange of evidence
		public CreateRFPSOWPage2 checkArbitrationExchangeOfEvidence() throws InterruptedException {
 		  	check("//*[@name='scope_of_work[0].arbitration.exchange_evidence.value']", " Exchange of evidence ");
 		  	return this;}
		
		
		// Arbitration > Exchange of evidence > Expected completion date (optional)
 	    public CreateRFPSOWPage2 ArbitrationExchangeOfEvidenceDate() throws InterruptedException {
 			click("(//input[@name='scope_of_work[0].arbitration.exchange_evidence.dt'])", "Exchange of evidence");
 			click("//button[contains(@class,'MuiPickersDay-dayWithMargin MuiPickersDay-today')]","date");
 			return this;}
 		  		

 	    //Comment box > Arbitration > Exchange of evidence
 	    public CreateRFPSOWPage2 ArbitrationExchangeOfEvidenceCmts(String ArbitrationExchangeOfEvidenceComments) throws InterruptedException {
 		  	type("//*[@name='scope_of_work[0].arbitration.exchange_evidence.comment']", ArbitrationExchangeOfEvidenceComments , "Exchange of evidence");	
 		  	return this;} 
		
			
		//check Box > Arbitration > Additional memoranda
		public CreateRFPSOWPage2 checkArbitrationMemoranda() throws InterruptedException {
 		  	check("//*[@name='scope_of_work[0].arbitration.additional_memoranda.value']", " Additional memoranda ");
 		  	return this;}
		
		
		// Arbitration > Additional memoranda > Expected completion date (optional)
 	    public CreateRFPSOWPage2 ArbitrationMemorandaDate() throws InterruptedException {
 			click("(//input[@name='scope_of_work[0].arbitration.additional_memoranda.dt'])", "Additional memoranda");
 			click("//button[contains(@class,'MuiPickersDay-dayWithMargin MuiPickersDay-today')]","date");
 			return this;}
 		  		

 	    //Comment box > Arbitration > Additional memoranda
 	    public CreateRFPSOWPage2 ArbitrationMemorandaCmts(String ArbitrationMemorandaComments) throws InterruptedException {
 		  	type("//*[@name='scope_of_work[0].arbitration.additional_memoranda.comment']", ArbitrationMemorandaComments , "Additional memoranda");	
 		  	return this;} 
		
		
		
		//check Box > Arbitration >	Hearing	
		public CreateRFPSOWPage2 checkArbitrationHearing() throws InterruptedException {
 		  	check("//*[@name='scope_of_work[0].arbitration.hearing.value']", " Hearing ");
 		  	return this;}
		
		
		// Arbitration > Hearing > Expected completion date (optional)
 	    public CreateRFPSOWPage2 ArbitrationHearingDate() throws InterruptedException {
 			click("(//input[@name='scope_of_work[0].arbitration.hearing.dt'])", "Hearing");
 			click("//button[contains(@class,'MuiPickersDay-dayWithMargin MuiPickersDay-today')]","date");
 			return this;}
 		  		

 	    //Comment box > Arbitration > Hearing
 	    public CreateRFPSOWPage2 ArbitrationHearingCmts(String ArbitrationHearingComments) throws InterruptedException {
 		  	type("//*[@name='scope_of_work[0].arbitration.hearing.comment']", ArbitrationHearingComments , "Hearing");	
 		  	return this;} 
 	    
				 
		//check Box > Arbitration >	Post-hearing memoranda 
		public CreateRFPSOWPage2 checkArbitrationPostHearing() throws InterruptedException {
 		  	check("//*[@name='scope_of_work[0].arbitration.post_hearing_memoranda.value']", " Post-hearing memoranda ");
 		  	return this;}
		
		
		// Arbitration > Post-hearing memoranda  > Expected completion date (optional)
 	    public CreateRFPSOWPage2 ArbitrationPostHearingDate() throws InterruptedException {
 			click("(//input[@name='scope_of_work[0].arbitration.post_hearing_memoranda.dt'])", "Post-hearing memoranda ");
 			click("//button[contains(@class,'MuiPickersDay-dayWithMargin MuiPickersDay-today')]","date");
 			return this;}
 		  		

 	    //Comment box > Arbitration > Post-hearing memoranda 
 	    public CreateRFPSOWPage2 ArbitrationPostHearingCmts(String ArbitrationPostHearingComments) throws InterruptedException {
 		  	type("//*[@name='scope_of_work[0].arbitration.post_hearing_memoranda.comment']", ArbitrationPostHearingComments , "Post-hearing memoranda ");	
 		  	return this;} 
		
			 
		//check Box > Arbitration >	Settlement	 
		public CreateRFPSOWPage2 checkArbitrationSettlement() throws InterruptedException {
 		  	check("//*[@name='scope_of_work[0].arbitration.settlement.value']", " Settlement ");
 		  	return this;}
		
		
		// Arbitration > Settlement  > Expected completion date (optional)
 	    public CreateRFPSOWPage2 ArbitrationSettlementDate() throws InterruptedException {
 			click("(//input[@name='scope_of_work[0].arbitration.settlement.dt'])", " Settlement ");
 			click("//button[contains(@class,'MuiPickersDay-dayWithMargin MuiPickersDay-today')]","date");
 			return this;}
 		  		

 	    //Comment box > Arbitration > Settlement 
 	    public CreateRFPSOWPage2 ArbitrationSettlementCmts(String ArbitrationSettlementComments) throws InterruptedException {
 		  	type("//*[@name='scope_of_work[0].arbitration.settlement.comment']", ArbitrationSettlementComments , " Settlement ");	
 		  	return this;}
		
						 
		//check Box > Arbitration >	Appeal
		public CreateRFPSOWPage2 checkArbitrationAppeal() throws InterruptedException {
 		  	check("//*[@name='scope_of_work[0].arbitration.appeal.value']", " Appeal ");
 		  	return this;}
		
		// Arbitration > Appeal  > Expected completion date (optional)
 	    public CreateRFPSOWPage2 ArbitrationAppealDate() throws InterruptedException {
 			click("(//input[@name='scope_of_work[0].arbitration.appeal.dt'])", " Appeal ");
 			click("//button[contains(@class,'MuiPickersDay-dayWithMargin MuiPickersDay-today')]","date");
 			return this;}
 		  		

 	    //Comment box > Arbitration > Appeal
 	    public CreateRFPSOWPage2 ArbitrationAppealCmts(String ArbitrationAppealComments) throws InterruptedException {
 		  	type("//*[@name='scope_of_work[0].arbitration.appeal.comment']", ArbitrationAppealComments , " Appeal ");	
 		  	return this;}
		
		
		
		//check Box > Arbitration > Enforcement/annulment
		public CreateRFPSOWPage2 checkArbitrationEnforcement() throws InterruptedException {
 		  	check("//*[@name='scope_of_work[0].arbitration.enforcement_annulment.value']", " Enforcement/annulment ");
 		  	return this;}
		
		// Arbitration > Enforcement/annulment  > Expected completion date (optional)
 	    public CreateRFPSOWPage2 ArbitrationEnforcementDate() throws InterruptedException {
 			click("(//input[@name='scope_of_work[0].arbitration.enforcement_annulment.dt'])", " Enforcement/annulment ");
 			click("//button[contains(@class,'MuiPickersDay-dayWithMargin MuiPickersDay-today')]","date");
 			return this;}
 		  		

 	    //Comment box > Arbitration > Enforcement/annulment
 	    public CreateRFPSOWPage2 ArbitrationEnforcementCmts(String ArbitrationEnforcementComments) throws InterruptedException {
 		  	type("//*[@name='scope_of_work[0].arbitration.enforcement_annulment.comment']", ArbitrationEnforcementComments , " Enforcement/annulment ");	
 		  	return this;}
		
		
		//check Box > Arbitration > Other
		public CreateRFPSOWPage2 checkArbitrationOther() throws InterruptedException {
 		  	check("//*[@name='scope_of_work[0].arbitration.other.value']", " Arbitration Other ");
 		  	return this;}
		
		
		// Arbitration > Other  > Expected completion date (optional)
 	    public CreateRFPSOWPage2 ArbitrationOtherDate() throws InterruptedException {
 			click("(//input[@name='scope_of_work[0].arbitration.other.dt'])", " Other ");
 			click("//button[contains(@class,'MuiPickersDay-dayWithMargin MuiPickersDay-today')]","date");
 			return this;}
 		  		

 	    //Comment box > Arbitration > Other
 	    public CreateRFPSOWPage2 ArbitrationOtherCmts(String ArbitrationOtherComments) throws InterruptedException {
 		  	type("//*[@name='scope_of_work[0].arbitration.other.comment']", ArbitrationOtherComments , " Other ");	
 		  	return this;}
		
		
		
		
  	//14.-------------------------------------------------------------> Restructuring <-------------------------------------------------------------------------------------
  	
	       //Drop Down Scope -> Restructuring
	       public CreateRFPSOWPage2 selectScopeRestructuring() throws InterruptedException {
			click("//div[@id='mui-component-select-scope_of_work[0].scope_of_work_id']","Restructuring");
			click("//li[text()='Restructuring']" , "Restructuring");
			return this;}					 
			
	       
	       
	     //Select Drop Down > Restructuring >   Role in Restructuring matter > Creditors
	       public CreateRFPSOWPage2 selectScopeRoleInRestructuring() throws InterruptedException {
				click("//div[@id='mui-component-select-scope_of_work[0].restructuring.role_in_restructuring']","Role in Restructuring matter");
				click("//li[text()='Creditors']" , "Role in Restructuring matter");
				return this;}
	       
	       
	     //check Box > Restructuring > Rescue securitisations
	     public CreateRFPSOWPage2 checkRestructuringRescue() throws InterruptedException {
	    	 check("//*[@name='scope_of_work[0].restructuring.rescue_securitisations.value']", "Rescue securitisations");
	 		 return this;} 
	       
	     // Restructuring > Rescue securitisations> Expected completion date (optional)
	 	    public CreateRFPSOWPage2 RestructuringRescueDate() throws InterruptedException {
	 			click("(//input[@name='scope_of_work[0].restructuring.rescue_securitisations.dt'])", " Other ");
	 			click("//button[contains(@class,'MuiPickersDay-dayWithMargin MuiPickersDay-today')]","date");
	 			return this;}
	 		  		

	 	    //Comment box > Restructuring > Rescue securitisations
	 	    public CreateRFPSOWPage2 RestructuringRescueCmts(String RestructuringRescueComments) throws InterruptedException {
	 		  	type("//*[@name='scope_of_work[0].restructuring.rescue_securitisations.comment']", RestructuringRescueComments , " Other ");	
	 		  	return this;}
	     
	     
	     //check Box > Restructuring > Moratorium/Rescheduling of debts
	     public CreateRFPSOWPage2 checkRestructuringMoratorium() throws InterruptedException {
	    	 check("//*[@name='scope_of_work[0].restructuring.moratorium_debts.value']", "Moratorium/Rescheduling of debts");
	 		 return this;}  
	       
	     // Restructuring > Moratorium/Rescheduling of debts> Expected completion date (optional)
	 	 public CreateRFPSOWPage2 RestructuringMoratoriumDate() throws InterruptedException {
	 			click("(//input[@name='scope_of_work[0].restructuring.moratorium_debts.dt'])", " Moratorium/Rescheduling of debts ");
	 			click("//button[contains(@class,'MuiPickersDay-dayWithMargin MuiPickersDay-today')]","date");
	 			return this;}
	 		  		

	 	    //Comment box > Restructuring > Moratorium/Rescheduling of debts
	 	    public CreateRFPSOWPage2 RestructuringMoratoriumCmts(String RestructuringMoratoriumComments) throws InterruptedException {
	 		  	type("//*[@name='scope_of_work[0].restructuring.moratorium_debts.comment']", RestructuringMoratoriumComments , " Moratorium/Rescheduling of debts ");	
	 		  	return this;}   
	     
	    
	     //check Box > Restructuring > Debt to equity swaps
	     public CreateRFPSOWPage2 checkRestructuringEquitySwaps() throws InterruptedException {
	    	 check("//*[@name='scope_of_work[0].restructuring.debt_equity_swaps.value']", "Debt to equity swaps");
	 		 return this;} 
	     
	     
	     // Restructuring > Debt to equity swaps > Expected completion date (optional)
	 	 public CreateRFPSOWPage2 RestructuringEquitySwapsDate() throws InterruptedException {
	 			click("(//input[@name='scope_of_work[0].restructuring.debt_equity_swaps.dt'])", " Debt to equity swaps ");
	 			click("//button[contains(@class,'MuiPickersDay-dayWithMargin MuiPickersDay-today')]","date");
	 			return this;}
	 		  		

	 	    //Comment box > Restructuring > Debt to equity swaps
	 	    public CreateRFPSOWPage2 RestructuringEquitySwapsCmts(String RestructuringEquitySwapsComments) throws InterruptedException {
	 		  	type("//*[@name='scope_of_work[0].restructuring.debt_equity_swaps.comment']", RestructuringEquitySwapsComments , "Debt to equity swaps");	
	 		  	return this;}  
	     
	       
	     //check Box > Restructuring > Corporate restructurings (eg. schemes of arrangements)
	     public CreateRFPSOWPage2 checkRestructuringCorporateRestructurings() throws InterruptedException {
	    	 check("//*[@name='scope_of_work[0].restructuring.corporate_restructurings.value']", "Corporate restructurings");
	 		 return this;} 
	       
	       
	  // Restructuring > Corporate restructurings (eg. schemes of arrangements) > Expected completion date (optional)
	 	 public CreateRFPSOWPage2 RestructuringCorporateRestructuringsDate() throws InterruptedException {
	 			click("(//input[@name='scope_of_work[0].restructuring.corporate_restructurings.dt'])", " Corporate restructurings ");
	 			click("//button[contains(@class,'MuiPickersDay-dayWithMargin MuiPickersDay-today')]","date");
	 			return this;}
	 		  		

	 	    //Comment box > Restructuring >  Corporate restructurings (eg. schemes of arrangements)
	 	    public CreateRFPSOWPage2 RestructuringCorporateRestructuringsCmts(String RestructuringCorporateRestructuringsComments) throws InterruptedException {
	 		  	type("//*[@name='scope_of_work[0].restructuring.corporate_restructurings.comment']", RestructuringCorporateRestructuringsComments , "Corporate restructurings");	
	 		  	return this;}  
	     
	     
	     //check Box > Restructuring > Corporate finance transactions restructuring (e.g. buy-outs, M&A, rights issues)
	     public CreateRFPSOWPage2 checkRestructuringCorporateFinance() throws InterruptedException {
	    	 check("//*[@name='scope_of_work[0].restructuring.corporate_finance_transactions.value']", "Corporate finance transactions restructuring");
	 		 return this;}  
	       
	      
	  // Restructuring > Corporate finance transactions restructuring (e.g. buy-outs, M&A, rights issues) > Expected completion date (optional)
	 	 public CreateRFPSOWPage2 RestructuringCorporateFinanceDate() throws InterruptedException {
	 			click("(//input[@name='scope_of_work[0].restructuring.corporate_finance_transactions.dt'])", " Corporate finance transactions ");
	 			click("//button[contains(@class,'MuiPickersDay-dayWithMargin MuiPickersDay-today')]","date");
	 			return this;}
	 		  		

	 	    //Comment box > Restructuring >  Corporate finance transactions restructuring (e.g. buy-outs, M&A, rights issues)
	 	    public CreateRFPSOWPage2 RestructuringCorporateFinanceCmts(String RestructuringCorporateFinanceComments) throws InterruptedException {
	 		  	type("//*[@name='scope_of_work[0].restructuring.corporate_finance_transactions.comment']", RestructuringCorporateFinanceComments , "Corporate finance transactions");	
	 		  	return this;} 
	     
	     
	     
	     //check Box > Restructuring >  Structured receiverships
	     public CreateRFPSOWPage2 checkRestructuringReceiverships() throws InterruptedException {
	    	 check("//*[@name='scope_of_work[0].restructuring.structured_receiverships.value']", "Structured receiverships");
	 		 return this;}  
	       
	       
	     // Restructuring > Structured receiverships > Expected completion date (optional)
	 	 public CreateRFPSOWPage2 RestructuringReceivershipsDate() throws InterruptedException {
	 			click("(//input[@name='scope_of_work[0].restructuring.structured_receiverships.dt'])", " Structured receiverships ");
	 			click("//button[contains(@class,'MuiPickersDay-dayWithMargin MuiPickersDay-today')]","date");
	 			return this;}
	 		  		

	 	    //Comment box > Restructuring >  Structured receiverships
	 	    public CreateRFPSOWPage2 RestructuringReceivershipsCmts(String RestructuringReceivershipsComments) throws InterruptedException {
	 		  	type("//*[@name='scope_of_work[0].restructuring.structured_receiverships.comment']", RestructuringReceivershipsComments , "Structured receiverships");	
	 		  	return this;} 
	     
	     
	     //check Box > Restructuring >  Insolvency processes (formal cram down processes, pre-pack administrations or bankruptcy sales and purchases)
	     public CreateRFPSOWPage2 checkRestructuringInsolvency() throws InterruptedException {
	    	 check("//*[@name='scope_of_work[0].restructuring.insolvency_processes.value']", "Insolvency processes");
	 		 return this;}  
	     
	  // Restructuring > Insolvency processes (formal ) > Expected completion date (optional)
	 	 public CreateRFPSOWPage2 RestructuringInsolvencyDate() throws InterruptedException {
	 			click("(//input[@name='scope_of_work[0].restructuring.insolvency_processes.dt'])", " Insolvency processes  ");
	 			click("//button[contains(@class,'MuiPickersDay-dayWithMargin MuiPickersDay-today')]","date");
	 			return this;}
	 		  		

	  //Comment box > Restructuring >  Insolvency processes (formal )
	 	public CreateRFPSOWPage2 RestructuringInsolvencyCmts(String RestructuringInsolvencyComments) throws InterruptedException {
	 		type("//*[@name='scope_of_work[0].restructuring.insolvency_processes.comment']", RestructuringInsolvencyComments , "Insolvency processes ");	
	     	return this;} 
	     
	     
	       
	     //check Box > Restructuring >  Contingency planning
	     public CreateRFPSOWPage2 checkRestructuringContingency() throws InterruptedException {
	    	 check("//*[@name='scope_of_work[0].restructuring.contingency_planning.value']", "Contingency planning");
	 		 return this;}  
	      
	     
	  // Restructuring > Contingency planning > Expected completion date (optional)
	 	 public CreateRFPSOWPage2 RestructuringContingencyDate() throws InterruptedException {
	 			click("(//input[@name='scope_of_work[0].restructuring.contingency_planning.dt'])", " Contingency planning ");
	 			click("//button[contains(@class,'MuiPickersDay-dayWithMargin MuiPickersDay-today')]","date");
	 			return this;}
	 		  		

	 //Comment box > Restructuring >  Contingency planning
	 	public CreateRFPSOWPage2 RestructuringContingencyCmts(String RestructuringContingencyComments) throws InterruptedException {
	 		  	type("//*[@name='scope_of_work[0].restructuring.contingency_planning.comment']", RestructuringContingencyComments , "Contingency planning");	
	 		  	return this;} 
	     
	     
	     //check Box > Restructuring >  Enforcing security
	     public CreateRFPSOWPage2 checkRestructuringEnforcing() throws InterruptedException {
	    	 check("//*[@name='scope_of_work[0].restructuring.enforcing_security.value']", "Enforcing security");
	 		 return this;}  
	       
	      
	  // Restructuring > Enforcing security > Expected completion date (optional)
	 	 public CreateRFPSOWPage2 RestructuringEnforcingDate() throws InterruptedException {
	 			click("(//input[@name='scope_of_work[0].restructuring.enforcing_security.dt'])", " Enforcing security ");
	 			click("//button[contains(@class,'MuiPickersDay-dayWithMargin MuiPickersDay-today')]","date");
	 			return this;}
	 		  		

	 //Comment box > Restructuring >  Enforcing security
	 	public CreateRFPSOWPage2 RestructuringEnforcingCmts(String RestructuringEnforcingComments) throws InterruptedException {
	 		  	type("//*[@name='scope_of_work[0].restructuring.enforcing_security.comment']", RestructuringEnforcingComments , "Enforcing security");	
	 		  	return this;} 
	     
	     
	       
	     //check Box > Restructuring >  Distressed debt trading
	     public CreateRFPSOWPage2 checkRestructuringDistressed() throws InterruptedException {
	    	 check("//*[@name='scope_of_work[0].restructuring.distressed_debt_trading.value']", "Distressed debt trading");
	 		 return this;}  
	       
	      
	  // Restructuring > Distressed debt trading > Expected completion date (optional)
	 	 public CreateRFPSOWPage2 RestructuringDistressedDate() throws InterruptedException {
	 			click("(//input[@name='scope_of_work[0].restructuring.distressed_debt_trading.dt'])", " Distressed debt trading ");
	 			click("//button[contains(@class,'MuiPickersDay-dayWithMargin MuiPickersDay-today')]","date");
	 			return this;}
	 		  		

	 //Comment box > Restructuring >  Distressed debt trading
	 	public CreateRFPSOWPage2 RestructuringDistressedCmts(String RestructuringDistressedComments) throws InterruptedException {
	 		  	type("//*[@name='scope_of_work[0].restructuring.distressed_debt_trading.comment']", RestructuringDistressedComments , "Distressed debt trading");	
	 		  	return this;} 
	     
	     
	       
	       
	     //check Box > Restructuring >  Other	 
	     public CreateRFPSOWPage2 checkRestructuringOther() throws InterruptedException {
	    	 check("//*[@name='scope_of_work[0].restructuring.other.value']", "Restructuring Other");
	 		 return this;} 	 
	     
	     
	  // Restructuring > Other > Expected completion date (optional)
	 	 public CreateRFPSOWPage2 RestructuringOtherDate() throws InterruptedException {
	 			click("(//input[@name='scope_of_work[0].restructuring.other.dt'])", "Restructuring Other ");
	 			click("//button[contains(@class,'MuiPickersDay-dayWithMargin MuiPickersDay-today')]","date");
	 			return this;}
	 		  		

	 //Comment box > Restructuring >  Distressed debt trading
	 	public CreateRFPSOWPage2 RestructuringOtherCmts(String RestructuringOtherComments) throws InterruptedException {
	 		  	type("//*[@name='scope_of_work[0].restructuring.other.comment']", RestructuringOtherComments , "Restructuring Other");	
	 		  	return this;} 
	     
				 
				 
				 
  	//15.-------------------------------------------------------------> Insolvency <-------------------------------------------------------------------------------------
  	
		
		//Drop Down Scope -> Insolvency
		public CreateRFPSOWPage2 selectScopeInsolvency() throws InterruptedException {
			click("//div[@id='mui-component-select-scope_of_work[0].scope_of_work_id']","Insolvency");
			click("//li[text()='Insolvency']" , "Insolvency");
			return this;}				 
				 
 
		//Select Drop Down > Insolvency > Role in Insolvency matter
	       public CreateRFPSOWPage2 selectScopeRoleInInsolvency() throws InterruptedException {
				click("//div[@id='mui-component-select-scope_of_work[0].insolvency.role_in_restructuring']","Role in Insolvency matter");
				click("//li[text()='Creditors']" , " Role in Insolvency matter ");
				return this;}
		
		
		//check Box > Insolvency > Formal insolvencies, both contentious and non-contentious
	      public CreateRFPSOWPage2 checkInsolvencyNonContentious() throws InterruptedException {
		    	 check("//*[@name='scope_of_work[0].insolvency.formal_insolvencies.value']", "Formal insolvencies");
		 		 return this;} 	 
		     
		     
		  // Insolvency > Formal insolvencies, both contentious and non-contentious > Expected completion date (optional)
		 	 public CreateRFPSOWPage2 InsolvencyNonContentiousDate() throws InterruptedException {
		 			click("(//input[@name='scope_of_work[0].insolvency.formal_insolvencies.dt'])", "Formal insolvencies ");
		 			click("//button[contains(@class,'MuiPickersDay-dayWithMargin MuiPickersDay-today')]","date");
		 			return this;}
		 		  		

		 //Comment box > Insolvency >  Formal insolvencies, both contentious and non-contentious
		 	public CreateRFPSOWPage2 InsolvencyNonContentiousCmts(String InsolvencyNonContentiousComments) throws InterruptedException {
		 		  	type("//*[@name='scope_of_work[0].insolvency.formal_insolvencies.comment']", InsolvencyNonContentiousComments , "Formal insolvencies");	
		 		  	return this;} 
		
		
		//check Box > Insolvency > Litigation and dispute resolution (protecting creditor claims, cross border recovery, asset freeze and search operations)
		 	 public CreateRFPSOWPage2 checkInsolvencyLitigation() throws InterruptedException {
		    	 check("//*[@name='scope_of_work[0].insolvency.litigation_dispute_resolution.value']", "Litigation and dispute resolution");
		 		 return this;} 	
		 	 
		 	// Insolvency > Litigation and dispute resolution  > Expected completion date (optional)
		 	 public CreateRFPSOWPage2 InsolvencyLitigationDate() throws InterruptedException {
		 			click("(//input[@name='scope_of_work[0].insolvency.litigation_dispute_resolution.dt'])", "Litigation and dispute resolution");
		 			click("//button[contains(@class,'MuiPickersDay-dayWithMargin MuiPickersDay-today')]","date");
		 			return this;}
		 		  		

		 //Comment box > Insolvency >  Litigation and dispute resolution 
		 	public CreateRFPSOWPage2 InsolvencyLitigationCmts(String InsolvencyLitigationComments) throws InterruptedException {
		 		  	type("//*[@name='scope_of_work[0].insolvency.litigation_dispute_resolution.comment']", InsolvencyLitigationComments , "Litigation and dispute resolution ");	
		 		  	return this;} 
			 
		 	 	
		//check Box > Insolvency > Purchase and sale of claims
		 public CreateRFPSOWPage2 checkInsolvencySaleOfClaims() throws InterruptedException {
		     check("//*[@name='scope_of_work[0].insolvency.purchase_sale_claims.value']", "Purchase and sale of claims");
		 	 return this;} 
		
		
		// Insolvency > Purchase and sale of claims  > Expected completion date (optional)
	 	 public CreateRFPSOWPage2 InsolvencySaleOfClaimsDate() throws InterruptedException {
	 			click("(//input[@name='scope_of_work[0].insolvency.purchase_sale_claims.dt'])", "Purchase and sale of claims");
	 			click("//button[contains(@class,'MuiPickersDay-dayWithMargin MuiPickersDay-today')]","date");
	 			return this;}
	 		  		

	 //Comment box > Insolvency >  Purchase and sale of claims
	 	public CreateRFPSOWPage2 InsolvencySaleOfClaimsCmts(String InsolvencySaleOfClaimsComments) throws InterruptedException {
	 		  	type("//*[@name='scope_of_work[0].insolvency.purchase_sale_claims.comment']", InsolvencySaleOfClaimsComments , "Purchase and sale of claims");	
	 		  	return this;} 
		 
		 
		
		//check Box > Insolvency > Advice in relation to avoidance actions
		 public CreateRFPSOWPage2 checkInsolvencyAdviceInRelation() throws InterruptedException {
		     check("//*[@name='scope_of_work[0].insolvency.advice_in_relation.value']", "Advice in relation to avoidance actions");
		 	 return this;}
		
		
		// Insolvency > Advice in relation to avoidance actions  > Expected completion date (optional)
	 	 public CreateRFPSOWPage2 InsolvencyAdviceInRelationDate() throws InterruptedException {
	 			click("(//input[@name='scope_of_work[0].insolvency.advice_in_relation.dt'])", "Advice in relation to avoidance actions");
	 			click("//button[contains(@class,'MuiPickersDay-dayWithMargin MuiPickersDay-today')]","date");
	 			return this;}
	 		  		

	 //Comment box > Insolvency >  Advice in relation to avoidance actions
	 	public CreateRFPSOWPage2 InsolvencyAdviceInRelationCmts(String InsolvencyAdviceInRelationComments) throws InterruptedException {
	 		  	type("//*[@name='scope_of_work[0].insolvency.advice_in_relation.comment']", InsolvencyAdviceInRelationComments , "Advice in relation to avoidance actions");	
	 		  	return this;} 
		 
		
		//check Box > Insolvency > Advice on regulatory, financial, and commercial issues
		 public CreateRFPSOWPage2 checkInsolvencyAdviceOnRegulatory() throws InterruptedException {
		     check("//*[@name='scope_of_work[0].insolvency.advice_on_regulatory.value']", "Advice on regulatory");
		 	 return this;}
		
		      
		 
		// Insolvency > Advice on regulatory, financial, and commercial issues  > Expected completion date (optional)
	 	 public CreateRFPSOWPage2 InsolvencyAdviceOnRegulatoryDate() throws InterruptedException {
	 			click("(//input[@name='scope_of_work[0].insolvency.advice_on_regulatory.dt'])", "Advice on regulatory, financial");
	 			click("//button[contains(@class,'MuiPickersDay-dayWithMargin MuiPickersDay-today')]","date");
	 			return this;}
	 		  		

	 //Comment box > Insolvency > Advice on regulatory, financial, and commercial issues
	 	public CreateRFPSOWPage2 InsolvencyAdviceOnRegulatoryCmts(String InsolvencyAdviceOnRegulatoryComments) throws InterruptedException {
	 		  	type("//*[@name='scope_of_work[0].insolvency.advice_on_regulatory.comment']", InsolvencyAdviceOnRegulatoryComments , "Advice on regulatory, financial");	
	 		  	return this;} 
		
	 	//check Box > Insolvency > Investigations
		 public CreateRFPSOWPage2 checkInsolvencyInvestigations() throws InterruptedException {
		     check("//*[@name='scope_of_work[0].insolvency.investigations.value']", "Investigations");
		 	 return this;}
		 
		 
		// Insolvency > Investigations  > Expected completion date (optional)
	 	 public CreateRFPSOWPage2 InsolvencyInvestigationsDate() throws InterruptedException {
	 			click("(//input[@name='scope_of_work[0].insolvency.investigations.dt'])", "Investigations");
	 			click("//button[contains(@class,'MuiPickersDay-dayWithMargin MuiPickersDay-today')]","date");
	 			return this;}
	 		  		

	 //Comment box > Insolvency > Investigations
	 	public CreateRFPSOWPage2 InsolvencyInvestigationsCmts(String InsolvencyInvestigationsComments) throws InterruptedException {
	 		  	type("//*[@name='scope_of_work[0].insolvency.investigations.comment']", InsolvencyInvestigationsComments , "Investigations");	
	 		  	return this;} 
		 
		 
		//check Box > Insolvency > Fraud & asset tracing
		 public CreateRFPSOWPage2 checkInsolvencyFraud() throws InterruptedException {
		     check("//*[@name='scope_of_work[0].insolvency.fraud_asset_tracing.value']", "Fraud & asset tracing");
		 	 return this;}
		
		
		// Insolvency > Fraud & asset tracing  > Expected completion date (optional)
	 	 public CreateRFPSOWPage2 InsolvencyFraudDate() throws InterruptedException {
	 			click("(//input[@name='scope_of_work[0].insolvency.fraud_asset_tracing.dt'])", "Fraud & asset tracing");
	 			click("//button[contains(@class,'MuiPickersDay-dayWithMargin MuiPickersDay-today')]","date");
	 			return this;}
	 		  		

	 //Comment box > Insolvency > Fraud & asset tracing
	 	public CreateRFPSOWPage2 InsolvencyFraudCmts(String InsolvencyFraudComments) throws InterruptedException {
	 		  	type("//*[@name='scope_of_work[0].insolvency.fraud_asset_tracing.comment']", InsolvencyFraudComments , "Fraud & asset tracing");	
	 		  	return this;} 
		     
		
		
		//check Box > Insolvency > Other
		 public CreateRFPSOWPage2 checkInsolvencyOther() throws InterruptedException {
		     check("//*[@name='scope_of_work[0].insolvency.other.value']", "Insolvency Other");
		 	 return this;}
		
		 
		// Insolvency > Other  > Expected completion date (optional)
	 	 public CreateRFPSOWPage2 InsolvencyOtherDate() throws InterruptedException {
	 			click("(//input[@name='scope_of_work[0].insolvency.other.dt'])", "Insolvency Other");
	 			click("//button[contains(@class,'MuiPickersDay-dayWithMargin MuiPickersDay-today')]","date");
	 			return this;}
	 		  		

	 //Comment box > Insolvency > Other
	 	public CreateRFPSOWPage2 InsolvencyOtherCmts(String InsolvencyOtherComments) throws InterruptedException {
	 		  	type("//*[@name='scope_of_work[0].insolvency.other.comment']", InsolvencyOtherComments , "Insolvency Other");	
	 		  	return this;} 
				 
				 
				 
  	//16.-------------------------------------------------------------> Regulatory <-------------------------------------------------------------------------------------
  	
		//Drop Down Scope -> Regulatory
		public CreateRFPSOWPage2 selectScopeRegulatory() throws InterruptedException {
			click("//div[@id='mui-component-select-scope_of_work[0].scope_of_work_id']","Regulatory");
			click("//li[text()='Regulatory']" , "Regulatory");
			return this;} 
		
		
		//check Box > Scoping Questions
		 public CreateRFPSOWPage2 checkRegulatoryScopingQuestions() throws InterruptedException {
		     check("//*[@name='scope_of_work[0].regulatory.scoping_questions.value']", "Scoping Questions");
		 	 return this;}
		
		
		//Drop Down Scope -> Regulated industry type
				public CreateRFPSOWPage2 selectScopeRegulatoryIndustryType() throws InterruptedException {
					click("//div[@id='mui-component-select-scope_of_work[0].regulatory.scoping_questions.regulated_industry_type']","Regulated industry type");
					click("//li[text()='Financial Services']" , "Financial Services");
					return this;} 
		
		
				//Drop down > List Jurisdiction/Language involved > Country
				public CreateRFPSOWPage2 checkKeyTeamMembersCountry() throws InterruptedException {
					Thread.sleep(2000);
					type("(//div[text()='List Jurisdiction/Language involved']/following::label[text()='Select Country'])","India","country");
					arrowDown();
					arrowDown();
				    enter();
					return this;}
				
				
				//Comment box > Target entities
			 	public CreateRFPSOWPage2 RegulatoryTargetEntitiesCmts(String RegulatoryTargetEntitiesComments) throws InterruptedException {
			 		  	type("//*[@name='scope_of_work[0].regulatory.scoping_questions.number_entities_involved.target_entities']", RegulatoryTargetEntitiesComments , "Target entities");	
			 		  	return this;} 	
				
		
			 	//Comment box > Internal entities
			 	public CreateRFPSOWPage2 RegulatoryInternalEntitiesCmts(String RegulatoryInternalEntitiesComments) throws InterruptedException {
			 		  	type("//*[@name='scope_of_work[0].regulatory.scoping_questions.number_entities_involved.internal_entities']", RegulatoryInternalEntitiesComments , "Internal entities");	
			 		  	return this;} 
		
		 
		// check Box > Regulatory perimeter/scoping analysis
		 public CreateRFPSOWPage2 checkRegulatoryAnalysis() throws InterruptedException {
		     check("//*[@name='scope_of_work[0].regulatory.best_characterises_involved.regulatory_perimeter.value']", "Regulatory perimeter/scoping analysis");
		 	 return this;}
		 
		 
		// Regulatory > Regulatory perimeter/scoping analysis  > Expected completion date (optional)
	 	 public CreateRFPSOWPage2 RegulatoryAnalysisDate() throws InterruptedException {
	 			click("(//input[@name='scope_of_work[0].regulatory.best_characterises_involved.regulatory_perimeter.dt'])", "Regulatory perimeter/scoping analysis");
	 			click("//button[contains(@class,'MuiPickersDay-dayWithMargin MuiPickersDay-today')]","date");
	 			return this;}
	 		  		

	 	// Comment box > Regulatory > Regulatory perimeter/scoping analysis
	 	 public CreateRFPSOWPage2 RegulatoryAnalysisCmts(String RegulatoryAnalysisComments) throws InterruptedException {
	 		  	type("//*[@name='scope_of_work[0].regulatory.best_characterises_involved.regulatory_perimeter.comment']", RegulatoryAnalysisComments , "Regulatory perimeter/scoping analysis");	
	 		  	return this;} 
				 
		 
		//check Box > Licence application preparation and submission
		 public CreateRFPSOWPage2 checkRegulatoryLicence() throws InterruptedException {
		     check("//*[@name='scope_of_work[0].regulatory.best_characterises_involved.licence_application_preparation.value']", "Licence application preparation and submission");
		 	 return this;}
		 
		 
		// Regulatory > Licence application preparation and submission > Expected completion date (optional)
	 	 public CreateRFPSOWPage2 RegulatoryLicenceDate() throws InterruptedException {
	 			click("(//input[@name='scope_of_work[0].regulatory.best_characterises_involved.licence_application_preparation.dt'])", "Licence application preparation and submission");
	 			click("//button[contains(@class,'MuiPickersDay-dayWithMargin MuiPickersDay-today')]","date");
	 			return this;}
	 		  		

	 	// Comment box > Regulatory > Licence application preparation and submission
	 	 public CreateRFPSOWPage2 RegulatoryLicenceCmts(String RegulatoryLicenceComments) throws InterruptedException {
	 		  	type("//*[@name='scope_of_work[0].regulatory.best_characterises_involved.licence_application_preparation.comment']", RegulatoryLicenceComments , "Licence application preparation and submission");	
	 		  	return this;} 
		 
	 	 
	 	//check Box > Ownership/controller approval application(s)
		 public CreateRFPSOWPage2 checkRegulatoryOwnership() throws InterruptedException {
		     check("//*[@name='scope_of_work[0].regulatory.best_characterises_involved.ownership_approval_application.value']", "Ownership/controller approval application(s)");
		 	 return this;}
		 
		 
		// Regulatory > Ownership/controller approval application(s) > Expected completion date (optional)
	 	 public CreateRFPSOWPage2 RegulatoryOwnerShipDate() throws InterruptedException {
	 			click("(//input[@name='scope_of_work[0].regulatory.best_characterises_involved.ownership_approval_application.dt'])", "Ownership/controller approval application(s)");
	 			click("//button[contains(@class,'MuiPickersDay-dayWithMargin MuiPickersDay-today')]","date");
	 			return this;}
	 		  		

	 	// Comment box > Regulatory > Ownership/controller approval application(s)
	 	 public CreateRFPSOWPage2 RegulatoryOwnerShipCmts(String RegulatoryOwnershipComments) throws InterruptedException {
	 		  	type("//*[@name='scope_of_work[0].regulatory.best_characterises_involved.ownership_approval_application.comment']", RegulatoryOwnershipComments , "Ownership/controller approval application(s)");	
	 		  	return this;}  
		 
		 
	 	//check Box > Foreign direct investment analysis
		 public CreateRFPSOWPage2 checkRegulatoryForeign() throws InterruptedException {
		     check("//*[@name='scope_of_work[0].regulatory.best_characterises_involved.foreign_direct_investment.value']", "Foreign direct investment analysis");
		 	 return this;}
		 
		 
		// Regulatory > Foreign direct investment analysis > Expected completion date (optional)
	 	 public CreateRFPSOWPage2 RegulatoryForeignDate() throws InterruptedException {
	 			click("(//input[@name='scope_of_work[0].regulatory.best_characterises_involved.foreign_direct_investment.dt'])", "Foreign direct investment analysis");
	 			click("//button[contains(@class,'MuiPickersDay-dayWithMargin MuiPickersDay-today')]","date");
	 			return this;}
	 		  		

	 	// Comment box > Regulatory > Foreign direct investment analysis
	 	 public CreateRFPSOWPage2 RegulatoryForeignCmts(String RegulatoryForeignComments) throws InterruptedException {
	 		  	type("//*[@name='scope_of_work[0].regulatory.best_characterises_involved.foreign_direct_investment.comment']", RegulatoryForeignComments , "Foreign direct investment analysis");	
	 		  	return this;} 
					 		  		 		  	
		 	
	 	//check Box > Assistance with preparation/submission of regulatory forms (please specify)
		 public CreateRFPSOWPage2 checkRegulatoryAssistance() throws InterruptedException {
		     check("//*[@name='scope_of_work[0].regulatory.best_characterises_involved.preparation_regulatory_forms.value']", "Assistance with preparation");
		 	 return this;}
		 
		 
		// Regulatory > Assistance with preparation/submission of regulatory forms (please specify) > Expected completion date (optional)
	 	 public CreateRFPSOWPage2 RegulatoryAssistanceDate() throws InterruptedException {
	 			click("(//input[@name='scope_of_work[0].regulatory.best_characterises_involved.preparation_regulatory_forms.dt'])", "Assistance with preparation");
	 			click("//button[contains(@class,'MuiPickersDay-dayWithMargin MuiPickersDay-today')]","date");
	 			return this;}
	 		  		

	 	// Comment box > Regulatory > Assistance with preparation/submission of regulatory forms (please specify)
	 	 public CreateRFPSOWPage2 RegulatoryAssistanceCmts(String RegulatoryAssistanceComments) throws InterruptedException {
	 		  	type("//*[@name='scope_of_work[0].regulatory.best_characterises_involved.preparation_regulatory_forms.comment']", RegulatoryAssistanceComments , "Assistance with preparation");	
	 		  	return this;} 
		 
	 	 
	 	//check Box > Regulatory audit of specific business line/function/area (please specify)
		 public CreateRFPSOWPage2 checkRegulatoryLine() throws InterruptedException {
		     check("//*[@name='scope_of_work[0].regulatory.best_characterises_involved.regulatory_audit_business.value']", "Regulatory audit of specific business line");
		 	 return this;}
		
		 
		// Regulatory > Regulatory audit of specific business line/function/area (please specify) > Expected completion date (optional)
	 	 public CreateRFPSOWPage2 RegulatoryLineDate() throws InterruptedException {
	 			click("(//input[@name='scope_of_work[0].regulatory.best_characterises_involved.regulatory_audit_business.dt'])", "Regulatory audit of specific business line");
	 			click("//button[contains(@class,'MuiPickersDay-dayWithMargin MuiPickersDay-today')]","date");
	 			return this;}
	 		  		

	 	// Comment box > Regulatory > Regulatory audit of specific business line/function/area (please specify)
	 	 public CreateRFPSOWPage2 RegulatoryLineCmts(String RegulatoryLineComments) throws InterruptedException {
	 		  	type("//*[@name='scope_of_work[0].regulatory.best_characterises_involved.regulatory_audit_business.comment']", RegulatoryLineComments , "Regulatory audit of specific business line");	
	 		  	return this;} 
		 
	 	 
	 	//check Box > Assistance with internal reorganisation
		 public CreateRFPSOWPage2 checkRegulatoryInternalReorganisation() throws InterruptedException {
		     check("//*[@name='scope_of_work[0].regulatory.best_characterises_involved.assistance_internal_reorganisation.value']", "Assistance with internal reorganisation");
		 	 return this;} 
		 
		// Regulatory > Assistance with internal reorganisation > Expected completion date (optional)
	 	 public CreateRFPSOWPage2 RegulatoryInternalReorganisationDate() throws InterruptedException {
	 			click("(//input[@name='scope_of_work[0].regulatory.best_characterises_involved.assistance_internal_reorganisation.dt'])", "Assistance with internal reorganisation");
	 			click("//button[contains(@class,'MuiPickersDay-dayWithMargin MuiPickersDay-today')]","date");
	 			return this;}
	 		  		

	 	// Comment box > Regulatory > Assistance with internal reorganisation
	 	 public CreateRFPSOWPage2 RegulatoryInternalReorganisationCmts(String RegulatoryInternalReorganisationComments) throws InterruptedException {
	 		  	type("//*[@name='scope_of_work[0].regulatory.best_characterises_involved.assistance_internal_reorganisation.comment']", RegulatoryInternalReorganisationComments , "Assistance with internal reorganisation");	
	 		  	return this;} 
		 
		
		 
		//check Box > Material regulatory outsourcing
		 public CreateRFPSOWPage2 checkRegulatoryOutsourcing() throws InterruptedException {
		     check("//*[@name='scope_of_work[0].regulatory.best_characterises_involved.material_regulatory_outsourcing.value']", "Material regulatory outsourcing");
		 	 return this;} 
		 
		 
		// Regulatory > Material regulatory outsourcing > Expected completion date (optional)
	 	 public CreateRFPSOWPage2 RegulatoryOutsourcingDate() throws InterruptedException {
	 			click("(//input[@name='scope_of_work[0].regulatory.best_characterises_involved.material_regulatory_outsourcing.dt'])", "Material regulatory outsourcing");
	 			click("//button[contains(@class,'MuiPickersDay-dayWithMargin MuiPickersDay-today')]","date");
	 			return this;}
	 		  		

	 	// Comment box > Regulatory > Material regulatory outsourcing
	 	 public CreateRFPSOWPage2 RegulatoryOutsourcingCmts(String RegulatoryOutsourcingComments) throws InterruptedException {
	 		  	type("//*[@name='scope_of_work[0].regulatory.best_characterises_involved.material_regulatory_outsourcing.comment']", RegulatoryOutsourcingComments , "Material regulatory outsourcing");	
	 		  	return this;} 
		  
		 		 
		//check Box > Assistance with regulatory investigation
		 public CreateRFPSOWPage2 checkRegulatoryInvestigation() throws InterruptedException {
		     check("//*[@name='scope_of_work[0].regulatory.best_characterises_involved.assistance_regulatory_investigation.value']", "Assistance with regulatory investigation");
		 	 return this;} 
		 
		// Regulatory > Assistance with regulatory investigation > Expected completion date (optional)
	 	 public CreateRFPSOWPage2 RegulatoryInvestigationDate() throws InterruptedException {
	 			click("(//input[@name='scope_of_work[0].regulatory.best_characterises_involved.assistance_regulatory_investigation.dt'])", "Assistance with regulatory investigation");
	 			click("//button[contains(@class,'MuiPickersDay-dayWithMargin MuiPickersDay-today')]","date");
	 			return this;}
	 		  		

	 	// Comment box > Regulatory > Assistance with regulatory investigation
	 	 public CreateRFPSOWPage2 RegulatoryInvestigationCmts(String RegulatoryInvestigationComments) throws InterruptedException {
	 		  	type("//*[@name='scope_of_work[0].regulatory.best_characterises_involved.assistance_regulatory_investigation.comment']", RegulatoryInvestigationComments , "Assistance with regulatory investigation");	
	 		  	return this;} 
		 
		 
		 
		 
		//check Box > Regulatory Other
		 public CreateRFPSOWPage2 checkRegulatoryOther() throws InterruptedException {
		     check("//*[@name='scope_of_work[0].regulatory.best_characterises_involved.other.value']", "Regulatory Other");
		 	 return this;} 
		 
		 
		// Regulatory > Other > Expected completion date (optional)
	 	 public CreateRFPSOWPage2 RegulatoryOtherDate() throws InterruptedException {
	 			click("(//input[@name='scope_of_work[0].regulatory.best_characterises_involved.other.dt'])", "Regulatory Other");
	 			click("//button[contains(@class,'MuiPickersDay-dayWithMargin MuiPickersDay-today')]","date");
	 			return this;}
	 		  		

	 	// Comment box > Regulatory Other
	 	 public CreateRFPSOWPage2 RegulatoryOtherCmts(String RegulatoryOtherComments) throws InterruptedException {
	 		  	type("//*[@name='scope_of_work[0].regulatory.best_characterises_involved.other.comment']", RegulatoryOtherComments , "Regulatory Other");	
	 		  	return this;} 
		 
		 		  	
		 		  	
  	//17.-------------------------------------------------------------> Tax <-------------------------------------------------------------------------------------
		
		 		  	
		 //Drop Down Scope -> Tax
		public CreateRFPSOWPage2 selectScopeTax() throws InterruptedException {
			click("//div[@id='mui-component-select-scope_of_work[0].scope_of_work_id']","Tax");
			click("//li[text()='Tax']" , "Tax");
			return this;} 
		
		
		// check Box > Tax > Type
		public CreateRFPSOWPage2 checkTaxType() throws InterruptedException {
		  	check("//*[@name='scope_of_work[0].tax.type.value']", "Type");
		  	return this;}
			
		// check Box > Tax > Type > Transactional Tax
		public CreateRFPSOWPage2 checkTaxTypeTransactional() throws InterruptedException {
		  	check("//*[@name='scope_of_work[0].tax.type.transactional_tax.value']", "Transactional Tax");
		  	return this;}
			
				
		// Tax > Type > Transactional Tax > Expected completion date (optional)
		 public CreateRFPSOWPage2 TaxTypeTransactionalDate() throws InterruptedException {
			click("(//input[@name='scope_of_work[0].tax.type.transactional_tax.dt'])", "Transactional Tax");
			click("//button[contains(@class,'MuiPickersDay-dayWithMargin MuiPickersDay-today')]","date");
			return this;}
		  	
		  	
		 //Comment box > Tax > Type > Transactional Tax
		  public CreateRFPSOWPage2 TaxTypeTransactionalCmts(String TaxTypeTransactionalCmts) throws InterruptedException {
		  		type("//*[@name='scope_of_work[0].tax.type.transactional_tax.comment']", TaxTypeTransactionalCmts , "Transactional Tax");	
		  		return this;} 	
		 
		  
		// check Box > Tax > Type > Tax investigation & dispute
		public CreateRFPSOWPage2 checkTaxTypeInvestigation() throws InterruptedException {
			  	check("//*[@name='scope_of_work[0].tax.type.tax_investigation_dispute.value']", "Tax investigation & dispute");
			  	return this;}
				 
		// Tax > Type > Tax investigation & dispute > Expected completion date (optional)
		public CreateRFPSOWPage2 TaxTypeInvestigationDate() throws InterruptedException {
				click("(//input[@name='scope_of_work[0].tax.type.tax_investigation_dispute.dt'])", "date");
				click("//button[contains(@class,'MuiPickersDay-dayWithMargin MuiPickersDay-today')]","date");
				return this;}
			  	
			  	
		//Comment box > Tax > Type > Tax investigation & dispute
		 public CreateRFPSOWPage2 TaxTypeInvestigationCmts(String TaxTypeInvestigationCmts) throws InterruptedException {
			  		type("//*[@name='scope_of_work[0].tax.type.tax_investigation_dispute.comment']", TaxTypeInvestigationCmts , "Tax investigation & dispute Comments");	
			  		return this;}  
		  

		// check Box > Tax > Type >  Transfer pricing
			public CreateRFPSOWPage2 checkTaxTypeTransferPricing() throws InterruptedException {
			  	check("//*[@name='scope_of_work[0].tax.type.transfer_pricing.value']", "Transfer pricing");
			  	return this;}
			
			
			// Tax > Type > Transfer pricing > Expected completion date (optional)
			public CreateRFPSOWPage2 TaxTypeTransferDate() throws InterruptedException {
					click("(//input[@name='scope_of_work[0].tax.type.transfer_pricing.dt'])", "Transfer pricing");
					click("//button[contains(@class,'MuiPickersDay-dayWithMargin MuiPickersDay-today')]","date");
					return this;}
				  	
				  	
			//Comment box > Tax > Type > Transfer pricing
			 public CreateRFPSOWPage2 TaxTypeTransferCmts(String TaxTypeTransferCmts) throws InterruptedException {
				  		type("//*[@name='scope_of_work[0].tax.type.transfer_pricing.comment']", TaxTypeTransferCmts , "Transfer pricing");	
				  		return this;}  	
			
				
		// check Box > Tax > Type >  Indirect tax
			public CreateRFPSOWPage2 checkTaxTypeIndirectTax() throws InterruptedException {
			  	check("//*[@name='scope_of_work[0].tax.type.indirect_tax.value']", "Indirect tax");
			  	return this;}
		  
		  
			// Tax > Type > Indirect tax > Expected completion date (optional)
			public CreateRFPSOWPage2 TaxTypeIndirectDate() throws InterruptedException {
				click("(//input[@name='scope_of_work[0].tax.type.indirect_tax.dt'])", "Indirect tax");
				click("//button[contains(@class,'MuiPickersDay-dayWithMargin MuiPickersDay-today')]","date");
				return this;}
							  	
							  	
			//Comment box > Tax > Type > Indirect tax
			public CreateRFPSOWPage2 TaxTypeIndirectCmts(String TaxTypeIndirectCmts) throws InterruptedException {
				type("//*[@name='scope_of_work[0].tax.type.indirect_tax.comment']", TaxTypeIndirectCmts , "Indirect tax");	
				return this;}  	
						
			
		// check Box > Tax > Type >  Tax planning
		public CreateRFPSOWPage2 checkTaxTypeTaxPlanning() throws InterruptedException {
			 check("//*[@name='scope_of_work[0].tax.type.tax_planning.value']", "Tax planning");
			 return this;}
		  
		  
		// Tax > Type > Tax planning > Expected completion date (optional)
		public CreateRFPSOWPage2 TaxTypeTaxPlanningDate() throws InterruptedException {
			click("(//input[@name='scope_of_work[0].tax.type.tax_planning.dt'])", "Tax planning");
			click("//button[contains(@class,'MuiPickersDay-dayWithMargin MuiPickersDay-today')]","date");
			return this;}
										  	
										  	
		//Comment box > Tax > Type > Tax planning
		public CreateRFPSOWPage2 TaxTypeTaxPlanningCmts(String TaxTypeTaxPlanningCmts) throws InterruptedException {
			type("//*[@name='scope_of_work[0].tax.type.tax_planning.comment']", TaxTypeTaxPlanningCmts , "Tax planning Comments");	
			return this;}  	
										
			 
		// check Box > Tax > Type >  Tax policy
		public CreateRFPSOWPage2 checkTaxTypeTaxPolicy() throws InterruptedException {
			  check("//*[@name='scope_of_work[0].tax.type.tax_policy.value']", "Tax policy");
			  return this;}
			
		
		// Tax > Type > Tax policy > Expected completion date (optional)
		public CreateRFPSOWPage2 TaxTypeTaxPolicyDate() throws InterruptedException {
			click("(//input[@name='scope_of_work[0].tax.type.tax_policy.dt'])", "Tax policy");
			click("//button[contains(@class,'MuiPickersDay-dayWithMargin MuiPickersDay-today')]","date");
			return this;}
											  	
											  	
		//Comment box > Tax > Type > Tax policy
		public CreateRFPSOWPage2 TaxTypeTaxPolicyCmts(String TaxTypeTaxPolicyCmts) throws InterruptedException {
				type("//*[@name='scope_of_work[0].tax.type.tax_policy.comment']", TaxTypeTaxPolicyCmts , "Tax policy Comments");	
				return this;}  	
		
		  
		
		// check Box > Tax > Type >  Other	
		public CreateRFPSOWPage2 checkTaxTypeOther() throws InterruptedException {
			  check("//*[@name='scope_of_work[0].tax.type.other.value']", "Tax Type Other");
			  return this;}	
			
		// Tax > Type > Other > Expected completion date (optional)
		public CreateRFPSOWPage2 TaxTypeOtherDate() throws InterruptedException {
			click("(//input[@name='scope_of_work[0].tax.type.other.dt'])", "Tax type other");
			click("//button[contains(@class,'MuiPickersDay-dayWithMargin MuiPickersDay-today')]","date");
			return this;}
													  	
													  	
		//Comment box > Tax > Type > Other	
		public CreateRFPSOWPage2 TaxTypeOtherCmts(String TaxTypeOtherCmts) throws InterruptedException {
			type("//*[@name='scope_of_work[0].tax.type.other.comment']", TaxTypeOtherCmts , "Tax Other Comments");	
			return this;}    
		
				  
		// check Box > Tax > Staged approach
		public CreateRFPSOWPage2 checkTaxStagedApproach() throws InterruptedException {
			  check("//*[@name='scope_of_work[0].tax.staged_approach.value']", "Staged approach");
			  return this;}	
			 
		  
		// Tax > Staged approach > Expected completion date (optional)
		public CreateRFPSOWPage2 TaxStagedApproachDate() throws InterruptedException {
				click("(//input[@name='scope_of_work[0].tax.staged_approach.dt'])", "Tax Staged approach");
				click("//button[contains(@class,'MuiPickersDay-dayWithMargin MuiPickersDay-today')]","date");
				return this;}
															  	
															  	
		//Comment box > Tax > Staged approach
			public CreateRFPSOWPage2 TaxStagedApproachCmts(String TaxStagedApproachCmts) throws InterruptedException {
			type("//*[@name='scope_of_work[0].tax.staged_approach.comment']", TaxStagedApproachCmts , "Staged approach Comments");	
			return this;}    
				  
		
		
		// check Box > Tax > Implementation
		public CreateRFPSOWPage2 checkTaxImplementation() throws InterruptedException {
			  check("//*[@name='scope_of_work[0].tax.implementation.value']", "Tax Implementation");
			  return this;}	 
		
		  
		// check Box > Tax > Implementation > Corporate in charge of implementation
		public CreateRFPSOWPage2 checkTaxImplementationCorporate() throws InterruptedException {
			  check("//*[@name='scope_of_work[0].tax.implementation.corporate_in_charge.value']", "Corporate in charge of implementation");
			  return this;}	  
		  
		 
		// Tax > Implementation > Corporate in charge of implementation > Expected completion date (optional)
		public CreateRFPSOWPage2 TaxImplementationCorporateDate() throws InterruptedException {
				click("(//input[@name='scope_of_work[0].tax.implementation.corporate_in_charge.dt'])", "Corporate in charge");
				click("//button[contains(@class,'MuiPickersDay-dayWithMargin MuiPickersDay-today')]","date");
				return this;}
															  	
															  	
		//Comment box > Tax > Implementation > Corporate in charge of implementation
			public CreateRFPSOWPage2 TaxImplementationCorporateCmts(String TaxImplementationCorporateCmts) throws InterruptedException {
			type("//*[@name='scope_of_work[0].tax.implementation.corporate_in_charge.comment']", TaxImplementationCorporateCmts , "Corporate in charge");	
			return this;} 
		
				  
		// check Box > Tax > Implementation  > Legal services provider to advise on implementation
		public CreateRFPSOWPage2 checkTaxImplementationLegal() throws InterruptedException {
			  check("//*[@name='scope_of_work[0].tax.implementation.legal_services_advise.value']", "Legal services provider to advise on implementation");
			  return this;}	  
		 
	
		// Tax > Implementation > Legal services provider to advise on implementation > Expected completion date (optional)
		public CreateRFPSOWPage2 TaxImplementationLegalDate() throws InterruptedException {
			click("(//input[@name='scope_of_work[0].tax.implementation.legal_services_advise.dt'])", "Legal services provider to advise");
			click("//button[contains(@class,'MuiPickersDay-dayWithMargin MuiPickersDay-today')]","date");
			return this;}
																	  	
																	  	
		//Comment box > Tax > Implementation > Legal services provider to advise on implementation
		public CreateRFPSOWPage2 TaxImplementationLegalCmts(String TaxImplementationLegalCmts) throws InterruptedException {
			type("//*[@name='scope_of_work[0].tax.implementation.legal_services_advise.comment']", TaxImplementationLegalCmts , "Legal services provider to advise");	
			return this;}  
		  
		 		  	
  	//18.-------------------------------------------------------------> Other <-----------------------------------------------------------------------------
  	
		  //Drop Down Scope -> Other
		 	public CreateRFPSOWPage2 selectScopeOther() throws InterruptedException {
		 				click("//div[@id='mui-component-select-scope_of_work[0].scope_of_work_id']","Other");
		 				click("//li[text()='Other']" , "Other");
		 				return this;} 	 		  	
		 		  	
		 		  		  	
		 	//Comment box - Other
		 	public CreateRFPSOWPage2 OtherCmts(String OtherComments) throws InterruptedException {
		 		type("//*[@name='scope_of_work[0].other.comment']", OtherComments , "Other Comments");	
		 		return this;}
  	
	
		 	//Other > Expected completion date (optional)
		 	public CreateRFPSOWPage2 OtherDate() throws InterruptedException {
		 		click("(//input[@name='scope_of_work[0].other.dt'])","Other");
		 		click("//button[contains(@class,'MuiPickersDay-dayWithMargin MuiPickersDay-today')]","date");
		 		return this;}
    
}
  	