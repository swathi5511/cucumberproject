package stepdefination;

import cucumber.api.java.en.Given;
import objectrepository.HomePage;

public class HomePageSteps {
	
	@Given("the user is in add customer pag")
	public void x() {
		HomePage home = new HomePage();
		home.getLnk_addCustomer().click();

	}
	
	@Given("The user is in add tariff plan page")
	public void the_user_is_in_add_tariff_plan_page() {
		HomePage home = new HomePage();
		home.getLnk_addTariffPlan().click();
	}

}
