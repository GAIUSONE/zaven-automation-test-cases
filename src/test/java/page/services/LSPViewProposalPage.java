package page.services;


import java.awt.event.KeyEvent;
import com.force.base.ProjectHooks;
import com.force.config.ConfigurationManager;
import com.microsoft.playwright.BrowserContext;
import com.microsoft.playwright.PlaywrightException;

import page.base.AdminPage;
import page.base.ZavenHooks;

public class LSPViewProposalPage extends ProjectHooks{
	
//------------------------>  Proposal DashBoard <-----------------------

	//Click View Proposal
	public LSPViewProposalPage clickViewProposal() throws InterruptedException {
		click("(//button[text()='View Proposal'])[1]", "View Proposal");
		return this;}
	
//---------------------------------------------------------->     CCR      <-----------------------------------
		
		
	//Radio button > We can confirm that we are not conflicted and can act for you on this matter 
	public LSPViewProposalPage clickWeConfirmCCR() throws InterruptedException {
		click("(//span[contains(text(),'We can confirm that we are not conflicted and can act for you on this matter')])", "We can confirm that we are not conflicted");
		return this;}
	
	
//------------------------------------------------------------>  PI   <-----------------------------------------	
		
		
	//Radio button > We confirm our intention to submit a proposal before the deadline
		public LSPViewProposalPage clickIntentToSubmitCCR() throws InterruptedException {
			click("(//span[contains(text(),'We confirm our intention to submit a proposal before the deadline')])", "We confirm our intention to submit a proposal before the deadline");
			return this;}	
		
	//Radio button > We have decided not to participate to this RFP
		public LSPViewProposalPage clickNotToParticipate() throws InterruptedException {
			click("(//span[contains(text(),'We have decided not to participate to this RFP')])", "We have decided not to participate to this RFP");
			return this;}	
					
			
	// Tick > Description of project
		public LSPViewProposalPage clickPropDescOfProject() throws InterruptedException {
			System.out.println("Test");
			click("(//input[@name='preliminary_info[0].description.noted_accepted'])", "Description of project");
			return this;}
		
		
	//Expand Comment > Description of project
		public LSPViewProposalPage ExpandProposalDescOfProject(String Comments) throws InterruptedException {
			click("(//*[text()='Description of project']/following::div[@aria-label='Comments'])[1]","Description of project");
			type("//*[@name='preliminary_info[0].description.comment']", Comments , " Description of project ");	
			return this;}
		
		
	// Tick > Complexity of project
		public LSPViewProposalPage clickProposalComplexityOfProject() throws InterruptedException {
			click("//*[@name='preliminary_info[0].complexity.noted_accepted']", "Complexity of project");
			return this;}
	
		
	//Expand Comment > Complexity of project
		public LSPViewProposalPage ExpandProposalComplexity(String Comments) throws InterruptedException {
			click("(//*[text()='Complexity of project']/following::div[@aria-label='Comments'])[1]","Complexity of project");
			type("//*[@name='preliminary_info[0].complexity.comment']", Comments , " Complexity of project ");	
			return this;}
		
		
	// Tick > Objective in relation to project
		public LSPViewProposalPage clickProposalObjectiveInRelation() throws InterruptedException {
			click("//*[@name='preliminary_info[0].objective.noted_accepted']", "Objective in relation to project");
			return this;}
		
		
	//Expand Comment > Objective in relation to project
		public LSPViewProposalPage ExpandProposalObjectiveInRelation(String Comments) throws InterruptedException {
			click("(//*[text()='Objective in relation to project']/following::div[@aria-label='Comments'])[1]","Objective in relation to project");
			type("//*[@name='preliminary_info[0].objective.comment']", Comments , " Objective in relation to project ");	
			return this;}	
		
		
		// Tick > Jurisdiction/Language
				public LSPViewProposalPage clickProposalJurisdictionLanguage() throws InterruptedException {
					click("//*[@name='preliminary_info[0].jurisdiction.noted_accepted']", "Objective in relation to project");
					return this;}
		
		
		//Expand Comment > Jurisdiction/Language
			public LSPViewProposalPage ExpandProposalJurisdictionLanguage(String Comments) throws InterruptedException {
				click("(//*[text()='Jurisdiction/Language']/following::div[@aria-label='Comments'])[1]","Jurisdiction/Language");
				type("//*[@name='preliminary_info[0].jurisdiction.comment']", Comments , " Jurisdiction/Language ");	
				return this;}
		
		
			// Tick > Governing law of main legal documentation (if known/agreed)
			public LSPViewProposalPage clickProposalGoverningLaw() throws InterruptedException {
				click("//*[@name='preliminary_info[0].governing_law.noted_accepted']", "Governing law of main legal documentation");
				return this;}
		
		
			//Expand Comment > Governing law of main legal documentation (if known/agreed)
			public LSPViewProposalPage ExpandProposalGoverningLaw(String Comments) throws InterruptedException {
				click("(//*[text()='Governing law of main legal documentation (if known/agreed)']/following::div[@aria-label='Comments'])[1]","Governing law of main legal documentation");
				type("//*[@name='preliminary_info[0].governing_law.comment']", Comments , " Governing law of main legal documentation");	
				return this;}
		
		
			//Tick > Language of legal documentation
			public LSPViewProposalPage clickProposalLanguageOfLegalDoc() throws InterruptedException {
				click("//*[@name='preliminary_info[0].document_language.noted_accepted']", "Language of legal documentation");
				return this;}
		
		
			//Expand Comment > Language of legal documentation
			public LSPViewProposalPage ExpandProposalLanguageOfLegalDoc(String Comments) throws InterruptedException {
				click("(//*[text()='Language of legal documentation']/following::div[@aria-label='Comments'])[1]","Language of legal documentation");
				type("//*[@name='preliminary_info[0].document_language.comment']", Comments , " Language of legal documentation");	
				return this;}
		
			
			// Tick > Preferred language of correspondence between legal services provider and us
			public LSPViewProposalPage clickProposalPreferredLanguage() throws InterruptedException {
				click("//*[@name='preliminary_info[0].correspondence_language.noted_accepted']", "Preferred language of correspondence between legal services provider and us");
				return this;}
			
			
			//Expand Comment > Preferred language of correspondence between legal services provider and us
			public LSPViewProposalPage ExpandProposalPreferredLanguage(String Comments) throws InterruptedException {
				click("(//*[text()='Preferred language of correspondence between legal services provider and us']/following::div[@aria-label='Comments'])[1]","Preferred language of correspondence between legal services provider and us");
				type("//*[@name='preliminary_info[0].correspondence_language.comment']", Comments , " Preferred language of correspondence between legal services provider and us");	
				return this;}
		
		
			// Tick > We request that you confirm your intention to participate or not in this RFP by
			public LSPViewProposalPage clickProposalIntentionToParticipateBy() throws InterruptedException {
				click("//*[@name='preliminary_info[0].participate_dt.noted_accepted']", "Preferred language of correspondence between legal services provider and us");
				return this;}
			
			
			//Expand Comment > We request that you confirm your intention to participate or not in this RFP by
			public LSPViewProposalPage ExpandProposalIntentionToParticipateBy(String Comments) throws InterruptedException {
				click("(//*[text()='We request that you confirm your intention to participate or not in this RFP by']/following::div[@aria-label='Comments'])[1]","We request that you confirm your intention to participate or not in this RFP by");
				type("//*[@name='preliminary_info[0].participate_dt.comment']", Comments , " We request that you confirm your intention to participate or not in this RFP by");	
				return this;}
			
			
			// Tick > Terms & Conditions already pre-agreed between corporate and invited legal services providers
			public LSPViewProposalPage clickProposalTermsAndConditionsPreagreed() throws InterruptedException {
				click("//*[@name='preliminary_info[0].terms_conditions.pre_agreed.noted_accepted']", "Terms & Conditions already pre-agreed between corporate and invited legal services providers");
				return this;}
			
		
			//Expand Comment > Terms & Conditions already pre-agreed between corporate and invited legal services providers
			public LSPViewProposalPage ExpandProposalTermsAndConditionsPreagreed(String Comments) throws InterruptedException {
				click("(//*[text()='Terms & Conditions already pre-agreed between corporate and invited legal services providers']/following::div[@aria-label='Comments'])[1]","Terms & Conditions already pre-agreed between corporate and invited legal services providers");
				type("//*[@name='preliminary_info[0].terms_conditions.pre_agreed.comment']", Comments , "Terms & Conditions already pre-agreed between corporate and invited legal services providers");	
				return this;}
	
	
			// Tick > If not pre-agreed for one or more of the invited legal services providers	
			public LSPViewProposalPage clickProposalNotPreagreed() throws InterruptedException {
				click("//*[@name='preliminary_info[0].terms_conditions.not_pre_agreed.noted_accepted']", "If not pre-agreed for one or more of the invited legal services providers");
				return this;}
	
			
			//Expand Comment > If not pre-agreed for one or more of the invited legal services providers	
			public LSPViewProposalPage ExpandProposalNotPreagreed(String Comments) throws InterruptedException {
				click("(//*[text()='If not pre-agreed for one or more of the invited legal services providers']/following::div[@aria-label='Comments'])[2]","If not pre-agreed for one or more of the invited legal services providers");
				type("//*[@name='preliminary_info[0].terms_conditions.not_pre_agreed.comment']", Comments , "If not pre-agreed for one or more of the invited legal services providers");	
				return this;}
			
			
			// Tick > Our terms & conditions to apply (including billing policy)
			public LSPViewProposalPage clickProposalConditionsApply() throws InterruptedException {
				click("//*[@name='preliminary_info[0].terms_conditions.not_pre_agreed.our_terms_condition.noted_accepted']", "Our terms & conditions to apply (including billing policy)");
				return this;}
			
		
			//Expand Comment > Our terms & conditions to apply (including billing policy)	
			public LSPViewProposalPage ExpandProposalConditionsApply(String Comments) throws InterruptedException {
				click("(//*[text()='Our terms & conditions to apply (including billing policy)']/following::div[@aria-label='Comments'])[1]","If not pre-agreed for one or more of the invited legal services providers");
				type("//*[@name='preliminary_info[0].terms_conditions.not_pre_agreed.our_terms_condition.comment']", Comments , "If not pre-agreed for one or more of the invited legal services providers");	
				return this;}
			
		
			// Pi > Additional Information > 
			public LSPViewProposalPage piAdditionalInformation(String PiAdditionalInformationcomments) throws InterruptedException {
				type("//*[@name='preliminary_info[0].additional_information.comment']", PiAdditionalInformationcomments , "PI Additional Information");
				return this;}	
			
