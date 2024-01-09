class Animal {
    public void makeNoise(){
        System.out.println("Animal is making a noise");
    }
}

class Dog extends Animal{
    @Override
    public void makeNoise(){
        System.out.println("Bow Bow!");
    }

    public void growl(){
        System.out.println("Grgrgrgr");
    }
}

class Cat extends Animal{
    @Override
    public void makeNoise(){
        System.out.println("Meow Meow");
    }

    public void munch(){
        System.out.println("Munch");
    }
}


// Upcasting : when we are assigning a child class object to parent class reference variable then we are doing upcasting.
// Downcasting : we assign a child class object to parent class reference variable as well. now we convert this parent class reference variable into child class reference
// variable completely by explicitly doing the type casting. Dog d = (Dog)parentClassReferenceVariable;

public class Main{

    public static void upCast(Animal animal){
        animal.makeNoise();
    }

    // Downcast animal(parent class) object to Dog(child class) object
    public static void downCast(Animal animal){
        // Convering animal object to dog object;
        if(animal instanceof Dog){
            Dog d1 = (Dog) animal;
            d1.growl();
        }
        else if(animal instanceof Cat){
            Cat c1 = (Cat) animal;
            c1.munch();
        }
        else {
            System.out.println("Can't downcast pass in correct reference");
        }
    }

    public static void main(String[] args) {
        Dog d = new Dog();
        upCast(d);
        Cat c = new Cat();
        upCast(c);
        downCast(c);
    }
}

// Implicit type conversion : When we are converting value of larger data type to a
// value of smaller data type then it is called implicit type conversion. Happens
// implicitly. This is also known as automatic type conversion.

// eg: int x = 34; Long y = x;

// Explicit type conversion : when there a value of larger data type and if we want to
// convert it into a value of smaller data type then the programmer has to explicitly
// specify into which particular data type that he wants to perform conversion. Data
// loss may occur in explicit type conversion. This is aka typecasting.

// Example : double d = 3.45; int x = (int) d;
