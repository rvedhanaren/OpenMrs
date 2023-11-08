package com.runner;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.base.Base_Class;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "C:\\Users\\HP\\eclipse-workspace\\Open_Mrs",
glue = "com.stefdefinition"
,plugin = {"html:Reports/OpenMrs.html",
		"pretty","com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:", 
		"json:Reports/JsonFile.json"})
public class OpenMrsRunner {

	
	public static WebDriver driver;
	
	
	@BeforeClass
	public static void webLaunch() {

		driver = Base_Class.launchBrowser("chrome");
	}
	@AfterClass
	public static void Quit() {
	driver.quit();
	}
	}