			// Add File
		  	public LSPViewProposalPage addFile() throws InterruptedException {
				uploadFile("(//button[text()='Upload'])", "./Uploads/LSP Logo.png", "Add File");
				return this;}
		
	
//---------------------------------------------------------->     Pricing      <------------------------------------------------		
			
			// Tick > Currency
			public LSPViewProposalPage clickPropPricingCurrency() throws InterruptedException {
				click("//*[@name='pricing[0].currency.noted_accepted']", "Currency");
				return this;}
						
						
			//Expand Comment > Currency	
			public LSPViewProposalPage ExpPropPricingCurrency(String Comments) throws InterruptedException {
				click("(//*[text()='Currency']/following::div[@aria-label='Comments'])[1]","Currency");
				type("//*[@name='pricing[0].currency.comment']", Comments , "Currency");	
				return this;}
			
			
//1. Total Fee
			
			// Model > Total Fee > Amount	
			public LSPViewProposalPage PropPricingTotalFeeAmt(String Amount) throws InterruptedException {
				type("//*[@name='pricing[0].model.total_fee.amount']", Amount , "Total Fee");	
				return this;}
			
			
			//Model > Total Fee > Description
			public LSPViewProposalPage PropPricingTotalFeeDesc(String Comments) throws InterruptedException {
				type("//*[@name='pricing[0].model.total_fee.comment']", Comments , "Total Fee");	
				return this;}
			
	
//2. Estimate
			
			// Model > Estimate > Amount
			public LSPViewProposalPage PropPricingEstimateAmt(String Amount) throws InterruptedException {
				type("//*[@name='pricing[0].model.estimate.amount']", Amount , "Estimate");	
				return this;}
			
			
			// Model > Estimate > Comment
			public LSPViewProposalPage PropPricingEstimateComment(String Comments) throws InterruptedException {
				type("//*[@name='pricing[0].model.estimate.comment']", Comments , "Estimate");	
				return this;}
			
			
			// Model > Estimate > Sub Description 
			public LSPViewProposalPage PropPricingEstimateDesc(String Desc) throws InterruptedException {
				type("//*[@name='pricing[0].model.estimate.breakdown_phases[0].description']", Desc , "Estimate");	
				return this;}
			
			
			
			// Model > Estimate > Sub Amount
			public LSPViewProposalPage PropPricingEstimateAmt1(String Amount) throws InterruptedException {
				type("//*[@name='pricing[0].model.estimate.breakdown_phases[0].amount']", Amount , "Estimate");	
				return this;}
			
			
			// Tick > Estimate Alternative/additional pricing benefits >
			public LSPViewProposalPage PropPricingEstimateAlternative() throws InterruptedException {
				click("//*[@name='pricing[0].model.estimate.alternative_or_additional_pricing_benefits.value']", "Estimate Alternative");	
				return this;}
			
			
			// Alternative/additional pricing benefits > Estimate > Description
			public LSPViewProposalPage PropPricingEstimateAltDesc(String Desc) throws InterruptedException {
				type("//*[@name='pricing[0].model.estimate.alternative_or_additional_pricing_benefits.details[0].description']", Desc , "Alt Estimate");	
				return this;}
							
						
			// Alternative/additional pricing benefits > Estimate > Amount
			public LSPViewProposalPage PropPricingEstimateAltAmt1(String Amount) throws InterruptedException {
				type("//*[@name='pricing[0].model.estimate.alternative_or_additional_pricing_benefits.details[0].amount']", Amount , "Alt Estimate");	
				return this;}
			
			
			

			
//3. Fixed fee		
			// Model > Fixed fee > amount
			public LSPViewProposalPage PropPricingFixedFeeAmt(String Amount) throws InterruptedException {
				type("//*[@name='pricing[0].model.fixed_fee.amount']", Amount , "Fixed fee");	
				return this;}
			
			
			// Model > Fixed fee > Comment
			public LSPViewProposalPage PropPricingFixedFeeComment(String Comments) throws InterruptedException {
				type("//*[@name='pricing[0].model.fixed_fee.comment']", Comments , "Fixed fee");	
				return this;}
			
			
			// Model > Estimate > Sub Description 
			public LSPViewProposalPage PropPricingFixedFeeDesc(String Desc) throws InterruptedException {
				type("//*[@name='pricing[0].model.fixed_fee.breakdown_phases[0].description']", Desc , "Fixed fee");	
				return this;}
			
			
			
			// Model > Fixed fee > Sub Amount
			public LSPViewProposalPage PropPricingFixedFeeAmt1(String Amount) throws InterruptedException {
				type("//*[@name='pricing[0].model.fixed_fee.breakdown_phases[0].amount']", Amount , "Fixed fee");	
				return this;}
			
			
			// Tick > Fixed fee > Alternative/additional pricing benefits 
			public LSPViewProposalPage PropPricingFixedFeeAlternative() throws InterruptedException {
				click("//*[@name='pricing[0].model.fixed_fee.alternative_or_additional_pricing_benefits.value']", "Fixed Fee Alternative");	
				return this;}
						
						
			// Alternative/additional pricing benefits > Fixed fee > Description
			public LSPViewProposalPage PropPricingFixedFeeAltDesc(String Desc) throws InterruptedException {
				type("//*[@name='pricing[0].model.fixed_fee.alternative_or_additional_pricing_benefits.details[0].description']", Desc , "Fixed Fee Alternative");	
				return this;}
										
									
			// Alternative/additional pricing benefits > Fixed fee > Amount
			public LSPViewProposalPage PropPricingFixedFeeAltAmt1(String Amount) throws InterruptedException {
				type("//*[@name='pricing[0].model.fixed_fee.alternative_or_additional_pricing_benefits.details[0].amount']", Amount , "Fixed Fee Alternative");	
			    return this;}
						
			
			
//4.  Capped fee
			
			// Model > Capped fee > amount
			public LSPViewProposalPage PropPricingCappedFeeAmt(String Amount) throws InterruptedException {
				type("//*[@name='pricing[0].model.capped_fee.amount']", Amount , "Capped fee");	
				return this;}
						
						
			// Model > Capped fee > Comment
			public LSPViewProposalPage PropPricingCappedFeeComment(String Comments) throws InterruptedException {
				type("//*[@name='pricing[0].model.capped_fee.comment']", Comments , "Capped fee");	
				return this;}
						
						
			// Model > Capped fee > Sub Description 
			public LSPViewProposalPage PropPricingCappedFeeDesc(String Desc) throws InterruptedException {
				type("//*[@name='pricing[0].model.capped_fee.breakdown_phases[0].description']", Desc , "Capped fee");	
				return this;}
						
							
		   // Model > Capped fee > Sub Amount
		   public LSPViewProposalPage PropPricingCappedFeeAmt1(String Amount) throws InterruptedException {
				type("//*[@name='pricing[0].model.capped_fee.breakdown_phases[0].amount']", Amount , "Capped fee");	
				return this;}
						
						
		  // Tick > Capped fee > Alternative/additional pricing benefits 
		  public LSPViewProposalPage PropPricingCappedFeeAlternative() throws InterruptedException {
				click("//*[@name='pricing[0].model.capped_fee.alternative_or_additional_pricing_benefits.value']", "Capped Fee Alternative");	
				return this;}
									
									
		// Alternative/additional pricing benefits > Capped fee > Description
		public LSPViewProposalPage PropPricingCappedFeeAltDesc(String Desc) throws InterruptedException {
				type("//*[@name='pricing[0].model.capped_fee.alternative_or_additional_pricing_benefits.details[0].description']", Desc , "Capped Fee Alternative");	
				return this;}
													
												
		// Alternative/additional pricing benefits > Capped fee > Amount
		public LSPViewProposalPage PropPricingCappedFeeAltAmt1(String Amount) throws InterruptedException {
				type("//*[@name='pricing[0].model.capped_fee.alternative_or_additional_pricing_benefits.details[0].amount']", Amount , "Capped Fee Alternative");	
				return this;}
												
				
//5.  Hourly rate fee
		
