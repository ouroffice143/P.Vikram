import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Reversearray {
	 public static void main(String[] args) throws  IOException {
		
		 BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		 System.out.println("enter the size of an array");
		    
		      int n =Integer.parseInt(br.readLine());
		      
		 System.out.println("enter the array elements");
		           int []size=new int[n];
	        System.out.println("Array before reverse:");
	        for (int i = 0; i < n; i++) {
	           
	             size[i] =Integer.parseInt(br.readLine());
	           
	        }
	        
	        System.out.println("Array after reverse:");
	        for(int i=n-1;i>=0;i--) {
	       	 
		        System.out.println(size[i]);
		        
	        }
	      
	    }
	}



