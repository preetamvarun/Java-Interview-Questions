class Animal {
    void makeSound(){
        System.out.println("Animal is making a sound");
    }
}

class Dog extends Animal {

    @Override
    void makeSound(){
        System.out.println("Dog is barking");
    }

    public static void main(String[] args) {
        Dog d = new Dog();
        d.makeSound();
    }
}

/*Ans : Method overriding occurs in java if the subclass method has the same
signature of a parent class method. If we create an instance of subclass then the
subclass method will be executed.
The overriding method should have same or more
access control than the overridden method.
When we are overriding a certain method
It's better to use @Ovverride Annotation
*/

