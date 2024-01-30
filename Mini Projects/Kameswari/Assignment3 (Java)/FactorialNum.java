package kam;

import java.util.Scanner;

public class FactorialNum {

	public static void main(String[] args) {
		int n=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:");
		n=sc.nextInt();
		int f=1;
		while(n>0)
		{
			f=f*n;
			n=n-1;
		}
		System.out.println("The Factorial of given number is: "+f);

	}

}
