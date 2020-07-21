package com.infocrafts.pages;

import java.util.Map;

import org.openqa.selenium.JavascriptExecutor;

import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.infocrafts.utils.BaseUtills;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

public class NewUserPCCOPage extends peststreamPage {
	private static final Logger logger = LoggerFactory.getLogger(NewUserPCCOPage.class);
	BaseUtills utills = new BaseUtills();

	@FindBy(xpath = "/html/body/div[3]/div[1]/div/ul/li[3]/a")
	private WebElementFacade callTab;

	@FindBy(xpath = "//*[@id=\"crmCompanySaleshead\"]")
	private WebElementFacade companyName;
	@FindBy(xpath = "//a[@id='btngocrmCompanySaleshead']")
	private WebElementFacade companySearch;

	@FindBy(xpath = "//a[@class='btn typeHeadSuggestedCreateLink']")
	private WebElementFacade create_new_company;

	@FindBy(xpath = "//a[@id='btngocrmContactSaleshead']")
	private WebElementFacade contactSearch;

	@FindBy(xpath = "//div[@class='col-md-3 divSalesContact']//a[@class='btn typeHeadSuggestedCreateLink'][contains(text(),'Create')]")
	WebElementFacade createBTN;

	@FindBy(xpath = "//*[@id=\"crmContactSaleshead\"]")
	private WebElementFacade contactName;

	@FindBy(xpath = "//*[@id=\"CrmContactMiddleName\"]")
	private WebElementFacade middleName;

	@FindBy(xpath = "//*[@id=\"CrmContactLastName\"]")
	private WebElementFacade lastName;

	@FindBy(xpath = "//*[@id=\"PrimaryEmail\"]")
	private WebElementFacade primaryEmail;

	@FindBy(xpath = "//*[@id=\"CellNo\"]")
	private WebElementFacade cellNo;

	@FindBy(xpath = "//*[@id=\"SecondaryPhone\"]")
	private WebElementFacade secondaryPhone;

	@FindBy(xpath = "//*[@id=\"s2id_BranchId\"]")
	private WebElementFacade branch_ddl;

	@FindBy(xpath = "//*[@id=\"s2id_DepartmentSysName\"]")
	private WebElementFacade department_ddl;

	@FindBy(xpath = "//*[@id=\"s2id_ServiceCategoryId\"]")
	private WebElementFacade primary_reason_ddl;

	@FindBy(xpath = "//*[@id='s2id_PrimaryServiceId']")
	private WebElementFacade service_ddl;

	@FindBy(xpath = "//*[@id=\"select2-results-9\"]/li[2]/ul/li")
	private WebElementFacade newPortService;

	@FindBy(xpath = "//*[@id=\"frmGeneralInfo\"]/div/div/div[3]/div[5]/div[2]/div/div")
	private WebElementFacade source_ddl;

	@FindBy(xpath = " //*[@id=\"frmGeneralInfo\"]/div/div/div[3]/div[5]/div[2]/div/div/div/ul/li[2]/a")
	private WebElementFacade customerPortalApp;

	@FindBy(xpath = "//*[@id=\"frmGeneralInfo\"]/div/div/div[3]/div[5]/div[2]/div/div/div/ul/li[3]/a")
	private WebElementFacade leadNowApp;

	@FindBy(xpath = "//*[@id=\"frmGeneralInfo\"]/div/div/div[3]/div[5]/div[2]/div/div/div/ul/li[4]/a")
	private WebElementFacade salesAuto;

	@FindBy(xpath = "//*[@id=\"CreateWebLead\"]")
	private WebElementFacade create_lead;

	@FindBy(xpath = "//*[@id=\"AccountDescription\"]")
	private WebElementFacade accountAlert;

	@FindBy(xpath = "//*[@id=\"ProblemDescription\"]")
	private WebElementFacade accountDes;

	@FindBy(xpath = "//*[@id=\"uniform-rdoCommercial\"]/span")
	private WebElementFacade Commercial_RadioBtn;

	@FindBy(xpath = "//*[@id=\"GenerateLead\"]")
	private WebElementFacade continueBtn;

	@FindBy(xpath = "//*[@id=\"SpRequiredServiceAddressControl_ServiceAddressLine1\"]")
	private WebElementFacade serviceAddressLine1;

	@FindBy(xpath = "//*[@id=\"SpRequiredServiceAddressControl_ServiceAddressLine2\"]")
	private WebElementFacade serviceAddressLine2;

	@FindBy(xpath = "//*[@id=\"SpRequiredServiceAddressControl_ServiceZipCode\"]")
	private WebElementFacade serviceZip;

