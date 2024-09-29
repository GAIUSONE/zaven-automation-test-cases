package page.services;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import com.force.base.ProjectHooks;
import com.force.config.ConfigurationManager;
import com.microsoft.playwright.BrowserContext;
import com.microsoft.playwright.PlaywrightException;
import page.base.ZavenHooks;

public class ProposalSOWPage extends ProjectHooks{

	//----------------------------------------------------->  Scope of Work (SOW)* <---------------------------------------------------------------------
	
	//1.--------------------------------------------------->  Commercial contracts <---------------------------------------------------------------------
	
	// Tick > Commercial contracts > Legal advice
		public ProposalSOWPage clkPropSowCommercialLegalAdvice() throws InterruptedException {
			click("//*[@name='scope_of_work[0].commercial_contracts.legal_advice.noted_accepted']", "Legal advice");
			return this;}
				
			
  //Expand Comment >  Commercial contracts >  Legal advice
		public ProposalSOWPage ExpPropSowCommercialLegalAdvice(String Comments) throws InterruptedException {
			Thread.sleep(2000);
			click("(//*[text()='Legal advice']/following::div[@aria-label='Comments'])[1]","Legal advice");
			type("//*[@name='scope_of_work[0].commercial_contracts.legal_advice.comment']", Comments , "Legal advice");	
			return this;}
		
		// Tick > Contract drafting
		public ProposalSOWPage clkPropSowCommercialContractDrafting() throws InterruptedException {
			click("//*[@name='scope_of_work[0].commercial_contracts.contract_drafting.noted_accepted']", "Contract drafting");
			return this;}
		
		
		//Expand Comment > Contract drafting
		public ProposalSOWPage ExpPropSowCommercialContractDrafting(String Comments) throws InterruptedException {
			Thread.sleep(2000);
			click("(//*[text()='Contract drafting']/following::div[@aria-label='Comments'])[1]","Contract drafting");
			type("//*[@name='scope_of_work[0].commercial_contracts.contract_drafting.comment']", Comments , "Contract drafting");	
			return this;}
		
		

		// Tick > Contract review
		public ProposalSOWPage clkPropSowCommercialReview() throws InterruptedException {
			click("//*[@name='scope_of_work[0].commercial_contracts.contract_review.noted_accepted']", "Contract Review");
			return this;}
		
		
		
		//Expand Comment > Contract review
		public ProposalSOWPage ExpPropSowCommercialReview(String Comments) throws InterruptedException {
			Thread.sleep(2000);
			click("(//*[text()='Contract review']/following::div[@aria-label='Comments'])[1]","Contract review");
			type("//*[@name='scope_of_work[0].commercial_contracts.contract_review.comment']", Comments , "Contract review");	
			return this;}
		
		
		// Tick > Negotiation
		public ProposalSOWPage clkPropSowCommercialNegotiation() throws InterruptedException {
			click("//*[@name='scope_of_work[0].commercial_contracts.negotiation.noted_accepted']", "Negotiation");
			return this;}
		
		
		//Expand Comment > Negotiation
		public ProposalSOWPage ExpPropSowCommercialNegotiation(String Comments) throws InterruptedException {
			Thread.sleep(2000);
			click("(//*[text()='Negotiation']/following::div[@aria-label='Comments'])[1]","Negotiation");
			type("//*[@name='scope_of_work[0].commercial_contracts.negotiation.comment']", Comments , "Negotiation");	
			return this;}
		
		
		
		// Tick > Regulatory
		public ProposalSOWPage clkPropSowCommercialRegulatory() throws InterruptedException {
			click("//*[@name='scope_of_work[0].commercial_contracts.regulatory.noted_accepted']", "Regulatory");
			return this;}
		
			
		//Expand Comment > Regulatory
		public ProposalSOWPage ExpPropSowCommercialRegulatory(String Comments) throws InterruptedException {
			Thread.sleep(2000);
			click("(//*[text()='Regulatory']/following::div[@aria-label='Comments'])[1]","Regulatory");
			type("//*[@name='scope_of_work[0].commercial_contracts.regulatory.comment']", Comments , "Regulatory");	
			return this;}
		
		
		// Tick > Commercial contracts > Other
		public ProposalSOWPage clkPropSowCommercialOther() throws InterruptedException {
			click("//*[@name='scope_of_work[0].commercial_contracts.other.noted_accepted']", "Commercial contracts Other");
			return this;}
		
		
		
		//Expand Comment > Commercial contracts > Other
		public ProposalSOWPage ExpPropSowCommercialOther(String Comments) throws InterruptedException {
			Thread.sleep(2000);
			click("(//*[text()='Other']/following::div[@aria-label='Comments'])[1]","Commercial contracts Other");
			type("//*[@name='scope_of_work[0].commercial_contracts.other.comment']", Comments , "Commercial contracts Other");	
			return this;}
		
		
		// Sow > Commercial contracts >  Additional Information
		public ProposalSOWPage PropAdditionalInformation(String SowAdditionalInformationcomments) throws InterruptedException {
			type("//*[@name='scope_of_work[0].additional_information.comment']", SowAdditionalInformationcomments , "Sow Additional Information");
			return this;}	
		
		
	
//2.--------------------------------------------------->  Competition   <---------------------------------------------------------------------	


		// Tick > Competition > Merger control advice/filing
		public ProposalSOWPage clkPropSowCompetitionMerger() throws InterruptedException {
			click("//*[@name='scope_of_work[0].competition.transactional_work.merger_control.noted_accepted']", "Merger control advice/filing");
			return this;}
				
					
		//Expand Comment > Competition > Merger control advice/filing
		public ProposalSOWPage ExpPropSowCompetitionMerger(String Comments) throws InterruptedException {
			Thread.sleep(2000);
			click("(//*[text()='Merger control advice/filing']/following::div[@aria-label='Comments'])[1]","Merger control advice/filing Comments");
			type("//*[@name='scope_of_work[0].competition.transactional_work.merger_control.comment']", Comments , "Merger control advice/filing Comments");	
			return this;}
				
				
		// Tick > Competition > Advice
		public ProposalSOWPage clkPropSowCompetitionAdvice() throws InterruptedException {
			click("//*[@name='scope_of_work[0].competition.transactional_work.advice.noted_accepted']", "Advice");
			return this;}
						
							
		//Expand Comment > Competition > Advice
		public ProposalSOWPage ExpPropSowCompetitionAdvice(String Comments) throws InterruptedException {
			Thread.sleep(2000);
			click("(//*[text()='Advice']/following::div[@aria-label='Comments'])[1]","Advice");
			type("//*[@name='scope_of_work[0].competition.transactional_work.advice.comment']", Comments , "Advice");	
			return this;}
		
		
		// Tick > Competition > Cartel Investigation
		public ProposalSOWPage clkPropSowCompetitionCartel() throws InterruptedException {
			click("//*[@name='scope_of_work[0].competition.behavioural_work.cartel_investigation.noted_accepted']", "Cartel Investigation");
			return this;}
								
									
		//Expand Comment > Competition > Cartel Investigation
		public ProposalSOWPage ExpPropSowCompetitionCartel(String Comments) throws InterruptedException {
			Thread.sleep(2000);
			click("(//*[text()='Cartel Investigation']/following::div[@aria-label='Comments'])[1]","Cartel Investigation");
			type("//*[@name='scope_of_work[0].competition.behavioural_work.cartel_investigation.comment']", Comments , "Cartel Investigation");	
			return this;}
		
		
		// Tick > Competition > Antitrust Investigation
		public ProposalSOWPage clkPropSowCompetitionAntitrust() throws InterruptedException {
			click("//*[@name='scope_of_work[0].competition.behavioural_work.antitrust_investigation.noted_accepted']", "Antitrust Investigation");
			return this;}
										
											
		//Expand Comment > Competition > Antitrust Investigation
		public ProposalSOWPage ExpPropSowCompetitionAntitrust(String Comments) throws InterruptedException {
			Thread.sleep(2000);
			click("(//*[text()='Antitrust Investigation']/following::div[@aria-label='Comments'])[1]","Antitrust Investigation");
			type("//*[@name='scope_of_work[0].competition.behavioural_work.antitrust_investigation.comment']", Comments , "Antitrust Investigation");	
			return this;}		


		// Tick > Competition > State Aid Investigation
		public ProposalSOWPage clkPropSowCompetitionStateAid() throws InterruptedException {
			click("//*[@name='scope_of_work[0].competition.behavioural_work.state_aid_investigation.noted_accepted']", "State Aid Investigation");
			return this;}
												
													
		//Expand Comment > Competition > State Aid Investigation
		public ProposalSOWPage ExpPropSowCompetitionStateAid(String Comments) throws InterruptedException {
			Thread.sleep(2000);
			click("(//*[text()='State Aid Investigation']/following::div[@aria-label='Comments'])[1]","State Aid Investigation");
			type("//*[@name='scope_of_work[0].competition.behavioural_work.state_aid_investigation.comment']", Comments , "State Aid Investigation");	
			return this;}


		
		// Tick > Competition > Behavioural work Advice
		public ProposalSOWPage clkPropSowCompetitionBehaviouralAdvice() throws InterruptedException {
			click("//*[@name='scope_of_work[0].competition.behavioural_work.advice.noted_accepted']", "Behavioural work Advice");
			return this;}
														
															
		//Expand Comment > Competition > Behavioural work Advice
		public ProposalSOWPage ExpPropSowCompetitionBehaviouralAdvice(String Comments) throws InterruptedException {
			Thread.sleep(2000);
			click("(//*[text()='State Aid Investigation']/following::div[@aria-label='Comments'])[2]","Behavioural work Advice");
			type("//*[@name='scope_of_work[0].competition.behavioural_work.advice.comment']", Comments , "Behavioural work Advice");	
			return this;}
				
		
		// Tick > Competition > Other
		public ProposalSOWPage clkPropSowCompetitionOther() throws InterruptedException {
			click("//*[@name='scope_of_work[0].competition.other.noted_accepted']", "Competition Other");
			return this;}
														
															
		//Expand Comment > Competition > Other
		public ProposalSOWPage ExpPropSowCompetitionOther(String Comments) throws InterruptedException {
			Thread.sleep(2000);
			click("(//*[text()='Other']/following::div[@aria-label='Comments'])[1]","Competition Other");
			type("//*[@name='scope_of_work[0].competition.other.comment']", Comments , "Competition Other");	
			return this;}
		
//3.--------------------------------------------------->  Corporate M&A   <---------------------------------------------------------------------	

