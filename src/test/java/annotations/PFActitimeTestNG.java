package annotations;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pfActitime.PFActitimeHomePage;
import pfActitime.PFActitimeLoginPage;

public class PFActitimeTestNG {
	WebDriver driver;
	PFActitimeLoginPage a;
	PFActitimeHomePage b;

	@BeforeClass
	public void openBrowser() {
		System.out.println("Opening Browser");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://localhost/login.do");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		a = new PFActitimeLoginPage(driver);
		b = new PFActitimeHomePage(driver);

	}

	@AfterClass
	public void closeBrowser() {
		System.out.println("Closed Browser");
		driver.quit();
	}

	@BeforeMethod
	public void loginActitime() {
		System.out.println("Log into Application");
		a.setActitimeUsernamePF();
		a.setActitimePasswordPF();
		a.verifyActitimeLoginButtonPF();
		System.out.println("Logged in Application Successfully");
	}

	@AfterMethod
	public void logoutActitime() {
		System.out.println("Logout from Application");
		b.verifyActitimeLogoutButtonPF();
	}

	@Test
	public void scenario1VerifyLogo() {
		System.out.println("Checking 1st Scenarios Running");
		b.verifyActitimeLogoPF();
		System.out.println("Verified 1st Scenarios");
	}

}