		// Model > Hourly rate fee > Comments
		public LSPViewProposalPage PropPricingHourlyRateFeeComment(String Comments) throws InterruptedException {
				type("//*[@name='pricing[0].model.hourly_rate_fee.comment']", Comments , "Hourly rate fee");	
				return this;}
								
			
//6.  Blended rates
		// Model > Blended rates > Amount
		public LSPViewProposalPage PropPricingBlendedRateAmt(String Comments) throws InterruptedException {
			type("//*[@name='pricing[0].model.blended_fee.amount']", Comments , "Blended rates Amount");	
			return this;}
	
	
		// Model > Blended rates > Comment
		public LSPViewProposalPage PropPricingBlendedRateComment(String Comments) throws InterruptedException {
			type("//*[@name='pricing[0].model.blended_fee.comment']", Comments , "Blended rates Comment");	
			return this;}
	
	
		// Tick > Blended rates > Alternative/additional pricing benefits 
		  public LSPViewProposalPage PropPricingBlendedRatesAlternative() throws InterruptedException {
				click("//*[@name='pricing[0].model.blended_fee.alternative_or_additional_pricing_benefits.value']", "Blended rates Alternative");	
				return this;}
									
									
		// Alternative/additional pricing benefits > Blended rates > Description
		public LSPViewProposalPage PropPricingBlendedRatesAltDesc(String Desc) throws InterruptedException {
				type("//*[@name='pricing[0].model.blended_fee.alternative_or_additional_pricing_benefits.details[0].description']", Desc , "Blended rates Alternative");	
				return this;}
													
												
		// Alternative/additional pricing benefits > Blended rates > Amount
		public LSPViewProposalPage PropPricingBlendedRatesAltAmt1(String Amount) throws InterruptedException {
				type("//*[@name='pricing[0].model.blended_fee.alternative_or_additional_pricing_benefits.details[0].amount']", Amount , "Blended rates Alternative");	
				return this;}
		
			
//7.  Contingent fee
	// Model > Contingent fee > Amount
		public LSPViewProposalPage PropPricingContingentFeeAmt(String Amount) throws InterruptedException {
			type("//*[@name='pricing[0].model.contingent_fee.amount']", Amount , "Contingent fee Amount");	
			return this;}
	
	
		// Model > Contingent fee > Comment
		public LSPViewProposalPage PropPricingContingentFeeComment(String Comments) throws InterruptedException {
			type("//*[@name='pricing[0].model.contingent_fee.comment']", Comments , "Contingent fee Comment");	
			return this;}
	
	
		// Tick > Contingent fee > Alternative/additional pricing benefits 
		  public LSPViewProposalPage PropPricingContingentFeeAlternative() throws InterruptedException {
				click("//*[@name='pricing[0].model.contingent_fee.alternative_or_additional_pricing_benefits.value']", "Contingent fee Comment");	
				return this;}
									
									
		// Alternative/additional pricing benefits > Contingent fee > Description
		public LSPViewProposalPage PropPricingContingentFeeAltDesc(String Desc) throws InterruptedException {
				type("//*[@name='pricing[0].model.contingent_fee.alternative_or_additional_pricing_benefits.details[0].description']", Desc , "Contingent fee Comment");	
				return this;}
													
												
		// Alternative/additional pricing benefits > Contingent fee > Amount
		public LSPViewProposalPage PropPricingContingentFeeAltAmt1(String Amount) throws InterruptedException {
				type("//*[@name='pricing[0].model.contingent_fee.alternative_or_additional_pricing_benefits.details[0].amount']", Amount , "Contingent fee Amount");	
				return this;}
		
			
//8.  Abort discount
		// Model > Abort discount > Amount
		public LSPViewProposalPage PropPricingAbortDiscountAmt(String Amount) throws InterruptedException {
				type("//*[@name='pricing[0].model.abort_discount.amount']", Amount , "Abort discount");	
				return this;}
			
			
		// Model > Abort discount > Comment
		public LSPViewProposalPage PropPricingAbortDiscountComment(String Comments) throws InterruptedException {
				type("//*[@name='pricing[0].model.abort_discount.comment']", Comments , "Abort discount");	
				return this;}
			
			
		// Tick > Abort discount > Alternative/additional pricing benefits 
		public LSPViewProposalPage PropPricingAbortDiscountAlternative() throws InterruptedException {
				click("//*[@name='pricing[0].model.abort_discount.alternative_or_additional_pricing_benefits.value']", "Abort discount");	
				return this;}
											
											
		// Alternative/additional pricing benefits > Abort discount > Description
		public LSPViewProposalPage PropPricingAbortDiscountAltDesc(String Desc) throws InterruptedException {
				type("//*[@name='pricing[0].model.abort_discount.alternative_or_additional_pricing_benefits.details[0].description']", Desc , "Abort discount");	
				return this;}
															
														
		// Alternative/additional pricing benefits > Abort discount > Amount
		public LSPViewProposalPage PropPricingAbortDiscountAltAmt1(String Amount) throws InterruptedException {
				type("//*[@name='pricing[0].model.abort_discount.alternative_or_additional_pricing_benefits.details[0].amount']", Amount , "Abort discount");	
				return this;}	
		
		
//9.  Success fee
		
		// Model > Success fee > Amount
		public LSPViewProposalPage PropPricingSuccessFeeAmt(String Amount) throws InterruptedException {
				type("//*[@name='pricing[0].model.success_fee.amount']", Amount , "Success fee");	
				return this;}
					
					
		// Model > Success fee > Comment
		public LSPViewProposalPage PropPricingSuccessFeeComment(String Comments) throws InterruptedException {
				type("//*[@name='pricing[0].model.success_fee.comment']", Comments , "Success fee");	
				return this;}
					
					
		// Tick > Success fee > Alternative/additional pricing benefits 
		public LSPViewProposalPage PropPricingSuccessFeeAlternative() throws InterruptedException {
				click("//*[@name='pricing[0].model.success_fee.alternative_or_additional_pricing_benefits.value']", "Success fee");	
				return this;}
													
													
		// Alternative/additional pricing benefits > Success fee > Description
		public LSPViewProposalPage PropPricingSuccessFeeAltDesc(String Desc) throws InterruptedException {
				type("//*[@name='pricing[0].model.success_fee.alternative_or_additional_pricing_benefits.details[0].description']", Desc , "Success fee");	
				return this;}
																	
																
		// Alternative/additional pricing benefits > Success fee > Amount
		public LSPViewProposalPage PropPricingSuccessFeeAltAmt1(String Amount) throws InterruptedException {
				type("//*[@name='pricing[0].model.success_fee.alternative_or_additional_pricing_benefits.details[0].amount']", Amount , "Success fee");	
				return this;}	
		
			
//10. Reverse Auction (To be conducted by Corporate outside of Zaven)
		//Tick > Reverse Auction
		public LSPViewProposalPage clickProPricingReverseAuction() throws InterruptedException {
			click("//*[@name='pricing[0].model.reverse_auction.noted_accepted']", "Reverse Auction");
			return this;}
	
	
		//Expand Comment > Reverse Auction
		public LSPViewProposalPage ExpPropPricingReverseAuction(String Comments) throws InterruptedException {
			click("(//*[text()='Reverse Auction (To be conducted by Corporate outside of Zaven)']/following::div[@aria-label='Comments'])[1]","Reverse Auction");
			type("//*[@name='pricing[0].model.reverse_auction.comment']", Comments , " Reverse Auction ");	
			return this;}
		
		
		// Tick > Reverse Auction > Alternative/additional pricing benefits 
		public LSPViewProposalPage PropPricingReverseAuctionAlternative() throws InterruptedException {
			click("//*[@name='pricing[0].model.reverse_auction.alternative_or_additional_pricing_benefits.value']", "Reverse Auction");	
			return this;}
															
															
		// Alternative/additional pricing benefits > Reverse Auction > Description
		public LSPViewProposalPage PropPricingReverseAuctionAltDesc(String Desc) throws InterruptedException {
			type("//*[@name='pricing[0].model.reverse_auction.alternative_or_additional_pricing_benefits.details[0].description']", Desc , "Reverse Auction");	
			return this;}
																			
																		
		// Alternative/additional pricing benefits > Reverse Auction > Amount
		public LSPViewProposalPage PropPricingReverseAuctionAltAmt1(String Amount) throws InterruptedException {
			type("//*[@name='pricing[0].model.reverse_auction.alternative_or_additional_pricing_benefits.details[0].amount']", Amount , "Reverse Auction");	
			return this;}	
			
			
//11. Free initial advice up to a certain amount
		// Model > Free initial advice up to a certain amount > Amount
		public LSPViewProposalPage PropPricingFreeInitialAmt(String Amount) throws InterruptedException {
			type("//*[@name='pricing[0].model.free_advise.amount']", Amount , "Free initial advice up to a certain amount");	
			return this;}
							
							
		// Model > Free initial advice up to a certain amount > Comment
		public LSPViewProposalPage PropPricingFreeInitialComment(String Comments) throws InterruptedException {
			type("//*[@name='pricing[0].model.free_advise.comment']", Comments , "Free initial advice up to a certain amount");	
			return this;}
		
		
		// Tick > Free initial advice up to a certain amount > Alternative/additional pricing benefits 
		public LSPViewProposalPage PropPricingFreeInitialAlternative() throws InterruptedException {
			click("//*[@name='pricing[0].model.free_advise.alternative_or_additional_pricing_benefits.value']", "Free initial advice up to a certain amount");	
			return this;}
																	
																	
		// Alternative/additional pricing benefits > Free initial advice up to a certain amount > Description
		public LSPViewProposalPage PropPricingFreeInitialAltDesc(String Desc) throws InterruptedException {
			type("//*[@name='pricing[0].model.free_advise.alternative_or_additional_pricing_benefits.details[0].description']", Desc , "Free initial advice up to a certain amount");	
			return this;}
																					
																				
		// Alternative/additional pricing benefits > Free initial advice up to a certain amount > Amount
		public LSPViewProposalPage PropPricingFreeInitialAltAmt1(String Amount) throws InterruptedException {
			type("//*[@name='pricing[0].model.free_advise.alternative_or_additional_pricing_benefits.details[0].amount']", Amount , "Free initial advice up to a certain amount");	
			return this;}	
				
			
			
//12. Retainer (general/project based)
	   //Tick > Retainer
		public LSPViewProposalPage clickProPricingRetainer() throws InterruptedException {
			click("//*[@name='pricing[0].model.retainer.noted_accepted']", "Retainer");
			return this;}
			
			
		//Expand Comment > Retainer
		public LSPViewProposalPage ExpPropPricingRetainer(String Comments) throws InterruptedException {
			click("(//*[text()='Retainer (general/project based)']/following::div[@aria-label='Comments'])[1]","Retainer");
			type("//*[@name='pricing[0].model.retainer.comment']", Comments , " Retainer ");	
			return this;}
		
		
		// Tick > Retainer > Alternative/additional pricing benefits 
		public LSPViewProposalPage PropPricingRetainerAlternative() throws InterruptedException {
			click("//*[@name='pricing[0].model.retainer.alternative_or_additional_pricing_benefits.value']", "Retainer");	
			return this;}
																			
																			
		// Alternative/additional pricing benefits > Retainer > Description
		public LSPViewProposalPage PropPricingRetainerAltDesc(String Desc) throws InterruptedException {
			type("//*[@name='pricing[0].model.retainer.alternative_or_additional_pricing_benefits.details[0].description']", Desc , "Retainer");	
			return this;}
																							
																						
		// Alternative/additional pricing benefits > Retainer > Amount
		public LSPViewProposalPage PropPricingRetainerAltAmt1(String Amount) throws InterruptedException {
			type("//*[@name='pricing[0].model.retainer.alternative_or_additional_pricing_benefits.details[0].amount']", Amount , "Retainer");	
			return this;}	
			
			
			
//13. Budget for project
		
