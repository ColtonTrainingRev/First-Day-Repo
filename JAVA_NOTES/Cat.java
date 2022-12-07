public class Cat extends Animal {

    public Cat() {
    }

    public Cat(int limbs, String name, String size, String eyeColor) {
        super(limbs, name, size, eyeColor);
    }

    public static void main(String[] args){
        Cat myCat = new Cat(4, "Shadow", "Small", "Orange");
        myCat.breathe();
        myCat.makeNoise();
        System.out.println(myCat.name);
    }

    @Override
    public void breathe() {
        System.out.println("purr purr");
    }

    @Override
    public void makeNoise() {
        System.out.println("Meow!");
    }

    
    
}
