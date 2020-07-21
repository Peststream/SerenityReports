package starter.stepdefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.navigation.NewUserPCCOSteps;

public class NewUserPCCOStepDefs {

	@Steps
	NewUserPCCOSteps newuserpccosteps;

	@When("^user clicked on call tab$")
	public void user_clicked_on_call_tab() {
		newuserpccosteps.clickOnCallTab();
	}

	@When("^enters lead info \"([^\"]*)\", \"([^\"]*)\",\"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\"$")
	public void enters_lead_info(String arg1, String arg2, String arg3, String arg4, String arg5, String arg6)
			throws Exception {
		newuserpccosteps.enterLeadInfo();
	}

	@When("^select lead branch info$")
	public void select_lead_branch() {
		newuserpccosteps.leadBranchInfo();
	}

	@Then("^Check lead button$")
	public void check_lead_button() {
		newuserpccosteps.leadCheckBtn();
	}

	@Then("^enters Account_Alert and enterProblemDiscription$")
	public void enters_Account_Alert_and_enterProblemDiscription() throws Exception {
		newuserpccosteps.alrtDescripCommnt();
	}

	@Then("^I click on commercial Radio button$")
	public void i_click_on_commercial_Radio_button() {
		newuserpccosteps.commercialRadioBtn();
	}

	@Then("^click on continue button for commercial opportunity$")
	public void click_on_continue_button_for_commercial_opportunity() {
		newuserpccosteps.continueBtn();
	}

	@Then("^enter service address$")
	public void enter_service_address() throws Exception {
		newuserpccosteps.serviceAddress();
	}

	@Then("^click on assign to DDL$")
	public void click_on_assign_to_DDL() {
		newuserpccosteps.assignToDDL();
	}

	@Then("^choose assign to person$")
	public void choose_assign_to_person() {
		newuserpccosteps.assignToPerson();
	}

	@Then("^click on save Button$")
	public void click_on_save_Button() {
		newuserpccosteps.saveBtn();
	}

	@Then("^click on opportunity action icon$")
	public void click_on_opportunity_action_icon() {
		newuserpccosteps.actionBtn();
	}

	@Then("^review all the details and click on save and continue button$")
	public void review_all_the_details_and_click_on_save_and_continue_button() {
		newuserpccosteps.savContBtn();
	}

	@Then("^click on continue button on inspection tab$")
	public void click_on_continue_button_on_inspection_tab() {
		newuserpccosteps.continueOnInspacTab();

	}

	@Then("^choose category DDL$")
	public void choose_category_DDL() {
		newuserpccosteps.categoryDDL();
	}

	@Then("^select service from DDL$")
	public void select_service_from_DDL() {
		newuserpccosteps.serviceDDL();
	}

	@Then("^click on add button$")
	public void click_on_add_button() {
		newuserpccosteps.addBtn();
	}

	@Then("^click on save and continue on select service tab$")
	public void click_on_save_and_continue_on_select_service_tab() {
		newuserpccosteps.savContOnServiceTab();
	}

	@Then("^review proposal and click on save and proposal$")
	public void review_proposal_and_click_on_save_and_proposal() {
		newuserpccosteps.saveProposalBtn();
	}

	@Then("^check payment type and enter amount$")
	public void check_payment_type_and_enter_amount() {
		newuserpccosteps.enterPayment();
	}

	@Then("^check term and condition$")
	public void check_term_and_condition() {
		newuserpccosteps.trmCondBtn();
	}

	@Then("^enter full name and signature$")
	public void enter_full_name_and_signature() throws Exception {
		newuserpccosteps.entersignature();
	}

	@Then("^click on save and continue on Agreement tab$")
	public void click_on_save_and_continue_on_Agreement_tab() {
		newuserpccosteps.savContOnAgreementTab();
	}

	@Then("^User Clicks on Inside Radio Button$")
	public void user_Clicks_on_Inside_Radio_Button() {
		newuserpccosteps.InsideRadio();
	}

	@Then("^Select first time range & Second time range$")
	public void select_first_time_range_Second_time_range() {
		newuserpccosteps.FirstTimeSecondTime();
	}

	@Then("^User Clicks On Mark as Lost$")
	public void user_Clicks_On_Mark_as_Lost() throws Exception {
		newuserpccosteps.MarkAsLost();
	}

	@Then("^User Clicks Customer Opportunity$")
	public void user_Clicks_OnCustomer_Opportunity() {
		newuserpccosteps.CustomerOpportunity();
	}

