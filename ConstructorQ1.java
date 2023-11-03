// Questions : How do you call one constructor from another constructor in Java?

/*
Ans : In Java, you can call one constructor from another constructor in the same class
using the this() keyword. This is useful when you have multiple constructors in a class, and you want to reuse code
and avoid duplicating the initialization logic. this() must be the first line in the
constructors body and has to be written only once.
*/

public class ConstructorQ1 {
    private int value1, value2, value3;

    ConstructorQ1(int value1){
        this.value1 = value1;
        this.value2 = -1;
        this.value3 = -1;
    }

    ConstructorQ1(int value1, int value2){
        this(value1);
        this.value2 = value2;
        this.value3 = -1;
    }

    ConstructorQ1(int value1, int value2, int value3){
        this(value1, value2);
        this.value3 = value3;
    }

    public void printValues(){
        System.out.println("The values of v1, v2 and  v3 are " + this.value1 + " " + this.value2 + " " + this.value3);
    }

    public static void main(String[] args) {
        ConstructorQ1 obj = new ConstructorQ1(10);
        obj.printValues();
        ConstructorQ1 obj1 = new ConstructorQ1(20,30);
        obj1.printValues();
        ConstructorQ1 obj2 = new ConstructorQ1(40,50,60);
        obj2.printValues();
    }
}
