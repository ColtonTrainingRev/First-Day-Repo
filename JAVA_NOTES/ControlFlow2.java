public class ControlFlow2 {
    public static void main(String[] args){
        int visa = 50;
        int cost = 50;

        if(visa > cost){
            System.out.println("You made a purchase!");
        } else if(visa == cost){
            System.out.println("No money left on gift card");
        } else {
            System.out.println("Not enough funds for purchase");
        }

        //You can use this for user authentication
        String username = "username";
        String password = "passw0rd";

        if(username.equals("username")){
            if(password.equals("passw0rd")){
                System.out.println("Logged in successfully");
            }
        }

        //combining our newfound logic
        if(username.equals("username") && password.equals("passw0rd")){
            System.out.println("Logged in successfully");
        }
    }
}
