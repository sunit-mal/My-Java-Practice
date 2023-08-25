//  Multi level inheritance 

public class MultiLevelInheritance {
    public static void main(String[] args) {
        Child3 ch = new Child3("Sunit", 20);
        ch.walking();
        ch.checkage();
    }
}

class Parents {
    String name;
    int age;

    Parents() {
        System.out.println("Creating default Constructor");
    }

    Parents(String name, int age) {
        this(); // Here this keyword use to called "Parents()" constructor.
        this.name = name; // Here this keyword use to access different parameter(name)
        this.age = age;
    }

    void walking() {
        System.out.println(name + " is walking");
    }

    void checkage() {
        System.out.println(name + " is " + age + " year old");
    }
}

class Child1 extends Parents{
    Child1(String name , int age){
        super(name,age);    //  Here Super keyword use to call immediate parents class (Parents)
    }
}

class Child2 extends Child1{

    Child2(String name, int age) {
        super(name, age);
    }
    
}

class Child3 extends Child2{

    Child3(String name, int age) {
        super(name, age);
    }
    
}