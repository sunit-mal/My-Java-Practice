import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class HackerRankTimeFormatChange {
    public static void main(String[] args) {
        String s = "07:05:45PM";
        DateTimeFormatter inputFormatter = DateTimeFormatter.ofPattern ("hh:mm:ssa");
        DateTimeFormatter outputFormatter = DateTimeFormatter.ofPattern("HH:mm:ss");

        LocalTime localTime = LocalTime.parse(s, inputFormatter);

    
        String outputTime = localTime.format(outputFormatter);

        System.out.println(outputTime);
    }
}
