package String;

public class PalindromeString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "madam";
		String rev = "";
		char[] chars = str.toCharArray();
		
		for(int i=chars.length-1; i>=0; i--) {
			rev += chars[i];
		}
		
		if(str.equals(rev)) {
			System.out.print("palindrome");
		}else {
			System.out.print("not a palindrome");
		}
		
	}

}
