// Document Section

class Employee {

    void print() {
        System.out.println("Employee Works");
    }
}

class Doctor extends Employee {
    void print() {
        System.out.println("Doctor Works");
    }
}

class Teacher extends Employee {
    void print() {
        System.out.println("Teacher Works");
    }

}

public class WorkShop {
    public static void main(String[] args) {
        Employee obj;
        
        // obj = new Doctor();
        obj = new Teacher();

        obj.print();
    }
}
