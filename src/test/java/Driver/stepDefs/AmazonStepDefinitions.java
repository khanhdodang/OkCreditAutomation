//package Driver.stepDefs;
//
///**
// * 
// *	Author : Sivasankaramalan Gunasekarasivam
// *
// */
//import java.net.MalformedURLException;
//import java.util.Iterator;
//import java.util.List;
//import java.util.concurrent.TimeUnit;
//
//import org.junit.Assert;
//import org.openqa.selenium.By;
//import org.openqa.selenium.ScreenOrientation;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;
//
//import com.google.common.collect.ImmutableMap;
//
//import Driver.PropertyData;
//import Driver.desiredCapabilities;
//import ObjectRepository.LandingPage_OR;
//import ObjectRepository.Amazon_HamburgerMenu_OR;
//import ObjectRepository.HomePage_OR;
//import ObjectRepository.Amazon_LoginPage_OR;
//import ObjectRepository.AccountPage_OR;
//import ObjectRepository.CustomerPage_OR;
//import PageObjects.CommonMethodsFunctions;
//import Utility.Log;
//import cucumber.api.java.en.And;
//import cucumber.api.java.en.Given;
//import cucumber.api.java.en.Then;
//import cucumber.api.java.en.When;
//import io.appium.java_client.MobileElement;
//import io.appium.java_client.TouchAction;
//import io.appium.java_client.touch.offset.ElementOption;
//import io.appium.java_client.touch.offset.PointOption;
//
//public class AmazonStepDefinitions extends desiredCapabilities{
//
//	
//	PropertyData data = new PropertyData();
//	CommonMethodsFunctions CF = new CommonMethodsFunctions();
//	
//	public static String ProductName = null;
//	
//	/**
//	 * Launching the APP under test - First step of Test Cases Execution
//	 * @throws Throwable
//	 */
//	@Given("Launch the Amazon app$")
//	public void launch_the_Amazon_app() throws Throwable {
//
//		Log.info("Launching the Application based on the Capabilities from the Driver file");
//		System.out.println("Platform Name here is: " + driver.getCapabilities().getCapability("platformName"));
//		
//
//	}
//	/**
//	 * Action - Click 
//	 * @param Button
//	 * @throws Throwable
//	 */
//	
//	@When("^User clicks on \"([^\"]*)\" button$")
//	public void user_clicks_on_button(String Button) throws Throwable {
//		
//		if(Button.equals("Start shopping")) {
//			try {
//				Log.info("Waiting for the Element" + HomePage_OR.SkipSignIn);
//				wait.until(ExpectedConditions.elementToBeClickable(HomePage_OR.SkipSignIn));
//				Log.info("Click the Element " + HomePage_OR.SkipSignIn);
//				HomePage_OR.SkipSignIn.click();
//				Log.info("Waiting for the Element" + HomePage_OR.HamburgerMenu);
//				wait.until(ExpectedConditions.elementToBeClickable(HomePage_OR.HamburgerMenu));
//			}
//			catch(Exception E) {
//				Log.info("Expected Element is not Presnet");
//				System.out.println("Skip Sign in not Displayed Hence moving to HomePage");
//			}
//
//		}
//		else if (Button.equals("hamburger")) {
//		Log.info("Waiting for the Element" + HomePage_OR.HamburgerMenu.toString());
//		wait.until(ExpectedConditions.elementToBeClickable(HomePage_OR.HamburgerMenu));
//		Log.info("Click the Element " + HomePage_OR.HamburgerMenu.toString());
//		HomePage_OR.HamburgerMenu.click();
//		Log.info("Waiting for the Element" + Amazon_HamburgerMenu_OR.HelloSignIn.toString());
//		wait.until(ExpectedConditions.elementToBeClickable(Amazon_HamburgerMenu_OR.HelloSignIn));
//		
//		}
//		else if (Button.equals("Amazon")) {
//		Log.info("Waiting for the Element" + HomePage_OR.AmazonLogo);
//		wait.until(ExpectedConditions.elementToBeClickable(HomePage_OR.AmazonLogo));
//		Log.info("Click the Element " + HomePage_OR.AmazonLogo);
//		HomePage_OR.AmazonLogo.click();
//		Log.info("Waiting for the Element" + HomePage_OR.AmazonLogo);
//		wait.until(ExpectedConditions.elementToBeClickable(HomePage_OR.AmazonLogo));
//			
//		}
//		else if (Button.equals("Proceed to Buy")) {
//		Log.info("Waiting for the Element" + LandingPage_OR.ProceedToBuy);
//		wait.until(ExpectedConditions.elementToBeClickable(LandingPage_OR.ProceedToBuy));
//		Log.info("Click the Element " + LandingPage_OR.ProceedToBuy);
//		LandingPage_OR.ProceedToBuy.click();
//		try {
//			Log.info("Waiting for the Element" + LandingPage_OR.EnterShippingAddress);
//			wait.until(ExpectedConditions.elementToBeClickable(LandingPage_OR.EnterShippingAddress));
//			System.out.println("Enter your Shipping Address to proceed with Order");
//		}
//		catch(Exception E) {
//			Log.info("Expected Element is not Presnet");
//			System.out.println("Enter Address to procced your Order");
//		}
//			
//		}
//	}
//	/**
//	 * Assertion for Home Page
//	 * @param Page
//	 */
//	
//	@And("^Verify \"([^\"]*)\" is displayed$")
//	public void verify_page_is_displayed(String Page) {
//		
//		if(Page.equals("Home page")) {
//		Log.info("Waiting for the Element" + HomePage_OR.AmazonLogo);
//		wait.until(ExpectedConditions.elementToBeClickable(HomePage_OR.AmazonLogo));
//		Log.info("Verify the presence of the " + HomePage_OR.AmazonLogo + "in current Page");
//		Assert.assertTrue(HomePage_OR.AmazonLogo.isDisplayed());
//	
//		}
//	}
//	
//	/**
//	 * Login to the Amazon App
//	 * @throws InterruptedException
//	 */
//	@And("^Login to amazon app$")
//	public void login_to_amazon_app() throws InterruptedException {
//		
//		Log.info("Waiting for the Element" + Amazon_HamburgerMenu_OR.HelloSignIn);
//		wait.until(ExpectedConditions.elementToBeClickable(Amazon_HamburgerMenu_OR.HelloSignIn));
//		
//		Log.info("Get the Current Orientation of the Device");
//		ScreenOrientation CurrentScreen = driver.getOrientation();
//		System.out.println("The Oreintation of Current Page is : "+ CurrentScreen );	
//		Log.info("Click the Element " + Amazon_HamburgerMenu_OR.HelloSignIn);
//		Amazon_HamburgerMenu_OR.HelloSignIn.click();
//		Log.info("Waiting for the Element" + Amazon_HamburgerMenu_OR.MobileNumberOrEmail);
//		wait.until(ExpectedConditions.visibilityOf(Amazon_HamburgerMenu_OR.MobileNumberOrEmail));
//		Log.info("Click the Element " + Amazon_HamburgerMenu_OR.MobileNumberOrEmail);
//		Amazon_HamburgerMenu_OR.MobileNumberOrEmail.click();
//		Log.info("Clear the text Field before entering any value");
//		Amazon_HamburgerMenu_OR.MobileNumberOrEmail.clear();
//		Log.info("Enter the text " + data.email + "to the text Field");
//		Amazon_HamburgerMenu_OR.MobileNumberOrEmail.sendKeys(data.email);
//		Log.info("Waiting for the Element" + Amazon_HamburgerMenu_OR.Continue);
//		wait.until(ExpectedConditions.visibilityOf(Amazon_HamburgerMenu_OR.Continue));
//		Log.info("Click the Element " + Amazon_HamburgerMenu_OR.Continue);
//		Amazon_HamburgerMenu_OR.Continue.click();
//		Log.info("Waiting for the Element" + Amazon_LoginPage_OR.Password);
//		wait.until(ExpectedConditions.elementToBeClickable(Amazon_LoginPage_OR.Password));
//		Log.info("Click the Element " + Amazon_LoginPage_OR.Password);
//		Amazon_LoginPage_OR.Password.click();
//		Log.info("Enter the text " + data.password + "to the text Field");
//		Amazon_LoginPage_OR.Password.sendKeys(data.password);
//		Log.info("Waiting for the Element" + Amazon_LoginPage_OR.Login);
//		wait.until(ExpectedConditions.visibilityOf(Amazon_LoginPage_OR.Login));
//		Log.info("Click the Element " + Amazon_LoginPage_OR.Login);
//		Amazon_LoginPage_OR.Login.click();
//		Log.info("Waiting for the Element" + HomePage_OR.AmazonLogo);
//		wait.until(ExpectedConditions.visibilityOf(HomePage_OR.AmazonLogo));
//	}
//	/**
//	 * Assertion for Available Text
//	 * @param Text
//	 */
//	
//	@And("^Validate text \"([^\"]*)\" is displayed$")
//	public void validate_text_displayed(String Text) {
//		if(Text.endsWith("Amazon Logo")) {
//		Log.info("Waiting for the Element" + HomePage_OR.AmazonLogo);
//		wait.until(ExpectedConditions.elementToBeClickable(HomePage_OR.AmazonLogo));
//		Log.info("Verify the presence of the " + HomePage_OR.AmazonLogo + "in current Page");
//		Assert.assertTrue(HomePage_OR.AmazonLogo.isDisplayed());
//		
//		}
//	}
//	
//	/**
//	 * Assertion for Available Menu	
//	 * @param Options
//	 */
//	@And("^Validate \"([^\"]*)\" is displayed$")
//	public void validate_options_menu(String Options) {
//		if(Options.equals("Search Bar")) {
//		Log.info("Waiting for the Element" + CustomerPage_OR.HomeSearch);
//		wait.until(ExpectedConditions.elementToBeClickable(CustomerPage_OR.HomeSearch));
//		Log.info("Verify the presence of the " + CustomerPage_OR.HomeSearch + "in current Page");
//		Assert.assertTrue(CustomerPage_OR.HomeSearch.isDisplayed());
//		}
//		else if (Options.equals("Headphones")) {
//		Log.info("Waiting for the Element" + CustomerPage_OR.ResultsCount);	
//		wait.until(ExpectedConditions.elementToBeClickable(CustomerPage_OR.ResultsCount));
//		Log.info("Verify the presence of the " + CustomerPage_OR.ResultsCount + "in current Page");
//		Assert.assertTrue(CustomerPage_OR.ResultsCount.isDisplayed());
//		}
//	}
//	
//	@And("^Choose the current location$")
//	public void choose_the_current_location() {
//		
//		Log.info("Waiting for the Element" + HomePage_OR.AmazonLogo);
//		wait.until(ExpectedConditions.elementToBeClickable(HomePage_OR.AmazonLogo));
//		Log.info("Click the Element " + HomePage_OR.AmazonLogo);
//		HomePage_OR.AmazonLogo.click();
//		Log.info("Waiting for the Element" + HomePage_OR.LocationIcon);
//		wait.until(ExpectedConditions.elementToBeClickable(HomePage_OR.LocationIcon));
//		Log.info("Click the Element " + HomePage_OR.LocationIcon);
//		HomePage_OR.LocationIcon.click();
//		Log.info("Waiting for the Element" + HomePage_OR.useCurrentLocation);
//		wait.until(ExpectedConditions.elementToBeClickable(HomePage_OR.useCurrentLocation));
//		Log.info("Click the Element " + HomePage_OR.useCurrentLocation);
//		HomePage_OR.useCurrentLocation.click();
//		Log.info("Waiting for the Element" + AccountPage_OR.AllowPermission);
//		wait.until(ExpectedConditions.elementToBeClickable(AccountPage_OR.AllowPermission));
//		Log.info("Click the Element " + AccountPage_OR.AllowPermission);
//		AccountPage_OR.AllowPermission.click();
//	}
//	
//	/**
//	 * Searching for the Product Based on the User Input
//	 * @param Product
//	 */
//	@And("^Search for the product \"([^\"]*)\"$")
//	public void search_for_product(String Product) {
//		if(Product.equals("Headphones")) {
//		Log.info("Waiting for the Element" + AccountPage_OR.AllowPermission);
//		wait.until(ExpectedConditions.elementToBeClickable(CustomerPage_OR.HomeSearch));
//		Log.info("Verify the presence of the " + CustomerPage_OR.HomeSearch + "in current Page");
//		Assert.assertTrue(CustomerPage_OR.HomeSearch.isDisplayed());
//		Log.info("Click the Element " + CustomerPage_OR.HomeSearch);
//		CustomerPage_OR.HomeSearch.click();
//			try {
//				Log.info("Click the Element " + LandingPage_OR.ClearSearch);
//				LandingPage_OR.ClearSearch.click();
//
//			}
//			catch(Exception E) {
//				Log.info("Expected scenarios is not Presnet");
//				System.out.println("Searching for the First Time");
//			}
//	
//		Log.info("Enter the text " + data.Product + " to the text Field");
//		CustomerPage_OR.HomeSearch.sendKeys("Headphones"+"\n");
//		Log.info("Waiting for the Element" + CustomerPage_OR.SearchDropDown);
//		wait.until(ExpectedConditions.elementToBeClickable(CustomerPage_OR.SearchDropDown));
//		
//		
//		driver.executeScript("mobile: performEditorAction", ImmutableMap.of("action", "search"));
//		
//		}
//	}
//	
//	@SuppressWarnings("static-access")
//	public void Verify_the_list_of_Best_Sellers(String Object) throws MalformedURLException, InterruptedException {
//		if(Object.equals("Best Sellers")) {
//			
//			CF.scrollToText(data.Seller, driver);
//			Log.info("Waiting for the Element" + CustomerPage_OR.BestSeller);
//			wait.until(ExpectedConditions.elementToBeClickable(CustomerPage_OR.BestSeller));
//			
//			Log.info("Click the Element " + CustomerPage_OR.BestSeller);
//			CustomerPage_OR.BestSeller.click();
//		}
//	}
//	/**
//	 * Selecting the Product from the List
//	 * @throws MalformedURLException
//	 * @throws InterruptedException
//	 */
//	@And("^User selects the Best Sellers from the list$")
//	public void user_selects_the_list() throws MalformedURLException, InterruptedException {
//		
//		Log.info("Waiting for the Element" + AccountPage_OR.Location);
//		wait.until(ExpectedConditions.elementToBeClickable(AccountPage_OR.Location));
//		
//		AccountPage_OR.Location.click();
//		wait.until(ExpectedConditions.elementToBeClickable(AccountPage_OR.UseMyCurrentLocation));
//		AccountPage_OR.UseMyCurrentLocation.click();
//		
//		Log.info("Click the Element " + CustomerPage_OR.BestSellerNo1);
//		wait.until(ExpectedConditions.elementToBeClickable(AccountPage_OR.Location));
//		
//		WebElement element = driver.findElement(By.xpath("//*[@resource-id='zeitgeistBadge_feature_div']"));
//		
//		element.click();
//		
//		Log.info("Waiting for the Element" + CustomerPage_OR.BestSellerNoList);
//		wait.until(ExpectedConditions.elementToBeClickable(CustomerPage_OR.BestSellerNoList));
//		CustomerPage_OR.BestSellerNoList.click();
//
//		Log.info("Waiting for the Element" + LandingPage_OR.CartMenu);
//		wait.until(ExpectedConditions.elementToBeClickable(LandingPage_OR.CartMenu));
//	}
//	
//	@And("^Verify product details are displayed$")
//	public void verify_product_details() {
//
//		Log.info("Waiting for the Element" + AccountPage_OR.ProdcutName);
//		wait.until(ExpectedConditions.elementToBeClickable(AccountPage_OR.ProdcutName));
//		Log.info("Get the Details of ChoosenProduct");
//		ProductName = AccountPage_OR.ProdcutName.getText();
//		System.out.println("The Selected Product is : " + ProductName);
//		Log.info("Verify the Choosen Product is same as Headphone or not");
//		Assert.assertTrue("The suggestions are not having expected Product", ProductName.contains(data.Product));
//	}
//	
//	@And("^User Add's the product to the Cart$")
//	public void user_adds_the_product_to_cart() throws MalformedURLException, InterruptedException {
//		
//		Log.info("Waiting for the Element" + AccountPage_OR.Location);
//		wait.until(ExpectedConditions.elementToBeClickable(AccountPage_OR.Location));
//		
//		Log.info("Add the Procut to Cart by Scrolling to Add Cart Section");
//		CF.scrollToText("Add to Cart", driver);
//		
//		wait.until(ExpectedConditions.elementToBeClickable(AccountPage_OR.AddToCart));
//		AccountPage_OR.AddToCart.click();
//		
//		Log.info("Waiting for the Element" + AccountPage_OR.AddedToCart);
//		wait.until(ExpectedConditions.elementToBeClickable(AccountPage_OR.AddedToCart));
//		Log.info("Verify the presence of the " + AccountPage_OR.AddedToCart + "in current Page");
//		Assert.assertTrue(AccountPage_OR.AddedToCart.isDisplayed());
//	}
//	
//	@And("^Navigate to the Cart menu$")
//	public void navigate_to_the_cart_menu() {
//		Log.info("Waiting for the Element" + HomePage_OR.AmazonLogo);
//		wait.until(ExpectedConditions.elementToBeClickable(HomePage_OR.AmazonLogo));
//		Log.info("Click the Element " + HomePage_OR.AmazonLogo);
//		HomePage_OR.AmazonLogo.click();
//		Log.info("Waiting for the Element" + LandingPage_OR.CartMenu);
//		wait.until(ExpectedConditions.elementToBeClickable(LandingPage_OR.CartMenu));
//		Log.info("Click the Element " + LandingPage_OR.CartMenu);
//		LandingPage_OR.CartMenu.click();
//		Log.info("Waiting for the Element" + LandingPage_OR.ProceedToBuy);
//		wait.until(ExpectedConditions.elementToBeClickable(LandingPage_OR.ProceedToBuy));
//	}
//	
//	@And("^Verify the Product in Cart$")
//	public void verify_Cart() {
//		Log.info("Waiting for the Element" + LandingPage_OR.SubTotal);
//		wait.until(ExpectedConditions.elementToBeClickable(LandingPage_OR.SubTotal));
//		String ProductCartPage = LandingPage_OR.ProdcutName.getText();
//		System.out.println(ProductCartPage);
//		Log.info("Verify the Expected Element is displayd on Current Page");
//		Assert.assertTrue(LandingPage_OR.ProdcutName.isDisplayed());
//		Log.info("Verify the Product is Headphone or not");
//		Assert.assertTrue("The product is not present in the Cart", ProductCartPage.contains(data.Product));
//	}
//	
//	/**
//	 * Final Step on Test Case Execution : Terminating the App from the User Session
//	 * @throws Throwable
//	 */
//	@Then("^User closes the app$")
//	public void user_closes_the_app() throws Throwable {
//		Log.warn("Closing the App");
//		driver.closeApp();
//		
//	}
//}
//	
