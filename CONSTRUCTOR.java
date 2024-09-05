// A constructor in Java is a special method that is used to initialize objects. The constructor is called when an object of a class is created. It can be used to set initial values for object attributes.
// Every time an object is created using the new() keyword, at least one constructor is called.
public class CONSTRUCTOR {
    CONSTRUCTOR() {
//        super();
        System.out.println("Constructor is called");
    }

    public static void main(String[] args) {
        CONSTRUCTOR obj = new CONSTRUCTOR();
    }
}
/*
Why need constructors?

Constructors are used to assign values to the class variables at the time of object creation, either explicitly done by the programmer or by Java itself (default constructor).


How Java Constructors are Different From Java Methods?

1. Constructors must have the same name as the class within which it is defined it is not necessary for the method in Java.
2. Constructors do not return any type while method(s) have the return type or void if does not return any value.
3. Constructors are called only once at the time of Object creation while method(s) can be called any number of times.
4. A constructor in Java can not be abstract, final, static, or Synchronized.
5. Access modifiers can be used in constructor declaration to control its access i.e. which other class can call the constructor.
*/