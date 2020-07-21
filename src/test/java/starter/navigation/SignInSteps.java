package starter.navigation;

import com.infocrafts.pages.peststreamHomePage;
import com.infocrafts.pages.SignInPage;

import net.thucydides.core.annotations.Step;

public class SignInSteps extends pestreamSteps {
	SignInPage signInPage;
	peststreamHomePage homePage;

	@Step
	public void openURL() {
		signInPage.open();
		getDriver().manage().window().maximize();
	}

	@Step
	public void loginToPeststream(String loginDetails) {

		signInPage.login(loginDetails);

	}

	@Step
	public void clickLoginBtnStep() {
		signInPage.clickOnSignInBtn();
	}
	@Step
	public void sendCompanynaMe() {
		signInPage.sendNameOfCompany();
	}


	@Step
	public void validateMAindashBoardPage() {
		homePage.dashboardPage();
	}

	@Step
	public void validateErrorMessage() {
		signInPage.loginFailedErrorMessage();

	}

}
