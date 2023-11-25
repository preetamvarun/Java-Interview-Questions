// Anonymous Inner Classes can be created in two different scenarios

// 1) We can create an anonymous inner class as a subclass to another class and can
// have only one object.


// 2) We can create an anonymous inner class that can implement all methods in an
// interface but can be done only once.

// Consider the following two examples
public class AnonymousInnerClass {
    public static void main(String[] args) {

        Animal a = new Animal();
        a.makeNoise();
 /*anon is an object of an anonymous class that is a subclass of Animal and doesn't
 have a name*/
        Animal anon = new Animal() {

            @Override
            void makeNoise(){
                System.out.println("Anonymous animal is making a sound");
            }
        };
        anon.makeNoise();


        // We are creating an object of a class type that doesn't have a name
//        Runnable r = new Runnable() {
//            @Override
//            public void run() {
//                System.out.println("Implementing the run method in runnable Interface");
//            }
//        };
//
//        r.run();
    }
}


