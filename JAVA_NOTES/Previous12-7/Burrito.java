public class Burrito extends Food {

    public Burrito(String name, String taste, int calorieCount, boolean isCandy, boolean isCooked, String texture,
            String smell) {
        super(name, taste, calorieCount, isCandy, isCooked, texture, smell);
    }

    public Burrito() {
    }

    @Override
    public void cook() {
        System.out.println("Chop the veggies, fry the meat, wrap in tortilla");
        
    }

    @Override
    public void eat() {
        System.out.println("Chomp chomp");
        
    }

    @Override
    public void store() {
        System.out.println("I store the contents in the fridge");
        
    }
    
}
