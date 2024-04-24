public class PrivateConstructorInJava {
    public static void main(String[] args) {
        // ExternalClass obj = new ExternalClass();
        /*
         * Note :
         * Its Give Use Error
         * PrivateConstructorInJava.java:2: error: ExternalClass()
         * has private access in ExternalClass
         * ExternalClass obj = new
         * ExternalClass();
         * 
         */

        // Solution :
        ExternalClass.callConstructor();
    }

}

class ExternalClass {
    private ExternalClass() {
        System.out.println("I am a private constructor for ExternalClass");
    }

    static void callConstructor() {
        ExternalClass obj = new ExternalClass();
    }
}
