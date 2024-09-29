
package page.services;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import com.force.base.ProjectHooks;
import com.force.config.ConfigurationManager;
import com.microsoft.playwright.BrowserContext;
import com.microsoft.playwright.PlaywrightException;
import page.base.ZavenHooks;

public class CreateRFPPage extends ProjectHooks{
	
//----------------------------------------------------------->  DashBoard Page <-------------------------------------------------------------------//
	
	
	//Click > Button Draft New RFP 
	public CreateRFPPage clickDraftNewRFP() throws InterruptedException {
		click("(//button[text()='Draft New RFP'])", "Draft New RFP");
		return this;}
	
	
//-----------------------------------------------------------> Conflict check Page <---------------------------------------------------------------//

	//Type - Company/Entity requesting conflict check *
	public CreateRFPPage enterCompanyEntityrequestingconflictcheck(String companyname) throws InterruptedException {
		type("//*[@name='conflict_check[0].company']", companyname , "Company/Entity requesting conflict check");
		return this;}
	
	
	//Type  - Person(s) of contact (POC) > First Name
	public CreateRFPPage enterPocFirstName(String firstname) throws InterruptedException {
		type("//*[@name='conflict_check[0].contact_person.0.first_name']", firstname , "Person(s) of contact (POC)");
		return this;}
	
	
	//Type - Person(s) of contact (POC) > Last Name
	public CreateRFPPage enterPocLastName(String lastname) throws InterruptedException {
		type("//*[@name='conflict_check[0].contact_person.0.surname']", lastname, "Person(s) of contact (POC)");
		return this;}
	
	
	// + Add New Person
	public CreateRFPPage enterAddNewPerson() throws InterruptedException {
		click("(//*[text()='+ Add New Person'])", "Add New Person");
		return this;}
	
	
	//Add More 1 > First Name 1 > Person(s) of contact (POC) > 
		public CreateRFPPage enterAddNewFirstName1(String AddNewfirstname1) throws InterruptedException {
			type("//*[@name='conflict_check[0].contact_person.1.first_name']", AddNewfirstname1 , "Person(s) of contact (POC)");
			return this;}
		
		
	//Add More 1 > Last Name 1 - Person(s) of contact (POC) > 
		public CreateRFPPage enterAddNewLastName1(String AddNewlastname1) throws InterruptedException {
			type("//*[@name='conflict_check[0].contact_person.1.surname']", AddNewlastname1, "Person(s) of contact (POC)");
			return this;}
	

	//Type - Person(s) of contact (POC) Email *
	public CreateRFPPage enterPocEmail(String cuemail) throws InterruptedException {
		type("//*[@name='conflict_check[0].contact_person_email.0.email']", cuemail, "Person(s) of contact (POC) Email");
		return this;}
	
	
	//+ Add More Email
		public CreateRFPPage clickAddMore() throws InterruptedException {
			click("(//*[text()='+ Add More'])", "Add More Email");
			return this;}
		
	
	// Add More > Email 1 - Person(s) of contact (POC) Email *
		public CreateRFPPage enterAddMoreEmail1(String AddMoreEmail1) throws InterruptedException {
			type("//*[@name='conflict_check[0].contact_person_email.1.email']", AddMoreEmail1, "Person(s) of contact (POC)");
			return this;}
		
	
	//Type and Enter - Counter/other party(ies) Name *
	public CreateRFPPage enterCounterOtherPartyName(String counterPartyName) throws InterruptedException {
		type("(//*[@name='conflict_check[0].counter_name.0.name'])", counterPartyName, "Counter/other party(ies) Name");
		return this;}
	
	
	//+ Add New Party
		public CreateRFPPage clickAddNewParty() throws InterruptedException {
			click("(//*[text()='+ Add New Party'])", "Add New Party");
			return this;}
			
			
	// Add New Party 1 > Counter/other party(ies) Name *
		public CreateRFPPage enterCounterPartyName1(String counterPartyName1) throws InterruptedException {
			type("(//*[@name='conflict_check[0].counter_name.1.name'])", counterPartyName1, "Counter/other party(ies) Name");
			return this;}		
			
		
	//------------>Upload - Brief description of matter (full or no name basis)
	public CreateRFPPage Breifdescupload() throws InterruptedException {
		uploadFile("(//label[text()='Brief description of matter (full or no name basis)']//following::button)[1]/input", "./Uploads/LSP Logo.png", "Sam");
		return this;}

	
	//------------>Type - Brief description of matter (full or no name basis).
			public CreateRFPPage enterBreifDesc(String CCRDescription) throws InterruptedException {
				type("//*[@name='conflict_check[0].description_file[0].description']", CCRDescription, "Brief description of matter");
				return this;}
	
			
	//Check box - Agreeable to Chinese Walls.
			public CreateRFPPage checkAgreeableToChineseWalls() throws InterruptedException {
				check("//*[@name='conflict_check[0].agree_chinese_walls']", "We are agreeable to work with Chinese Walls.");
				return this;}
		
		
	//Calendar - We request that you clear conflicts by
		    public CreateRFPPage clearConflictsBy() throws InterruptedException {
				Thread.sleep(2000);
				click("(//input[@name='conflict_check[0].clear_conflict_dt'])", "Calender");
				click("//button[contains(@class,'MuiPickersDay-dayWithMargin MuiPickersDay-today')]","date");
				return this;}	
			
	//Check box - Note to legal services providers:
		public CreateRFPPage checkNoteToLSPs() throws InterruptedException {
			check("//*[@name='conflict_check[0].bidders_note']", "Note to legal services providers.");
			return this;}
		
		
	// Radio button > Legal services providers invited to bid will have access to RFP only after conflict check clearance confirmation.
		public CreateRFPPage clickAfterCCRClearece() throws InterruptedException {
				click("(//span[contains(text(),'RFP only after conflict check clearance confirmation.')])", "After CCR Clearence selection");
				return this;}
		
		
	// Radio button > Fast track: Legal services providers invited to bid to have access to RFP in parallel to conflict check clearance.
			public CreateRFPPage clickParellelCCRClearece() throws InterruptedException {
					click("(//span[contains(text(),'RFP in parallel to conflict check clearance.')])", "Parellel CCR Clearence selection");
					return this;}	
		
	
	//Switch CCR On/OFF		
		public CreateRFPPage CheckCCROFF() throws InterruptedException {
				click("(//div[text()='Conflict Check Info']//following::input)", "CCR OFF");
				return this;}
		
		
	//Click > Button Continue
		public CreateRFPPage clickContinue() throws InterruptedException {
			click("(//button[text()='Continue'])", "Continue");
			return this;}	
	
			
//-------------------------------------------------------------> Preliminary Information <-----------------------------------------------------//
	
	//Type and Enter - Project name/short description
	public CreateRFPPage enterProjectName(String projectname) throws InterruptedException {
		type("//*[@name='preliminary_info[0].project_name']", projectname, "Project name/short description");
		return this;}
	
	
	//Type and Enter - Description of project
	public CreateRFPPage enterShortDesc(String projectdesc) throws InterruptedException {
		type("//*[@name='preliminary_info[0].description']", projectdesc , "Description of project");
		return this;}
	
	
	// Slide > Complexity of project.
	
	
	
	
	//Type and Enter - Complexity of project - Comment box.
		public CreateRFPPage enterComplexityComments(String complexitycomments) throws InterruptedException {
			type("//*[@name='preliminary_info[0].complexity.comment']", complexitycomments , "Complexity of project");
			return this;}
	

