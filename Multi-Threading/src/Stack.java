public class Stack{
    private int stackTop = -1;
    private int[] arr;
    public Stack(int capacity) {
        this.arr = new int[capacity];
    }
    public synchronized void push_element(int element){
        if(this.stackTop >= this.arr.length - 1){
            System.out.println("Can't push new element");
        }
        else{
            this.stackTop++;
            try {Thread.sleep(1000);}
            catch (Exception e){}
            this.arr[this.stackTop] = element;
            System.out.println("pushed element " + element);
        }
    }

    public synchronized void pop_element(){
        if(this.stackTop < 0){
            System.out.println("Stack is empty. Can't remove elements");
        }
        else{
            try {Thread.sleep(1000);}
            catch (Exception e){}
            System.out.println("Popped element " + this.arr[this.stackTop]);
            this.arr[this.stackTop] = Integer.MIN_VALUE;
            this.stackTop--;
        }
    }

    public void print_elements(){
        System.out.println("Printing the elements of the stack");
        for(int i = this.stackTop; i>=0; i--){
            System.out.println(this.arr[i]);
        }
    }
}
