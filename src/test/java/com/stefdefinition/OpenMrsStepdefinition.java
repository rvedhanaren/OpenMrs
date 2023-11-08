package com.stefdefinition;

import java.awt.AWTException;
import java.io.IOException;

import org.openqa.selenium.WebElement;

import com.base.Base_Class;
import com.properties.FileReaderManager;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class OpenMrsStepdefinition extends Base_Class {

	public static com.poma.PageObjectManager pom = new com.poma.PageObjectManager(driver);

	@Given("user Must Launch The Url")
	public void user_must_launch_the_url() throws IOException {
		String url = FileReaderManager.getInstanceFileReaderManager().getInstanceConfiguration().geturl();
		launchUrl(url);
		waitImplicitly(30);
	}

	@When("user Must Enter The Valid Username In User Name Field")
	public void user_must_enter_the_valid_username_in_user_name_field() throws IOException {
		String getusername = FileReaderManager.getInstanceFileReaderManager().getInstanceConfiguration().getusername();
		passInput(pom.getLoginPage().getUsername(), getusername);
	}

	@When("user Must Enter The Valid Password In Password Field")
	public void user_must_enter_the_valid_password_in_password_field() throws IOException {
		String getpassword = FileReaderManager.getInstanceFileReaderManager().getInstanceConfiguration().getpassword();
		passInput(pom.getLoginPage().getPassword(), getpassword);

	}

	@Then("user Able to Select The Location")
	public void user_able_to_select_the_location() {
		clickButton(pom.getLoginPage().getLoclick());
	}

	@Then("user Must Clik The Login Button and its Navigate to Home Page")
	public void user_must_clik_the_login_button_and_its_navigate_to_home_page() throws IOException {
		clickButton(pom.getLoginPage().getLogclick());
		screenShot("C:\\Users\\HP\\eclipse-workspace\\Open_Mrs\\Screen\\log.png");
	}

	@Then("verify dash Board Pages Redirected")
	public void verify_dash_board_pages_redirected() {
		String tiltle = getTiltle();
		assertTestString("Home", tiltle);
		assertTest("admin", pom.getHomePage().getadmin());
		assertTest("Outpatient Clinic", pom.getHomePage().getoutpatient());
	}

	@When("must Click a Regiser a Patient Menu")
	public void must_click_a_regiser_a_patient_menu() throws IOException {
		clickButton(pom.getHomePage().getregister());
screenShot("C:\\Users\\HP\\eclipse-workspace\\Open_Mrs\\Screen\\reg.png");
	}

	@When("user Must Enter The Patient Given Name Family Name and then Click The Next Button")
	public void user_must_enter_the_patient_given_name_family_name_and_then_click_the_next_button() throws IOException {
		String gname = FileReaderManager.getInstanceFileReaderManager().getInstanceConfiguration().getgname();
		passInput(pom.getHomePage().getGname(), gname);
		String fname = FileReaderManager.getInstanceFileReaderManager().getInstanceConfiguration().getfname();
		passInput(pom.getHomePage().getFname(), fname);
		clickButton(pom.getHomePage().getNext());
		screenShot("C:\\Users\\HP\\eclipse-workspace\\Open_Mrs\\Screen\\next.png");
	}

	@When("user Must Select The Patient Gender then Click The Next Button")
	public void user_must_select_the_patient_gender_then_click_the_next_button() {
		clickButton(pom.getHomePage().getMale());
		clickButton(pom.getHomePage().getNext());
	}

	@When("user Must Enter The Patient Date Of Birth then Click The Next Button")
	public void user_must_enter_the_patient_date_of_birth_then_click_the_next_button() throws IOException {
		String day = FileReaderManager.getInstanceFileReaderManager().getInstanceConfiguration().getgdate();
		passInput(pom.getHomePage().getDay(), day);
		String month = FileReaderManager.getInstanceFileReaderManager().getInstanceConfiguration().getmonth();
		passInput(pom.getHomePage().getMonth(), month);
		String year = FileReaderManager.getInstanceFileReaderManager().getInstanceConfiguration().getyear();
		passInput(pom.getHomePage().getYear(), year);
		clickButton(pom.getHomePage().getNext());
screenShot("C:\\Users\\HP\\eclipse-workspace\\Open_Mrs\\Screen\\user.png");
	}

	@When("user Must Enter The Patient Address then Click The Next Button")
	public void user_must_enter_the_patient_address_then_click_the_next_button() throws IOException {
		String address = FileReaderManager.getInstanceFileReaderManager().getInstanceConfiguration().getaddress();
		passInput(pom.getHomePage().getAddress(), address);
		String state = FileReaderManager.getInstanceFileReaderManager().getInstanceConfiguration().getstate();
		passInput(pom.getHomePage().getState(), state);
		String city = FileReaderManager.getInstanceFileReaderManager().getInstanceConfiguration().getcity();
		passInput(pom.getHomePage().getCity(), city);
		String county = FileReaderManager.getInstanceFileReaderManager().getInstanceConfiguration().getcountry();
		passInput(pom.getHomePage().getCountry(), county);
		String pin = FileReaderManager.getInstanceFileReaderManager().getInstanceConfiguration().getpin();
		passInput(pom.getHomePage().getPin(), pin);
		clickButton(pom.getHomePage().getNext());
		screenShot("C:\\Users\\HP\\eclipse-workspace\\Open_Mrs\\Screen\\src.png");
	}

	@When("user Must Enter The Patient Phone number then Click The Next Button")
	public void user_must_enter_the_patient_phone_number_then_click_the_next_button() throws IOException {
		String mobilenum = FileReaderManager.getInstanceFileReaderManager().getInstanceConfiguration().getmobile();
		passInput(pom.getHomePage().getMobile(), mobilenum);
		clickButton(pom.getHomePage().getNext());
		
	}

	@When("user Must Click The Next Button")
	public void user_must_click_the_next_button() {
		clickButton(pom.getHomePage().getNext());
	}

	@Then("user Must Click The Conffirm Button")
	public void user_must_click_the_conffirm_button() {
		clickButton(pom.getHomePage().getConfirm());
	}

	@Given("user Must Click The Start Visit Option one")
	public void user_must_click_the_start_visit_option_one() {
		clickButton(pom.getMedicalRecordPage().getStart());
		
	}

	@When("user Must Click The Confirm Button one")
	public void user_must_click_the_confirm_button_one() {
		clickButton(pom.getMedicalRecordPage().getConfirm());
	}

	@When("user Must Click The Attachment Option")
	public void user_must_click_the_attachment_option() throws IOException {
		clickButton(pom.getMedicalRecordPage().getAttach());
		screenShot("C:\\Users\\HP\\eclipse-workspace\\Open_Mrs\\Screen\\att.png");
	}

	@When("user Must Click The Upload File Button")
	public void user_must_click_the_upload_file_button() throws AWTException, IOException {
		clickButton(pom.getMedicalRecordPage().getDrop());
		fileUpload("‪Downloads\\VedhaR_CV.pdf");
		robot();
		String message = FileReaderManager.getInstanceFileReaderManager().getInstanceConfiguration().getmessage();
		passInput(pom.getMedicalRecordPage().getCaption(), message);
		clickButton(pom.getMedicalRecordPage().getUpload());
		screenShot("C:\\Users\\HP\\eclipse-workspace\\Open_Mrs\\Screen\\fill.png");
	}

	@When("user Must Redirect to Patient details Screen one")
	public void user_must_redirect_to_patient_details_screen_one() {
		clickButton(pom.getMedicalRecordPage().getVedha());
	}

	@When("user Must Click On End Visit Option")
	public void user_must_click_on_end_visit_option() {
		clickButton(pom.getMedicalRecordPage().getEnd());
		clickButton(pom.getMedicalRecordPage().getYes());
	}

	@When("user Must Click The Start Visit Option two")
	public void user_must_click_the_start_visit_option_two() {
		clickButton(pom.getMedicalRecordPage().getStartvisit());
	}

	@Then("user Must Click The Confirm Button two")
	public void user_must_click_the_confirm_button_two() {
		clickButton(pom.getMedicalRecordPage().getConfirm1());
	}

	@Then("user Must Click The Capture Vitalas Option")
	public void user_must_click_the_capture_vitalas_option() {
		clickButton(pom.getMedicalRecordPage().getCapture());
	}

	@Then("user Must Enter The Height in Height Field")
	public void user_must_enter_the_height_in_height_field() throws IOException {
		String height = FileReaderManager.getInstanceFileReaderManager().getInstanceConfiguration().getheight();
		passInput(pom.getMedicalRecordPage().getHeight(), height);
	}

	@Then("user Must Click The next Button three")
	public void user_must_click_the_next_button_three() throws IOException {
		clickButton(pom.getMedicalRecordPage().getNext());
	}

	@Then("user Must Enter The Weight in Weight Field")
	public void user_must_enter_the_weight_in_weight_field() throws IOException {
		String weight = FileReaderManager.getInstanceFileReaderManager().getInstanceConfiguration().getweight();
		passInput(pom.getMedicalRecordPage().getWeight(), weight);
		clickButton(pom.getMedicalRecordPage().getNext());
		screenShot("C:\\Users\\HP\\eclipse-workspace\\Open_Mrs\\Screen\\medical.png");

	}

	@Then("user Must Click The next Button Four")
	public void user_must_click_the_next_button_four() {
		clickButton(pom.getMedicalRecordPage().getNext());

	}

	@Then("user Must Click The Save Form Option And Then Click Save Button")
	public void user_must_click_the_save_form_option_and_then_click_save_button() {
		clickButton(pom.getMedicalRecordPage().getSaveform());
		clickButton(pom.getMedicalRecordPage().getSave());
	}

	@Then("user Must Click The End Visit Option and Then click The Yes Button")
	public void user_must_click_the_end_visit_option_and_then_click_the_yes_button() {
		clickButton(pom.getMedicalRecordPage().getEndvisit());
		clickButton(pom.getMedicalRecordPage().getYesbut());
	}

	@Then("user Must Redirect to Patient details Screen two")
	public void user_must_redirect_to_patient_details_screen_two() {
		reFresh();
		clickButton(pom.getMedicalRecordPage().getR());
	}

	@Then("user Must Click The Merge Visit Option and Select The Merge List")
	public void user_must_click_the_merge_visit_option_and_select_the_merge_list() throws IOException {
		clickButton(pom.getMedicalRecordPage().getMerge());
		clickButton(pom.getMedicalRecordPage().getTick());
		clickButton(pom.getMedicalRecordPage().getTick1());
		screenShot("C:\\Users\\HP\\eclipse-workspace\\Open_Mrs\\Screen\\merge.png");
	}

	@Then("user Must Click The Merge Selected Visit and Click The Return Page")
	public void user_must_click_the_merge_selected_visit_and_click_the_return_page() {
		clickButton(pom.getMedicalRecordPage().getMergeselect());
		clickButton(pom.getMedicalRecordPage().getReturn1());
		clickButton(pom.getMedicalRecordPage().getAddpast());
		jsClick(pom.getMedicalRecordPage().getClick());
	}

	@Then("user Must Click The Add Past Visit then Click The Cancel Button")
	public void user_must_click_the_add_past_visit_then_click_the_cancel_button() {
		clickButton(pom.getMedicalRecordPage().getCancel());
	}

	@Then("user Must Click The Delete Patient Option")
	public void user_must_click_the_delete_patient_option() {
		clickButton(pom.getMedicalRecordPage().getDelet());
	}

	@Then("user Must Give The Reason And Then Click Confirm Button")
	public void user_must_give_the_reason_and_then_click_confirm_button() throws IOException {
		String reson = FileReaderManager.getInstanceFileReaderManager().getInstanceConfiguration().gettextmessage();
		waitImplicitly(40);
		passInput(pom.getMedicalRecordPage().getReson(), reson);
		clickButton(pom.getMedicalRecordPage().getConfirm2());
		screenShot("C:\\Users\\HP\\eclipse-workspace\\Open_Mrs\\Screen\\reasonbt.png");
	}
	@Then("user Must Pass the Patient Id In Find Patient Record Search box")
	public void user_must_pass_the_patient_id_in_find_patient_record_search_box() throws IOException {
	String newtext = getTex(pom.getMedicalRecordPage().getString());
	passInput(pom.getMedicalRecordPage().getSearch(),newtext);
	screenShot("C:\\Users\\HP\\eclipse-workspace\\Open_Mrs\\Screen\\last.png");
	}

}