	//Type and Enter - Objective in relation to project
		public CreateRFPPage enterObjectiverelation(String objectiverelation) throws InterruptedException {
			type("//*[@name='preliminary_info[0].objective']", objectiverelation , "Objective in relation to project");
			return this;}	
		
		
	//------------>Upload - Objective in relation to project
		public CreateRFPPage PiFileUpload() throws InterruptedException {
			uploadFile("(//label[text()='Objective in relation to project']//following::button)[1]/input", "./Uploads/LSP Logo.png", "Sam");
			return this;}
		
	
	//Type and Enter - Jurisdiction/Language 
		public CreateRFPPage juridictionLanguage() throws InterruptedException {
			type("(//input[@id='selectedOption'])[1]","Anguilla","Select Jurisdiction/Language");
			arrowDown();
			enter();
			return this;}
		
		
	//Select Country - Governing law of main legal documentation (if known/agreed)
		public CreateRFPPage selectCountry() throws InterruptedException {
			Thread.sleep(2000);
			type("(//input[@id='selectedOption'])[2]","Albania","Governing law of main legal documentation");
			arrowDown();
			enter();
			return this;}
		
		
	//Comment box - Governing law of main legal documentation (if known/agreed)
		public CreateRFPPage enterGoverningLaw(String governinglaw) throws InterruptedException {
			Thread.sleep(2000);
			type("//*[@name='preliminary_info[0].governing_law.comment']", governinglaw , "Governing law");
			return this;}
		
		
		
	//Select Language - > Language of legal documentation	
		public CreateRFPPage selectLanguage() throws InterruptedException {
			Thread.sleep(2000);
			type("(//input[@id='selectedOption'])[3]","Hindi","Language of legal documentation");
			arrowDown();
			enter();
			return this;}
		
		
	//Comment box - Language of legal documentation	
		public CreateRFPPage enterLegalDocumentation(String legalDocumentation) throws InterruptedException {
			type("//*[@name='preliminary_info[0].document_language_comment']", legalDocumentation , "Language of legal documentation");
			return this;}
		
		
	//Preferred language of correspondence between legal services provider and us
		public CreateRFPPage prefferedLanguage() throws InterruptedException {
			Thread.sleep(2000);
			type("(//input[@id='selectedOption'])[4]","Hindi","Preferred language of correspondence between legal services provider and us");
			arrowDown();
			enter();
			return this;}
		
		
	//Comment box - Preferred language of correspondence between legal services provider and us
		public CreateRFPPage enterLanguageOfCorrespondence(String langaugeOfCorrespondence) throws InterruptedException {
			type("//*[@name='preliminary_info[0].correspondence_language_comment']", langaugeOfCorrespondence , "Preferred language of correspondence");	
			return this;}
		
	
		
	//Select from drop down - We request that you confirm your intention to participate or not in this RFP by *
    public CreateRFPPage participationBy() throws InterruptedException {
		click("(//input[@name='preliminary_info[0].participate_dt'])","Calender");
		click("//button[contains(@class,'MuiPickersDay-dayWithMargin MuiPickersDay-today')]","date");
		return this;}
    

	//Select from drop down - and as the case might be submit a proposal by *
    public CreateRFPPage proposalBy() throws InterruptedException {
		Thread.sleep(2000);
		click("(//input[@name='preliminary_info[0].submit_dt'])","proposeddate");
		click("//button[contains(@class,'MuiPickersDay-dayWithMargin MuiPickersDay-today')]","date");
		return this;}
	
	//Select from drop down - Time zone *
    public CreateRFPPage timeZone() throws InterruptedException {
		Thread.sleep(2000);
		type("(//label[text()='Time zone *']/following::input[@id='selectedOption'])","Asia/Dubai","Select time zone");
		pageDown();
	    enter();
		return this;}
    
    
    //Check ECW
    public CreateRFPPage checkECW() throws InterruptedException {
		check("//*[@name='preliminary_info[0].ecw.identify_bidders']", "ECW Check");
		return this;}
	
    

	//Check box - RFP Terms & Conditions
	public CreateRFPPage checkRFPTermsandConditions() throws InterruptedException {
		check("//*[@name='preliminary_info[0].terms_conditions.pre_agreed']", "Terms & Conditions already pre-agreed between you and invited legal services providers");
		return this;}
	
	
	//Check box - If not pre-agreed for one or more of the invited legal services providers
	public CreateRFPPage checkPreAgreed() throws InterruptedException {
		check("//*[@name='preliminary_info[0].terms_conditions.not_pre_agreed.value']", "PreAgreed");
		return this;}
	
	//Radio Button > Terms & Conditions to be agreed with winning bidder outside of Zaven platform
	public CreateRFPPage clickTermsServices() throws InterruptedException {
		click("(//span[contains(text(),'Terms & Conditions to be agreed with winning bidder outside of Zaven platform')])", "Terms & Conditions to be agreed with winning bidder outside of Zaven platform");
		return this;}
	
	
	//Radio Button > Our terms & conditions to apply (including billing policy)
	public CreateRFPPage clickTermsCondition() throws InterruptedException {
		click("(//span[contains(text(),'Our terms & conditions to apply (including billing policy)')])", "Our terms & conditions to apply (including billing policy)");
		return this;}
	
	//------------>Upload - Objective in relation to project
	public CreateRFPPage PiFileUploadTofS() throws InterruptedException {
		uploadFile("(//span[text()='Our terms & conditions to apply (including billing policy)']//following::button)[1]/input", "./Uploads/LSP Logo.png", "Sam");
		return this;}
			
	
	
	//Radio Button > Invited legal services providers terms & conditions to apply (to be uploaded with their fee proposal)
	public CreateRFPPage clickInvitedLSP() throws InterruptedException {
		click("(//span[contains(text(),'Invited legal services providers terms & conditions to apply (to be uploaded with their fee proposal)')])", "Invited legal services");
		return this;}
	
	
	//Radio Button > Zaven middle of the road Terms & Conditions to apply
	public CreateRFPPage clickZavenTerms() throws InterruptedException {
		click("(//span[contains(text(),'Zaven middle of the road')])", "Zaven middle of the road");
		return this;}
	

//-----------------------------------------------------------------> Pricing <-------------------------------------------------------------------//
	
	
	//Enter ECW 
	public CreateRFPPage ECWPricing(String percentageValue) throws InterruptedException {
		type("(//input[@name='pricing[0].ecw'])", percentageValue ,"ECW Pricing Value");
		return this;}
	
	//Enter ECW 
	public CreateRFPPage ECWAssumption(String percentageValue) throws InterruptedException {
		type("(//input[@name='pricing[0].assumptions_exclusions.ecw'])", percentageValue ,"ECW Assumption Value");
		return this;}
	
		
	
