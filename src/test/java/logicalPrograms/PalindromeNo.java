package logicalPrograms;

public class PalindromeNo {

	public static void main(String[] args) {
		String s1 = "121";
		StringBuilder sb = new StringBuilder(s1);
	StringBuilder temp = sb.reverse();
		String s2 = temp.toString();
		if(s1.equals(s2)) {
			System.out.println("String is palindrome");}
		else {
		System.out.println("String is NOT palindrome");

		}
	}

}
