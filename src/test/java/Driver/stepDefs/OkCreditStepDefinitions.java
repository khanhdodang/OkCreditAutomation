package Driver.stepDefs;

import java.net.MalformedURLException;

import javax.security.auth.login.AccountException;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

import Driver.PropertyData;
import Driver.desiredCapabilities;
import ObjectRepository.AccountPage_OR;
import ObjectRepository.CustomerPage_OR;
import ObjectRepository.HamburgerMenu_OR;
import ObjectRepository.HomePage_OR;
import ObjectRepository.LandingPage_OR;
import PageObjects.CommonMethodsFunctions;
import Utility.Log;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class OkCreditStepDefinitions extends desiredCapabilities{

	
	PropertyData data = new PropertyData();
	CommonMethodsFunctions CF = new CommonMethodsFunctions();
	
	String customerName = CF.randomAlphaNumeric(5);
	String customerNumber = CF.randomNumber(10);
	
	
	/**
	 * Launching the APP under test - First step of Test Cases Execution
	 * @throws Throwable
	 */
	@Given("Launch the App$")
	public void launch_the_app() throws Throwable {

		Log.info("Launching the Application based on the Capabilities from the Driver file");
		System.out.println("Platform Name here is: " + driver.getCapabilities().getCapability("platformName"));
		

	}
	
	@And("^Verify the \"([^\"]*)\" Page$")
	public void verify_the_given_page(String Page) {
		
		if(Page.equals("Landing")){
			
			wait.until(ExpectedConditions.elementToBeClickable(LandingPage_OR.SelectLanguage)).isDisplayed();
			Assert.assertTrue(LandingPage_OR.SelectLanguage.isDisplayed());
			
		}
		else if(Page.equals("Welcome")){

			wait.until(ExpectedConditions.elementToBeClickable(LandingPage_OR.WelcomeToOkCred)).isDisplayed();
			Assert.assertTrue(LandingPage_OR.WelcomeToOkCred.isDisplayed());
			
		}
		else if(Page.equals("Mobile Number")){

			wait.until(ExpectedConditions.visibilityOf(LandingPage_OR.EnterMobileNumber)).isDisplayed();
			Assert.assertTrue(LandingPage_OR.MobileNumberField.isDisplayed());
			
		}
		
		else if(Page.equals("Password")){

			wait.until(ExpectedConditions.visibilityOf(LandingPage_OR.EnterPassword)).isDisplayed();
			Assert.assertTrue(LandingPage_OR.PasswordField.isDisplayed());
			
		}
		else if(Page.equals("Home")){

			wait.until(ExpectedConditions.visibilityOf(HomePage_OR.SearchCustomer)).isDisplayed();
			Assert.assertTrue(HomePage_OR.UserName.isDisplayed());
			
		}
		else if(Page.equals("Customer")){

			wait.until(ExpectedConditions.visibilityOf(AccountPage_OR.Customers)).isDisplayed();
			String CustomerCount = CustomerPage_OR.CustomerName.getText();
			System.out.println("The Noumber of Customer for the user here is :" + CustomerCount);
			Assert.assertEquals(CustomerCount, customerName);
			
		}
		else if(Page.equals("Account")){

			wait.until(ExpectedConditions.visibilityOf(AccountPage_OR.CustomerCOunt)).isDisplayed();
			String CustomerCount = AccountPage_OR.CustomerCOunt.getText();
			System.out.println("The New Customer here is :" + CustomerCount);
			
		}
		
	}
	
	@And("^Verify the list of \"([^\"]*)\"$")
	public void Verify_the_languages(String Language) throws MalformedURLException, InterruptedException {
		if(Language.equals("Languages")) {
			wait.until(ExpectedConditions.elementToBeClickable(LandingPage_OR.LanguageEnglish)).isDisplayed();
			Assert.assertTrue(LandingPage_OR.LanguageEnglish.isDisplayed());			
			Assert.assertTrue(LandingPage_OR.LanguagePanjabi.isDisplayed());
			Assert.assertTrue(LandingPage_OR.LanguageHinglish.isDisplayed());
			Assert.assertTrue(LandingPage_OR.LanguageHindi.isDisplayed());
		}
	}
	
	@And("^Select Language as \"([^\"]*)\"$")
	public void select_language(String Language) {
		
		if(Language.equals("English")) {
			wait.until(ExpectedConditions.elementToBeClickable(LandingPage_OR.LanguageEnglish)).isDisplayed();
			LandingPage_OR.LanguageEnglish.click();
			wait.until(ExpectedConditions.elementToBeClickable(LandingPage_OR.GoodByePen)).isDisplayed();
		}
	}
//	@Then("^Verify the  \"([^\"]*)\" Page$")
//	public void verify_page(String Page) {
//		
//		if(Page.equals("Welcome")) {
//			
//			
//		}
//	}
	@Then("^Verify all the slides in Welcome Page$")
	public void verify_slides() {
		wait.until(ExpectedConditions.elementToBeClickable(LandingPage_OR.GoodByePen)).isDisplayed();
		Assert.assertTrue(LandingPage_OR.GoodByePen.isDisplayed());
		
		
		wait.until(ExpectedConditions.elementToBeClickable(LandingPage_OR.GetStarted)).isDisplayed();
		Assert.assertTrue(LandingPage_OR.GetStarted.isDisplayed());
	}
	@And("^User clicks on \"([^\"]*)\"$")
	public void user_clicks_button(String Button) {
		
		if(Button.equals("GET STARTED")) {
			wait.until(ExpectedConditions.elementToBeClickable(LandingPage_OR.GetStarted)).isDisplayed();
			Assert.assertTrue(LandingPage_OR.GetStarted.isDisplayed());
			LandingPage_OR.GetStarted.click();
			wait.until(ExpectedConditions.elementToBeClickable(LandingPage_OR.MobileNumberField)).isDisplayed();
			
		}
		else if(Button.equals("Add Customer")) {
			wait.until(ExpectedConditions.elementToBeClickable(HomePage_OR.AddCustomer)).isDisplayed();
			Assert.assertTrue(HomePage_OR.AddCustomer.isDisplayed());
			HomePage_OR.AddCustomer.click();
			wait.until(ExpectedConditions.elementToBeClickable(HomePage_OR.CustomerName)).isDisplayed();
		}
		else if(Button.equals("OK")) {
			wait.until(ExpectedConditions.elementToBeClickable(LandingPage_OR.OK)).isDisplayed();
			LandingPage_OR.OK.click();
		}
		else if(Button.equals("Give Credit")) {
			wait.until(ExpectedConditions.elementToBeClickable(CustomerPage_OR.GiveCredit)).isDisplayed();
			CustomerPage_OR.GiveCredit.click();
			wait.until(ExpectedConditions.elementToBeClickable(CustomerPage_OR.NumberZero)).isDisplayed();
		}
		else if(Button.equals("Accept Payment")) {
			wait.until(ExpectedConditions.elementToBeClickable(CustomerPage_OR.AcceptPayment)).isDisplayed();
			CustomerPage_OR.AcceptPayment.click();
			wait.until(ExpectedConditions.elementToBeClickable(CustomerPage_OR.AddCreditButton)).isDisplayed();
		}
		else if(Button.equals("HamBurger Menu")) {
			wait.until(ExpectedConditions.elementToBeClickable(driver.findElementByAccessibilityId("Open"))).isDisplayed();
			driver.findElementByAccessibilityId("Open").click();
			wait.until(ExpectedConditions.elementToBeClickable(HamburgerMenu_OR.AccountHolderName)).isDisplayed();
		}
		else if(Button.equals("Account")) {
			wait.until(ExpectedConditions.elementToBeClickable(HamburgerMenu_OR.AccountMenu)).isDisplayed();
			HamburgerMenu_OR.AccountMenu.click();
			wait.until(ExpectedConditions.elementToBeClickable(AccountPage_OR.CustomerCOunt)).isDisplayed();
		}
		else if(Button.equals("Account Statement")) {
			wait.until(ExpectedConditions.elementToBeClickable(AccountPage_OR.AccountStatment)).isDisplayed();
			AccountPage_OR.AccountStatment.click();
			wait.until(ExpectedConditions.elementToBeClickable(AccountPage_OR.AccountStatementHeader)).isDisplayed();
		}
		else if(Button.equals("Send OTP")) {
			wait.until(ExpectedConditions.elementToBeClickable(LandingPage_OR.SendOTP)).isDisplayed();
			LandingPage_OR.SendOTP.click();
			wait.until(ExpectedConditions.elementToBeClickable(LandingPage_OR.AutoVerifyOtp)).isDisplayed();
		}
	}
	
	@And("^User enters the \"([^\"]*)\"$")
	public void user_enters_mobile(String Number) {
		
		if(Number.equals("Mobile Number")) {
			wait.until(ExpectedConditions.visibilityOf(LandingPage_OR.EnterMobileNumber)).isDisplayed();
			Assert.assertTrue(LandingPage_OR.MobileNumberField.isDisplayed());
			LandingPage_OR.MobileNumberField.sendKeys(data.MobileNumber);
			wait.until(ExpectedConditions.elementToBeClickable(LandingPage_OR.OK)).isDisplayed();
		}
		if(Number.equals("Password")) {
			wait.until(ExpectedConditions.visibilityOf(LandingPage_OR.EnterPassword)).isDisplayed();
			Assert.assertTrue(LandingPage_OR.PasswordField.isDisplayed());
			LandingPage_OR.PasswordField.sendKeys(data.password);
			wait.until(ExpectedConditions.elementToBeClickable(LandingPage_OR.OK)).isDisplayed();
		}
		if(Number.equals("Customer Name")) {
			wait.until(ExpectedConditions.visibilityOf(HomePage_OR.CustomerName)).isDisplayed();
			Assert.assertTrue(HomePage_OR.CustomerName.isDisplayed());
			HomePage_OR.CustomerName.sendKeys(customerName);
			wait.until(ExpectedConditions.elementToBeClickable(HomePage_OR.NameOkButton)).isDisplayed();
			HomePage_OR.NameOkButton.click();
		}
		if(Number.equals("Customer Number")) {
			wait.until(ExpectedConditions.visibilityOf(HomePage_OR.CustomerMobile)).isDisplayed();
			Assert.assertTrue(HomePage_OR.CustomerMobile.isDisplayed());
			HomePage_OR.CustomerMobile.sendKeys(customerNumber);
			wait.until(ExpectedConditions.elementToBeClickable(HomePage_OR.PasswordOkButton)).isDisplayed();
			HomePage_OR.PasswordOkButton.click();
		}
		if(Number.equals("Credit Amount")) {
			wait.until(ExpectedConditions.visibilityOf(CustomerPage_OR.NumberFive)).isDisplayed();
			CustomerPage_OR.NumberFive.click();
			wait.until(ExpectedConditions.visibilityOf(CustomerPage_OR.NumberZero)).isDisplayed();
			CustomerPage_OR.NumberZero.click();
			wait.until(ExpectedConditions.visibilityOf(CustomerPage_OR.NumberZero)).isDisplayed();
			CustomerPage_OR.NumberZero.click();
			wait.until(ExpectedConditions.visibilityOf(CustomerPage_OR.AttachmentOk)).isDisplayed();
		}
		if(Number.equals("Payment")) {
			wait.until(ExpectedConditions.visibilityOf(CustomerPage_OR.AddCreditButton)).isDisplayed();
			Assert.assertTrue(CustomerPage_OR.AddCreditButton.isDisplayed());
			wait.until(ExpectedConditions.visibilityOf(CustomerPage_OR.NumberFive)).isDisplayed();
			CustomerPage_OR.NumberFive.click();
			wait.until(ExpectedConditions.visibilityOf(CustomerPage_OR.NumberZero)).isDisplayed();
			CustomerPage_OR.NumberZero.click();
			wait.until(ExpectedConditions.visibilityOf(CustomerPage_OR.NumberZero)).isDisplayed();
			CustomerPage_OR.NumberZero.click();
			wait.until(ExpectedConditions.visibilityOf(CustomerPage_OR.AttachmentOk)).isDisplayed();
			
		}
	}
	@Then("^Verify the \"([^\"]*)\" button$")
	public void verify_the_button(String Option) {
		
		if(Option.equals("OK")) {
			wait.until(ExpectedConditions.elementToBeClickable(LandingPage_OR.OK)).isDisplayed();
			Assert.assertTrue(LandingPage_OR.OK.isDisplayed());
			
		}
		
	}
	@When("^User is in \"([^\"]*)\" Page$")
	public void user_is_in_page(String page) {
		
		if(page.equals("Home")) {
			wait.until(ExpectedConditions.visibilityOf(HomePage_OR.SearchCustomer)).isDisplayed();
			Assert.assertTrue(HomePage_OR.SearchCustomer.isDisplayed());
			String userName = HomePage_OR.UserName.getText();
			System.out.println("The user Here is :" + userName );
		}
	}
	@And("^Navigate to \"([^\"]*)\" Page$")
	public void navigate_to_customer_page(String page) {

		if(page.equals("Customer")) {
			
			wait.until(ExpectedConditions.visibilityOf(HomePage_OR.SearchCustomer)).isDisplayed();
			HomePage_OR.SearchCustomer.sendKeys(customerName);
			wait.until(ExpectedConditions.visibilityOf(HomePage_OR.CustomerThumb)).isDisplayed();
			HomePage_OR.AddedOn.click();
			wait.until(ExpectedConditions.visibilityOf(CustomerPage_OR.CustomerName)).isDisplayed();
		}
		
		if(page.equals("Home")) {
			
			wait.until(ExpectedConditions.visibilityOf(CustomerPage_OR.NavigateBack)).isDisplayed();
			CustomerPage_OR.NavigateBack.click();
			wait.until(ExpectedConditions.visibilityOf(HomePage_OR.CustomerThumb)).isDisplayed();
			
		}
	}
	@And("^User adds \"([^\"]*)\"$")
	public void user_adds_attachment(String obj) {
		
		if(obj.equals("Attachments")) {
			wait.until(ExpectedConditions.visibilityOf(CustomerPage_OR.CameraButton)).isDisplayed();
			CustomerPage_OR.CameraButton.click();
			try {
				wait.until(ExpectedConditions.visibilityOf(CustomerPage_OR.AllowAccess)).isDisplayed();
				CustomerPage_OR.AllowAccess.click();
				wait.until(ExpectedConditions.visibilityOf(CustomerPage_OR.PermissionAllow)).isDisplayed();
				CustomerPage_OR.PermissionAllow.click();
				CustomerPage_OR.PermissionAllow.click();
			}
			catch(Exception E) {
				System.out.println("Entering Attachments Second time");
			}
			
			wait.until(ExpectedConditions.visibilityOf(CustomerPage_OR.CameraMenu)).isDisplayed();
			CustomerPage_OR.GalleryMenu.click();
			wait.until(ExpectedConditions.visibilityOf(CustomerPage_OR.GalleryThumOne)).isDisplayed();
			CustomerPage_OR.GalleryThumOne.click();
			wait.until(ExpectedConditions.visibilityOf(CustomerPage_OR.PhotoAdded)).isDisplayed();
			Assert.assertTrue(CustomerPage_OR.PhotoAdded.isDisplayed());
			wait.until(ExpectedConditions.visibilityOf(CustomerPage_OR.AttachmentOk)).isDisplayed();
			CustomerPage_OR.AttachmentOk.click();
		}
		
	}
	@Then("^Verify Credit Details in \"([^\"]*)\"$")
	public void verify_details_in_home_page(String Details) {
		if(Details.equals("Credit Details")) {
			wait.until(ExpectedConditions.visibilityOf(HomePage_OR.AddedOn)).isDisplayed();
			Assert.assertTrue(HomePage_OR.CustomerThumb.isDisplayed());

		}
		else if(Details.equals("Transaction Page")) {
//			wait.until(ExpectedConditions.visibilityOf(CustomerPage_OR.AttachmentOk)).isDisplayed();
//			CustomerPage_OR.AttachmentOk.click();
			wait.until(ExpectedConditions.visibilityOf(CustomerPage_OR.TransactionDetails)).isDisplayed();
			Assert.assertTrue(CustomerPage_OR.TransactionDetails.isDisplayed());
		}
		else if(Details.equals("Account Page")) {
			wait.until(ExpectedConditions.visibilityOf(AccountPage_OR.Download)).isDisplayed();
			Assert.assertTrue(AccountPage_OR.Download.isDisplayed());
		}
		else if(Details.equals("HomePage")) {
			wait.until(ExpectedConditions.visibilityOf(HomePage_OR.CustomerList)).isDisplayed();
			Assert.assertTrue(HomePage_OR.CustomerList.isDisplayed());
		}
		
	}
	@Then("^Verify \"([^\"]*)\" Page$")
	public void verify_page(String Page) {
		if(Page.equals("OTP")) {
			
		}
	}
	
	
	
}