  	//Drop down > Currency
	public CreateRFPPage selectCurrency() throws InterruptedException {
		type("(//input[@id='selectedOption'])","ALL","selectCurrency");
		arrowDown();
	    enter();
		return this;}
	
	
	//check Box > Estimate
	public CreateRFPPage checkEstimate() throws InterruptedException {
		check("//*[@name='pricing[0].model.estimate.value']", "Estimate");
		return this;}
	
	
	//Comment box - Estimate
  	public CreateRFPPage EstimateCmts(String EstimateComments) throws InterruptedException {
  		type("//*[@name='pricing[0].model.estimate.comment']", EstimateComments , "Estimate Comments");	
  		return this;}
	
	
	//check Box > Fixed Fee
	public CreateRFPPage checkFixedFee() throws InterruptedException {
		check("//*[@name='pricing[0].model.fixed_fee.value']", "Fixed Fee");
		return this;}
	
	
	//Comment box - Fixed Fee
  	public CreateRFPPage FixedFeeCmts(String FixedFeeComments) throws InterruptedException {
  		type("//*[@name='pricing[0].model.fixed_fee.comment']", FixedFeeComments , "Fixed Fee Comments");	
  		return this;}
	
	
	//check Box > Capped fee
	public CreateRFPPage checkCappedFee() throws InterruptedException {
		check("//*[@name='pricing[0].model.capped_fee.value']", "Capped fee");
		return this;}
	
	
	//Comment box - Capped fee
  	public CreateRFPPage CappedfeeCmts(String CappedfeeComments) throws InterruptedException {
  		type("//*[@name='pricing[0].model.capped_fee.comment']", CappedfeeComments , "Capped fee Comments");	
  		return this;}
	
	
	//check Box > Hourly rate fee
	public CreateRFPPage checkHourlyRateFee() throws InterruptedException {
		check("//*[@name='pricing[0].model.hourly_rate_fee.value']", "Hourly rate fee");
		return this;}
	
	
	//Comment box - Hourly rate fee
  	public CreateRFPPage HourlyRateFee(String HourlyRateFeeComments) throws InterruptedException {
  		type("//*[@name='pricing[0].model.hourly_rate_fee.comment']", HourlyRateFeeComments , "Hourly rate fee Comments");	
  		return this;}
	
	
	//check Box > Blended rates
	public CreateRFPPage checkBlendedRates() throws InterruptedException {
		check("//*[@name='pricing[0].model.blended_fee.value']", "Blended rates");
		return this;}
	
	
	//Comment box - Blended rates
	public CreateRFPPage BlendedRates(String BlendedratesComments) throws InterruptedException {
  		type("//*[@name='pricing[0].model.blended_fee.comment']", BlendedratesComments , "Blended rates Comments");	
  		return this;}
	
		
	//check Box > Contingent fee
	public CreateRFPPage checkContingentfee() throws InterruptedException {
		check("//*[@name='pricing[0].model.contingent_fee.value']", "Contingent fee");
		return this;}
	
	
	//Comment box - Contingent fee
	public CreateRFPPage Contingentfee(String ContingentfeeComments) throws InterruptedException {
  		type("//*[@name='pricing[0].model.contingent_fee.comment']", ContingentfeeComments , "Contingent fee Comments");	
  		return this;}
	
	
	//check Box > Abort discount
	public CreateRFPPage checkAbortdiscount() throws InterruptedException {
		check("//*[@name='pricing[0].model.abort_discount.value']", "Abort discount");
		return this;}
	
	
	//Comment box - Abort discount
		public CreateRFPPage Abortdiscount(String AbortdiscountComments) throws InterruptedException {
	  		type("//*[@name='pricing[0].model.abort_discount.comment']", AbortdiscountComments , "Abort discount Comments");	
	  		return this;}
		
	
	//check Box > Success fee
	public CreateRFPPage checkSuccessfee() throws InterruptedException {
		check("//*[@name='pricing[0].model.success_fee.value']", "Success fee");
		return this;}
	
	
	//Comment box - Success fee
	public CreateRFPPage Successfee(String SuccessfeeComments) throws InterruptedException {
  		type("//*[@name='pricing[0].model.success_fee.comment']", SuccessfeeComments , "Success fee Comments");	
  		return this;}
	
	
	//check Box > Reverse Auction (To be conducted by Corporate outside of Zaven)
	public CreateRFPPage checkReverseAuction() throws InterruptedException {
		check("//*[@name='pricing[0].model.reverse_auction.value']", "Reverse Auction");
		return this;}
	
	
	//Comment box - Reverse Auction (To be conducted by Corporate outside of Zaven)
	public CreateRFPPage ReverseAuction(String ReverseAuctionComments) throws InterruptedException {
  		type("//*[@name='pricing[0].model.reverse_auction.comment']", ReverseAuctionComments , "Reverse Auction Comments");	
  		return this;}
	
	
	//check Box > Free initial advice up to a certain amount
	public CreateRFPPage checkFreeInitial() throws InterruptedException {
		check("//*[@name='pricing[0].model.free_advise.value']", "Free initial advice up to a certain amount");
		return this;}
	
	
	//Comment box - Free initial advice up to a certain amount
	public CreateRFPPage FreeInitial(String FreeInitialComments) throws InterruptedException {
  		type("//*[@name='pricing[0].model.free_advise.comment']", FreeInitialComments , "Free initial advice up to a certain amount Comments");	
  		return this;}
	
	
	//check Box > Retainer (general/project based)
	public CreateRFPPage checkRetainer() throws InterruptedException {
		check("//*[@name='pricing[0].model.retainer.value']", "Retainer");
		return this;}
	 
	
	//Comment box - Retainer (general/project based)
		public CreateRFPPage Retainer(String RetainerComments) throws InterruptedException {
	  		type("//*[@name='pricing[0].model.retainer.comment']", RetainerComments , "Retainer (general/project based) Comments");	
	  		return this;}
	
	
	//check Box > Budget for project
	public CreateRFPPage checkBudgetForProject() throws InterruptedException {
		check("//*[@name='pricing[0].model.budget.value']", "Budget for project");
		return this;}
	
	
	//Input Box - Budget for project
	public CreateRFPPage BudgetValue(String BudgetValue) throws InterruptedException {
  		type("//*[@name='pricing[0].model.budget.amount']", BudgetValue , "Budget for project value");	
  		return this;}

	
	//Comment box - Budget for project
			public CreateRFPPage BudgetComments(String BudgetForProjectComments) throws InterruptedException {
		  		type("//*[@name='pricing[0].model.budget.comment']", BudgetForProjectComments , "Budget for project");	
		  		return this;}
	
	
	//check Box > Other
	public CreateRFPPage checkModelOther() throws InterruptedException {
		check("//*[@name='pricing[0].model.other.value']", "Model Other");
		return this;}
	
	
	//Comment box -  Other
	public CreateRFPPage ModelOtherComment(String ModelOtherComments) throws InterruptedException {
  		type("//*[@name='pricing[0].model.other.comment']", ModelOtherComments , "Model Other Comments");	
  		return this;}
	
	
	//Expenses
	//check Box > If expenses not covered in T&Cs agreed/to be agreed between Corporate and winning bidder, consider the following
	public CreateRFPPage checkIfExpensesNotCovered() throws InterruptedException {
		check("//*[@name='pricing[0].model.expenses.expenses_not_covered_in_tc.value']", "If expenses not covered in T&Cs agreed/to be agreed between Corporate and winning bidder, consider the following");
		return this;}
	
	
	//check Box > Percentage of total fee
	public CreateRFPPage checkPercentage() throws InterruptedException {
		check("//*[@name='pricing[0].model.expenses.expenses_not_covered_in_tc.percentage_of_total_fee']", "Percentage of total fee");
		return this;}
	
	
	//check Box > Included in services fee
	public CreateRFPPage checkServicesFee() throws InterruptedException {
		check("//*[@name='pricing[0].model.expenses.expenses_not_covered_in_tc.included_in_services_fee']", "Included in services fee");
		return this;}
	
	
	//check Box > Admin only (printing, etc)
	public CreateRFPPage checkAdminOnly() throws InterruptedException {
		check("//*[@name='pricing[0].model.expenses.expenses_not_covered_in_tc.admin_only']", "Admin only");
		return this;}
	
	
	//check Box > Expenses Other
	public CreateRFPPage checkExpensesOther() throws InterruptedException {
		check("//*[@name='pricing[0].model.expenses.expenses_not_covered_in_tc.other.value']", "Expenses Other");
		return this;}
	
	
	//Comment Box > Expenses Other
	public CreateRFPPage enterExpensesOther(String ExpensesOtherComments) throws InterruptedException {
  		type("//*[@name='pricing[0].model.expenses.expenses_not_covered_in_tc.other.comment']", ExpensesOtherComments , "Expenses Other Comments");	
  		return this;}
	
	
	//Travel / Hotel categories:
	//Check box > same as client
	public CreateRFPPage checkSameAsClient() throws InterruptedException {
		check("//*[@name='pricing[0].model.expenses.travel_hotel_categories.same_as_client']", "Same as client");
		return this;}
	
	
	// Travel class
	// Radio Button > economy
		public CreateRFPPage clickeconomy() throws InterruptedException {
			click("(//span[contains(text(),'economy')])", "economy");
			return this;}
	
	
	// Radio Button > business
		public CreateRFPPage clickbusiness() throws InterruptedException {
			click("(//span[contains(text(),'business')])", "business");
			return this;}
	
			
	// Hotel 
	// Radio Button > 3 stars
		public CreateRFPPage click3stars() throws InterruptedException {
			click("(//span[contains(text(),'3 stars')])", "3 stars");
			return this;}
			
			
	// Radio Button > 4 stars
		public CreateRFPPage click4stars() throws InterruptedException {
			click("(//span[contains(text(),'4 stars')])", "4 stars");
			return this;}
			
			
	// Radio Button > 5 stars
		public CreateRFPPage click5stars() throws InterruptedException {
			click("(//span[contains(text(),'5 stars')])", "5 stars");
			return this;}
	
		
	// Taxes
	// Check Box > Bidders to indicate any applicable tax to fees and %	
		public CreateRFPPage checkApplicableTax() throws InterruptedException {
			check("//*[@name='pricing[0].model.taxes.value']", "Bidders to indicate any applicable tax to fees and %");
			Thread.sleep(3000);
			return this;}
		
		
	// Comment Box > Bidders to indicate any applicable tax to fees and %
		public CreateRFPPage applicableTax(String ApplicableTaxComments) throws InterruptedException {
	  		Thread.sleep(3000);
	  		type("//*[@name='pricing[0].model.taxes.comment']", ApplicableTaxComments , "ApplicableTax Comments");	
	  		return this;}	
		
		
	// Assumptions & Exclusions
	// Radio Button > Bidders shall not add any additional assumption & exclusion in their fee proposal
		public CreateRFPPage clickNoAdditionalAssumptions() throws InterruptedException {
			Thread.sleep(3000);
			click("(//span[contains(text(),'Bidders shall not add any additional assumption')])", "NoAdditionalAssumptions");
			//click("(//*[@value='values.pricing[0].assumptions_exclusions.not_add_assumption'])", "NoAdditionalAssumptions");
			Thread.sleep(3000);
			return this;}
		
		
	// Radio Button > Bidders can add additional assumptions & exclusions in their fee proposal
		public CreateRFPPage clickAddAdditionalAssumptions() throws InterruptedException {
			click("(//span[contains(text(),'Bidders can add additional assumptions')])", "AddAdditionalAssumptions");
			Thread.sleep(3000);
			return this;}
		
