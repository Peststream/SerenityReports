package starter.navigation;

import java.util.Map;

import com.infocrafts.pages.NewUserPCCOPage;
import com.infocrafts.utils.JsonHelper;

import net.thucydides.core.annotations.Step;

public class NewUserPCCOSteps extends pestreamSteps{
	

	private Map<String, String> jsonData;
	
	NewUserPCCOPage newuserpccopage;

	@Step
	public void clickOnCallTab() {
		newuserpccopage.clickOnCall_tab();
		
	}

	@Step
	public void enterLeadInfo() throws Exception {

		jsonData = JsonHelper.readJsonElement("call.json", "CallData");
		newuserpccopage.enterLead_Info(jsonData);
	}

	@Step
	public void leadBranchInfo() {
		newuserpccopage.leandBranch_info();
		
	}

	@Step
	public void alrtDescripCommnt() throws Exception {
		jsonData = JsonHelper.readJsonElement("call.json", "CallData");
		newuserpccopage.alrtDescrip_commnt(jsonData);
		
	}

	@Step
	public void commercialRadioBtn() {
		newuserpccopage.commercialRadio_btn();
		
	}

	@Step
	public void continueBtn() {
		newuserpccopage.continue_btn();
		
	}

	@Step
	public void serviceAddress() throws Exception {
		jsonData = JsonHelper.readJsonElement("call.json", "CallData");
		newuserpccopage.service_address(jsonData);
		
	}

	@Step
	public void assignToDDL() {
		newuserpccopage.assignTo_DDL();
		
	}

	@Step
	public void assignToPerson() {
		newuserpccopage.assignTo_Person();
		
	}

	@Step
	public void saveBtn() {
		newuserpccopage.save_btn();
		
	}

	@Step
	public void actionBtn() {
		newuserpccopage.action_btn();
		
	}

	@Step
	public void savContBtn() {
		newuserpccopage.savCont_btn();
		
	}

	@Step
	public void continueOnInspacTab() {
		newuserpccopage.continueOnInspac_tab();
		
	}

	@Step
	public void categoryDDL() {
		newuserpccopage.category_DDL();
		
	}

	@Step
	public void serviceDDL() {
		newuserpccopage.service_DDL();
		
	}

	@Step
	public void addBtn() {
		newuserpccopage.add_btn();
		
	}

	@Step
	public void savContOnServiceTab() {
		newuserpccopage.savContOnService_tab();
		
	}

	@Step
	public void saveProposalBtn() {
		newuserpccopage.saveProposal_btn();
		
	}

	@Step
	public void enterPayment() {
		newuserpccopage.enter_payment();
		
	}

	@Step
	public void trmCondBtn() {
		newuserpccopage.trmCond_btn();
		
	}

	@Step
	public void entersignature() throws Exception {
		jsonData = JsonHelper.readJsonElement("call.json", "CallData");
		newuserpccopage.enterSignature(jsonData);
		
	}

	@Step
	public void savContOnAgreementTab() {
		newuserpccopage.savContOnAgreement_tab();
		
	}

	@Step
	public void leadCheckBtn() {
		newuserpccopage.leadCheck_btn();
		
	}

	public void InsideRadio() {
		newuserpccopage.InsideRadiobtn();
		
	}

	public void FirstTimeSecondTime() {
		newuserpccopage.firstTimeSecondTime();
		
	}

	public void MarkAsLost() throws Exception {
		jsonData = JsonHelper.readJsonElement("call.json", "CallData");
		newuserpccopage.markLost(jsonData);
	}
	
	public void CustomerOpportunity() {
		newuserpccopage.customerOpp();
		
	}

	public void advcSearch() {
		newuserpccopage.advSearch();
		
	}

	public void OpenRequired() {
		newuserpccopage.openRequired();
	}

	public void MoreDetails() {
		newuserpccopage.moreDetails();
	}

	public void UrgencyScheduleDateOpportunityBtn() {
		newuserpccopage.urgencyScheduleDateOpportunity();
	}

	public void ContSalesProcess() {
		newuserpccopage.ContSalesProcess();
		
	}

	public void saveBtnMore() {
		newuserpccopage.Save_BtnMore();
		
	}

	public void requiredOpportunity() {
		newuserpccopage.required_Opportunity();
		
	}

	public void WaitsUser() {
		newuserpccopage.userWaits();
		
	}

	public void checkBox_of_Service_under_ConfigureProposal() {
		newuserpccopage.checkBox_of_Service();
		
	}

	public void billing_Address_Different() {
		newuserpccopage.billing_Address_Different();
		
	}

	public void differentAddress_Line_first() throws Exception {
		jsonData = JsonHelper.readJsonElement("call.json", "CallDataOfDiffBillinAddress");
		newuserpccopage.differentAddress_Line_first(jsonData);
		
	}

