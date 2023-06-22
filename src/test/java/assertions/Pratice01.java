package assertions;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Pratice01 {
	@Test
	public void test11() {
		String kiss = "Puppy"; // Expected 
		String slap = "Thappad";// Actual 
		Assert.assertEquals(slap, kiss);// Fail
	}
	
	@Test
	public void test12() {
		String exp = "Ye Samay chala Jayega"; // Expected 
		String act = "Ye Samay Bad me nahi aayega";// Actual 
		Assert.assertNotEquals(act, exp);// Pass
	}

	@Test
	public void test13() {
		Assert.assertEquals(12, 12);
	}
	
	@Test
	public void test14() {
		String myName = "Gyanba";
		Assert.assertTrue(true, (myName.equals("Gyanuba")) + " Not Matched the Names");
	}
	
	@Test
	public void test15() {
		Assert.assertTrue(15<13, "Number bada Hai Mere Bhai");
	}
	
	@Test
	public void test16() {
		String d = "Disco";
		String s = "Disc0";
		Assert.assertFalse(d.equals(s));// Pass
	}
	
	@Test
	public void test17() {
		Assert.assertNull(null);
	}
}
