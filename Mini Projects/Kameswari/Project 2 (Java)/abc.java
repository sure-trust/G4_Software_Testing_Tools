package kam;

import java.io.Reader;
import java.util.Scanner;

public class abc {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the numbers:");
		int a=sc.nextInt();
		int b=sc.nextInt();
		System.out.print("choose the type of operator you want to perform (+,-,*,%,/)");
		char c = sc.next().charAt(0);
		switch(c)
		{
		case '+':
			System.out.println(a+b);
			break;
		case '-':
			System.out.println(a-b);
			break;
		case '*':
			System.out.println(a*b);
			break;
		case '%':
			System.out.println(a%b);
			break;
		case '/':
			System.out.println(a/b);
			break;
		case '^':
			System.out.println(a^b);
			break;
		default:
			System.out.println("Enter the correct numbers and operators");
		}
	}

}
