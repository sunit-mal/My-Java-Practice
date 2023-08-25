//  Using abstract methods and classes.
public class  Code1{
    public static void main(String[] args) {
       class2 obj = new class2();
       obj.display(); 
    }
}

abstract class class1{
    abstract void display();
}

class class2 extends class1{
    void display(){
        System.out.println("I am present in class2");
    }
}