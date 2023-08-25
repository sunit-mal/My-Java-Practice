public class DestractorCreateInJava {
    public static void main(String[] args) {
        DestractorCreator obj = new DestractorCreator();
        obj.show();
        obj = null; // initiliz object as null so it change as a garvage collector
        System.gc();   
        // obj.show();
    }
}

class DestractorCreator{
    DestractorCreator(){
        System.out.println("Class Object creating");
    }
    void show(){
        System.out.println("Object in arive right now");
    }
    //  Creating Destractor using finalize keyword its already present in object class
    protected void finalize() throws Throwable{  
        System.out.println("Object now destroid");
    }
}