		// Model > Budget for project > Comment
		public LSPViewProposalPage PropPricingBudgetForProjectCmt(String comment) throws InterruptedException {
			type("//*[@name='pricing[0].model.budget.comment']", comment , "Budget for project");	
			return this;}
							
							
		// Model > Budget for project > Desc
		public LSPViewProposalPage PropPricingBudgetForProjectDesc(String Desc) throws InterruptedException {
			type("//*[@name='pricing[0].model.budget.breakdown_phases[0].description']", Desc , "Budget for project");	
			return this;}
				
				
		// Model > Budget for project > Amount
		public LSPViewProposalPage PropPricingBudgetForProjectAmt(String Amount) throws InterruptedException {
			type("//*[@name='pricing[0].model.budget.breakdown_phases[0].amount']", Amount , "Budget for project");	
			return this;}
				
		
		
		// Tick > Budget for project > Alternative/additional pricing benefits 
		public LSPViewProposalPage PropPricingBudgetForProjectAlternative() throws InterruptedException {
			click("//*[@name='pricing[0].model.budget.alternative_or_additional_pricing_benefits.value']", "Budget for project");	
			return this;}
																					
																					
		// Alternative/additional pricing benefits > Budget for project > Description
		public LSPViewProposalPage PropPricingBudgetForProjectAltDesc(String Desc) throws InterruptedException {
			type("//*[@name='pricing[0].model.budget.alternative_or_additional_pricing_benefits.details[0].description']", Desc , "Budget for project");	
			return this;}
																									
																								
		// Alternative/additional pricing benefits > Budget for project > Amount
		public LSPViewProposalPage PropPricingBudgetForProjectAltAmt1(String Amount) throws InterruptedException {
			type("//*[@name='pricing[0].model.budget.alternative_or_additional_pricing_benefits.details[0].amount']", Amount , "Budget for project");	
			return this;}	
					
			
//14. Model > Other
		
		
		//Tick > Model Other
		public LSPViewProposalPage clickProPricingModelOther() throws InterruptedException {
			click("//*[@name='pricing[0].model.other.noted_accepted']", "Model Other");
			return this;}
					
					
		//Expand Comment > Other
		public LSPViewProposalPage ExpPropPricingModelOther(String Comments) throws InterruptedException {
			click("(//*[text()='Other']/following::div[@aria-label='Comments'])[1]","Model Other");
			type("//*[@name='pricing[0].model.other.comment']", Comments , " Model Other ");	
			return this;}
		
		
		// Tick > Other > Alternative/additional pricing benefits 
		public LSPViewProposalPage PropPricingOtherAlternative() throws InterruptedException {
			click("//*[@name='pricing[0].model.other.alternative_or_additional_pricing_benefits.value']", "Model Other");	
			return this;}
																					
																					
		// Alternative/additional pricing benefits >Other > Description
		public LSPViewProposalPage PropPricingOtherAltDesc(String Desc) throws InterruptedException {
			type("//*[@name='pricing[0].model.other.alternative_or_additional_pricing_benefits.details[0].description']", Desc , "Model Other");	
			return this;}
																									
																								
		// Alternative/additional pricing benefits > Other > Amount
		public LSPViewProposalPage PropPricingOtherAltAmt1(String Amount) throws InterruptedException {
			type("//*[@name='pricing[0].model.other.alternative_or_additional_pricing_benefits.details[0].amount']", Amount , "Model Other");	
			return this;}	
						
		
// Expenses	
	  //Tick > if expenses not covered in T&Cs agreed/to be agreed between Corporate and winning bidder, consider the following
	  public LSPViewProposalPage clickProPricingWinningBidder() throws InterruptedException {
			click("//*[@name='pricing[0].model.expenses.expenses_not_covered_in_tc.noted_accepted']", "if expenses not covered in T&Cs agreed/to be agreed between Corporate and winning bidder");
			return this;}
							
							
	//Expand Comment > if expenses not covered in T&Cs agreed/to be agreed between Corporate and winning bidder, consider the following
	public LSPViewProposalPage ExpPropPricingWinningBidder(String Comments) throws InterruptedException {
			click("(//*[text()='if expenses not covered in T&Cs agreed/to be agreed between Corporate and winning bidder, consider the following']/following::div[@aria-label='Comments'])[5]","if expenses not covered in T&Cs agreed");
			type("//*[@name='pricing[0].model.expenses.expenses_not_covered_in_tc.comment']", Comments , " if expenses not covered ");	
			return this;}	
			
