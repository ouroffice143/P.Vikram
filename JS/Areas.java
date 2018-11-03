import java.util.Scanner;

public class Areas {
	public static void main(String[]args) {
		 double area;
	      double pi=3.14;
		Scanner sc=new Scanner(System.in);
		/* Area of circle*/
		
		System.out.println("enter your radius for circle");
		double radius=sc.nextDouble();
		area= pi*(radius*radius);
		System.out.println("area of circle:"+area);
		
		/* perimeter  of Circle */
		
		
		 double perimeter=2*3.14*radius;
		 System.out.println("circumference of circle:"+perimeter);
		
		 /* Area of Triangle */
		 
		System.out.println("enter your width of triangle");
		double w=sc.nextDouble();
		System.out.println("enter your height of triangle");
		double h=sc.nextDouble();
		  area=0.5*(w*h);
		System.out.println("area of triangle:"+area);
		
		/* Perimeter of Triangle*/
		
		  System.out.println("enter your firstside");
		  double a=sc.nextDouble();
		  System.out.println("enter your secondside");
		  double b=sc.nextDouble();
		  System.out.println("enter your thirdside");
		  double c=sc.nextDouble();
		  
		 double perimeter1=(a+b+c);
		 System.out.println("perimeter of Triangle"+perimeter1);
	}

}
