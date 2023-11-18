public class ObjectToString{
    public static void main(String[] args) {
        Integer number = 42;
        String numberString = number.toString();
        System.out.println("Number as String: " + numberString);
        MyClass myObject = new MyClass("Hello, Object to String!");
        String objectString = myObject.toString();
        System.out.println("Custom object as String: " + objectString);
    }
}
class MyClass {
    private String message;
    public MyClass(String message) {
        this.message = message;
    }
    @Override
    public String toString() {
        return "MyClass{" +
                "message='" + message + '\'' +
                '}';
    }
}