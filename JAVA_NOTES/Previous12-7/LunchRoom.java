public class LunchRoom {
    public static void main(String[] args){
        //both options below are valid ways of creating burrito and croissant objects.
        //We can reference their parent class, Food, as the type, and then make the specific type of food object
        Food myBurrito = new Burrito();
        Food myCroissant = new Croissant();
        
        myBurrito.eat();
        myCroissant.eat();
    }
}
