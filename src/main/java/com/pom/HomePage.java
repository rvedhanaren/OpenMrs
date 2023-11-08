package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	public WebDriver driver;
	@FindBy(xpath = "//li[@class='nav-item identifier']")
	private WebElement admin;

	@FindBy(xpath = "//li[@class='change-location']")
	private WebElement outpatient;
	
	@FindBy(xpath = "//i[@class='icon-user']")
	private WebElement register;
	
	@FindBy(name =  "givenName")
	private WebElement gname;
	
	@FindBy(name =  "familyName")
	private WebElement fname;
	
	@FindBy(id =  "next-button")
	private WebElement next;
	
	@FindBy(xpath = "//option[@value='M']")
	private WebElement male;
	
	@FindBy(id = "birthdateDay-field")
	private WebElement day;
	
	@FindBy(name = "birthdateMonth")
	private WebElement month;
	
	@FindBy(id = "birthdateYear-field")
	private WebElement year;
	
	@FindBy(id = "address1")
	private WebElement address;
	
	@FindBy(id =  "cityVillage")
	private WebElement city;
	
	@FindBy(id = "stateProvince")
	private WebElement state;
	
	@FindBy(id = "country")
	private WebElement country;
	
	@FindBy(id = "postalCode")
	private WebElement pin;
	
	
	@FindBy(name = "phoneNumber")
	private WebElement mobile;
	
	
	@FindBy(id = "submit")
	private WebElement confirm;
	
		public HomePage(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver, this);
	}
	public WebElement getadmin() {
		return admin;
	}
	
	public WebElement getoutpatient() {
		return outpatient;
}
	
	public WebElement getregister() {
		return register;
}
	public WebElement getGname() {
		return gname;
	}
	public WebElement getFname() {
		return fname;
	}
	public WebElement getNext() {
		return next;
	}
	public WebElement getMale() {
		return male;
	}
	public WebElement getDay() {
		return day;
	}
	public WebElement getMonth() {
		return month;
	}
	public WebElement getYear() {
		return year;
	}
	public WebElement getAddress() {
		return address;
	}
	public WebElement getCity() {
		return city;
	}
	public WebElement getState() {
		return state;
	}
	public WebElement getCountry() {
		return country;
	}
	public WebElement getPin() {
		return pin;
	}
	public WebElement getMobile() {
		return mobile;
	}
	public WebElement getConfirm() {
		return confirm;
	}

}