import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CheckPrimeNumber {
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
	   boolean flag=false;  int i=2;
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("enter your number");
		int num=Integer.parseInt(br.readLine());
		/*for(int i=2;i<num1/2;i++)
		{
			if(num1%i==0)
			{
				  flag=true;
				 break;
	}
		}*/      //OR//
		while(i<=num/2)
		{
			if(num%i==0)
			{
				flag=true;
				break;
			}
			i++;
			
		}
			if(!flag)
		
				System.out.println(num+"is a prime number");
		
			else
				System.out.println(num+"is not a prime number");
			
		}

	}