	// Check Box > Expected completion of project from date of instruction (in weeks)	
		public CreateRFPPage checkDateOfInstruction() throws InterruptedException {
			check("//*[@name='pricing[0].assumptions_exclusions.completion_duration.value']", "Date Of Instruction");
			Thread.sleep(3000);
			return this;}
		
		
	//Drop down > Select Duration > Expected completion of project from date of instruction (in weeks)
		public CreateRFPPage selectduration() throws InterruptedException {
			click("(//*[@id='mui-component-select-pricing[0].assumptions_exclusions.completion_duration.completion_duration_weeks'])", "Select Duration");
			enter();		
			return this;}		
					
		
	// Comment Box > Expected completion of project from date of instruction (in weeks)
		public CreateRFPPage dateOfInstruction(String DateOfInstructionComments) throws InterruptedException {
			  Thread.sleep(3000);
			  type("//*[@name='pricing[0].assumptions_exclusions.completion_duration.comment']", DateOfInstructionComments , "DateOfInstruction Comments");	
			  return this;}	
		
		
	// Check Box > Work product format
		public CreateRFPPage checkWorkProductFormat() throws InterruptedException {
			check("//*[@name='pricing[0].assumptions_exclusions.work_product_format.value']", "Work product format");
			Thread.sleep(3000);
			return this;}
		
		
		// Check Box > email	
		public CreateRFPPage checkemail() throws InterruptedException {
			check("//*[@name='pricing[0].assumptions_exclusions.work_product_format.email']", "email");
			Thread.sleep(3000);
			return this;}
		
		
		// Check Box > memo
		public CreateRFPPage checkmemo() throws InterruptedException {
			check("//*[@name='pricing[0].assumptions_exclusions.work_product_format.memo']", "memo");
			Thread.sleep(3000);
			return this;}
		
		
		// Check Box > power point slides
		public CreateRFPPage checkpowerpointslides() throws InterruptedException {
			check("//*[@name='pricing[0].assumptions_exclusions.work_product_format.slides']", "power point slides");
			Thread.sleep(3000);
			return this;}
		
		
		// Check Box > legal opinion
		public CreateRFPPage checklegalopinion() throws InterruptedException {
			check("//*[@name='pricing[0].assumptions_exclusions.work_product_format.legal_opinion']", "legal opinion");
			Thread.sleep(3000);
			return this;}
		
		
		// Check Box > legal documents drafting
		public CreateRFPPage checklegaldocumentsdrafting() throws InterruptedException {
			check("//*[@name='pricing[0].assumptions_exclusions.work_product_format.document_drafting']", "legal documents drafting");
			Thread.sleep(3000);
			return this;}
		
		
		// Comment Box > Work product format
		public CreateRFPPage workproductComments(String ApplicableTaxComments) throws InterruptedException {
			  Thread.sleep(3000);
			  type("//*[@name='pricing[0].assumptions_exclusions.work_product_format.comment']", ApplicableTaxComments , "Work product format Comments");	
			  return this;}
		
		
	// Check Box >	Following Jurisdiction/Language explicitly excluded from scope of work
		public CreateRFPPage checkJurisdiction() throws InterruptedException {
				check("//*[@name='pricing[0].assumptions_exclusions.legal_jurisdictions.value']", "Following Jurisdiction/Language");
				Thread.sleep(3000);
				return this;}
	
		
	//Drop down > Following Jurisdiction/Language explicitly excluded from scope of work
		public CreateRFPPage multiselcectJurisdictionCountry() throws InterruptedException {
			click("(//*[contains(text(),\"Following Jurisdiction/Language explicitly excluded from scope of work\")]/following::input)[1]", "Countrydropdown");
			arrowDown();
			enter();
			return this;}
		
		
	//Comments  > Following Jurisdiction/Language explicitly excluded from scope of work
		public CreateRFPPage jurisdictionLanguageComments(String JurisdictionLanguageComments) throws InterruptedException {
			  Thread.sleep(3000);
			  type("//*[@name='pricing[0].assumptions_exclusions.legal_jurisdictions.comment']", JurisdictionLanguageComments , "Jurisdiction Language Comments");	
			  return this;}
		
		
		
		
		
		
	// Radio Button > Legal service provider to select, engage and coordinate work of any local legal counsel(s)	
		public CreateRFPPage clickLocalLegal() throws InterruptedException {
			click("(//span[contains(text(),'Legal service provider to select, engage')])", "Legal service provider to select, engage");
			Thread.sleep(3000);
			return this;}
		
		
		//Comments  > Legal service provider to select, engage and coordinate work of any local legal counsel(s)
				public CreateRFPPage localLegalComments(String LocalLegalComments) throws InterruptedException {
					  Thread.sleep(3000);
					  type("(//*[@name='pricing[0].assumptions_exclusions.bidders_select_counsel.comment'])", LocalLegalComments , "Local Legal Comments");	
					  return this;}
		
		
	// Radio Button > We will select, engage and coordinate work of any local legal counsel(s)
		public CreateRFPPage SelectLocalLegal() throws InterruptedException {
			click("(//span[contains(text(),'coordinate work of any local legal counsel(s)')])", "We will select, engage");
			Thread.sleep(3000);
			return this;}
		
		
		//Comments  > We will select, engage and coordinate work of any local legal counsel(s)
		public CreateRFPPage enterSelectLocalComments(String SelectLocalComments) throws InterruptedException {
			  Thread.sleep(3000);
			  type("//*[@name='pricing[0].assumptions_exclusions.bidders_select_counsel.comment']", SelectLocalComments , "Select Local Comments");	
			  return this;}
		
		
	// Check Box >	Tax advice is excluded	
		public CreateRFPPage checkTaxAdviceExcluded() throws InterruptedException {
			check("//*[@name='pricing[0].assumptions_exclusions.tax_advise_exclude.value']", "Tax advice is excluded");
				Thread.sleep(3000);
				return this;}
		
