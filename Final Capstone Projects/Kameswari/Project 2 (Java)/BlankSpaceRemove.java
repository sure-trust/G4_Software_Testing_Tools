package kam;

import java.util.Scanner;

public class BlankSpaceRemove {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String str = sc.nextLine();
        System.out.println(str);
        System.out.println("The length of the string is: " +str.length());        
        System.out.println("String with spaces: "+str);
		String finalstring=str.replace(" ", "");
		System.out.println("The string without spaces is : "+finalstring);
	}

}
