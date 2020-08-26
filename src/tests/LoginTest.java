package tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import pages.DashboardPage;
import pages.LoginPage;

public class LoginTest extends BaseTest {
	LoginPage loginPg;
	DashboardPage dashboardPg;
	String errorMess = ".alert>ol>li";

	@Test
	public void loginWithCorrect() {
		loginPg = new LoginPage(driver);
		dashboardPg = new DashboardPage(driver);
		loginPg.Login("ledinh.94d@gmail.com", "123456");
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		Assert.assertTrue(dashboardPg.isDisplayed());
	}

	@Test
	public void loginWithEmailEmpty() {
		loginPg = new LoginPage(driver);
		dashboardPg = new DashboardPage(driver);
		loginPg.Login("", "123456");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		String errMessCur = driver.findElement(By.cssSelector(errorMess)).getText();
		System.out.println("TC_02 Messenger error : " + errMessCur);
		Assert.assertEquals(errMessCur, "An email address required.");
		Assert.assertFalse(dashboardPg.isDisplayed());
	}

	@Test
	public void LoginWithPassEmpty() {
		loginPg = new LoginPage(driver);
		dashboardPg = new DashboardPage(driver);
		loginPg.Login("ledinh.94d@gmail.com", "");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		String errMessCur = driver.findElement(By.cssSelector(errorMess)).getText();
		System.out.println("TC_03 Messenger error : " + errMessCur);
		Assert.assertEquals(errMessCur, "Password is required.");
		Assert.assertFalse(dashboardPg.isDisplayed());
	}

	@Test
	public void LoginWithBlankField() {
		loginPg = new LoginPage(driver);
		dashboardPg = new DashboardPage(driver);
		loginPg.Login("", "");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		String errMessCur = driver.findElement(By.cssSelector(errorMess)).getText();
		System.out.println("TC_04 Messenger error : " + errMessCur);
		Assert.assertEquals(errMessCur, "An email address required.");
		Assert.assertFalse(dashboardPg.isDisplayed());
	}

	@Test
	public void LoginWithEmailInCorrect() {
		loginPg = new LoginPage(driver);
		dashboardPg = new DashboardPage(driver);
		loginPg.Login("ledinh.94@gmail.com", "123456");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		String errMessCur = driver.findElement(By.cssSelector(errorMess)).getText();
		System.out.println("TC_05 Messenger error : " + errMessCur);
		Assert.assertEquals(errMessCur, "Authentication failed.");
		Assert.assertFalse(dashboardPg.isDisplayed());
	}

	@Test
	public void LoginWithEmailInvalid() {
		loginPg = new LoginPage(driver);
		dashboardPg = new DashboardPage(driver);
		loginPg.Login("ledinh.94gmail.com", "123456");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		String errMessCur = driver.findElement(By.cssSelector(errorMess)).getText();
		System.out.println("TC_07 Messenger error : " + errMessCur);
		Assert.assertEquals(errMessCur, "Invalid email address.");
		Assert.assertFalse(dashboardPg.isDisplayed());
	}

	@Test // Pass Five characters minimum
	public void LoginWithPassInvalid() {
		loginPg = new LoginPage(driver);
		dashboardPg = new DashboardPage(driver);
		loginPg.Login("ledinh.94d@gmail.com", "1234");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		String errMessCur = driver.findElement(By.cssSelector(errorMess)).getText();
		System.out.println("TC_08 Messenger error : " + errMessCur);
		Assert.assertEquals(errMessCur, "Invalid password.");
		Assert.assertFalse(dashboardPg.isDisplayed());
	}
	
	@Test
	public void LoginWithPassInCorrect() {
		loginPg = new LoginPage(driver);
		dashboardPg = new DashboardPage(driver);
		loginPg.Login("ledinh.94@gmail.com", "123456");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		String errMessCur = driver.findElement(By.cssSelector(errorMess)).getText();
		System.out.println("TC_06 Messenger error : " + errMessCur);
		Assert.assertEquals(errMessCur, "Authentication failed.");
		Assert.assertFalse(dashboardPg.isDisplayed());
	}

}