	@FindBy(xpath = "//*[@id=\"SpRequiredServiceAddressControl_ServiceCityName\"]")
	private WebElementFacade serviceCity;

	@FindBy(xpath = "//*[@id=\"SpRequiredServiceAddressControl_ServiceStateId\"]")
	private WebElementFacade serviceState;

	@FindBy(xpath = "//*[@id=\"s2id_FieldSalesPerson\"]")
	private WebElementFacade assignToDDL;

	@FindBy(xpath = "//*[@id=\"select2-results-3\"]/li[2]/ul/li[1]")
	private WebElementFacade assignToValue;

	@FindBy(xpath = "(//*[@id=\"btnSave\"])[2]")
	private WebElementFacade saveOnCommOPP;

	@FindBy(xpath = "//*[@id=\"sample_1\"]/tbody/tr[1]/td[16]/a[1]/i")
	private WebElementFacade actionBtn;

	@FindBy(xpath = "(//*[@id=\"submit2555\"])[1]")
	private WebElementFacade saveContinue;

	@FindBy(xpath = "//*[@id=\"submit2\"]/span[1]")
	private WebElementFacade continue_btn;

	@FindBy(xpath = "//div[@class='col-md-4']//span[@class='filter-option pull-left'][contains(text(),'--Select--')]")
	private WebElementFacade catagoryDDL;

	@FindBy(xpath = "//span[@class='text'][contains(.,'PestControl')]")
	private WebElementFacade catagoryValue;

	@FindBy(xpath = "(//span[contains(.,'Select Service...')])[1]")
	private WebElementFacade serviceDDL;

	@FindBy(xpath = "//span[contains(text(),'Pest Control')]")
	private WebElementFacade serviceValue;

	@FindBy(xpath = "//select[contains(@name,'Package')]")
	private WebElementFacade packageSelect;

	@FindBy(xpath = "//select[contains(@name,'Package')]/option[2]")
	private WebElementFacade packageValue;

	@FindBy(xpath = "//*[@id=\"ServiceFrequency\"]")
	private WebElementFacade frequency;

	@FindBy(xpath = "//*[@id=\"ServiceFrequency\"]/option[4]")
	private WebElementFacade frequencyvalue;

	@FindBy(xpath = "(//button[@name='btnadd'])[3]")
	private WebElementFacade addBtn;

	@FindBy(xpath = "/html/body/div[3]/div[2]/div[1]/div/div/div/div[2]/div/div/div[2]/div[6]/div/div/form/div/div[4]/div/div/div[1]/div[5]/div/table/tbody/tr[1]/td[1]/input[5]")
	private WebElementFacade checkbox;

	@FindBy(xpath = "(//span[contains(.,'Save & Continue')])[4]") 
	private WebElementFacade saveContOnService;

	@FindBy(xpath = "(//span[contains(.,'Save & Continue')])[6]")
	private WebElementFacade saveContOnProposal;

	@FindBy(xpath = "(//*[@id=\"LeadPaymentDetailVm_PaymentMode\"])[5]")
	private WebElementFacade cashMode;

	@FindBy(xpath = "//*[@id=\"txtTotalPaidPrice\"]")
	private WebElementFacade amount;

	@FindBy(xpath = "//*[@id=\"IAgreeTerms\"]")
	private WebElementFacade conditionBox;

	@FindBy(xpath = "//*[@id=\"txtCusomerSignName\"]")
	private WebElementFacade name;

	@FindBy(xpath = "//*[@id=\"ctlSignatureT\"]")
	private WebElementFacade signatureBox;

	@FindBy(xpath = "(//*[@id=\"btnSubmitAgreement1\"])[1]")
	private WebElementFacade saveCont;

	@FindBy(xpath = "//span[contains(.,'Send Email')]")
	private WebElementFacade mailSend;

	@FindBy(xpath = "(//*[@id=\"uniform-SalesType\"])[1]")
	private WebElementFacade InsideRadio;

	@FindBy(xpath = "//*[@id=\"uniform-RangeTimeType\"]")
	private WebElementFacade TimeRange;

	@FindBy(xpath = "//select[@id='InitialPreferedId']//option[contains(text(),'08:00 AM-09:00 AM')]")
	private WebElementFacade firstTime1;

	@FindBy(xpath = "//select[@id='InitialPreferedId']//option[contains(text(),'Any Time')]")
	private WebElementFacade firstTime2;

	@FindBy(xpath = "//select[@id='SecondRangeofTimeIdOpen']")
	private WebElementFacade SecondTime1;

	@FindBy(xpath = "//select[@id='InitialPreferedId']//option[contains(text(),'Any Time')]")
	private WebElementFacade SecondTime;

