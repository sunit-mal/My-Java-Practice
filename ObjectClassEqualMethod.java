public class ObjectClassEqualMethod {
    public static void main(String[] args) {
        data obj1 = new data("Sunit", 21);
        data obj2 = new data("Sunit", 21);

        System.out.println(obj1.equals(obj2));

        data2 data1 = new data2("Sunit", 21);
        data2 data2 = new data2("Sunit", 21);

        System.out.println(data1.equals(data2));

    }
}

class data {
    String name;
    int age;

    data(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

class data2 {
    String name;
    int age;

    data2(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public boolean equals(Object obj) {
        data2 vairData2 = (data2) obj;
        boolean isEquals = (this.name.equals(vairData2.name)) && (this.age == vairData2.age);
        return isEquals;
    }
}
