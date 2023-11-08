package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	public WebDriver driver;

	@FindBy(id="username")
	private WebElement username;

	@FindBy(id="password")
	private WebElement password;

	@FindBy(id="Outpatient Clinic")
	private WebElement Loclick;
	
	@FindBy(id="loginButton")
	private WebElement Logclick;
	
	public LoginPage(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver, this);
	}

	public WebElement getUsername() {
		return username;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getLoclick() {
		return Loclick;
	}
	public WebElement getLogclick() {
		return Logclick;
	}
	}
	