	  // Tick > Percentage of total fee	
	  public LSPViewProposalPage clickProPricingPercentage() throws InterruptedException {
			click("//*[@name='pricing[0].model.expenses.expenses_not_covered_in_tc.percentage_of_total_fee.noted_accepted']", " Percentage of total fee	");
			return this;}
							
							
	  //Expand Comment > Percentage of total fee	
	  public LSPViewProposalPage ExpPropPricingPercentage(String Comments) throws InterruptedException {
			click("(//*[text()='Percentage of total fee']/following::div[@aria-label='Comments'])[1]","Percentage of total fee");
			type("//*[@name='pricing[0].model.expenses.expenses_not_covered_in_tc.percentage_of_total_fee.comment']", Comments , " Percentage of total fee ");	
			return this;}
	
	
		// Tick > same as client
		public LSPViewProposalPage clickProPricingClient() throws InterruptedException {
			click("//*[@name='pricing[0].model.expenses.travel_hotel_categories.same_as_client.noted_accepted']", "same as client");
			return this;}
								
								
		//Expand Comment > same as client	
		public LSPViewProposalPage ExpPropPricingClient(String Comments) throws InterruptedException {
			click("(//*[text()='same as client']/following::div[@aria-label='Comments'])[1]","same as client");
			type("//*[@name='pricing[0].model.expenses.travel_hotel_categories.same_as_client.comment']", Comments , "same as client");	
			return this;}
	
	
		// Tick > Travel class
		public LSPViewProposalPage clickProPricingTravel() throws InterruptedException {
			click("//*[@name='pricing[0].model.expenses.travel_hotel_categories.travel_class.noted_accepted']", "Travel class");
			return this;}
							
							
		//Expand Comment > Travel class	
		public LSPViewProposalPage ExpPropPricingTravel(String Comments) throws InterruptedException {
			click("(//*[text()='Travel class']/following::div[@aria-label='Comments'])[1]","Travel class");
			type("//*[@name='pricing[0].model.expenses.travel_hotel_categories.travel_class.comment']", Comments , "Travel class");	
			return this;}
	
	
		// Tick > Hotel
		public LSPViewProposalPage clickProPricingHotel() throws InterruptedException {
			click("//*[@name='pricing[0].model.expenses.travel_hotel_categories.hotel.noted_accepted']", "Hotel");
			return this;}
									
									
		//Expand Comment > Hotel	
		public LSPViewProposalPage ExpPropPricingHotel(String Comments) throws InterruptedException {
			click("(//*[text()='Hotel']/following::div[@aria-label='Comments'])[1]","Hotel");
			type("//*[@name='pricing[0].model.expenses.travel_hotel_categories.hotel.comment']", Comments , "Hotel");	
			return this;}
	
	
		// Tick > Bidders to indicate any applicable tax to fees and %
		public LSPViewProposalPage clickProPricingApplicableTax() throws InterruptedException {
			click("//*[@name='pricing[0].model.taxes.noted_accepted']", "Bidders to indicate");
			return this;}
									
									
		//Expand Comment > Bidders to indicate any applicable tax to fees and %
		public LSPViewProposalPage ExpPropPricingApplicableTax(String Comments) throws InterruptedException {
			click("(//*[text()='Bidders to indicate any applicable tax to fees and %']/following::div[@aria-label='Comments'])[1]","Bidders to indicate");
			type("//*[@name='pricing[0].model.taxes.comment']", Comments , "Bidders to indicate");	
			return this;}
		
		
		// Tick > Bidders to indicate any applicable tax to fees and % > Alternative/additional pricing benefits 
		public LSPViewProposalPage PropPricingApplicableTaxAlternative() throws InterruptedException {
			click("//*[@name='pricing[0].model.taxes.alternative_or_additional_pricing_benefits.value']", "Bidders to indicate");	
			return this;}
																							
																							
		// Alternative/additional pricing benefits > Bidders to indicate any applicable tax to fees and % > Description
		public LSPViewProposalPage PropPricingApplicableTaxAltDesc(String Desc) throws InterruptedException {
			type("//*[@name='pricing[0].model.taxes.alternative_or_additional_pricing_benefits.details[0].description']", Desc , "Bidders to indicate");	
			return this;}
																											
																										
		// Alternative/additional pricing benefits > Bidders to indicate any applicable tax to fees and % > Amount
		public LSPViewProposalPage PropPricingApplicableTaxAltAmt1(String Amount) throws InterruptedException {
			type("//*[@name='pricing[0].model.taxes.alternative_or_additional_pricing_benefits.details[0].amount']", Amount , "Bidders to indicate");	
			return this;}
		
		
		// Assumptions & Exclusions
		// Tick > Bidders can add additional assumptions & exclusions in their fee proposal
		public LSPViewProposalPage clickProPricingAddAdditional() throws InterruptedException {
			click("//*[@name='pricing[0].assumptions_exclusions.add_assumption.noted_accepted']", "Bidders can add additional assumptions & exclusions");
			return this;}
											
											
		//Expand Comment > Bidders can add additional assumptions & exclusions in their fee proposal
		public LSPViewProposalPage ExpPropPricingAddAdditional(String Comments) throws InterruptedException {
			click("(//*[text()='Bidders can add additional assumptions & exclusions in their fee proposal']/following::div[@aria-label='Comments'])[1]","Bidders to indicate");
			type("//*[@name='pricing[0].assumptions_exclusions.add_assumption.comment']", Comments , "Bidders can add additional");	
			return this;}
		
		
		// Tick > Bidders shall not add any additional assumption exclusion in their fee proposal
		public LSPViewProposalPage clickProPricingNotAddAdditional() throws InterruptedException {
				click("//*[@name='pricing[0].assumptions_exclusions.not_add_assumption.noted_accepted']", "Bidders shall not add additional assumptions & exclusions");
				return this;}
		
		
		
		// Tick > Expected completion of project from date of instruction (in weeks)
		public LSPViewProposalPage clickProPricingInstruction() throws InterruptedException {
			click("//*[@name='pricing[0].assumptions_exclusions.completion_duration.noted_accepted']", "Expected completion of project from date of instruction (in weeks)");
			return this;}
											
											
		//Expand Comment > Expected completion of project from date of instruction (in weeks)
		public LSPViewProposalPage ExpPropPricingInstruction(String Comments) throws InterruptedException {
			click("(//*[text()='Expected completion of project from date of instruction (in weeks)']/following::div[@aria-label='Comments'])[1]","Expected completion of project from date of instruction (in weeks)");
			type("//*[@name='pricing[0].assumptions_exclusions.completion_duration.comment']", Comments , "Expected completion of project from date of instruction (in weeks)");	
			return this;}
		
		
		
		// Tick > Email
		public LSPViewProposalPage clickProPricingEmail() throws InterruptedException {
			click("//*[@name='pricing[0].assumptions_exclusions.work_product_format.email.noted_accepted']", "Email");
			return this;}
											
											
		//Expand Comment > Email
		public LSPViewProposalPage ExpPropPricingEmail(String Comments) throws InterruptedException {
			click("(//*[text()='Email']/following::div[@aria-label='Comments'])[1]","Email");
			type("//*[@name='pricing[0].assumptions_exclusions.work_product_format.email.comment']", Comments , "Email");	
			return this;}
		
		
		// Tick > Memo
		public LSPViewProposalPage clickProPricingMemo() throws InterruptedException {
			click("//*[@name='pricing[0].assumptions_exclusions.work_product_format.memo.noted_accepted']", "Memo");
			return this;}
											
											
		//Expand Comment > Memo
		public LSPViewProposalPage ExpPropPricingMemo(String Comments) throws InterruptedException {
			click("(//*[text()='Memo']/following::div[@aria-label='Comments'])[1]","Memo");
			type("//*[@name='pricing[0].assumptions_exclusions.work_product_format.memo.comment']", Comments , "Memo");	
			return this;}
		
		
		// Tick > Power Point slides
		public LSPViewProposalPage clickProPricingPowerPointSlides() throws InterruptedException {
			click("//*[@name='pricing[0].assumptions_exclusions.work_product_format.slides.noted_accepted']", "Power Point slides");
			return this;}
											
											
		//Expand Comment > Power Point slides
		public LSPViewProposalPage ExpPropPricingPowerPointSlides(String Comments) throws InterruptedException {
			click("(//*[text()='Power Point slides']/following::div[@aria-label='Comments'])[1]","Power Point slides");
			type("//*[@name='pricing[0].assumptions_exclusions.work_product_format.slides.comment']", Comments , "Power Point slides");	
			return this;}
		
		
		
