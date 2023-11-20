package Generics.Animal;


// Here we are making the generic more specific. Our generic T is capable of handling
// animal class and also it's subclasses.
public class Printer <T extends Animal, V>{
    T thingToPrint;

    Printer(T thingToPrint){
        this.thingToPrint = thingToPrint;
    }

    public void print(){
        thingToPrint.makeSound();
    }

    public void genericMethod(T param, String param1){
        System.out.println(param + " " + param1);
    }


}
