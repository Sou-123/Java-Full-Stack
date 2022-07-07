import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class GenericTwo {
	
	 public static void main(String[] args) {
	        HashMap<Integer , Double> randomMap= new HashMap<>();
	        Random random = new Random();

	        for(int i = 1 ; i <= 10 ; i++){
	            int keys = random.nextInt();
	            double values = random.nextDouble();
	            randomMap.put(keys,values);
	        }

	        for(Map.Entry entry : randomMap.entrySet()){
	            System.out.println("Key : "+entry.getKey()+" Value : "+entry.getValue());
	        }
	    }
	}