		//Comments  > Tax advice is excluded
				public CreateRFPPage TaxAdviceExcludedComments(String TaxAdviceExcludedComments) throws InterruptedException {
					  Thread.sleep(3000);
					  type("//*[@name='pricing[0].assumptions_exclusions.tax_advise_exclude.comment']", TaxAdviceExcludedComments , "TaxAdviceExcluded Comments");	
					  return this;}
		
		
		
	// Check Box >	No travel expected
		public CreateRFPPage checkNoTravel() throws InterruptedException {
			check("//*[@name='pricing[0].assumptions_exclusions.no_travel_expected.value']", "No travel expected");
				Thread.sleep(3000);
				return this;}
		
		
		//Comments  > No travel expected
		public CreateRFPPage NoTravelComments(String NoTravelComments) throws InterruptedException {
			  Thread.sleep(3000);
			  type("//*[@name='pricing[0].assumptions_exclusions.no_travel_expected.comment']", NoTravelComments , "NoTravel Comments");	
			  return this;}
		
		
		
	// Check Box >	Other
		public CreateRFPPage checkOtherPricing() throws InterruptedException {
			check("//*[@name='pricing[0].assumptions_exclusions.other.value']", "Global Other Pricing");
				Thread.sleep(3000);
				return this;}	
		
		
		
		//Comments  > Global Other
		public CreateRFPPage OtherPricingComments(String OtherPricingComments) throws InterruptedException {
			  Thread.sleep(3000);
			  type("//*[@name='pricing[0].assumptions_exclusions.other.comment']", OtherPricingComments , "Other Pricing Comments");	
			  return this;}
		
		
		
//----------------------------->  Other Key Informations
		
		
		
		//Enter ECW > Key team members
		public CreateRFPPage ECWKeyTeam(String percentageValue) throws InterruptedException {
			type("(//input[@name='other_key_info[0].key_team_members.ecw'])", percentageValue ,"ECW Key team members");
			Thread.sleep(3000);
			return this;}
		
		//Enter ECW > Staffing and project management
		public CreateRFPPage ECWStaffing(String percentageValue) throws InterruptedException {
			Thread.sleep(2000);
			type("(//input[@name='other_key_info[0].staffing.ecw'])", percentageValue ,"ECW Staffing and project management");
			return this;}
		
		
		//Enter ECW > Diversity, Equity & Inclusion (DEI)
		public CreateRFPPage ECWDiversity(String percentageValue) throws InterruptedException {
			type("(//input[@name='other_key_info[0].diversity.ecw'])", percentageValue ,"ECW Diversity");
			Thread.sleep(3000);
			return this;}
				
		//Enter ECW > Credentials (by order of relevance/most recent first)
		public CreateRFPPage ECWCredentials(String percentageValue) throws InterruptedException {
			Thread.sleep(2000);
			type("(//input[@name='other_key_info[0].credentials.ecw'])", percentageValue ,"ECW Credentials");
			Thread.sleep(3000);
			return this;}
		
		
		
		//Enter ECW > Disaggregation of services (outsourcing and/or (legal) technology related)
				public CreateRFPPage ECWDisaggregation(String percentageValue) throws InterruptedException {
					Thread.sleep(2000);
					type("(//input[@name='other_key_info[0].disaggregation.ecw'])", percentageValue ,"ECW Disaggregation");
					return this;}
				
				
				//Enter ECW > What is your USP (max 300 characters) ?
				public CreateRFPPage ECWUSP(String percentageValue) throws InterruptedException {
					type("(//input[@name='other_key_info[0].usp.ecw'])", percentageValue ,"ECW USP");
					Thread.sleep(3000);
					return this;}
						
