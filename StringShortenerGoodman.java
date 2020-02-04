//Corbin Goodman
//String Shortener

import java.util.Scanner;

public class Main
{
    
    public static void main (String[]args)
    {
        
        Scanner scan = new Scanner (System.in);
        
        //User types message and message becomes lowercase
        System.out.println ("Type the message to be shortened:");
        String message = scan.nextLine ();
        message = message.toLowerCase();

        //If message is fewer than 10 charaters it doesn't need shortened
        if (message.length () < 10)
        {
            System.out.println ("This doesn't need shortening!");
        }
        else
        {
            String newMessage = removeVowels(removeDuplicates(message));
            System.out.println(newMessage);
        }
    }
    
    //Removes Duplicate Letters
    public static String removeDuplicates(String message)
    {

        String message2 = "";

        for (int x = 1; x < message.length(); x++)
        {

            if (message.charAt(x - 1) == (message.charAt(x)))
            {
                message2 += "";
            }
            else
                message2 += (message.charAt(x - 1));
        }

        return message2; 
    }
    
    //Removes Vowels
    public static String removeVowels(String message)
    {
        String message3 = "";
        
        for (int y = 1; y < message.length(); y++)
        {
            if (isVowel(message.charAt(y - 1)) && (message.charAt(y - 1) != ' '))
            {
                message3 += "";
            }
            else
                message3 += message.charAt(y - 1);
            
        }
        
        return message3;
    }
    
    //Checks if a letter is a vowel
    public static Boolean isVowel(char letter)
    {
         char[] vowels = {'a', 'e','i','o','u'};
         
         for (char x : vowels)
         {
             if (letter == x)
             {
                 return true;
             }
         }
         
         return false;
    }
    
}
