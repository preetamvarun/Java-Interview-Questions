public interface SeriesGen {

    // fields are of type public static final
    int maxSequenceLength = 10;
    String errorMsg = "Can't Go beyond!";

    void getNext();

    static void staticMethod(){
        System.out.println("This is a static method in this interface");
    }

    private void getMoreDescription(){
        System.out.println("More info about sequence of numbers");
    }

    default void Description(){
        System.out.println("Generates Sequence of numbers");
        getMoreDescription();
    }

}


/*
* Features of interface
*
* All the methods that are non-concrete are abstract methods in the interface. We don't
* need to specifically use the keyword abstract here.
*
* Interfaces can't be instantiated.
* Interfaces don't have any constructors.
* All the fields that are defined in the interface are of type public static and final
* Any class that is implementing the interface should override all the abstract methods
* in the interface.
* Interfaces can also have concrete methods, but they should be of type private or
* default.
* Multiple inheritance can be achieved through interfaces because a class can implement
*  any number of interfaces.
* we can create anonymous class that implements the interface.
* */