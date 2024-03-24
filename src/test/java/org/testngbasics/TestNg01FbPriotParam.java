package org.testngbasics;

import org.frameworkbaseclass.BaseClassForMethodCreation;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNg01FbPriotParam extends BaseClassForMethodCreation {

	@Test(priority = -5)
	public static void lauchingBrowser() {
		firefoxBrowser();
		maximizeWindow();
		launchUrl("https://www.facebook.com/");
	}
	@Parameters({"usernme"})
	@Test(priority = -4)
	public static void enterUsername(@Optional("asasakbarsha7676@gmail.com")String email1) {
		WebElement email = driver.findElement(By.xpath("//input[@name='email']"));
		sendKeys(email, email1);
	}
	@Parameters({"password"})
	public static void enterPass(String pass1) {
		WebElement pass = driver.findElement(By.cssSelector("input[type='password']"));
		sendKeys(pass, pass1);
	}
	//@Test(priority = -2)
	public static void getTit() {
		 String title = driver.getTitle();
		 Assert.assertEquals("insta", title);
	}
	@Test(priority = -1)
	public static void clickLoginBtn() {
		WebElement btnClick = driver.findElement(By.cssSelector("button[class='_42ft _4jy0 _6lth _4jy6 _4jy1 selected _51sy']"));
		buttonClick(btnClick);
	}
	@Test(priority = 0)public static void closeTheBrowser() {
		closeBrowser();
	}
}