	@FindBy(xpath = "/html[1]/body[1]/div[3]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[6]/div[1]/div[1]/form[1]/div[1]/div[2]/div[1]/button[4]/span[1]")
	private WebElementFacade MarkAsLost;

	@FindBy(xpath = "/html/body/div[3]/div[1]/div/ul/li[4]/a/span[1]")
	private WebElementFacade Customer;

	@FindBy(xpath = "/html/body/div[3]/div[1]/div/ul/li[4]/ul/li[2]/a/span")
	private WebElementFacade opportunityy;

	@FindBy(xpath = "//input[@id='btnAdvanceSearch']")
	private WebElementFacade AdvanceSearch;

	@FindBy(xpath = "//a[contains(text(),'Open')]")
	private WebElementFacade openTab;

	@FindBy(xpath = "/html[1]/body[1]/div[3]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/table[1]/tbody[1]/tr[1]/td[2]/a[1]")
	private WebElementFacade requiredOpportunity;

	@FindBy(xpath = "//h4[contains(text(),'More Details')]")
	private WebElementFacade moreDetail;

	@FindBy(xpath = "//span[@id='select2-chosen-1']")
	private WebElementFacade urgency1;

	@FindBy(xpath = "/html[1]/body[1]/div[13]/ul[1]/li[2]/div[1]")
	private WebElementFacade highUrgency;

	@FindBy(xpath = "//input[@id='Lead_ServiceDateStr']")
	private WebElementFacade scheduleDate;

	@FindBy(xpath = "//div[@class='datepicker-days']//th[@class='next']")
	private WebElementFacade nextMonth;

	@FindBy(xpath = "/html[1]/body[1]/div[14]/div[1]/table[1]/tbody[1]/tr[3]/td[4]")
	private WebElementFacade date;

	@FindBy(xpath = "//button[@class='btn blue btnScheduleLead']")
	private WebElementFacade ScheduleOpportunityBtn;

	@FindBy(xpath = "//span[contains(text(),'Continue Sales Process')]")
	private WebElementFacade contSaleProcess;

	@FindBy(xpath = "(//*[@id=\"btnSave\"]/span)[1]")
	private WebElementFacade SaveMore;

	@FindBy(xpath = "/html[1]/body[1]/div[3]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/table[1]/tbody[1]/tr[1]/td[2]/a[1]")
	private WebElementFacade reqOppor;

	@FindBy(xpath = "//div[@id='s2id_SelCancelReasonMasterId']//span[@class='select2-chosen']")
	private WebElementFacade reason;

	@FindBy(xpath = "(//*[starts-with(@id,'select2-result-label-')])[2]")
	private WebElementFacade reason2;

	@FindBy(xpath = "//textarea[@id='txtCancelReasonDescription']")
	private WebElementFacade desc;

	@FindBy(xpath = "//button[@id='btnCancelReasonSubmit']//span[@class='ladda-label'][contains(text(),'Save')]")
	private WebElementFacade markasLostSave;
	
	@FindBy(xpath = "(//input[contains(@type,'checkbox')])[3]")
	private WebElementFacade checkBoxService;
	
	@FindBy(xpath = "//input[@id='BillingDifferentFromServiceAddress']")
	private WebElementFacade billing_Address_Different;
	
	@FindBy(xpath = "//input[@id='SpRequiredBillingAddressControl_BillingAddressLine1']")
	private WebElementFacade differentAddress_Line_first;
	
	@FindBy(xpath = "//input[@id='SpRequiredBillingAddressControl_BillingAddressLine2']")
	private WebElementFacade differentAddress_Line_Second;
	
	@FindBy(xpath = "//input[@id='SpRequiredBillingAddressControl_BillingZipCode']")
	private WebElementFacade different_Zip;
	
	@FindBy(xpath = "//input[@id='SpRequiredBillingAddressControl_BillingCityName']")
	private WebElementFacade different_City;
	
	@FindBy(xpath = "//div[@class='btn-group bootstrap-select form-control select2me dropup']//span[@class='filter-option pull-left'][contains(text(),'--Select--')]")
	private WebElementFacade ddCat;
	
	@FindBy(xpath = "//span[contains(text(),'PestControl')]")
	private WebElementFacade ddCatValue;
	
	@FindBy(xpath = "//select[@id='Services']")
	private WebElementFacade ddService;
	
	@FindBy(xpath = "//option[contains(text(),'Pest Control')]")
	private WebElementFacade ddServiceValue	;
	
	@FindBy(xpath = "//select[@id='Package']")
	private WebElementFacade ddPackage;
	
	@FindBy(xpath = "//option[contains(text(),'PestControl_Pckg_OneTime')]")
	private WebElementFacade ddPackageValue;
	
