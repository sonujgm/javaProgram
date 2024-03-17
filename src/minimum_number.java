
public class minimum_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[]= {50,40,2,10,30};
		
		for (int i=0;i<a.length;i++) {
			
			if(a[0]>a[i]) {
				a[0]=a[i];
			}
			
		}
		
		System.out.print("minimum number:   "+a[0]);

	}

}