		// Tick > Corporate M&A > Term Sheet Negotiation
		public ProposalSOWPage clkPropSowCorporateTermSheet() throws InterruptedException {
			click("//*[@name='scope_of_work[0].corporate_ma.term_sheet_negotiation.noted_accepted']", "Term Sheet Negotiation");
			return this;}
																
																	
		//Expand Comment > Corporate M&A > Term Sheet Negotiation
		public ProposalSOWPage ExpPropSowCorporateTermSheet(String Comments) throws InterruptedException {
			Thread.sleep(2000);
			click("(//*[text()='Term Sheet Negotiation']/following::div[@aria-label='Comments'])[1]","Term Sheet Negotiation");
			type("//*[@name='scope_of_work[0].corporate_ma.term_sheet_negotiation.comment']", Comments , "Term Sheet Negotiation");	
			return this;}	
		
		
		// Tick > Corporate M&A > Due Diligence
		public ProposalSOWPage clkPropSowCorporateDueDiligence() throws InterruptedException {
			click("//*[@name='scope_of_work[0].corporate_ma.due_diligence.noted_accepted']", "Due Diligence");
			return this;}
																		
																			
		//Expand Comment > Corporate M&A > Due Diligence
		public ProposalSOWPage ExpPropSowCorporateDueDiligence(String Comments) throws InterruptedException {
			Thread.sleep(2000);
			click("(//*[text()='Due Diligence']/following::div[@aria-label='Comments'])[5]","Due Diligence");
			type("//*[@name='scope_of_work[0].corporate_ma.due_diligence.comment']", Comments , "Due Diligence");	
			return this;}	
		
		
		// Tick > Corporate M&A > Red Flag Only
		public ProposalSOWPage clkPropSowCorporateRedFlag() throws InterruptedException {
			click("//*[@name='scope_of_work[0].corporate_ma.due_diligence.red_flag_only.noted_accepted']", "Red Flag Only");
			return this;}
																		
																			
		//Expand Comment > Corporate M&A > Red Flag Only
		public ProposalSOWPage ExpPropSowCorporateRedFlag(String Comments) throws InterruptedException {
			Thread.sleep(2000);
			click("(//*[text()='Red Flag Only']/following::div[@aria-label='Comments'])[1]","Red Flag Only");
			type("//*[@name='scope_of_work[0].corporate_ma.due_diligence.red_flag_only.comment']", Comments , "Red Flag Only");	
			return this;}	
		
		
		// Tick > Corporate M&A > Vendor ldd available
		public ProposalSOWPage clkPropSowCorporateVendorldd() throws InterruptedException {
			click("//*[@name='scope_of_work[0].corporate_ma.due_diligence.vendor_ldd_available.noted_accepted']", "Vendor ldd available");
			return this;}
																		
																			
		//Expand Comment > Corporate M&A > Vendor ldd available
		public ProposalSOWPage ExpPropSowCorporateVendorldd(String Comments) throws InterruptedException {
			Thread.sleep(2000);
			click("(//*[text()='Vendor ldd available']/following::div[@aria-label='Comments'])[1]","Vendor ldd available");
			type("//*[@name='scope_of_work[0].corporate_ma.due_diligence.vendor_ldd_available.comment']", Comments , "Vendor ldd available");	
			return this;}	
		
		
		// Tick > Corporate M&A > Online data room
		public ProposalSOWPage clkPropSowCorporateOnlineDataRoom() throws InterruptedException {
			click("//*[@name='scope_of_work[0].corporate_ma.due_diligence.online_data_room.noted_accepted']", "Online data room");
			return this;}
																				
																					
		//Expand Comment > Corporate M&A > Online data room
		public ProposalSOWPage ExpPropSowCorporateOnlineDataRoom(String Comments) throws InterruptedException {
			Thread.sleep(2000);
			click("(//*[text()='Online data room']/following::div[@aria-label='Comments'])[1]","Online data room");
			type("//*[@name='scope_of_work[0].corporate_ma.due_diligence.online_data_room.comment']", Comments , "Online data room");	
			return this;}	
				
				
		// Tick > Corporate M&A > Key area of focus
		public ProposalSOWPage clkPropSowCorporateKeyArea() throws InterruptedException {
			click("//*[@name='scope_of_work[0].corporate_ma.due_diligence.key_area_of_focus.noted_accepted']", "Key area of focus");
			return this;}
																				
																					
		//Expand Comment > Corporate M&A > Key area of focus
		public ProposalSOWPage ExpPropSowCorporateKeyArea(String Comments) throws InterruptedException {
			Thread.sleep(2000);
			click("(//*[text()='Key area of focus']/following::div[@aria-label='Comments'])[1]","Key area of focus");
			type("//*[@name='scope_of_work[0].corporate_ma.due_diligence.key_area_of_focus.comment']", Comments , "Key area of focus");	
			return this;}	
		
		
		// Tick > Corporate M&A > Regulatory
		public ProposalSOWPage clkPropSowCorporateRegulatory() throws InterruptedException {
			click("//*[@name='scope_of_work[0].corporate_ma.regulatory.noted_accepted']", "Regulatory");
			return this;}
																						
																							
		//Expand Comment > Corporate M&A > Regulatory
		public ProposalSOWPage ExpPropSowCorporateRegulatory(String Comments) throws InterruptedException {
			Thread.sleep(2000);
			click("(//*[text()='Regulatory']/following::div[@aria-label='Comments'])[1]","Regulatory");
			type("//*[@name='scope_of_work[0].corporate_ma.regulatory.comment']", Comments , "Regulatory");	
			return this;}
		
		
		// Tick > Corporate M&A > Transaction Documentation
		public ProposalSOWPage clkPropSowCorporateTransaction() throws InterruptedException {
			click("//*[@name='scope_of_work[0].corporate_ma.transaction_documentation.noted_accepted']", "Transaction Documentation");
			return this;}
																								
																									
		//Expand Comment > Corporate M&A > Transaction Documentation
		public ProposalSOWPage ExpPropSowCorporateTransaction(String Comments) throws InterruptedException {
			Thread.sleep(2000);
			click("(//*[text()='Transaction Documentation']/following::div[@aria-label='Comments'])[3]","Transaction Documentation");
			type("//*[@name='scope_of_work[0].corporate_ma.transaction_documentation.comment']", Comments , "Transaction Documentation");	
			return this;}
		
		
		// Tick > Corporate M&A > Draft main documents (hold the pen)
		public ProposalSOWPage clkPropSowCorporateMainDocument() throws InterruptedException {
			click("//*[@name='scope_of_work[0].corporate_ma.transaction_documentation.draft_document.noted_accepted']", "Draft main documents");
			return this;}
																								
																									
		//Expand Comment > Corporate M&A > Draft main documents (hold the pen)
		public ProposalSOWPage ExpPropSowCorporateMainDocument(String Comments) throws InterruptedException {
			Thread.sleep(2000);
			click("(//*[text()='Draft main documents (hold the pen)']/following::div[@aria-label='Comments'])[1]","Draft main documents");
			type("//*[@name='scope_of_work[0].corporate_ma.transaction_documentation.draft_document.comment']", Comments , "Draft main documents");	
			return this;}
				
				
		// Tick > Corporate M&A > Review main documents
		public ProposalSOWPage clkPropSowCorporateReview() throws InterruptedException {
			click("//*[@name='scope_of_work[0].corporate_ma.transaction_documentation.review_document.noted_accepted']", "Review main documents");
			return this;}
																										
																											
		//Expand Comment > Corporate M&A > Review main documents
		public ProposalSOWPage ExpPropSowCorporateReview(String Comments) throws InterruptedException {
			Thread.sleep(2000);
			click("(//*[text()='Review main documents']/following::div[@aria-label='Comments'])[1]","Review main documents");
			type("//*[@name='scope_of_work[0].corporate_ma.transaction_documentation.review_document.comment']", Comments , "Review main documents");	
			return this;}	
		
		
		
		// Tick > Corporate M&A > WI Policy
		public ProposalSOWPage clkPropSowCorporateWIPolicy() throws InterruptedException {
			click("//*[@name='scope_of_work[0].corporate_ma.wi_policy.noted_accepted']", "WI Policy");
			return this;}
																												
																													
		//Expand Comment > WI Policy
		public ProposalSOWPage ExpPropSowCorporateWIPolic(String Comments) throws InterruptedException {
			Thread.sleep(2000);
			click("(//*[text()='WI Policy']/following::div[@aria-label='Comments'])[1]","WI Policy");
			type("//*[@name='scope_of_work[0].corporate_ma.wi_policy.comment']", Comments , "WI Policy");	
			return this;}	
				
		// Tick > Corporate M&A > Financing
		public ProposalSOWPage clkPropSowCorporateFinancing() throws InterruptedException {
			click("//*[@name='scope_of_work[0].corporate_ma.financing.noted_accepted']", "Financing");
			return this;}
																												
																													
		//Expand Comment > Corporate M&A > Financing
		public ProposalSOWPage ExpPropSowCorporateFinancing(String Comments) throws InterruptedException {
			Thread.sleep(2000);
			click("(//*[text()='Financing']/following::div[@aria-label='Comments'])[1]","Financing");
			type("//*[@name='scope_of_work[0].corporate_ma.financing.comment']", Comments , "Financing");	
			return this;}	
		
		
		// Tick > Corporate M&A > Signing Process
		public ProposalSOWPage clkPropSowCorporateSigning() throws InterruptedException {
			click("//*[@name='scope_of_work[0].corporate_ma.signing_process.noted_accepted']", "Signing Process");
			return this;}
																														
																															
		//Expand Comment > Corporate M&A > Signing Process
		public ProposalSOWPage ExpPropSowCorporateSigning(String Comments) throws InterruptedException {
			Thread.sleep(2000);
			click("(//*[text()='Signing Process']/following::div[@aria-label='Comments'])[1]","Signing Process");
			type("//*[@name='scope_of_work[0].corporate_ma.signing_process.comment']", Comments , "Signing Process");	
			return this;}
				
				
		// Tick > Corporate M&A > Closing Process
		public ProposalSOWPage clkPropSowCorporateClosing() throws InterruptedException {
			click("//*[@name='scope_of_work[0].corporate_ma.closing_process.noted_accepted']", "Closing Process");
			return this;}
																														
																															
		//Expand Comment > Corporate M&A > Closing Process
		public ProposalSOWPage ExpPropSowCorporateClosing(String Comments) throws InterruptedException {
			Thread.sleep(2000);
			click("(//*[text()='Closing Process']/following::div[@aria-label='Comments'])[1]","Closing Process");
			type("//*[@name='scope_of_work[0].corporate_ma.closing_process.comment']", Comments , "Closing Process");	
			return this;}	
				
		
		// Tick > Corporate M&A > Other
		public ProposalSOWPage clkPropSowCorporateOther() throws InterruptedException {
			click("//*[@name='scope_of_work[0].corporate_ma.other.noted_accepted']", "Corporate Other");
			return this;}
																														
																															
		//Expand Comment > Corporate M&A > Other
		public ProposalSOWPage ExpPropSowCorporateOther(String Comments) throws InterruptedException {
			Thread.sleep(2000);
			click("(//*[text()='Other']/following::div[@aria-label='Comments'])[1]","Corporate Other");
			type("//*[@name='scope_of_work[0].corporate_ma.other.comment']", Comments , "Corporate Other");	
			return this;}	
				
	
//4.--------------------------------------------------->  Data protection & privacy   <---------------------------------------------------------------------	

		// Tick > Data protection & privacy > Data protection compliance programme
		public ProposalSOWPage clkPropSowDataComplianceProgramme() throws InterruptedException {
			click("//*[@name='scope_of_work[0].data_protection_privacy.compliance_programme.noted_accepted']", "Data protection compliance programme");
			return this;}
																																
																																	
		//Expand Comment > Data protection & privacy > Data protection compliance programme
		public ProposalSOWPage ExpPropSowDataComplianceProgramme(String Comments) throws InterruptedException {
			Thread.sleep(2000);
			click("(//*[text()='Data protection compliance programme']/following::div[@aria-label='Comments'])[1]","Data protection compliance programme");
			type("//*[@name='scope_of_work[0].data_protection_privacy.compliance_programme.comment']", Comments , "Data protection compliance programme");	
			return this;}


