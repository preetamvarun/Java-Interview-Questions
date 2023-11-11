public class Wrapper {
    public static void main(String[] args) {
        Integer i = 10;
        Float f = 3.4f;
        Double d = 3.4;
        Character x = '/';
        Boolean b = false;
        System.out.println(f);

        String result = b ? "True" : "False";

        System.out.println(result);
    }
}


/* Wrapper classes helps us to use primitive data types as reference data types. There
are some useful methods on those reference data types that we can use. For example :
toString().


Autoboxing : Java compiler converts a primitive data type into wrapper class. When we
say Integer i = 34; Because of autoboxing the value 34 can be assigned to the reference
data type i;

Unboxing : The process of converting wrapper class to it's corresponding primitive data
type value;

In the above example even though b is reference data type we can treat b as if it is a
primitive data type because of unboxing.

 */
