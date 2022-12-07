public class Animal {
    public int limbs;
    public String name;
    public String size;
    public String eyeColor;

    public Animal(){}

    public Animal(int limbs, String name, String size, String eyeColor){
        this.limbs = limbs;
        this.name = name;
        this.size = size;
        this.eyeColor = eyeColor;
    }

    public void breathe(){
        System.out.println("Wheeze");
    }

    public void makeNoise(){
        System.out.println("Grunts in Animal");
    }
}
