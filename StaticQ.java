class Parent {
    public static void staticMethod(){
        System.out.println("This is a parent static method");
    }
}

class Child  extends  Parent{
    public static void staticMethod(){
        System.out.println("This is a child static method");
    }
}

public class StaticQ {
    public static void main(String[] args) {
        Parent parentObj = new Child();
        parentObj.staticMethod();
    }
}


/*
* We can't override static methods inside java. Instead, what happens is method hiding
* happens in case of static methods. In the above example if parent and child has the
* same static method if we create a parent parentObj = new Child(); child's static
* method will simply gets hidden which is illustrated in the above example.
* */