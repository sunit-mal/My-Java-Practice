// Print odd and even number using multithreading using thread class

public class ThreadingUsingThreadClass {
    public static void main(String[] args) {
        evenThread evenObj = new evenThread(1,10);
        oddThread oddObj = new oddThread(1,10);

        evenObj.start();
        oddObj.start();
    }
}

class evenThread extends Thread {
    static int startNum;
    static int endNum;

    evenThread(int a, int b) {
        startNum = a;
        endNum = b;
    }

    @Override
    public void run() {
        evenPrint();
    }

    static void evenPrint() {
        for (int i = startNum; i <= endNum; i++) {
            if (i % 2 == 0)
                System.out.println(i + " is a even number");
        }
    }
}

class oddThread extends Thread {
    static int startNum;
    static int endNum;

    oddThread(int a, int b) {
        startNum = a;
        endNum = b;
    }

    @Override
    public void run() {
        oddPrint();
    }

    static void oddPrint() {
        for (int i = startNum; i <= endNum; i++) {
            if (i % 2 != 0)
                System.out.println(i + " is a Odd number");
        }
    }
}