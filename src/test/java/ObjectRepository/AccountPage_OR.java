package ObjectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Driver.desiredCapabilities;

public class AccountPage_OR extends desiredCapabilities{

	
	@FindBy(id ="/in.okcredit.merchant:id/customerCountLabel")
	public static WebElement Customers;
	
	@FindBy(id ="in.okcredit.merchant:id/customerCount")
	public static WebElement CuctomerCOunt;
	
	@FindBy(id ="in.okcredit.merchant:id/balanceLabel")
	public static WebElement Advance;
	
	@FindBy(xpath =  "//android.widget.TextView[@text='Account Statement']")
	public static WebElement AccountStatement;
	
	@FindBy(id =  "in.okcredit.merchant:id/profile_name")
	public static WebElement AccountStatementHeader;
	
	@FindBy(id =  "in.okcredit.merchant:id/btn_title")
	public static WebElement Download;
	
	@FindBy(id =  "in.okcredit.merchant:id/customer_nam")
	public static WebElement CustomerName;
	
	@FindBy(id ="in.okcredit.merchant:id/tx_amount")
	public static WebElement AmountBalCustomer;
	
	@FindBy(id ="in.okcredit.merchant:id/tx_date")
	public static WebElement Date;
	
	@FindBy(id ="in.okcredit.merchant:id/date_range")
	public static WebElement DatePicker;
	
	
	@FindBy(id ="com.android.packageinstaller:id/permission_allow_button")
	public static WebElement AllowButton;
	
	@FindBy(id ="in.okcredit.merchant:id/material_drawer_account_header_name")
	public static WebElement AccountHeaderName;
	
	@FindBy(id ="in.okcredit.merchant:id/material_drawer_account_header_email")
	public static WebElement AccountHeaderEmail;
	
	
}
