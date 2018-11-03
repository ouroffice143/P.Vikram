import java.util.Scanner;

public class Duplicatenumbers {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,j,count=0;
		System.out.println("Enter the required array size");
		Scanner sc= new Scanner(System.in);
		int  size=sc.nextInt();
		int arr[]=new int[size];
		System.out.println("Enter the elements into an array");
		for(i=0;i<size;i++) {
			arr[i]=sc.nextInt();
		}
		
		//logic to find duplicates
		for(i=0;i<size;i++) {
			count=0;
			for(j=0;j<size;j++) {
			if(arr[i]==arr[j]) {  
			count=count+1;
			if(i!=j)
			arr[j]=-1;			
																													
	   }
				
     }
     if(count>1&&arr[i]!=-1) {
     System.out.println("Number  "+ arr[i]+ "  is  repeated "+count+" times" );
				
			}
			
			
		}
	}


}