	@FindBy(xpath = "//select[@id='Frequencies']")
	private WebElementFacade ddFrequency;
	
	@FindBy(xpath = "//select[@id='Frequencies']//option[contains(text(),'One Time')]")
	private WebElementFacade ddFrequencyValue;
	
	@FindBy(xpath = "//input[@id='223022']")
	private WebElementFacade AddAgreement;
	
	@FindBy(xpath = "(//span[contains(.,'--Select--')])[5]")
	private WebElementFacade ComddCat;
	
	@FindBy(xpath = "//span[contains(text(),'PestControl')]")
	private WebElementFacade ComddCatValue;
	
	@FindBy(xpath = "//select[@id='Services']")
	private WebElementFacade ComddService;
	
	@FindBy(xpath = "//option[contains(text(),'Pest Control')]")
	private WebElementFacade ComddServiceValue;
	
	@FindBy(xpath = "//select[@id='ServiceFrequency']")
	private WebElementFacade ComddFrequency;
	
	@FindBy(xpath = "//*[@id=\"ServiceFrequency\"]/option[5]")
	private WebElementFacade ComddFrequencyValue;
	
	@FindBy(xpath = "(//button[contains(.,'Save')])[5]")
	private WebElementFacade saveBttnCom;
    
	@FindBy(xpath = "//*[@id='identifierId']")
	private WebElementFacade mailID;

	@FindBy(xpath = "//*[@id='identifierNext']/span")
	private WebElementFacade NextBtn;

	@FindBy(xpath = "//*[@id='password']/div[1]/div/div[1]/input")
	private WebElementFacade Pass;

	@FindBy(xpath = "//*[@id='passwordNext']/span/span")
	private WebElementFacade outlookLogin_btn;
	
	@FindBy(xpath = "/html[1]/body[1]/div[2]/div[1]/div[3]/div[4]/div[1]/div[1]/div[2]/div[5]/div[1]/div[1]/div[1]/div[1]/div[5]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]")
	private WebElementFacade mailRequired;
	
	@FindBy(css = "body.aAU.inboxsdk__gmail_density_compact:nth-child(2) div.nH:nth-child(3) div.nH div.nH.bkL:nth-child(2) div.no div.nH.bkK.nn:nth-child(2) div.nH div.nH div.nH.ar4.z div.AO div.Tm.aeJ div.aeF div.nH div.BltHke.nH.oy8Mbf.aE3 div.UI:nth-child(6) div.aDP div.ae4.aDM:nth-child(1) div.Cp:nth-child(3) table.F.cf.zt tr.zA.zE:nth-child(1) td.xY.a4W:nth-child(6) div.xS div.xT div.y6 span.bog > span.bqe")
	private WebElementFacade clickHereMail;
	
	@FindBy(xpath = "//input[@id='IAgreeTerms']")
	private WebElementFacade ChckboxIAgree;

	@FindBy(xpath = "//input[@id='txtCusomerSignName']")
	private WebElementFacade TypeName;

	@FindBy(xpath = "//button[@id='btnSubmit']")
	private WebElementFacade SubmitBtn;
	

	@FindBy(xpath = "//input[@id='CompanyKey']")
	private WebElementFacade companyKey;
	@FindBy(xpath = "//input[@id='EmailOrUserName']")
	private WebElementFacade username;
	@FindBy(xpath = "//input[@id='Password']")
	private WebElementFacade password;
	@FindBy(xpath = "//button[@class='btn btn-success uppercase']")
	private WebElementFacade loginbutton;

	@FindBy(xpath = "//a[contains(text(),'Complete')]")
	private WebElementFacade complete;
	
	@FindBy(xpath = "/html[1]/body[1]/div[3]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[6]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/a[1]/span[1]")
	private WebElementFacade DDReasonOppLostReason_SelectService;
	
	@FindBy(xpath = "(//*[starts-with(@id,'select2-result-label-')])[2]")
	private WebElementFacade ValueDDReasonOppLostReason_SelectService;
	
	@FindBy(xpath = "(//button[contains(.,'Save')])[9]")
	private WebElementFacade Save_SelectService;
	
	@FindBy(xpath = "(//span[contains(.,'--Select--')])[1]")
	private WebElementFacade DDCat_SelectServiceSalesAppAppointments;
	
	@FindBy(xpath = "(//span[@class='text'])[20]")
	private WebElementFacade ValueDDCat_SelectServiceSalesAppAppointments;
	
	@FindBy(xpath = "//select[@id='Services']")
	private WebElementFacade DDService_SelectServiceSalesAppAppointments;
	
