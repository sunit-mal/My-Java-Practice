// Creating multithreading using runnable interface

public class ThreadingUsingRunnableInterface {
    public static void main(String[] args) {
        Thread1 ThreadCreate1 = new Thread1();
        Thread ThreadRun1 = new Thread(ThreadCreate1);

        Thread2 ThreadCreate2 = new Thread2();
        Thread ThreadRun2 = new Thread(ThreadCreate2);

        ThreadRun1.start();
        ThreadRun2.start();
    }
}

class Thread1 implements Runnable{
    @Override
    public void run(){
        PrintData();
    }

    static void PrintData(){
        for (int i = 0; i < 6; i++) {
            System.out.println("I am Thread 1 ");
        }
    }

}

class Thread2 implements Runnable{
    @Override
    public void run(){
        PrintData();
    }

    static void PrintData(){
        for (int i = 0; i < 6; i++) {
            System.out.println("I am Thread 2 ");
        }
    }

}
