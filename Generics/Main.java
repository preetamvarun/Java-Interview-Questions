package Generics;

public class Main {
    public static void main(String[] args) {
        Integer x = 34;
        String str = "This is a string";
        Printer<String> ps = new Printer<>(str);
        Printer<Integer> pi = new Printer<>(3);
        System.out.println(ps.getThingToPrint());
        System.out.println(pi.getThingToPrint());
    }
}
