/*
 Suppose there r 2 structures. structure1 contains student name ,roll no, project name and structure2 contains project name 
 and coach name. First u enter the data in both the structures. Now write a program if user inputs project name then the 
 record is to be shown like project name, student name, roll no, coach name of each record.
 */
import java.util.Scanner;

public class StructureCreateInJava {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Structure1[] structure1 = new Structure1[2];
        for (int i = 0; i < structure1.length; i++) {

            structure1[i] = new Structure1();

            System.out.print("Enter name ");
            structure1[i].name = sc.nextLine();
            System.out.print("Enter roll ");
            structure1[i].roll = sc.nextInt();
            sc.nextLine();
            System.out.print("Enter Project Name ");
            structure1[i].Project = sc.nextLine();

        }

        Structure2[] structure2 = new Structure2[2];
        for (int i = 0; i < structure2.length; i++) {

            structure2[i] = new Structure2();

            System.out.print("Enter Project Name ");
            structure2[i].Project = sc.nextLine();
            System.out.print("Enter Coach name ");
            structure2[i].coach_name = sc.nextLine();
        }

        System.out.println("Enter Search Project");
        String searchProject = sc.nextLine();
        for (Structure1 search : structure1) {
            if (search.Project.equalsIgnoreCase(searchProject)) {
                System.out.println("Project Name: " + search.Project);
                System.out.println("Student Name: " + search.name);
                System.out.println("Roll: " + search.roll);

                for (Structure2 structure22 : structure2) {
                    if (structure22.Project.equalsIgnoreCase(searchProject)) {
                        System.out.println("Coach name: " + structure22.coach_name);
                    }
                }
            }
        }
        sc.close();
    }
}

class Structure1 {
    String name;
    int roll;
    String Project;
}

class Structure2 {
    String Project;
    String coach_name;
}