class Main{
    public static void main(String[] args) {
        int a = 30,b = 3;
        double result = 0;
        int[] arr = new int[5];
        try {
            // Write critical statements in try block
            result = a/b;
            System.out.println(result);
            for(int i = 0; i < 6; i++){
                arr[i] = i + 1;
            }
        }
        catch(ArithmeticException e){
            System.out.println("Can't divide with zero");
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Exceeding the length of the array");
        }
        catch (Exception e){
            System.out.println(e);
        }
    }
}

/*
 Q1) What is an exception in java ?
 ans) An exception is an event that occurs in a program that disrupts the normal
 flow of program's execution.

 Q2)
* */