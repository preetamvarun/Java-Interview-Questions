import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.Map;


class HashMapDemo {
    public static void main(String[] args){
        HashMap<Integer,String> mp = new HashMap<Integer,String>();
        mp.put(1,"A");
        mp.put(2,"B");
        mp.put(3,"C");
        mp.put(4,"D");
        mp.put(5,"E");
        mp.put(6,"F");
        // mp.remove(1);
        System.out.println(mp.get(1));
        System.out.println(mp.containsKey(5));
        System.out.println(mp.containsValue("C"));
        System.out.println(mp.keySet());
        for(Integer i : mp.keySet()){
            System.out.println(mp.get(i));
        }
        Set<Integer> s = mp.keySet();
        Iterator it = s.iterator();
        while(it.hasNext()){
            System.out.println(mp.get(it.next()));
        }
        while(it.hasNext()){
            Map.Entry entry = (Map.Entry)it.next();
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}
