import java.io.IOException;

public class UhOh {
    /*
     * Anytime something goes wrong in your code, Java will "raise/throw" an exception. This is the default behavior
     * for handling things going wrong in your code. If you, as a developer, want to "handle" these exceptions,
     * you have to make use of the try/catch blocks
     */

     public static void main(String[] args){
        try{
            System.out.println(10/0);
        } catch(ArithmeticException e){ //code to execute should the try block of code fail
            //We could print out our own messages or we could print out the exception message "e.getMessage()"
            System.out.println("You can't divide by zero, there's a limit to such things!");
        }

        try{
            //some code
        } catch(IOException e){
            //code to execute should we get an IOException
            System.out.println("File could not be found");
        } catch(ArithmeticException e){
            //code to execute should we get an ArithmeticException
            System.out.println("No maths fo u!");
        }

        try{
            //code that can go wrong
        } catch(IOException | ArithmeticException e){
            System.out.println("Oopsie Daisy!");
        }
        //If you just need a generic exception, you can use Exception: all other exceptions inherit from this one
        try{
            //bad code
        } catch(Exception e){
            System.out.println("Oh my lord, how did you even get here?");
        }
     }
}
