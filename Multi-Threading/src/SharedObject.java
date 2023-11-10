public class SharedObject {

    public volatile static int counter = 0;

    public static void main(String[] args) {
        Thread vt1 = new Thread(new VolatileThread1());
        Thread vt2 = new Thread(new VolatileThread2());
        vt1.start();
        vt2.start();
    }
}
