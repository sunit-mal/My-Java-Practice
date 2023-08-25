import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class zExperiment {
    public static void main(String[] args) {
        String a = "He is a very very good boy, isn't he?";
        List<Character> st = new ArrayList<>();
        for (int index = 0; index < a.length(); index++) {
            st.add(a.charAt(index));
        }
        System.out.println(Collections.frequency(st, 'a'));

        int count[] = new int[256];
        System.out.println(count[a.charAt(0)]);
        count[65] = 12;
        System.out.println(">> " + count['A']);
    }

}
