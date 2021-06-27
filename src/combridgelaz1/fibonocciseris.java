package combridgelaz1;

import java.util.Scanner;

import com.Bridgelabz.fibonocciseries;

public class fibonocciseris {

	public static void main(String[] args) {
		static int n1 = 0, n2 = 1, n3 = 0;
		

		public static void main(String[] args) {
					
			fibonocciseries fib=new fibonocciseries();
			fib.printFibonacci();
			

		}

		 void printFibonacci() {
		   Scanner sc= new Scanner(System.in); //System.in is a standard input stream.
		   int previousnumber = -1;
		   int nextnumber = 1;
		   int sum = 0;
		   System.out.print("Enter first number- ");
		   int a= sc.nextInt();
				
			for(int i=0;i<a;i++)
			{
			  sum=previousnumber+nextnumber;
			  System.out.println(sum);
			  previousnumber=nextnumber;
			  nextnumber=sum;		 
			}
		    printFibonacci();
		   }
			

		}



	}

}
