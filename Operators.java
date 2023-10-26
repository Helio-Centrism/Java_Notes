/*Operators in JAVA */
      // Symbols that tell compiler to perform some operation
      //sum = a+b which is an expressions and + is known as operators
      //a and b are operands(on which operations is performed) 
/*Types of Operators */
    //Arithmetic Operators(Binary/Unary)
    //Relational Operators
    //Logical Operators
    //Bitwise Operators
    //Assignment Operators

/*Arithmetic operators */
     //binary operators (we need to have 2 operands)
     //+:  A+B -> addition
     //-: A-B  -> Subtraction
     //* :A*B  -> Multiplication
     // /: A/B -> Divisor
     // % : Modulo: A%B_ 5 % 3 -> 2

     /*Unary operators (when we need to perform on only one operands */
     //++ -> increment
         /* ++a(before) Pre Increment 
         1. Value change 
         2. Value use */
         /* a++ (after) Post Increment
          1. value use
          2. value change
          */
     //-- -> decrement
          /* --a(before) Pre Increment 
         1. Value change 
         2. Value use */
         /* a-- (after) Post Increment
          1. value use
          2. value change
          */
/*Relational Operators */
    // == --> equal to
    // != --> not equal to
    // > --> greater than
    // < --> less than
    // >= --> greater equal to
    // <= --> less than equal to
import java.util.*;
public class Operators {
    public static void main(String args[]){
        int A = 10;
        int B = 5;
        /* Arithmetic operators -> Binary operators */
        System.out.println(A+B);
        System.out.println(A-B);
        System.out.println(A*B);
        System.out.println(A/B);
        System.out.println(A%B);
        /*Unary operators -> Increment-> Pre Increment */
        int c = 12;
        int d = ++c;
        System.out.println(c);
        System.out.println(d);
        /*Unary operators -> Increment-> Post Increment */
        int e = c++;
        System.out.println(c);
        System.out.println(e);

        /*Unary operators -> Decrement-> Pre Increment */
        int f = 12;
        int g = --f;
        System.out.println(f);
        System.out.println(g);
        /*Unary operators -> Decrement-> Post Increment */
        int h = f--;
        System.out.println(f);
        System.out.println(h);

    /*Relational Operators */
      int x = 10;
      int y = 5;
      int z = 10;
      System.out.println(x=z);
      System.out.println(x!=y);
      System.out.println(x!=z);
      System.out.println(x>y);
      System.out.println(x<y);
      System.out.println(x>=z);
      System.out.println(x<=y);
        

    }
    
}
