package ObjectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Driver.desiredCapabilities;

public class CustomerPage_OR extends desiredCapabilities{

	
	@FindBy(id = "in.okcredit.merchant:id/profile_name")
	public static WebElement CustomerName;
	
	@FindBy(id = "in.okcredit.merchant:id/empty_tx_text")
	public static WebElement EmptyPlaceHolder;
	
	@FindBy(xpath = "//*/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.ImageView")
	public static WebElement EmptyBannerImage;
	
	@FindBy(id = "in.okcredit.merchant:id/add_payment_btn")
	public static WebElement AcceptPayment;
	
	@FindBy(id = "in.okcredit.merchant:id/add_payment_text")
	public static WebElement AcceptPaymentBtn;
	
	@FindBy(id = "in.okcredit.merchant:id/add_credit_btn")
	public static WebElement GiveCredit;
	
	@FindBy(id = "in.okcredit.merchant:id/add_credit_text")
	public static WebElement AddCreditButton;
	
	@FindBy(id = "in.okcredit.merchant:id/rupee_symbol")
	public static WebElement RupeeSymbol;
	
	@FindBy(id = "in.okcredit.merchant:id/btn_five")
	public static WebElement NumberFive;
	
	@FindBy(id = "in.okcredit.merchant:id/btn_zero")
	public static WebElement NumberZero;
	
	@FindBy(id = "in.okcredit.merchant:id/date_text")
	public static WebElement DateText;
	
	@FindBy(id = "android:id/button2")
	public static WebElement CalenderCancel;
	
	@FindBy(id = "android:id/button1")
	public static WebElement CalenderOk;
	
	@FindBy(id = "in.okcredit.merchant:id/bottom_container_text")
	public static WebElement AddNote;
	
	@FindBy(id = "in.okcredit.merchant:id/bottom_container_right_icon")
	public static WebElement CameraButton;
	
	@FindBy(xpath = "//android.widget.TextView[contains(@text, 'Allow access')]")
	public static WebElement AllowAccessToPhotos;
	
	@FindBy(id = "in.okcredit.merchant:id/btn_allow")
	public static WebElement AllowAccess;
	
	@FindBy(id = "in.okcredit.merchant:id/camera")
	public static WebElement CameraMenu;
	
	@FindBy(id = "in.okcredit.merchant:id/gallery")
	public static WebElement GalleryMenu;
	
	//*/androidx.recyclerview.widget.RecyclerView/android.widget.RelativeLayout[1]/android.widget.FrameLayout
	@FindBy(xpath = "//android.widget.FrameLayout[@resource-id='com.android.documentsui:id/thumbnail']")
	public static WebElement GalleryThumOne;
	
	@FindBy(id = "in.okcredit.merchant:id/content")
	public static WebElement TransactionMessage;
	
	
	@FindBy(xpath = "//android.widget.TextView[contains(@text, 'Due')]")
	public static WebElement AmountDue;
	
	@FindBy(xpath = "//android.widget.TextView[contains(@text, 'Advance')")
	public static WebElement AmountAdvance;
	
	@FindBy(id = "//android.widget.TextView[contains(@text, 'ADVANCE')")
	public static WebElement AmountAdvanceHomePage;
	
	@FindBy(id = "com.android.packageinstaller:id/permission_allow_button")
	public static WebElement PermissionAllow;
	
	@FindBy(xpath = "//android.widget.TextView[@text='Photo Added']")
	public static WebElement PhotoAdded;
	
	@FindBy(id = "in.okcredit.merchant:id/btn_submit")
	public static WebElement AttachmentOk;
	
	@FindBy(xpath = "//*/android.widget.LinearLayout/android.view.ViewGroup/android.widget.ImageButton")
	public static WebElement NavigateBack;
}
