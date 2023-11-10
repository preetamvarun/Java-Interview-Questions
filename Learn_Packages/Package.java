package Learn_Packages;

public class Package {
    public Package(){
        System.out.println("This is a package class");
    }
}

// Some questions on packages.

// What is a package in java ?
// ANS : A package is group of related files that are bundled together, they can be
// used in other parts of the code by importing that package. Packages helps us to
// structure and modularize our code.

// Can we have more than one package statement in source file ?

// ANS : No, we can't have more than one package statement in source file. Consider the
// following example.
// Let's say there are two package p1 and p2. Inside p1 there are two classes a & b.
// Inside p2 there are two classes c & d.
// Each package in Java should have its
// unique `package` statement, and this statement should be placed at the top of each
// source file for the classes belonging to that package.
// In this example:
//- Inside package `p1`, each source file containing classes `a` and `b` should start
// with the statement `package p1;`.
//- Inside package `p2`, each source file containing classes `c` and `d` should start
// with the statement `package p2;`.
//This is the proper way to organize classes into packages in Java, and it
// ensures that the classes are grouped under the appropriate packages,
// making the code modular and maintainable.


// 41) Can we define package statement after import statement in java?
// Ans) No, in Java, the `package` statement must appear before any `import`
// statements in a source file. The correct order of statements in a Java source
// file is as follows:
//
//1. `package` statement (if present) - Specifies the package to which the classes
// in the source file belong. It must appear at the very beginning of the file.
//
//2. `import` statements (if present) - Used to import classes from other packages
// that your source file needs.
//
//3. Class and interface declarations - The actual class or interface definitions
// follow after the `package` and `import` statements.
//
//Here's an example of the correct order of statements in a Java source file:
//
//```java
//package com.example.mypackage; // Package statement
//
//import java.util.List; // Import statements
//
//public class MyClass {
//    // Class members and methods
//}
//```
//
//Placing the `package` statement after `import` statements or any other code is not
// allowed and will result in a compilation error.