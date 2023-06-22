package annotations;

import org.testng.annotations.Test;

public class Keywords1 {
	// TestNG Keywords
		// 1) Priority - always after annotation

		@Test (priority = -117)
		public void xyz() {
			System.out.println("XYZ is Running");
		}
		@Test(priority = -9635)
		public void abc() {
			System.out.println("ABC is Running");
		}
		@Test (priority = 0)
		public void pqr() {
			System.out.println("PQR is Running");
		}
		@Test (priority = 3)
		public void mno() {
			System.out.println("MNO is Running");
		}
		@Test(priority = -3)
		public void def() {
			System.out.println("Def is Running");
		}

		// Total Execution = 5
		//Execution=abc,xyz,def,pqr,mno
}
