import java.util.Scanner;

public class LetterInventory {
    public static void main(String args[]){
        //adds user input capability
        Scanner scan = new Scanner(System.in);
        //initialize
        int yesOrNo;
        do { 
            // initialize Array for counting each letter: position 0 is a, 25 is z, etc.
            int[] letterCount = new int[26];
            //user input
            System.out.println("Enter a word or a short phrase and we'll give you a count" 
            + " of A-Z characters:");
            //problem with nextLine, need to fix
            //gets user string and sets to lower case   
            String userString = scan.next().toLowerCase();
            //call setLetterCount
            setLetterCount(userString, letterCount);
            //call printLetterCount
            printLetterCount(letterCount); 
            //prompt to play again 
            System.out.println("Would you like to test another String? (0 yes 1 no)");
            yesOrNo = scan.nextInt();
            } while (yesOrNo == 0);
    }//end method main

    public static int[]setLetterCount(String userString, int[] letterCount) {
         //runs through each char in string
         for (int i=0; i < userString.length(); i++) {
            //getting the ASCII value of the character
            int charValue = (int) userString.charAt(i);
            //adds to array if values equal lowercase ASCII alphabet
            //position in array based on ASCII value (e.g a(97) is position 0)
            if(charValue > 96 && charValue < 123) {
                letterCount[Math.abs(97 - charValue)]++;
            }//end if statement
        } //end for loop (run through string)
        return letterCount;
    }// end setLetterCount

    public static void printLetterCount(int[] letterCount){
        //letter count display for a-z
        //iterate over the array, prints final count of each letter from a-z
        System.out.println("Letter Count:");
        for (int row = 0; row < 26; row++) {
            //casting into character value
            //don't print if letter has zero occurences
            if (letterCount[row] != 0){
                System.out.println((char)(row + 'a') + ": " + letterCount[row]);
            }// end if statement
       }
    }//end printLetterCount
}//end Class LetterInventory