public class LetterInventory {
    public static void main(String args[]){
        //first method
        // Array for counting each letter: position 0 is a, 25 is z, etc.
        int[] letterCount = new int[25];
        //test string, will add user input later
        String test = "Hello";
        //runs through each char in string
        for (int i=0; i < test.length(); i++) {
            //getting the ASCII value of the character (lowercase)
            int number = (int) test.toLowerCase().charAt(i);
            System.out.println(number); //test code
            //lowercase ASCII alphabet
            if(number < 124 && number > 96){
                //add to lettercount
            } else {
                //disregard
            }
        }
    }
}