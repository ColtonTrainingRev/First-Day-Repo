import java.util.ArrayList;
import java.util.List;

public class MoreDataStructures {
    /*
     * Two interfaces you are going to want to become familiar with are the List and Set interfaces. These two
     * give you access to some of the more common data structures that you will want to use in your Java code.
     */

    /*
     * Lists are going to be your most flexible data structures: Lists are indexable, they retain order of
     * insertion and they allow duplicate values. The most common kind of List you will use is an ArrayList
     * Lists make use of Generics: these are placeholders that tell Java what KIND of data is going to be
     * used with the object in question
     */
    public static void main(String[] args){
        List<String> namesList = new ArrayList<>();//ArrayList has diamond brackets as well, but they stay empty
        namesList.add("Billy");
        namesList.add("Sally");
        namesList.add("Teddy");
        namesList.add(0, "Adam");
        /*
         * Above we have a great example of method overloading: it is the same add method called in all instances,
         * but tje way the method works changes based on how many arguments we provide the method. If we don't
         * provide and index position, out String gets added to the end of the list. If we provide an index
         * position, we can determing what index position it gets set to.
         */
        System.out.println(namesList);

        

    }
}