		// Tick > Data protection & privacy > Issues for new processing system / arrangement
		public ProposalSOWPage clkPropSowDataProcessingSystem() throws InterruptedException {
			click("//*[@name='scope_of_work[0].data_protection_privacy.processing_system.noted_accepted']", "Issues for new processing system / arrangement");
			return this;}
																																		
																																			
		//Expand Comment > Data protection & privacy > Issues for new processing system / arrangement
		public ProposalSOWPage ExpPropSowDataProcessingSystem(String Comments) throws InterruptedException {
			Thread.sleep(2000);
			click("(//*[text()='Issues for new processing system / arrangement']/following::div[@aria-label='Comments'])[1]","Issues for new processing system / arrangement");
			type("//*[@name='scope_of_work[0].data_protection_privacy.processing_system.comment']", Comments , "Issues for new processing system / arrangement");	
			return this;}

		
		// Tick > Data protection & privacy > Review data protection policies
		public ProposalSOWPage clkPropSowDataReviewData() throws InterruptedException {
			click("//*[@name='scope_of_work[0].data_protection_privacy.review_policy.noted_accepted']", "Review data protection policies");
			return this;}
																																				
																																					
		//Expand Comment > Data protection & privacy > Review data protection policies
		public ProposalSOWPage ExpPropSowDataReviewData(String Comments) throws InterruptedException {
			Thread.sleep(2000);
			click("(//*[text()='Review data protection policies']/following::div[@aria-label='Comments'])[1]","Review data protection policies");
			type("//*[@name='scope_of_work[0].data_protection_privacy.review_policy.comment']", Comments , "Review data protection policies");	
			return this;}
		
		
		// Tick > Data protection & privacy > Localise data protection programme to new jurisdiction
		public ProposalSOWPage clkPropSowDataLocaliseData() throws InterruptedException {
			click("//*[@name='scope_of_work[0].data_protection_privacy.localise_programme.noted_accepted']", "Localise data protection programme to new jurisdiction");
			return this;}
																																						
																																							
		//Expand Comment > Data protection & privacy > Localise data protection programme to new jurisdiction
		public ProposalSOWPage ExpPropSowDataLocaliseData(String Comments) throws InterruptedException {
			Thread.sleep(2000);
			click("(//*[text()='Localise data protection programme to new jurisdiction']/following::div[@aria-label='Comments'])[1]","Localise data protection programme to new jurisdiction");
			type("//*[@name='scope_of_work[0].data_protection_privacy.localise_programme.comment']", Comments , "Localise data protection programme to new jurisdiction");	
			return this;}
		
		
		// Tick > Data protection & privacy > Advice on change in law
		public ProposalSOWPage clkPropSowDataChangeInLaw() throws InterruptedException {
			click("//*[@name='scope_of_work[0].data_protection_privacy.change_advice.noted_accepted']", "Advice on change in law");
			return this;}
																																								
																																									
		//Expand Comment > Data protection & privacy > Advice on change in law
		public ProposalSOWPage ExpPropSowDataChangeInLaw(String Comments) throws InterruptedException {
			Thread.sleep(2000);
			click("(//*[text()='Advice on change in law']/following::div[@aria-label='Comments'])[1]","Advice on change in law");
			type("//*[@name='scope_of_work[0].data_protection_privacy.change_advice.comment']", Comments , "Advice on change in law");	
			return this;}
		
		
		// Tick > Data protection & privacy > Data protection re-papering exercise
		public ProposalSOWPage clkPropSowDataRePapering() throws InterruptedException {
			click("//*[@name='scope_of_work[0].data_protection_privacy.re_papering.noted_accepted']", "Data protection re-papering exercise");
			return this;}
																																										
																																											
		//Expand Comment > Data protection & privacy > Data protection re-papering exercise
		public ProposalSOWPage ExpPropSowDataRePapering(String Comments) throws InterruptedException {
			Thread.sleep(2000);
			click("(//*[text()='Data protection re-papering exercise']/following::div[@aria-label='Comments'])[1]","Data protection re-papering exercise");
			type("//*[@name='scope_of_work[0].data_protection_privacy.re_papering.comment']", Comments , "Data protection re-papering exercise");	
			return this;}
		
		
		// Tick > Data protection & privacy > Direct marketing advice
		public ProposalSOWPage clkPropSowDataMarketingAdvice() throws InterruptedException {
			click("//*[@name='scope_of_work[0].data_protection_privacy.marketing_advice.noted_accepted']", "Direct marketing advice");
			return this;}
																																												
																																													
		//Expand Comment > Data protection & privacy > Direct marketing advice
		public ProposalSOWPage ExpPropSowDataMarketingAdvice(String Comments) throws InterruptedException {
			Thread.sleep(2000);
			click("(//*[text()='Direct marketing advice']/following::div[@aria-label='Comments'])[1]","Direct marketing advice");
			type("//*[@name='scope_of_work[0].data_protection_privacy.marketing_advice.comment']", Comments , "Direct marketing advice");	
			return this;}
		
		
		// Tick > Data protection & privacy > Record retention / destruction programme
		public ProposalSOWPage clkPropSowDataRecordRetention() throws InterruptedException {
			click("//*[@name='scope_of_work[0].data_protection_privacy.record_retention.noted_accepted']", "Record retention / destruction programme");
			return this;}
																																														
																																															
		//Expand Comment > Data protection & privacy > Record retention / destruction programme
		public ProposalSOWPage ExpPropSowDataRecordRetention(String Comments) throws InterruptedException {
			Thread.sleep(2000);
			click("(//*[text()='Record retention / destruction programme']/following::div[@aria-label='Comments'])[1]","Record retention / destruction programme");
			type("//*[@name='scope_of_work[0].data_protection_privacy.record_retention.comment']", Comments , "Record retention / destruction programme");	
			return this;}
		
		
		// Tick > Data protection & privacy > Data security breach
		public ProposalSOWPage clkPropSowDataSecurityBreach() throws InterruptedException {
			click("//*[@name='scope_of_work[0].data_protection_privacy.data_security_breach.noted_accepted']", "Data security breach");
			return this;}
																																																
																																																	
		//Expand Comment > Data protection & privacy > Data security breach
		public ProposalSOWPage ExpPropSowDataSecurityBreach(String Comments) throws InterruptedException {
			Thread.sleep(2000);
			click("(//*[text()='Data security breach']/following::div[@aria-label='Comments'])[1]","Data security breach");
			type("//*[@name='scope_of_work[0].data_protection_privacy.data_security_breach.comment']", Comments , "Data security breach");	
			return this;}
		
		
		// Tick > Data protection & privacy > Exercise of data subject rights
		public ProposalSOWPage clkPropSowDataSubjectRights() throws InterruptedException {
			click("//*[@name='scope_of_work[0].data_protection_privacy.exercise_subject_rights.noted_accepted']", "Exercise of data subject rights");
			return this;}
																																																
																																																	
		//Expand Comment > Data protection & privacy > Exercise of data subject rights
		public ProposalSOWPage ExpPropSowDataSubjectRights(String Comments) throws InterruptedException {
			Thread.sleep(2000);
			click("(//*[text()='Exercise of data subject rights']/following::div[@aria-label='Comments'])[1]","Exercise of data subject rights");
			type("//*[@name='scope_of_work[0].data_protection_privacy.exercise_subject_rights.comment']", Comments , "Exercise of data subject rights");	
			return this;}
		
	
		// Tick > Data protection & privacy > Data protection regulatory investigation / dispute
		public ProposalSOWPage clkPropSowDataRegulatoryInvestigation() throws InterruptedException {
			click("//*[@name='scope_of_work[0].data_protection_privacy.regulatory_investigation.noted_accepted']", "Data protection regulatory investigation / dispute");
			return this;}
																																																		
																																																			
		//Expand Comment > Data protection & privacy > Data protection regulatory investigation / dispute
		public ProposalSOWPage ExpPropSowDataRegulatoryInvestigation(String Comments) throws InterruptedException {
			Thread.sleep(2000);
			click("(//*[text()='Data protection regulatory investigation / dispute']/following::div[@aria-label='Comments'])[1]","Data protection regulatory investigation / dispute");
			type("//*[@name='scope_of_work[0].data_protection_privacy.regulatory_investigation.comment']", Comments , "Data protection regulatory investigation / dispute");	
			return this;}
		
		
		// Tick > Data protection & privacy > Retainer for ad hoc data protection queries
		public ProposalSOWPage clkPropSowDataRetainer() throws InterruptedException {
			click("//*[@name='scope_of_work[0].data_protection_privacy.protection_retainer.noted_accepted']", "Retainer for ad hoc data protection queries");
			return this;}
																																																				
																																																					
		//Expand Comment > Data protection & privacy > Retainer for ad hoc data protection queries
		public ProposalSOWPage ExpPropSowDataRetainer(String Comments) throws InterruptedException {
			Thread.sleep(2000);
			click("(//*[text()='Retainer for ad hoc data protection queries']/following::div[@aria-label='Comments'])[1]","Retainer for ad hoc data protection queries");
			type("//*[@name='scope_of_work[0].data_protection_privacy.protection_retainer.comment']", Comments , "Retainer for ad hoc data protection queries");	
			return this;}
			
		
		// Tick > Data protection & privacy > Data protection training
		public ProposalSOWPage clkPropSowDataTraining() throws InterruptedException {
			click("//*[@name='scope_of_work[0].data_protection_privacy.protection_training.noted_accepted']", "Data protection training");
			return this;}
																																																				
																																																					
		//Expand Comment > Data protection & privacy > Data protection training
		public ProposalSOWPage ExpPropSowDataTraining(String Comments) throws InterruptedException {
			Thread.sleep(2000);
			click("(//*[text()='Data protection training']/following::div[@aria-label='Comments'])[1]","Data protection training");
			type("//*[@name='scope_of_work[0].data_protection_privacy.protection_training.comment']", Comments , "Data protection training");	
			return this;}
		
		
		// Tick > Data protection & privacy > Other
		public ProposalSOWPage clkPropSowDataOther() throws InterruptedException {
			click("//*[@name='scope_of_work[0].data_protection_privacy.other.noted_accepted']", "Data protection & privacy Other");
			return this;}
																																																				
																																																					
		//Expand Comment > Data protection & privacy > Other
		public ProposalSOWPage ExpPropSowDataOther(String Comments) throws InterruptedException {
			Thread.sleep(2000);
			click("(//*[text()='Other']/following::div[@aria-label='Comments'])[1]","Data protection & privacy Other");
			type("//*[@name='scope_of_work[0].data_protection_privacy.other.comment']", Comments , "Data protection & privacy Other");	
			return this;}

		
//5.--------------------------------------------------->  Employment   <---------------------------------------------------------------------	

		
		// Tick > Retainer for general HR legal advice and support
		public ProposalSOWPage clkPropSowEmploymentLegalAdviceAndSupport() throws InterruptedException {
			click("//*[@name='scope_of_work[0].employment.retainer_hr.noted_accepted']", "Retainer for general HR legal advice and support");
			return this;}
		
		
		//Expand Comment > Employment > Retainer for general HR legal advice and support
		public ProposalSOWPage ExpPropSowEmploymentLegalAdviceAndSupport(String Comments) throws InterruptedException {
			Thread.sleep(2000);
			click("(//*[text()='Retainer for general HR legal advice and support']/following::div[@aria-label='Comments'])[1]","Retainer for general HR legal advice and support");
			type("//*[@name='scope_of_work[0].employment.retainer_hr.comment']", Comments , "Retainer for general HR legal advice and support");	
			return this;}
	
		
		// Tick > Review of HR contracts, policies and handbooks
		public ProposalSOWPage clkPropSowEmploymentHandbooks() throws InterruptedException {
			click("//*[@name='scope_of_work[0].employment.review_hr.noted_accepted']", "Review of HR contracts, policies and handbooks");
			return this;}

		
		//Expand Comment > Employment > Review of HR contracts, policies and handbooks
		public ProposalSOWPage ExpPropSowEmploymentHandbooks(String Comments) throws InterruptedException {
			Thread.sleep(2000);
			click("(//*[text()='Review of HR contracts, policies and handbooks']/following::div[@aria-label='Comments'])[1]","Review of HR contracts, policies and handbooks");
			type("//*[@name='scope_of_work[0].employment.review_hr.comment']", Comments , "Review of HR contracts, policies and handbooks");	
			return this;}
	
		
		// Tick > Drafting/reviewing employment contracts, offer letters for incoming hire
		public ProposalSOWPage clkPropSowEmploymentIncomingHire() throws InterruptedException {
			click("//*[@name='scope_of_work[0].employment.review_contracts.noted_accepted']", "Drafting/reviewing employment contracts, offer letters for incoming hire");
			return this;}

		
		//Expand Comment > Employment > Drafting/reviewing employment contracts, offer letters for incoming hire
		public ProposalSOWPage ExpPropSowEmploymentIncomingHire(String Comments) throws InterruptedException {
			Thread.sleep(2000);
			click("(//*[text()='Drafting/reviewing employment contracts, offer letters for incoming hire']/following::div[@aria-label='Comments'])[1]"," Drafting/reviewing employment contracts, offer letters for incoming hire");
			type("//*[@name='scope_of_work[0].employment.review_contracts.comment']", Comments , " Drafting/reviewing employment contracts, offer letters for incoming hire");	
			return this;}
	
		
		
		// Tick > Advising on restrictions relevant to potential new hires
		public ProposalSOWPage clkPropSowEmploymentNewHires() throws InterruptedException {
			click("//*[@name='scope_of_work[0].employment.hire_advice.noted_accepted']", "Advising on restrictions relevant to potential new hires");
			return this;}
		
		
		//Expand Comment > Employment > Advising on restrictions relevant to potential new hires
		public ProposalSOWPage ExpPropSowEmploymentNewHires(String Comments) throws InterruptedException {
			Thread.sleep(2000);
			click("(//*[text()='Advising on restrictions relevant to potential new hires']/following::div[@aria-label='Comments'])[1]","Advising on restrictions relevant to potential new hires");
			type("//*[@name='scope_of_work[0].employment.hire_advice.comment']", Comments , " Advising on restrictions relevant to potential new hires");	
			return this;}
	
		
		// Tick > Redundancy(ies)
		public ProposalSOWPage clkPropSowEmploymentRedundancy() throws InterruptedException {
			click("//*[@name='scope_of_work[0].employment.redundancy.noted_accepted']", "Redundancy(ies)");
			return this;}
		
