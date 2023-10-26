//Type promotion in java is a phenomena where it automatically promotes each byte, short, or char operand to int when evaluating an expression.
//if one operand is long, float or double the whole expressions is promoted to long, float
//wrong 
//byte b =5;
//b=b*2;
/*
 * right
 * byte b = 5;
 * b = (byte) 5*2;
 * 
 */
import java.util.*;
public class TypePromotion {
    public static void main(String args[]){
        char a= 'a';
        char b= 'b';
        System.out.println((int) b);
        System.out.println((int) a);
        System.out.println(b-a);

    }
}
