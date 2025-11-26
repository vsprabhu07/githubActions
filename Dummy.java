package javaDSA;

public class Dummy {

	public static void main(String[] args) {
		String str = "11106";
		String res = " ";
		
		String[] s = {
			    "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M",
			    "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"
			};
		
		for(int i=0; i<str.length(); i++) {
			if(str.charAt(i)!=0)
				continue;
			
		  int n = str.charAt(i) -'0';
		 res += s[n-1];
		}
		System.out.println(res);
	}

}
