public class Thread2 implements Runnable {

    Stack st;

    public Thread2(Stack st){
        this.st = st;
    }
    @Override
    public void run(){
        for(int i = 0; i < 5; i++){
            this.st.pop_element();
        }
    }
}