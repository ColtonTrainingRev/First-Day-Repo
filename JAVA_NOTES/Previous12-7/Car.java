public class Car {
    public String owner; 
    public int gas;
    public static int count; //anytime you see the static keyword in a class, it means the field/method is shared amongst all instances of the class
    //This is a custom constructor that assigns values when our car object is created
    public Car(String startingOwner, int startingGas){//This is a 1 arg constructor
        //"this" is a reference to the object being created
        //We are setting whatever the of startingOwner is to the object's owner field
        this.owner = startingOwner;
        this.gas = startingGas;
        ++count;//Notice we don't need the "this" keyword because the field is shared across all objects of the Car class
    }
    //You can create more than one constructor, the compiler will know how to handle them in your code depending
    // on the arguments you provide.
    public Car(){++count;} //This is a default, no args constructor
    public static void main(String[] args){
        //for this example we can pretend that we are writing an app for a car videogame
        //All cars are going to share some properties in our code
        //All classes have a special method (methods are repeatable code) that handles creating an object
        //of the class. This is called instantiation
        Car myCar = new Car(); //anytime you see () after a word or phrase, you know that it is a method being called
        myCar.owner = "George Clooney";//Here we set the value for owner of myCar

        System.out.println("The owner is: " + myCar.owner);//Output owner

        Car mattDamonCar = new Car("Matt Damon", 100);

        System.out.println(mattDamonCar.owner);
        //to call the drive method I MUST have a Car object to do it: I can't call the method by itself
        myCar.drive(); //make sure not to forget the () when you call a method
    }

    /*
     * public: access modifier, in this case, we are saying that this method can be called by any object in our code
     * void: return type, in this case, we are saying this method does not return any data
     * drive: name of our method, method names should give a decent idea of what is being accomplished by your code
     */
    public void drive(){
        System.out.println("vroom vroom!");
        this.gas -= 10;
    }

    public static void checkCount(){
        System.out.println("There are " + count + " cars created.");
    }
}
