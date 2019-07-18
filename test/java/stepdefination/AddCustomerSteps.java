package stepdefination;

import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.Alert;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;
import objectrepository.AddCustomerPage;

public class AddCustomerSteps {

	@When("the user fill in invalid customer details")
	public void the_user_fill_in_invalid_customer_details(DataTable customerDetails) {
		AddCustomerPage addcust = new AddCustomerPage();

		Map<String, String> customerDetailsMap = customerDetails.asMap(String.class, String.class);
		addcust.getRdo_done().click();
		addcust.getTxt_fname().sendKeys(customerDetailsMap.get("firstName"));
		addcust.getTxt_lname().sendKeys(customerDetailsMap.get("lastName"));
		addcust.getTxt_email().sendKeys(customerDetailsMap.get("emailAdress"));
		addcust.getTxt_adress().sendKeys(customerDetailsMap.get("adress"));
		addcust.getTxt_phnum().sendKeys(customerDetailsMap.get("phoneNum"));

	}

	@When("the user clicks the submit button")
	public void the_user_clicks_the_submit_button() {
		AddCustomerPage addcust = new AddCustomerPage();
		addcust.getBtn_submit().click();
	}
	@Then("the user should see error alert message")
	public void the_user_should_see_error_alert_message() {
	   Alert a=Hooks.driver.switchTo().alert();
	   a.accept();
	}
	
	@When("the user clicks the reset button")
	public void the_user_clicks_the_reset_button() {
	   AddCustomerPage addCust=new AddCustomerPage();
	   addCust.getReset().click();
	   
	}
	@Then("the user should see empty fields")
	public void the_user_should_see_empty_fields() {
		AddCustomerPage addCustept=new AddCustomerPage();
		//Assert.assertEquals('',addCustept.getTxt_fname().getAttribute('value'));
	}

	@Then("the error should see error popup message")
	public void the_error_should_see_error_popup_message() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
	}


}
