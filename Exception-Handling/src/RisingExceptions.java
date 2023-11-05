// Question : State some situations where exceptions may arise in java ?

// Ans :

/*
 -> Some situations are when we are dividing a number zero, then arithmetic exception
 may arise.
 -> When we are accessing an index which is greater than the length of the array then
 ArrayIndexOutOfBounds Exception will arise
 -> SecurityExceptions may arise when we are trying to access restricted resources
 -> SQLExceptions may arise when we are querying something from a database or when we are
 trying to establish a connection with the database.
 -> When we are trying to access a file that is not there then FileNotFoundException can
 arise
 -> When we are doing network operations socketException may arise if there are any
 connectivity issues
 -> we may also get IOException if there is anything wrong with the input stream that
 we are attempting to read.
 -> when we are trying to access any object that is null we get NullPointerException.
 -> If we are trying to convert a string to an Integer like this ->
 Integer.parseInt("Hello") we get NumberFormatException.

* */



/*
 Question : what is exception handling in java
 Ans : Exception are the events that disrupts the normal flow of a program. It is also
 a subclass of Throwable Class in java. We can Handle exceptions in java by using try
 and catch block. where In the try block we Write critical statements that can cause
 exceptions and if in case an exception arises we catch those exceptions in the catch
 block and then we will deal with it so that The normal flow of our program is not
 disrupted.
*/


/*
 Question : what are the advantages of exception handling in java
 Ans :  By handling exceptions in java we can gracefully avoid any abrupt termination
 of the program. Moreover, java provides a wide range of exceptions like
 NullPointerExceptions etc., to handle exceptions so that the developer knows exactly
 what is the problem that he is dealing with.
 */

/*
 Question : what is an error in java
 Ans : In java, we have compilation errors, Exceptions and errors.
 Compilation errors : These are generated during the compilation phase of the program
 when java compiler compiles the code, if the source code doesn't adhere to the rules
 of the java like missing semicolon etc., then these sort of errors are generated.
 Exceptions are the events that occur in an program that disrupts the normal flow of the
 program's execution. These are the sub class of Throwable class in java. But, these exceptions can be
 handled in java using try catch blocks.
 There are also errors in java that are not compilation errors. These occur during
 the run time. These errors are a subclass of Throwable class in java. These errors
 are generally more severe and can't be recoverable like issues with jvm, or
 computer's hardware.
*/


public class RisingExceptions {

    String typeofException = "";

    RisingExceptions(String typeofException){
        this.typeofException = typeofException;
    }

    public void executeExceptions(){
        switch (this.typeofException) {
            case "NullPointerException" :
                String name = null;
                // Here accessing an object that is null
                try{
                    System.out.println(name.length());
                }
                catch (NullPointerException npe){
                    System.out.println("Can't access objects that are null");
                }
                break;
            case "NumberFormatException" :
                String value = "James Robert";
                // Try to convert this name into integer which results in exception
                try{
                    int x = Integer.parseInt(value);
                }
                catch (NumberFormatException e){
                    System.out.println("Inappropriate Casting");
                }
            case "ArithmeticException" :
                int a = 4, b = 0;
                // Try doing a / b
                try {
                    int result = a / b;
                }
                catch(ArithmeticException ae){
                    System.out.println(ae.getMessage());
                }
            case "ArrayIndexOutOfBoundsException" :
                int[] arr = new int[] {1,2,3,4,5,6};
                try {
                    System.out.println(arr[7]);
                }
                catch(ArrayIndexOutOfBoundsException abe){
                    System.out.println(abe.getMessage());
                }
            default :
                System.out.println("Good luck learning Exception Handling!");
        }
    }
    public static void main(String[] args) {
        RisingExceptions npe = new RisingExceptions("ArrayIndexOutOfBoundsException");
        npe.executeExceptions();
    }
}