		//Expand Comment > Employment > Redundancy(ies)
		public ProposalSOWPage ExpPropSowEmploymentRedundancy(String Comments) throws InterruptedException {
			Thread.sleep(2000);
			click("(//*[text()='Redundancy(ies)']/following::div[@aria-label='Comments'])[1]","Redundancy(ies)");
			type("//*[@name='scope_of_work[0].employment.redundancy.comment']", Comments , " Redundancy(ies)");	
			return this;}
		
		
		// Tick > Dismissal(s)/ settlement agreement
		public ProposalSOWPage clkPropSowEmploymentDismissal() throws InterruptedException {
			click("//*[@name='scope_of_work[0].employment.dismissal.noted_accepted']", "Dismissal(s)/ settlement agreement");
			return this;}
		
		
		//Expand Comment > Employment > Dismissal(s)/ settlement agreement
		public ProposalSOWPage ExpPropSowEmploymentDismissal(String Comments) throws InterruptedException {
			Thread.sleep(2000);
			click("(//*[text()='Dismissal(s)/ settlement agreement']/following::div[@aria-label='Comments'])[1]","Dismissal(s)/ settlement agreement");
			type("//*[@name='scope_of_work[0].employment.dismissal.comment']", Comments , "Dismissal(s)/ settlement agreement");	
			return this;}
		
		
		// Tick > Employment benefits
		public ProposalSOWPage clkPropSowEmploymentBenefits() throws InterruptedException {
			click("//*[@name='scope_of_work[0].employment.employment_benefits.noted_accepted']", "Employment benefits");
			return this;}
		
		
		//Expand Comment > Employment > Employment benefits
		public ProposalSOWPage ExpPropSowEmploymentBenefits(String Comments) throws InterruptedException {
			Thread.sleep(2000);
			click("(//*[text()='Employment benefits']/following::div[@aria-label='Comments'])[1]","Employment benefits");
			type("//*[@name='scope_of_work[0].employment.employment_benefits.comment']", Comments , "Employment benefits");	
			return this;}
		
		
		// Tick > Consultants, contractors or agency worker arrangements
		public ProposalSOWPage clkPropSowEmploymentConsultants() throws InterruptedException {
			click("//*[@name='scope_of_work[0].employment.consultants_arrangements.noted_accepted']", "Consultants, contractors or agency worker arrangements");
			return this;}
		
		
		//Expand Comment > Employment > Consultants, contractors or agency worker arrangements
		public ProposalSOWPage ExpPropSowEmploymentConsultants(String Comments) throws InterruptedException {
			Thread.sleep(2000);
			click("(//*[text()='Consultants, contractors or agency worker arrangements']/following::div[@aria-label='Comments'])[1]","Consultants, contractors or agency worker arrangements");
			type("//*[@name='scope_of_work[0].employment.consultants_arrangements.comment']", Comments , "Consultants, contractors or agency worker arrangements");	
			return this;}
		
		
		// Tick > Supply of staff arrangements
		public ProposalSOWPage clkPropSowEmploymentStaffArrangements() throws InterruptedException {
			click("//*[@name='scope_of_work[0].employment.staff_supply.noted_accepted']", "Supply of staff arrangements");
			return this;}
		
		
		//Expand Comment > Employment > Supply of staff arrangements
		public ProposalSOWPage ExpPropSowEmploymentStaffArrangements(String Comments) throws InterruptedException {
			Thread.sleep(2000);
			click("(//*[text()='Supply of staff arrangements']/following::div[@aria-label='Comments'])[1]","Supply of staff arrangements");
			type("//*[@name='scope_of_work[0].employment.staff_supply.comment']", Comments , "Supply of staff arrangements");	
			return this;}
		
		
		// Tick > HR aspects of outsourcing and insourcing
		public ProposalSOWPage clkPropSowEmploymentOutsourcing() throws InterruptedException {
			click("//*[@name='scope_of_work[0].employment.hr_outsourcing.noted_accepted']", "HR aspects of outsourcing and insourcing");
			return this;}
		
		
		//Expand Comment > Employment > HR aspects of outsourcing and insourcing
		public ProposalSOWPage ExpPropSowEmploymentOutsourcing(String Comments) throws InterruptedException {
			Thread.sleep(2000);
			click("(//*[text()='HR aspects of outsourcing and insourcing']/following::div[@aria-label='Comments'])[1]","HR aspects of outsourcing and insourcing");
			type("//*[@name='scope_of_work[0].employment.hr_outsourcing.comment']", Comments , "HR aspects of outsourcing and insourcing");	
			return this;}
		
		
		// Tick > Advice in respect of a grievance
		public ProposalSOWPage clkPropSowEmploymentGrievance() throws InterruptedException {
			click("//*[@name='scope_of_work[0].employment.grievance_advice.noted_accepted']", "Advice in respect of a grievance");
			return this;}
		
		
		//Expand Comment > Employment > Advice in respect of a grievance
		public ProposalSOWPage ExpPropSowEmploymentGrievance(String Comments) throws InterruptedException {
			Thread.sleep(2000);
			click("(//*[text()='Advice in respect of a grievance']/following::div[@aria-label='Comments'])[1]","Advice in respect of a grievance");
			type("//*[@name='scope_of_work[0].employment.grievance_advice.comment']", Comments , "Advice in respect of a grievance");	
			return this;}
		
		
		// Tick > Advice in respect of a disciplinary process
		public ProposalSOWPage clkPropSowEmploymentDisciplinaryProcess() throws InterruptedException {
			click("//*[@name='scope_of_work[0].employment.disciplinary_advice.noted_accepted']", "Advice in respect of a disciplinary process");
			return this;}
		
		
		//Expand Comment > Employment > Advice in respect of a disciplinary process
		public ProposalSOWPage ExpPropSowEmploymentDisciplinaryProcess(String Comments) throws InterruptedException {
			Thread.sleep(2000);
			click("(//*[text()='Advice in respect of a disciplinary process']/following::div[@aria-label='Comments'])[1]","Advice in respect of a disciplinary process");
			type("//*[@name='scope_of_work[0].employment.disciplinary_advice.comment']", Comments , "Advice in respect of a disciplinary process");	
			return this;}
		
		
		// Tick > Cross border advisory project
		public ProposalSOWPage clkPropSowEmploymentBorder() throws InterruptedException {
			click("//*[@name='scope_of_work[0].employment.cross_border_advisory.noted_accepted']", "Cross border advisory project");
			return this;}
		
		
		//Expand Comment > Employment > Cross border advisory project
		public ProposalSOWPage ExpPropSowEmploymentBorder(String Comments) throws InterruptedException {
			Thread.sleep(2000);
			click("(//*[text()='Cross border advisory project']/following::div[@aria-label='Comments'])[1]","Cross border advisory project");
			type("//*[@name='scope_of_work[0].employment.cross_border_advisory.comment']", Comments , "Cross border advisory project");	
			return this;}
		
		
		// Tick > Immigration and visas
		public ProposalSOWPage clkPropSowEmploymentImmigration() throws InterruptedException {
			click("//*[@name='scope_of_work[0].employment.immigration.noted_accepted']", "Immigration and visas");
			return this;}
		
		
		//Expand Comment > Employment > Immigration and visas
		public ProposalSOWPage ExpPropSowEmploymentImmigration(String Comments) throws InterruptedException {
			Thread.sleep(2000);
			click("(//*[text()='Immigration and visas']/following::div[@aria-label='Comments'])[1]","Immigration and visas");
			type("//*[@name='scope_of_work[0].employment.immigration.comment']", Comments , "Immigration and visas");	
			return this;}
		
		
		// Tick > Discrimination/ diversity/ equal opportunities
		public ProposalSOWPage clkPropSowEmploymentDiscrimination() throws InterruptedException {
			click("//*[@name='scope_of_work[0].employment.discrimination.noted_accepted']", "Discrimination/ diversity/ equal opportunities");
			return this;}
		
		
		//Expand Comment > Employment > Discrimination/ diversity/ equal opportunities
		public ProposalSOWPage ExpPropSowEmploymentDiscrimination(String Comments) throws InterruptedException {
			Thread.sleep(2000);
			click("(//*[text()='Discrimination/ diversity/ equal opportunities']/following::div[@aria-label='Comments'])[1]","Discrimination/ diversity/ equal opportunities");
			type("//*[@name='scope_of_work[0].employment.discrimination.comment']", Comments , "Discrimination/ diversity/ equal opportunities");	
			return this;}
		
		
		
		// Tick > Employment Investigation
		public ProposalSOWPage clkPropSowEmploymentInvestigation() throws InterruptedException {
			click("//*[@name='scope_of_work[0].employment.employment_investigation.noted_accepted']", "Employment Investigation");
			return this;}
		
		
		//Expand Comment > Employment > Employment Investigation
		public ProposalSOWPage ExpPropSowEmploymentInvestigation(String Comments) throws InterruptedException {
			Thread.sleep(2000);
			click("(//*[text()='Employment Investigation']/following::div[@aria-label='Comments'])[1]","Employment Investigation");
			type("//*[@name='scope_of_work[0].employment.employment_investigation.comment']", Comments , "Employment Investigation");	
			return this;}	
		
		
		// Tick > New/ proposed employment legislation
		public ProposalSOWPage clkPropSowEmploymentLegislation() throws InterruptedException {
			click("//*[@name='scope_of_work[0].employment.employment_legislation.noted_accepted']", "New/ proposed employment legislation");
			return this;}
		
		
		//Expand Comment > Employment > New/ proposed employment legislation
		public ProposalSOWPage ExpPropSowEmploymentLegislation(String Comments) throws InterruptedException {
			Thread.sleep(2000);
			click("(//*[text()='New/ proposed employment legislation']/following::div[@aria-label='Comments'])[1]","New/ proposed employment legislation");
			type("//*[@name='scope_of_work[0].employment.employment_legislation.comment']", Comments , "New/ proposed employment legislation");	
			return this;}
		
		
		// Tick > Reporting obligations e.g. gender pay gap
		public ProposalSOWPage clkPropSowEmploymentObligations() throws InterruptedException {
			click("//*[@name='scope_of_work[0].employment.reporting_obligations.noted_accepted']", "Reporting obligations e.g. gender pay gap");
			return this;}
		
		
		//Expand Comment > Employment > Reporting obligations e.g. gender pay gap
		public ProposalSOWPage ExpPropSowEmploymentObligations(String Comments) throws InterruptedException {
			Thread.sleep(2000);
			click("(//*[text()='Reporting obligations e.g. gender pay gap']/following::div[@aria-label='Comments'])[1]","Reporting obligations e.g. gender pay gap");
			type("//*[@name='scope_of_work[0].employment.reporting_obligations.comment']", Comments , "Reporting obligations e.g. gender pay gap");	
			return this;}
		
		
		// Tick > Protecting confidential information
		public ProposalSOWPage clkPropSowEmploymentConfidential() throws InterruptedException {
			click("//*[@name='scope_of_work[0].employment.protecting_confidential_info.noted_accepted']", "Protecting confidential information");
			return this;}
		
		
		//Expand Comment > Employment > Protecting confidential information
		public ProposalSOWPage ExpPropSowEmploymentConfidential(String Comments) throws InterruptedException {
			Thread.sleep(2000);
			click("(//*[text()='Protecting confidential information']/following::div[@aria-label='Comments'])[1]","Protecting confidential information");
			type("//*[@name='scope_of_work[0].employment.protecting_confidential_info.comment']", Comments , "Protecting confidential information");	
			return this;}
		
		
		// Tick > Performance management
		public ProposalSOWPage clkPropSowEmploymentPerformanceManagement() throws InterruptedException {
			click("//*[@name='scope_of_work[0].employment.performance_management.noted_accepted']", "Performance management");
			return this;}
		
		
		//Expand Comment > Employment > Performance management
		public ProposalSOWPage ExpPropSowEmploymentPerformanceManagement(String Comments) throws InterruptedException {
			Thread.sleep(2000);
			click("(//*[text()='Performance management']/following::div[@aria-label='Comments'])[1]","Performance management");
			type("//*[@name='scope_of_work[0].employment.performance_management.comment']", Comments , "Performance management");	
			return this;}
				
	
		// Tick > Long term sickness
		public ProposalSOWPage clkPropSowEmploymentSickness() throws InterruptedException {
			click("//*[@name='scope_of_work[0].employment.long_term_sickness.noted_accepted']", "Long term sickness");
			return this;}
		
		
		//Expand Comment > Employment > Long term sickness
		public ProposalSOWPage ExpPropSowEmploymentSickness(String Comments) throws InterruptedException {
			Thread.sleep(2000);
			click("(//*[text()='Long term sickness']/following::div[@aria-label='Comments'])[1]","Long term sickness");
			type("//*[@name='scope_of_work[0].employment.long_term_sickness.comment']", Comments , "Long term sickness");	
			return this;}
		
		
		// Tick > Remuneration package and incentives design
		public ProposalSOWPage clkPropSowEmploymentIncentivesDesign() throws InterruptedException {
			click("//*[@name='scope_of_work[0].employment.package_design.noted_accepted']", "Remuneration package and incentives design");
			return this;}
		
		
		
		//Expand Comment > Employment > Remuneration package and incentives design
		public ProposalSOWPage ExpPropSowEmploymentIncentivesDesign(String Comments) throws InterruptedException {
			Thread.sleep(2000);
			click("(//*[text()='Remuneration package and incentives design']/following::div[@aria-label='Comments'])[1]","Remuneration package and incentives design");
			type("//*[@name='scope_of_work[0].employment.package_design.comment']", Comments , "Remuneration package and incentives design");	
			return this;}
				
				
		
		// Tick > Retainer for ongoing remuneration/incentives advice
		public ProposalSOWPage clkPropSowEmploymentOngoingRemuneration() throws InterruptedException {
			click("//*[@name='scope_of_work[0].employment.ongoing_advice_retainer.noted_accepted']", "Retainer for ongoing remuneration/incentives advice");
			return this;}
		
		
		//Expand Comment > Employment > Retainer for ongoing remuneration/incentives advice
		public ProposalSOWPage ExpPropSowEmploymentOngoingRemuneration(String Comments) throws InterruptedException {
			Thread.sleep(2000);
			click("(//*[text()='Retainer for ongoing remuneration/incentives advice']/following::div[@aria-label='Comments'])[1]","Retainer for ongoing remuneration/incentives advice");
			type("//*[@name='scope_of_work[0].employment.ongoing_advice_retainer.comment']", Comments , "Retainer for ongoing remuneration/incentives advice");	
			return this;}
		
		
		// Tick > whistleblowing
		public ProposalSOWPage clkPropSowEmploymentWhistleblowing() throws InterruptedException {
			click("//*[@name='scope_of_work[0].employment.whistleblowing.noted_accepted']", "Whistleblowing");
			return this;}
		
		
		//Expand Comment > Employment > whistleblowing
		public ProposalSOWPage ExpPropSowEmploymentwhistleblowing(String Comments) throws InterruptedException {
			Thread.sleep(2000);
			click("(//*[text()='whistleblowing']/following::div[@aria-label='Comments'])[1]","whistleblowing");
			type("//*[@name='scope_of_work[0].employment.whistleblowing.comment']", Comments , "whistleblowing");	
			return this;}
		
		
		// Tick > Employee health and safety
		public ProposalSOWPage clkPropSowEmploymentHealthAndSafety() throws InterruptedException {
			click("//*[@name='scope_of_work[0].employment.employee_health_safety.noted_accepted']", "Employee health and safety");
			return this;}
		
		
		//Expand Comment > Employment > Employee health and safety
		public ProposalSOWPage ExpPropSowEmploymentHealthAndSafety(String Comments) throws InterruptedException {
			Thread.sleep(2000);
			click("(//*[text()='Employee health and safety']/following::div[@aria-label='Comments'])[1]","Employee health and safety");
			type("//*[@name='scope_of_work[0].employment.employee_health_safety.comment']", Comments , "Employee health and safety");	
			return this;}
		
		
		// Tick > Advice related to pensions
		public ProposalSOWPage clkPropSowEmploymentPensions() throws InterruptedException {
			click("//*[@name='scope_of_work[0].employment.pension_advice.noted_accepted']", "Advice related to pensions");
			return this;}
		
		
		//Expand Comment > Employment > Advice related to pensions
		public ProposalSOWPage ExpPropSowEmploymentPensions(String Comments) throws InterruptedException {
			Thread.sleep(2000);
			click("(//*[text()='Advice related to pensions']/following::div[@aria-label='Comments'])[1]","Advice related to pensions");
			type("//*[@name='scope_of_work[0].employment.pension_advice.comment']", Comments , "Advice related to pensions");	
			return this;}
		
		
		
		
		// Tick > Other
		public ProposalSOWPage clkPropSowEmploymentOther() throws InterruptedException {
			click("//*[@name='scope_of_work[0].employment.other.noted_accepted']", "Employment Other");
			return this;}
		
		
		//Expand Comment > Employment > Other
		public ProposalSOWPage ExpPropSowEmploymentOther(String Comments) throws InterruptedException {
			Thread.sleep(2000);
			click("(//*[text()='Other']/following::div[@aria-label='Comments'])[1]","Employment Other");
			type("//*[@name='scope_of_work[0].employment.other.comment']", Comments , "Employment Other");	
			return this;}
		
		
//6.--------------------------------------------------->  Financing & capital markets  <---------------------------------------------------------------------	

		
		// Tick > We agree for legal services providers to work on a non exclusive basis with appropriate Chinese walls between each team
		public ProposalSOWPage clkPropSowFinancingChinese() throws InterruptedException {
			click("//*[@name='scope_of_work[0].financing_capital_markets.exclusivity.non_exclusive_basis.noted_accepted']", "We agree for legal services providers");
			return this;}
				
