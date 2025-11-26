package javaDSA;
import java.util.*;

public class palindromepartition {

	public static void main(String[] args) {
		String s = "aab";
		List<String> list = new ArrayList<>();
		for(int i=0; i<s.length(); i++) {
			for(int j=i; j<s.length(); j++) {
				String sub = s.substring(i, j+1);
				if(isPalindrome(sub)) {
					list.add(sub);
					System.out.println(sub);
				}
			}
		}
		System.out.println(list);
	}
	public static boolean isPalindrome(String str) {
		int i=0, j= str.length()-1; 
		while(i <= j) {
			if(str.charAt(i) != str.charAt(j)) {
				return false; 
			}
			i++;
			j--;
		}
		return true;
	}

}
