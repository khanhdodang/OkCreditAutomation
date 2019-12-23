package ObjectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Driver.desiredCapabilities;

public class LandingPage_OR extends desiredCapabilities{
	
	@FindBy(id =  "in.okcredit.merchant:id/title")
	public static WebElement SelectLanguage;

	@FindBy(id =  "in.okcredit.merchant:id/english")
	public static WebElement LanguageEnglish;
	
	@FindBy(id ="in.okcredit.merchant:id/punjabi")
	public static WebElement LanguagePanjabi;
	
	@FindBy(id ="in.okcredit.merchant:id/malayalam")
	public static WebElement LanguageMalayalam;
	
	@FindBy(id ="in.okcredit.merchant:id/hinglish")
	public static WebElement LanguageHinglish;
	
	@FindBy(id ="in.okcredit.merchant:id/hindi")
	public static WebElement LanguageHindi;
	
	@FindBy(id ="in.okcredit.merchant:id/title")
	public static WebElement WelcomeToOkCred;
	
	@FindBy(id ="in.okcredit.merchant:id/getStarted")
	public static WebElement GetStarted;
	
	@FindBy(id ="n.okcredit.merchant:id/digital_india_1")
	public static WebElement DigitalUdhar;
	
	@FindBy(xpath ="//android.widget.TextView[contains(@text, 'Good Bye')]")
	public static WebElement GoodByePen;
	
	@FindBy(xpath ="//android.widget.TextView[contains(@text, 'Free SMS')]")
	public static WebElement FreeSMS;
	
	@FindBy(xpath ="//android.widget.TextView[contains(@text, 'Anywhere')]")
	public static WebElement UseAnywhere;
	
	@FindBy(id ="in.okcredit.merchant:id/image_logo")
	public static WebElement OkCreditLogo;
	
	@FindBy(xpath ="//android.widget.TextView[contains(@text, 'Mobile')]")
	public static WebElement EnterMobileNumber;
	
	@FindBy(id ="in.okcredit.merchant:id/mobile")
	public static WebElement MobileNumberField;
	
	@FindBy(id ="in.okcredit.merchant:id/ok")
	public static WebElement OK;
	
	@FindBy(xpath ="//android.widget.TextView[contains(@text, 'Enter Password')]")
	public static WebElement EnterPassword;
	
	@FindBy(xpath ="//android.widget.EditText[contains(@text, 'Password')]")
	public static WebElement PasswordField;
	
	@FindBy(xpath ="//android.widget.TextView[contains(@text, 'mobile')]")
	public static WebElement VerifyMobile;
	
	@FindBy(id ="in.okcredit.merchant:id/mobile")
	public static WebElement MobileNumberVerifyPage;
	
	@FindBy(id ="in.okcredit.merchant:id/next")
	public static WebElement SendOTP;
	
	@FindBy(xpath ="//android.widget.TextView[contains(@text, 'Auto verifying OTP')]")
	public static WebElement AutoVerifyOtp;
	
	@FindBy(id ="in.okcredit.merchant:id/timer")
	public static WebElement Timer;
	
	@FindBy(xpath ="//android.widget.TextView[contains(@text, 'not')]")
	public static WebElement DidNotRecieveOtp;
	
	@FindBy(xpath ="//android.widget.TextView[contains(@text, 'WhatsApp')]")
	public static WebElement RegisterByWhatsapp;
	
	@FindBy(id ="com.android.packageinstaller:id/permission_allow_button")
	public static WebElement Allow;
	
}