				//Enter ECW > Others
				public CreateRFPPage ECWOthers(String percentageValue) throws InterruptedException {
					Thread.sleep(2000);
					type("(//input[@name='other_key_info[0].other.ecw'])", percentageValue ,"ECW Others");
					Thread.sleep(3000);
					return this;}
		
		
		
		
	
		//Check > Key team members (title, role, years of experience, project role)
		public CreateRFPPage checkKeyTeamMember() throws InterruptedException {
		check("//*[@name='other_key_info[0].key_team_members.value']", "Key Team Member");
		Thread.sleep(3000);
		return this;}
	
	//Drop down > Location of Lead partner * > Country
	public CreateRFPPage checkKeyTeamMembersCountry() throws InterruptedException {
		Thread.sleep(2000);
		type("(//div[text()='Location of Lead partner *']/following::label[text()='Country'])","India","country");
		arrowDown();
		arrowDown();
	    enter();
		return this;}
	
	//Comments  > Location of Lead partner *
	public CreateRFPPage leadPartnerComments(String leadPartnerComments) throws InterruptedException {
			Thread.sleep(3000);
			type("//*[@name='other_key_info[0].key_team_members.comment']", leadPartnerComments , "Location of Lead partner Comments");	
			return this;}
	
	
	
	//Check > Biographies
	public CreateRFPPage checkBiographies() throws InterruptedException {
		check("//*[@name='other_key_info[0].biographies.value']", "biographies");
		Thread.sleep(3000);
		return this;}
	
	
	
	//Check > Biographies > With picture
		public CreateRFPPage checkBiographiesWPic() throws InterruptedException {
			check("//*[@name='other_key_info[0].biographies.with_picture']", "Biographies with Picture");
			Thread.sleep(3000);
			return this;}
	
	
	//Check > Biographies > Not more than 1 page
		public CreateRFPPage checkBiographiesWOPic() throws InterruptedException {
			check("//*[@name='other_key_info[0].biographies.max_one_page']", "Biographies without Picture");
			Thread.sleep(3000);
			return this;}
		
		
	//Comment > Biographies 
	public CreateRFPPage BiographiesComments(String BiographiesComments) throws InterruptedException {
		Thread.sleep(3000);
		type("//*[@name='other_key_info[0].biographies.comment']", BiographiesComments , "Biographies Comments");	
		return this;}
	
	
	
	//Check > Staffing and project management
	public CreateRFPPage checkStaffing() throws InterruptedException {
		check("//*[@name='other_key_info[0].staffing.value']", "Staffing and project management");
		Thread.sleep(3000);
		return this;}
	
	

	//Comment > Staffing and project management
	public CreateRFPPage StaffingComments(String StaffingComments) throws InterruptedException {
		Thread.sleep(3000);
		type("//*[@name='other_key_info[0].staffing.instruction']", StaffingComments , "Staffing Comments");	
		return this;}
	
	
	
	//Check > Diversity, Equity & Inclusion (DEI)
	public CreateRFPPage checkDiversity() throws InterruptedException {
		check("//*[@name='other_key_info[0].diversity.value']", "Diversity, Equity & Inclusion (DEI)");
		Thread.sleep(3000);
		return this;}
	
	

	//Comment > Diversity, Equity & Inclusion (DEI)
	public CreateRFPPage DiversityComments(String DiversityComments) throws InterruptedException {
		Thread.sleep(3000);
		type("//*[@name='other_key_info[0].diversity.comment']", DiversityComments , "Diversity Comments");	
		return this;}
	
	
	//Check > Team lead must meet above DEI requirement
	public CreateRFPPage checkDEIRequirement() throws InterruptedException {
		check("//*[@name='other_key_info[0].diversity.minority_lead']", "Team lead must meet above DEI");
		Thread.sleep(3000);
		return this;}
	
	
	//Check > Key team members: at least
	public CreateRFPPage checkAtleast() throws InterruptedException {
		check("//*[@name='other_key_info[0].diversity.minority_percentage.value']", "Key team members: at least");
		Thread.sleep(3000);
		return this;}

	
	//Check > Key team members: percentage
		public CreateRFPPage enterpercentage(String percentageValue ) throws InterruptedException {
			type("//*[@name='other_key_info[0].diversity.minority_percentage.percentage']", percentageValue ,"Key team members Percentage");
			Thread.sleep(3000);
			return this;}
	
	
	//Check > Other
	public CreateRFPPage checkDiversityOther() throws InterruptedException {
		check("//*[@name='other_key_info[0].diversity.other.value']", "Other Diversity, Equity & Inclusion (DEI)");
		Thread.sleep(3000);
		return this;}
	
	
	
	//Comment > Diversity, Equity & Inclusion (DEI) > Other 
		public CreateRFPPage DiversityOtherComments(String DiversityOtherComments) throws InterruptedException {
			Thread.sleep(3000);
			type("//*[@name='other_key_info[0].diversity.other.comment']", DiversityOtherComments , "Diversity Other Comments");	
			return this;}
		
		
	// Check > Credentials (by order of relevance/most recent first)
		public CreateRFPPage checkCredentials() throws InterruptedException {
			check("//*[@name='other_key_info[0].credentials.value']", "Credentials");
			Thread.sleep(3000);
			return this;}
		
	//Comment > Credentials (by order of relevance/most recent first)
				public CreateRFPPage CredentialsComments(String CredentialsComments) throws InterruptedException {
					Thread.sleep(3000);
					type("//*[@name='other_key_info[0].credentials.comment']", CredentialsComments , "Credentials Comments");	
					return this;}
		
		
		// Check > Disaggregation of services (outsourcing and/or (legal) technology related)
		public CreateRFPPage checkDisaggregation() throws InterruptedException {
			check("//*[@name='other_key_info[0].disaggregation.value']", "Disaggregation");
			Thread.sleep(3000);
			return this;}
		
		//Check > Description/name of technology and objective
		public CreateRFPPage checkDisaggregationDescName() throws InterruptedException {
			check("//*[@name='other_key_info[0].disaggregation.technology.description.value']", "Description/name of technology and objective");
			Thread.sleep(3000);
			return this;}
		
		//Comment > Description/name of technology and objective
		public CreateRFPPage DisaggregationDescNameComments(String DisaggregationDescNameComments) throws InterruptedException {
			Thread.sleep(3000);
			type("//*[@name='other_key_info[0].disaggregation.technology.description.comment']", DisaggregationDescNameComments , "Description/name of technology and objective");	
			return this;}
		
		
				//Check > Other
				public CreateRFPPage checkDisaggregationOther() throws InterruptedException {
					check("//*[@name='other_key_info[0].disaggregation.technology.other.value']", "Disaggregation Other");
					Thread.sleep(3000);
					return this;}
				
				//Comment > Other
				public CreateRFPPage DisaggregationOtherComments(String DisaggregationOtherComments) throws InterruptedException {
					Thread.sleep(3000);
					type("//*[@name='other_key_info[0].disaggregation.technology.other.comment']", DisaggregationOtherComments , "Disaggregation Other Comment");	
					return this;}
		
