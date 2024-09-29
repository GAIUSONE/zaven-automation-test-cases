package page.services;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import com.force.base.ProjectHooks;
import com.force.config.ConfigurationManager;
import com.microsoft.playwright.BrowserContext;
import com.microsoft.playwright.PlaywrightException;
import page.base.ZavenHooks;

public class ProposalSOWPage2 extends ProjectHooks{

//----------------------------------------------------->  Scope of Work (SOW)* <---------------------------------------------------------------------

//10.--------------------------------------------------->         IP           <---------------------------------------------------------------------	
	
	//Tick > IP > Portfolio management
	public ProposalSOWPage2 clkPropSowIPPortfolio() throws InterruptedException {
		click("//*[@name='scope_of_work[0].ip.portfolio_management.noted_accepted']", " Portfolio management");
		return this;}
			
			
	//Expand Comment > IP  > Portfolio management
	public ProposalSOWPage2 ExpPropSowIPPortfolio(String Comments) throws InterruptedException {
		Thread.sleep(2000);
		click("(//*[text()='Portfolio management']/following::div[@aria-label='Comments'])[1]","Portfolio management");
		type("//*[@name='scope_of_work[0].ip.portfolio_management.comment']", Comments , "Portfolio management");	
		return this;}
	
	
	//Tick > IP > Commercialisation
	public ProposalSOWPage2 clkPropSowIPCommercialisation() throws InterruptedException {
		click("//*[@name='scope_of_work[0].ip.commercialisation.noted_accepted']", " Commercialisation");
		return this;}
			
			
	//Expand Comment > IP  > Commercialisation
	public ProposalSOWPage2 ExpPropSowIPCommercialisation(String Comments) throws InterruptedException {
		Thread.sleep(2000);
		click("(//*[text()='Commercialisation']/following::div[@aria-label='Comments'])[1]","Commercialisation");
		type("//*[@name='scope_of_work[0].ip.commercialisation.comment']", Comments , "Commercialisation");	
		return this;}
	
	
	
	//Tick > IP > Enforcement
	public ProposalSOWPage2 clkPropSowIPEnforcement() throws InterruptedException {
		click("//*[@name='scope_of_work[0].ip.enforcement.noted_accepted']", " Enforcement");
		return this;}
			
			
	//Expand Comment > IP  > Enforcement
	public ProposalSOWPage2 ExpPropSowIPEnforcement(String Comments) throws InterruptedException {
		Thread.sleep(2000);
		click("(//*[text()='Enforcement']/following::div[@aria-label='Comments'])[1]","Enforcement");
		type("//*[@name='scope_of_work[0].ip.enforcement.comment']", Comments , "Enforcement");	
		return this;}
	
	
	//Tick > IP > Other
	public ProposalSOWPage2 clkPropSowIPOther() throws InterruptedException {
		click("//*[@name='scope_of_work[0].ip.other.noted_accepted']", " Other");
		return this;}
			
			
	//Expand Comment > IP  > Other
	public ProposalSOWPage2 ExpPropSowIPOther(String Comments) throws InterruptedException {
		Thread.sleep(2000);
		click("(//*[text()='Other']/following::div[@aria-label='Comments'])[1]","Other");
		type("//*[@name='scope_of_work[0].ip.other.comment']", Comments , "Other");	
		return this;}
	
	
	
		
//11.--------------------------------------------------->  IT   <---------------------------------------------------------------------	

		
		//Tick > IT  >  Privacy and cyber security advisory
		public ProposalSOWPage2 clkPropSowITPrivacy() throws InterruptedException {
			click("//*[@name='scope_of_work[0].it.category.privacy_cyber_security.noted_accepted']", " Privacy and cyber security advisory");
			return this;}
		
		
		//Expand Comment > IT  > Privacy and cyber security advisory
		public ProposalSOWPage2 ExpPropSowITPrivacy(String Comments) throws InterruptedException {
			Thread.sleep(2000);
			click("(//*[text()='Privacy and cyber security advisory']/following::div[@aria-label='Comments'])[1]","Privacy and cyber security advisory");
			type("//*[@name='scope_of_work[0].it.category.privacy_cyber_security.comment']", Comments , "Privacy and cyber security advisory");	
			return this;}
		
		
		//Tick > IT  >  Outsourcing/strategic commercial contracts (including cloud deployments)
		public ProposalSOWPage2 clkPropSowITOutsourcing() throws InterruptedException {
			click("//*[@name='scope_of_work[0].it.category.outsourcing_commercial_contracts.noted_accepted']", "Outsourcing/strategic commercial contracts");
			return this;}
		
		
		//Expand Comment > IT  > Outsourcing/strategic commercial contracts (including cloud deployments)
		public ProposalSOWPage2 ExpPropSowITOutsourcing(String Comments) throws InterruptedException {
			Thread.sleep(2000);
			click("(//*[text()='Outsourcing/strategic commercial contracts (including cloud deployments)']/following::div[@aria-label='Comments'])[1]","Outsourcing/strategic commercial contracts");
			type("//*[@name='scope_of_work[0].it.category.outsourcing_commercial_contracts.comment']", Comments , "Outsourcing/strategic commercial contracts");	
			return this;}
				
		
		//Tick > IT  >  Tech joint ventures/business collaborations
		public ProposalSOWPage2 clkPropSowITTechJoint() throws InterruptedException {
			click("//*[@name='scope_of_work[0].it.category.tech_joint_ventures.noted_accepted']", "Tech joint ventures");
			return this;}
		
		
		//Expand Comment > IT  > Tech joint ventures/business collaborations
		public ProposalSOWPage2 ExpPropSowITTechJoint(String Comments) throws InterruptedException {
			Thread.sleep(2000);
			click("(//*[text()='Tech joint ventures/business collaborations']/following::div[@aria-label='Comments'])[1]","Tech joint ventures/business collaborations");
			type("//*[@name='scope_of_work[0].it.category.tech_joint_ventures.comment']", Comments , "Tech joint ventures/business collaborations");	
			return this;}
		
		
		//Tick > IT  >  Licensing and general commercial
		public ProposalSOWPage2 clkPropSowITLicensing() throws InterruptedException {
			click("//*[@name='scope_of_work[0].it.category.licensing_general_commercial.noted_accepted']", "Licensing and general commercial");
			return this;}
		
		
		//Expand Comment > IT  > Licensing and general commercial
		public ProposalSOWPage2 ExpPropSowITLicensing(String Comments) throws InterruptedException {
			Thread.sleep(2000);
			click("(//*[text()='Licensing and general commercial']/following::div[@aria-label='Comments'])[1]","Licensing and general commercial");
			type("//*[@name='scope_of_work[0].it.category.licensing_general_commercial.comment']", Comments , "Licensing and general commercial");	
			return this;}
		
		
		//Tick > IT  >  Fintech
		public ProposalSOWPage2 clkPropSowITFintech() throws InterruptedException {
			click("//*[@name='scope_of_work[0].it.category.fintech.noted_accepted']", "Fintech");
			return this;}
		
		
		//Expand Comment > IT  > Fintech
		public ProposalSOWPage2 ExpPropSowITFintech(String Comments) throws InterruptedException {
			Thread.sleep(2000);
			click("(//*[text()='Fintech']/following::div[@aria-label='Comments'])[1]","Fintech");
			type("//*[@name='scope_of_work[0].it.category.fintech.comment']", Comments , "Fintech");	
			return this;}
		
		
		
		//Tick > IT  >  Other
		public ProposalSOWPage2 clkPropSowITOther() throws InterruptedException {
			click("//*[@name='scope_of_work[0].it.category.other.noted_accepted']", "Other");
			return this;}
		
		
		//Expand Comment > IT  > Other
		public ProposalSOWPage2 ExpPropSowITOther(String Comments) throws InterruptedException {
			Thread.sleep(2000);
			click("(//*[text()='Other']/following::div[@aria-label='Comments'])[1]","IT Other");
			type("//*[@name='scope_of_work[0].it.category.other.comment']", Comments , "IT Other");	
			return this;}
		
		
		//Tick > IT  >  Kick off – initial meeting, review of documentation, term sheet preparation/review and negotiation, review of vendors bids
		public ProposalSOWPage2 clkPropSowITKickOff() throws InterruptedException {
			click("//*[@name='scope_of_work[0].it.phases.kick_off_meeting.noted_accepted']", "Kick off – initial meeting");
			return this;}
		
		
		
