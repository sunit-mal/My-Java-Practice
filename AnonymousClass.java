
interface AnonymousDemo {
    public void met1();

    public void met2();
}

public class AnonymousClass {
    public static void main(String[] args) {

        //  For Anonymous class 
        AnonymousDemo obj = new AnonymousDemo() {

            @Override
            public void met1() {
                System.out.println("I am Anonymous met1");
            }

            @Override
            public void met2() {
                System.out.println("I am Anonymous met2");
            }

        };

        obj.met1();

        //  For normal class 
        AnonymousDemo obj2 = new ref(); //  Dynamic method dispatch

        obj2.met1();

    }
}

// without use Anonymous class

class ref implements AnonymousDemo {

    @Override
    public void met1() {
        System.out.println("I am met1");
    }

    @Override
    public void met2() {
        System.out.println("I am met2");
    }
}
