import java.util.ArrayList;
import java.util.Iterator;
import java.util.Collections;
import java.util.Arrays;

class ArrayListDemo {
    public static void main(String[] args){
        ArrayList<Object> al = new ArrayList<Object>();
        al.add("Deep Work");
        al.add("Tiger");
        al.add(1);
        al.add(2.3);
        
        // for(int i = 0; i < al.size(); i++){
        //     System.out.print(al.get(i) + " ");
        // }
        
        // System.out.println("\n");
        

        // al.set(3,2);
        // System.out.println(al.contains("Tiger"));
        // al.remove("Tiger");
        
        // ArrayList<Double> al1 = new ArrayList<Double>();
        // al1.add(12.3); al1.add(3.4); al1.add(4.5); al1.add(5.6); al1.add(6.7);
        
        
        // Collections.sort(al1);
        
        // Collections.shuffle(al1);
        
        // Iterator it = al1.iterator();
        // while(it.hasNext()){
        //     System.out.println(it.next());
        // }
        
        // al.addAll(2,al1);
        
        
        // for(Object e : al){
        //     System.out.print(e + " ");
        // }
        
        // System.out.println(al.containsAll(al1));
        
        // System.out.println(al.isEmpty());
        
        Integer[] arr = new Integer[5];
        for(int i = 0; i < arr.length; i++){
            arr[i] = i;
        }
    
        
        ArrayList<Integer>al2 = new ArrayList(Arrays.asList(arr));
        
        for(int i = 0; i < al2.size(); i++){
            System.out.println(al2.get(i));
        }
    }
}