		//Expand Comment > IT  > Kick off – initial meeting, review of documentation, term sheet preparation/review and negotiation, review of vendors bids
		public ProposalSOWPage2 ExpPropSowITKickOff(String Comments) throws InterruptedException {
			Thread.sleep(2000);
			click("(//*[text()='Kick off – initial meeting, review of documentation, term sheet preparation/review and negotiation, review of vendors bids']/following::div[@aria-label='Comments'])[1]","Kick off – initial meeting");
			type("//*[@name='scope_of_work[0].it.phases.kick_off_meeting.comment']", Comments , "Kick off – initial meeting");	
			return this;}
		
		
		//Tick > IT  >  Documentation preparation/review
		public ProposalSOWPage2 clkPropSowITDocumentation() throws InterruptedException {
			click("//*[@name='scope_of_work[0].it.phases.documentation_preparation.noted_accepted']", "Documentation preparation/review");
			return this;}
		
		
		//Expand Comment > IT  > Documentation preparation/review
		public ProposalSOWPage2 ExpPropSowITDocumentation(String Comments) throws InterruptedException {
			Thread.sleep(2000);
			click("(//*[text()='Documentation preparation/review']/following::div[@aria-label='Comments'])[1]","Documentation preparation/review");
			type("//*[@name='scope_of_work[0].it.phases.documentation_preparation.comment']", Comments , "Documentation preparation/review");	
			return this;}
				
		
		
		//Tick > IT  >  Negotiation
		public ProposalSOWPage2 clkPropSowITNegotiation() throws InterruptedException {
			click("//*[@name='scope_of_work[0].it.phases.negotiation.noted_accepted']", "Negotiation");
			return this;}
		
		
		
		//Expand Comment > IT  > Negotiation
		public ProposalSOWPage2 ExpPropSowITNegotiation(String Comments) throws InterruptedException {
			Thread.sleep(2000);
			click("(//*[text()='Negotiation']/following::div[@aria-label='Comments'])[1]","Negotiation");
			type("//*[@name='scope_of_work[0].it.phases.negotiation.comment']", Comments , "Negotiation");	
			return this;}
		
		
		//Tick > IT  >  Closing
		public ProposalSOWPage2 clkPropSowITClosing() throws InterruptedException {
			click("//*[@name='scope_of_work[0].it.phases.closing.noted_accepted']", "Closing");
			return this;}
		
		
		//Expand Comment > IT  > Closing
		public ProposalSOWPage2 ExpPropSowITClosing(String Comments) throws InterruptedException {
			Thread.sleep(2000);
			click("(//*[text()='Closing']/following::div[@aria-label='Comments'])[1]","Closing");
			type("//*[@name='scope_of_work[0].it.phases.closing.comment']", Comments , "Closing");	
			return this;}
		
		
		//Tick > IT  >  Memo of advice
		public ProposalSOWPage2 clkPropSowITMemo() throws InterruptedException {
			click("//*[@name='scope_of_work[0].it.phases.memo_advice.noted_accepted']", "Memo of advice");
			return this;}
		
		
		//Expand Comment > IT  > Memo of advice
		public ProposalSOWPage2 ExpPropSowITMemo(String Comments) throws InterruptedException {
			Thread.sleep(2000);
			click("(//*[text()='Memo of advice']/following::div[@aria-label='Comments'])[1]","Memo of advice");
			type("//*[@name='scope_of_work[0].it.phases.memo_advice.comment']", Comments , "Memo of advice");	
			return this;}

			
//12.--------------------------------------------------->  Litigation   <---------------------------------------------------------------------	

		// Tick > Litigation > Investigation phase 
		public ProposalSOWPage2 clkPropSowLitigationInvestigation() throws InterruptedException {
			click("//*[@name='scope_of_work[0].litigation.investigation_phase.noted_accepted']", "Investigation phase");
			return this;}
		
		
		//Expand Comment > Litigation > Investigation phase
		public ProposalSOWPage2 ExpPropSowLitigationInvestigation(String Comments) throws InterruptedException {
			Thread.sleep(2000);
			click("(//*[text()='Investigation phase']/following::div[@aria-label='Comments'])[1]","Investigation phase");
			type("//*[@name='scope_of_work[0].litigation.investigation_phase.comment']", Comments , "Investigation phase");	
			return this;}
		
		
		// Tick > Litigation > Pleadings
		public ProposalSOWPage2 clkPropSowLitigationPleadings() throws InterruptedException {
			click("//*[@name='scope_of_work[0].litigation.pleadings.noted_accepted']", "Pleadings");
			return this;}
		
		
		//Expand Comment > Litigation > Pleadings
		public ProposalSOWPage2 ExpPropSowLitigationPleadings(String Comments) throws InterruptedException {
			Thread.sleep(2000);
			click("(//*[text()='Pleadings']/following::div[@aria-label='Comments'])[1]","Pleadings");
			type("//*[@name='scope_of_work[0].litigation.pleadings.comment']", Comments , "Pleadings");	
			return this;}
		
		
		// Tick > Litigation > Dispositive motion/motion to dismiss (US mainly)
		public ProposalSOWPage2 clkPropSowLitigationDispositive() throws InterruptedException {
			click("//*[@name='scope_of_work[0].litigation.dispositive_motion.noted_accepted']", "Dispositive motion/motion to dismiss");
			return this;}
		
		
		//Expand Comment > Litigation > Dispositive motion/motion to dismiss (US mainly)
		public ProposalSOWPage2 ExpPropSowLitigationDispositive(String Comments) throws InterruptedException {
			Thread.sleep(2000);
			click("(//*[text()='Dispositive motion/motion to dismiss (US mainly)']/following::div[@aria-label='Comments'])[1]","Dispositive motion/motion to dismiss");
			type("//*[@name='scope_of_work[0].litigation.dispositive_motion.comment']", Comments , "Dispositive motion/motion to dismiss");	
			return this;}
		
	
		// Tick > Litigation > Exchange of evidence
		public ProposalSOWPage2 clkPropSowLitigationEvidence() throws InterruptedException {
			click("//*[@name='scope_of_work[0].litigation.exchange_evidence.noted_accepted']", "Exchange of evidence");
			return this;}
		
		
		//Expand Comment > Litigation > Exchange of evidence
		public ProposalSOWPage2 ExpPropSowLitigationEvidence(String Comments) throws InterruptedException {
			Thread.sleep(2000);
			click("(//*[text()='Exchange of evidence']/following::div[@aria-label='Comments'])[1]","Exchange of evidence");
			type("//*[@name='scope_of_work[0].litigation.exchange_evidence.comment']", Comments , "Exchange of evidence");	
			return this;}
		
		
		// Tick > Litigation > Pre trial
		public ProposalSOWPage2 clkPropSowLitigationPreTrial() throws InterruptedException {
			click("//*[@name='scope_of_work[0].litigation.pre_trial.noted_accepted']", "Pre trial");
			return this;}
		
		
		//Expand Comment > Litigation > Pre trial
		public ProposalSOWPage2 ExpPropSowLitigationPreTrial(String Comments) throws InterruptedException {
			Thread.sleep(2000);
			click("(//*[text()='Pre trial']/following::div[@aria-label='Comments'])[1]","Pre trial");
			type("//*[@name='scope_of_work[0].litigation.pre_trial.comment']", Comments , "Pre trial");	
			return this;}
		
		
		// Tick > Litigation > Trial
		public ProposalSOWPage2 clkPropSowLitigationTrial() throws InterruptedException {
			click("//*[@name='scope_of_work[0].litigation.trial.noted_accepted']", "Trial");
			return this;}
		
		
		//Expand Comment > Litigation > Trial
		public ProposalSOWPage2 ExpPropSowLitigationTrial(String Comments) throws InterruptedException {
			Thread.sleep(2000);
			click("(//*[text()='Trial']/following::div[@aria-label='Comments'])[1]","Trial");
			type("//*[@name='scope_of_work[0].litigation.trial.comment']", Comments , "Trial");	
			return this;}
		
		
		