				//Outsourcing
				//Check > Name of service provider(s) and scope of work
				public CreateRFPPage checkNameOfSP() throws InterruptedException {
					check("//*[@name='other_key_info[0].disaggregation.outsourcing.bidders_name']", "Name of service provider(s)");
					Thread.sleep(3000);
					return this;}
				
				
				//Check > Outsourcing Other
				public CreateRFPPage checkOutsourcingOther() throws InterruptedException {
					check("//*[@name='other_key_info[0].disaggregation.outsourcing.other.value']", "Outsourcing Other");
					Thread.sleep(3000);
					return this;}
				
				//Comment >Outsourcing Other
				public CreateRFPPage OutsourcingComments(String OutsourcingComments) throws InterruptedException {
					Thread.sleep(3000);
					type("//*[@name='other_key_info[0].disaggregation.outsourcing.other.comment']", OutsourcingComments , "Outsourcing Comments");	
					return this;}
				
				
				//Check > Expected efficiency/client monetary savings
				public CreateRFPPage checkOKIOthers() throws InterruptedException {
					check("//*[@name='other_key_info[0].disaggregation.expected_efficiency.value']", "Expected efficiency");
					Thread.sleep(3000);
					return this;}
				
				//Comment > Expected efficiency/client monetary savings
				public CreateRFPPage ExpectedEfficiencyComments(String ExpectedEfficiencyComments) throws InterruptedException {
					Thread.sleep(3000);
					type("//*[@name='other_key_info[0].disaggregation.expected_efficiency.comment']", ExpectedEfficiencyComments , "Expected efficiency Comments");	
					return this;}
				
				
				//Check > Expected efficiency/client monetary savings > Other
				public CreateRFPPage checkExpectedEffOther() throws InterruptedException {
					check("//*[@name='other_key_info[0].disaggregation.other.value']", "Expected efficiency Other");
					Thread.sleep(3000);
					return this;}
				
				//Comment > Expected efficiency/client monetary savings  > Other
				public CreateRFPPage ExpectedEffOtherComments(String ExpectedEffOtherComments) throws InterruptedException {
					Thread.sleep(3000);
					type("//*[@name='other_key_info[0].disaggregation.other.comment']", ExpectedEffOtherComments , "Expected efficiency Other Comments");	
					return this;}
				
				
		//Check > What is your USP (max 300 characters) ?
		public CreateRFPPage checkUSP() throws InterruptedException {
			check("//*[@name='other_key_info[0].usp.value']", "What is your USP");
			Thread.sleep(3000);
			return this;}
				
		
		//Comment > What is your USP (max 300 characters) ?
		public CreateRFPPage USPComments(String USPComments) throws InterruptedException {
			Thread.sleep(3000);
			type("//*[@name='other_key_info[0].usp.comment']", USPComments , "What is your USP Comments");	
			return this;}	
		
		
		//Check > Request for additional information
			public CreateRFPPage checkRequestForAdd() throws InterruptedException {
				check("//*[@name='other_key_info[0].additional_info.value']", "Request for additional information");
				Thread.sleep(3000);
				return this;}	
			
			
			// Radio button > We believe information provided in RFP to be sufficient to provide fee proposal and won't entertain questions by email or any request for a call
			public CreateRFPPage clickWeBelieve() throws InterruptedException {
				click("(//span[contains(text(),'We believe information provided in RFP')])", "We believe information");
				Thread.sleep(3000);
				return this;}
		
			// Radio button > We will entertain requests for clarification by
			public CreateRFPPage clickWeEntertain() throws InterruptedException {
				click("(//span[contains(text(),'We will entertain requests for clarification by')])", "We will entertain");
				Thread.sleep(3000);
				return this;}
			
			//Check > email
			public CreateRFPPage checkRequestemail() throws InterruptedException {
				check("//*[@name='other_key_info[0].additional_info.clarification_medium.medium_selection.email_questions']", "Request for additional information/Email");
				Thread.sleep(3000);
				return this;}
		
			
			//Check > video/audio conference
			public CreateRFPPage checkRequestVideoAudio() throws InterruptedException {
				check("//*[@name='other_key_info[0].additional_info.clarification_medium.medium_selection.email_video']", "Request for additional information/Video/Audio");
				Thread.sleep(3000);
				return this;}
			
			
			//Check > both
			public CreateRFPPage checkRequestBoth() throws InterruptedException {
				check("//*[@name='other_key_info[0].additional_info.clarification_medium.medium_selection.both']", "Request for additional information/Both");
				Thread.sleep(3000);
				return this;}		
				
			
			//Comment > Request for additional information
					public CreateRFPPage RequestForAddComments(String RequestForAddComments) throws InterruptedException {
						Thread.sleep(3000);
						type("//*[@name='other_key_info[0].additional_info.comment']", RequestForAddComments , "Request for additional information Comments");	
						return this;}
					
					
					
	//Check > Presentation of fee proposals
		public CreateRFPPage checkPresentation() throws InterruptedException {
			check("//*[@name='other_key_info[0].fee_proposal_presentation.value']", "Presentation of fee proposals");
			Thread.sleep(3000);
			return this;}	
					
	//Check > We will organise meeting/call with (select) bidders to present fee proposal and answer questions
		public CreateRFPPage checkOrganiseMeeting() throws InterruptedException {
			check("//*[@name='other_key_info[0].fee_proposal_presentation.call_bidders']", "We will organise meeting/call");
			Thread.sleep(3000);
			return this;}		
			
		
	//Comment > Presentation of fee proposals
		public CreateRFPPage PresentationComments(String PresentationComments) throws InterruptedException {
			Thread.sleep(3000);
			type("//*[@name='other_key_info[0].fee_proposal_presentation.comment']", PresentationComments , "Presentation of fee proposals Comments");	
			return this;}
		
		
	//Check > Video
		public CreateRFPPage checkVideo() throws InterruptedException {
			check("//*[@name='other_key_info[0].video.value']", "Video");
			Thread.sleep(3000);
			return this;}	
							
	//Check > Legal service providers to provide short video in addition to information in this section “Other key information” (max 2 min)
		public CreateRFPPage checkshortVideoAddition() throws InterruptedException {
			check("//*[@name='other_key_info[0].video.provide_video']", "short video in addition");
			Thread.sleep(3000);
			return this;}		
					
				
	//Comment > Video
		public CreateRFPPage VideoComments(String VideoComments) throws InterruptedException {
			Thread.sleep(3000);
			type("//*[@name='other_key_info[0].video.comment']", VideoComments , "Video Comments");	
			return this;}	
		
	
	//Check > Other Key Info Others
		public CreateRFPPage checkPresentationOthers() throws InterruptedException {
			check("//*[@name='other_key_info[0].other.value']", "Other Key Info Others");
			Thread.sleep(3000);
			return this;}	
		
		
	//Comment > OKI Others
		public CreateRFPPage OKIOtherComments(String OKIOtherComments) throws InterruptedException {
			Thread.sleep(3000);
			type("//*[@name='other_key_info[0].other.comment']", OKIOtherComments , "OKI Other Comments");	
			return this;}	
		
		
//----------------------------->  Bidders Selection

	public CreateRFPPage clickSelectBidders() throws InterruptedException {
		Thread.sleep(2000);
		click("(//button[text()='Select Bidders'])", "Select Bidders");
		Thread.sleep(2000);
		return this;}
	
