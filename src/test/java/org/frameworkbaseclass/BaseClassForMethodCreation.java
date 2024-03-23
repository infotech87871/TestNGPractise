package org.frameworkbaseclass;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClassForMethodCreation {

	public static WebDriver driver;
	public static Actions a;
	public static Robot r;
	public static Select s;
	public static JavascriptExecutor js;
	public static TakesScreenshot ts;
	public static ChromeOptions co;

//WebDriver Methods----------------------------------------	
	// 1
	public static void chromeOptMaxWind() {
		co = new ChromeOptions();
		co.addArguments("--start-maximized");
		co.setExperimentalOption("excludeSwitches", new String[] { "enable-automation" });
		driver = new ChromeDriver(co);
	}
	// 1.1
	public static void chromeOptSetExperi() {
		co = new ChromeOptions();
		co.setExperimentalOption("excludeSwitches", new String[] { "enable-automation" });
		driver = new ChromeDriver(co);
	}
	// 1.2
	public static void edgeBrowser() {
		WebDriverManager.edgedriver().setup();
		driver = new EdgeDriver();
	}
	// 1.3
	public static void chromeBrowser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	}
	//1.4
	public static void firefoxBrowser() {
		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();
	}
	// 2
	public static void launchUrl(String url) {
		driver.get(url);
	}

	// 3
	public static void maximizeWindow() {
		driver.manage().window().maximize();
	}

	// 4
	public static void getTitle() {
		String title = driver.getTitle();
		System.out.println(title);
	}

	// 5
	public static void getCurrentUrl() {
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
	}

	// 6
	public static void closeBrowser() {
		driver.close();
	}

	// 7
	public static void sendKeys(WebElement elementName, String value) {
		elementName.sendKeys(value);
	}

	// 8
	public static void buttonClick(WebElement elementName) {
		elementName.click();
	}

//Actions Class Methods------------------------------------------------------
	// 9
	public static void moveToElement(WebElement element) {
		a = new Actions(driver);
		a.moveToElement(element).perform();
	}

	// 10
	public static void dragAndDrop(WebElement src, WebElement des) {
		a = new Actions(driver);
		a.dragAndDrop(src, des).perform();
	}

	public static void copy() throws AWTException {
		r = new Robot();
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_C);
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_C);
	}

//From this Task-------------------------------------------------------------------

	// Not Working--------------------------
	public static void webElementFind(WebElement element, String path) {
		element = driver.findElement(By.id(path));
	}
	// 11
	public static void getText(WebElement element) {
		String text = element.getText();
		System.out.println(text);
	}
//Doubt
	// 12
	public static void getAttributeValue(WebElement element) {
		String attribute = element.getAttribute("value");
		System.out.println(attribute);
	}
//Doubt
	// 13
	public static void getAttributeplaceholder(WebElement element) {
		String attribute = element.getAttribute("placeholder");
		System.out.println(attribute);
	}
	// 14
	public static void doubleClick(WebElement element) {
		a = new Actions(driver);
		a.doubleClick(element).perform();
	}
	// 15
	public static void contextClick(WebElement element) {
		a = new Actions(driver);
		a.contextClick(element).perform();
	}
//Doubt
	// 16
	public static void keyDown(Keys key) {
		a = new Actions(driver);
		a.keyDown(key).perform();
	}
//Doubt
	// 17
	public static void keyUp(Keys key) {
		a = new Actions(driver);
		a.keyUp(key).perform();
	}
