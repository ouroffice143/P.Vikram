import java.util.Arrays;
import java.util.Scanner;

public class Sortingarray {
	
	public static void main(String[] args) {
		int i,j,temp;
		
		System.out.println("Enter the array size");
		Scanner sc= new Scanner(System.in);
		int  n=sc.nextInt();
		int a[]=new int[n];
		
		//storing elements into an array
		System.out.println("Enter the elements into an array");
		for(i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		
		//printing the array 
		System.out.println("the entered array is :");
		for(i=0;i<n;i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println();
		
		//logic
		Arrays.sort(a);
		System.out.println("the sorted array is :");
		for(i=0;i<n;i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println();
	
		for(i=0;i<n;i++) {
			for(j=0;j<n;j++) {
				if((a[i]%2)==0) {  //logic checking for even
					
					if(a[j]%2!=0) {	//logic checking for odd
						if(i<j) {		
						temp=a[i];
						a[i]=a[j];
						a[j]=temp;
						
					}
					}
					else {
						if(a[i]>a[j]) {			//cheking even numbers and swaping in desending order
							temp=a[j];
							a[j]=a[i];
							a[i]=temp;
							
						}
					}
				}
				
				
			}
		}
		System.out.println("the required sorted array is :");
		for(i=0;i<n;i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println();
		
		
	}
	
}

