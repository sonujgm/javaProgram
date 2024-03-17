
public class palindrome_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int rev, sum=0, num=123
				
				,temp=num;
		
		while(num>0) {
			rev=num%10;
			sum=(sum*10)+rev;
			num=num/10;
		}
		if(temp==sum) {
			System.out.print(temp+" number is palindrome");
		}else {
			System.out.print(temp+" number is not palidrome");
		}
	}

}
