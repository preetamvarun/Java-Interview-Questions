import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CheckedException {
    public static void main(String[] args) throws IOException {
        String k;

        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
            k = br.readLine();
            System.out.println(k);
            /*when we are doing try with resources try(){} we don't need to specifically
            * write a catch block or close the resource by ourselves. It will be done
            * automatically */
        }
//        catch (IOException e){
//            System.out.println("IO Error");
//        }
//        finally {
//            br.close();
//            System.out.println("Complete Exceptions by today");
//        }
    }
}
