package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	@FindBy(id = "email")
	WebElement emailLogin;

	@FindBy(id = "SubmitLogin")
	WebElement btnLogin;

	@FindBy(id = "passwd")
	WebElement passLogin;

	WebDriver driver;

	// Cái class này hàm khởi tạo Object (constructor) có 1 tham số chính là driver.
	// Nếu không có tham số này sẽ báo lỗi.
	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void Login(String email, String pass) {
		emailLogin.sendKeys(email);
		passLogin.sendKeys(pass);
		btnLogin.click();
	}

}
