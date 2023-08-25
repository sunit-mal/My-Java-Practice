import java.util.Stack;

public class InCollectionStack {
    public static void main(String[] args) {
        Stack<String> name = new Stack<>();
        name.push("Sunit");
        name.push("Sohani");            // For Insert a element in stack
        name.push("Pintu");
        name.push("Sayan");
        name.push("Ayan");
        
        System.out.println("Stack Element :"+ name);
        System.out.println("Top Element is "+name.peek());  //  For print top of the element in stack
        name.pop();                         //  For Delete a element from stack
        System.out.println("Top Element is "+name.peek());
        System.out.println("Stack Element :"+ name);

    }
}
