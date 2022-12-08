public class TheBaseClass {
    public String name;
    public int age;
    public boolean isAwake;

    /*
     * In Java, ALL classes inherit from the base Object class. This is how we get access to things like constructors
     * or helpful methods like the toString() method.
     */
    //This toString method is inherited from the base Java Object class, there are some others that are inherited as well.
    @Override
    public String toString(){
        //Whatever value we return here will print to the console anytime we call the print method on this object
        return super.toString();
    }
    public static void main(String[] args){
        TheBaseClass obj = new TheBaseClass();
        System.out.println(obj);
    }
}
