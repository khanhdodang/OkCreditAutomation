package ObjectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Driver.desiredCapabilities;

public class HomePage_OR extends desiredCapabilities{

	
	@FindBy(id ="in.okcredit.merchant:id/profile_image")
	public static WebElement ProfileImage;
	
	@FindBy(id ="in.okcredit.merchant:id/share")
	public static WebElement ShareButton;
	
	@FindBy(id ="in.okcredit.merchant:id/refresh")
	public static WebElement Refresh;
	
	@FindBy(id = "in.okcredit.merchant:id/search_bar_text")
	public static WebElement SearchCustomer;
	
	@FindBy(id = "in.okcredit.merchant:id/left_action")
	public static WebElement SearchIcon;
	
	@FindBy(id = "in.okcredit.merchant:id/btn_title")
	public static WebElement AddCustomer;
	
	@FindBy(id = "in.okcredit.merchant:id/input_name")
	public static WebElement CustomerName;
	
	@FindBy(id = "in.okcredit.merchant:id/name_button")
	public static WebElement NameOkButton;
	
	@FindBy(id = "in.okcredit.merchant:id/buttonContainer")
	public static WebElement PasswordOkButton;
	
	@FindBy(id = "in.okcredit.merchant:id/input_phone")
	public static WebElement CustomerMobile;
	
	@FindBy(id = "in.okcredit.merchant:id/import_contact_bottom_container")
	public static WebElement ImportContactButton;
	
	@FindBy(id = "in.okcredit.merchant:id/text_title")
	public static WebElement ImportPhoneContacts;
	
	@FindBy(id = "in.okcredit.merchant:id/account_or_collection")
	public static WebElement AccountMenu;
	
	@FindBy(id = "in.okcredit.merchant:id/title_toolbar")
	public static WebElement UserName;
	
	@FindBy(id = "in.okcredit.merchant:id/pic")
	public static WebElement CustomerThumb;

	@FindBy(id = "in.okcredit.merchant:id/lastPayment")
	public static WebElement AddedOn;
	
	@FindBy(id = "Open")
	public static WebElement HemburgerMenu;
	
	@FindBy(id = "in.okcredit.merchant:id/customerList")
	public static WebElement CustomerList;
	
}
