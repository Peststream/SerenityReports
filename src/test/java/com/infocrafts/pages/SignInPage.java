package com.infocrafts.pages;

import com.infocrafts.utils.BaseUtills;
import com.infocrafts.utils.ExcelUtils;


import org.junit.Assert;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

public class SignInPage extends peststreamPage {
	BaseUtills baseUtils;
	static int rowNum;
	{
		ExcelUtils.setExcelFile("LoginPage");
	}
	@FindBy(xpath = "//*[@id=\"CompanyKey\"]")   
	private WebElementFacade tbx_companyKey;
	@FindBy(xpath = "//*[@id=\"EmailOrUserName\"]")   
	private WebElementFacade tbx_username;
	@FindBy(xpath = "//*[@id=\"Password\"]")          
	private WebElementFacade tbx_password;
	
	@FindBy(xpath = "//button[text()='Login']")         
	private WebElementFacade btn_Signin;
	
	@FindBy(xpath="//*[@id=\"crmCompanySaleshead\"]")
	private WebElementFacade name_company;

	public void login(String loginDetails) {
		rowNum = ExcelUtils.getRowNumber("TC_Details", loginDetails);
		System.out.println(rowNum);
		String companyKey = ExcelUtils.getCellData(rowNum, ExcelUtils.getCellNumber("CompanyKey")).trim();
		String username = ExcelUtils.getCellData(rowNum, ExcelUtils.getCellNumber("UserName")).trim();
		tbx_companyKey.sendKeys(companyKey);
		tbx_username.sendKeys(username);
		waitABit(500);
		String password = ExcelUtils.getCellData(rowNum, ExcelUtils.getCellNumber("Password")).trim();
		tbx_password.sendKeys(password);
		waitABit(500);

	}

	public void clickOnSignInBtn() {
		btn_Signin.click();
	}
	
	public void sendNameOfCompany() {
		name_company.sendKeys("manjeet");
	}

	@Override
	public WebElementFacade getUniqueElement() {

		return btn_Signin;
	}

	@FindBy(xpath = "//span[@class='login-error-span']")
	private WebElementFacade txt_loginFailErrorMsg;

	public void loginFailedErrorMessage() {
		String expected = "Invalid login attempt.";
		String actual = txt_loginFailErrorMsg.getText().trim();
		Assert.assertEquals(expected, actual);

	}


}