	@FindBy(xpath = "//option[contains(text(),'Pest Control')]")
	private WebElementFacade ValueDDService_SelectServiceSalesAppAppointments;
	
	@FindBy(xpath = "//select[@id='Package']")
	private WebElementFacade DDPackage_SelectServiceSalesAppAppointments;
	
	@FindBy(xpath = "//option[contains(text(),'PestControl_Pckg_OneTime')]")
	private WebElementFacade ValueDDPackage_SelectServiceSalesAppAppointments;
	
	@FindBy(xpath = "//select[@id='Frequencies']")
	private WebElementFacade DDFrequency_SelectServiceSalesAppAppointments;
	
	@FindBy(xpath = "//select[@id='Frequencies']//option[contains(text(),'Yearly')]")
	private WebElementFacade ValueDDFrequency_SelectServiceSalesAppAppointments;
	
	@FindBy(xpath = "//button[@id='submitserv']")
	private WebElementFacade Add_SelectServiceSalesAppAppointments;
	
	@FindBy(xpath = "(//input[@type='checkbox'])[2]")
	private WebElementFacade AddToAgreement_SelectServiceSalesAppAppointments;
	
	@FindBy(xpath = "(//span[contains(.,'Save & View Agreement')])[2]")
	private WebElementFacade SaveAndViewAgreement_SelectServiceSalesAppAppointments;
	
	@FindBy(xpath = "(//span[contains(.,'Save & Continue')])[3]")
	private WebElementFacade SaveAndContinue_ServiceSummaryeSalesAppAppointments;
	
	@FindBy(xpath = "//div[@id=':3f']//span[@name='testQA'][contains(text(),'testQA')]")
	private WebElementFacade receivedMail;
	
	@FindBy(xpath = "//a[contains(text(),'Click Here')]")
	private WebElementFacade clickhereLink;
	
	@FindBy(xpath = "//input[@id='IAgreeTerms']")
	private WebElementFacade agreeTermAndCondition_LinkForm;
	
	@FindBy(xpath = "//input[@id='txtCusomerSignName']")
	private WebElementFacade fullName_LinkForm;
	
	@FindBy(xpath = "//button[@id='btnSubmit']")
	private WebElementFacade submitLinkForm;
	
	@FindBy(xpath = "//span[contains(text(),'Send Agreement Link')]")
	private WebElementFacade sendagreementlink;
	
	@FindBy(xpath = "(//span[contains(.,'--Select--')])[5]")
	private WebElementFacade DDCategory;
	
	@FindBy(xpath = "//span[contains(text(),'PestControl')]")
	private WebElementFacade ValueDDCategory;
	
	@FindBy(xpath = "(//span[contains(.,'Select Service...')])[1]")
	private WebElementFacade DDService;
	
	@FindBy(xpath = "//span[contains(text(),'Pest Control')]")
	private WebElementFacade ValueDDService;
	
	@FindBy(xpath = "(//span[contains(.,'Select Frequency...')])[1]")
	private WebElementFacade DDFreq;
	
	@FindBy(xpath = "(//a[contains(.,'EOM')])[1]")
	private WebElementFacade ValueDDFreq;
	
	/*@FindBy(xpath = "//span[contains(text(),'Send Agreement Link')]")
	private WebElementFacade sendagreementlink;
	
	@FindBy(xpath = "//span[contains(text(),'Send Agreement Link')]")
	private WebElementFacade sendagreementlink;*/
	


	/*@FindBy(xpath = "https://accounts.google.com/signin/v2/identifier?service=mail&passive=true&rm=false&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&ss=1&scc=1&ltmpl=default&ltmplcache=2&emr=1&osid=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin")
	private WebElementFacade newTab;*/


	@Override
	public WebElementFacade getUniqueElement() {

		return null;
	}

	public void clickOnCall_tab() {
		callTab.click();

	}

	public void enterLead_Info(Map<String, String> testData) {
		companyName.sendKeys(testData.get("CompanyName"));
		companySearch.click();

		waitABit(1500);
		scrollToClickAnelement(create_new_company);

		contactName.sendKeys(testData.get("ContactName"));
		contactSearch.click();

		waitABit(1500);
		scrollToClickAnelement(createBTN);

		middleName.sendKeys(testData.get("MiddleName"));
		lastName.sendKeys(testData.get("LastName"));
		primaryEmail.sendKeys(testData.get("PrimaryEmail"));
		cellNo.sendKeys(testData.get("CellNumber"));
		secondaryPhone.sendKeys(testData.get("SecondaryNumber"));

	}

	public void leandBranch_info() {
		service_ddl.click();
		newPortService.click();

		source_ddl.click();
		customerPortalApp.click();

	}

