class VolatileThread1 implements Runnable {

    @Override
    public void run(){
        int vt1Counter = SharedObject.counter;
        while(vt1Counter < 10){
            if(vt1Counter != SharedObject.counter){
                vt1Counter = SharedObject.counter;
                System.out.println("vt1Counter value : " + vt1Counter);
            }
        }
    }
}