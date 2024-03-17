
public class Largestnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[]={2,3,40,50};
		
		for(int i=0;i<a.length;i++) { 
				if(a[0]<a[i]) {
					a[0] = a[i];
				
			}
			
		}
		System.out.print("largest number-- "+a[0]); 
		

	}

}
