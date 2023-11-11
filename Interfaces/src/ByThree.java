public class ByThree extends ByTwo implements SeriesGen{
    ByThree(int startNumber){
        super(startNumber);
    }
    @Override
    public void getNext(){
        while(true){
            this.startNumber += 3;
            System.out.println(this.startNumber);

            if(this.startNumber >= SeriesGen.maxSequenceLength){
                System.out.println(SeriesGen.errorMsg);
                break;
            }
        }
    }

    public static void main(String[] args) {
        ByThree th = new ByThree(-1);
        th.getNext();
        th.Description();
        SeriesGen.staticMethod();
    }
}