		//Expand Comment > Financing & capital markets > We agree for legal services providers to work on a non exclusive basis with appropriate Chinese walls between each team
		public ProposalSOWPage ExpPropSowFinancingChinese(String Comments) throws InterruptedException {
			Thread.sleep(2000);
			click("(//*[text()='We agree for legal services providers to work on a non exclusive basis with appropriate Chinese walls between each team']/following::div[@aria-label='Comments'])[1]","We agree for legal services providers");
			type("//*[@name='scope_of_work[0].financing_capital_markets.exclusivity.non_exclusive_basis.comment']", Comments , "We agree for legal services providers");	
			return this;}
					
				
		// Tick > We request legal services providers to work on an exclusive basis only
		public ProposalSOWPage clkPropSowFinancingExclusiveBasis() throws InterruptedException {
			click("//*[@name='scope_of_work[0].financing_capital_markets.exclusivity.exclusive_basis_only.noted_accepted']", "exclusive basis only");
			return this;}
	
		
		//Expand Comment > Financing & capital markets > We request legal services providers to work on an exclusive basis only
		public ProposalSOWPage ExpPropSowFinancingExclusiveBasis(String Comments) throws InterruptedException {
			Thread.sleep(2000);
			click("(//*[text()='We request legal services providers to work on an exclusive basis only']/following::div[@aria-label='Comments'])[1]","exclusive basis only");
			type("//*[@name='scope_of_work[0].financing_capital_markets.exclusivity.exclusive_basis_only.comment']", Comments , "exclusive basis only");	
			return this;}
		
		
		
		// Tick > Asset and leasing finance
		public ProposalSOWPage clkPropSowFinancingLeasing() throws InterruptedException {
			click("//*[@name='scope_of_work[0].financing_capital_markets.transactions.asset_leasing_finance.noted_accepted']", "Asset and leasing finance");
			return this;}
		
		
		//Expand Comment > Financing & capital markets > Asset and leasing finance
		public ProposalSOWPage ExpPropSowFinancingLeasing(String Comments) throws InterruptedException {
			Thread.sleep(2000);
			click("(//*[text()='Asset and leasing finance']/following::div[@aria-label='Comments'])[5]","Asset and leasing finance");
			type("//*[@name='scope_of_work[0].financing_capital_markets.transactions.asset_leasing_finance.comment']", Comments , "Asset and leasing finance");	
			return this;}
		
		
		// Tick > Structuring
		public ProposalSOWPage clkPropSowFinancingStructuring() throws InterruptedException {
			click("//*[@name='scope_of_work[0].financing_capital_markets.transactions.asset_leasing_finance.structuring.noted_accepted']", "Structuring");
			return this;}
		
		//Expand Comment > Financing & capital markets > Structuring
		public ProposalSOWPage ExpPropSowFinancingStructuring(String Comments) throws InterruptedException {
			Thread.sleep(2000);
			click("(//*[text()='Structuring']/following::div[@aria-label='Comments'])[1]","Structuring");
			type("//*[@name='scope_of_work[0].financing_capital_markets.transactions.asset_leasing_finance.structuring.comment']", Comments , "Structuring");	
			return this;}
		
		// Tick > Documentation (list)
		public ProposalSOWPage clkPropSowFinancingDocumentation() throws InterruptedException {
			click("//*[@name='scope_of_work[0].financing_capital_markets.transactions.asset_leasing_finance.documentation.noted_accepted']", "Documentation (list)");
			return this;}
		
		
		//Expand Comment > Financing & capital markets > Documentation (list)
		public ProposalSOWPage ExpPropSowFinancingDocumentation(String Comments) throws InterruptedException {
			Thread.sleep(2000);
			click("(//*[text()='Documentation (list)']/following::div[@aria-label='Comments'])[1]","Documentation (list)");
			type("//*[@name='scope_of_work[0].financing_capital_markets.transactions.asset_leasing_finance.documentation.comment']", Comments , "Documentation (list)");	
			return this;}
		
		
		// Tick > Advisory/legal opinion/CP checklist, enforcement memorandum
		public ProposalSOWPage clkPropSowFinancingAdvisory() throws InterruptedException {
			click("//*[@name='scope_of_work[0].financing_capital_markets.transactions.asset_leasing_finance.advisory.noted_accepted']", "Advisory/legal opinion/CP checklist, enforcement memorandum");
			return this;}
		
		//Expand Comment > Financing & capital markets > Advisory/legal opinion/CP checklist, enforcement memorandum
		public ProposalSOWPage ExpPropSowFinancingAdvisory(String Comments) throws InterruptedException {
			Thread.sleep(2000);
			click("(//*[text()='Advisory/legal opinion/CP checklist, enforcement memorandum']/following::div[@aria-label='Comments'])[1]","Advisory/legal opinion/CP checklist");
			type("//*[@name='scope_of_work[0].financing_capital_markets.transactions.asset_leasing_finance.advisory.comment']", Comments , "Advisory/legal opinion/CP checklist");	
			return this;}
		
		
		// Tick > Due diligence (indebtedness)
		public ProposalSOWPage clkPropSowFinancingDueDiligence() throws InterruptedException {
			click("//*[@name='scope_of_work[0].financing_capital_markets.transactions.asset_leasing_finance.due_diligence.noted_accepted']", "Due diligence (indebtedness)");
			return this;}
		
		
		//Expand Comment > Financing & capital markets > Due diligence (indebtedness)
		public ProposalSOWPage ExpPropSowFinancingDueDiligence(String Comments) throws InterruptedException {
			Thread.sleep(2000);
			click("(//*[text()='Due diligence (indebtedness)']/following::div[@aria-label='Comments'])[1]","Due diligence");
			type("//*[@name='scope_of_work[0].financing_capital_markets.transactions.asset_leasing_finance.due_diligence.comment']", Comments , "Due diligence");	
			return this;}
		
		
		// Tick > Corporate lending
		public ProposalSOWPage clkPropSowFinancingLending() throws InterruptedException {
			click("//*[@name='scope_of_work[0].financing_capital_markets.transactions.corporate_lending.noted_accepted']", "Corporate lending");
			return this;}
		
		
		//Expand Comment > Financing & capital markets > Corporate lending
		public ProposalSOWPage ExpPropSowFinancingLending(String Comments) throws InterruptedException {
			Thread.sleep(2000);
			click("(//*[text()='Corporate lending']/following::div[@aria-label='Comments'])[1]","Corporate lending");
			type("//*[@name='scope_of_work[0].financing_capital_markets.transactions.corporate_lending.comment']", Comments , "Corporate lending");	
			return this;}
		
		
		// Tick > Debt capital markets
		public ProposalSOWPage clkPropSowFinancingDebt() throws InterruptedException {
			click("//*[@name='scope_of_work[0].financing_capital_markets.transactions.debt_capital_markets.noted_accepted']", "Debt capital markets");
			return this;}
		
		//Expand Comment > Financing & capital markets > Debt capital markets
		public ProposalSOWPage ExpPropSowFinancingDebt(String Comments) throws InterruptedException {
			Thread.sleep(2000);
			click("(//*[text()='Debt capital markets']/following::div[@aria-label='Comments'])[1]","Debt capital markets");
			type("//*[@name='scope_of_work[0].financing_capital_markets.transactions.debt_capital_markets.comment']", Comments , "Debt capital markets");	
			return this;}

		
		
		
		// Tick > Equity capital markets
		public ProposalSOWPage clkPropSowFinancingEquity() throws InterruptedException {
			click("//*[@name='scope_of_work[0].financing_capital_markets.transactions.equity_capital_markets.noted_accepted']", "Equity capital markets");
			return this;}
		
		
		//Expand Comment > Financing & capital markets > Equity capital markets
		public ProposalSOWPage ExpPropSowFinancingEquity(String Comments) throws InterruptedException {
			Thread.sleep(2000);
			click("(//*[text()='Equity capital markets']/following::div[@aria-label='Comments'])[1]","Equity capital markets");
			type("//*[@name='scope_of_work[0].financing_capital_markets.transactions.equity_capital_markets.comment']", Comments , "Equity capital markets");	
			return this;}
		
		
		
		// Tick > Islamic finance
		public ProposalSOWPage clkPropSowFinancingIslamic() throws InterruptedException {
			click("//*[@name='scope_of_work[0].financing_capital_markets.transactions.islamic_finance.noted_accepted']", "Islamic finance");
			return this;}
		
		
		//Expand Comment > Financing & capital markets > Islamic finance
		public ProposalSOWPage ExpPropSowFinancingIslamic(String Comments) throws InterruptedException {
			Thread.sleep(2000);
			click("(//*[text()='Islamic finance']/following::div[@aria-label='Comments'])[1]","Islamic finance");
			type("//*[@name='scope_of_work[0].financing_capital_markets.transactions.islamic_finance.comment']", Comments , "Islamic finance");	
			return this;}
		
		
		
		// Tick > Leveraged and acquisition finance
		public ProposalSOWPage clkPropSowFinancingLeveraged() throws InterruptedException {
			click("//*[@name='scope_of_work[0].financing_capital_markets.transactions.leveraged_acquisition_finance.noted_accepted']", "Leveraged and acquisition finance");
			return this;}
		
		
		//Expand Comment > Financing & capital markets > Leveraged and acquisition finance
		public ProposalSOWPage ExpPropSowFinancingLeveraged(String Comments) throws InterruptedException {
			Thread.sleep(2000);
			click("(//*[text()='Leveraged and acquisition finance']/following::div[@aria-label='Comments'])[1]","Leveraged and acquisition finance");
			type("//*[@name='scope_of_work[0].financing_capital_markets.transactions.leveraged_acquisition_finance.comment']", Comments , "Leveraged and acquisition finance");	
			return this;}
		
		
		// Tick > Real estate finance
		public ProposalSOWPage clkPropSowFinancingRealEstate() throws InterruptedException {
			click("//*[@name='scope_of_work[0].financing_capital_markets.transactions.real_estate_finance.noted_accepted']", "Real estate finance");
			return this;}
		
		
		//Expand Comment > Financing & capital markets > Real estate finance
		public ProposalSOWPage ExpPropSowFinancingRealEstate(String Comments) throws InterruptedException {
			Thread.sleep(2000);
			click("(//*[text()='Real estate finance']/following::div[@aria-label='Comments'])[1]","Real estate finance");
			type("//*[@name='scope_of_work[0].financing_capital_markets.transactions.real_estate_finance.comment']", Comments , "Real estate finance");	
			return this;}
		
		
		// Tick > Securitisation
		public ProposalSOWPage clkPropSowFinancingSecuritisation() throws InterruptedException {
			click("//*[@name='scope_of_work[0].financing_capital_markets.transactions.securitisation.noted_accepted']", "Securitisation");
			return this;}
		
		
		//Expand Comment > Financing & capital markets > Securitisation
		public ProposalSOWPage ExpPropSowFinancingSecuritisation(String Comments) throws InterruptedException {
			Thread.sleep(2000);
			click("(//*[text()='Securitisation']/following::div[@aria-label='Comments'])[1]","Securitisation");
			type("//*[@name='scope_of_work[0].financing_capital_markets.transactions.securitisation.comment']", Comments , "Securitisation");	
			return this;}
		
		
		// Tick > Derivatives & structured products
		public ProposalSOWPage clkPropSowFinancingDerivatives() throws InterruptedException {
			click("//*[@name='scope_of_work[0].financing_capital_markets.transactions.derivatives_structured_products.noted_accepted']", "Derivatives & structured products");
			return this;}
		
		
		//Expand Comment > Financing & capital markets > Derivatives & structured products
		public ProposalSOWPage ExpPropSowFinancingDerivatives(String Comments) throws InterruptedException {
			Thread.sleep(2000);
			click("(//*[text()='Derivatives & structured products']/following::div[@aria-label='Comments'])[10]","Derivatives & structured products");
			type("//*[@name='scope_of_work[0].financing_capital_markets.transactions.derivatives_structured_products.comment']", Comments , "Derivatives & structured products");	
			return this;}
		
		
		// Tick > Structured credit products
		public ProposalSOWPage clkPropSowFinancingStructuredCredit() throws InterruptedException {
			click("//*[@name='scope_of_work[0].financing_capital_markets.transactions.derivatives_structured_products.structured_credit_products.noted_accepted']", "Structured credit products");
			return this;}
		
		
		//Expand Comment > Financing & capital markets > Structured credit products
		public ProposalSOWPage ExpPropSowFinancingStructuredCredit(String Comments) throws InterruptedException {
			Thread.sleep(2000);
			click("(//*[text()='Structured credit products']/following::div[@aria-label='Comments'])[1]","Structured credit products");
			type("//*[@name='scope_of_work[0].financing_capital_markets.transactions.derivatives_structured_products.structured_credit_products.comment']", Comments , "Structured credit products");	
			return this;}
		
		
		
