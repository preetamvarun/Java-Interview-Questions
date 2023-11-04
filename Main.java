import java.util.Objects;

public class Main {
    public static void main(String[] args){
        if(Objects.equals(args[1], "Goku")){
            System.out.println("Running Goku's main method");
        }
        else if(Objects.equals(args[1], "Vegeta")) {
            System.out.println("Running vegeta's code");
        }
        else if(Objects.equals(args[2], "Gohan")){
            System.out.println("Running Gohans' code");
        }
        else {
            System.out.println("Running normal code");
        }
    }
}


/*
So, we can edit the configuration of the main java file by passing some arguments to
the args array. Based on the arguments that has been passed to that array we can then
carry out which version of code to be executed.

By default, args[] length will be zero.

* */