//instant flow control

public class Instance {

    int i = 10;
    {
        m1();
        System.out.println("First instant block");
    }

    Instance() {
        System.out.println("Constructor");
    }

    public static void main(String[] args) {
        Instance t = new Instance(); // if comments then o/p only --> main method 
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