	@Then("^User Clicks Advance Search$")
	public void user_ClickAdvance_Search() {
		newuserpccosteps.advcSearch();
	}

	@Then("Navigate open and Select required opportunity")
	public void navigateOpen_and_SelecttheRequiredOpportunity() {
		newuserpccosteps.OpenRequired();
	}

	@Then("^User Click More Details$")
	public void user_ClickMore_Details() {
		newuserpccosteps.MoreDetails();
	}

	@Then("^User Set Urgency Schedule and Clicks on Schedule Opportunity$")
	public void user_Set_UrgencyAndClicksonSchedule_Opportunity() {
		newuserpccosteps.UrgencyScheduleDateOpportunityBtn();
	}

	@Then("^User Click Cont Sale Process$")
	public void user_ClickCont_Sale_Process() {
		newuserpccosteps.ContSalesProcess();

	}

	@Then("^User Clicks on SAVE Button more$")
	public void User_clicks_save_ButtonMore() {
		newuserpccosteps.saveBtnMore();
	}

	@Then("^User Selects Required Opportunity$")
	public void User_selectsRequired_Opportunity() {
		newuserpccosteps.requiredOpportunity();
	}

	@Then("^User waits$")
	public void User_Waits() {
		newuserpccosteps.WaitsUser();
	}

	@Then("^click on checkBox of Service under ConfigureProposal$")
	public void click_on_checkBox_of_Service_under_ConfigureProposal() {
		newuserpccosteps.checkBox_of_Service_under_ConfigureProposal();
	}

	@Then("^check the Billing Address Different$")
	public void check_the_Billing_Address_Different() {
		newuserpccosteps.billing_Address_Different();
	}

	@Then("^click on DifferentAddress Line first$")
	public void click_on_DifferentAddress_Line_first() throws Exception {
		newuserpccosteps.differentAddress_Line_first();
	}

	@Then("^click on Different Address Line Second$")
	public void click_on_Different_Address_Line_Second() throws Exception {
		newuserpccosteps.differentAddress_Line_Second();
	}

	@Then("^click on Different Zip$")
	public void click_on_Different_Zip() throws Exception {
		newuserpccosteps.different_Zip();
	}

	@Then("^click on Different City$")
	public void click_on_Different_City() throws Exception {
		newuserpccosteps.different_City();
	}

	@Then("^click on ddCat$")
	public void click_on_ddCat() {
		newuserpccosteps.ddCat();
	}

	@Then("^click on ddService$")
	public void click_on_ddService() {
		newuserpccosteps.ddService();
	}

	@Then("^click on ddPackage$")
	public void click_on_ddPackage() {
		newuserpccosteps.ddPackage();
	}

	@Then("^click on ddFrequency$")
	public void click_on_ddFrequency() {
		newuserpccosteps.ddFrequency();
	}

	@Then("^click on check_AddAgreement$")
	public void click_on_check_AddAgreement() {
		newuserpccosteps.AddAgreement();
	}

	@Then("^click on ComddCat$")
	public void click_on_ComddCat() {
		newuserpccosteps.ComddCat();
	}

	@Then("^click on ComddService$")
	public void click_on_ComddService() {
		newuserpccosteps.ComddService();
	}

	@Then("^click on ComddFrequency$")
	public void click_on_ComddFrequency() {
		newuserpccosteps.ComddFrequency();
	}

	@Then("^click on saveBttnCom$")
	public void click_on_saveBttnCom() {
		newuserpccosteps.saveBttnCom();
	}

	@Then("^open new tab in the browser$")
	public void open_new_tab_in_the_browser() {
		newuserpccosteps.newChromeTab();
	}

	@Then("^open gmail with credentials$")
	public void open_gmail_with_credentials() throws Exception {
		newuserpccosteps.openGmail();
	}

	@Then("^open agreement mail$")
	public void open_agreement_mail() throws Exception {
		newuserpccosteps.openMail();
	}

	@Then("^click on agreement link$")
	public void click_on_agreement_link() {
		newuserpccosteps.openAgreement();
	}

	@Then("^user click on newTab$")
	public void user_click_on_newTab() {
		newuserpccosteps.newTab();
	}

	@Then("^User agree terms and give name$")
	public void agreetermsName() {
		newuserpccosteps.agreeChckBoxName();
	}

	@Then("^User redirects to dashboard$")
	public void user_redirectsToDashboard() {
		newuserpccosteps.dashBoard();
	}

