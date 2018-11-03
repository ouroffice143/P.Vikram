import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Matrix {

	public static void main(String[] args) throws NumberFormatException, IOException 
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
		
		System.out.println("Enter Addition for case:1 and Multiplication for case:2");
		int ch =Integer.parseInt(br.readLine());

		switch (ch) 
		{
		case 1:
		{
			int i,j;
			System.out.println("Enter number of rows");
			String s1 = br.readLine();
			int r = Integer.parseInt(s1);
			
			System.out.println("Enter number of columns");
			String s2 = br.readLine();
			int c = Integer.parseInt(s2);
			
			int a[][] = new int[r][c];
			int b[][] = new int[r][c];
			int x[][] = new int[r][c];
			
			System.out.println("Enter 1st matrix numbers : ");
			for(i=0;i<r;i++)
			{
				for(j=0;j<c;j++)
				{
					a[i][j] = Integer.parseInt(br.readLine());
				}
			}
			
			System.out.println("Enter 2nd matrix numbers : ");
			for(i=0;i<r;i++)
			{
				for(j=0;j<c;j++)
				{
					b[i][j] = Integer.parseInt(br.readLine());
				}
			}
			
			System.out.println("Addition of two matrix numbers is : ");
			for(i=0;i<r;i++)
			{
				for(j=0;j<c;j++)
				{
					System.out.println(a[i][j]+b[i][j]+"\t");
				}
			}
			System.out.println();
		}   break;

		case 2:
		{

			int i,j,k;
			System.out.println("Enter number of rows");
			String s1 = br.readLine();
			int r = Integer.parseInt(s1);
			
			System.out.println("Enter number of columns");
			String s2 = br.readLine();
			int c = Integer.parseInt(s2);
			
			int a[][] = new int[r][c];
			int b[][] = new int[r][c];
			int x[][] = new int[r][c];
			
			System.out.println("Enter 1st matrix numbers : ");
			for(i=0;i<r;i++)
			{
				for(j=0;j<c;j++)
				{
					a[i][j] = Integer.parseInt(br.readLine());
				}
			}
			
			System.out.println("Enter 2nd matrix numbers : ");
			for(i=0;i<r;i++)
			{
				for(j=0;j<c;j++)
				{
					b[i][j] = Integer.parseInt(br.readLine());
				}
			}
			
			System.out.println("Multiplication of two matrix numbers is : ");
			for(i=0;i<r;i++)
			{
				for(j=0;j<c;j++)
				{
					for(k=0;k<r;k++)
					{
						x[i][j] = x[i][j]+(a[i][k]*b[k][j]);
					}
				}
			}
			for(i=0;i<r;i++)
			{
				for(j=0;j<c;j++)
					System.out.println(" "+x[i][j]);
			}
			System.out.println();   
		}
		break;
	
		default :
			System.out.println("I'm a default matrix I hope you choose wrong case:");
		}	
	}
}
