//Type Conversions/wide conversion/ implicit conversion  is a conversion when we need to change the datatype of our own variable
/*Conversion haapens when :
 * type is compatible
 * destination type should be greater than the source type
 * byte -> short -> int -> float-> long -> double
 */

import java.util.*; 
public class TypeConversions {
    public static void main(String args[]){
        byte a = 25;
        int b = a;
        
        long c = 25;
        int d = c;//also known as lossy conversion
    System.out.println(d);
    }
}
