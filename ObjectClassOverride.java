public class ObjectClassOverride {
    public static void main(String[] args) {
        one obj1 = new one("Sunit", 18);
        one obj2 = new one("Sunit", 16);

        System.out.println(obj1.equals(obj2));
        System.out.println(obj1.toString());
    }
}

class one {
    private String name;
    private long num;

    one(String name, long num) {
        this.name = name;
        this.num = num;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getNum() {
        return num;
    }

    public void setNum(long num) {
        this.num = num;
    }

    @Override
    public boolean equals(Object obj) {
        boolean temp = ((one) obj).getName().equals(this.name);
        return temp;
    }

    @Override
    public String toString() {
        String result = this.name + " " + this.num;
        return result;
    }
}

/*
 * Note:
 *      Here I am override equals and toString method from object class.
 *      with out those override equal method only check those two object are same or not its check object hashCode not the inner value
 *      and toString return hash Value not the contain value. By overriding I will change the working process of those 2 method.
 */