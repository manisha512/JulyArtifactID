package pfActitime;


	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;

	public class PFActitimeHomePage {
		// Declaration
			@FindBy(xpath = "//img[@height='61']")
			private WebElement logo;

			@FindBy(xpath = "//a[@id='logoutLink']")
			private WebElement logout;
			WebDriver driver;

			// Initialization
			public PFActitimeHomePage(WebDriver driver) {
				PageFactory.initElements(driver, this);
			}

			// Usage 

			public void verifyActitimeLogoPF() {
				boolean result = logo.isDisplayed();
				if (result == true) {
					System.out.println("Test Scenario 1 is Passed and Result is = "+result);
				}else {
					System.out.println("Test Scenario 1 is Failed and Result is = "+result);

				}
			}

			public void verifyActitimeLogoutButtonPF() {
				logout.click();
	}}


