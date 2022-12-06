public class Loops {
    public static void main(String[] args){
        for(int i = 0; i < 10; ++i){
            if(i%3 == 1){
                System.out.println("beep");
            } else if(i%3 == 2){
                System.out.println("boop");
            } else if(i%3 == 0){
                System.out.println("bop");
            }
        }
    }
}