	public void differentAddress_Line_Second() throws Exception {
		jsonData = JsonHelper.readJsonElement("call.json", "CallDataOfDiffBillinAddress");
		newuserpccopage.differentAddress_Line_Second(jsonData);
		
	}

	public void different_Zip() throws Exception {
		jsonData = JsonHelper.readJsonElement("call.json", "CallDataOfDiffBillinAddress");
		newuserpccopage.different_Zip(jsonData);
		
	}

	public void different_City() throws Exception {
		jsonData = JsonHelper.readJsonElement("call.json", "CallDataOfDiffBillinAddress");
		newuserpccopage.different_City(jsonData);
		
	}

	public void ddCat() {
		newuserpccopage.ddCat();
		
	}

	public void ddService() {
		newuserpccopage.ddService();
		
	}

	public void ddPackage() {
		newuserpccopage.ddPackage();
		
	}

	public void ddFrequency() {
		newuserpccopage.ddFrequency();
		
	}

	public void AddAgreement() {
		newuserpccopage.AddAgreement();
		
	}

	public void ComddCat() {
		newuserpccopage.ComddCat();
		
	}

	public void ComddService() {
		newuserpccopage.ComddService();
		
	}

	public void ComddFrequency() {
		newuserpccopage.ComddFrequency();
	}

	public void saveBttnCom() {
		newuserpccopage.saveBttnCom();
		
	}
	
// New code	
	@Step
	public void newChromeTab() {
		newuserpccopage.newChromeTab();
	}
	
	@Step
	public void openGmail() throws Exception {
		
		jsonData = JsonHelper.readJsonElement("call.json", "CallDataOfResidentialFlow");
		newuserpccopage.openGmail(jsonData);
	
	}

	@Step
	public void openMail() throws Exception {
		jsonData = JsonHelper.readJsonElement("call.json", "CallDataOfResidentialFlow");
		newuserpccopage.openMail(jsonData);
	
		
	}
	@Step
	public void openAgreement() {
		newuserpccopage.openAgreement();
		
	}

	public void newTab() {
		newuserpccopage.newTab();
	}

	public void agreeChckBoxName() {
		newuserpccopage.agreeChckBoxName();
		
	}

	public void dashBoard() {
		
		newuserpccopage.dashBoard();
	}

	public void Complete() {
		newuserpccopage.completeTab();
	}

	public void waitUser() {
		newuserpccopage.WaitForFeew();

	}

	public void DDReasonOppLostReason_SelectService() {
		newuserpccopage.DDReasonOppLostReason_SelectService();
		
	}

	public void Save_SelectService() {
		newuserpccopage.Save_SelectService();
		
	}

	public void DDCat_SelectServiceSalesAppAppointments() {
		newuserpccopage.DDCat_SelectServiceSalesAppAppointments();
		
	}

	public void DDService_SelectServiceSalesAppAppointments() {
		newuserpccopage.DDService_SelectServiceSalesAppAppointments();
		
	}

	public void DDPackage_SelectServiceSalesAppAppointments() {
		newuserpccopage.DDPackage_SelectServiceSalesAppAppointments();
		
	}

	public void DDFrequency_SelectServiceSalesAppAppointments() {
		newuserpccopage.DDFrequency_SelectServiceSalesAppAppointments();
		
	}

	public void Add_SelectServiceSalesAppAppointments() {
		newuserpccopage.Add_SelectServiceSalesAppAppointments();
		
	}

	public void AddToAgreement_SelectServiceSalesAppAppointments() {
		newuserpccopage.AddToAgreement_SelectServiceSalesAppAppointments();
		
	}

	public void SaveAndViewAgreement_SelectServiceSalesAppAppointments() {
		newuserpccopage.SaveAndViewAgreement_SelectServiceSalesAppAppointments();
		
	}

	public void SaveAndContinue_ServiceSummaryeSalesAppAppointments() {
		newuserpccopage.SaveAndContinue_ServiceSummaryeSalesAppAppointments();
		
	}

	public void receivedMail() {
		newuserpccopage.receivedMail();
		
	}

	public void clickhereLink() {
		newuserpccopage.clickhereLink();
		
	}

	public void agreeTermAndCondition_LinkForm() {
		newuserpccopage.agreeTermAndCondition_LinkForm();
		
	}

	public void fullName_LinkForm() {
		newuserpccopage.fullName_LinkForm();
		
	}

	public void submitLinkForm() {
		newuserpccopage.submitLinkForm();
		
	}

	public void saveandcontinue_Agreement() {
		newuserpccopage.saveandcontinue_Agreement();
	}

	public void sendagreementlink() {
		newuserpccopage.sendagreementlink();
	}

	public void DDCategory_SelectService_SalesApp() {
		newuserpccopage.DDCategory_SelectService_SalesApp();
		
	}

}
