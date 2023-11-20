package Generics;

// Generics allows us to write classes, methods and interfaces that can handle multiple
// data types reducing code duplication and providing compile time checking.

public class Printer <T> {
    private final T thingToPrint;

    Printer(T thingToPrint){
        this.thingToPrint = thingToPrint;
    }

    public T getThingToPrint(){
        return this.thingToPrint;
    }
}
