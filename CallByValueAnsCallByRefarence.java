public class CallByValueAnsCallByRefarence {
    public static void main(String[] args) {

        System.out.println("Call By Value");
        // Call by Value
        CallByValue ref1 = new CallByValue();
        System.out.println(ref1.n);
        ref1.change(ref1.n);
        System.out.println(ref1.n);

        System.out.println("\nCall By Refarence");
        // Call by Refarence
        CallByRefarence ref2 = new CallByRefarence();
        System.out.println(ref2.n);
        ref2.change(ref2);
        System.out.println(ref2.n);
    }
}

class CallByValue {
    int n = 500;

    void change(int n) {
        n = n + 40;
    }
}

class CallByRefarence {
    int n = 400;

    void change(CallByRefarence obj) {
        n = obj.n + 40;
    }
}