package assertions;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertion {
	SoftAssert softAssert = new SoftAssert();
	 @Test
	    public void hardAssertion(){
	    	Assert.assertEquals("pass","pass");
	    	System.out.println("This line is executed because assertEquals "
	    			+ "passed as both the strings are same");
	    	Assert.assertNull("assertion");
	    	System.out.println("Since the object under assertion"
	    			+ " is not null, the assertion will fail. "
	    			+ "This line will not be executed");
	    }
	 
	    @Test
	    public void softAssertion(){  	
	    	softAssert.assertNull("assertion");
	    	System.out.println("We are using Soft assertion in this method,"
	    			+ " so this line of code will also be executed even if "
	    			+ "the assetion fails.Wherever we want to execute full "
	    			+ "testcase/method, we should use SoftAssertion");
	    	softAssert.assertAll();
	    }
	    @Test
	    public void SoftassertEquals(){
	    	softAssert.assertEquals("This assertion will pass","This assertion will pass");
	    	System.out.println("This line is executed because assertEquals "
	    			+ "passed since both the strings are same");
	    	softAssert.assertEquals("assertion","This assertion will fail");
	    	System.out.println("This line will not be executed because "
	    			+ "assertEquals fails both the strings are different."
	    			+ "Also the test/method will be declared failed");
	    	softAssert.assertAll();
	    
	    }
}
