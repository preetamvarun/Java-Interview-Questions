class VolatileThread2 implements Runnable {

    @Override
    // Thread-2 is reading the value of the counter
    public void run(){
        int vt2Counter = SharedObject.counter;
        while(vt2Counter < 10){
            SharedObject.counter = ++vt2Counter;
            System.out.println("value is " + SharedObject.counter);
        }
        System.out.println("Final value of shareobject" + SharedObject.counter);
        try{Thread.sleep(500); } catch (Exception ignored){}
    }
}