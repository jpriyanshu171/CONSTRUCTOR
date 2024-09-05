// A constructor that has parameters is known as parameterized constructor. If we want to initialize fields of the class with our own values, then use a parameterized constructor.
public class PARAMETERIZED {
    String name;
    int age;
    PARAMETERIZED(String name,int age){
        this.name=name;
        this.age=age;
    }

    public static void main(String[] args) {
        PARAMETERIZED obj=new PARAMETERIZED("Priyanshu",20);
        System.out.println("Name="+obj.name);
        System.out.println("Age="+obj.age);
    }
}
