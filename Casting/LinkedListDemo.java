import java.util.LinkedList;
import java.util.Iterator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Arrays;

class LinkedListDemo {
    public static void main(String[] args){
        LinkedList<Object> ll = new LinkedList();
        ll.add(1);
        ll.add(2.3);
        ll.add("Lion");
        Iterator it = ll.iterator();
        while(it.hasNext()){
            System.out.print(it.next() + " ");
        }
        System.out.println("\nIs linkedlist empty : " + ll.isEmpty());
        ll.addFirst("Sparrow");
        ll.addLast("Pencil");
        System.out.println("\n");
        for(int i = 0; i < ll.size(); i++){
            System.out.print(ll.get(i) + " ");
        }
        System.out.println("\n");
        ll.removeFirst();
        ll.removeLast();
        System.out.println(ll.getFirst());
        System.out.println(ll.getLast());
        ArrayList<String> al_string = new ArrayList();
        al_string.add("Hello");
        al_string.add("Hi");
        al_string.add("Thanks");
        al_string.add("Okay");
        ll.addAll(1,al_string);
        ll.removeAll(al_string);
        for(Object e : ll){
            System.out.print(e + " ");
        }
        LinkedList<String> ll_string = new LinkedList();
        ll_string.add("Sorry");
        ll_string.add("Pathetic");
        ll_string.add("Cameo");
        ll_string.add("Deep Work");
        ll_string.add("Shallow Work");
        Collections.shuffle(ll_string);
        Collections.sort(ll_string, Collections.reverseOrder());
        for(String string : ll_string){
            System.out.println(string);
        }
        String[] arr = {"Opinion", "Conclusion", "Sorting", "Mapping"};
        for(String s : arr){
            System.out.println(s);
        }
        LinkedList<String> ll2 = new LinkedList<String>(Arrays.asList(arr));
        ll2.addFirst("Hurray!!");
        ll2.addLast("Done");
         for(String e : ll2){
            System.out.print(e + " ");
        }
    }
}
