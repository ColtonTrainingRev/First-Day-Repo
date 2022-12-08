public class Loops {
    public static void main(String[] args){
        for(int i = 0; i < 10; ++i){
            if(i%3 == 1){
                System.out.println("beep");
            } else if(i%3 == 2){
                System.out.println("boop");
            } else if(i%3 == 0){
                System.out.println("bop");
            }
        }

        // storing numbers in arrays
        int[] numbers = {1, 3, 5, 9, 15, 34, 73, 8,12345};
        //to access contents of an array, we use index positions from 0 to sizeof(array) - 1
        for(int x = 0; x < numbers.length; ++x){
            if(numbers[x] % 2 == 0){
                System.out.println("x is even");
            } else {
                System.out.println("x is odd");
            }
        }

        //while loops
        int x = 0;
        while(x <= 10){
            System.out.println(x);
            ++x;
        }

        //do while loops
        x = 0;
        do{
            System.out.println(x);
            ++x;
        } while(x <= 10);

    }
}