		// Tick > Litigation > Settlement
		public ProposalSOWPage2 clkPropSowLitigationSettlement() throws InterruptedException {
			click("//*[@name='scope_of_work[0].litigation.settlement.noted_accepted']", "Settlement");
			return this;}
		
		
		//Expand Comment > Litigation > Settlement
		public ProposalSOWPage2 ExpPropSowLitigationSettlement(String Comments) throws InterruptedException {
			Thread.sleep(2000);
			click("(//*[text()='Settlement']/following::div[@aria-label='Comments'])[1]","Settlement");
			type("//*[@name='scope_of_work[0].litigation.settlement.comment']", Comments , "Settlement");	
			return this;}
		
		
		// Tick > Litigation > Appeal
		public ProposalSOWPage2 clkPropSowLitigationAppeal() throws InterruptedException {
			click("//*[@name='scope_of_work[0].litigation.appeal.noted_accepted']", "Appeal");
			return this;}
		
		
		//Expand Comment > Litigation > Appeal
		public ProposalSOWPage2 ExpPropSowLitigationAppeal(String Comments) throws InterruptedException {
			Thread.sleep(2000);
			click("(//*[text()='Appeal']/following::div[@aria-label='Comments'])[1]","Appeal");
			type("//*[@name='scope_of_work[0].litigation.appeal.comment']", Comments , "Appeal");	
			return this;}
		
		
		
		// Tick > Litigation > Enforcement
		public ProposalSOWPage2 clkPropSowLitigationEnforcement() throws InterruptedException {
			click("//*[@name='scope_of_work[0].litigation.enforcement.noted_accepted']", "Enforcement");
			return this;}
		
		//Expand Comment > Litigation > Enforcement
		public ProposalSOWPage2 ExpPropSowLitigationEnforcement(String Comments) throws InterruptedException {
			Thread.sleep(2000);
			click("(//*[text()='Enforcement']/following::div[@aria-label='Comments'])[1]","Enforcement");
			type("//*[@name='scope_of_work[0].litigation.enforcement.comment']", Comments , "Enforcement");	
			return this;}
		
		
		
		// Tick > Litigation > Other
		public ProposalSOWPage2 clkPropSowLitigationOther() throws InterruptedException {
			click("//*[@name='scope_of_work[0].litigation.other.noted_accepted']", "Other");
			return this;}
		
		//Expand Comment > Litigation > Other
		public ProposalSOWPage2 ExpPropSowLitigationOther(String Comments) throws InterruptedException {
			Thread.sleep(2000);
			click("(//*[text()='Other']/following::div[@aria-label='Comments'])[1]","Other");
			type("//*[@name='scope_of_work[0].litigation.other.comment']", Comments , "Other");	
			return this;}
		
		
		// Tick > Litigation > Comment
		public ProposalSOWPage2 clkPropSowLitigationComment() throws InterruptedException {
			click("//*[@name='scope_of_work[0].litigation.comment.noted_accepted']", "Comment");
			return this;}
		
		
		//Expand Comment > Litigation > Comment
		public ProposalSOWPage2 ExpPropSowLitigationComment(String Comments) throws InterruptedException {
			Thread.sleep(2000);
			click("(//*[text()='Comment']/following::div[@aria-label='Comments'])[1]","Comment");
			type("//*[@name='scope_of_work[0].litigation.comment.comment']", Comments , "Comment");	
			return this;}
		
				
//13.--------------------------------------------------->  Arbitration  <---------------------------------------------------------------------	

		// Tick > Arbitration > Investigation phase
		public ProposalSOWPage2 clkPropSowArbitrationInvestigation() throws InterruptedException {
			click("//*[@name='scope_of_work[0].arbitration.investigation_phase.noted_accepted']", "Investigation phase");
			return this;}
		
		
		//Expand Comment > Arbitration > Investigation phase
		public ProposalSOWPage2 ExpPropSowArbitrationInvestigation(String Comments) throws InterruptedException {
			Thread.sleep(2000);
			click("(//*[text()='Investigation phase']/following::div[@aria-label='Comments'])[1]","Investigation phase");
			type("//*[@name='scope_of_work[0].arbitration.investigation_phase.comment']", Comments , "Investigation phase");	
			return this;}
		
	
		// Tick > Arbitration > Request for arbitration/answer/counterclaimse
		public ProposalSOWPage2 clkPropSowArbitrationCounterClaimse() throws InterruptedException {
			click("//*[@name='scope_of_work[0].arbitration.request_for_arbitration.noted_accepted']", "Request for arbitration/answer/counterclaimse");
			return this;}
		
	
		//Expand Comment > Arbitration > Request for arbitration/answer/counterclaimse
		public ProposalSOWPage2 ExpPropSowArbitrationCounterClaimse(String Comments) throws InterruptedException {
			Thread.sleep(2000);
			click("(//*[text()='Request for arbitration/answer/counterclaimse']/following::div[@aria-label='Comments'])[1]","Request for arbitration/answer/counterclaimse");
			type("//*[@name='scope_of_work[0].arbitration.request_for_arbitration.comment']", Comments , "Request for arbitration/answer/counterclaimse");	
			return this;}
		
	
		// Tick > Arbitration > Initial memoranda
		public ProposalSOWPage2 clkPropSowArbitrationInitial() throws InterruptedException {
			click("//*[@name='scope_of_work[0].arbitration.initial_memoranda.noted_accepted']", "Initial memoranda");
			return this;}
		
	
		//Expand Comment > Arbitration > Initial memoranda
		public ProposalSOWPage2 ExpPropSowArbitrationInitial(String Comments) throws InterruptedException {
			Thread.sleep(2000);
			click("(//*[text()='Initial memoranda']/following::div[@aria-label='Comments'])[1]","Initial memoranda");
			type("//*[@name='scope_of_work[0].arbitration.initial_memoranda.comment']", Comments , "Initial memoranda");	
			return this;}
		
		
		
		// Tick > Arbitration > Exchange of evidence
		public ProposalSOWPage2 clkPropSowArbitrationExchange() throws InterruptedException {
			click("//*[@name='scope_of_work[0].arbitration.exchange_evidence.noted_accepted']", "Exchange of evidence");
			return this;}
		
	
		//Expand Comment > Arbitration > Exchange of evidence
		public ProposalSOWPage2 ExpPropSowArbitrationExchange(String Comments) throws InterruptedException {
			Thread.sleep(2000);
			click("(//*[text()='Exchange of evidence']/following::div[@aria-label='Comments'])[1]","Exchange of evidence");
			type("//*[@name='scope_of_work[0].arbitration.exchange_evidence.comment']", Comments , "Exchange of evidence");	
			return this;}
		
		
		// Tick > Arbitration > Additional memoranda
		public ProposalSOWPage2 clkPropSowArbitrationAdditional() throws InterruptedException {
			click("//*[@name='scope_of_work[0].arbitration.additional_memoranda.noted_accepted']", "Additional memoranda");
			return this;}
		
	
		//Expand Comment > Arbitration > Additional memoranda
		public ProposalSOWPage2 ExpPropSowArbitrationAdditional(String Comments) throws InterruptedException {
			Thread.sleep(2000);
			click("(//*[text()='Additional memoranda']/following::div[@aria-label='Comments'])[1]","Additional memoranda");
			type("//*[@name='scope_of_work[0].arbitration.additional_memoranda.comment']", Comments , "Additional memoranda");	
			return this;}
		
		
		// Tick > Arbitration > Hearing
		public ProposalSOWPage2 clkPropSowArbitrationHearing() throws InterruptedException {
			click("//*[@name='scope_of_work[0].arbitration.hearing.noted_accepted']", "Hearing");
			return this;}
		
	
		//Expand Comment > Arbitration > Hearing
		public ProposalSOWPage2 ExpPropSowArbitrationHearing(String Comments) throws InterruptedException {
			Thread.sleep(2000);
			click("(//*[text()='Hearing']/following::div[@aria-label='Comments'])[1]","Hearing");
			type("//*[@name='scope_of_work[0].arbitration.hearing.comment']", Comments , "Hearing");	
			return this;}
		
		
		// Tick > Arbitration > Post-hearing memoranda
		public ProposalSOWPage2 clkPropSowArbitrationPostHearing() throws InterruptedException {
			click("//*[@name='scope_of_work[0].arbitration.post_hearing_memoranda.noted_accepted']", "Post-hearing memoranda");
			return this;}
		
	
		//Expand Comment > Arbitration > Post-hearing memoranda
		public ProposalSOWPage2 ExpPropSowArbitrationPostHearing(String Comments) throws InterruptedException {
			Thread.sleep(2000);
			click("(//*[text()='Post-hearing memoranda']/following::div[@aria-label='Comments'])[1]","Post-hearing memoranda");
			type("//*[@name='scope_of_work[0].arbitration.post_hearing_memoranda.comment']", Comments , "Post-hearing memoranda");	
			return this;}
		
		
		// Tick > Arbitration > Settlement
		public ProposalSOWPage2 clkPropSowArbitrationSettlement() throws InterruptedException {
			click("//*[@name='scope_of_work[0].arbitration.settlement.noted_accepted']", "Settlement");
			return this;}
		
	
		//Expand Comment > Arbitration > Settlement
		public ProposalSOWPage2 ExpPropSowArbitrationSettlement(String Comments) throws InterruptedException {
			Thread.sleep(2000);
			click("(//*[text()='Settlement']/following::div[@aria-label='Comments'])[1]","Settlement");
			type("//*[@name='scope_of_work[0].arbitration.settlement.comment']", Comments , "Settlement");	
			return this;}
		
		
		// Tick > Arbitration > Appeal
		public ProposalSOWPage2 clkPropSowArbitrationAppeal() throws InterruptedException {
			click("//*[@name='scope_of_work[0].arbitration.appeal.noted_accepted']", "Appeal");
			return this;}
		
	
		//Expand Comment > Arbitration > Appeal
		public ProposalSOWPage2 ExpPropSowArbitrationAppeal(String Comments) throws InterruptedException {
			Thread.sleep(2000);
			click("(//*[text()='Appeal']/following::div[@aria-label='Comments'])[1]","Appeal");
			type("//*[@name='scope_of_work[0].arbitration.appeal.comment']", Comments , "Appeal");	
			return this;}
		
		
		
		
		// Tick > Arbitration > Enforcement/annulment
		public ProposalSOWPage2 clkPropSowArbitrationEnforcement() throws InterruptedException {
			click("//*[@name='scope_of_work[0].arbitration.enforcement_annulment.noted_accepted']", "Enforcement/annulment");
			return this;}
		
	
		//Expand Comment > Arbitration > Enforcement/annulment
		public ProposalSOWPage2 ExpPropSowArbitrationEnforcement(String Comments) throws InterruptedException {
			Thread.sleep(2000);
			click("(//*[text()='Enforcement/annulment']/following::div[@aria-label='Comments'])[1]","Enforcement/annulment");
			type("//*[@name='scope_of_work[0].arbitration.enforcement_annulment.comment']", Comments , "Enforcement/annulment");	
			return this;}
		
		
	
