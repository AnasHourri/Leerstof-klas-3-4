import java.util.Arrays;

public class StringCalculator {
    /**
     * Useful code snippets to use in the implementation
     */
    public void usefulCode() {
        String s="a:b=c";
        s.split("[:=]");  //returns array {a,b,c}
        String n="5";
        Integer.parseInt(n); // returns integer 5
    }

    public static int calculate(String input){
        if(input.isEmpty()){
            return 0;
        }
        return -1;
    }



}
