public class LetterInventory {
    public static void main(String args[]){
        //first method
        int[] letterCount = new int[25];
        String test = "Hello";
        for (int i=0; i < test.length(); i++) {
            int number = (int) test.toLowerCase().charAt(i);
            System.out.println(number);
        }
    }
}