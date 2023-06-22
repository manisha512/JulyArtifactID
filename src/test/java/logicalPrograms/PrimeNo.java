package logicalPrograms;

import java.util.Scanner;

public class PrimeNo {

	public static void main(String[] args) {
		boolean flag = true;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number -> ");
		int n = sc.nextInt();
		sc.close();
		for(int i=2;i<n;i++){
			int rem = n%i;
			if(rem==0){
				flag = false;
				break;
			}
		}
		if(flag)
			System.out.println("Prime");
		else
			System.out.println("Not Prime");
	}}

//	// -------------- 22 -  Factorial Number  ----------------------------------------------
////		int fact = 1;
////		int n = 4;
////		for(int i=1;i<=n;i++)
////			fact=fact*i;
////		System.out.println("Factorial = "+fact);
	


