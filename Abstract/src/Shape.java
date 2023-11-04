public abstract class Shape {
    String name;

    Shape(String name){
        this.name = name;
    }
    abstract double calculateArea();

    public void description(){
        System.out.println("Shape is " + this.name);
    }
}
