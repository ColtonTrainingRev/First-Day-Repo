public class Operators {
    public static void main(String[] args){
        // = is the assignment operator
        int add = 5 + 5; // add = 10
        int subtract = 5 - 5; //subtract = 0
        int multiply = 5 * 5; //multiply = 25
        int divide = 5 / 5; //divide = 1
        int modulus = 5 % 5; //modulus = 0 -- no remainder

        /*
         * there are some nice quality of life mathmatical operators that are good to know: you can take
         * one of the math operators and add the assignment operator to it in order to change the value
         * of the variable
         */

         int number = 5;
         System.out.println(number);
         number = number + 5;// this adds 5 to number and reassigns it to itself
         System.out.println(number);
         number += 5;//equivalent to number = number + 5
         System.out.println(number);
         
         /*
          * if you want to increase or decrease a value by 1, you can use the increment (++) or decrement (--)
          * operators to make that happen
          */

          int value = 5;
          System.out.println(value++);

          value = 5;
          System.out.println(++value);

          /*
           * There are also logical operators you can see in action in the control flow java files, but here's a
           * curated list of logical operators:
           * > Greater than
           * < Less than
           * >= Greater than or equal to
           * <= Less than or equal to
           * == equal
           * ! Not operator
           * && Logical and operator
           * || Logical or operator
           * 
           */
    }    
}
