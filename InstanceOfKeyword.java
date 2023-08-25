import java.util.*;

class Student {
}

class Rockstar {
}

class Hacker {
}

public class InstanceOfKeyword {

   static String count(ArrayList list) {
      int a = 0, b = 0, c = 0;
      for (int i = 0; i < list.size(); i++) {
         Object element = list.get(i);
         if (element instanceof Student)
            a++;
         if (element instanceof Rockstar)
            b++;
         if (element instanceof Hacker)
            c++;
      }
      String ret = Integer.toString(a) + " " + Integer.toString(b) + " " + Integer.toString(c);
      return ret;
   }

   public static void main(String[] args) {
      ArrayList list = new ArrayList();
      Scanner sc = new Scanner(System.in);
      int t = sc.nextInt();
      for (int i = 0; i < t; i++) {
         String s = sc.next();
         if (s.equals("Student"))
            list.add(new Student());
         if (s.equals("Rockstar"))
            list.add(new Rockstar());
         if (s.equals("Hacker"))
            list.add(new Hacker());
      }
      System.out.println(count(list));
   }
}