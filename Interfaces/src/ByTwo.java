public class ByTwo implements SeriesGen{

    protected int startNumber;

    ByTwo(int startNumber){
        this.startNumber = startNumber;
    }

    @Override
    public void getNext() {
        while(true){
            this.startNumber += 2;
            System.out.println(this.startNumber);
            if(this.startNumber >= SeriesGen.maxSequenceLength){
                System.out.println(SeriesGen.errorMsg);
                break;
            }
        }
    }

    public static void main(String[] args) {
        // we can also write SeriesGen t = new ByTwo(0);
        ByTwo t = new ByTwo(0);
        t.getNext();
    }
}