		// Tick > Legal opinion
		public LSPViewProposalPage clickProPricingLegalOpinion() throws InterruptedException {
			click("//*[@name='pricing[0].assumptions_exclusions.work_product_format.legal_opinion.noted_accepted']", "Legal opinion");
			return this;}
											
											
		//Expand Comment > Legal opinion
		public LSPViewProposalPage ExpPropPricingLegalOpinion(String Comments) throws InterruptedException {
			click("(//*[text()='Legal opinion']/following::div[@aria-label='Comments'])[1]","Legal opinion");
			type("//*[@name='pricing[0].assumptions_exclusions.work_product_format.legal_opinion.comment']", Comments , "Legal opinion");	
			return this;}
		
		
		// Tick > legal documents drafting
		public LSPViewProposalPage clickProPricingLegalDocument() throws InterruptedException {
			click("//*[@name='pricing[0].assumptions_exclusions.work_product_format.document_drafting.noted_accepted']", "legal documents drafting");
			return this;}
											
											
		//Expand Comment > legal documents drafting
		public LSPViewProposalPage ExpPropPricingLegalDocument(String Comments) throws InterruptedException {
			click("(//*[text()='legal documents drafting']/following::div[@aria-label='Comments'])[1]","legal documents drafting");
			type("//*[@name='pricing[0].assumptions_exclusions.work_product_format.document_drafting.comment']", Comments , "legal documents drafting");	
			return this;}
		
		
		// Tick > Work product format > Comment
		public LSPViewProposalPage clickProPricingComment() throws InterruptedException {
			click("//*[@name='pricing[0].assumptions_exclusions.work_product_format.comment.noted_accepted']", "Work product format Comment");
			return this;}
											
											
		//Expand Comment > Work product format > Comment
		public LSPViewProposalPage ExpPropPricingComment(String Comments) throws InterruptedException {
			click("(//*[text()='Comment']/following::div[@aria-label='Comments'])[1]","Work product format Comment");
			type("//*[@name='pricing[0].assumptions_exclusions.work_product_format.comment.comment']", Comments , "Work product format Comment");	
			return this;}
		
		
		// Tick > Following Jurisdiction/Language explicitly excluded from scope of work
		public LSPViewProposalPage clickProPricingJurisdictionLanguage() throws InterruptedException {
			click("//*[@name='pricing[0].assumptions_exclusions.legal_jurisdictions.noted_accepted']", "Following Jurisdiction/Language explicitly excluded from scope of work");
			return this;}
											
											
		//Expand Comment > Following Jurisdiction/Language explicitly excluded from scope of work > Comment
		public LSPViewProposalPage ExpPropPricingJurisdictionLanguageComment(String Comments) throws InterruptedException {
			click("(//*[text()='Following Jurisdiction/Language explicitly excluded from scope of work']/following::div[@aria-label='Comments'])[1]","Following Jurisdiction/Language explicitly excluded from scope of work");
			type("//*[@name='pricing[0].assumptions_exclusions.legal_jurisdictions.comment']", Comments , "Following Jurisdiction/Language explicitly excluded from scope of work");	
			return this;}
		
		
		// Tick > Legal service provider to select, engage and coordinate work of any local legal counsel(s)
		public LSPViewProposalPage clickProPricingLocalLegalCounsel() throws InterruptedException {
			click("//*[@name='pricing[0].assumptions_exclusions.bidders_select_counsel.noted_accepted']", "Legal service provider to select, engage and coordinate work of any local legal counsel(s)");
			return this;}
											
											
		//Expand Comment > Legal service provider to select, engage and coordinate work of any local legal counsel(s) > Comment
		public LSPViewProposalPage ExpPropPricingLocalLegalCounselComment(String Comments) throws InterruptedException {
			click("(//*[text()='Legal service provider to select, engage and coordinate work of any local legal counsel(s)']/following::div[@aria-label='Comments'])[1]","Legal service provider to select, engage and coordinate work of any local legal counsel(s)");
			type("//*[@name='pricing[0].assumptions_exclusions.bidders_select_counsel.comment']", Comments , "Legal service provider to select, engage and coordinate work of any local legal counsel(s)");	
			return this;}	
		
		
		// Tick > Tax advice is excluded
		public LSPViewProposalPage clickProPricingTaxAdvice() throws InterruptedException {
			click("//*[@name='pricing[0].assumptions_exclusions.tax_advise_exclude.noted_accepted']", "Tax advice is excluded");
			return this;}
											
											
		//Expand Comment > Tax advice is excluded > Comment
		public LSPViewProposalPage ExpPropPricingTaxAdviceComment(String Comments) throws InterruptedException {
			click("(//*[text()='Tax advice is excluded']/following::div[@aria-label='Comments'])[1]","Tax advice is excluded");
			type("//*[@name='pricing[0].assumptions_exclusions.tax_advise_exclude.comment']", Comments , "Tax advice is excluded");	
			return this;}
		
		
		// Tick > No travel expected
		public LSPViewProposalPage clickProPricingNoTravel() throws InterruptedException {
			click("//*[@name='pricing[0].assumptions_exclusions.no_travel_expected.noted_accepted']", "No travel expected");
			return this;}
													
													
		//Expand Comment > No travel expected > Comment
		public LSPViewProposalPage ExpPropPricingNoTravelComment(String Comments) throws InterruptedException {
			click("(//*[text()='No travel expected']/following::div[@aria-label='Comments'])[1]","No travel expected");
			type("//*[@name='pricing[0].assumptions_exclusions.no_travel_expected.comment']", Comments , "No travel expected");	
			return this;}

		
		// Tick > Assumptions & Exclusions > Other
		public LSPViewProposalPage clickProPricingAssumptionsExclusionsOther() throws InterruptedException {
			click("//*[@name='pricing[0].assumptions_exclusions.other.noted_accepted']", " Assumptions & Exclusions Other");
			return this;}
													
													
		//Expand Comment > Assumptions & Exclusions > Other
		public LSPViewProposalPage ExpPropPricingAssumptionsExclusionsOtherComment(String Comments) throws InterruptedException {
			click("(//*[text()='No travel expected']/following::div[@aria-label='Comments'])[2]","Assumptions & Exclusions Other");
			type("//*[@name='pricing[0].assumptions_exclusions.other.comment']", Comments , "Assumptions & Exclusions Other");	
			return this;}
		
		
		// Additional Information
		public LSPViewProposalPage PricingAdditionalInfo(String PiAdditionalInfocomments) throws InterruptedException {
			type("//*[@name='pricing[0].additional_information.comment']", PiAdditionalInfocomments , "Pricing Additional Information");
			return this;}
		
		
//--------------------------------------------------->     Other Key Information      <-------------------------------------------------------		
	
