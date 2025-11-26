package javaDSA;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeInterval {

	public static void main(String[] args) {
		int[][] arr = {{1,3},{2,6},{8,10},{15,18}};
		Arrays.sort(arr, (a, b) -> Integer.compare(a[0], b[0]));
		
		List<int[]> list = new ArrayList<>();
		int[] prev = arr[0];
		
		for(int i=1; i<arr.length; i++) {
			int[] interval =arr[i];
			if(interval[0] <= prev[1]) {
				prev[1] = Math.max(prev[1], interval[1]);
			}else {
			list.add(prev);
			prev = interval;
		}
		}
		list.add(prev);
		int[][] ans = list.toArray(new int[list.size()][]);
		
		for(int i=0; i<ans.length; i++) {
			for(int j=0; j<2; j++) {
				System.out.print(ans[i][j]+" ");
			}
			System.out.println();
		}
		
	}

}
