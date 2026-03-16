package String;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "Pavan";
		char[] chars = str.toCharArray();
		String rev = "";
		
		for(int i=chars.length-1; i>=0; i--) {
			rev += chars[i];
		}
		
		System.out.print(rev);
	}

}