	public void alrtDescrip_commnt(Map<String, String> testData) {
		//accountAlert.sendKeys(testData.get("AccountAlert"));
		accountDes.sendKeys(testData.get("ProblemDescription"));

	}

	public void commercialRadio_btn() {
		Commercial_RadioBtn.click();

	}

	public void continue_btn() {
try {
		continueBtn.click();

}
catch(Exception e){
	logger.error("continue_btn >>> continue button is not clickable");
	
}}

	public void service_address(Map<String, String> testData) {
		serviceAddressLine1.sendKeys(testData.get("Address"));
		serviceAddressLine2.sendKeys(testData.get("Address"));
		serviceZip.sendKeys(testData.get("ServiceZip"));
		serviceCity.sendKeys(testData.get("ServiceCity"));

	}

	public void assignTo_DDL() {
		assignToDDL.click();

	}

	public void assignTo_Person() {
		assignToValue.click();
		scrollDown(saveOnCommOPP);

	}

	public void save_btn() {
		saveOnCommOPP.click();
		waitABit(8000);

	}

	public void action_btn() {
		actionBtn.click();
		waitABit(3000);

	}

	public void savCont_btn() {

		try {
			saveContinue.click();

		} catch (Exception e) {
			scrollUP(saveContinue);
            saveContinue.click();
		}
		waitABit(3000);
	}

	public void continueOnInspac_tab() {

		waitABit(2000);
		continue_btn.click();
		waitABit(2000);

	}

	public void category_DDL() {
		scrollDown(catagoryDDL);
		catagoryDDL.click();
		waitABit(3000);
		catagoryValue.click();
		waitABit(2000);
	}

	public void service_DDL() {
		serviceDDL.click();
		waitABit(2000);
		serviceValue.click();
		waitABit(2000);
		frequency.click();
		waitABit(2000);
		frequencyvalue.click();
		waitABit(2000);
	}

	public void add_btn() {
		waitABit(1000);
		addBtn.click();
		waitABit(2000);

		// checkbox.click();

	}

	public void savContOnService_tab() {

		try {
			scrollDownLarge(saveContOnService);
			waitABit(5000);
			saveContOnService.click();
		} catch (Exception e) {
			saveContOnService.submit();
			waitABit(5000);
		}

	}

	public void saveProposal_btn() {
		waitABit(3000);
		scrollDown(saveContOnProposal);
		saveContOnProposal.click();
		waitABit(3000);
	}

	public void enter_payment() {
		waitABit(3000);
		((JavascriptExecutor) getDriver()).executeScript("arguments[0].checked = true;", cashMode);

	}

	public void trmCond_btn() {
		waitABit(3000);
		((JavascriptExecutor) getDriver()).executeScript("arguments[0].checked = true;", conditionBox);

	}

	public void enterSignature(Map<String, String> testData) {
		waitABit(3000);
		name.sendKeys(testData.get("CustomerName"));
		Actions builder = new Actions(getDriver());
		Action drawAction = builder.moveToElement(signatureBox, 135, 15) // start points x axis and y axis.
				.click().moveByOffset(200, 60) // 2nd points (x1,y1)
				.click().moveByOffset(100, 70)// 3rd points (x2,y2)
				.doubleClick().build();
		drawAction.perform();
		waitABit(1500);

	}

	public void savContOnAgreement_tab() {

		// ((JavascriptExecutor)
		// getDriver()).executeScript("arguments[0].scrollIntoView();", saveCont);
		saveCont.click();
		waitABit(11000);
		try {
			waitABit(3000);
			mailSend.click();
		} catch (Exception e) {
			mailSend.submit();
			waitABit(5000);
		}

	}

	public void leadCheck_btn() {

		create_lead.click();
		waitABit(1000);
	}

	public void InsideRadiobtn() {
		InsideRadio.click();
		waitABit(2000);
	}

	public void firstTimeSecondTime() {

		TimeRange.click();
		waitABit(2000);
		firstTime1.click();
		//firstTime2.click();
		waitABit(2000);
		SecondTime1.click();
		//SecondTime.click();
		waitABit(2000);

	}

	public void markLost(Map<String, String> testData) {
		scrollUP(MarkAsLost);
		MarkAsLost.click();
		waitABit(2000);
		reason.click();

		reason2.click();
		waitABit(2000);
		desc.sendKeys(testData.get("ProblemDescription"));
		waitABit(2000);
		markasLostSave.click();
		waitABit(2000);

	}

	public void customerOpp() {
		scrollUP(Customer);
		Customer.click();
		waitABit(2000);
		opportunityy.click();
		waitABit(2000);

	}

	public void advSearch() {
		AdvanceSearch.click();

		waitABit(2000);

	}

