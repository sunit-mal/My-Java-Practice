public class NestingOfInnerClass {
    // class B{
    // class C{
    // public void MethodOne(){
    // System.out.println("Nested Class");
    // }
    // }
    // }
    public static void main(String[] args) {
        // NestingOfInnerClass a = new NestingOfInnerClass();
        // NestingOfInnerClass.B b = a.new B();
        // NestingOfInnerClass.B.C c = b.new C();
        // c.MethodOne();
        A a = new A();
        A.B b = a.new B();
        A.B.C c = b.new C();
        c.print();
    }
}

class A {
    class B {
        class C {
            void print() {
                System.out.println("Nested Class");
            }
        }
    }
}