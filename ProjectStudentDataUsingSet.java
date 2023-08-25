import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ProjectStudentDataUsingSet {
    public static void main(String[] args) {
        Set<student> stSet = new HashSet<>();
        stSet.add(new student("Sunit",2));
        stSet.add(new student("Sohani",3));
        stSet.add(new student("Sunit Mal",2));

        System.out.println(stSet);
        
        student s1 = new student("Sunit", 1);
        student s2 = new student( "Sohani", 2);
        List<Object> li = new ArrayList<>();
        li.add(s1);
        li.add(s2);
        System.out.println(li);
        System.out.println(s1.compareTo(s2));
    } 
}
class student implements Comparable<student>{
    String name;
    int roll;
    student(String name,int roll){
        this.name = name;
        this.roll = roll;
    }
    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "name :"+name+"\tRoll :"+roll;
    }
    @Override
    public boolean equals(Object obj) {
        // TODO Auto-generated method stub
        student that =(student) obj;
        boolean isEqual = that.roll == this.roll;
        return isEqual;
    }
    @Override
    public int hashCode() {
        // TODO Auto-generated method stub
        return roll;
    }

    @Override
    public int compareTo(student that) {
        // TODO Auto-generated method stub
        return this.name.compareTo(that.name);
    }
}
