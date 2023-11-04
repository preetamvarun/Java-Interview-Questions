public interface SeriesGen {

    public final static int maxSequenceLength = 10;
    public final static String errorMsg = "Can't Go beyond!";

    void getNext();

    private void getMoreDescription(){
        System.out.println("More info about sequence of numbers");
    }

    default void Description(){
        System.out.println("Generates Sequence of numbers");
        getMoreDescription();
    }

}
