package objectrepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import stepdefination.Hooks;



public class AddTariffPlanPage {

	public WebElement getSucessmsg() {
		return sucessmsg;
	}

	public AddTariffPlanPage() {
		PageFactory.initElements(Hooks.driver, this);
	}

	@FindBy(name = "rental")
	private WebElement monthRent;

	@FindBy(name = "local_minutes")
	private WebElement freeloc_min;

	@FindBy(name = "inter_minutes")
	private WebElement freeinter_min;

	@FindBy(name = "sms_pack")
	private WebElement freesms;

	@FindBy(name = "minutes_charges")
	private WebElement localmin_char;

	@FindBy(name = "inter_charges")
	private WebElement int_char;

	@FindBy(name = "sms_charges")
	private WebElement sms_char;

	public WebElement getBtn_submit() {
		return btn_submit;
	}

	@FindBy(xpath="//section[@id='main']//h2")
	private WebElement sucessmsg;
	
	@FindBy(name="submit")
	private WebElement btn_submit;

	public WebElement getMonthRent() {
		return monthRent;
	}

	public WebElement getFreeloc_min() {
		return freeloc_min;
	}

	public WebElement getFreeinter_min() {
		return freeinter_min;
	}

	public WebElement getFreesms() {
		return freesms;
	}

	public WebElement getLocalmin_char() {
		return localmin_char;
	}

	public WebElement getInt_char() {
		return int_char;
	}

	public WebElement getSms_char() {
		return sms_char;
	}
	
	
}
