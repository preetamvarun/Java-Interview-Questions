package Generics.Animal;

public class Main {
    public static void main(String[] args) {
//        Printer<Animal> pa = new Printer<>(new Animal());
        Printer<Cat, String> pc = new Printer<>(new Cat());
//        pa.print();
        pc.genericMethod(new Cat(), "Hello there kitty");

    }
}
