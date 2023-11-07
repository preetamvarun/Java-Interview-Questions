public class Thread1 implements Runnable{
    Stack st;

    public Thread1(Stack st){
        this.st = st;
    }
    @Override
    public void run(){
       for(int i = 0; i < 5; i++){
           this.st.push_element(100);
       }
    }
}