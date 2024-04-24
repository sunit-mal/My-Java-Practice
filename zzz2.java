import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.Collections;

public class zzz2 {
    public static void main(String[] args) {
        String[] accounts = { "0010114279002001", "0010114279101001", "0010114279104002", "0030114279002001",
                "0050114279002001", "0010114279205001" };
        List<String> result = Arrays.stream(accounts).collect(Collectors.toList());
        Collections.sort(result);
        result.forEach(element -> {
            String branchCode = "";
            String branchCode2 = element.substring(0, 3);
            String Date = LocalDate.now().toString();
            if (branchCode == branchCode2) {
                System.out.println("Branch Code Exists: " + branchCode2 + " Date: " + Date + " Account Number: " + element);
            }
            branchCode = element.substring(0, 3);
            System.out.println("Branch Code: " + branchCode2 + " Date: " + Date + " Account Number: " + element);

        });

    }

}