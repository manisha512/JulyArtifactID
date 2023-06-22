package annotations;

import org.testng.annotations.Test;
public class Keywords2 {
	
	// TestNG Keywords
			// 1) Priority - always after annotation
           //2)
			@Test 
			public void a1() {
				System.out.println("a1 is Running");
			}
			@Test (priority=1,invocationCount=2)
			public void a2() {
				System.out.println("a2 is Running");
			}
			@Test (priority = 0)
			public void a3() {
				System.out.println("a3 is Running");
			}
			@Test (priority = 3)
			public void a4() {
				System.out.println("a4 is Running");
			}
			@Test
			public void a5() {
				System.out.println("a5 is Running");
			}

			// Total Execution = 
		
	}

