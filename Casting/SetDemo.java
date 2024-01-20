import java.util.HashSet;
import java.util.LinkedHashSet;

class Set {
    public static void main(String[] args){
        LinkedHashSet<String> lhs = new LinkedHashSet<String>(20, 0.78f);
        lhs.add("Pigeon");
        lhs.add("Tree");
        lhs.add("Leaves");
        lhs.add("Stem");
        lhs.add("Bug");

        lhs.remove("Bug");
        
        for(String s : lhs){
            System.out.println(s);
        }
        
        HashSet<Integer>set1 = new HashSet<Integer>();
        HashSet<Integer>set2 = new HashSet<Integer>();
        
        set1.add(2);
        set1.add(4);
        set1.add(6);
        set1.add(8);
        
        set2.add(1); set2.add(2); set2.add(3); set2.add(4);
        set2.add(5); set2.add(6); set2.add(7); set2.add(8);
        
        // set1.addAll(set2);
        
        // System.out.println(set1);
        
        set1.retainAll(set2);
        
        System.out.println(set1);
        
        set2.removeAll(set1);
        System.out.println(set2);
        
    }
}
