package com.infocrafts.utils;

import java.util.List;

import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.ElementNotVisibleException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class BaseUtills extends PageObject {
	JavascriptExecutor executor;
	WebDriverWait wait;

	public void scrollToClickAnelement(WebElementFacade element) {
		executor = (JavascriptExecutor) getDriver();
		executor.executeScript("arguments[0].click();", element);
	}

	public void scrollUP(WebElementFacade element) {
		executor = (JavascriptExecutor) getDriver();
		executor.executeScript("window.scrollBy(0,-1250)", "");
	}

	public void scrollUPSmall(WebElementFacade element) {
		executor = (JavascriptExecutor) getDriver();
		executor.executeScript("window.scrollBy(0,-450)", "");
	}

	public void scrollDown(WebElementFacade element) {
		executor = (JavascriptExecutor) getDriver();
		executor.executeScript("window.scrollBy(0,250)", "");

	}

	public void scrollDownLarge(WebElementFacade element) {
		executor = (JavascriptExecutor) getDriver();
		executor.executeScript("window.scrollBy(0,1225)", "");

	}

	public void scrollToFocusAnelement(WebElementFacade element) {
		executor = (JavascriptExecutor) getDriver();
		executor.executeScript("document.getElementById('elementid').focus();");
	}

	public boolean isClickable(WebElementFacade element) throws ElementClickInterceptedException {
		try {
			wait.until(ExpectedConditions.elementToBeClickable(element));
			return true;
		} catch (Exception ElementClickInterceptedException) {
			return false;
		}
	}

	public boolean isElementVisible(WebElementFacade element) throws ElementNotVisibleException {

		try {
			executor = (JavascriptExecutor) getDriver();
			wait = new WebDriverWait(getDriver(), 90000);
			executor.executeScript("arguments[0].scrollIntoView(true);", element);
			wait.until(ExpectedConditions.visibilityOf(element));
			return true;
		} catch (Exception ElementNotVisibleException) {
			return false;
		}
	}

	public String findInDDL(List<WebElementFacade> DDL_values, String key) {
		List<WebElementFacade> list = DDL_values;

		String KEY = null;

		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getText().equals(key)) {

				KEY = list.get(i).getText();
				break;
			}
		}
		return KEY;
	}

	public void selectFromDDL(List<WebElementFacade> DDL_values, String name) {
		try {
			if (findInDDL(DDL_values, name).equals(name)) {
				List<WebElementFacade> list = DDL_values;
				for (WebElementFacade element : list) {
					if (element.getText().equals(name)) {
						element.click();
					}
				}

			} else
				System.out.println(name + "- Value Not present in DDL");
		} catch (Exception e) {
			System.out.println(name + "- Value Not present in DDL.");
		}

	}
}