	public void openRequired() {
		scrollUP(openTab);
		openTab.click();
		waitABit(2000);

		requiredOpportunity.click();
		waitABit(2000);

	}

	public void moreDetails() {

		moreDetail.click();
		waitABit(2000);

	}

	public void urgencyScheduleDateOpportunity() {
		urgency1.click();
		waitABit(2000);
		highUrgency.click();
		waitABit(2000);
		scheduleDate.click();
		waitABit(2000);
		nextMonth.click();
		waitABit(2000);
		date.click();
		waitABit(2000);
		ScheduleOpportunityBtn.click();
		waitABit(2000);

	}

	public void ContSalesProcess() {
		scrollUP(contSaleProcess);
		contSaleProcess.click();
		for (String agreement : getDriver().getWindowHandles()) // iterating on child windows
		{
			getDriver().switchTo().window(agreement);
		}
		waitABit(6000);
	}

	public void Save_BtnMore() {
		try {
			SaveMore.click();

		} catch (Exception e) {
			SaveMore.submit();
		}
		waitABit(3000);
	}

	public void required_Opportunity() {
		reqOppor.click();
		waitABit(2000);
	}

	public void userWaits() {
		waitABit(2000);

	}

	public void checkBox_of_Service() {
		waitABit(5000);
		scrollUPSmall(checkBoxService);
		waitABit(5000);
		checkBoxService.click();
		waitABit(3000);
	}

	public void billing_Address_Different() {
		billing_Address_Different.click();
		waitABit(2000);
		
	}

	public void differentAddress_Line_first(Map<String, String> testData) {
		differentAddress_Line_first.sendKeys(testData.get("DAddress"));
		waitABit(1000);
		
	}

	public void differentAddress_Line_Second(Map<String, String> testData) {
		differentAddress_Line_Second.sendKeys(testData.get("DAddress"));
		waitABit(1000);
		
	}

	public void different_Zip(Map<String, String> testData) {
		
		different_Zip.sendKeys(testData.get("DServiceZip"));
		waitABit(1000);
		
	}

	public void different_City(Map<String, String> testData) {
		
		different_City.sendKeys(testData.get("DServiceCity"));
		waitABit(1000);
		
	}

	public void ddCat() {
		ddCat.click();
		waitABit(2000);
		
		ddCatValue.click();
		waitABit(2000);
		
	}

	public void ddService() {
		ddService.click();
		waitABit(2000);
		
		ddServiceValue.click();
		waitABit(2000);
		
	}

	public void ddPackage() {
		ddPackage.click();
		waitABit(2000);
		
		ddPackageValue.click();
		waitABit(2000);
		
	}

	public void ddFrequency() {
		ddFrequency.click();
		waitABit(2000);
		
		ddFrequencyValue.click();
		waitABit(2000);
		
	}

	public void AddAgreement() {
		AddAgreement.click();
		waitABit(2000);
		
		
	}

	public void ComddCat() {
		waitABit(4000);
		scrollDown(ComddCat);
		ComddCat.click();
		
		waitABit(4000);
		ComddCatValue.click();
		waitABit(2000);
		
	}

	public void ComddService() {
		ComddService.click();
		waitABit(2000);
		
		ComddServiceValue.click();
		waitABit(2000);
		
	}

	public void ComddFrequency() {
		ComddFrequency.click();
		waitABit(2000);
		
		ComddFrequencyValue.click();
		waitABit(2000);
		
	}

	public void saveBttnCom() {
		saveBttnCom.click();
		waitABit(2000);
		
	}

