public class ConstructorOverloading {
    public static void main(String[] args) {
        c1 obj = new c1();
        c1 obj1 = new c1(1);
        c1 obj3 = new c1(1,2);
    }
}

class c1{
    c1(){
        System.out.println("Constructor without any parameter");
    }
    c1(int a ){
        System.out.println("Constructor with value of a");
    }
    c1(int a,int b){
        System.out.println("Constructor with value of a and b");
    }
}