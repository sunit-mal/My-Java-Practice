/*Linked Hash set properties same as hash set 
difference only here the element arrange by order of insertion.*/   
  
import java.util.LinkedHashSet;
import java.util.Set;

public class InCollectionLinkHashSet {
    public static void main(String[] args) {
        Set<Integer> set = new LinkedHashSet<>();     
        
        //  .add() funtion use to insert element in set
        set.add(23);
        set.add(2);
        set.add(28);
        set.add(12);
        set.add(239);

        System.out.println(set);
        
        //  .contains() funtion use to check the function present or not 
        System.out.println(set.contains(239)); 
        
        //  .remove() funtion use to remove a element from set
        set.remove(239);
        System.out.println(set);
        System.out.println(set.size()); //  for print set size
        System.out.println(set.isEmpty());  // for check the set empty or not
        set.clear();
        System.out.println(set.isEmpty()); 


    }
}
