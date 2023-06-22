package annotations;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Annotations3 {
	@Test
	public void gulabo1() {
		System.out.println( "hi");
	}
	@Test
	public void gulabo2() {
		System.out.println( "How are you ?");
}
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("Before Method Running");
}
	@AfterMethod
	public void afterMethod() {
		System.out.println("After Method Running");
	}}