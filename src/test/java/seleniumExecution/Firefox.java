package seleniumExecution;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;

public class Firefox {

	public static void main(String[]args) {
	System.setProperty("webdriver.gecko.driver","D:\\velocityistallation\\setup\\geckodriver.exe");
	WebDriver driver = new FirefoxDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/signup");

}
}