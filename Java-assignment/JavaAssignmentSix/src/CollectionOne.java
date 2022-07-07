import java.util.*;


class Collections1{
    long phoneNumber;
    String name,email;
    char gender;
    public Collections1(long phoneNumber,String contactName,String email,char gender)
    {
        this.phoneNumber=phoneNumber;
        this.name=name;
        this.email=email;
        this.gender=gender;
    }

}
public class CollectionOne
{
    public static void main(String[] args) {
        Map<Long,Collections1>map=new TreeMap<>(Collections.reverseOrder());
        Collections1 c1=new Collections1(658,"Nisha","nisha@gmail.com",'F');
        Collections1 c2=new Collections1(451,"Prateek","prateek@gmail.com",'M');
        Collections1 c3=new Collections1(732,"Veena","veena@gmail.com",'F');
        Collections1 c4=new Collections1(123,"Madhav","madhav@gmail.com",'M');
        map.put(1L,c1);
        map.put(2L,c2);
        map.put(3L,c3);
        map.put(4L,c4);


        for(Map.Entry<Long, Collections1> entry:map.entrySet()){
            long key=entry.getKey();
            Collections1 c5=entry.getValue();
          System.out.println(key+" List:");

            System.out.println("phone number: "+c5.phoneNumber+" contact name: "+c5.name+" email: "+c5.email+" gender: "+c5.gender);
        }
        System.out.print(" ");

    }
}