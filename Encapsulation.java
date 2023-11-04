public class Encapsulation {
    private int count;

    Encapsulation(){
        this.count = 0;
    }

    public void setCount(int countValue){
        this.count = countValue;
    }

    public int getCount() {
        return count;
    }

    public static void main(String[] args) {
        Encapsulation e = new Encapsulation();
        System.out.println(e.getCount());
        e.setCount(34);
        System.out.println(e.getCount());
    }
}

/* Explain Encapsulation in Java ?
Ans :   Encapsulation is one of the four fundamental Object-Oriented Programming (OOP)
principles, along with inheritance, polymorphism, and abstraction. In Java,
encapsulation refers to the practice of bundling the data (attributes or fields)
and the methods (functions) that operate on the data into a single unit known as a
class. It involves restricting access to some of the object's components, often by
marking them as private, and providing controlled access to the internal state
through methods, typically with public, private, or protected access modifiers.
*/