		// Tick > Arbitration > Other	
		public ProposalSOWPage2 clkPropSowArbitrationOther() throws InterruptedException {
			click("//*[@name='scope_of_work[0].arbitration.other.noted_accepted']", "Arbitration Other");
			return this;}
		
	
		//Expand Comment > Arbitration > Other
		public ProposalSOWPage2 ExpPropSowArbitrationOther(String Comments) throws InterruptedException {
			Thread.sleep(2000);
			click("(//*[text()='Other']/following::div[@aria-label='Comments'])[1]","Arbitration Other");
			type("//*[@name='scope_of_work[0].arbitration.other.comment']", Comments , "Arbitration Other");	
			return this;}
		
		
//14.--------------------------------------------------->  Restructuring   <---------------------------------------------------------------------	

		
		// Tick > Restructuring > Role in Restructuring matter
		public ProposalSOWPage2 clkPropSowRestructuringRole() throws InterruptedException {
			click("//*[@name='scope_of_work[0].restructuring.role_in_restructuring.noted_accepted']", "Role in Restructuring matter");
			return this;}
		
		
		//Expand Comment > Restructuring > Role in Restructuring matter
		public ProposalSOWPage2 ExpPropSowRestructuringRole(String Comments) throws InterruptedException {
			Thread.sleep(2000);
			click("(//*[text()='Role in Restructuring matter']/following::div[@aria-label='Comments'])[1]","Role in Restructuring matter");
			type("//*[@name='scope_of_work[0].restructuring.role_in_restructuring.comment']", Comments , "Role in Restructuring matter");	
			return this;}
		
		
		// Tick > Restructuring > Rescue securitisations
		public ProposalSOWPage2 clkPropSowRestructuringsecuritisations() throws InterruptedException {
			click("//*[@name='scope_of_work[0].restructuring.rescue_securitisations.noted_accepted']", "Rescue securitisations");
			return this;}
		
		
		//Expand Comment > Restructuring > Rescue securitisations
		public ProposalSOWPage2 ExpPropSowRestructuringsecuritisations(String Comments) throws InterruptedException {
			Thread.sleep(2000);
			click("(//*[text()='Rescue securitisations']/following::div[@aria-label='Comments'])[1]","Rescue securitisations");
			type("//*[@name='scope_of_work[0].restructuring.rescue_securitisations.comment']", Comments , "Rescue securitisations");	
			return this;}
		
		
		// Tick > Restructuring > Moratorium/Rescheduling of debts
		public ProposalSOWPage2 clkPropSowRestructuringMoratorium() throws InterruptedException {
			click("//*[@name='scope_of_work[0].restructuring.moratorium_debts.noted_accepted']", "Moratorium/Rescheduling of debts");
			return this;}
				
				
		//Expand Comment > Restructuring > Moratorium/Rescheduling of debts
		public ProposalSOWPage2 ExpPropSowRestructuringMoratorium(String Comments) throws InterruptedException {
			Thread.sleep(2000);
			click("(//*[text()='Moratorium/Rescheduling of debts']/following::div[@aria-label='Comments'])[1]","Moratorium/Rescheduling of debts");
			type("//*[@name='scope_of_work[0].restructuring.moratorium_debts.comment']", Comments , "Moratorium/Rescheduling of debts");	
			return this;}
		
		
		// Tick > Restructuring > Debt to equity swaps
		public ProposalSOWPage2 clkPropSowRestructuringDebt() throws InterruptedException {
			click("//*[@name='scope_of_work[0].restructuring.debt_equity_swaps.noted_accepted']", "Debt to equity swaps");
			return this;}
				
				
		//Expand Comment > Restructuring > Debt to equity swaps
		public ProposalSOWPage2 ExpPropSowRestructuringDebt(String Comments) throws InterruptedException {
			Thread.sleep(2000);
			click("(//*[text()='Debt to equity swaps']/following::div[@aria-label='Comments'])[1]","Debt to equity swaps");
			type("//*[@name='scope_of_work[0].restructuring.debt_equity_swaps.comment']", Comments , "Debt to equity swaps");	
			return this;}
		
		
		// Tick > Restructuring > Corporate restructurings (eg. schemes of arrangements)
		public ProposalSOWPage2 clkPropSowRestructuringCorporateRestructurings() throws InterruptedException {
			click("//*[@name='scope_of_work[0].restructuring.corporate_restructurings.noted_accepted']", "Corporate restructurings");
			return this;}
				
				
		//Expand Comment > Restructuring > Corporate restructurings (eg. schemes of arrangements)
		public ProposalSOWPage2 ExpPropSowRestructuringCorporateRestructurings(String Comments) throws InterruptedException {
			Thread.sleep(2000);
			click("(//*[text()='Corporate restructurings (eg. schemes of arrangements)']/following::div[@aria-label='Comments'])[1]","Corporate restructurings");
			type("//*[@name='scope_of_work[0].restructuring.corporate_restructurings.comment']", Comments , "Corporate restructurings");	
			return this;}
		

		// Tick > Restructuring > Corporate finance transactions restructuring (e.g. buy-outs, M&A, rights issues)
		public ProposalSOWPage2 clkPropSowRestructuringFinance() throws InterruptedException {
			click("//*[@name='scope_of_work[0].restructuring.corporate_finance_transactions.noted_accepted']", " Corporate finance transactions restructuring");
			return this;}
				
				
		//Expand Comment > Restructuring > Corporate finance transactions restructuring (e.g. buy-outs, M&A, rights issues)
		public ProposalSOWPage2 ExpPropSowRestructuringFinance(String Comments) throws InterruptedException {
			Thread.sleep(2000);
			click("(//*[text()='Corporate finance transactions restructuring (e.g. buy-outs, M&A, rights issues)']/following::div[@aria-label='Comments'])[1]"," Corporate finance transactions restructuring");
			type("//*[@name='scope_of_work[0].restructuring.corporate_finance_transactions.comment']", Comments , " Corporate finance transactions restructuring");	
			return this;}
		
		
		// Tick > Restructuring > Structured receiverships
		public ProposalSOWPage2 clkPropSowRestructuringReceiverships() throws InterruptedException {
			click("//*[@name='scope_of_work[0].restructuring.structured_receiverships.noted_accepted']", "Structured receiverships");
			return this;}
				
				
		//Expand Comment > Restructuring > Structured receiverships
		public ProposalSOWPage2 ExpPropSowRestructuringReceiverships(String Comments) throws InterruptedException {
			Thread.sleep(2000);
			click("(//*[text()='Structured receiverships']/following::div[@aria-label='Comments'])[1]","Structured receiverships");
			type("//*[@name='scope_of_work[0].restructuring.structured_receiverships.comment']", Comments , "Structured receiverships");	
			return this;}
		
