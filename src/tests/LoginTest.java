package tests;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;

import pages.DashboardPage;
import pages.LoginPage;

public class LoginTest extends BaseTest {
	LoginPage loginPg;
	DashboardPage dashboardPg;

	@Test
	public void loginWithCorrect() {
		loginPg = new LoginPage(driver);
		dashboardPg = new DashboardPage(driver);
		loginPg.Login("ledinh.94d@gmail.com", "123456");
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		System.out.println("URL currentcy: " + driver.getCurrentUrl());
		System.out.println(dashboardPg.isDisplayed());
		// Assert.assertTrue(dashboardPg.isDisplayed());
	}

	/*
	 * @Test public void loginWithEmailEmpty() { loginPg = new
	 * LoginPracticePage(driver); loginPg.Login("", "123456");
	 * driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS); String
	 * emailErrMes = driver.findElement(By.cssSelector(".alert>ol>li")).getText();
	 * System.out.println("Email messenger error : " + emailErrMes);
	 * Assert.assertEquals(emailErrMes, "An email address required.");
	 * 
	 * }
	 * 
	 * @Test public void LoginWithPassEmpty() { loginPg = new
	 * LoginPracticePage(driver); loginPg.Login("ledinh.94d@gmail.com", "");
	 * driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS); String
	 * emailErrMes = driver.findElement(By.cssSelector(".alert>ol>li")).getText();
	 * System.out.println("Email messenger error : " + emailErrMes);
	 * Assert.assertEquals(emailErrMes, "Password is required.");
	 * 
	 * }
	 * 
	 * @Test public void LoginWithBlankField() { loginPg = new
	 * LoginPracticePage(driver); loginPg.Login("", "");
	 * driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS); String
	 * emailErrMes = driver.findElement(By.cssSelector(".alert>ol>li")).getText();
	 * System.out.println("Email messenger error : " + emailErrMes);
	 * Assert.assertEquals(emailErrMes, "An email address required."); }
	 * 
	 * @Test public void LoginWithEmailInCorrect() { loginPg = new
	 * LoginPracticePage(driver); loginPg.Login("ledinh.94@gmail.com", "123456");
	 * driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS); String
	 * emailErrMes = driver.findElement(By.cssSelector(".alert>ol>li")).getText();
	 * System.out.println("Email messenger error : " + emailErrMes);
	 * Assert.assertEquals(emailErrMes, "Authentication failed."); }
	 * 
	 * @Test public void LoginWithPassInCorrect() { loginPg = new
	 * LoginPracticePage(driver); loginPg.Login("ledinh.94@gmail.com", "123456");
	 * driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS); String
	 * emailErrMes = driver.findElement(By.cssSelector(".alert>ol>li")).getText();
	 * System.out.println("Email messenger error : " + emailErrMes);
	 * Assert.assertEquals(emailErrMes, "Authentication failed."); }
	 * 
	 * @Test public void LoginWithEmailInvalid() { loginPg = new
	 * LoginPracticePage(driver); loginPg.Login("ledinh.94gmail.com", "123456");
	 * driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS); String
	 * emailErrMes = driver.findElement(By.cssSelector(".alert>ol>li")).getText();
	 * System.out.println("Email messenger error : " + emailErrMes);
	 * Assert.assertEquals(emailErrMes, "Invalid email address."); }
	 * 
	 * @Test // Pass Five characters minimum public void LoginWithPassInvalid() {
	 * loginPg = new LoginPracticePage(driver);
	 * loginPg.Login("ledinh.94d@gmail.com", "1234");
	 * driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS); String
	 * emailErrMes = driver.findElement(By.cssSelector(".alert>ol>li")).getText();
	 * System.out.println("Email messenger error : " + emailErrMes);
	 * Assert.assertEquals(emailErrMes, "Invalid password."); }
	 */

}
