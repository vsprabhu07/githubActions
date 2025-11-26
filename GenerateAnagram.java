package javaDSA;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GenerateAnagram {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter Sring : ");
		String str = sc.nextLine();
		
		List<String> anagram = generate(str);
		System.out.println(anagram);
	}
	
	public static List<String> generate(String str) {
		List<String> res = new ArrayList<>();
		
		possibleanagram("", str, res);
		
		return res; 
	}
	
	public static void possibleanagram(String pre, String str, List<String> res) {
		if(str.length()==0) {
			res.add(pre);
			return; 
		}
		
		for(int i=0; i<str.length(); i++) {
			char ch = str.charAt(i);
			
			String remain = str.substring(0,i) + str.substring(i+1);
			
			possibleanagram(pre+ch, remain, res);
		}
	}

}
