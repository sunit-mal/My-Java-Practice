public class OverRidingInJava {
    public static void main(String[] args) {
        child obj = new child();
        // obj.run();
        obj.display();
        // parent obj1 = new parent();
        // obj1.run();
        parent obj3 = new child();
        // obj3.run();
        System.out.println(obj3.a);
        // child obj4 = new parent();  invalid


    }
}
class parent{
    int a = 3;
    void run(){
        System.out.println("I am present in parent class");
    }
}
class child extends parent{
    // child(){
    //     super();
    // }
    @Override
    void run(){  
        System.out.println("I am present in child class");
        // super.run();
    }
    void display(){
        this.run();
        super.run();
    }
}