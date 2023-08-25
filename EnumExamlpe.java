class EnumExamlpe {
    enum Season{
        Winter(), Spring(),Summer(),Fall();
    }
    public static void main(String[] args) {
        for (Season s : Season.values()) {
            System.out.println(s);
        }
        System.out.println(Season.valueOf("Winter"));
        System.out.println(Season.valueOf("Winter").ordinal());
    }
}
