import java.util.Scanner;

public class LetterInventory {
    public static void main(String args[]){
        //adds user input capability
        Scanner scan = new Scanner(System.in);
        // initialize Array for counting each letter: position 0 is a, 25 is z, etc.
        int[] letterCount = new int[26];
        //user input
        System.out.println("Enter a word or a short phrase and we'll give you a count of A-Z characters:");
        String userString = scan.nextLine();

        //call setLetterCount
        setLetterCount(userString, letterCount);
        
        //letter count display for a-z
        //iterate over the array, prints final count of each letter from a-z
        System.out.println("Letter Count:");
       for (int row = 0; row < 26; row++) {
        //casting into character value?
        System.out.println((char)(row + 'a') + ": " + letterCount[row]);
       }
    }//end method main

    /*public String getInput(){

    }//end getInput*/

    public static int[]setLetterCount(String userString, int[] letterCount) {
         //runs through each char in string
         for (int i=0; i < userString.length(); i++) {
            //getting the ASCII value of the character (lowercase)
            int charValue = (int) userString.toLowerCase().charAt(i);
            //System.out.println(charValue); //test code
            //lowercase ASCII alphabet
            //add to lettercount
            switch(charValue){
                case 97 -> letterCount[0]++; //a
                case 98 -> letterCount[1]++; //b
                case 99 -> letterCount[2]++; //c
                case 100 -> letterCount[3]++; //d
                case 101 -> letterCount[4]++; //e
                case 102 -> letterCount[5]++; //f
                case 103 -> letterCount[6]++; //g
                case 104 -> letterCount[7]++; //h
                case 105 -> letterCount[8]++; //i
                case 106 -> letterCount[9]++; //j
                case 107 -> letterCount[10]++; //k
                case 108 -> letterCount[11]++; //l
                case 109 -> letterCount[12]++; //m
                case 110 -> letterCount[13]++; //n
                case 111 -> letterCount[14]++; //o
                case 112 -> letterCount[15]++; //p
                case 113 -> letterCount[16]++; //q
                case 114 -> letterCount[17]++; //r
                case 115 -> letterCount[18]++; //s
                case 116 -> letterCount[19]++; //t
                case 117 -> letterCount[20]++; //u
                case 118 -> letterCount[21]++; //v
                case 119 -> letterCount[22]++; //w
                case 120 -> letterCount[23]++; //x
                case 121 -> letterCount[24]++; //y
                case 122 -> letterCount[25]++; //z
            } //end switch/case
        } //end for loop (run through string)
        return letterCount;
    }// end setLetterCount

    /*public void printLetterCount(int[] letterCount){

    }//end printLetterCount*/
}//end Class LetterInventory