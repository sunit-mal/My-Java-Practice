interface test{
    void run();
}

class testImplementation implements test{
    public void run(){
        System.out.println("Hello World");
    }
}

public class InterfacePractice {
    public static void main(String[] args) {
        testImplementation obj = new testImplementation();
        obj.run();
    }
}
