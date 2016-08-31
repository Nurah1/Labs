package labs;

import java.util.Scanner;
 
public class Lab6 {

	

		    public static void main(String[] args)
		    {System.out.println("Welcome to The Pig Latin Translator!");
		        System.out.println("Enter a word: ");
		        Scanner scanner = new Scanner(System.in);

		        String findFirstVowel = scanner.nextLine();
		        char vowel = Character.toLowerCase(findFirstVowel.charAt(0));

		        if (vowel == 'a' || vowel == 'e' || vowel == 'i' || vowel == 'o' || vowel == 'u')
		        {
		            String convertToPigLatin = findFirstVowel + "way";
		            System.out.println(convertToPigLatin);
		        }
		        else
		        {
		            String first = findFirstVowel.substring(0,1);
		            String slice = findFirstVowel.substring(1,findFirstVowel.length());
		            System.out.println(slice + first + "ay");
		        }
		    }
		} 
		
		
		
		