	public CreateRFPPage checkLegalServicesProviders() throws InterruptedException {
		click("//*[text()='SAM GMAIL TEST COMPANY FINAL']", "Legal Services Providers");
		Thread.sleep(3000);
		return this;}
	
	public CreateRFPPage clickConfirm() throws InterruptedException {
		Thread.sleep(2000);
		click("(//button[text()='Confirm'])", "Confirm");
		Thread.sleep(2000);
		return this;}
	
	public CreateRFPPage clickPreviewRFP() throws InterruptedException {
		Thread.sleep(2000);
		click("(//button[text()='Preview RFP'])", "Preview RFP");
		Thread.sleep(2000);
		return this;}
	
	
	public CreateRFPPage menuPreviewRFP() throws InterruptedException {
		Thread.sleep(3000);
		click("(//span[text()='Preview RFP'])", "Preview RFP");
		Thread.sleep(3000);
		return this;}
	
	
	public CreateRFPPage menuBiddersSelection() throws InterruptedException {
		Thread.sleep(2000);
		click("(//span[text()='Bidders Selection'])", "Bidders Selection");
		Thread.sleep(2000);
		return this;}
	
	
		
//----------------------------->  Preview RFP    <------------------------------------------------------
	public CreateRFPPage clickSubmit() throws InterruptedException {
		Thread.sleep(3000);
		click("(//button[text()='Submit'])", "Submit");
		Thread.sleep(3000);
		return this;}
	
	public CreateRFPPage clickSubmit2() throws InterruptedException {
		Thread.sleep(2000);
		click("(//button[text()='Submit'])[2]", "Submit");
		Thread.sleep(2000);
		return this;}
	
	public CreateRFPPage clickSaveTemplate() throws InterruptedException {
		Thread.sleep(2000);
		click("(//button[text()='Save to Templates Bank'])", "Save to Templates Bank");
		Thread.sleep(2000);
		return this;}
	
	//Type and Enter - Template Name
		public CreateRFPPage enterTemplateName(String templatename) throws InterruptedException {
			type("//*[@name='name']", templatename , "Template Name");
			Thread.sleep(3000);
			return this;}
		
		
	//Click > Button > Save Draft 
		public CreateRFPPage clickSaveDraft() throws InterruptedException {
			Thread.sleep(2000);
			click("(//button[text()='Save Draft'])", "Save Draft");
			Thread.sleep(2000);
			return this;} 
		
		
	//Click > Button > Access Rule
		public CreateRFPPage clickAccessRule() throws InterruptedException {
			Thread.sleep(2000);
			click("(//button[text()='Access Rule'])", "Access Rule");
			Thread.sleep(2000);
			return this;}	
		
		
	//Click > Button > Private
		public CreateRFPPage clickPrivate() throws InterruptedException {
			Thread.sleep(2000);
			click("(//span[text()='Private'])", "Private");
			Thread.sleep(2000);
			return this;}	
		
	
	//Click > Button > Done
		public CreateRFPPage clickDone() throws InterruptedException {
			Thread.sleep(2000);
			click("(//button[text()='Done'])", "Done");
			Thread.sleep(2000);
			return this;}
		
		
	//Click > Button > Semi-Private
		public CreateRFPPage clickSemiPrivate() throws InterruptedException {
			Thread.sleep(2000);
			click("(//span[text()='Semi-Private'])", "Semi-Private");
			Thread.sleep(2000);
			return this;}
		
		
	//Click > Button > Add Member inside the wizard > Edit
		public CreateRFPPage expandAddMember() throws InterruptedException {
			click("(//*[text()='Add Member'])", "Add Member");
			Thread.sleep(2000);
			check("(//*[@type='checkbox'])[2]", "Check User");
			return this;}
				
				
	//Click > Button > Add Group inside the wizard > Edit
		public CreateRFPPage expandAddGroup() throws InterruptedException {
			click("(//*[text()='Add Group'])", "Add Group");
			Thread.sleep(2000);
			check("(//div[text()='Name'])[2]/following::input[1]", "Check User");
			return this;}
	
		
	//Switch On > Non accredited legal services
		public CreateRFPPage NonAccreditedLegalServicesProvidersOn() throws InterruptedException {
			click("(//div[text()='Non accredited legal services providers']//following::input[1])", "Non accredited legal services providers");
			Thread.sleep(2000);
			return this;}
		
	//Type > Non Accredited LSP First Name
		public CreateRFPPage NonAccFirstName(String lspfirstname) throws InterruptedException {
			type("(//input[@name='bidders_selection[0].bidders_email.0.first_name'])", lspfirstname , "NonAcc First Name");
			Thread.sleep(2000);
			return this;}
		
		
	//Type > Non Accredited LSP Last Name
		public CreateRFPPage NonAccLastName(String lsplastname) throws InterruptedException {
			type("(//input[@name='bidders_selection[0].bidders_email.0.last_name'])", lsplastname , "NonAcc Last Name");
			Thread.sleep(2000);
			return this;}
		
		
	//Type > Non Accredited LSP Name
		public CreateRFPPage NonAccLspName(String lspname) throws InterruptedException {
			type("(//input[@name='bidders_selection[0].bidders_email.0.lsp_name'])" ,lspname ,  "NonAcc Name");
			Thread.sleep(2000);
			return this;}
			
		
	//Type > Non Accredited LSP Email
		public CreateRFPPage NonAccLspEmail(String lspemail) throws InterruptedException {
			type("(//input[@name='bidders_selection[0].bidders_email.0.email'])", lspemail , "NonAcc Email");
			Thread.sleep(2000);
			return this;}
		
		
	//Switch On > Disclose Bidders
		public CreateRFPPage discloseBiddersOn() throws InterruptedException {
			click("(//div[text()='Disclose Bidders']//following::input[1])", "Disclose Bidders");
			Thread.sleep(2000);
			return this;}	
				
				
	//check > Disclose to bidders names of other bidder(s)
		public CreateRFPPage discloseBidderName() throws InterruptedException {
			click("(//span[text()='Disclose to bidders names of other bidder(s)'])", "Disclose Names");
			Thread.sleep(2000);
			return this;}
		
		
	//check > Disclose to bidders number of bidders invited to bid
		public CreateRFPPage discloseNoOfBidders() throws InterruptedException {
			click("(//span[text()='Disclose to bidders number of bidders invited to bid'])", "Disclose No Of Bidders");
			Thread.sleep(2000);
			return this;}	
		
		
//----------------------------->        From Past RFPs       <---------------------------------------------	
		
		//Click > Button > From Past RFPs
				public CreateRFPPage clickFromPastRFPs() throws InterruptedException {
					Thread.sleep(2000);
					click("(//button[text()='From Past RFPs'])", "From Past RFPs");
					Thread.sleep(2000);
					return this;} 
				
				
		
				//Click > Button > Select RFPs
				public CreateRFPPage btnSelectRFP() throws InterruptedException {
					Thread.sleep(2000);
					click("(//button[text()='Select RFP'])[1]", "From Past RFPs");
					Thread.sleep(2000);
					return this;} 
						
				
				
	
}