	public void newChromeTab() {
		String allWindowHandle = getDriver().getWindowHandle();
		getDriver().switchTo().window(allWindowHandle);
		getDriver().get("https://accounts.google.com/signin/v2/identifier?service=mail&passive=true&rm=false&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&ss=1&scc=1&ltmpl=default&ltmplcache=2&emr=1&osid=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
		waitABit(2000);
	}

	public void openGmail(Map<String, String> testData) {
		mailID.sendKeys(testData.get("OpenGmail"));
		waitABit(3000);
		NextBtn.click();
		waitABit(3000);
		Pass.sendKeys(testData.get("OpenGmailPassword"));
		waitABit(3000);
		outlookLogin_btn.click();		
		waitABit(3000);
	}
	public void openMail(Map<String, String> testData) {
		waitABit(3000);
		//scrollUPSmall(mailRequired);
		try {
			waitABit(4000);

			//scrollUP(mailRequired);
			mailRequired.click();
		} catch (Exception e) {
			mailRequired.submit();
		}
		waitABit(2000);
	}

	public void openAgreement() {
		//scrollDown(mailRequired);
		clickHereMail.click();
		waitABit(3000);
		for (String agreement : getDriver().getWindowHandles()) // iterating on child windows
		{
			getDriver().switchTo().window(agreement);
		}
		waitABit(2000);
	}

	public void newTab() {
		//newTab.click();
		waitABit(3000);
		
		String allWindowHandle = getDriver().getWindowHandle();
		getDriver().switchTo().window(allWindowHandle);
		getDriver().get("https://mail.google.com/mail");
		waitABit(2000);
	}

	public void agreeChckBoxName() {
		
			ChckboxIAgree.click();
			waitABit(2000);

			TypeName.sendKeys("Test Name");

			SubmitBtn.click();
			waitABit(3000);


	}

	public void dashBoard() {
		
			String allWindowHandle = getDriver().getWindowHandle();
			getDriver().switchTo().window(allWindowHandle);
			getDriver().get("https://www.pestream.com/");
			waitABit(2000);
			companyKey.sendKeys("QAAutomation");
			username.sendKeys("QAAutomation");
			password.sendKeys("Info@123");
			loginbutton.click();
	
		
	}

	
	public void completeTab() {
		scrollUP(complete);
		complete.click();
	}

	
	public void WaitForFeew() {
		// TODO Auto-generated method stub
		
	}

	public void DDReasonOppLostReason_SelectService() {
		waitABit(5000);
		DDReasonOppLostReason_SelectService.click();
		waitABit(2000);
		ValueDDReasonOppLostReason_SelectService.click();
		waitABit(2000);
	}

	public void Save_SelectService() {
		
		Save_SelectService.click();
		waitABit(2000);
	}

	public void DDCat_SelectServiceSalesAppAppointments() {
		DDCat_SelectServiceSalesAppAppointments.click();
		waitABit(2000);
		
		ValueDDCat_SelectServiceSalesAppAppointments.click();
		waitABit(2000);
	}

	public void DDService_SelectServiceSalesAppAppointments() {
		DDService_SelectServiceSalesAppAppointments.click();
		waitABit(2000);
		
		ValueDDService_SelectServiceSalesAppAppointments.click();
		waitABit(2000);
		
	}

	public void DDPackage_SelectServiceSalesAppAppointments() {
		DDPackage_SelectServiceSalesAppAppointments.click();
		waitABit(2000);
		
		ValueDDPackage_SelectServiceSalesAppAppointments.click();
		waitABit(2000);
		
	}

	public void DDFrequency_SelectServiceSalesAppAppointments() {
		DDFrequency_SelectServiceSalesAppAppointments.click();
		waitABit(2000);
		
		ValueDDFrequency_SelectServiceSalesAppAppointments.click();
		waitABit(2000);
	}

	public void Add_SelectServiceSalesAppAppointments() {
		Add_SelectServiceSalesAppAppointments.click();
		waitABit(2000);
	}

	public void AddToAgreement_SelectServiceSalesAppAppointments() {
		AddToAgreement_SelectServiceSalesAppAppointments.click();
		waitABit(2000);
	}

	public void SaveAndViewAgreement_SelectServiceSalesAppAppointments() {
		SaveAndViewAgreement_SelectServiceSalesAppAppointments.click();
		waitABit(2000);
	}

	public void SaveAndContinue_ServiceSummaryeSalesAppAppointments() {
		SaveAndContinue_ServiceSummaryeSalesAppAppointments.click();
		waitABit(2000);
	}

	public void receivedMail() {
		receivedMail.click();
		waitABit(2000);
		
	}

	public void clickhereLink() {
		clickhereLink.click();
		waitABit(2000);
		
	}

	public void agreeTermAndCondition_LinkForm() {
		agreeTermAndCondition_LinkForm.click();
		waitABit(2000);
		
	}

	public void fullName_LinkForm() {
		fullName_LinkForm.click();
		waitABit(2000);
		
	}

	public void submitLinkForm() {
		submitLinkForm.click();
		waitABit(2000);
		
	}

	public void saveandcontinue_Agreement() {
		saveCont.click();
		waitABit(2000);
	}

	public void sendagreementlink() {
		sendagreementlink.click();
		waitABit(2000);
	}

	public void DDCategory_SelectService_SalesApp() {
		waitABit(3000);
		scrollDownLarge(DDCategory);
		waitABit(3000);
		
		DDCategory.click();
		waitABit(3000);
		ValueDDCategory.click();
		waitABit(3000);
		
		
		DDService.click();
		waitABit(3000);
		ValueDDService.click();
		waitABit(3000);
		
		DDFreq.click();
		waitABit(3000);
		ValueDDFreq.click();
		waitABit(3000);
		
	}


}