		// upload File
	  	public LSPViewProposalPage OKIFileUpload() throws InterruptedException {
			uploadFile("(//b[text()='Add biographies w/wo picture:']//following::button)[1]/input", "./Uploads/LSP Logo.png", "FileUpload");
			return this;}

		
		// Tick > Key team members > Location of lead partner/member 
		public LSPViewProposalPage clickPropOkiLocationLeadPartner() throws InterruptedException {
			click("//*[@name='other_key_info[0].location_lead_member.noted_accepted']", "Location of lead partner/member");
			return this;}
													
													
		//Expand Comment > Key team members > Location of lead partner/member 
		public LSPViewProposalPage ExpPropOkiLocationLeadPartnerCmt(String Comments) throws InterruptedException {
			click("(//*[text()='Location of lead partner/member']/following::div[@aria-label='Comments'])[1]","Location of lead partner/member");
			type("//*[@name='other_key_info[0].location_lead_member.comment']", Comments , "Location of lead partner/member");	
			return this;}
		
		
		//Enter >OKI > Lead partner/member > Name
		public LSPViewProposalPage OKILeadPatnerName(String OKIName) throws InterruptedException {
			type("//*[@name='other_key_info[0].key_team_members.lead_partner_member[0].name']", OKIName , "OKIName");
			return this;}
		
		
		//Enter >OKI > Lead partner/member > Sur Name
		public LSPViewProposalPage OKILeadPatnerSurName(String OKISurName) throws InterruptedException {
			type("//*[@name='other_key_info[0].key_team_members.lead_partner_member[0].surname']", OKISurName , "OKISurName");
			return this;}
		
		
		//Enter >OKI > Lead partner/member > Location
		public LSPViewProposalPage OKILeadPatnerLocation(String OKILocation) throws InterruptedException {
			type("//*[@name='other_key_info[0].key_team_members.lead_partner_member[0].location']", OKILocation , "OKILocation");
			return this;}
		
		
		//Select from drop down > Email
	    public LSPViewProposalPage OkiEmail() throws InterruptedException {
			click("//*[@name='other_key_info[0].key_team_members.lead_partner_member[0].email']","Email");
			pageDown();
		    enter();
			return this;}
		
		
		//Select > Title 
	    public LSPViewProposalPage OkiTitle() throws InterruptedException {
			click("//*[@name='other_key_info[0].key_team_members.lead_partner_member[0].title']","Title");
			pageDown();
		    enter();
			return this;}
	    
	    
		//Select > Role
	    public LSPViewProposalPage OkiRole() throws InterruptedException {
			click("//*[@name='other_key_info[0].key_team_members.lead_partner_member[0].role']","Role");
			pageDown();
		    enter();
			return this;}
	    
	    
		//Select > Years Of Experience
	    public LSPViewProposalPage OkiYearsOfExp() throws InterruptedException {
			click("//*[@name='other_key_info[0].key_team_members.lead_partner_member[0].year_of_experience']","Years Of Experience");
			pageDown();
		    enter();
			return this;}
	    
	    
	    //Enter >OKI > Hourly Rate
	    public LSPViewProposalPage OKIHourlyRate(String OKIHourlyRate) throws InterruptedException {
			type("//*[@name='other_key_info[0].key_team_members.lead_partner_member[0].hourly_rate']", OKIHourlyRate , "OKIHourly Rate");
			return this;}
		
		
	 // Tick > OKI > Biographies 
	 public LSPViewProposalPage clickPropOkiBiographies() throws InterruptedException {
	 	click("//*[@name='other_key_info[0].key_team_members.lead_partner_member[0].add_biography.noted_accepted']", "Biographies");
	 	return this;}
	 													
	 													
	 //Expand Comment > OKI > Biographies
	 public LSPViewProposalPage ExpPropOkiBiographiesCmt(String Comments) throws InterruptedException {
	 	click("(//*[text()='Biographies']/following::div[@aria-label='Comments'])[1]","Biographies");
	 	type("//*[@name='other_key_info[0].key_team_members.lead_partner_member[0].add_biography.comment']", Comments , "Biographies");	
	 	return this;}
		
	 
	  // Tick > OKI > Staffing and project management
		 public LSPViewProposalPage clickPropOkiStaffing() throws InterruptedException {
		 	click("//*[@name='other_key_info[0].staffing.noted_accepted']", "Staffing and project management");
		 	return this;}
		 													
		 													
	  //Expand Comment > OKI > Staffing and project management
		 public LSPViewProposalPage ExpPropOkiStaffingCmt(String Comments) throws InterruptedException {
		 	click("(//*[text()='Staffing and project management']/following::div[@aria-label='Comments'])[1]","Staffing and project management");
		 	type("//*[@name='other_key_info[0].staffing.comment']", Comments , "Staffing and project management");	
		 	return this;} 
	 
	 
		 // Tick > OKI > Diversity, Equity & Inclusion (DEI)
		 public LSPViewProposalPage clickPropOkiDiversity() throws InterruptedException {
		 	click("//*[@name='other_key_info[0].diversity.noted_accepted']", "Diversity, Equity & Inclusion (DEI)");
		 	return this;}
		 													
		 													
	  //Expand Comment > OKI > Diversity, Equity & Inclusion (DEI)
		 public LSPViewProposalPage ExpPropOkiDiversityCmt(String Comments) throws InterruptedException {
		 	click("(//*[text()='Diversity, Equity & Inclusion (DEI)']/following::div[@aria-label='Comments'])[4]","Diversity, Equity & Inclusion (DEI)");
		 	type("//*[@name='other_key_info[0].diversity.comment']", Comments , "Diversity, Equity & Inclusion (DEI)");	
		 	return this;} 
	 
	 
		// Tick > OKI > Team lead must meet above DEI requirement
				 public LSPViewProposalPage clickPropOkiDEIRequirement() throws InterruptedException {
				 	click("//*[@name='other_key_info[0].diversity.minority_lead.noted_accepted']", "Team lead must meet above DEI requirement");
				 	return this;}
				 													
				 													
		 //Expand Comment > OKI > Team lead must meet above DEI requirement
		 public LSPViewProposalPage ExpPropOkiDEIRequirementCmt(String Comments) throws InterruptedException {
				click("(//*[text()='Team lead must meet above DEI requirement']/following::div[@aria-label='Comments'])[1]","Team lead must meet above DEI requirement");
				type("//*[@name='other_key_info[0].diversity.minority_lead.comment']", Comments , "Team lead must meet above DEI requirement");	
				return this;} 
	 
	 
		// Tick > OKI > Key team members: at least 10% must meet DEI requirement
		 public LSPViewProposalPage clickPropOkiKeyTeamReq() throws InterruptedException {
		 	click("//*[@name='other_key_info[0].diversity.minority_percentage.noted_accepted']", "Key team members: at least 10% must meet DEI requirement");
		 	return this;}
		 													
		 													
		 //Expand Comment > OKI > Key team members: at least 10% must meet DEI requirement
		 public LSPViewProposalPage ExpPropOkiKeyTeamReqCmt(String Comments) throws InterruptedException {
			 click("(//*[text()='Key team members: at least 10% must meet DEI requirement']/following::div[@aria-label='Comments'])[1]","Key team members: at least 10% must meet DEI requirement");
			 type("//*[@name='other_key_info[0].diversity.minority_percentage.comment']", Comments , "Key team members: at least 10% must meet DEI requirement");	
			 return this;} 

	 
	// Tick > OKI >Diversity > Other
	 public LSPViewProposalPage clickPropOkiDiversityOther() throws InterruptedException {
			click("//*[@name='other_key_info[0].diversity.other.noted_accepted']", "Diversity Others");
			return this;}
				 													
				 													
	//Expand Comment >Diversity > Other
	public LSPViewProposalPage ExpPropOkiDiversityOtherCmt(String Comments) throws InterruptedException {
			click("(//*[text()='Key team members: at least 10% must meet DEI requirement']/following::div[@aria-label='Comments'])[2]","Diversity Others");
			type("//*[@name='other_key_info[0].diversity.other.comment']", Comments , "Diversity Others");	
			return this;} 

	 
	// Tick > OKI > Credentials (by order of relevance/most recent first)
	public LSPViewProposalPage clickPropOkiCredentials() throws InterruptedException {
			click("//*[@name='other_key_info[0].credentials.noted_accepted']", "Credentials");
			return this;}
				 													
				 													
	//Expand Comment > Credentials (by order of relevance/most recent first)
	public LSPViewProposalPage ExpPropOkiCredentialsCmt(String Comments) throws InterruptedException {
		click("(//*[text()='Credentials (by order of relevance/most recent first)']/following::div[@aria-label='Comments'])[1]","Credentials");
		type("//*[@aria-label='Editor editing area: main']", Comments , "Credentials");	
		return this;} 
		
	
	// Tick > OKI > Disaggregation of services (outsourcing and/or (legal) technology related)
	public LSPViewProposalPage clickPropOkiDisaggregation() throws InterruptedException {
		click("//*[@name='other_key_info[0].disaggregation.noted_accepted']", "Disaggregation of services");
		return this;}
			 													
			 													
	//Expand Comment > Disaggregation of services (outsourcing and/or (legal) technology related)
	public LSPViewProposalPage ExpPropOkiDisaggregationCmt(String Comments) throws InterruptedException {
		click("(//*[text()='Disaggregation of services (outsourcing and/or (legal) technology related)']/following::div[@aria-label='Comments'])[7]","Disaggregation of services");
		type("//*[@name='other_key_info[0].disaggregation.comment']", Comments , "Disaggregation of services");	
		return this;}
	
	 
	// Tick > OKI > Description/name of technology and objective
		public LSPViewProposalPage clickPropOkiDescription() throws InterruptedException {
		click("//*[@name='other_key_info[0].disaggregation.technology.description.noted_accepted']", "Description/name of technology and objective");
		return this;}
			 													
			 													
	//Expand Comment > Description/name of technology and objective
	public LSPViewProposalPage ExpPropOkiDescriptionCmt(String Comments) throws InterruptedException {
		click("(//*[text()='Description/name of technology and objective']/following::div[@aria-label='Comments'])[1]","Description/name of technology and objective");
		type("//*[@name='other_key_info[0].disaggregation.technology.description.comment']", Comments , "Description/name of technology and objective");	
		return this;}
	
	
	// Tick > OKI > Disaggregation of services > Other
			public LSPViewProposalPage clickPropOkiDisaggregationOther() throws InterruptedException {
			click("//*[@name='other_key_info[0].disaggregation.technology.other.noted_accepted']", "Disaggregation Other");
			return this;}
				 													
				 													
		//Expand Comment > Disaggregation of services > Other
		public LSPViewProposalPage ExpPropOkiDisaggregationOtherCmt(String Comments) throws InterruptedException {
			click("(//*[text()='Description/name of technology and objective']/following::div[@aria-label='Comments'])[2]","Disaggregation Other");
			type("//*[@name='other_key_info[0].disaggregation.technology.other.comment']", Comments , "Disaggregation Other");	
			return this;}
	
	
		// Tick > OKI > Name of service provider(s) and scope of work
		public LSPViewProposalPage clickPropOkiNameOfService() throws InterruptedException {
			click("//*[@name='other_key_info[0].disaggregation.outsourcing.bidders_name.noted_accepted']", "Name of service provider(s) and scope of work");
			return this;}
						 													
						 													
		//Expand Comment > Name of service provider(s) and scope of work
		public LSPViewProposalPage ExpPropOkiNameOfServiceCmt(String Comments) throws InterruptedException {
			Thread.sleep(2000);
			click("(//*[text()='Name of service provider(s) and scope of work']/following::div[@aria-label='Comments'])[1]","Name of service provider(s) and scope of work");
			type("//*[@name='other_key_info[0].disaggregation.outsourcing.bidders_name.comment']", Comments , "Name of service provider(s) and scope of work");	
			return this;}
		
		
		// Tick > OKI > Name of service provider(s) and scope of work > Other
		public LSPViewProposalPage clickPropOkiNameOfServiceOther() throws InterruptedException {
			click("//*[@name='other_key_info[0].disaggregation.outsourcing.other.noted_accepted']", "Name of service Other");
			return this;}
								 													
								 													
		//Expand Comment > Name of service provider(s) and scope of work  > Other
		public LSPViewProposalPage ExpPropOkiNameOfServiceOtherCmt(String Comments) throws InterruptedException {
			Thread.sleep(2000);
			click("(//*[text()='Name of service provider(s) and scope of work']/following::div[@aria-label='Comments'])[2]","Name of service Other");
			type("//*[@name='other_key_info[0].disaggregation.outsourcing.other.comment']", Comments , "Name of service Other");	
			return this;}
		
	
	 
		// Tick > OKI > Expected efficiency/client monetary savings
		public LSPViewProposalPage clickPropOkiExpectedEfficiency() throws InterruptedException {
			click("//*[@name='other_key_info[0].disaggregation.expected_efficiency.noted_accepted']", "Expected efficiency/client monetary savings");
			return this;}
								 													
								 													
		//Expand Comment > Expected efficiency/client monetary savings
		public LSPViewProposalPage ExpPropOkiExpectedEfficiencyCmt(String Comments) throws InterruptedException {
			Thread.sleep(2000);
			click("(//*[text()='Expected efficiency/client monetary savings']/following::div[@aria-label='Comments'])[1]","Expected efficiency/client monetary savings");
			type("//*[@name='other_key_info[0].disaggregation.expected_efficiency.comment']", Comments , "Expected efficiency/client monetary savings");	
			return this;}
		
		
		// Tick > OKI > Expected efficiency/client monetary savings > Other
		public LSPViewProposalPage clickPropOkiExpectedEfficiencyOther() throws InterruptedException {
			click("//*[@name='other_key_info[0].disaggregation.other.noted_accepted']", "Expected efficiency Others");
			return this;}
										 													
										 													
		//Expand Comment > Expected efficiency/client monetary savings > Other
		public LSPViewProposalPage ExpPropOkiExpectedEfficiencyOtherCmt(String Comments) throws InterruptedException {
			Thread.sleep(2000);
			click("(//*[text()='Expected efficiency/client monetary savings']/following::div[@aria-label='Comments'])[2]","Expected efficiency Others");
			type("//*[@name='other_key_info[0].disaggregation.other.comment']", Comments , "Expected efficiency Others");	
			return this;}
		
	
	 