		// Tick > Restructuring > Insolvency processes (formal cram down processes, pre-pack administrations or bankruptcy sales and purchases)
		public ProposalSOWPage2 clkPropSowRestructuringInsolvency() throws InterruptedException {
			click("//*[@name='scope_of_work[0].restructuring.insolvency_processes.noted_accepted']", "Insolvency processes");
			return this;}
				
				
		//Expand Comment > Restructuring > Insolvency processes (formal cram down processes, pre-pack administrations or bankruptcy sales and purchases)
		public ProposalSOWPage2 ExpPropSowRestructuringInsolvency(String Comments) throws InterruptedException {
			Thread.sleep(2000);
			click("(//*[text()='Insolvency processes (formal cram down processes, pre-pack administrations or bankruptcy sales and purchases)']/following::div[@aria-label='Comments'])[1]","Insolvency processes");
			type("//*[@name='scope_of_work[0].restructuring.insolvency_processes.comment']", Comments , "Insolvency processes");	
			return this;}
	
		
		// Tick > Restructuring > Contingency planning
		public ProposalSOWPage2 clkPropSowRestructuringContingency() throws InterruptedException {
			click("//*[@name='scope_of_work[0].restructuring.contingency_planning.noted_accepted']", "Contingency planning");
			return this;}
				
				
		//Expand Comment > Restructuring > Contingency planning
		public ProposalSOWPage2 ExpPropSowRestructuringContingency(String Comments) throws InterruptedException {
			Thread.sleep(2000);
			click("(//*[text()='Contingency planning']/following::div[@aria-label='Comments'])[1]","Contingency planning");
			type("//*[@name='scope_of_work[0].restructuring.contingency_planning.comment']", Comments , "Contingency planning");	
			return this;}
		
	
		// Tick > Restructuring > Enforcing security
		public ProposalSOWPage2 clkPropSowRestructuringEnforcing() throws InterruptedException {
			click("//*[@name='scope_of_work[0].restructuring.enforcing_security.noted_accepted']", "Enforcing security");
			return this;}
				
				
		//Expand Comment > Restructuring > Enforcing security
		public ProposalSOWPage2 ExpPropSowRestructuringEnforcing(String Comments) throws InterruptedException {
			Thread.sleep(2000);
			click("(//*[text()='Enforcing security']/following::div[@aria-label='Comments'])[1]","Enforcing security");
			type("//*[@name='scope_of_work[0].restructuring.enforcing_security.comment']", Comments , "Enforcing security");	
			return this;}
	
		
		// Tick > Restructuring > Distressed debt trading
		public ProposalSOWPage2 clkPropSowRestructuringDistressed() throws InterruptedException {
			click("//*[@name='scope_of_work[0].restructuring.distressed_debt_trading.noted_accepted']", "Distressed debt trading");
			return this;}
				
				
		//Expand Comment > Restructuring > Distressed debt trading
		public ProposalSOWPage2 ExpPropSowRestructuringDistressed(String Comments) throws InterruptedException {
			Thread.sleep(2000);
			click("(//*[text()='Distressed debt trading']/following::div[@aria-label='Comments'])[1]","Distressed debt trading");
			type("//*[@name='scope_of_work[0].restructuring.distressed_debt_trading.comment']", Comments , "Distressed debt trading");	
			return this;}
	
		
		// Tick > Restructuring > Other
		public ProposalSOWPage2 clkPropSowRestructuringOther() throws InterruptedException {
			click("//*[@name='scope_of_work[0].restructuring.other.noted_accepted']", "Restructuring Other");
			return this;}
				
				
		//Expand Comment > Restructuring > Other
		public ProposalSOWPage2 ExpPropSowRestructuringOther(String Comments) throws InterruptedException {
			Thread.sleep(2000);
			click("(//*[text()='Other']/following::div[@aria-label='Comments'])[1]","Restructuring Other");
			type("//*[@name='scope_of_work[0].restructuring.other.comment']", Comments , "Restructuring Other");	
			return this;}
		
						
//15.--------------------------------------------------->  Insolvency  <---------------------------------------------------------------------	
				
		// Tick > Insolvency > Role in Insolvency matter
		public ProposalSOWPage2 clkPropSowInsolvencyRole() throws InterruptedException {
			click("//*[@name='scope_of_work[0].insolvency.role_in_restructuring.noted_accepted']", "Role in Insolvency matter");
			return this;}
		
		
		//Expand Comment > Insolvency > Role in Insolvency matter
		public ProposalSOWPage2 ExpPropSowInsolvencyRole(String Comments) throws InterruptedException {
			Thread.sleep(2000);
			click("(//*[text()='Role in Insolvency matter']/following::div[@aria-label='Comments'])[1]","Role in Insolvency matter");
			type("//*[@name='scope_of_work[0].insolvency.role_in_restructuring.comment']", Comments , "Role in Insolvency matter");	
			return this;}
		
		
		// Tick > Insolvency > Formal insolvencies, both contentious and non-contentious
		public ProposalSOWPage2 clkPropSowInsolvencyFormal() throws InterruptedException {
			click("//*[@name='scope_of_work[0].insolvency.formal_insolvencies.noted_accepted']", "Formal insolvencies");
			return this;}
		
		
		//Expand Comment > Insolvency > Formal insolvencies, both contentious and non-contentious
		public ProposalSOWPage2 ExpPropSowInsolvencyFormal(String Comments) throws InterruptedException {
			Thread.sleep(2000);
			click("(//*[text()='Formal insolvencies, both contentious and non-contentious']/following::div[@aria-label='Comments'])[1]","Formal insolvencies");
			type("//*[@name='scope_of_work[0].insolvency.formal_insolvencies.comment']", Comments , "Formal insolvencies");	
			return this;}
		
		
		// Tick > Insolvency > Litigation and dispute resolution (protecting creditor claims, cross border recovery, asset freeze and search operations)
		public ProposalSOWPage2 clkPropSowInsolvencyLitigation() throws InterruptedException {
			click("//*[@name='scope_of_work[0].insolvency.litigation_dispute_resolution.noted_accepted']", "Litigation and dispute");
			return this;}
				
		
		//Expand Comment > Insolvency > Litigation and dispute resolution (protecting creditor claims, cross border recovery, asset freeze and search operations)
		public ProposalSOWPage2 ExpPropSowInsolvencyLitigation(String Comments) throws InterruptedException {
			Thread.sleep(2000);
			click("(//*[text()='Litigation and dispute resolution (protecting creditor claims, cross border recovery, asset freeze and search operations)']/following::div[@aria-label='Comments'])[1]","Litigation and dispute");
			type("//*[@name='scope_of_work[0].insolvency.litigation_dispute_resolution.comment']", Comments , "Litigation and dispute");	
			return this;}
		
		
		// Tick > Insolvency > Purchase and sale of claims
		public ProposalSOWPage2 clkPropSowInsolvencyPurchase() throws InterruptedException {
			click("//*[@name='scope_of_work[0].insolvency.purchase_sale_claims.noted_accepted']", "Purchase and sale of claims");
			return this;}
				
		
		//Expand Comment > Insolvency > Purchase and sale of claims
		public ProposalSOWPage2 ExpPropSowInsolvencyPurchase(String Comments) throws InterruptedException {
			Thread.sleep(2000);
			click("(//*[text()='Purchase and sale of claims']/following::div[@aria-label='Comments'])[1]","Purchase and sale of claims");
			type("//*[@name='scope_of_work[0].insolvency.purchase_sale_claims.comment']", Comments , "Purchase and sale of claims");	
			return this;}
		
		
		// Tick > Insolvency > Advice in relation to avoidance actions
		public ProposalSOWPage2 clkPropSowInsolvencyAvoidance() throws InterruptedException {
			click("//*[@name='scope_of_work[0].insolvency.advice_in_relation.noted_accepted']", "Advice in relation to avoidance actions");
			return this;}
				
		
		//Expand Comment > Insolvency > Advice in relation to avoidance actions
		public ProposalSOWPage2 ExpPropSowInsolvencyAvoidance(String Comments) throws InterruptedException {
			Thread.sleep(2000);
			click("(//*[text()='Advice in relation to avoidance actions']/following::div[@aria-label='Comments'])[1]","Advice in relation to avoidance actions");
			type("//*[@name='scope_of_work[0].insolvency.advice_in_relation.comment']", Comments , "Advice in relation to avoidance actions");	
			return this;}
		
		
		// Tick > Insolvency > Advice on regulatory, financial, and commercial issues
		public ProposalSOWPage2 clkPropSowInsolvencyCommercialIssues() throws InterruptedException {
			click("//*[@name='scope_of_work[0].insolvency.advice_on_regulatory.noted_accepted']", "Advice on regulatory, financial");
			return this;}
				
		
		//Expand Comment > Insolvency > Advice on regulatory, financial, and commercial issues
		public ProposalSOWPage2 ExpPropSowInsolvencyCommercialIssues(String Comments) throws InterruptedException {
			Thread.sleep(2000);
			click("(//*[text()='Advice on regulatory, financial, and commercial issues']/following::div[@aria-label='Comments'])[1]","Advice on regulatory, financial");
			type("//*[@name='scope_of_work[0].insolvency.advice_on_regulatory.comment']", Comments , "Advice on regulatory, financial");	
			return this;}
		
		
		// Tick > Insolvency > Investigations
		public ProposalSOWPage2 clkPropSowInsolvencyInvestigations() throws InterruptedException {
			click("//*[@name='scope_of_work[0].insolvency.investigations.noted_accepted']", "Investigations");
			return this;}
				
		
		//Expand Comment > Insolvency > Investigations
		public ProposalSOWPage2 ExpPropSowInsolvencyInvestigations(String Comments) throws InterruptedException {
			Thread.sleep(2000);
			click("(//*[text()='Investigations']/following::div[@aria-label='Comments'])[1]","Investigations");
			type("//*[@name='scope_of_work[0].insolvency.investigations.comment']", Comments , "Investigations");	
			return this;}
		
		
		// Tick > Insolvency > Fraud & asset tracing
		public ProposalSOWPage2 clkPropSowInsolvencyFraud() throws InterruptedException {
			click("//*[@name='scope_of_work[0].insolvency.fraud_asset_tracing.noted_accepted']", "Fraud & asset tracing");
			return this;}
				
				
		//Expand Comment > Insolvency > Fraud & asset tracing
		public ProposalSOWPage2 ExpPropSowInsolvencyFraud(String Comments) throws InterruptedException {
			Thread.sleep(2000);
			click("(//*[text()='Fraud & asset tracing']/following::div[@aria-label='Comments'])[1]","Fraud & asset tracing");
			type("//*[@name='scope_of_work[0].insolvency.fraud_asset_tracing.comment']", Comments , "Fraud & asset tracing");	
			return this;}
		
		
		// Tick > Insolvency > Other
		public ProposalSOWPage2 clkPropSowInsolvencyOther() throws InterruptedException {
			click("//*[@name='scope_of_work[0].insolvency.other.noted_accepted']", "Insolvency Other");
			return this;}
				
				
		//Expand Comment > Insolvency > Other
		public ProposalSOWPage2 ExpPropSowInsolvencyOther(String Comments) throws InterruptedException {
			Thread.sleep(2000);
			click("(//*[text()='Other']/following::div[@aria-label='Comments'])[1]","Insolvency Other");
			type("//*[@name='scope_of_work[0].insolvency.other.comment']", Comments , "Insolvency Other");	
			return this;}
		
		
		
//16.--------------------------------------------------->  Regulatory  <---------------------------------------------------------------------			
	
