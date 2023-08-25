//  Implement the below diagram by using abstract class’s polymorphism and dynamic binding.

public class Code3 {
    public static void main(String[] args) {
        c3 obj = new c3();
        obj.f1();
        obj.f2();
        obj.f3();
    }    
}
abstract class c1{
    abstract void f1();
    abstract void f2();
}

abstract class c2 extends c1{
    void f1(){
        System.out.println("F1 Function in class c2");
    }
    abstract void f3();
}
class c3 extends c2{
    void f1(){
        System.out.println("Function f1 override in class c3");
    }
    void f2(){
        System.out.println("Function f2 in class c3");
    }
    void f3(){
        System.out.println("Function f3 in class c3");
    }
}
