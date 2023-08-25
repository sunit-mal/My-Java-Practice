import javax.swing.*;

public class JavaSwing {
    public static void main(String[] args) {
        JFrame j = new JFrame("User Frame");
        j.setVisible(true);
        j.setSize(400, 400);

        JLabel l = new JLabel("TEXT");
        j.add(l);
    }
}
