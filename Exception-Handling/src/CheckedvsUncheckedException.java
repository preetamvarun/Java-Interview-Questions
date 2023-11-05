// Checked Exceptions are those exceptions that occur during the compile time and java
// enforces the developer to either handle the exception by using try catch block or by
// adding throws keyword in the method signature where the exception is arising.
// Example for checked exception is given below.

import java.io.FileNotFoundException;
import java.io.FileReader;

class CheckedvsUncheckedException {
    // CheckedException
    public static void openfile() throws FileNotFoundException {
        FileReader fr = new FileReader("Filename.txt");
    }

    //UncheckedException
    public static void getLength() throws NullPointerException{
        String str = null;
        System.out.println(str.length());
    }
    public static void main(String[] args) {
        try{
            openfile();
            getLength();
        }
        catch(NullPointerException | FileNotFoundException npe){
            System.out.println(npe.getLocalizedMessage());
        }
    }
}