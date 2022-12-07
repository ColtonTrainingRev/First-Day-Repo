public class Arrays {
    public static void main(String[] args){
        /*
         * Arrays are data structures in Java that we can use to hold other data. Arrays are immutable structures
         * that are set once they are created.
         */
        int[] numbers = {1, 3, 5, 7, 9};

        int[] evenNumbers = new int[4];
        int num = 2;
        for(int x = 0; x < evenNumbers.length; ++x){
            evenNumbers[x] = num*(x+1);
        }
        for(int x = 0; x < evenNumbers.length; ++x){
            System.out.println(evenNumbers[x]);
        }

        /*
         * Arrays will work a little differently if you are not working with primitives: let's see what happens
         * when we make an array of strings instead of numbers
         */

         String[] words = {"Apple", "Hello World", "Go Portland Trailblazers", "Revature", "Coffee"};

         for(int x = 0; x < words.length; ++x){
            System.out.println(words[x]);
         }

         String[] noWordsYet = new String[3];
         String characters = "abcd";
         for(int x = 0; x < noWordsYet.length; ++x){
            noWordsYet[x] = characters;
            characters += characters;
         }
         //Strings are IMMUTABLE objects
         //characters += characters replaces the old string value with a new one.
    }    
}
