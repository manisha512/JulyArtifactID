package annotations;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotations2 {
	@Test
	public void gulabo1() {
		System.out.println("Hey Gulabo1, How are you ?");
	}
	@Test
	public void gulabo2() {
		System.out.println("Hey Gulabo2, How are you ?");
	}
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("Before Method is Running");
	}

	@AfterMethod
	public void afterMethod() {
		System.out.println("After Method is Running");

	}

	@BeforeClass
	public void beforeClass() {
		System.out.println("Before Class is Running");

	}

	@AfterClass
	public void afterClass() {
		System.out.println("After Class is Running");

	}

	@BeforeTest
	public void beforeTest() {
		System.out.println("Before Test is Running");

	}

	@AfterTest
	public void afterTest() {
		System.out.println("After Test is Running");

	}

	@BeforeSuite
	public void beforeSuite() {
		System.out.println("Before Suite is Running");

	}

	@AfterSuite
	public void afterSuite() {
		System.out.println("After Suite is Running");
 }

	@BeforeGroups
	public void beforeGroups() {
		System.out.println("Before Groups is Running");

	}

	@AfterGroups
	public void afterGroups() {
		System.out.println("After Groups is Running");

	}

	// How many total run ? - 1
	// Tell me Sequence of Execution 
	// -> As it is

	//  @BeforeSuite
	//  @BeforeTest
	//  @BeforeClass
	//  @BeforeMethod
	//  @Test
	//  @AfterMethod
	//  @AfterClass
	//  @AfterTest
	//  @AfterSuite
	//  @AfterGroups

	//  @BeforeSuite
	//  @BeforeTest
	//  @BeforeClass
	//  @BeforeMethod
	//  @Test
	//  @Test
	//  @AfterMethod
	//  @AfterClass
	//  @AfterTest
	//  @AfterSuite
	//  @AfterGroups

	//  @BeforeSuite
	//  @BeforeTest
	//  @BeforeClass
	//  @BeforeMethod
	//  @Test
	//  @AfterMethod
	//  @BeforeMethod
	//  @Test
	//  @AfterMethod
	//  @AfterClass
	//  @AfterTest
	//  @AfterSuite
	//  @AfterGroups
}
