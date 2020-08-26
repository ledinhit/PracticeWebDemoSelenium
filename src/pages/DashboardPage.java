package pages;

import org.openqa.selenium.WebDriver;

import utilities.Links;

public class DashboardPage {

	WebDriver driver;

	public DashboardPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public boolean isDisplayed() {
		if (Links.URL_LOGIN_SUCCESS.equals(driver.getCurrentUrl())) {
			return true;
		} else {
			return false;
		}
	}
}
