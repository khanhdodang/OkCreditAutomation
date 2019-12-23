package ObjectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Driver.desiredCapabilities;

public class HamburgerMenu_OR extends desiredCapabilities {

	
	@FindBy(id ="in.okcredit.merchant:id/material_drawer_account_header_name")
	public static WebElement AccountHolderName;
	
	@FindBy(id = "in.okcredit.merchant:id/material_drawer_account_header_email")
	public static WebElement AccountHolderEmail;
	
	@FindBy(xpath = "//android.widget.Button[@text='Continue']")
	public static WebElement Continue;
	
	@FindBy(xpath = "//*/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[2]")
	public static WebElement AccountMenu;
	
}
