package pfActitime;


	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;

	public class PFActitimeLoginPage {
		// Declaration - Variables - How many Webelements to be test

			@FindBy(xpath = "//input[@id='username']")
			private WebElement username;

			@FindBy(xpath = "//input[@name='pwd']")
			private WebElement pass;

			@FindBy(xpath = "//a[@id='loginButton']")
			private WebElement loginButton;
			WebDriver driver;

			// Initialization
			public PFActitimeLoginPage(WebDriver driver) {
				PageFactory.initElements(driver, this);
			}


			// Usage 
			public void setActitimeUsernamePF() {
				username.sendKeys("admin");
			}
			public void setActitimePasswordPF() {
				pass.sendKeys("manager");
			}
			public void verifyActitimeLoginButtonPF() {
				loginButton.click();
			}
	}


