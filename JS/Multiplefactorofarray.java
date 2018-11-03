import java.util.Scanner;

public class Multiplefactorofarray {
	public static void main(String[]args) {

	Scanner sc=new Scanner(System.in);
	
	System.out.println("enter your size of an array");
	 int s=sc.nextInt();
	 int arr[]=new int[s];
	
	System.out.println("enter your elements");
       for(int i=0;i<arr.length;i++) {
    	   arr[i]=sc.nextInt();
    	   }
       for(int i=0;i<arr.length;i++) {
    	   if(arr[i]%3==0) 
    	   
    	   System.out.println(arr[i]);
    	   }
       }
       }


