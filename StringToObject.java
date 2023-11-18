public class StringToObject{
    public static void main(String[] args) {
        String strInt = "123";
        Integer intValue = Integer.valueOf(strInt);
        System.out.println("Converted Integer: " + intValue);
        String strDouble = "45.67";
        Double doubleValue = Double.valueOf(strDouble);
        System.out.println("Converted Double: " + doubleValue);
        String strCustom = "Hello, World!";
        MyObject customObject = new MyObject(strCustom);
        System.out.println("Converted Custom Object: " + customObject);
    }
}
class MyObject {
    private String value;
    public MyObject(String value) {
        this.value = value;
    }
    @Override
    public String toString() {
        return "MyObject{" +
                "value='" + value + '\'' +
                '}';
    }
}