		// Tick > Structured equity products
		public ProposalSOWPage clkPropSowFinancingStructuredEquity() throws InterruptedException {
			click("//*[@name='scope_of_work[0].financing_capital_markets.transactions.derivatives_structured_products.structured_equity_products.noted_accepted']", "Structured equity products");
			return this;}
		
		
		//Expand Comment > Financing & capital markets > Structured equity products
		public ProposalSOWPage ExpPropSowFinancingStructuredEquity(String Comments) throws InterruptedException {
			Thread.sleep(2000);
			click("(//*[text()='Structured equity products']/following::div[@aria-label='Comments'])[1]","Structured equity products");
			type("//*[@name='scope_of_work[0].financing_capital_markets.transactions.derivatives_structured_products.structured_equity_products.comment']", Comments , "Structured equity products");	
			return this;}
	
		
		
		// Tick > Interest rate, FX and inflation products
		public ProposalSOWPage clkPropSowFinancingInterestRate() throws InterruptedException {
			click("//*[@name='scope_of_work[0].financing_capital_markets.transactions.derivatives_structured_products.interest_rate.noted_accepted']", "Interest rate, FX and inflation products");
			return this;}
		
		
		//Expand Comment > Financing & capital markets > Interest rate, FX and inflation products
		public ProposalSOWPage ExpPropSowFinancingInterestRate(String Comments) throws InterruptedException {
			Thread.sleep(2000);
			click("(//*[text()='Interest rate, FX and inflation products']/following::div[@aria-label='Comments'])[1]","Interest rate, FX and inflation products");
			type("//*[@name='scope_of_work[0].financing_capital_markets.transactions.derivatives_structured_products.interest_rate.comment']", Comments , "Interest rate, FX and inflation products");	
			return this;}
		
		
		// Tick > Commodity linked transactions
		public ProposalSOWPage clkPropSowFinancingLinkedTransactions() throws InterruptedException {
			click("//*[@name='scope_of_work[0].financing_capital_markets.transactions.derivatives_structured_products.commodity_linked_transactions.noted_accepted']", "Commodity linked transactions");
			return this;}
		
		
		//Expand Comment > Financing & capital markets > Commodity linked transactions
		public ProposalSOWPage ExpPropSowFinancingLinkedTransactions(String Comments) throws InterruptedException {
			Thread.sleep(2000);
			click("(//*[text()='Commodity linked transactions']/following::div[@aria-label='Comments'])[1]","Commodity linked transactions");
			type("//*[@name='scope_of_work[0].financing_capital_markets.transactions.derivatives_structured_products.commodity_linked_transactions.comment']", Comments , "Commodity linked transactions");	
			return this;}
		
		
		
		// Tick > ETP platforms
		public ProposalSOWPage clkPropSowFinancingETPPlatforms() throws InterruptedException {
			click("//*[@name='scope_of_work[0].financing_capital_markets.transactions.derivatives_structured_products.etp_platforms.noted_accepted']", "ETP platforms");
			return this;}
		
		
		//Expand Comment > Financing & capital markets > ETP platforms
		public ProposalSOWPage ExpPropSowFinancingETPPlatforms(String Comments) throws InterruptedException {
			Thread.sleep(2000);
			click("(//*[text()='ETP platforms']/following::div[@aria-label='Comments'])[1]","ETP platforms");
			type("//*[@name='scope_of_work[0].financing_capital_markets.transactions.derivatives_structured_products.etp_platforms.comment']", Comments , "ETP platforms");	
			return this;}
		
		
		// Tick > Prime brokerage and intermediation arrangements
		public ProposalSOWPage clkPropSowFinancingBrokerage() throws InterruptedException {
			click("//*[@name='scope_of_work[0].financing_capital_markets.transactions.derivatives_structured_products.prime_brokerage.noted_accepted']", "Prime brokerage and intermediation arrangements");
			return this;}
		
		//Expand Comment > Financing & capital markets > Prime brokerage and intermediation arrangements
		public ProposalSOWPage ExpPropSowFinancingBrokerage(String Comments) throws InterruptedException {
			Thread.sleep(2000);
			click("(//*[text()='Prime brokerage and intermediation arrangements']/following::div[@aria-label='Comments'])[1]","Prime brokerage and intermediation arrangements");
			type("//*[@name='scope_of_work[0].financing_capital_markets.transactions.derivatives_structured_products.prime_brokerage.comment']", Comments , "Prime brokerage and intermediation arrangements");	
			return this;}
		
		
		
		// Tick > Credit risk mitigation
		public ProposalSOWPage clkPropSowFinancingRiskMitigation() throws InterruptedException {
			click("//*[@name='scope_of_work[0].financing_capital_markets.transactions.derivatives_structured_products.credit_risk_mitigation.noted_accepted']", "Credit risk mitigation");
			return this;}
		
		
		//Expand Comment > Financing & capital markets > Credit risk mitigation
		public ProposalSOWPage ExpPropSowFinancingRiskMitigation(String Comments) throws InterruptedException {
			Thread.sleep(2000);
			click("(//*[text()='Credit risk mitigation']/following::div[@aria-label='Comments'])[1]","Credit risk mitigation");
			type("//*[@name='scope_of_work[0].financing_capital_markets.transactions.derivatives_structured_products.credit_risk_mitigation.comment']", Comments , "Credit risk mitigation");	
			return this;}
		
		
		
		// Tick > Repos and securities lending
		public ProposalSOWPage clkPropSowFinancingRepos() throws InterruptedException {
			click("//*[@name='scope_of_work[0].financing_capital_markets.transactions.derivatives_structured_products.repos_securities_lending.noted_accepted']", "Repos and securities lending");
			return this;}
		
		
		//Expand Comment > Financing & capital markets > Repos and securities lending
		public ProposalSOWPage ExpPropSowFinancingInterestRepos(String Comments) throws InterruptedException {
			Thread.sleep(2000);
			click("(//*[text()='Repos and securities lending']/following::div[@aria-label='Comments'])[1]","Repos and securities lending");
			type("//*[@name='scope_of_work[0].financing_capital_markets.transactions.derivatives_structured_products.repos_securities_lending.comment']", Comments , "Repos and securities lending");	
			return this;}
		
		
		// Tick > Derivatives & structured products >  Other
		public ProposalSOWPage clkPropSowFinancingDerivativesOther() throws InterruptedException {
			click("//*[@name='scope_of_work[0].financing_capital_markets.transactions.derivatives_structured_products.other.noted_accepted']", "Derivatives & structured products Others");
			return this;}
		
		//Expand Comment > Financing & capital markets > Derivatives & structured products >  Other
		public ProposalSOWPage ExpPropSowFinancingDerivativesOther(String Comments) throws InterruptedException {
			Thread.sleep(2000);
			click("(//*[text()='Other']/following::div[@aria-label='Comments'])[1]","Derivatives Other");
			type("//*[@name='scope_of_work[0].financing_capital_markets.transactions.derivatives_structured_products.other.comment']", Comments , "Derivatives Other");	
			return this;}
		
		
		// Tick > Trade & commodities finance
		public ProposalSOWPage clkPropSowFinancingTrade() throws InterruptedException {
			click("//*[@name='scope_of_work[0].financing_capital_markets.transactions.trade_commodities_finance.noted_accepted']", "Trade & commodities finance");
			return this;}
		
		
		//Expand Comment > Financing & capital markets > Trade & commodities finance
		public ProposalSOWPage ExpPropSowFinancingTrade(String Comments) throws InterruptedException {
			Thread.sleep(2000);
			click("(//*[text()='Trade & commodities finance']/following::div[@aria-label='Comments'])[1]","Trade & commodities finance");
			type("//*[@name='scope_of_work[0].financing_capital_markets.transactions.trade_commodities_finance.comment']", Comments , "Trade & commodities finance");	
			return this;}
		
		
		// Tick > Corporate trust
		public ProposalSOWPage clkPropSowFinancingTrust() throws InterruptedException {
			click("//*[@name='scope_of_work[0].financing_capital_markets.transactions.corporate_trust.noted_accepted']", "Corporate trust");
			return this;}
		
		
		//Expand Comment > Financing & capital markets > Corporate trust
		public ProposalSOWPage ExpPropSowFinancingTrust(String Comments) throws InterruptedException {
			Thread.sleep(2000);
			click("(//*[text()='Corporate trust']/following::div[@aria-label='Comments'])[1]","Corporate trust");
			type("//*[@name='scope_of_work[0].financing_capital_markets.transactions.corporate_trust.comment']", Comments , "Corporate trust");	
			return this;}
		
		
		// Tick > Transactions >  Other
		public ProposalSOWPage clkPropSowFinancingTransactionsOther() throws InterruptedException {
			click("//*[@name='scope_of_work[0].financing_capital_markets.transactions.other.noted_accepted']", "Transactions Other");
			return this;}
		
		
		//Expand Comment > Financing & capital markets > Other
		public ProposalSOWPage ExpPropSowFinancingTransactionsOther(String Comments) throws InterruptedException {
			Thread.sleep(2000);
			click("(//*[text()='Corporate trust']/following::div[@aria-label='Comments'])[2]","Transactions Other");
			type("//*[@name='scope_of_work[0].financing_capital_markets.transactions.other.comment']", Comments , "Transactions Other");	
			return this;}
		
		
		
		// Tick > Regulatory compliance/advocacy
		public ProposalSOWPage clkPropSowFinancingCompliance() throws InterruptedException {
			click("//*[@name='scope_of_work[0].financing_capital_markets.regulatory_compliance_advocacy.regulatory_compliance_advocacy.noted_accepted']", "Regulatory compliance/advocacy");
			return this;}
		
		
		//Expand Comment > Financing & capital markets > Regulatory compliance/advocacy
		public ProposalSOWPage ExpPropSowFinancingCompliance(String Comments) throws InterruptedException {
			Thread.sleep(2000);
			click("(//*[text()='Regulatory compliance/advocacy']/following::div[@aria-label='Comments'])[1]","Regulatory compliance/advocacy");
			type("//*[@name='scope_of_work[0].financing_capital_markets.regulatory_compliance_advocacy.regulatory_compliance_advocacy.comment']", Comments , "Regulatory compliance/advocacy");	
			return this;}
		
		
		
		// Tick > Enforcement
		public ProposalSOWPage clkPropSowFinancingEnforcement() throws InterruptedException {
			click("//*[@name='scope_of_work[0].financing_capital_markets.enforcement.enforcement.noted_accepted']", "Enforcement");
			return this;}
		
		
		//Expand Comment > Financing & capital markets > Enforcement
		public ProposalSOWPage ExpPropSowFinancingEnforcement(String Comments) throws InterruptedException {
			Thread.sleep(2000);
			click("(//*[text()='Enforcement']/following::div[@aria-label='Comments'])[1]","Enforcement");
			type("//*[@name='scope_of_work[0].financing_capital_markets.enforcement.enforcement.comment']", Comments , "Enforcement");	
			return this;}
		
		
		
		
//7.--------------------------------------------------->  (Infrastructure) projects & financing   <---------------------------------------------------------------------	

		// Tick > (Infrastructure) projects & financing > Tender phase
		public ProposalSOWPage clkPropSowInfrastructureTender() throws InterruptedException {
			click("//*[@name='scope_of_work[0].infrastructure_projects_financing.tender_phase.noted_accepted']", "Tender phase");
			return this;}
						
		//Expand Comment > (Infrastructure) projects & financing > Tender phase
		public ProposalSOWPage ExpPropSowInfrastructureTender(String Comments) throws InterruptedException {
			Thread.sleep(2000);
			click("(//*[text()='Tender phase']/following::div[@aria-label='Comments'])[1]","Tender phase");
			type("//*[@name='scope_of_work[0].infrastructure_projects_financing.tender_phase.comment']", Comments , "Tender phase");	
			return this;}
		
		
		// Tick > (Infrastructure) projects & financing > Structuring, establishment of SPV vehicle
		public ProposalSOWPage clkPropSowInfrastructureStructuring() throws InterruptedException {
			click("//*[@name='scope_of_work[0].infrastructure_projects_financing.structuring.noted_accepted']", "Structuring, establishment of SPV vehicle");
			return this;}
		
		
		//Expand Comment > (Infrastructure) projects & financing > Structuring, establishment of SPV vehicle
		public ProposalSOWPage ExpPropSowInfrastructureStructuring(String Comments) throws InterruptedException {
			Thread.sleep(2000);
			click("(//*[text()='Structuring, establishment of SPV vehicle']/following::div[@aria-label='Comments'])[1]","Structuring, establishment of SPV vehicle");
			type("//*[@name='scope_of_work[0].infrastructure_projects_financing.structuring.comment']", Comments , "Structuring, establishment of SPV vehicle");	
			return this;}
		
		
		// Tick > (Infrastructure) projects & financing > Due diligence (regulatory, licences, real estate)
		public ProposalSOWPage clkPropSowInfrastructureDueDiligence() throws InterruptedException {
			click("//*[@name='scope_of_work[0].infrastructure_projects_financing.due_diligence.noted_accepted']", "Due diligence ");
			return this;}
		
		
		//Expand Comment > (Infrastructure) projects & financing > Due diligence (regulatory, licences, real estate)
		public ProposalSOWPage ExpPropSowInfrastructureDueDiligence(String Comments) throws InterruptedException {
			Thread.sleep(2000);
			click("(//*[text()='Due diligence (regulatory, licences, real estate)']/following::div[@aria-label='Comments'])[1]","Due diligence (regulatory, licences, real estate)");
			type("//*[@name='scope_of_work[0].infrastructure_projects_financing.due_diligence.comment']", Comments , "Due diligence (regulatory, licences, real estate)");	
			return this;}
		
		
		// Tick > (Infrastructure) projects & financing > Sponsor documents
		public ProposalSOWPage clkPropSowInfrastructureSponsorDocuments() throws InterruptedException {
			click("//*[@name='scope_of_work[0].infrastructure_projects_financing.sponsor_documents.noted_accepted']", "Sponsor documents");
			return this;}
		
		
		//Expand Comment > (Infrastructure) projects & financing > Sponsor documents
		public ProposalSOWPage ExpPropSowInfrastructureSponsorDocuments(String Comments) throws InterruptedException {
			Thread.sleep(2000);
			click("(//*[text()='Sponsor documents']/following::div[@aria-label='Comments'])[1]","Sponsor documents");
			type("//*[@name='scope_of_work[0].infrastructure_projects_financing.sponsor_documents.comment']", Comments , "Sponsor documents");	
			return this;}
		
		
				
