package kam;

import java.util.Scanner;

public class NonRepeat {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
        System.out.println("Enter a string:");
        String str = s.nextLine();
        char ch = ' ';
        int[] arr = new int[256]; 
        // Count the occurrences of each character
        for (int i = 0; i < str.length(); i++) 
        {
        	arr[str.charAt(i)]++;
        }

        // Find the first non-repeating character
        for (int i = 0; i < str.length(); i++) 
        {
            if (arr[str.charAt(i)] == 1) 
            {
                ch = str.charAt(i);
                break;
            }
        }

        if (ch == ' ') 
        {
            System.out.println("There is no non-repeating character in the input string.");
        } else 
        {
            System.out.println("The first non-repeating character is: " + ch);
        }
    

         }
        }
        
	


