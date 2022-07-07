
class Main2{
    public static void main(String[] args) {
        GenericFour stringOne = new GenericFour();
        stringOne.setKey("11254");
        stringOne.setValue("Appear only string");

       
        stringOne.setKey("Today is ");
        stringOne.setValue(new java.util.Date().toString());    

        System.out.println(stringOne);
    }
}




public class GenericFour
{
    private String key;
    private String value;

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Pair { " + key + " "+ value + " }";
    }
}