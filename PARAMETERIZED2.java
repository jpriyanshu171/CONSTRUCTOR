public class PARAMETERIZED2 {
    PARAMETERIZED2(String name){
        System.out.println("Constructor with one argument "+name);
    }
    PARAMETERIZED2(String name,int age){
        System.out.println("Constructor with two arguments "+name+" and "+age);
    }
    PARAMETERIZED2(int id){
        System.out.println("Constructor with one argument "+id);
    }
    public static void main(String[] args) {
        PARAMETERIZED2 obj=new PARAMETERIZED2("Priyanshu");
        PARAMETERIZED2 obj1=new PARAMETERIZED2("Jaiswal");
        PARAMETERIZED2 obj2=new PARAMETERIZED2("Jaiswal",20);
        PARAMETERIZED2 obj3=new PARAMETERIZED2(101);


    }
}
