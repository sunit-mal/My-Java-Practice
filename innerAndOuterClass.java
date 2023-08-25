public class innerAndOuterClass {
    class innerClass{
        public void MethodOne(){
            System.out.println("Inner class");
        }
    }
    void MethodTwo(){
        innerClass obj = new innerClass();
        obj.MethodOne();
    }
    public static void main(String[] args) {
        innerAndOuterClass obj2 = new innerAndOuterClass();
        obj2.MethodTwo();
    }
}
