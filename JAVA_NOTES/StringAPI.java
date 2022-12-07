public class StringAPI {
    public static void main(String[] args){
        String myName = "Colton";
        System.out.println(myName);

        myName += " Morris";
        System.out.println(myName);
        
        String[] splitMyName = myName.split(" "); //This method will break apart the string and place in the array in individual parts
        for(int i = 0; i < splitMyName.length; ++i){
            System.out.println(splitMyName[i]);
        }
        //possible coding challenges
        //String numbers = "10 7 15 24 5";
        //challenge find the numbers and add them together

        StringBuilder myWord = new StringBuilder(myName);
        System.out.println(myWord);
        System.out.println(myWord);
        //myWord.reverse();
        myWord.append(" the bold!");
        System.out.println(myWord);

        //StringBuilder does not have a built-in split method, but it is easy to convert your StringBuilder back into a string
        myWord.toString().split(" ");//This is an easy way to split your StringBuilder
        /*
         * Use a regular string if you know you will not need to perform many (if any) operations on your word/phrase
         * Use StringBuilder when you know you will need to perform many operations on your word/phrase
         */
        
    }
}
