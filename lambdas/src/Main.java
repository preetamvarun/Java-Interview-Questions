/*
* Lambdas In Java.
*
* Lambdas enables functional programming paradigm in java programming. we are so much
* used to write oop in java, but it's not the case with lambdas.
* Helps us to write readable and concise code using lambdas in java.
*
* */

public class Main {

    public static void Danger(Terminate obj){
        obj.terminate();
    }

    public static void main(String[] args) {

        Terminate myLambdaTerminator = () -> System.out.println("Going to terminate him");

        Danger(myLambdaTerminator);


        // t is an object of anonymous inner class that implements Terminate interface
        Danger(new Terminate(){
            @Override
            public void terminate(){
                System.out.println("successfully terminated him");
            }
        });

    }
}