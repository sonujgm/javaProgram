
public class stringPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String originalString="test";
		String reverseString= "";
		
		char ch;
		
		for (int i=0;i<originalString.length();i++) {
			ch=originalString.charAt(i);
			reverseString=ch+reverseString;
		}
		if(originalString.equalsIgnoreCase(reverseString)) {
			System.out.print(reverseString+" is a palindrome string");
		}else {

			System.out.print(reverseString+ "is not a palindrome string");
		}

	}

}
