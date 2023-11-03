public class MethodOverloading {
    public String add(String a, String b){
        return a + " " + b;
    }

    public float add(float a, float b){
        return Math.round(a + b);
    }

    public int add(int a, int b, int c){
        return a + b + c;
    }

    public static void main(String[] args) {
        MethodOverloading Mo = new MethodOverloading();
        System.out.println(Mo.add("Preetam", "Varun"));
        System.out.println(Mo.add(1,2,3));
        System.out.println(Mo.add(4.5f, 5.66f));
    }
}
