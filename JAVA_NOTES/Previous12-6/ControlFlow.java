public class ControlFlow {
    public static void main(String[] args){
        int visaCard = 100; //this visaCard variable represents 100$ you got for your Bday
        int burgerCost = 45; //this burgerCost variable represents the 45$ charge
        if(visaCard >= burgerCost){
            System.out.println("Congrats on buying a burger! Gordon Ramsay is pleased to serve you today");
        }

        int lowCard = 40;

        if(lowCard >= burgerCost){
            System.out.println("Congrats on buying a burger! Gordon Ramsay is pleased to serve you today");
        }

        //Comparison operators
        /*
         * > Greater than
         * < Less than
         * >= Greater than or equal
         * <= Less than or equal
         * == equal
         * 
         */

        //  int numOne = 10;
        //  int numTwo = 32;

        //  if(numOne > numTwo)

        int newCard = 100;
        int pizzaCost = 5;

        if(newCard >= pizzaCost){
            System.out.println("Enjoy your pizza");
        }

        //you can inverse your logic by using the not operator "!"
        if(newCard != pizzaCost){
            System.out.println("No pizza for you!");
        }


    }
}
