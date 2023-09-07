public class ObjectClassOverride {
    public static void main(String[] args) throws CloneNotSupportedException {
        one obj1 = new one("Sunit", 18);
        one obj2 = new one("Sunit", 16);

        System.out.println(obj1.equals(obj2));
        System.out.println(obj1.toString());

        // Object Cloning
        CloningClass ccobj = new CloningClass();
        ccobj.Name = "Main Clone";
        CloningClass ccobj2 = (CloningClass) ccobj.clone();

        System.out.format("\nBefore Adding value in clone obj \n %s\t%s\n%s\t%s", ccobj.hashCode(), ccobj2.hashCode(),
                ccobj.Name, ccobj2.Name);

        ccobj2.Name = "Clone Object";
        System.out.format("\nAfter Adding value in clone obj \n %s\t%s\n%s\t%s", ccobj.hashCode(), ccobj2.hashCode(),
                ccobj.Name, ccobj2.Name);

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

class CloningClass implements Cloneable {
    String Name;

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

/*
 * Note:
 * Here I am override equals and toString method from object class.
 * with out those override equal method only check those two object are same or
 * not its check object hashCode not the inner value
 * and toString return hash Value not the contain value. By overriding I will
 * change the working process of those 2 method.
 * And In cloning in necessary to override clone method.
 */