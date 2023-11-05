public class CustomException {

    public static void validateAge(int age) throws NegativeAgeException{
        if(age < 0){
            throw new NegativeAgeException("Age can't be negative",
                    new RuntimeException());
        }
    }
    public static void main(String[] args) {
        validateAge(-1);
    }
}
