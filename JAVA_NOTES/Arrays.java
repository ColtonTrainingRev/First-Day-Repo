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
    }    
}
