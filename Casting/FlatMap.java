// Online Java Compiler
// Use this editor to write, compile and run your Java code online

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.List;


class FlatMap {
    public static void main(String[] args) {
    ArrayList<Integer> firstThree = new ArrayList<Integer>(Arrays.asList(1,2,3));
    ArrayList<Integer> secondThree = new ArrayList<Integer>(Arrays.asList(6,7,8));
     ArrayList<Integer> thirdThree = new ArrayList<Integer>(Arrays.asList(9,10,11));
     ArrayList<Integer> lastThree = new ArrayList<Integer>(Arrays.asList(12,13,14));
    ArrayList<ArrayList<Integer>> numbers = new ArrayList<ArrayList<Integer>>(Arrays.asList(firstThree, secondThree, thirdThree, lastThree));
    // for(ArrayList<Integer> al : numbers){
    //     for(Integer i : al){
    //         System.out.println(i);
    //     }
    // }
    numbers.stream().flatMap(col -> col.stream()).map(n -> n * 2).forEach(System.out::println);
    }
}
