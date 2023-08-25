public class Instance_Inheritance {
    int i = 10;
    {
        m1();
        System.out.println("First instance block");
    }

    Instance_Inheritance() {
        System.out.println("Constructor");
    }

    public static void main(String[] args) {
        Instance_Inheritance t = new Instance_Inheritance();
        System.out.println("main method");

    }

    public void m1() {
        System.out.println(j);
    }

    {
        System.out.println("second instance block");
    }
    int j = 20;
}

class child_instance extends Instance_Inheritance {

    int x = 10;
    {
        m2();
        System.out.println("Child First Instance Block");
    }

    
    child_instance() {
        System.out.println("Child Class Constructor");
    }

    public static void main(String[] args) {
        child_instance t1 = new child_instance();
        System.out.println("Child Class Main Method");

    }

    public void m2() {
        System.out.println(y);
    }

    {
        System.out.println("Child Second Instance Block");
    }
    int y = 20;

}
