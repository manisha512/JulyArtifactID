package pfactitimeTest;


	import java.time.Duration;

	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;

	import pfActitime.PFActitimeHomePage;
	import pfActitime.PFActitimeLoginPage;

	public class PFTestActitime {
		// Main Method
			public static void main(String[] args) throws InterruptedException {
				// Basic Steps
				WebDriver driver = new ChromeDriver();
				driver.manage()
				.window().maximize();
				driver.get("http://localhost/login.do");
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

				// Execute Module using Object of Pages
				PFActitimeLoginPage a = new PFActitimeLoginPage(driver);
				a.setActitimeUsernamePF();
				a.setActitimePasswordPF();
				a.verifyActitimeLoginButtonPF();

				Thread.sleep(3000);
				PFActitimeHomePage b = new PFActitimeHomePage(driver);
				b.verifyActitimeLogoPF();
				b.verifyActitimeLogoutButtonPF();
				Thread.sleep(3000);
				driver.quit();
			}
		}

