
// Program to sort given n date.
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class Sort_Given_N_Data {
    public static void main(String[] args) {
        // String[] N_Data = {"1","4","8","5","2"};

        List<String> DataList = new ArrayList<>();
        DataList.add("1");
        DataList.add("4");
        DataList.add("8");
        DataList.add("5");
        DataList.add("2");


        System.out.println(DataList);

        Collections.sort(DataList);

        System.out.println(DataList);
    }
}
