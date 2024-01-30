package kam;

import java.util.Scanner;

public class Calculator {
	static void calculate(int a, int b, char operation) {
		
		if(operation == '+')
		{
			System.out.println(a+b);
		}
		else if(operation == '-')
		{
			System.out.println(a-b);
		}
		else if(operation=='*')
		{
			System.out.println(a*b);
		}
		else if(operation=='%')
		{
			System.out.println(a%b);
		}
		else if(operation=='/')
		{
			System.out.println(a/b);
		}
		else if(operation=='^')
		{
			System.out.println(a^b);
		}
		else 
		{
			System.out.println("enter valid numbers and operators");
		}
		
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the numbers:");
		int a=sc.nextInt();
		int b=sc.nextInt();
		System.out.print("choose the type of operator you want to perform (+,-,*,%,/)");
		char op = sc.next().charAt(0);
		calculate (a,b,op);


	}

}
