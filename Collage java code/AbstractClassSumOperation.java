//  Write a JAVA program for computing sum of two integers and floats using abstract classes?

public class AbstractClassSumOperation {
    public static void main(String[] args) {
        ans obj = new ans();
        System.out.println(obj.Intsum(5, 19));
        System.out.println(obj.floatsum(1.4, 4.1));
    }
}

abstract class sum{
    abstract int Intsum(int a , int b);
    abstract double floatsum(float a, float b);
}

class ans{

    int Intsum(int a , int b){
        return (a+b);
    }

    double floatsum(double d, double e){
        return (d+e);
    }
}