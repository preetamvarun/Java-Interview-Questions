//public class NestedTryCatchBlocks {
//    public static void main(String[] args) {
//        try{
//            float result; float a = 5;
//            result = a/args.length;
//            System.out.println("Outer result : " + result);
//            if(args.length == 1){
//                try{
//                    throw new ArithmeticException("Can't divide by zero");
//                }
//                catch (ArithmeticException ae){
//                    System.out.println("Inner arithmetic exception");
//                }
//            }
//        }
//        catch (ArithmeticException ae){
//            System.out.println("OuterArithmeticException");
//        }
//    }
//}
