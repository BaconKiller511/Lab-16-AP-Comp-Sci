
// Lab08vst.java
// The "Palindrome" Program
// This is the student starting file for Lab08.

import java.util.Scanner;

public class Lab08vst
{
    public static void main (String[] args)
    {
        Scanner input = new Scanner(System.in);
        boolean notFinished = false;
        do
            {
               // for the B and A level, the following code needs to be 'wrapped' inside a while loop of some sort 
            System.out.print("Enter a string  ===>>  ");    //Prompt for the string to be converted
            String str = input.nextLine();                  //Enter the string to be converted. Can be a single word or a phrase
            System.out.println();
            System.out.println("Entered String:     " + str);
            System.out.println("Palindrome:         " + Palindrome.isPal(str));
            System.out.println("Almost Palindrome:  " + Palindrome.almostPal(str));     // If doing the C or B level, this will always be true
            System.out.print("Do you wish to repeat this program [Y/N]?  ===>>  ");     // prompt the user to repeat the program
            String repeat = input.nextLine();   // this should contain y or Y if the user wants to run it again. Anything else and it ends.
               // for the B and A level, you need to test the value of repeat and adjust your notFinished variable accordingly. 
            String s = repeat.toLowerCase();
            notFinished = (s.equals("y") || s.equals("yes"));
            System.out.println(); // Prints a blank line after the program ends.
            }
        while (notFinished);
    }
    
}
