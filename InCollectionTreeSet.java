/*
Tree set properties same as hash set properties , 
difference only here the element arrange by ascending order .
*/     

// import java.util.Set;
import java.util.TreeSet;

public class InCollectionTreeSet {
    public static void main(String[] args) {
        TreeSet<Integer> set = new TreeSet<Integer>();     
        
        //  .add() function use to insert element in set
        set.add(23);
        set.add(2);
        set.add(28);
        set.add(12);
        set.add(239);

        System.out.println(set);
        TreeSet<Integer> subsets = new TreeSet<>();
        subsets = (TreeSet<Integer>)set.subSet(23, 239);
        System.out.println(subsets);

        //  .contains() function use to check the function present or not 
        System.out.println(set.contains(239)); 
        
        //  .remove() function use to remove a element from set
        set.remove(239);
        System.out.println(set);
        System.out.println(set.size()); //  for print set size
        System.out.println(set.isEmpty());  // for check the set empty or not
        set.clear();
        System.out.println(set.isEmpty()); 

        
    }
}

