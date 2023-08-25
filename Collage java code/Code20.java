//  Override toString() for Box class.


public class Code20 {
    public static void main(String[] args) {
        newcls obj = new newcls("Sunit");
        System.out.println(obj);
    }
}

class newcls{
    public String name;
    newcls(String name){
        this.name = name;
    }
    @Override
    public String toString() {
        return this.name;
    }
}