// Online Java Compiler
// Use this editor to write, compile and run your Java code online

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;


class StreamsMap {
    public static void main(String[] args) {
     ArrayList<Integer> al = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6));
     ArrayList<String> el = new ArrayList<String>();
     el.addAll(al.stream().map((n) -> {
         if(n % 2 == 0) return "Fizz";
         else if(n % 3 == 0) return "Buzz";
         else return "Fizz Buzz";
     }).collect(Collectors.toList()));
     el.stream().forEach(System.out::println);
    }
}