		// Tick > Regulatory > Scoping Questions
		public ProposalSOWPage2 clkPropSowRegulatoryQuestions() throws InterruptedException {
			click("//*[@name='scope_of_work[0].regulatory.scoping_questions.noted_accepted']", "Scoping Questions");
			return this;}
		
		
		//Expand Comment > Regulatory > Scoping Questions
		public ProposalSOWPage2 ExpPropSowRegulatoryQuestions(String Comments) throws InterruptedException {
			Thread.sleep(2000);
			click("(//*[text()='Scoping Questions']/following::div[@aria-label='Comments'])[5]","Scoping Questions");
			type("//*[@name='scope_of_work[0].regulatory.scoping_questions.comment']", Comments , "Scoping Questions");	
			return this;}
		
		
		// Tick > Regulated industry type
		public ProposalSOWPage2 clkPropSowRegulatoryIndustryType() throws InterruptedException {
			click("//*[@name='scope_of_work[0].regulatory.scoping_questions.regulated_industry_type.noted_accepted']", "Regulated industry type");
			return this;}
		
		//Expand Comment > Regulatory > Regulated industry type
		public ProposalSOWPage2 ExpPropSowRegulatoryIndustryType(String Comments) throws InterruptedException {
			Thread.sleep(2000);
			click("(//*[text()='Regulated industry type']/following::div[@aria-label='Comments'])[1]","Regulated industry type");
			type("//*[@name='scope_of_work[0].regulatory.scoping_questions.regulated_industry_type.comment']", Comments , "Regulated industry type");	
			return this;}
				
		
		// Tick > List Jurisdiction/Language involved
		public ProposalSOWPage2 clkPropSowRegulatoryJurisdiction() throws InterruptedException {
			click("//*[@name='scope_of_work[0].regulatory.scoping_questions.list_jurisdiction_involved.noted_accepted']", "List Jurisdiction/Language involved");
			return this;}
		
		
		//Expand Comment > Regulatory > List Jurisdiction/Language involved
		public ProposalSOWPage2 ExpPropSowRegulatoryJurisdiction(String Comments) throws InterruptedException {
			Thread.sleep(2000);
			click("(//*[text()='List Jurisdiction/Language involved']/following::div[@aria-label='Comments'])[1]","List Jurisdiction/Language involved");
			type("//*[@name='scope_of_work[0].regulatory.scoping_questions.list_jurisdiction_involved.comment']", Comments , "List Jurisdiction/Language involved");	
			return this;}
		
		
		
		// Tick > Target entities
		public ProposalSOWPage2 clkPropSowRegulatoryTargetEntities() throws InterruptedException {
			click("//*[@name='scope_of_work[0].regulatory.scoping_questions.number_entities_involved.target_entities.noted_accepted']", "Target entities");
			return this;}
		
		
		//Expand Comment > Regulatory > Target entities
		public ProposalSOWPage2 ExpPropSowRegulatoryTargetEntities(String Comments) throws InterruptedException {
			Thread.sleep(2000);
			click("(//*[text()='Target entities']/following::div[@aria-label='Comments'])[1]","Target entities");
			type("//*[@name='scope_of_work[0].regulatory.scoping_questions.number_entities_involved.target_entities.comment']", Comments , "Target entities");	
			return this;}
		
		
		// Tick > Internal entities
		public ProposalSOWPage2 clkPropSowRegulatoryInternalEntities() throws InterruptedException {
			click("//*[@name='scope_of_work[0].regulatory.scoping_questions.number_entities_involved.internal_entities.noted_accepted']", "Internal entities");
			return this;}
		
		
		//Expand Comment > Regulatory > Internal entities
		public ProposalSOWPage2 ExpPropSowRegulatoryInternalEntities(String Comments) throws InterruptedException {
			Thread.sleep(2000);
			click("(//*[text()='Internal entities']/following::div[@aria-label='Comments'])[1]","Internal entities");
			type("//*[@name='scope_of_work[0].regulatory.scoping_questions.number_entities_involved.internal_entities.comment']", Comments , "Internal entities");	
			return this;}
		
		
		// Tick > Regulatory Perimeter
		public ProposalSOWPage2 clkPropSowRegulatoryPerimeter() throws InterruptedException {
			click("//*[@name='scope_of_work[0].regulatory.best_characterises_involved.regulatory_perimeter.noted_accepted']", "Regulatory Perimeter");
			return this;}
		
		
		//Expand Comment > Regulatory > Regulatory Perimeter
		public ProposalSOWPage2 ExpPropSowRegulatoryPerimeter(String Comments) throws InterruptedException {
			Thread.sleep(2000);
			click("(//*[text()='Regulatory Perimeter']/following::div[@aria-label='Comments'])[1]","Regulatory Perimeter");
			type("//*[@name='scope_of_work[0].regulatory.best_characterises_involved.regulatory_perimeter.comment']", Comments , "Regulatory Perimeter");	
			return this;}
		
		
		// Tick > Licence application preparation and submission
		public ProposalSOWPage2 clkPropSowRegulatoryLicence() throws InterruptedException {
			click("//*[@name='scope_of_work[0].regulatory.best_characterises_involved.licence_application_preparation.noted_accepted']", "Licence application preparation and submission");
			return this;}
		
		
		//Expand Comment > Regulatory > Licence application preparation and submission
		public ProposalSOWPage2 ExpPropSowRegulatoryLicence(String Comments) throws InterruptedException {
			Thread.sleep(2000);
			click("(//*[text()='Licence application preparation and submission']/following::div[@aria-label='Comments'])[1]","Licence application preparation and submission");
			type("//*[@name='scope_of_work[0].regulatory.best_characterises_involved.licence_application_preparation.comment']", Comments , "Licence application preparation and submission");	
			return this;}
	
		
		// Tick > Ownership Approval Application
		public ProposalSOWPage2 clkPropSowRegulatoryOwnership() throws InterruptedException {
			click("//*[@name='scope_of_work[0].regulatory.best_characterises_involved.ownership_approval_application.noted_accepted']", "Ownership Approval Application");
			return this;}
		
