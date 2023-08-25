public class HackerRankStringTokenSplit {
    
    public static void main(String[] args) {
        String a = "He is a very very good boy, isn't he?";

        java.util.List<String> stlist = new java.util.ArrayList<>();
        java.util.Collections.addAll(stlist, a.split("[\\s+!,?._'@]"));
        java.util.Iterator<String> it = stlist.iterator();
        while (it.hasNext()) {
            if (it.next().equals("")) {
                it.remove();
            }
        }
        System.out.println(stlist.size());
        java.util.Iterator<String> it2 = stlist.iterator();
        while (it2.hasNext()){
            System.out.println(it2.next());
        }
    }
}
