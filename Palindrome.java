
/**
 * Write a description of class Palindrome here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

public class Palindrome
{
    /*
     * Precondition:  s is an arbitrary String.
     * Postcondition: The value of true is returned if s is a Palindrome, false otherwise.
     * Note:          >>>>> This method is required for all 3 versions  <<<<<
     */
    public static boolean isPal(String s)
    {
        boolean result = false;
        String word = s;
        String pal = "";
        int length = s.length();
        word = s.toLowerCase();
        
        for (int k = length; k >= 1; k--)
            {
                pal = pal + word.substring(k-1, k);
            }
        if (pal.equals(word))
            {
                result = true;
            }
            
        return result;
    }  

    
    /*
     * Precondition:  s is a String of one character.
     * Postcondition: The value of true is returned if s is a letter and false otherwise.
     * Note:          >>>>> This method is required for the A version  <<<<<
     */
    private static boolean isLetter(String letter)
    {
         boolean result = true;
        if (letter.equals(" ") || letter.equals(",") || letter.equals(".") || letter.equals("'") || letter.equals("?") || letter.equals("!"))
            {
                result = false;
            }
         
         return result;      
    }

    
    /*
     * Precondition:  s is an arbitrary String.
     * Postcondition: All non-letter characters are removed from s, and the "purged" String is returned.
     * Note:          >>>>> This method is required for the A version  <<<<<
     */
    private static String purge(String s)
    {
        String result = "";
        int length = s.length();
        for (int k = 0; k < length; k++)
            {
                String letter = s.substring(k, k + 1);
                if (isLetter(letter) == false)
                    {
                        letter = "";
                    }
                result = result + letter;
            }
        
        return result;        
    }

    
    /*
     * Precondition:  s is an arbitrary String.
     * Postcondition: After purging all non-letter characters from s,
     *                the value of true is returned if the resulting String is a Palindrome, false otherwise.
     * Note:          >>>>> This method is only completed for the 100 point version  <<<<<
     */
    public static boolean almostPal(String s)
    {
        boolean result = false; 
        s.toLowerCase();
        String word = s;
        int length = s.length();
        
        if (s.indexOf(" ") > 0)
            {
                String pal = purge(s);
                for (int k = length; k >= 1; k--)
                   {
                      pal = pal + word.substring(k-1, k);
                   }
                if (pal.equals(word))
                   {
                      result = true;
                   }
            }
            
        return result;      
    }

}