public class Circle extends Shape{

    double radius;

    Circle(String name, double radius){
        super(name);
        this.radius = radius;
    }

    @Override
    public double calculateArea(){
        return Math.PI*this.radius*this.radius;
    }

    public void Description(){
        super.description();
    }

    public static void main(String[] args) {
        Circle c = new Circle("Circle", 3.4);
        System.out.println(c.calculateArea());
        c.Description();
    }
}
