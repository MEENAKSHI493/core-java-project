package combridgelaz1;

import java.util.Scanner;

public class primenumber {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the number:");
		int n=sc.nextInt();
		int a = 0;
		for(int i=1;i<=n;i++)
		{
			if (n%i==0)
				a++;
		}
		if (a==2)
		{
			
			System.out.println("given number is a prime number");			
		}
		else
			System.out.println("given number is not prime number");

	}	
		
		
		

	}