		//Expand Comment > Regulatory > Ownership Approval Application
		public ProposalSOWPage2 ExpPropSowRegulatoryOwnership(String Comments) throws InterruptedException {
			Thread.sleep(2000);
			click("(//*[text()='Ownership Approval Application']/following::div[@aria-label='Comments'])[1]","Ownership Approval Application");
			type("//*[@name='scope_of_work[0].regulatory.best_characterises_involved.ownership_approval_application.comment']", Comments , "Ownership Approval Application");	
			return this;}
				
		
		
		// Tick > Foreign Direct Investment
		public ProposalSOWPage2 clkPropSowRegulatoryForeign() throws InterruptedException {
			click("//*[@name='scope_of_work[0].regulatory.best_characterises_involved.foreign_direct_investment.noted_accepted']", "Foreign Direct Investment");
			return this;}
		
		//Expand Comment > Regulatory > Foreign Direct Investment
		public ProposalSOWPage2 ExpPropSowRegulatoryForeign(String Comments) throws InterruptedException {
			Thread.sleep(2000);
			click("(//*[text()='Foreign Direct Investment']/following::div[@aria-label='Comments'])[1]","Foreign Direct Investment");
			type("//*[@name='scope_of_work[0].regulatory.best_characterises_involved.foreign_direct_investment.comment']", Comments , "Foreign Direct Investment");	
			return this;}
		
		
		// Tick > Preparation Regulatory Forms
		public ProposalSOWPage2 clkPropSowRegulatoryPreparation() throws InterruptedException {
			click("//*[@name='scope_of_work[0].regulatory.best_characterises_involved.preparation_regulatory_forms.noted_accepted']", "Preparation Regulatory Forms");
			return this;}
		
		
		//Expand Comment > Regulatory > Preparation Regulatory Forms
		public ProposalSOWPage2 ExpPropSowRegulatoryPreparation(String Comments) throws InterruptedException {
			Thread.sleep(2000);
			click("(//*[text()='Preparation Regulatory Forms']/following::div[@aria-label='Comments'])[1]","Preparation Regulatory Forms");
			type("//*[@name='scope_of_work[0].regulatory.best_characterises_involved.preparation_regulatory_forms.comment']", Comments , "Preparation Regulatory Forms");	
			return this;}
		
		
		
		// Tick > Regulatory Audit Business
		public ProposalSOWPage2 clkPropSowRegulatoryAuditBusiness() throws InterruptedException {
			click("//*[@name='scope_of_work[0].regulatory.best_characterises_involved.regulatory_audit_business.noted_accepted']", "Regulatory Audit Business");
			return this;}
		
		
		//Expand Comment > Regulatory > Regulatory Audit Business
		public ProposalSOWPage2 ExpPropSowRegulatoryAuditBusiness(String Comments) throws InterruptedException {
			Thread.sleep(2000);
			click("(//*[text()='Regulatory Audit Business']/following::div[@aria-label='Comments'])[1]","Regulatory Audit Business");
			type("//*[@name='scope_of_work[0].regulatory.best_characterises_involved.regulatory_audit_business.comment']", Comments , "Regulatory Audit Business");	
			return this;}
		
		
		
		// Tick > Assistance Internal Reorganisation
		public ProposalSOWPage2 clkPropSowRegulatoryReorganisation() throws InterruptedException {
			click("//*[@name='scope_of_work[0].regulatory.best_characterises_involved.assistance_internal_reorganisation.noted_accepted']", "Assistance Internal Reorganisation");
			return this;}
		
		
		//Expand Comment > Regulatory > Assistance Internal Reorganisation
		public ProposalSOWPage2 ExpPropSowRegulatoryReorganisation(String Comments) throws InterruptedException {
			Thread.sleep(2000);
			click("(//*[text()='Assistance Internal Reorganisation']/following::div[@aria-label='Comments'])[1]","Assistance Internal Reorganisation");
			type("//*[@name='scope_of_work[0].regulatory.best_characterises_involved.assistance_internal_reorganisation.comment']", Comments , "Assistance Internal Reorganisation");	
			return this;}
		
		
		// Tick > Material Regulatory Outsourcing
		public ProposalSOWPage2 clkPropSowRegulatoryMaterial() throws InterruptedException {
			click("//*[@name='scope_of_work[0].regulatory.best_characterises_involved.material_regulatory_outsourcing.noted_accepted']", "Material Regulatory Outsourcing");
			return this;}
		
		
		//Expand Comment > Regulatory > Material Regulatory Outsourcing
		public ProposalSOWPage2 ExpPropSowRegulatoryMaterial(String Comments) throws InterruptedException {
			Thread.sleep(2000);
			click("(//*[text()='Material Regulatory Outsourcing']/following::div[@aria-label='Comments'])[1]","Material Regulatory Outsourcing");
			type("//*[@name='scope_of_work[0].regulatory.best_characterises_involved.material_regulatory_outsourcing.comment']", Comments , "Material Regulatory Outsourcing");	
			return this;}
		
		
		// Tick > Assistance Regulatory Investigation
		public ProposalSOWPage2 clkPropSowRegulatoryAssistance() throws InterruptedException {
			click("//*[@name='scope_of_work[0].regulatory.best_characterises_involved.assistance_regulatory_investigation.noted_accepted']", "Assistance Regulatory Investigation");
			return this;}
		
		//Expand Comment > Regulatory > Assistance Regulatory Investigation
		public ProposalSOWPage2 ExpPropSowRegulatoryAssistance(String Comments) throws InterruptedException {
			Thread.sleep(2000);
			click("(//*[text()='Assistance Regulatory Investigation']/following::div[@aria-label='Comments'])[1]","Assistance Regulatory Investigation");
			type("//*[@name='scope_of_work[0].regulatory.best_characterises_involved.assistance_regulatory_investigation.comment']", Comments , "Assistance Regulatory Investigation");	
			return this;}
		
		
		// Tick > Other
		public ProposalSOWPage2 clkPropSowRegulatoryOther() throws InterruptedException {
			click("//*[@name='scope_of_work[0].regulatory.best_characterises_involved.other.noted_accepted']", "Regulatory Other");
			return this;}
		
		
		//Expand Comment > Regulatory > Other
		public ProposalSOWPage2 ExpPropSowRegulatoryOther(String Comments) throws InterruptedException {
			Thread.sleep(2000);
			click("(//*[text()='Other']/following::div[@aria-label='Comments'])[1]","Regulatory Other");
			type("//*[@name='scope_of_work[0].regulatory.best_characterises_involved.other.comment']", Comments , "Regulatory Other");	
			return this;}
		
		
		
//17.--------------------------------------------------->  Tax   <---------------------------------------------------------------------	

