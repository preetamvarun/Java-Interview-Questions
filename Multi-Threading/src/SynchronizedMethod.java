class Counter {
    private int count;
    
    Counter(int count){
        this.count = count;
    }
    
    // Now only one thread is gonna execute here since this method is declared as synchronized.
    public synchronized static void increment(){
        this.count++;
    }
    
    public int getCount(){
        return this.count;
    }
}


class SynchronizedMethod {
    public static void main(String[] args) throws Exception{
        Counter c = new Counter(0);
        
        Runnable r = () -> {
            for(int i = 0; i < 1000; i++){
                c.increment();
            }
        };
        
        Thread t1 = new Thread(r);
        Thread t2 = new Thread(() -> {
            for(int i = 0; i < 1000; i++){
                c.increment();
            }
        });
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println(c.getCount());

    }
}