	@Then("^User Clicks on Customer Opportunity$")
	public void user_Clicks_on_Customer_Opportunity() {
		newuserpccosteps.CustomerOpportunity();
	}

	@Then("^User Clicks on Advance Search$")
	public void user_Clicks_on_Advance_Search() {
		newuserpccosteps.advcSearch();
	}

	@Then("^clicks on Complete$")
	public void user_clicks_on_Complete() {
		newuserpccosteps.Complete();
	}

	@Then("^User Screen Waits for a Bit$")
	public void UserWaitsForABit() {
		newuserpccosteps.waitUser();
	}

	@Then("^user click on DDReasonOppLostReason_SelectService$")
	public void user_click_on_DDReasonOppLostReason_SelectService() {
		newuserpccosteps.DDReasonOppLostReason_SelectService();
	}

	@Then("^user click on Save_SelectService$")
	public void user_click_on_Save_SelectService() {
		newuserpccosteps.Save_SelectService();
	}

	@Then("^user click on DDCat_SelectServiceSalesAppAppointments$")
	public void user_click_on_DDCat_SelectServiceSalesAppAppointments() {
		newuserpccosteps.DDCat_SelectServiceSalesAppAppointments();
	}

	@Then("^user click on DDService_SelectServiceSalesAppAppointments$")
	public void user_click_on_DDService_SelectServiceSalesAppAppointments() {
		newuserpccosteps.DDService_SelectServiceSalesAppAppointments();
	}

	@Then("^user click on DDPackage_SelectServiceSalesAppAppointments$")
	public void user_click_on_DDPackage_SelectServiceSalesAppAppointments() {
		newuserpccosteps.DDPackage_SelectServiceSalesAppAppointments();
	}

	@Then("^user click on DDFrequency_SelectServiceSalesAppAppointments$")
	public void user_click_on_DDFrequency_SelectServiceSalesAppAppointments() {
		newuserpccosteps.DDFrequency_SelectServiceSalesAppAppointments();
	}

	@Then("^user click on Add_SelectServiceSalesAppAppointments$")
	public void user_click_on_Add_SelectServiceSalesAppAppointments() {
		newuserpccosteps.Add_SelectServiceSalesAppAppointments();
	}

	@Then("^user click on AddToAgreement_SelectServiceSalesAppAppointments$")
	public void user_click_on_AddToAgreement_SelectServiceSalesAppAppointments() {
		newuserpccosteps.AddToAgreement_SelectServiceSalesAppAppointments();
	}

	@Then("^user click on SaveAndViewAgreement_SelectServiceSalesAppAppointments$")
	public void user_click_on_SaveAndViewAgreement_SelectServiceSalesAppAppointments() {
		newuserpccosteps.SaveAndViewAgreement_SelectServiceSalesAppAppointments();
	}

	@Then("^user click on SaveAndContinue_ServiceSummaryeSalesAppAppointments$")
	public void user_click_on_SaveAndContinue_ServiceSummaryeSalesAppAppointments() {
		newuserpccosteps.SaveAndContinue_ServiceSummaryeSalesAppAppointments();
	}
	
	
	@Then("^user click on receivedMail$")
	public void user_click_on_receivedMail() {
		newuserpccosteps.receivedMail();
	}

	@Then("^user click on clickhereLink$")
	public void user_click_on_clickhereLink() {
		newuserpccosteps.clickhereLink();
	}

	@Then("^user click on agreeTermAndCondition_LinkForm$")
	public void user_click_on_agreeTermAndCondition_LinkForm() {
		newuserpccosteps.agreeTermAndCondition_LinkForm();
	}

	@Then("^user click on fullName_LinkForm$")
	public void user_click_on_fullName_LinkForm() {
		newuserpccosteps.fullName_LinkForm();
	}

	@Then("^user click on submitLinkForm$")
	public void user_click_on_submitLinkForm() {
		newuserpccosteps.submitLinkForm();
	}
	

@Then("^user click on saveandcontinue_Agreement$")
public void user_click_on_saveandcontinue_Agreement() {
	newuserpccosteps.saveandcontinue_Agreement();
}

@Then("^user click on sendagreementlink$")
public void user_click_on_sendagreementlink() {
	newuserpccosteps.sendagreementlink();
}


@Then("^user click on DDCategory_SelectService_SalesApp$")
public void user_click_on_DDCategory_SelectService_SalesApp() {
	newuserpccosteps.DDCategory_SelectService_SalesApp();
}




}
