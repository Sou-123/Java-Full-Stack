import java.util.ArrayList;
import java.util.Arrays;

public class LambdaFour {
    public static void main(String[] args) throws CloneNotSupportedException {
        ArrayList<String> numbers = new ArrayList<>(Arrays.asList("Dell","Apple","Realme","Lenovo","Samsung"));
        for (int i = 0; i <=numbers.size()-1; i++) {
            int a = numbers.get(i).length();
            if (a % 2 !=0) {
                numbers.remove(i);
                
            }
        }
        System.out.println(numbers); 
    }
}

