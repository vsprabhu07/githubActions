package javaDSA;

import java.util.ArrayList;
import java.util.List;

public class Coins {

	public static void main(String[] args) {
	int[] arr = {1,2,5,10,20,50,100};
	int num =43, c=0;
	List<Integer> list = new ArrayList<>();
	
	for(int i=arr.length-1; i>=0 && num>0; i--) {
		while(num >= arr[i]) {
			num -= arr[i];
			c++;
			list.add(arr[i]);
		}
	}
	System.out.println(c);
	for(int i=0; i<list.size(); i++) {
		System.out.print(list.get(i)+" ");
	}

	}

}
