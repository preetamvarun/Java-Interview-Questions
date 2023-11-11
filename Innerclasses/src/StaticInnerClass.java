class OuterNonStatic {

    private int x = 10;

    private static int y = 20;

    public int RetrieveX(){
        return x;
    }

    static class InnerStatic{

        InnerStatic(){
            System.out.println("Can't retrieve non-static field methods and members");
        }

        public void sampleMethod(){
            System.out.println("This is a sample method "+ y);
        }
    }

}


public class StaticInnerClass {

    public static void main(String[] args) {
        OuterNonStatic ons = new OuterNonStatic();
        System.out.println(ons.RetrieveX());

        OuterNonStatic.InnerStatic ins = new OuterNonStatic.InnerStatic();
        ins.sampleMethod();
    }
}
