package logicalPrograms;

import java.util.Arrays;

public class DupicateNoA {

	public static void main(String[] args) {
		int[] a = {4,5,6,7,8,9,9};
		Arrays.sort(a);
		for(int i=0;i<a.length;i++){
			int n = a[i];
			int counter =0;
			for(int j=0;j<a.length;j++){
				if(n==a[j])
					counter++;
			}
			if(counter>1){
				System.out.println("Duplicate Number = "+a[i]);
				break;
			}
		}



	}

}
