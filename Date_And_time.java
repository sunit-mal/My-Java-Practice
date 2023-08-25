import java.util.Scanner;
import java.util.Date;
import java.text.SimpleDateFormat;

public class Date_And_time {
    public static void main(String[] args) throws Exception {
        SimpleDateFormat day = new SimpleDateFormat("EEEE");
        Date a = new SimpleDateFormat("dd/MM/yyyy").parse(Date());
        String f = day.format(a);
        System.out.println(f.toUpperCase());
    }

    static String Date() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter date = ");
        String date = sc.nextLine();
        sc.close();
        return date;

    }
}
