package com.poma;

import org.openqa.selenium.WebDriver;

import com.pom.HomePage;
import com.pom.LoginPage;
import com.pom.MedicalRecordPage;

public class PageObjectManager {
public WebDriver driver;
	
	private LoginPage lp;
	 

	public PageObjectManager(WebDriver driver2) {
		this.driver=driver2;
		
	}


	public LoginPage getLoginPage() {
		
		if (lp == null) {
			lp = new LoginPage(driver);
			
		}
		return lp;
	}	
private HomePage hp;	
public HomePage getHomePage() {
		
		if (hp == null) {
			hp = new HomePage(driver);
			
		}
		return hp;
	}	

private MedicalRecordPage mp;	
public MedicalRecordPage getMedicalRecordPage() {
		
		if (mp == null) {
			mp = new MedicalRecordPage(driver);
			
		}
		return mp;
	}	


}
