package logicalPrograms;

import java.util.Arrays;

public class MissingNo {

	public static void main(String[] args) {
		int[] a = {4,5,6,7,9};
		Arrays.sort(a);
		for(int i=0;i<a.length;i++)
		System.out.print(a[i]+" ");
		System.out.println(" ");
		int first;
		first=a[0];
		System.out.println(first);
		for(int i=1;i<a.length;i++){
			if(a[i]==(first+1)){
				first=a[i];
				System.out.println(a[i]);
			}else{
				System.out.println("missing = "+(first+1));
				break;
			}
		}


	}

}