		// Tick > (Infrastructure) projects & financing > Project Agreements
		public ProposalSOWPage clkPropSowInfrastructureProjectAgreements() throws InterruptedException {
			click("//*[@name='scope_of_work[0].infrastructure_projects_financing.project_agreements.noted_accepted']", "Project Agreements");
			return this;}
		
		
		//Expand Comment > (Infrastructure) projects & financing > Project Agreements
		public ProposalSOWPage ExpPropSowInfrastructureProjectAgreements(String Comments) throws InterruptedException {
			Thread.sleep(2000);
			click("(//*[text()='Project Agreements']/following::div[@aria-label='Comments'])[1]","Project Agreements");
			type("//*[@name='scope_of_work[0].infrastructure_projects_financing.project_agreements.comment']", Comments , "Project Agreements");	
			return this;}
		
		
		// Tick > (Infrastructure) projects & financing > Financing
		public ProposalSOWPage clkPropSowInfrastructureFinancing() throws InterruptedException {
			click("//*[@name='scope_of_work[0].infrastructure_projects_financing.financing.noted_accepted']", "Financing");
			return this;}
		
		
		//Expand Comment > (Infrastructure) projects & financing > Financing
		public ProposalSOWPage ExpPropSowInfrastructureFinancing(String Comments) throws InterruptedException {
			Thread.sleep(2000);
			click("(//*[text()='Financing']/following::div[@aria-label='Comments'])[1]","Financing");
			type("//*[@name='scope_of_work[0].infrastructure_projects_financing.financing.comment']", Comments , "Financing");	
			return this;}
		
		
		// Tick > (Infrastructure) projects & financing > Closing
		public ProposalSOWPage clkPropSowInfrastructureClosing() throws InterruptedException {
			click("//*[@name='scope_of_work[0].infrastructure_projects_financing.closing.noted_accepted']", "Closing");
			return this;}
		
		
		//Expand Comment > (Infrastructure) projects & financing > Closing
		public ProposalSOWPage ExpPropSowInfrastructureClosing(String Comments) throws InterruptedException {
			Thread.sleep(2000);
			click("(//*[text()='Closing']/following::div[@aria-label='Comments'])[1]","Closing");
			type("//*[@name='scope_of_work[0].infrastructure_projects_financing.closing.comment']", Comments , "Closing");	
			return this;}
		
		
		
//8.--------------------------------------------------->  Fund formation  <---------------------------------------------------------------------	
	
		//Phase 1
		// Tick > Fund formation > Structuring
		public ProposalSOWPage clkPropSowFundFormationStructuring() throws InterruptedException {
			click("//*[@name='scope_of_work[0].fund_formation.phase_one.structuring.noted_accepted']", "Structuring");
			return this;}
		
		
		//Expand Comment > Fund formation > Structuring
		public ProposalSOWPage ExpPropSowFundFormationStructuring(String Comments) throws InterruptedException {
			Thread.sleep(2000);
			click("(//*[text()='Structuring']/following::div[@aria-label='Comments'])[1]","Structuring");
			type("//*[@name='scope_of_work[0].fund_formation.phase_one.structuring.comment']", Comments , "Structuring");	
			return this;}
		
		
		// Tick > Fund formation > Term sheet
		public ProposalSOWPage clkPropSowFundFormationTermSheet() throws InterruptedException {
			click("//*[@name='scope_of_work[0].fund_formation.phase_one.term_sheet.noted_accepted']", "Term sheet");
			return this;}
		
		
		//Expand Comment > Fund formation > Term sheet
		public ProposalSOWPage ExpPropSowFundFormationTermSheet(String Comments) throws InterruptedException {
			Thread.sleep(2000);
			click("(//*[text()='Term sheet']/following::div[@aria-label='Comments'])[1]","Term sheet");
			type("//*[@name='scope_of_work[0].fund_formation.phase_one.term_sheet.comment']", Comments , "Term sheet");	
			return this;}
		
		
		// Tick > Fund formation > Comment
		public ProposalSOWPage clkPropSowFundFormationPhaseOneComment() throws InterruptedException {
			click("//*[@name='scope_of_work[0].fund_formation.phase_one.comment.noted_accepted']", "Phase 1 Comment");
			return this;}
		
		
		//Expand Comment > Fund formation > Comment
		public ProposalSOWPage ExpPropSowFundFormationPhaseOneComment(String Comments) throws InterruptedException {
			Thread.sleep(2000);
			click("(//*[text()='Comment']/following::div[@aria-label='Comments'])[1]","Phase 1 Comment");
			type("//*[@name='scope_of_work[0].fund_formation.phase_one.comment.comment']", Comments , "Phase 1 Comment");	
			return this;}
		
		
		//   Phase 2
		// Tick > Fund formation > Marketing
		public ProposalSOWPage clkPropSowFundFormationMarketing() throws InterruptedException {
			click("//*[@name='scope_of_work[0].fund_formation.phase_two.marketing.noted_accepted']", "Marketing");
			return this;}
		
		
		//Expand Comment > Fund formation > Marketing
		public ProposalSOWPage ExpPropSowFundFormationMarketing(String Comments) throws InterruptedException {
			Thread.sleep(2000);
			click("(//*[text()='Marketing']/following::div[@aria-label='Comments'])[9]","Marketing");
			type("//*[@name='scope_of_work[0].fund_formation.phase_two.marketing.comment']", Comments , "Marketing");	
			return this;}
		
		
		// Tick > Fund formation > Reviewing pitch book/teaser
		public ProposalSOWPage clkPropSowFundFormationReviewing() throws InterruptedException {
			click("//*[@name='scope_of_work[0].fund_formation.phase_two.marketing.reviewing_pitch_book.noted_accepted']", "Reviewing pitch book/teaser");
			return this;}
		
		
		//Expand Comment > Fund formation > Reviewing pitch book/teaser
		public ProposalSOWPage ExpPropSowFundFormationReviewing(String Comments) throws InterruptedException {
			Thread.sleep(2000);
			click("(//*[text()='Reviewing pitch book/teaser']/following::div[@aria-label='Comments'])[1]","Reviewing pitch book/teaser");
			type("//*[@name='scope_of_work[0].fund_formation.phase_two.marketing.reviewing_pitch_book.comment']", Comments , "Reviewing pitch book/teaser");	
			return this;}
		
		
		// Tick > Fund formation > Marketing advice/selling restrictions
		public ProposalSOWPage clkPropSowFundFormationSelling() throws InterruptedException {
			click("//*[@name='scope_of_work[0].fund_formation.phase_two.marketing.marketing_advice.noted_accepted']", "Marketing advice/selling restrictions");
			return this;}

		
		//Expand Comment > Fund formation > Marketing advice/selling restrictions
		public ProposalSOWPage ExpPropSowFundFormationSelling(String Comments) throws InterruptedException {
			Thread.sleep(2000);
			click("(//*[text()='Marketing advice/selling restrictions']/following::div[@aria-label='Comments'])[1]","Marketing advice/selling restrictions");
			type("//*[@name='scope_of_work[0].fund_formation.phase_two.marketing.marketing_advice.comment']", Comments , "Marketing advice/selling restrictions");	
			return this;}
		
		
		// Tick > Fund formation > Fund interests into EU jurisdictions under AIFMD
		public ProposalSOWPage clkPropSowFundFormationAIFMD() throws InterruptedException {
			click("//*[@name='scope_of_work[0].fund_formation.phase_two.marketing.marketing_advice.fund_interests.noted_accepted']", "AIFMD");
			return this;}
		
		
		//Expand Comment > Fund formation > Fund interests into EU jurisdictions under AIFMD
		public ProposalSOWPage ExpPropSowFundFormationAIFMD(String Comments) throws InterruptedException {
			Thread.sleep(2000);
			click("(//*[text()='Fund interests into EU jurisdictions under AIFMD']/following::div[@aria-label='Comments'])[1]","AIFMD");
			type("//*[@name='scope_of_work[0].fund_formation.phase_two.marketing.marketing_advice.fund_interests.comment']", Comments , "AIFMD");	
			return this;}
		
		
		// Tick > Fund formation > All relevant non-U.S. and non-EU jurisdictions
		public ProposalSOWPage clkPropSowFundFormationNonUS() throws InterruptedException {
			click("//*[@name='scope_of_work[0].fund_formation.phase_two.marketing.marketing_advice.non_us_eu_jurisdictions.noted_accepted']", "non-U.S. and non-EU jurisdictions");
			return this;}
		
		
		//Expand Comment > Fund formation > All relevant non-U.S. and non-EU jurisdictions
		public ProposalSOWPage ExpPropSowFundFormationNonUS(String Comments) throws InterruptedException {
			Thread.sleep(2000);
			click("(//*[text()='All relevant non-U.S. and non-EU jurisdictions']/following::div[@aria-label='Comments'])[1]","non-U.S.");
			type("//*[@name='scope_of_work[0].fund_formation.phase_two.marketing.marketing_advice.non_us_eu_jurisdictions.comment']", Comments , "non-U.S.");	
			return this;}
		
		
		// Tick > Fund formation > Marketing in the US
		public ProposalSOWPage clkPropSowFundFormationUS() throws InterruptedException {
			click("//*[@name='scope_of_work[0].fund_formation.phase_two.marketing.marketing_advice.marketing_in_us.noted_accepted']", "Marketing in the US");
			return this;}
		
		
		//Expand Comment > Fund formation > Marketing in the US
		public ProposalSOWPage ExpPropSowFundFormationUS(String Comments) throws InterruptedException {
			Thread.sleep(2000);
			click("(//*[text()='Marketing in the US']/following::div[@aria-label='Comments'])[1]","Marketing in the US");
			type("//*[@name='scope_of_work[0].fund_formation.phase_two.marketing.marketing_advice.marketing_in_us.comment']", Comments , "Marketing in the US");	
			return this;}
		
		
		// Tick > Fund formation > Advising on U.S. private placement exemptions, including providing a brief "ground rules" memorandum containing practical advice on how to conduct the offering in compliance with Regulations D and S, including how to deal with media enquiries
		public ProposalSOWPage clkPropSowFundFormationAdvisingOnUS() throws InterruptedException {
			click("//*[@name='scope_of_work[0].fund_formation.phase_two.marketing.marketing_advice.marketing_in_us.private_placement_exemptions.noted_accepted']", "Advising on U.S");
			return this;}
		
		
		//Expand Comment > Fund formation > Advising on U.S. private placement exemptions, including providing a brief "ground rules" memorandum containing practical advice on how to conduct the offering in compliance with Regulations D and S, including how to deal with media enquiries
		public ProposalSOWPage ExpPropSowFundFormationAdvisingOnUS(String Comments) throws InterruptedException {
			Thread.sleep(2000);
			click("(//*[text()='Advising on U.S. private placement exemptions, including providing a brief \"ground rules\" memorandum containing practical advice on how to conduct the offering in compliance with Regulations D and S, including how to deal with media enquiries']/following::div[@aria-label='Comments'])[1]","Advising on U.S");
			type("//*[@name='scope_of_work[0].fund_formation.phase_two.marketing.marketing_advice.marketing_in_us.private_placement_exemptions.comment']", Comments , "Advising on U.S");	
			return this;}
		
		
		// Tick > Fund formation > Providing a U.S. securities law opinion.
		public ProposalSOWPage clkPropSowFundFormationSecurities() throws InterruptedException {
			click("//*[@name='scope_of_work[0].fund_formation.phase_two.marketing.marketing_advice.marketing_in_us.us_securities_law.noted_accepted']", "Providing a U.S. securities law opinion.");
			return this;}
		
		
		//Expand Comment > Fund formation > Providing a U.S. securities law opinion.
		public ProposalSOWPage ExpPropSowFundFormationSecurities(String Comments) throws InterruptedException {
			Thread.sleep(2000);
			click("(//*[text()='Providing a U.S. securities law opinion.']/following::div[@aria-label='Comments'])[1]","securities law opinion.");
			type("//*[@name='scope_of_work[0].fund_formation.phase_two.marketing.marketing_advice.marketing_in_us.us_securities_law.comment']", Comments , "securities law opinion.");	
			return this;}
		
		
		
