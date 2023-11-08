package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MedicalRecordPage {
	public WebDriver driver;
	@FindBy(xpath = "(//div[@class='col-11 col-lg-10'])[1]")
	private WebElement Start;
	
	@FindBy(id = "start-visit-with-visittype-confirm")
	private WebElement confirm;
	
	@FindBy(xpath = "(//a[@class='button task activelist'])[5]")
	private WebElement attach;
	
	@FindBy(xpath = "//div[text()='Click or drop a file here.']")
	private WebElement drop;
	
	@FindBy(xpath = "//textarea[@placeholder='Enter a caption']")
	private WebElement caption ;
	
	@FindBy(xpath = "//button[text()='Upload file']")
	private WebElement upload ;
	
	@FindBy(xpath = "(//i[@class='icon-home small']/following::a)[1]")
	private WebElement Vedha ;
	
	@FindBy(xpath = "//div[contains(text(),'                                    End Visit')]")
	private WebElement End ;
	
	@FindBy(xpath = "//span[contains(text(),'Are you sure you want to e')]/following::button[@class='confirm right']")
	private WebElement yes ;
	
	@FindBy(xpath = "//h3[text()='General Actions']/following::div[contains(text(),'                                            Start Visit')]")
	private WebElement startvisit ;
	
	@FindBy(xpath = "//p[contains(text(),'Are you sure you want to s')]/following::button[@class='confirm right']")
	private WebElement confirm1 ;
	
	@FindBy(xpath = "//a[text()=' Capture Vitals']")
	private WebElement Capture ;
	
	@FindBy(xpath = "//span[text()='cm']/preceding::input[@id='w8']")
	private WebElement height ;
	
	@FindBy(xpath = "//button[@id='next-button']")
	private WebElement next ;
	
	@FindBy(xpath = "//span[text()='kg']/preceding::input[@id='w10']")
	private WebElement weight ;
	
	
	@FindBy(xpath = "//a[@id='save-form']")
	private WebElement saveform ;
	
	@FindBy(xpath = "//button[@onclick='submitHtmlForm()']")
	private WebElement save ;
	
	@FindBy(xpath = "//a[text()=' End Visit']")
	private WebElement endvisit ;

	
	@FindBy(xpath = "(//button[text()='Yes'])[3]")
	private WebElement yesbut ;
	
	@FindBy(xpath = "//span[@class='PersonName-givenName']")
	private WebElement r ;
	
	@FindBy(xpath = "(//div[@class='col-11 col-lg-10'])[3]")
	private WebElement merge ;
	
	@FindBy(xpath = "(//input[@type='checkbox'])[1]")
	private WebElement tick ;
	
	@FindBy(xpath = "(//input[@type='checkbox'])[2]")
	private WebElement tick1 ;
	
	@FindBy(id = "mergeVisitsBtn")
	private WebElement mergeselect ;
	
	@FindBy(xpath = "//input[@value='Return']")
	private WebElement return1 ;
	
	@FindBy(xpath = "(//div[@class='col-11 col-lg-10'])[2]")
	private WebElement addpast ;
	
	@FindBy(xpath = "(//div[@class='dialog-content form'])[2]")
	private WebElement click ;
	
	@FindBy(xpath = "(//button[@class='cancel'])[7]")
	private WebElement cancel ;
	
	@FindBy(xpath = "(//div[@class='col-11 col-lg-10'])[8]")
	private WebElement delet ;
	
	public WebElement getStart() {
		return Start;
	}

	public WebElement getConfirm() {
		return confirm;
	}

	public WebElement getAttach() {
		return attach;
	}

	public WebElement getDrop() {
		return drop;
	}

	public WebElement getCaption() {
		return caption;
	}

	public WebElement getUpload() {
		return upload;
	}

	public WebElement getVedha() {
		return Vedha;
	}

	public WebElement getEnd() {
		return End;
	}

	public WebElement getYes() {
		return yes;
	}

	public WebElement getStartvisit() {
		return startvisit;
	}

	public WebElement getConfirm1() {
		return confirm1;
	}

	public WebElement getCapture() {
		return Capture;
	}

	public WebElement getHeight() {
		return height;
	}

	public WebElement getNext() {
		return next;
	}

	public WebElement getWeight() {
		return weight;
	}

	public WebElement getSaveform() {
		return saveform;
	}

	public WebElement getSave() {
		return save;
	}

	public WebElement getEndvisit() {
		return endvisit;
	}

	public WebElement getYesbut() {
		return yesbut;
	}

	public WebElement getR() {
		return r;
	}

	public WebElement getMerge() {
		return merge;
	}

	public WebElement getTick() {
		return tick;
	}

	public WebElement getTick1() {
		return tick1;
	}

	public WebElement getMergeselect() {
		return mergeselect;
	}

	public WebElement getReturn1() {
		return return1;
	}

	public WebElement getAddpast() {
		return addpast;
	}

	public WebElement getClick() {
		return click;
	}

	public WebElement getCancel() {
		return cancel;
	}

	public WebElement getDelet() {
		return delet;
	}

	public WebElement getString() {
		return string;
	}

	public WebElement getReson() {
		return reson;
	}

	public WebElement getConfirm2() {
		return confirm2;
	}

	public WebElement getSearch() {
		return search;
	}

	@FindBy(xpath = "//div[@class='float-sm-right']")
	private WebElement string ;
	
	@FindBy(xpath = "(//input[@type='text'])[5]")
	private WebElement reson ;
	
	@FindBy(xpath = "(//button[@class='confirm right'])[6]")
	private WebElement confirm2 ;
	
	@FindBy(xpath = "//input[@placeholder='Search by ID or Name']")
	private WebElement search ;
	
	public MedicalRecordPage(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver, this);
	}	
    }