		// Tick > OKI >What is your USP (max 300 characters) ?
		public LSPViewProposalPage clickPropOkiUSP() throws InterruptedException {
			click("//*[@name='other_key_info[0].usp.noted_accepted']", "What is your USP");
			return this;}
										 													
										 													
		//Expand Comment > What is your USP (max 300 characters) ?
		public LSPViewProposalPage ExpPropOkiUSPCmt(String Comments) throws InterruptedException {
			Thread.sleep(2000);
			click("(//*[text()='What is your USP (max 300 characters) ?']/following::div[@aria-label='Comments'])[1]","What is your USP");
			type("(//*[text()='What is your USP (max 300 characters) ?']/following::*[@aria-label='Editor editing area: main'])[1]", Comments , "What is your USP");	
			return this;}
		
		
		// Tick > OKI > Request for additional information
		public LSPViewProposalPage clickPropOkiRequestForAddInfo() throws InterruptedException {
			click("//*[@name='other_key_info[0].additional_info.noted_accepted']", "Request for additional information");
			return this;}
												 													
												 													
		//Expand Comment > Request for additional information
		public LSPViewProposalPage ExpPropOkiRequestForAddInfoCmt(String Comments) throws InterruptedException {
			Thread.sleep(2000);
			click("(//*[text()='Request for additional information']/following::div[@aria-label='Comments'])[5]","Request for additional information");
			type("//*[@name='other_key_info[0].additional_info.comment']", Comments , "Request for additional information");
			return this;}
	 
		
		// Tick > OKI > We will entertain requests for clarification by
		public LSPViewProposalPage clickPropOkiRequestForclarification() throws InterruptedException {
			click("//*[@name='other_key_info[0].additional_info.clarification_medium.noted_accepted']", "We will entertain requests for clarification by");
			return this;}
														 													
														 													
		//Expand Comment > We will entertain requests for clarification by
		public LSPViewProposalPage ExpPropOkiRequestForclarificationCmt(String Comments) throws InterruptedException {
			Thread.sleep(2000);
			click("(//*[text()='We will entertain requests for clarification by']/following::div[@aria-label='Comments'])[1]","We will entertain requests for clarification by");
			type("//*[@name='other_key_info[0].additional_info.clarification_medium.comment']", Comments , "We will entertain requests for clarification by");
			return this;}
		
		
		// Tick > OKI > email
		public LSPViewProposalPage clickPropOkiEmail() throws InterruptedException {
			click("//*[@name='other_key_info[0].additional_info.clarification_medium.medium_selection.email_questions.noted_accepted']", "email");
			return this;}
																 													
																 													
		//Expand Comment > email
		public LSPViewProposalPage ExpPropOkiEmailCmts(String Comments) throws InterruptedException {
			Thread.sleep(2000);
			click("(//*[text()='email']/following::div[@aria-label='Comments'])[1]","email");
			type("//*[@name='other_key_info[0].additional_info.clarification_medium.medium_selection.email_questions.comment']", Comments , "email");
			return this;}	
	
		
		// Tick > OKI > video/audio conference
		public LSPViewProposalPage clickPropOkivideoAudio() throws InterruptedException {
			click("//*[@name='other_key_info[0].additional_info.clarification_medium.medium_selection.email_video.noted_accepted']", "video/audio conference");
			return this;}
																		 													
																		 													
		//Expand Comment > video/audio conference
		public LSPViewProposalPage ExpPropOkivideoAudio(String Comments) throws InterruptedException {
			Thread.sleep(2000);
			click("(//*[text()='video/audio conference']/following::div[@aria-label='Comments'])[1]","video/audio conference");
			type("//*[@name='other_key_info[0].additional_info.clarification_medium.medium_selection.email_video.comment']", Comments , "video/audio conference");
			return this;}
		
		
		// Tick > OKI > both email and video/audio conference
		public LSPViewProposalPage clickPropOkiBoth() throws InterruptedException {
			click("//*[@name='other_key_info[0].additional_info.clarification_medium.medium_selection.both.noted_accepted']", "both email and video/audio conference");
			return this;}
																				 													
																				 													
		//Expand Comment > both email and video/audio conference
		public LSPViewProposalPage ExpPropOkiBoth(String Comments) throws InterruptedException {
			Thread.sleep(2000);
			click("(//*[text()='both email and video/audio conference']/following::div[@aria-label='Comments'])[1]","video/audio conference");
			type("//*[@name='other_key_info[0].additional_info.clarification_medium.medium_selection.both.comment']", Comments , "video/audio conference");
			return this;}
		
		
	 
	 // Tick > OKI > Presentation of fee proposals
	public LSPViewProposalPage clickPropOkiPresentFeeProposal() throws InterruptedException {
			click("//*[@name='other_key_info[0].fee_proposal_presentation.noted_accepted']", "Presentation of fee proposals");
			return this;}
																	 													
																	 													
	//Expand Comment > Presentation of fee proposals
	public LSPViewProposalPage ExpPropOkiPresentFeeProposalCmt(String Comments) throws InterruptedException {
			Thread.sleep(2000);
			click("(//*[text()='Presentation of fee proposals']/following::div[@aria-label='Comments'])[2]","Presentation of fee proposals");
			type("//*[@name='other_key_info[0].fee_proposal_presentation.comment']", Comments , "Presentation of fee proposals");	
			return this;}
		
		
		
		// Tick > OKI > We will organise meeting/call with (select) bidders to present fee proposal and answer questions
		public LSPViewProposalPage clickPropOkiPresentFeeProposalCall() throws InterruptedException {
			click("//*[@name='other_key_info[0].fee_proposal_presentation.call_bidders.noted_accepted']", "We will organise meeting");
			return this;}
															 													
															 													
		//Expand Comment > We will organise meeting/call with (select) bidders to present fee proposal and answer questions
		public LSPViewProposalPage ExpPropOkiPresentFeeProposalCallCmt(String Comments) throws InterruptedException {
			Thread.sleep(2000);
			click("(//*[text()='We will organise meeting/call with (select) bidders to present fee proposal and answer questions']/following::div[@aria-label='Comments'])[1]","We will organise meeting");
			type("//*[@name='other_key_info[0].fee_proposal_presentation.call_bidders.comment']", Comments , "We will organise meeting");	
			return this;}
		
	 
		// Tick > OKI > Video
		public LSPViewProposalPage clickPropOkiVideo() throws InterruptedException {
			click("//*[@name='other_key_info[0].video.noted_accepted']", "Video");
			return this;}
															 													
															 													
		//Expand Comment > OKI > Video
		public LSPViewProposalPage ExpPropOkiVideoCmt(String Comments) throws InterruptedException {
			Thread.sleep(2000);
			click("(//*[text()='Video']/following::div[@aria-label='Comments'])[2]","Video");
			type("//*[@name='other_key_info[0].video.comment']", Comments , "Video");	
			return this;}
		
		
		// Tick > OKI > Legal service providers to provide short video in addition to information in this section “Other key information (max 2 min)”
		public LSPViewProposalPage clickPropOkiShortVideo() throws InterruptedException {
			click("//*[@name='other_key_info[0].video.provide_video.noted_accepted']", "Legal service providers to provide short video");
			return this;}
													 													
													 													
		//Expand Comment > OKI > Legal service providers to provide short video in addition to information in this section “Other key information (max 2 min)”
		public LSPViewProposalPage ExpPropOkiShortVideoCmt(String Comments) throws InterruptedException {
			Thread.sleep(2000);
			click("(//*[text()='Legal service providers to provide short video in addition to information in this section “Other key information (max 2 min)”']/following::div[@aria-label='Comments'])[1]","Legal service providers to provide short video");
			type("//*[@name='other_key_info[0].video.provide_video.comment']", Comments , "Legal service providers to provide short video");	
			return this;}
	 
		
	// Tick > OKI > Other
	public LSPViewProposalPage clickPropOkiOther() throws InterruptedException {
		click("//*[@name='other_key_info[0].other.noted_accepted']", "OKI Others");
		return this;}
												 													
												 													
	//Expand Comment > OKI > Other
	public LSPViewProposalPage ExpPropOkiOtherCmt(String Comments) throws InterruptedException {
		Thread.sleep(2000);
		click("(//*[text()='Video']/following::div[@aria-label='Comments'])[3]","OKI Others");
		type("//*[@name='other_key_info[0].other.comment']", Comments , "OKI Others");	
		return this;}
					
		
	// OKI > Additional Information > 
	public LSPViewProposalPage okiAdditionalInformation(String OKIAdditionalInformation) throws InterruptedException {
			type("//*[@name='other_key_info[0].additional_information.comment']", OKIAdditionalInformation , "OKI Additional Information");
			return this;}
	 
	
	//Button > Preview Proposal
	public LSPViewProposalPage clickPreviewProposal() throws InterruptedException {
		Thread.sleep(2000);
		click("(//button[text()='Preview Proposal'])", "Preview Proposal");
		return this;}
	
	//Menu > PreviewProposal()
	public LSPViewProposalPage menuPreviewProposal() throws InterruptedException {
		Thread.sleep(3000);
		click("(//span[text()='Preview Proposal'])", "Preview Proposal");
		Thread.sleep(3000);
		return this;}
	
	
	//Menu > Export Proposal()
	public LSPViewProposalPage menuExportProposal() throws InterruptedException {
		Thread.sleep(3000);
		click("(//label[text()='Export Proposal'])", "Export Proposal");
		Thread.sleep(3000);
		return this;}
	
	
	//Menu > Import Proposal()
		public LSPViewProposalPage menuImportProposal() throws InterruptedException {
			Thread.sleep(3000);
			uploadFile("(//label[text()='Import Proposal'])", "./Uploads/ProposalImport.xlsx", "Import Proposal");
			return this;}
		
		

		// OKI Add File
	  	public LSPViewProposalPage okiAddFile() throws InterruptedException {
			uploadFile("(//button[text()='Upload'])[3]", "./Uploads/LSP Logo.png", "Add File");
			return this;}
	
}