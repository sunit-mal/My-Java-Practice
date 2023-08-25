public class WrapperClass_AutoBoxingAndUnBoxing {
    public static void main(String[] args) {
        
        // Autoboxing
        int i = 100;
        Integer ab = i; // Its Autoboxing 
        // Integer ab = Integer.valueOf(i); //Internally do this 
        System.out.println("Primitive = "+i+" --> Object = "+ab);

        // Unboxing 
        Integer j = new Integer(10);
        int var = j;    //  Unboxing 
        // int var = j.intValue(); // Internally do this
        System.out.println("Object = "+j+" --> Primitive = "+var);
    }
}
