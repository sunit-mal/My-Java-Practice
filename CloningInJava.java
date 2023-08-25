// Cloning in java

public class CloningInJava {
    public static void main(String[] args) throws CloneNotSupportedException {
        // Shallow Cloning
        System.out.println("\n----------Shallow Cloning--------");

        ClassOne obj1 = new ClassOne();
        obj1.setValue("Name");

        // Object Cloning
        ClassOne obj2 = obj1;
        System.out.println("\nObj1 \t\t Obj2\n");
        System.out.print(obj1.hashCode());
        System.out.print("\t");
        System.out.println(obj2.hashCode());
        obj1.display();
        System.out.print("\t\t");
        obj2.display();

        obj2.setValue("Change");
        System.out.println("\n\nAfter Insert value in Clone refarence\n");
        System.out.print(obj1.hashCode());
        System.out.print("\t");
        System.out.println(obj2.hashCode());
        obj1.display();
        System.out.print("\t\t");
        obj2.display();

        // Deep Cloneing
        System.out.println("\n\n----------Deep Cloning--------");

        ClassTwo obj3 = new ClassTwo();

        obj3.setValue("Name");

        // Object Cloning
        ClassTwo obj4 = (ClassTwo) obj3.clone();

        System.out.println("\nObj3 \t\t Obj4\n");
        System.out.print(obj3.hashCode());
        System.out.print("\t");
        System.out.println(obj4.hashCode());
        obj3.display();
        System.out.print("\t\t");
        obj4.display();

        obj4.setValue("Change");
        System.out.println("\n\nAfter Insert value in Clone refarence\n");
        System.out.print(obj3.hashCode());
        System.out.print("\t");
        System.out.println(obj4.hashCode());
        obj3.display();
        System.out.print("\t\t");
        obj4.display();
    }
}

class ClassOne {
    private String b;

    void setValue(String a) {
        b = a;
    }

    void display() {
        System.out.print(b);
    }
}

class ClassTwo implements Cloneable {
    private String b;

    void setValue(String a) {
        b = a;
    }

    void display() {
        System.out.print(b);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
