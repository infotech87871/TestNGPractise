package org.testngbasics;

import org.frameworkbaseclass.BaseClassForMethodCreation;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNg02InstaSuite extends BaseClassForMethodCreation {

	@DataProvider(name = "TestData")
	private String[][] getData() {
		return new String[][] { 
			{ "asakbarshas12344@gmail.com", "12dfsa34" }, 
			{ "arun1234@gmail.com", "sziue7645" },
			{ "balaji2764657@gmail.com ", "876d" } };
	}
 
	@Test(priority = 1)
	public static void launchingBrowser() {
		edgeBrowser();
		maximizeWindow();
		launchUrl("https://www.instagram.com/");
	}

	// @Parameters({"username"})
	@Test(priority = 2, dataProvider = "TestData")
	public static void enterUser(String email1, String pass1) {
		WebElement email = driver.findElement(By.xpath("//input[@name='username']"));
		sendKeys(email, email1);
		WebElement pass = driver.findElement(By.cssSelector("input[type='password']"));
		sendKeys(pass, pass1);
		WebElement btnClick = driver.findElement(By.cssSelector("button[class=' _acan _acap _acas _aj1- _ap30']"));
		buttonClick(btnClick);
	}

	@Test(priority = 5)
	public static void closeeBrowser() {
		closeBrowser();
	}

}
