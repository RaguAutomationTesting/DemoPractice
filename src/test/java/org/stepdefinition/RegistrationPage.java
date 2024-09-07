package org.stepdefinition;

import java.util.List;

import org.baseclass.BaseClass;
import org.objectrepository.RegistrationPojo;
import org.openqa.selenium.WebElement;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

public class RegistrationPage extends BaseClass {
	
	RegistrationPojo rp = new RegistrationPojo();

	@Given("user launch naveen automation web page and lands on home page")
	public void user_launch_naveen_automation_web_page_and_lands_on_home_page() {
		laucnhBrowser("chrome");
		launchUrl("https://naveenautomationlabs.com/opencart/index.php?route=common/home");
		maximize();
		implicitlyWait();
	}

	@Given("user sees My account and clicks register")
	public void user_sees_My_account_and_clicks_register() {
		
		 rp = new RegistrationPojo();

		click(rp.getMyAccnt());
		
		implicitlyWait();
		
		click(rp.getRegister());
		
		
		
	}

	@Given("user sees registration page")
	public void user_sees_registration_page() {
		implicitlyWait();
		 rp = new RegistrationPojo();
		
		WebElement getregAcntSuccessMsg = rp.getRegAcntSuccessMsg();
		
		String text = getregAcntSuccessMsg.getText();
		
		Assert.assertTrue("user didnot land on Register Account page", text.equals("Register Account") );
		

	}

	@When("user enters valid details in registration page")
	public void user_enters_valid_details_in_registration_page() {
		 rp = new RegistrationPojo();
		
		enterTxt(rp.getFirstName(), "Ragu");
		enterTxt(rp.getLstName(), "raaa");
		enterTxt(rp.getEmail(), "raguram2383@gmail.com");
		enterTxt(rp.getTelePhn(), "767683476");
		enterTxt(rp.getPwd(), "RaguWEe");
		enterTxt(rp.getCnfrmPwd(), "RaguWEe");
		List<WebElement> nwsLtr = rp.getNwsLtr();
		
		
		click(nwsLtr.get(0));
		
		

	}

	@When("user accepts privacy policy and clicks continue button")
	public void user_accepts_privacy_policy_and_clicks_continue_button() {
		 rp = new RegistrationPojo();

		click(rp.getChkBox());
		
		click(rp.getSbmt());

	}

	@Then("user sees account creation message")
	public void user_sees_account_creation_message() {
		 Assert.assertTrue("Account is Not created",rp.getAccntCreated().getText().equals("Your Account Has Been Created!"));

	}

	@Then("user clicks continue button and lands on his account page")
	public void user_clicks_continue_button_and_lands_on_his_account_page() {
		
		click(rp.getCntue());

	}

	@When("user enter invalid details in the registration page")
	public void user_enter_invalid_details_in_the_registration_page() {

	}

	@Then("user sees error message according to the invalid input he has given")
	public void user_sees_error_message_according_to_the_invalid_input_he_has_given() {

	}

}
