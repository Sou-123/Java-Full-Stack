
import java.util.ArrayList;


class LambdaSix {
    public static void main(String[] args) {
        ArrayList<String> replace = new ArrayList<>();
        replace.add("prateek");
        replace.add("nisha");
        replace.add("nidhi");
        replace.add("vishnu");
        replace.add("bindhu");

      replace.replaceAll((String) ->
             String.equals(replace) ? String:String.toUpperCase()); 
        System.out.println(replace); 
    }
}