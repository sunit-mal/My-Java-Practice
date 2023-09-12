public class ConstructorPrivate {
    public static void main(String[] args) {
        Person person = Person.createPerson("John", 20);
        System.out.println("Name: " + person.getName());
        System.out.println("Age: " + person.getAge());
    }
}

class Person {
    private String name;
    private int age;

    // Constructor
    private Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getter
    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    // Static method
    public static Person createPerson(String name, int age) {
        return new Person(name, age);
    }
}