	// Tick > Tax > Type
	public ProposalSOWPage2 clkPropSowTaxType() throws InterruptedException {
		click("//*[@name='scope_of_work[0].tax.type.noted_accepted']", "Type");
		return this;}
																																
																																	
	//Expand Comment > Tax > Type
	public ProposalSOWPage2 ExpPropSowTaxType(String Comments) throws InterruptedException {
		Thread.sleep(2000);
		click("(//*[text()='Type']/following::div[@aria-label='Comments'])[8]","Type");
		type("//*[@name='scope_of_work[0].tax.type.comment']", Comments , "Type");	
		return this;}

	
	// Tick > Tax > Transactional Tax
	public ProposalSOWPage2 clkPropSowTaxTransactionalTax() throws InterruptedException {
		click("//*[@name='scope_of_work[0].tax.type.transactional_tax.noted_accepted']", "Transactional Tax");
		return this;}
																																	
																																		
	//Expand Comment > Tax > Transactional Tax
	public ProposalSOWPage2 ExpPropSowTaxTransactionalTax(String Comments) throws InterruptedException {
		Thread.sleep(2000);
		click("(//*[text()='Transactional Tax']/following::div[@aria-label='Comments'])[1]","Transactional Tax");
		type("//*[@name='scope_of_work[0].tax.type.transactional_tax.comment']", Comments , "Transactional Tax");	
		return this;}
	
		
	// Tick > Tax > Tax investigation & dispute
	public ProposalSOWPage2 clkPropSowTaxInvestigationAndDispute() throws InterruptedException {
		click("//*[@name='scope_of_work[0].tax.type.tax_investigation_dispute.noted_accepted']", "Tax investigation & dispute");
		return this;}
																																		
																																			
	//Expand Comment > Tax > Tax investigation & dispute
	public ProposalSOWPage2 ExpPropSowTaxInvestigationAndDispute(String Comments) throws InterruptedException {
		Thread.sleep(2000);
		click("(//*[text()='Tax investigation & dispute']/following::div[@aria-label='Comments'])[1]","Tax investigation & dispute");
		type("//*[@name='scope_of_work[0].tax.type.tax_investigation_dispute.comment']", Comments , "Tax investigation & dispute");	
		return this;}
		

	// Tick > Tax > Transfer pricing
	public ProposalSOWPage2 clkPropSowTaxTransferPricing() throws InterruptedException {
		click("//*[@name='scope_of_work[0].tax.type.transfer_pricing.noted_accepted']", "Transfer pricing");
		return this;}
																																			
																																				
	//Expand Comment > Tax > Transfer pricing
	public ProposalSOWPage2 ExpPropSowTaxTransferPricing(String Comments) throws InterruptedException {
		Thread.sleep(2000);
		click("(//*[text()='Transfer pricing']/following::div[@aria-label='Comments'])[1]","Transfer pricing");
		type("//*[@name='scope_of_work[0].tax.type.transfer_pricing.comment']", Comments , "Transfer pricing");	
		return this;}
		
		
	// Tick > Tax > Indirect tax
	public ProposalSOWPage2 clkPropSowTaxIndirectTax() throws InterruptedException {
		click("//*[@name='scope_of_work[0].tax.type.indirect_tax.noted_accepted']", "Indirect tax");
		return this;}
																																				
																																					
	//Expand Comment > Tax > Indirect tax
	public ProposalSOWPage2 ExpPropSowTaxIndirectTax(String Comments) throws InterruptedException {
		Thread.sleep(2000);
		click("(//*[text()='Indirect tax']/following::div[@aria-label='Comments'])[1]","Indirect tax");
		type("//*[@name='scope_of_work[0].tax.type.indirect_tax.comment']", Comments , "Indirect tax");	
		return this;}
		
		
	// Tick > Tax > Tax planning
	public ProposalSOWPage2 clkPropSowTaxTaxPlanning() throws InterruptedException {
		click("//*[@name='scope_of_work[0].tax.type.tax_planning.noted_accepted']", "Tax planning");
		return this;}
																																					
																																						
	//Expand Comment > Tax > Tax planning
	public ProposalSOWPage2 ExpPropSowTaxTaxPlanning(String Comments) throws InterruptedException {
		Thread.sleep(2000);
		click("(//*[text()='Tax planning']/following::div[@aria-label='Comments'])[1]","Tax planning");
		type("//*[@name='scope_of_work[0].tax.type.tax_planning.comment']", Comments , "Tax planning");	
		return this;}
		
			
	// Tick > Tax > Tax policy
	public ProposalSOWPage2 clkPropSowTaxTaxPolicy() throws InterruptedException {
		click("//*[@name='scope_of_work[0].tax.type.tax_policy.noted_accepted']", "Tax policy");
		return this;}
																																						
																																							
	//Expand Comment > Tax > Tax policy
	public ProposalSOWPage2 ExpPropSowTaxTaxPolicy(String Comments) throws InterruptedException {
		Thread.sleep(2000);
		click("(//*[text()='Tax policy']/following::div[@aria-label='Comments'])[1]","Tax policy");
		type("//*[@name='scope_of_work[0].tax.type.tax_policy.comment']", Comments , "Tax policy");	
		return this;}
		
			
	// Tick > Tax > Other
	public ProposalSOWPage2 clkPropSowTaxTypeOther() throws InterruptedException {
		click("//*[@name='scope_of_work[0].tax.type.other.noted_accepted']", "Tax Type Other");
		return this;}
																																							
																																								
	//Expand Comment > Tax > Other
	public ProposalSOWPage2 ExpPropSowTaxTypeOther(String Comments) throws InterruptedException {
		Thread.sleep(2000);
		click("(//*[text()='Other']/following::div[@aria-label='Comments'])[1]","Tax Type Other");
		type("//*[@name='scope_of_work[0].tax.type.other.comment']", Comments , "Tax Type Other");	
		return this;}
		
			
		// Tick > Tax > Staged approach
		public ProposalSOWPage2 clkPropSowTaxStagedApproach() throws InterruptedException {
			click("//*[@name='scope_of_work[0].tax.staged_approach.noted_accepted']", "Staged approach");
			return this;}
		
																																																																																	
		//Expand Comment > Tax > Staged approach
		public ProposalSOWPage2 ExpPropSowTaxStagedApproach(String Comments) throws InterruptedException {
			Thread.sleep(2000);
			click("(//*[text()='Staged approach']/following::div[@aria-label='Comments'])[1]","Staged approach");
			type("//*[@name='scope_of_work[0].tax.staged_approach.comment']", Comments , "Staged approach");	
			return this;}
		
			
		// Tick > Tax > Implementation
		public ProposalSOWPage2 clkPropSowTaxImplementation() throws InterruptedException {
			click("//*[@name='scope_of_work[0].tax.implementation.noted_accepted']", "Implementation");
			return this;}
																																										
																																											
		//Expand Comment > Tax > Implementation
		public ProposalSOWPage2 ExpPropSowTaxImplementation(String Comments) throws InterruptedException {
			Thread.sleep(2000);
			click("(//*[text()='Implementation']/following::div[@aria-label='Comments'])[3]","Implementation");
			type("//*[@name='scope_of_work[0].tax.implementation.comment']", Comments , "Implementation");	
			return this;}
			
			
		// Tick > Tax > Corporate in charge of implementation
		public ProposalSOWPage2 clkPropSowTaxCorporateInCharge() throws InterruptedException {
			click("//*[@name='scope_of_work[0].tax.implementation.corporate_in_charge.noted_accepted']", " Corporate in charge of implementation");
			return this;}
			
			
		//Expand Comment > Tax > Corporate in charge of implementation
		public ProposalSOWPage2 ExpPropSowTaxCorporateInCharge(String Comments) throws InterruptedException {
			Thread.sleep(2000);
			click("(//*[text()='Corporate in charge of implementation']/following::div[@aria-label='Comments'])[1]","Corporate in charge of implementation");
			type("//*[@name='scope_of_work[0].tax.implementation.corporate_in_charge.comment']", Comments , "Corporate in charge of implementation");	
			return this;}
		
		
		// Tick > Tax > Legal services provider to advise on implementation
		public ProposalSOWPage2 clkPropSowTaxAdviseOnImplementation() throws InterruptedException {
			click("//*[@name='scope_of_work[0].tax.implementation.legal_services_advise.noted_accepted']", "Legal services provider to advise on implementation");
			return this;}	

		//Expand Comment > Tax > Legal services provider to advise on implementation
		public ProposalSOWPage2 ExpPropSowTaxAdviseOnImplementation(String Comments) throws InterruptedException {
			Thread.sleep(2000);
			click("(//*[text()='Legal services provider to advise on implementation']/following::div[@aria-label='Comments'])[1]","Legal services provider to advise on implementation");
			type("//*[@name='scope_of_work[0].tax.implementation.legal_services_advise.comment']", Comments , "Legal services provider to advise on implementation");	
			return this;}
			
			
			
			
	//18.--------------------------------------------------->  Proposal Other   <---------------------------------------------------------------------	

		// Tick > Other
			public ProposalSOWPage2 clkPropSowOther() throws InterruptedException {
				click("//*[@name='scope_of_work[0].other.noted_accepted']", "Other");
				return this;}
																																
																																		
		//Expand Comment > Other
			public ProposalSOWPage2 ExpPropSowOther(String Comments) throws InterruptedException {
				Thread.sleep(2000);
				click("(//*[text()='Other']/following::div[@aria-label='Comments'])[1]"," Other");
				type("//*[@name='scope_of_work[0].other.comment']", Comments , " Other");	
				return this;}	
			
			
			
			
}