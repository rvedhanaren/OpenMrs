package com.base;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base_Class {
	
	public static WebDriver driver;
	
	
	public static WebDriver launchBrowser(String browsername) {	
	if (browsername.equalsIgnoreCase("chrome")) {
				
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	}
	else if (browsername.equalsIgnoreCase("firefox")) {
				
		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();
	}	
	else if (browsername.equalsIgnoreCase("edge")) {
		
		WebDriverManager.edgedriver().setup();
		driver = new EdgeDriver();
	}	
	driver.manage().window().maximize();
	return driver;
	}
	public static WebDriver launchUrl(String url) {
		driver.get(url);
	return driver;
	}
	public static void terminateBrowser() {
		driver.quit();
	}
	public static void passInput(WebElement element, String input) {
		element.sendKeys(input);
	}
	public static void clickButton(WebElement element) {
		element.click();
	}
	private static Select dropDownsObject(WebElement element) {
		Select s = new Select(element);
		return s;
	}
	public static void selectbyVisibletext(WebElement element, String sec) {
		dropDownsObject(element).selectByVisibleText(sec);
	}
	public static void screenShot(String loc) throws IOException {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File as = ts.getScreenshotAs(OutputType.FILE);
		File des = new File(loc);
		FileUtils.copyFile(as, des);
	}
	public static String getTex(WebElement element) {
		String text = element.getText();
		String newtext = text.substring(11);
		return newtext;
		
	}
	private static Robot robotObj() throws AWTException {
		Robot rt = new Robot();
		return rt;
	}	
	public static void robot() throws AWTException {
		robotObj().delay(2000);
		robotObj().keyPress(KeyEvent.VK_CONTROL);
		robotObj().keyPress(KeyEvent.VK_V);
		robotObj().keyRelease(KeyEvent.VK_V);
		robotObj().keyRelease(KeyEvent.VK_CONTROL);
		robotObj().keyPress(KeyEvent.VK_ENTER);
		robotObj().keyRelease(KeyEvent.VK_ENTER);
	}
	public static void jsClick(WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", element);
	}
	
	public static void fileUpload(String path) {
		StringSelection ss = new StringSelection(path);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
	}
	
	public static void assertTestString(String text , String element) {
		org.junit.Assert.assertEquals(text, element);
	}
	
	public static String getTiltle() {
		String title = driver.getTitle();
		return title;
	}
	public static void assertTest(String text , WebElement element) {
		org.junit.Assert.assertEquals(text, element.getText().trim());
	}
	public static void waitImplicitly(int time) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(time));
		
	}
	public static void reFresh() {
		driver.navigate().refresh();
	}
}
