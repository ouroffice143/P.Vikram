import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Armstrong {
		public static void main(String[] arg) throws IOException
		{
		int x,arm=0,n,temp;
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter a required number");
	    n = Integer.parseInt(in.readLine());
		temp=n;
		while(n!=0)
		{
			x=n%10;
			arm=arm+(x*x*x);
			n=n/10;
		}
		if(arm==temp)
		System.out.println(temp+" is a armstrong number ");
		else
		System.out.println(temp+" is not a armstrong number ");
	}
	}

