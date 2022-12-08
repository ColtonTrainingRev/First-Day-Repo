public class ExceptionsPlayground {
    public static void main(String[] args){
        String[] names = {"Ted", "Sally", "George", "Billy", "Fred"};
        try {
            for(int i = 0; i < names.length; ++i){
                if(names[i].equals("Billy")){
                    throw new NoBilly("No Billy's allowed!");
                } else{
                    System.out.println("No Billy's found, continue");
                }
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        try{
            checkForFred();
        } catch(NoFred e){
            System.out.println(e.getMessage());
        }
    }
    //Know the difference between checked and unchecked exception
    //Checked needs to be placed within a try/catch block
    public static void checkForFred() throws NoFred{
        String[] names = {"Ted", "Sally", "George", "Billy", "Fred"};
        for(int i = 0; i < names.length; ++i){
            if(names[i].equals("Fred")){
                throw new NoBilly("No Fred's allowed!");
            } else{
                System.out.println("No Fred's found, continue");
            }
        }
    }
}
