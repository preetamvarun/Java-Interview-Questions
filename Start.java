/* Static blocks and Static initializers in java */

class Start {
    static int varName;
    static {
        varName = 23;
        System.out.println("Static block - 1");
    }

    static {
        System.out.println("Static block - 2");
        System.out.println(varName);
    }
    public static void main(String[] args){
        System.out.println("Main method");
    }
}


/*

Static blocks are a piece of code enclose between curly braces with a static keyword
in-front of it. They do not need any class initializer or a class object to get them
executed. Since, static blocks are directly associated with the class itself, as soon
as JVM loads the class into the memory, all the static blocks and variables are
initialized which involved executing these blocks in the order they appear in the
class. And, these static block are executed only once when the class is loaded.

static variables are those variables that are initialized using static keyword;
These variables belong to the class itself rather than to an instance of the class.
No matter how many instances of the class is created there is only one copy of this
variable in the memory. These static variables are available throughout the class
and has a class level scope.
Eg : static int x = 34; Note : we can't declare any static variables inside class methods,
static methods or static block because static variables should have class level scope.
Declaring them within the { } would limit its scope. Moreover, static variables are
initialized as soon as the JVM loads the class in the memory before any blocks are executed.
So, placing them inside a block would eventually create an issue while executing the code.

*/