package annotations;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import pfActitime.PFActitimeHomePage;
import pfActitime.PFActitimeLoginPage;

public class PFActitimeTestNG1 {
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
	////span[@onclick="openAddNewTasksPopup();"]
}