		// Tick > Fund formation > Completing U.S. Regulation D filings (if required) and, to the extent required, any applicable state "blue sky" filings.
		public ProposalSOWPage clkPropSowFundFormationCompletingUS() throws InterruptedException {
			click("//*[@name='scope_of_work[0].fund_formation.phase_two.marketing.marketing_advice.marketing_in_us.us_regulation_filings.noted_accepted']", "Completing U.S.");
			return this;}
		
		
		//Expand Comment > Fund formation > Completing U.S. Regulation D filings (if required) and, to the extent required, any applicable state "blue sky" filings.
		public ProposalSOWPage ExpPropSowFundFormationCompletingUS(String Comments) throws InterruptedException {
			Thread.sleep(2000);
			click("(//*[text()='Completing U.S. Regulation D filings (if required) and, to the extent required, any applicable state \"blue sky\" filings.']/following::div[@aria-label='Comments'])[1]","Completing U.S.");
			type("//*[@name='scope_of_work[0].fund_formation.phase_two.marketing.marketing_advice.marketing_in_us.us_regulation_filings.comment']", Comments , "Completing U.S.");	
			return this;}
		
		
		
		// Tick > Fund formation > Phase Two Comment
		public ProposalSOWPage clkPropSowFundFormationPhaseTwoComment() throws InterruptedException {
			click("//*[@name='scope_of_work[0].fund_formation.phase_two.comment.noted_accepted']", "Phase 2 Comment");
			return this;}
		
		
		//Expand Comment > Fund formation > Phase Two Comment
		public ProposalSOWPage ExpPropSowFundFormationPhaseTwoComment(String Comments) throws InterruptedException {
			Thread.sleep(2000);
			click("(//*[text()='Completing U.S. Regulation D filings (if required) and, to the extent required, any applicable state \"blue sky\" filings.']/following::div[@aria-label='Comments'])[3]","Phase 2 Comment");
			type("//*[@name='scope_of_work[0].fund_formation.phase_two.comment.comment']", Comments , "Phase 2 Comment");	
			return this;}
		
		
		//Phase 3
		// Tick > Fund formation > Drafting PPM legal aspects
		public ProposalSOWPage clkPropSowFundFormationPPM() throws InterruptedException {
			click("//*[@name='scope_of_work[0].fund_formation.phase_three.drafting_ppm.noted_accepted']", "Drafting PPM legal aspects");
			return this;}
		
		
		//Expand Comment > Fund formation > Drafting PPM legal aspects
		public ProposalSOWPage ExpPropSowFundFormationPPM(String Comments) throws InterruptedException {
			Thread.sleep(2000);
			click("(//*[text()='Drafting PPM legal aspects']/following::div[@aria-label='Comments'])[1]","Drafting PPM legal aspects");
			type("//*[@name='scope_of_work[0].fund_formation.phase_three.drafting_ppm.comment']", Comments , "Drafting PPM legal aspects");	
			return this;}

		
		// Tick > Fund formation > Core documents
		public ProposalSOWPage clkPropSowFundFormationCore() throws InterruptedException {
			click("//*[@name='scope_of_work[0].fund_formation.phase_three.core_documents.noted_accepted']", "Core documents");
			return this;}
		
		
		//Expand Comment > Fund formation > Core documents
		public ProposalSOWPage ExpPropSowFundFormationCore(String Comments) throws InterruptedException {
			Thread.sleep(2000);
			click("(//*[text()='Core documents']/following::div[@aria-label='Comments'])[1]","Core documents");
			type("//*[@name='scope_of_work[0].fund_formation.phase_three.core_documents.comment']", Comments , "Core documents");	
			return this;}

		
		// Tick > Fund formation > Ancilliary documents
		public ProposalSOWPage clkPropSowFundFormationAncilliary() throws InterruptedException {
			click("//*[@name='scope_of_work[0].fund_formation.phase_three.ancilliary_documents.noted_accepted']", "Ancilliary documents");
			return this;}
		
		
		//Expand Comment > Fund formation > Ancilliary documents
		public ProposalSOWPage ExpPropSowFundFormationAncilliary(String Comments) throws InterruptedException {
			Thread.sleep(2000);
			click("(//*[text()='Ancilliary documents']/following::div[@aria-label='Comments'])[1]","Ancilliary documents");
			type("//*[@name='scope_of_work[0].fund_formation.phase_three.ancilliary_documents.comment']", Comments , "Ancilliary documents");	
			return this;}
		
		
		// Tick > Fund formation > Comment
		public ProposalSOWPage clkPropSowFundFormationPhaseThreeComment() throws InterruptedException {
			click("//*[@name='scope_of_work[0].fund_formation.phase_three.comment.noted_accepted']", "Phase 3 Comment");
			return this;}
		
		
		//Expand Comment > Fund formation > Comment
		public ProposalSOWPage ExpPropSowFundFormationComment(String Comments) throws InterruptedException {
			Thread.sleep(2000);
			click("(//*[text()='Ancilliary documents']/following::div[@aria-label='Comments'])[2]","Comment");
			type("//*[@name='scope_of_work[0].fund_formation.phase_three.comment.comment']", Comments , "Comment");	
			return this;}
		
		
		
		//Phase 4
		// Tick > Fund formation > Entity establishment
		public ProposalSOWPage clkPropSowFundFormationEntity() throws InterruptedException {
			click("//*[@name='scope_of_work[0].fund_formation.phase_four.entity_establishment.noted_accepted']", "Entity establishment");
			return this;}
		
		
		//Expand Comment > Fund formation > Entity establishment
		public ProposalSOWPage ExpPropSowFundFormationEntity(String Comments) throws InterruptedException {
			Thread.sleep(2000);
			click("(//*[text()='Entity establishment']/following::div[@aria-label='Comments'])[1]","Entity establishment");
			type("//*[@name='scope_of_work[0].fund_formation.phase_four.entity_establishment.comment']", Comments , "Entity establishment");	
			return this;}
		
		
		// Tick > Fund formation > Negotiations
		public ProposalSOWPage clkPropSowFundFormationNegotiations() throws InterruptedException {
			click("//*[@name='scope_of_work[0].fund_formation.phase_four.negotiations.noted_accepted']", "Negotiations");
			return this;}
		
		
		//Expand Comment > Fund formation > Negotiations
		public ProposalSOWPage ExpPropSowFundFormationNegotiations(String Comments) throws InterruptedException {
			Thread.sleep(2000);
			click("(//*[text()='Negotiations']/following::div[@aria-label='Comments'])[1]","Negotiations");
			type("//*[@name='scope_of_work[0].fund_formation.phase_four.negotiations.comment']", Comments , "Negotiations");	
			return this;}
		
		
		// Tick > Fund formation > Closings
		public ProposalSOWPage clkPropSowFundFormationClosings() throws InterruptedException {
			click("//*[@name='scope_of_work[0].fund_formation.phase_four.closings.noted_accepted']", "Closings");
			return this;}
		
		
		//Expand Comment > Fund formation > Closings
		public ProposalSOWPage ExpPropSowFundFormationClosings(String Comments) throws InterruptedException {
			Thread.sleep(2000);
			click("(//*[text()='Closings']/following::div[@aria-label='Comments'])[1]","Closings");
			type("//*[@name='scope_of_work[0].fund_formation.phase_four.closings.comment']", Comments , "Closings");	
			return this;}
		
		
		
		
		// Tick > Fund formation > Comment
		public ProposalSOWPage clkPropSowFundFormationPhaseFourComment() throws InterruptedException {
			click("//*[@name='scope_of_work[0].fund_formation.phase_four.comment.noted_accepted']", "Phase 4 Comment");
			return this;}
		
		
		//Expand Comment > Fund formation > Comment
		public ProposalSOWPage ExpPropSowFundFormationPhaseFourComment(String Comments) throws InterruptedException {
			Thread.sleep(2000);
			click("(//*[text()='Closings']/following::div[@aria-label='Comments'])[2]","Comment");
			type("//*[@name='scope_of_work[0].fund_formation.phase_four.comment.comment']", Comments , "Comment");	
			return this;}
		
		
		//Phase 5
		// Tick > Fund formation > Post Closing
		public ProposalSOWPage clkPropSowFundFormationPost() throws InterruptedException {
			click("//*[@name='scope_of_work[0].fund_formation.phase_five.post_closing.noted_accepted']", "Post Closing");
			return this;}
		
		//Expand Comment > Fund formation > Post Closing
		public ProposalSOWPage ExpPropSowFundFormationPhasePost(String Comments) throws InterruptedException {
			Thread.sleep(2000);
			click("(//*[text()='Post Closing']/following::div[@aria-label='Comments'])[1]","Post Closing");
			type("//*[@name='scope_of_work[0].fund_formation.phase_five.post_closing.comment']", Comments , "Post Closing");	
			return this;}
		
		
		// Tick > Fund formation > Optional Workstreams
		public ProposalSOWPage clkPropSowFundFormationOptional() throws InterruptedException {
			click("//*[@name='scope_of_work[0].fund_formation.phase_five.optional_workstreams.noted_accepted']", "Optional Workstreams");
			return this;}
		
		
		//Expand Comment > Fund formation > Optional Workstreams
		public ProposalSOWPage ExpPropSowFundFormationOptional(String Comments) throws InterruptedException {
			Thread.sleep(2000);
			click("(//*[text()='Optional Workstreams']/following::div[@aria-label='Comments'])[1]","Optional Workstreams");
			type("//*[@name='scope_of_work[0].fund_formation.phase_five.optional_workstreams.comment']", Comments , "Optional Workstreams");	
			return this;}
		
		
		
		// Tick > Fund formation > Comment
		public ProposalSOWPage clkPropSowFundFormationPhaseFiveComment() throws InterruptedException {
			click("//*[@name='scope_of_work[0].fund_formation.phase_five.comment.noted_accepted']", "Phase 5 Comment");
			return this;}
		
		
		//Expand Comment > Fund formation > Comment
		public ProposalSOWPage ExpPropSowFundFormationPhaseFive(String Comments) throws InterruptedException {
			Thread.sleep(2000);
			click("(//*[text()='Optional Workstreams']/following::div[@aria-label='Comments'])[2]","Phase Five Comment");
			type("//*[@name='scope_of_work[0].fund_formation.phase_five.comment.comment']", Comments , "Phase Five Comment");	
			return this;}
				
		
		
		
		
//9.--------------------------------------------------->  Fund investment  <---------------------------------------------------------------------			
		
		// Tick > Fund investment > Summarising key terms of the Fund’s documents and providing a material issues list
		public ProposalSOWPage clkPropSowFundInvestmentSummarising() throws InterruptedException {
			click("//*[@name='scope_of_work[0].fund_investment.summarising_key_terms.noted_accepted']", "Summarising key terms of the Fund’s documents");
			return this;}
		
		
		//Expand Comment > Fund investment > Summarising key terms of the Fund’s documents and providing a material issues list
		public ProposalSOWPage ExpPropSowFundInvestmentSummarising(String Comments) throws InterruptedException {
			Thread.sleep(2000);
			click("(//*[text()='Summarising key terms of the Fund’s documents and providing a material issues list']/following::div[@aria-label='Comments'])[1]","Summarising key terms of the Fund’s documents");
			type("//*[@name='scope_of_work[0].fund_investment.summarising_key_terms.comment']", Comments , "Summarising key terms of the Fund’s documents");	
			return this;}
		
	
		// Tick > Fund investment > Negotiating with the Fund’s legal counsel on the Fund’s documents (mainly limited partnership agreement or equivalent, side letter and subscription agreement);
		public ProposalSOWPage clkPropSowFundInvestmentNegotiating() throws InterruptedException {
			click("//*[@name='scope_of_work[0].fund_investment.negotiating_legal_counsel.noted_accepted']", "Negotiating with the Fund’s legal");
			return this;}
		
		
		//Expand Comment > Fund investment > Negotiating with the Fund’s legal counsel on the Fund’s documents (mainly limited partnership agreement or equivalent, side letter and subscription agreement);
		public ProposalSOWPage ExpPropSowFundInvestmentNegotiating(String Comments) throws InterruptedException {
			Thread.sleep(2000);
			click("(//*[text()='Negotiating with the Fund’s legal counsel on the Fund’s documents (mainly limited partnership agreement or equivalent, side letter and subscription agreement);']/following::div[@aria-label='Comments'])[1]","Negotiating with the Fund’s legal");
			type("//*[@name='scope_of_work[0].fund_investment.negotiating_legal_counsel.comment']", Comments , "Negotiating with the Fund’s legal");	
			return this;}
		
		
		// Tick > Fund investment > Related tax advice
		public ProposalSOWPage clkPropSowFundInvestmentRelated() throws InterruptedException {
			click("//*[@name='scope_of_work[0].fund_investment.related_tax_advice.noted_accepted']", "Related tax advice");
			return this;}
		
		//Expand Comment > Fund investment > Related tax advice
		public ProposalSOWPage ExpPropSowFundInvestmentRelated(String Comments) throws InterruptedException {
			Thread.sleep(2000);
			click("(//*[text()='Related tax advice']/following::div[@aria-label='Comments'])[1]","Related tax advice");
			type("//*[@name='scope_of_work[0].fund_investment.related_tax_advice.comment']", Comments , "Related tax advice");	
			return this;}
		
		
		// Tick > Fund investment > Assistance in execution and closing
		public ProposalSOWPage clkPropSowFundInvestmentAssistance() throws InterruptedException {
			click("//*[@name='scope_of_work[0].fund_investment.assistance_execution_closing.noted_accepted']", "Assistance in execution and closing");
			return this;}
		
		//Expand Comment > Fund investment > Assistance in execution and closing
		public ProposalSOWPage ExpPropSowFundInvestmentAssistance(String Comments) throws InterruptedException {
			Thread.sleep(2000);
			click("(//*[text()='Assistance in execution and closing']/following::div[@aria-label='Comments'])[1]","Assistance in execution and closing");
			type("//*[@name='scope_of_work[0].fund_investment.assistance_execution_closing.comment']", Comments , "Assistance in execution and closing");	
			return this;}
		
		
}