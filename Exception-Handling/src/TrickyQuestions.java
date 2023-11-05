/*

Question : CAN YOU HAVE A TRY BLOCK WITHOUT HAVING A CATCH BLOCK.
ANS : YES

*/

//public class TrickyQuestions {
//
//    public static void Error() throws RuntimeException{
//        throw new RuntimeException("Throwing an exception");
//    }
//    public static void main(String[] args) {
//        try{
//            Error();
//        }
//        finally {
//            System.out.println("Didn't have a catch statement");
//        }
//    }
//}


/*
    Importance of finally block :
    Used to clean up any resources or close any resources that are opened.
    Finally executes If if the exception is handled or not.
*/
//
//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
//
//
//class TrickyQuestions {
//    public static void main(String[] args) {
//        BufferedReader br = null;
//        try {
//            br = new BufferedReader(new InputStreamReader(System.in));
//            String x = br.readLine();
//            System.out.println(x);
//        }
//        catch(IOException e){
//            System.out.println(e.getLocalizedMessage());
//        }
//        finally {
//            try{
//                if(br != null) br.close();
//            }
//            catch (IOException e){
//                System.out.println(e.getLocalizedMessage());
//            }
//        }
//    }
//}

// Question : Can you have any code b/w try and catch block. ans : yes
// Question : Can you have any code b/w try and finally block. ans : yes

// Question : can you catch more than one exception in a single catch block
// Ans : yes! By using the pipe (|) symbol.
// catch(IOException | NullPointerException e){}

// Question : Explain a situation where finally is not executed
// Ans : System.exit() the program will halt right there and finally is not executed
// Infinity loop in try block. finally block is not executed
// sudden termination of JVM due to system crash or something like that finally is not
// executed.


// Question : Can we rethrow the same exception in the catch handler
// Ans : yes we can rethrow the same exception in the catch handler below is the example.
//class TrickyQuestions {
//
//    public static void performDivision() throws ArithmeticException{
//        int numerator = 34, denominator = 0;
//        float ans;
//        try{
//            ans = (float)(numerator/denominator);
//            System.out.println(ans);
//        }
//        catch (ArithmeticException ae){
//            throw ae;
//        }
//    }
//    public static void main(String[] args) {
//        try{
//            performDivision();
//        }
//        catch(ArithmeticException ae){
//            System.out.println("Exception : " + ae.getMessage());
//        }
//    }
//}


// RETURN AND FINALLY IN A TRY CATCH BLOCK : Finally block will be executed first and
// then the return statement will be executed. When both return and finally are present
// in the same method that has try catch block finally will be executed first and
// the method will be returned.

//class TrickyQuestions {
//    public static float DivisionOperation(){
//        int a = 5,b = 2; float result;
//        try{
//            result = (float)(a/b);
//            return result;
//        }
//        catch(ArithmeticException ae){
//            System.out.println("Exception : can't divide with zero");
//            return 0;
//        }
//        finally {
//            System.out.println("Finally block Division operation");
//        }
//    }
//    public static void main(String[] args) {
//        float ans = DivisionOperation();
//        System.out.println(ans);
//    }
//}



