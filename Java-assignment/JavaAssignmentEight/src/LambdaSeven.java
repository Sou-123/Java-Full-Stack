
import java.util.*;
  
public class LambdaSeven {
    public static void main(String[] args)
    {
       
        Map<Integer, String> map = new HashMap<Integer, String>();
  
       
        map.put(12, "Soumya");
        map.put(19, "Nidhi");
        map.put(22, "Krishna");
     
       
        System.out.println("The initial mappings are: " + map);
  
     
        System.out.println("The set is: " + map.entrySet());
        
        
        StringBuilder str= new StringBuilder(map.entrySet().toString());    
        System.out.println("The string is: " + str);
    }
}