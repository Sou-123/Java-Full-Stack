
public class StringThree {
	
	public static void main(String[] args) {
        String str="Java string pool refers to collection of strings which are stored in heap memory";

        String stringOne=str.toLowerCase();
        System.out.println(stringOne);

        String stringTwo=str.toUpperCase();
        System.out.println(stringTwo);

        String stringThree=str.replace('a','$');
        System.out.println(stringThree); 

       if(str.contains("collection")) {
           System.out.println("Contains word 'collection'");
       }
       else {
           System.out.println(" Does not contains word 'collection'");
       }


       String str1="java string pool refers to collection of strings which are stored in heap memory";
       if(str.equals(str1)) {
           System.out.println("The strings are matching");
       }
       else {
           System.out.println("The strings are not matching");
       }


     if(str.equalsIgnoreCase(str1)==true){
            System.out.println("The strings are matching");
        }
     else {
         System.out.println("The strings  are not matching");
     }
    }

}
