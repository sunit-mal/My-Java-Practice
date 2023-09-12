
class SingletonPerson {
    private static SingletonPerson instance; // The single instance of the class
    private String name;
    private int age;

    // Private constructor to prevent direct instantiation
    private SingletonPerson(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Public method to provide a single instance of the class
    public static SingletonPerson getInstance() {
        if (instance == null) {
            instance = new SingletonPerson("DefaultName", 0);
        }
        return instance;
    }

    // Getter and setter methods
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

public class SingletonClass {
    public static void main(String[] args) {
        // Get the singleton instance
        SingletonPerson person = SingletonPerson.getInstance();

        // Modify the instance
        person.setName("John");
        person.setAge(20);

        // Access and print the instance's properties
        System.out.println("Name: " + person.getName());
        System.out.println("Age: " + person.getAge());
    }
}