//Select Class Methods----------------------------------------------
	// 18
	public static void threadSleep() throws InterruptedException {
		Thread.sleep(1000);
	}
	// 19
	public static void selectByValue(WebElement element, String value) {
		s = new Select(element);
		s.selectByValue(value);
	}
	// 20
	public static void selectByIndex(WebElement element, int index) {
		s = new Select(element);
		s.selectByIndex(index);
	}
	// 21
	public static void selectByVisibleText(WebElement element, String visibleText) {
		s = new Select(element);
		s.selectByVisibleText(visibleText);
	}
	// 22
	public static void isMultiple(WebElement element) {
		s = new Select(element);
		boolean multiple = s.isMultiple();
	}
	// 23
	public static void getAllOptions(WebElement element) {
		s = new Select(element);
		List<WebElement> allOptions = s.getOptions();
		System.out.println("All Options in DropDown : ");
		for (WebElement allOpt : allOptions) {
			String allText = allOpt.getText();
			System.out.println(allText);
		}
	}
	// 24
	public static void getAllSelectedOptions(WebElement element) 
	{
		s = new Select(element);
		List<WebElement> selectedOptions = s.getAllSelectedOptions();
		System.out.println("All Selected Options in DropDown : ");
		for (WebElement selecOpt : selectedOptions) {
			String SelectedText = selecOpt.getText();
			System.out.println(SelectedText);     
		} 
	}
	// 25
	public static void getFirstSelectedOption(WebElement element) 
	{
		s = new Select(element);
		System.out.println("First Selected Option in DropDown : ");
		WebElement firstSelectedOption = s.getFirstSelectedOption();
		System.out.println(firstSelectedOption.getText());
	}
	// 26
	public static void deselectByValue(WebElement element, String value) {
		s = new Select(element);
		s.deselectByValue(value);
	}
	// 27
	public static void deselectByIndex(WebElement element, int index) {
		s = new Select(element);
		s.deselectByIndex(index);
	}
	// 28
	public static void deselectByVisibleText(WebElement element, String visibleText) {
		s = new Select(element);
		s.deselectByVisibleText(visibleText);	
	}
	// 29
	public static void deselectAll(WebElement element) {
		s = new Select(element);
		s.deselectAll();
	}
//Robot Class Methods-----------------------------------------------
	// 30
	public static void paste() throws AWTException {
		r = new Robot();
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_V);
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_V);
	}
	// 31
	public static void cut() throws AWTException {
		r = new Robot();
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_X);
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_X);
	}
	// 31a
	public static void enter() throws AWTException {
		r = new Robot();
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
	}
//Javasript Executor Methods------------------------------------
	//32 
//Mistake in Passing	
	public static void executeScriptSendkeys(WebElement element, String str) {
		js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].setAttribute('value', str)", element);
	}
	// 33
	public static void executeScriptClick(WebElement element) {
		js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click()", element);
	}
	// 34 
	// 35
//Navigation scrollup,scrolldown-----------------------------------
	//36
	public static void scrollDown(WebElement element) 
	{
		js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true)", element);
	}
	//37
	public static void scrollUp(WebElement element) 
	{
		js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(false)", element);
	}
//Navigation Commands---------------------------------------------
	// 38
	public static void navigateTo(String url) 
	{
		driver.navigate().to(url);
	}
	// 39
	public static void navigateForward() 
	{
		driver.navigate().forward();
	}
	// 40
	public static void navigateBackward() 
	{
		driver.navigate().back();
	}
	// 41
	public static void navigateRefresh() 
	{
		driver.navigate().refresh();
	}
//Screenshot-------------------------------------------------	
	// 42
	public static void screenShot(String path) throws IOException {
		ts = (TakesScreenshot)driver;
		File screenshotFile = ts.getScreenshotAs(OutputType.FILE);
		File destinationFolder = new File(path);
		FileUtils.copyFile(screenshotFile, destinationFolder);
	}
//Visibility Check Methods-------------------------------------
	// 43
	public static void isDisplayed(WebElement element) 
	{
		boolean displayed = element.isDisplayed();
		System.out.println(displayed);
	}
	// 44
	public static void isEnabled(WebElement element) 
	{
		boolean enabled = element.isEnabled();
		System.out.println(enabled);
	}
	//45
	public static void isSelected(WebElement element) 
	{
		boolean selected = element.isSelected();
		System.out.println(selected);
	}

	
	
	
	
	
	
	
	
	
	
	
	

}
