public class Methods {
    /*
     * Methods are reusable code that is attached to a class or interface. They are useful when you need to repeatedly 
     * excecute some code but don't know when the code will need to be executed. Instead of having to rewrite
     * your code, you just call the method you create.
     */

    /*
     * public is the access modifier: this method can be referenced anywhere in our code
     * void is the return type: this method doesn't return any data
     * doSomething is the name of the method, so it is how we call/invoke the method
     * input is the name of the parameter associated with the method: whatever String we provide the method
     * will be reference by the variable input inside of the method
     */
    public static void main(String[] args){
       Methods obj = new Methods();
       obj.doSomething("Oogie Boogie");
       obj.addFive(6);
       //the below method is reusable because it's assigned to a variable.
       int returnValue = obj.addFive(6);
       System.out.println(returnValue);
       //The below method is not reusable
       System.out.println(obj.addFive(6));
    }
     public void doSomething(String input){
        System.out.println("You entered the string: " + input);
     }
     public int addFive(int num){
        return num + 5;
     }
     public int exceptionsHappen(int num){
        //You can either return the expected data type or you can throw an exception: it must be one or the other
        try {
            return 100/num;
        } catch (ArithmeticException e) {
            throw new RuntimeException(e.getMessage());
        }
     }
}
