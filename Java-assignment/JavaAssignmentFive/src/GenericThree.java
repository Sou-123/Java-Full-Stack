
public class GenericThree {
	
	 public static final  <T> void swap(T[] array, int i , int j){
         T temp = array[i];
         array[i] = array[j];
         array[j] = temp;
     }

    public static void main(String[] args) {
        Integer [] number = {6,9,2,4,1,8,3,4};
        swap(number,2,4);                           
        for(Integer one : number){
            System.out.print(one +" ");
        }
        System.out.println();
        String [] string = {"What","is","your","name","?"};
        swap(string,2,4);                               
        for (String word: string) {
            System.out.print(word +" ");
        }
    }
}


